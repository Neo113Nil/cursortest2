package com.android.volley.toolbox;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import androidx.appcompat.app.ActionBarDrawerToggle$Delegate;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.SessionConfig;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import androidx.media3.common.Format;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.room.util.DBUtil;
import com.android.volley.Header;
import com.android.volley.Request;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.internal.domain.InfoData;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo;
import com.squareup.cash.sheet.OutsideBoundsTouchHandler$scrollDetector$1;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class HurlStack implements ActionBarDrawerToggle$Delegate, FeatureCombinationQuery, Function, CorruptionHandler, SubtitleParser.Factory, DiskCache, VideoDecoder.MediaInitializer, Lifecycle, FileOrchestrator, InfoProvider {
    public final /* synthetic */ int $r8$classId;

    public HurlStack(Context context, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1) {
        this.$r8$classId = 8;
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new OutsideBoundsTouchHandler$scrollDetector$1(this, 1));
    }

    public static ArrayList convertHeaders(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Header((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static HttpResponse executeRequest(Request request, Map map) {
        String str = request.mUrl;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = request.mRetryPolicy.mCurrentTimeoutMs;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str2 : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) hashMap.get(str2));
            }
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                HttpResponse httpResponse = new HttpResponse(responseCode, convertHeaders(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return httpResponse;
            }
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                return new HttpResponse(responseCode, convertHeaders(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new UrlConnectionInputStream(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList sanitizeHosts(final String str, List list) {
        URL url;
        list.getClass();
        Regex regex = new Regex("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$");
        Regex regex2 = new Regex("^(http|https)://(.*)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str2 = (String) it.next();
            boolean matches = regex2.matches(str2);
            InternalLogger.Target target = InternalLogger.Target.USER;
            if (matches) {
                try {
                    url = new URL(str2);
                } catch (MalformedURLException e) {
                    e = e;
                }
                try {
                    DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 4, target, new Rum$createMonitor$1(2, str2, str, url), null, false, 56);
                    str2 = url.getHost();
                } catch (MalformedURLException e2) {
                    e = e2;
                    target = target;
                    MalformedURLException malformedURLException = e;
                    final int i = 0;
                    DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 5, target, new Function0() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i2 = i;
                            String str3 = str;
                            String str4 = str2;
                            switch (i2) {
                                case 0:
                                    return String.format(Locale.US, "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"", Arrays.copyOf(new Object[]{str4, str3}, 2));
                                default:
                                    return String.format(Locale.US, "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.", Arrays.copyOf(new Object[]{str4, str3}, 2));
                            }
                        }
                    }, malformedURLException, false, 48);
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            } else {
                if (!regex.matches(str2)) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!lowerCase.equals("localhost")) {
                        final int i2 = 1;
                        DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 5, target, new Function0() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i22 = i2;
                                String str3 = str;
                                String str4 = str2;
                                switch (i22) {
                                    case 0:
                                        return String.format(Locale.US, "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"", Arrays.copyOf(new Object[]{str4, str3}, 2));
                                    default:
                                        return String.format(Locale.US, "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.", Arrays.copyOf(new Object[]{str4, str3}, 2));
                                }
                            }
                        }, null, false, 56);
                        str2 = null;
                    }
                }
                if (str2 != null) {
                }
            }
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }

    @Override // androidx.arch.core.util.Function
    /* renamed from: apply */
    public Object mo103apply(Object obj) {
        return obj;
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public void cleanup() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public SubtitleParser create(Format format2) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (this == obj) {
                    return true;
                }
                return HurlStack.class.equals(obj != null ? obj.getClass() : null);
            default:
                return super.equals(obj);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        return null;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public int getCueReplacementBehavior(Format format2) {
        return 1;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getMetadataFile(File file) {
        return null;
    }

    public int getMinimumLoadableRetryCount(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getRootDir() {
        return null;
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public InfoData getState() {
        return new AccessibilityInfo();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getWritableFile() {
        return null;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException) {
        throw corruptionException;
    }

    public int hashCode() {
        switch (this.$r8$classId) {
            case 1:
                return HurlStack.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
    public void initializeExtractor(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new VideoDecoder$ByteBufferInitializer$1((ByteBuffer) obj));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
    public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new VideoDecoder$ByteBufferInitializer$1((ByteBuffer) obj));
    }

    @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
    public boolean isSupported(SessionConfig sessionConfig) {
        return false;
    }

    public Map onProvideAttributes(okhttp3.Request request, Response response, Throwable th) {
        request.getClass();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, SVG svg) {
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener) {
    }

    public void sendBenchmarkUploads(String str, String str2) {
        MapsKt__MapsJVMKt.mapOf(new Pair("track", str)).getClass();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public boolean supportsFormat(Format format2) {
        return false;
    }

    public final class UrlConnectionInputStream extends FilterInputStream {
        public final /* synthetic */ int $r8$classId = 1;
        public final Object mConnection;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UrlConnectionInputStream(HttpURLConnection httpURLConnection) {
            super(r0);
            InputStream errorStream;
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            this.mConnection = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            switch (this.$r8$classId) {
                case 0:
                    super.close();
                    ((HttpURLConnection) this.mConnection).disconnect();
                    break;
                default:
                    super.close();
                    break;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            switch (this.$r8$classId) {
                case 1:
                    int read = super.read();
                    if (read >= 0) {
                        ((Mac) this.mConnection).update((byte) read);
                    }
                    return read;
                default:
                    return super.read();
            }
        }

        public UrlConnectionInputStream(InputStream inputStream, Mac mac) {
            super(inputStream);
            this.mConnection = mac;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    int read = super.read(bArr, i, i2);
                    if (read > 0) {
                        ((Mac) this.mConnection).update(bArr, i, read);
                    }
                    return read;
                default:
                    return super.read(bArr, i, i2);
            }
        }
    }

    public /* synthetic */ HurlStack(boolean z) {
        this.$r8$classId = 10;
    }

    public HurlStack() {
        this.$r8$classId = 12;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public /* synthetic */ HurlStack(int i) {
        this.$r8$classId = i;
    }
}
