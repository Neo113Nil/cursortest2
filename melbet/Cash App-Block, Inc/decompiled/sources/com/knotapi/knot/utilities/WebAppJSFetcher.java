package com.knotapi.knot.utilities;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.knotapi.knot.services.KnotSDKInitProvider;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public class WebAppJSFetcher {
    private static volatile WebAppJSFetcher instance;
    private final String appRootURL;
    private final ExecutorService executorService;
    private final Map<String, String> jsCache;
    private final Map<String, List<JSFetchCallback>> pendingCallbacks;

    public interface JSFetchCallback {
        void onFetchFailed(Exception exc);

        void onJSCodeFetched(String str);
    }

    private WebAppJSFetcher() {
        String str = KnotSDKInitProvider.rootUrl;
        if (str == null) {
            this.appRootURL = "https://knotapi.vercel.app";
        } else {
            this.appRootURL = str;
        }
        this.jsCache = new ConcurrentHashMap();
        this.pendingCallbacks = new ConcurrentHashMap();
        this.executorService = Executors.newFixedThreadPool(8);
    }

    public static WebAppJSFetcher getInstance() {
        if (instance == null) {
            synchronized (WebAppJSFetcher.class) {
                try {
                    if (instance == null) {
                        instance = new WebAppJSFetcher();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchJS$0(JSFetchCallback jSFetchCallback) {
        jSFetchCallback.onFetchFailed(new IllegalArgumentException("Path cannot be null or empty."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$fetchJS$2(String str, JSFetchCallback jSFetchCallback, String str2, List list) {
        if (list != null) {
            list.add(jSFetchCallback);
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jSFetchCallback);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchJS$3(Exception exc, String str, List list, String str2) {
        if (exc != null || str == null || str.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((JSFetchCallback) it.next()).onFetchFailed(exc != null ? exc : new Exception("JS code is empty"));
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((JSFetchCallback) it2.next()).onJSCodeFetched(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchJS$4(String str, String str2) {
        Object obj;
        Exception exc;
        Object obj2;
        int i = 12;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setConnectTimeout(15000);
                httpURLConnection2.setReadTimeout(15000);
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    throw new IOException("HTTP error code: " + responseCode);
                }
                InputStream inputStream = httpURLConnection2.getInputStream();
                if (inputStream == null) {
                    throw new IOException("InputStream is null");
                }
                String readStream = readStream(inputStream);
                this.jsCache.put(str2, readStream);
                httpURLConnection2.disconnect();
                List<JSFetchCallback> remove = this.pendingCallbacks.remove(str2);
                if (remove == null || remove.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new CardEntryActivityController$$ExternalSyntheticLambda1(i, readStream, remove, str2));
            } catch (Exception e) {
                exc = e;
                obj2 = null;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                List<JSFetchCallback> remove2 = this.pendingCallbacks.remove(str2);
                if (remove2 == null || remove2.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new ImageCapture$$ExternalSyntheticLambda3(exc, obj2, remove2, str2, 5));
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                obj = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                List<JSFetchCallback> remove3 = this.pendingCallbacks.remove(str2);
                if (remove3 == null || remove3.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new CardEntryActivityController$$ExternalSyntheticLambda1(i, obj, remove3, str2));
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            obj2 = null;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    private String readStream(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public void fetchJS(final String str, final JSFetchCallback jSFetchCallback) {
        if (str == null || str.trim().isEmpty()) {
            if (jSFetchCallback != null) {
                new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda1(jSFetchCallback, 16));
                return;
            }
            return;
        }
        if (jSFetchCallback == null) {
            return;
        }
        boolean endsWith = this.appRootURL.endsWith("/");
        String str2 = this.appRootURL;
        String m$1 = endsWith ? Recorder$$ExternalSyntheticOutline2.m$1(str2, str) : Recorder$$ExternalSyntheticOutline2.m(str2, "/", str);
        final String str3 = this.jsCache.get(str);
        if (str3 != null && !str3.isEmpty()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppJSFetcher.JSFetchCallback.this.onJSCodeFetched(str3);
                }
            });
            return;
        }
        this.jsCache.remove(str);
        this.pendingCallbacks.compute(str, new BiFunction() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                List lambda$fetchJS$2;
                lambda$fetchJS$2 = WebAppJSFetcher.lambda$fetchJS$2(str, jSFetchCallback, (String) obj, (List) obj2);
                return lambda$fetchJS$2;
            }
        });
        if (this.pendingCallbacks.get(str).size() == 1) {
            this.executorService.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(13, this, m$1, str));
        }
    }
}
