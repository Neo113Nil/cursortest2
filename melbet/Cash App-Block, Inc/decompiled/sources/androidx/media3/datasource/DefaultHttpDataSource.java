package androidx.media3.datasource;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.video.Recorder;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.SizeKt;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.Sets$FilteredSet;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DefaultHttpDataSource extends BaseDataSource {
    public long bytesRead;
    public long bytesToRead;
    public final int connectTimeoutMillis;
    public HttpURLConnection connection;
    public DataSpec dataSpec;
    public final Recorder.AnonymousClass4 defaultRequestProperties;
    public InputStream inputStream;
    public final int readTimeoutMillis;
    public final Recorder.AnonymousClass4 requestProperties;
    public int responseCode;
    public boolean transferStarted;
    public final String userAgent;

    public final class NullFilteringHeadersMap extends SizeKt implements Map {
        public final Map headers;

        public NullFilteringHeadersMap(Map map) {
            super(17);
            this.headers = map;
        }

        @Override // java.util.Map
        public final void clear() {
            this.headers.clear();
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && this.headers.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = ((Sets$FilteredSet) entrySet()).iterator();
            it.getClass();
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // coil3.size.SizeKt
        public final Object delegate() {
            return this.headers;
        }

        @Override // java.util.Map
        public final Set entrySet() {
            return Maps.filter(this.headers.entrySet(), new DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda0(0));
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && Maps.equalsImpl(this, obj);
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) this.headers.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return Maps.hashCodeImpl(entrySet());
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            Map map = this.headers;
            return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
        }

        @Override // java.util.Map
        public final Set keySet() {
            return Maps.filter(this.headers.keySet(), new DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda0(1));
        }

        @Override // java.util.Map
        public final Object put(Object obj, Object obj2) {
            return this.headers.put(obj, obj2);
        }

        @Override // java.util.Map
        public final void putAll(Map map) {
            this.headers.putAll(map);
        }

        @Override // java.util.Map
        public final Object remove(Object obj) {
            return this.headers.remove(obj);
        }

        @Override // java.util.Map
        public final int size() {
            Map map = this.headers;
            return map.size() - (map.containsKey(null) ? 1 : 0);
        }

        @Override // java.util.Map
        public final Collection values() {
            return this.headers.values();
        }
    }

    public DefaultHttpDataSource(String str, int i, int i2, Recorder.AnonymousClass4 anonymousClass4) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.defaultRequestProperties = anonymousClass4;
        this.requestProperties = new Recorder.AnonymousClass4(28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = Util.DEVICE_DEBUG_INFO;
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? RegularImmutableMap.EMPTY : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    public final HttpURLConnection makeConnection(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        Recorder.AnonymousClass4 anonymousClass4 = this.defaultRequestProperties;
        if (anonymousClass4 != null) {
            hashMap.putAll(anonymousClass4.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = HttpUtil.CONTENT_RANGE_WITH_START_AND_END;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "bytes=", "-");
            if (j2 != -1) {
                m1149m.append((j + j2) - 1);
            }
            sb = m1149m.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str2 = this.userAgent;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = DataSpec.$r8$clinit;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0153 A[Catch: IOException -> 0x015e, TRY_LEAVE, TryCatch #5 {IOException -> 0x015e, blocks: (B:25:0x014b, B:27:0x0153), top: B:24:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(DataSpec dataSpec) {
        boolean z;
        long j;
        long j2;
        long parseLong;
        String str;
        this.dataSpec = dataSpec;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing();
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection makeConnection = makeConnection(new URL(dataSpec.uri.toString()), dataSpec.httpMethod, dataSpec.httpBody, dataSpec.position, dataSpec.length, (dataSpec.flags & 1) == 1, true, dataSpec.httpRequestHeaders);
            long j3 = dataSpec.length;
            long j4 = dataSpec.position;
            this.connection = makeConnection;
            this.responseCode = makeConnection.getResponseCode();
            makeConnection.getResponseMessage();
            int i = this.responseCode;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    String headerField = makeConnection.getHeaderField("Content-Range");
                    Pattern pattern = HttpUtil.CONTENT_RANGE_WITH_START_AND_END;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = HttpUtil.CONTENT_RANGE_WITH_SIZE.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j = Long.parseLong(group);
                        } else {
                            j = -1;
                        }
                    }
                    if (j4 == j) {
                        this.transferStarted = z;
                        transferStarted(dataSpec);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = makeConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        ByteStreams.toByteArray(errorStream);
                    } else {
                        String str2 = Util.DEVICE_DEBUG_INFO;
                    }
                } catch (IOException unused) {
                    String str3 = Util.DEVICE_DEBUG_INFO;
                }
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidResponseCodeException(this.responseCode, this.responseCode == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            makeConnection.getContentType();
            if (this.responseCode != 200 || j4 == 0) {
                j4 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(makeConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.bytesToRead = j3;
            } else if (j3 != -1) {
                this.bytesToRead = j3;
            } else {
                String headerField2 = makeConnection.getHeaderField("Content-Length");
                String headerField3 = makeConnection.getHeaderField("Content-Range");
                Pattern pattern2 = HttpUtil.CONTENT_RANGE_WITH_START_AND_END;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j2 = 0;
                        parseLong = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        Log.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = HttpUtil.CONTENT_RANGE_WITH_START_AND_END.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong2 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                str = "]";
                                long parseLong3 = (parseLong2 - Long.parseLong(group3)) + 1;
                                if (parseLong < j2) {
                                    parseLong = parseLong3;
                                } else if (parseLong != parseLong3) {
                                    try {
                                        Log.w("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                        parseLong = Math.max(parseLong, parseLong3);
                                    } catch (NumberFormatException unused3) {
                                        Log.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                        this.bytesToRead = parseLong != -1 ? parseLong - j4 : -1L;
                                        this.inputStream = makeConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.transferStarted = true;
                                        transferStarted(dataSpec);
                                        skipFully(j4);
                                        return this.bytesToRead;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                str = "]";
                            }
                        }
                    }
                    this.bytesToRead = parseLong != -1 ? parseLong - j4 : -1L;
                }
                j2 = 0;
                parseLong = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                this.bytesToRead = parseLong != -1 ? parseLong - j4 : -1L;
            }
            try {
                this.inputStream = makeConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.inputStream = new GZIPInputStream(this.inputStream);
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j4);
                    return this.bytesToRead;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource$HttpDataSourceException(e2, 2000, 1);
            }
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e3, 1);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.bytesToRead;
            if (j != -1) {
                long j2 = j - this.bytesRead;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.inputStream;
            String str = Util.DEVICE_DEBUG_INFO;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.bytesRead += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = Util.DEVICE_DEBUG_INFO;
            throw HttpDataSource$HttpDataSourceException.createForIOException(e, 2);
        }
    }

    public final void skipFully(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096L);
            InputStream inputStream = this.inputStream;
            String str = Util.DEVICE_DEBUG_INFO;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= read;
            bytesTransferred(read);
        }
    }
}
