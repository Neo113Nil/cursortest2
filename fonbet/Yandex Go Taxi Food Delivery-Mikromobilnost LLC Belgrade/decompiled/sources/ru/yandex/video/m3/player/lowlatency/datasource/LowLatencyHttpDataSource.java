package ru.yandex.video.m3.player.lowlatency.datasource;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableMap;
import defpackage.cas;
import defpackage.cj01;
import defpackage.g8e;
import defpackage.hie0;
import defpackage.lab1;
import defpackage.lk91;
import defpackage.npg;
import defpackage.nz4;
import defpackage.oyr;
import defpackage.p77;
import defpackage.pwu;
import defpackage.tw21;
import defpackage.vuu;
import defpackage.wuu;
import defpackage.xuu;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier;
import ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes7.dex */
class LowLatencyHttpDataSource extends nz4 implements xuu {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private static final long afterHeaderUUIDTrigger = -7613782305446615761L;
    private static final long beforeMoofUUIDTrigger = -7308519144238225891L;
    private static final long mdatTagTrigger = 1835295092;
    private static final long uuidTagTrigger = 1970628964;
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final ChunkDownloadListener chunkDownloadListener;
    private long clientMdatLoadTime;
    private final int connectTimeoutMillis;
    private HttpURLConnection connection;
    private hie0 contentTypePredicate;
    private long currentMdatBytesDownloaded;
    private boolean currentMdatCompleted;
    private long currentMdatSize;
    private DownloadState currentState;
    private npg dataSpec;
    private final wuu defaultRequestProperties;
    private long endClientTime;
    private long idleTime;
    private boolean ignoreThisChunk;
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private long prevMdatStartClientTimeMs;
    private final int readTimeoutMillis;
    private final wuu requestProperties;
    private int responseCode;
    private long segmentStartTimeMs;
    private long startClientTimeMs;
    private long startServerTimeMs;
    private long totalBytes;
    private long totalTime;
    private final TrackType trackType;
    private boolean useProgressBandwidthEstimate;
    private final String userAgent;

    /* renamed from: ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyHttpDataSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState;

        static {
            int[] iArr = new int[DownloadState.values().length];
            $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState = iArr;
            try {
                iArr[DownloadState.OPEN_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.START_CHUNK_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.RECEIVING_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.ON_UUID_TAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.AFTER_HEADER_UUID_TAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.BEFORE_MOOF_UUID_TAG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.RECEIVING_MOOF_BOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.START_MDAT_BOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.RECEIVING_MDAT_BOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[DownloadState.END_MDAT_BOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum DownloadState {
        INIT,
        OPEN_CONNECTION,
        RECEIVING_DATA,
        START_CHUNK_DOWNLOAD,
        ON_UUID_TAG,
        AFTER_HEADER_UUID_TAG,
        BEFORE_MOOF_UUID_TAG,
        RECEIVING_MOOF_BOX,
        START_MDAT_BOX,
        RECEIVING_MDAT_BOX,
        END_MDAT_BOX,
        CLOSE_CONNECTION
    }

    private LowLatencyHttpDataSource(String str, int i, int i2, boolean z, wuu wuuVar, hie0 hie0Var, boolean z2, ChunkDownloadListener chunkDownloadListener, TrackType trackType) {
        super(true);
        this.currentState = DownloadState.INIT;
        this.totalTime = 0L;
        this.totalBytes = 0L;
        this.currentMdatSize = 0L;
        this.currentMdatBytesDownloaded = 0L;
        this.currentMdatCompleted = true;
        this.useProgressBandwidthEstimate = true;
        this.segmentStartTimeMs = 0L;
        this.ignoreThisChunk = false;
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = wuuVar;
        this.contentTypePredicate = hie0Var;
        this.requestProperties = new wuu();
        this.keepPostFor302Redirects = z2;
        this.chunkDownloadListener = chunkDownloadListener;
        this.trackType = trackType == null ? TrackType.Other : trackType;
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                lk91.f(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private void flushSampleAndResetState(long j, boolean z) {
        if (this.chunkDownloadListener != null && !this.ignoreThisChunk && !shouldIgnoreThisFlush()) {
            ChunkDownloadListener chunkDownloadListener = this.chunkDownloadListener;
            if (z) {
                chunkDownloadListener.flushChunk(this.trackType, this.totalBytes, this.totalTime);
            } else {
                chunkDownloadListener.flushSegment(this.trackType, this.totalBytes, this.totalTime);
            }
        }
        this.endClientTime = j;
        this.totalBytes = 0L;
        this.totalTime = 0L;
        this.ignoreThisChunk = false;
    }

    private URL handleRedirect(URL url, String str, npg npgVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", npgVar, 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(g8e.o("Unsupported protocol redirect: ", protocol), npgVar, 2001);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + Extension.C_BRAKE, npgVar, 2001);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2001, 1);
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return Request.PARAM_GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(npg npgVar) throws IOException {
        HttpURLConnection makeConnection;
        URL url = new URL(npgVar.a.toString());
        int i = npgVar.c;
        byte[] bArr = npgVar.d;
        long j = npgVar.f;
        long j2 = npgVar.g;
        int i2 = 1;
        boolean c = npgVar.c(1);
        if (!this.allowCrossProtocolRedirects && !this.keepPostFor302Redirects) {
            return makeConnection(url, i, bArr, j, j2, c, true, npgVar.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(oyr.i(i4, "Too many redirects: ")), npgVar, 2001, 1);
            }
            makeConnection = makeConnection(url, i, bArr, j, j2, c, false, npgVar.e);
            int responseCode = makeConnection.getResponseCode();
            String headerField = makeConnection.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == HTTP_STATUS_TEMPORARY_REDIRECT || responseCode == HTTP_STATUS_PERMANENT_REDIRECT)) {
                makeConnection.disconnect();
                url = handleRedirect(url, headerField, npgVar);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                makeConnection.disconnect();
                if (!this.keepPostFor302Redirects || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = handleRedirect(url, headerField, npgVar);
            }
            i3 = i4;
            i2 = 1;
        }
        return makeConnection;
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = tw21.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0183 A[ADDED_TO_REGION, LOOP:4: B:66:0x0183->B:67:0x0185, LOOP_START, PHI: r7 r8
      0x0183: PHI (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:65:0x0181, B:67:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r8v2 long) = (r8v0 long), (r8v4 long) binds: [B:65:0x0181, B:67:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        char c;
        int i4 = i2;
        if (i4 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        long j2 = 0;
        if (j != -1) {
            long j3 = j - this.bytesRead;
            if (j3 == 0) {
                return -1;
            }
            i4 = (int) Math.min(i4, j3);
        }
        InputStream inputStream = this.inputStream;
        int i5 = tw21.a;
        int read = inputStream.read(bArr, i, i4);
        if (read == -1) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        switch (AnonymousClass1.$SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyHttpDataSource$DownloadState[this.currentState.ordinal()]) {
            case 1:
            case 2:
                this.currentMdatBytesDownloaded = 0L;
                this.currentMdatSize = 0L;
                this.currentState = DownloadState.RECEIVING_DATA;
                this.segmentStartTimeMs = System.currentTimeMillis();
                i3 = 8;
                if (read == i3) {
                    for (int i6 = 4; i6 < i3; i6++) {
                        j2 = (j2 << i3) + (bArr[i6] & 255);
                    }
                    if (j2 == uuidTagTrigger) {
                        this.currentState = DownloadState.ON_UUID_TAG;
                    }
                }
                this.totalBytes += read;
                submitPendingSample(currentTimeMillis);
                break;
            case 3:
                i3 = 8;
                if (read == i3) {
                }
                this.totalBytes += read;
                submitPendingSample(currentTimeMillis);
                break;
            case 4:
            case 5:
                if (read == 24) {
                    long j4 = 0;
                    for (int i7 = 8; i7 < 24; i7++) {
                        j4 = (j4 << 8) + (bArr[i7] & 255);
                    }
                    for (int i8 = 24; i8 < 32; i8++) {
                        j2 = (j2 << 8) + (bArr[i8] & 255);
                    }
                    if (j4 == afterHeaderUUIDTrigger) {
                        this.currentState = DownloadState.AFTER_HEADER_UUID_TAG;
                        this.startServerTimeMs = j2;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        this.startClientTimeMs = currentTimeMillis2;
                        this.prevMdatStartClientTimeMs = currentTimeMillis2;
                        this.useProgressBandwidthEstimate = false;
                    } else if (j4 == beforeMoofUUIDTrigger) {
                        this.currentState = DownloadState.BEFORE_MOOF_UUID_TAG;
                        this.idleTime = j2 - this.startServerTimeMs;
                        this.startServerTimeMs = j2;
                    }
                }
                this.totalBytes += read;
                break;
            case 6:
                this.currentState = DownloadState.RECEIVING_MOOF_BOX;
            case 7:
                if (read != 8) {
                    this.totalBytes += read;
                    break;
                } else {
                    long j5 = 0;
                    for (int i9 = 4; i9 < 8; i9++) {
                        j5 = (j5 << 8) + (bArr[i9] & 255);
                    }
                    if (j5 != mdatTagTrigger) {
                        this.totalBytes += read;
                        break;
                    } else {
                        this.currentState = DownloadState.START_MDAT_BOX;
                    }
                }
            case 8:
                if (this.currentMdatCompleted) {
                    this.currentMdatCompleted = false;
                    long j6 = currentTimeMillis - this.prevMdatStartClientTimeMs;
                    this.clientMdatLoadTime = j6;
                    long j7 = this.idleTime;
                    if (j6 >= j7) {
                        c = '\b';
                        this.totalTime = Math.min(j6 - j7, currentTimeMillis - this.endClientTime) + this.totalTime;
                        this.totalBytes += read;
                    } else {
                        c = '\b';
                        if (j7 < 50) {
                            this.totalTime = (currentTimeMillis - this.endClientTime) + this.totalTime;
                            this.totalBytes += read;
                        }
                    }
                    this.prevMdatStartClientTimeMs = currentTimeMillis - this.totalTime;
                    this.endClientTime = currentTimeMillis;
                } else {
                    c = '\b';
                }
                for (int i10 = 0; i10 < 4; i10++) {
                    j2 = (bArr[i10] & 255) + (j2 << c);
                }
                this.currentMdatSize = j2;
                this.currentMdatBytesDownloaded += read;
                this.currentState = DownloadState.RECEIVING_MDAT_BOX;
                this.startClientTimeMs = System.currentTimeMillis();
                break;
            case 9:
                long j8 = read;
                long j9 = this.currentMdatBytesDownloaded + j8;
                this.currentMdatBytesDownloaded = j9;
                this.totalBytes += j8;
                if (j9 != this.currentMdatSize) {
                    submitPendingSample(currentTimeMillis);
                    break;
                } else {
                    this.currentState = DownloadState.END_MDAT_BOX;
                }
            case 10:
                this.totalTime = (currentTimeMillis - this.endClientTime) + this.totalTime;
                flushSampleAndResetState(currentTimeMillis, true);
                this.currentMdatCompleted = true;
                this.currentState = DownloadState.START_CHUNK_DOWNLOAD;
                break;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private boolean shouldIgnoreThisFlush() {
        npg npgVar = this.dataSpec;
        if (npgVar == null) {
            return true;
        }
        String uri = npgVar.a.toString();
        return uri.contains(".mpd") || uri.contains("init.mp4");
    }

    private void skipFully(long j, npg npgVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            InputStream inputStream = this.inputStream;
            int i = tw21.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), npgVar, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(npgVar, 2008);
            }
            j -= read;
            bytesTransferred(read);
        }
    }

    private void submitPendingSample(long j) {
        long max = j - Math.max(this.segmentStartTimeMs, this.endClientTime);
        ChunkDownloadListener chunkDownloadListener = this.chunkDownloadListener;
        if (chunkDownloadListener != null) {
            chunkDownloadListener.submitPendingSample(this.trackType, this.totalBytes, max, j);
        }
    }

    @Override // defpackage.xuu
    public void clearAllRequestProperties() {
        this.requestProperties.a();
    }

    @Override // defpackage.xuu
    public void clearRequestProperty(String str) {
        str.getClass();
        this.requestProperties.d(str);
    }

    @Override // defpackage.kpg
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                long j = this.bytesToRead;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.bytesRead;
                }
                maybeTerminateInputStream(this.connection, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    npg npgVar = this.dataSpec;
                    int i = tw21.a;
                    throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2000, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            if (this.useProgressBandwidthEstimate) {
                long currentTimeMillis = System.currentTimeMillis();
                this.totalTime = currentTimeMillis - this.segmentStartTimeMs;
                flushSampleAndResetState(currentTimeMillis, false);
            }
        }
    }

    @Override // defpackage.xuu
    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.kpg
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? ImmutableMap.f() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public Uri getInflatedUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.kpg
    public long open(npg npgVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = npgVar;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        this.currentState = DownloadState.OPEN_CONNECTION;
        this.useProgressBandwidthEstimate = true;
        transferInitializing(npgVar);
        try {
            this.currentState = DownloadState.START_CHUNK_DOWNLOAD;
            HttpURLConnection makeConnection = makeConnection(npgVar);
            this.connection = makeConnection;
            this.responseCode = makeConnection.getResponseCode();
            String responseMessage = makeConnection.getResponseMessage();
            int i = this.responseCode;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (npgVar.f == pwu.c(makeConnection.getHeaderField("Content-Range"))) {
                        this.opened = true;
                        transferStarted(npgVar);
                        long j2 = npgVar.g;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = makeConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = tw21.a;
                        bArr = p77.b(errorStream);
                    } else {
                        bArr = tw21.c;
                    }
                } catch (IOException unused) {
                    bArr = tw21.c;
                }
                byte[] bArr2 = bArr;
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new DataSourceException(2008) : null, headerFields, npgVar, bArr2);
            }
            String contentType = makeConnection.getContentType();
            hie0 hie0Var = this.contentTypePredicate;
            if (hie0Var != null && !hie0Var.apply(contentType)) {
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidContentTypeException(contentType, npgVar);
            }
            if (this.responseCode == 200) {
                long j3 = npgVar.f;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean isCompressed = isCompressed(makeConnection);
            if (isCompressed) {
                this.bytesToRead = npgVar.g;
            } else {
                long j4 = npgVar.g;
                if (j4 != -1) {
                    this.bytesToRead = j4;
                } else {
                    long b = pwu.b(makeConnection.getHeaderField("Content-Length"), makeConnection.getHeaderField("Content-Range"));
                    this.bytesToRead = b != -1 ? b - j : -1L;
                }
            }
            try {
                this.inputStream = makeConnection.getInputStream();
                if (isCompressed) {
                    this.inputStream = new GZIPInputStream(this.inputStream);
                }
                this.opened = true;
                transferStarted(npgVar);
                try {
                    skipFully(j, npgVar);
                    return this.bytesToRead;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2000, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource$HttpDataSourceException(e2, npgVar, 2000, 1);
            }
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw HttpDataSource$HttpDataSourceException.a(e3, npgVar, 1);
        }
    }

    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // defpackage.apg
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            npg npgVar = this.dataSpec;
            int i3 = tw21.a;
            throw HttpDataSource$HttpDataSourceException.a(e, npgVar, 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(hie0 hie0Var) {
        this.contentTypePredicate = hie0Var;
    }

    @Override // defpackage.xuu
    public void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.requestProperties.e(str, str2);
    }

    public static class NullFilteringHeadersMap extends cas {
        private final Map<String, List<String>> headers;

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.headers = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$entrySet$1(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$keySet$0(String str) {
            return str != null;
        }

        @Override // defpackage.cas, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // defpackage.cas, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return lab1.d(super.entrySet(), new a(1));
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // defpackage.cas, java.util.Map
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // defpackage.cas, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // defpackage.cas, java.util.Map
        public Set<String> keySet() {
            return lab1.d(super.keySet(), new a(0));
        }

        @Override // defpackage.cas, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // defpackage.das
        public Map<String, List<String>> delegate() {
            return this.headers;
        }
    }

    public static final class Factory implements vuu, TrackTypeIdentifier {
        private boolean allowCrossProtocolRedirects;
        private ChunkDownloadListener chunkDownloadListener;
        private hie0 contentTypePredicate;
        private boolean keepPostFor302Redirects;
        private TrackType trackType;
        private cj01 transferListener;
        private String userAgent;
        private final wuu defaultRequestProperties = new wuu();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // defpackage.vuu, defpackage.ipg
        public LowLatencyHttpDataSource createDataSource() {
            LowLatencyHttpDataSource lowLatencyHttpDataSource = new LowLatencyHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects, this.chunkDownloadListener, this.trackType, null);
            cj01 cj01Var = this.transferListener;
            if (cj01Var != null) {
                lowLatencyHttpDataSource.addTransferListener(cj01Var);
            }
            return lowLatencyHttpDataSource;
        }

        public Factory setAllowCrossProtocolRedirects(boolean z) {
            this.allowCrossProtocolRedirects = z;
            return this;
        }

        public Factory setConnectTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        public Factory setContentTypePredicate(hie0 hie0Var) {
            this.contentTypePredicate = hie0Var;
            return this;
        }

        @Override // defpackage.vuu
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.b(map);
            return this;
        }

        public Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        public Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        @Override // ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier
        public void setTrackType(TrackType trackType) {
            this.trackType = trackType;
        }

        public Factory setTransferListener(cj01 cj01Var) {
            this.transferListener = cj01Var;
            if (cj01Var instanceof ChunkDownloadListener) {
                this.chunkDownloadListener = (ChunkDownloadListener) cj01Var;
            }
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // defpackage.vuu
        public /* bridge */ /* synthetic */ vuu setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }
    }

    public /* synthetic */ LowLatencyHttpDataSource(String str, int i, int i2, boolean z, wuu wuuVar, hie0 hie0Var, boolean z2, ChunkDownloadListener chunkDownloadListener, TrackType trackType, AnonymousClass1 anonymousClass1) {
        this(str, i, i2, z, wuuVar, hie0Var, z2, chunkDownloadListener, trackType);
    }

    private HttpURLConnection makeConnection(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        wuu wuuVar = this.defaultRequestProperties;
        if (wuuVar != null) {
            hashMap.putAll(wuuVar.c());
        }
        hashMap.putAll(this.requestProperties.c());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = pwu.a(j, j2);
        if (a != null) {
            openConnection.setRequestProperty("Range", a);
        }
        String str = this.userAgent;
        if (str != null) {
            openConnection.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, str);
        }
        openConnection.setRequestProperty("Accept-Encoding", z ? Request.PARAM_GZIP : ClidProvider.IDENTITY);
        openConnection.setInstanceFollowRedirects(z2);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(npg.b(i));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return openConnection;
        }
        openConnection.connect();
        return openConnection;
    }
}
