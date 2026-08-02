package com.fillr.browsersdk.model;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.n;
import com.google.mlkit.vision.text.zzd;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class FillrWebView {
    public final int browserType;
    public final WeakReference mWebView;
    public WebviewProxy proxy;
    public String viewId;
    public static final zzd FEATURE_MANAGER = zzd.getInstance();
    public static final String FILLR_JS_CLIENT = "(function() {   var _fillrInit = function() {       if (typeof window.FillrFieldFocusEvent == 'undefined') {           function checkTarget(e) {               if (typeof e == 'undefined' || e == null || typeof e.nodeName != 'string') {                   return false;               }               return true;           };           function isInput(e) {               var el = e.nodeName.toLowerCase();               if (el == 'input' || el == 'select' || el == 'password' || el == 'textarea') {                   return true;               }               return false;           };           window.FillrClickedEvent = function(e) {               if (isInput(document.activeElement)) {                   if (androidInterface && typeof androidInterface.fieldFocussed == 'function') {                       androidInterface.fieldFocussed('{}');                   };               }           };           window.FillrFieldFocusEvent = function(e) {               if (!checkTarget(e.target))                   return;               if (isInput(e.target)) {                   if (androidInterface && typeof androidInterface.fieldFocussed == 'function') {                       androidInterface.fieldFocussed('{}');                   };               }           };           window.FillrFieldFocusOutEvent = function(e) {               if (!checkTarget(e.target))                   return;               if (isInput(e.target)) {                   if (androidInterface && typeof androidInterface.fieldBlurred == 'function') {                       androidInterface.fieldBlurred('{}');                   };               }           };           window.FillrOrientationChangeEvent = function(e) {               if (isInput(document.activeElement)) {                   if (androidInterface && typeof androidInterface.fieldFocussed == 'function') {                       androidInterface.fieldFocussed('{}');                   };               }           };           document.addEventListener('click', window.FillrClickedEvent, true);           document.addEventListener('focus', window.FillrFieldFocusEvent, true);           document.addEventListener('focusout', window.FillrFieldFocusOutEvent, true);           window.addEventListener('orientationchange', window.FillrOrientationChangeEvent, true);       }   };   var _fillrWaitForController = function() {       if (!window['PopWidgetInterface']) {           setTimeout(_fillrWaitForController, 50);           return;       }       if (window.PopWidgetInterface['onInit']) {           window.PopWidgetInterface.onInit(_fillrInit)       } else {           _fillrInit();       }   };   _fillrWaitForController();" + "})()".replaceAll("(\\t|\\s+)", "");
    public static final WeakHashMap VIEW_PROXIES = new WeakHashMap();
    public static final WeakHashMap VIEW_OPTIONS = new WeakHashMap();
    public boolean widgetInjected = false;
    public final HashSet injectedInterfaces = new HashSet();

    /* renamed from: -$$Nest$mloadOrEvaluateJavascript, reason: not valid java name */
    public static void m1935$$Nest$mloadOrEvaluateJavascript(FillrWebView fillrWebView, Object obj, String str) {
        String str2;
        Method method;
        if (TextUtils.isEmpty(str) || str.toLowerCase().startsWith("javascript:")) {
            str2 = str;
        } else {
            str2 = Recorder$$ExternalSyntheticOutline2.m("javascript: ", !str.matches(".*%25[0-9a-fA-F]{2}.*") ? str.replace("%([0-9a-fA-F]{2})", "%25$1") : str);
        }
        Object[] objArr = {str2};
        Method method2 = obj.getClass().getMethod("loadUrl", String.class);
        Method method3 = null;
        try {
            method = str.length() < 2048 ? method2 : obj.getClass().getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (Exception unused) {
        }
        try {
            method.invoke(obj, str.length() < 2048 ? objArr : new Object[]{str, null});
        } catch (Exception unused2) {
            method3 = method;
            if (method3 != method2) {
                method2.invoke(obj, objArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FillrWebView(Object obj, int i, int i2) {
        Object obj2;
        WebviewProxy webviewProxy;
        WebviewProxy webviewProxy2;
        this.proxy = null;
        WeakReference weakReference = new WeakReference(obj);
        this.mWebView = weakReference;
        this.browserType = i;
        boolean z = isOptionSet(i2, 1) || VIEW_PROXIES.containsKey(obj);
        WeakHashMap weakHashMap = VIEW_PROXIES;
        boolean containsKey = weakHashMap.containsKey(obj);
        if (obj != null && z && !containsKey) {
            ArrayBlockingQueue arrayBlockingQueue = WebviewProxy.REQUEST_QUEUE;
            synchronized (WebviewProxy.class) {
                WebviewProxy webviewProxy3 = WebviewProxy.proxy;
                if (webviewProxy3 != null) {
                    webviewProxy3.webviews.add(obj);
                    webviewProxy2 = WebviewProxy.proxy.isAvailable() ? WebviewProxy.proxy : webviewProxy2;
                }
                webviewProxy2 = new WebviewProxy(obj);
                WebviewProxy.proxy = webviewProxy2;
            }
            this.proxy = webviewProxy2;
            webviewProxy2.getClass();
            webviewProxy2.terminateSSL = WebviewProxy.KEY_PAIR != null;
            WebviewProxy webviewProxy4 = this.proxy;
            webviewProxy4.concurrent = true;
            webviewProxy4.keepAlive = true;
            weakHashMap.put(obj, webviewProxy4);
        } else if (z && isOptionSet(i2, 1)) {
            i2 ^= 1;
        }
        WeakHashMap weakHashMap2 = VIEW_OPTIONS;
        if (!weakHashMap2.containsKey(obj)) {
            weakHashMap2.put(obj, Integer.valueOf(i2));
        }
        if (z) {
            FEATURE_MANAGER.getClass();
            if (!zzd.isFeatureEnabledForUrl("DisableTlsProxy", null)) {
                System.setProperty("com.fillr.tls.proxy.enabled", "true");
                if (z && isOptionSet(i2, 2)) {
                    WebviewProxy webviewProxy5 = this.proxy;
                    webviewProxy5.getClass();
                    webviewProxy5.terminateAllConnections = WebviewProxy.KEY_PAIR != null;
                }
                obj2 = weakReference.get();
                boolean isOptionSet = isOptionSet(i2, 1);
                final boolean isOptionSet2 = isOptionSet(i2, 2);
                if (obj2 != null) {
                    return;
                }
                try {
                    Object invoke = obj2.getClass().getMethod("getSettings", null).invoke(obj2, null);
                    invoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(invoke, Boolean.TRUE);
                    if (isOptionSet && (webviewProxy = this.proxy) != null && webviewProxy.isAvailable() && this.proxy.enableForWebview(obj2)) {
                        obj2.hashCode();
                        SVG svg = Fillr.getInstance().fillrConfig;
                        ServiceWorkerController.getInstance().setServiceWorkerClient(new ServiceWorkerClient() { // from class: com.fillr.browsersdk.model.FillrWebView.1
                            public final n.a interceptor = new n.a();

                            @Override // android.webkit.ServiceWorkerClient
                            public final synchronized WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                                if (webResourceRequest != null) {
                                    if (webResourceRequest.getUrl() != null && FillrWebView.this.proxy != null) {
                                        String uri = webResourceRequest.getUrl().toString();
                                        SVG svg2 = Fillr.getInstance().fillrConfig;
                                        if (!isOptionSet2) {
                                            FillrWebView.FEATURE_MANAGER.getClass();
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("url", uri);
                                            if (!zzd.isFeatureEnabledForProperties("EnableProxyRequestInterception", hashMap)) {
                                                return null;
                                            }
                                        }
                                        webResourceRequest.getMethod();
                                        SVG svg3 = Fillr.getInstance().fillrConfig;
                                        return this.interceptor.wrapResponse(this.interceptor.intercept(webResourceRequest), null);
                                    }
                                }
                                return null;
                            }
                        });
                        return;
                    } else {
                        WebviewProxy webviewProxy6 = this.proxy;
                        if (webviewProxy6 == null || !webviewProxy6.isAvailable()) {
                            return;
                        }
                        this.proxy.webviews.clear();
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.clearProperty("com.fillr.tls.proxy.enabled");
        if (z) {
            WebviewProxy webviewProxy52 = this.proxy;
            webviewProxy52.getClass();
            webviewProxy52.terminateAllConnections = WebviewProxy.KEY_PAIR != null;
        }
        obj2 = weakReference.get();
        boolean isOptionSet3 = isOptionSet(i2, 1);
        final boolean isOptionSet22 = isOptionSet(i2, 2);
        if (obj2 != null) {
        }
    }

    public static boolean isOptionSet(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean isRunningProxyForView(Object obj) {
        WebviewProxy webviewProxy = (WebviewProxy) VIEW_PROXIES.get(obj);
        return webviewProxy != null && webviewProxy.isAvailable();
    }

    public static void resetTlsStateForHost(Object obj) {
        WebviewProxy webviewProxy = (WebviewProxy) VIEW_PROXIES.get(obj);
        if (webviewProxy == null || !webviewProxy.isAvailable()) {
            return;
        }
        synchronized (webviewProxy) {
            webviewProxy.threadPool.shutdownNow();
            webviewProxy.threadPool = new ThreadPoolExecutor(40, 40, 300000L, TimeUnit.MILLISECONDS, WebviewProxy.REQUEST_QUEUE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FillrWebView.class != obj.getClass()) {
            return false;
        }
        FillrWebView fillrWebView = (FillrWebView) obj;
        WeakReference weakReference = this.mWebView;
        if (weakReference != null) {
            Object obj2 = weakReference.get();
            WeakReference weakReference2 = fillrWebView.mWebView;
            Object obj3 = weakReference2 != null ? weakReference2.get() : null;
            if (obj2 == null || obj3 == null || !obj2.equals(obj3)) {
                return false;
            }
        }
        return this.browserType == fillrWebView.browserType;
    }

    public final URL getUrl() {
        Object obj = this.mWebView.get();
        if (obj != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return getUrl(obj);
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            StringBuffer stringBuffer = new StringBuffer();
            new Handler(Looper.getMainLooper()).post(new Fillr.AnonymousClass2(this, stringBuffer, obj, atomicBoolean));
            try {
                synchronized (stringBuffer) {
                    while (!atomicBoolean.get()) {
                        try {
                            stringBuffer.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (stringBuffer.length() > 0) {
                    return new URL(stringBuffer.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public final int hashCode() {
        WeakReference weakReference = this.mWebView;
        int hashCode = ((weakReference == null || weakReference.get() == null) ? 0 : weakReference.get().hashCode()) * 31;
        int i = this.browserType;
        return hashCode + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
    }

    public final void loadJavascript(String str) {
        Object obj = this.mWebView.get();
        if (obj == null || TextUtils.isEmpty(str)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Fillr.AnonymousClass2(this, obj, str));
    }

    public final void setJSInterface(Object obj, String str) {
        Object obj2 = this.mWebView.get();
        if (obj2 == null) {
            return;
        }
        try {
            obj2.getClass().getMethod("addJavascriptInterface", Object.class, String.class).invoke(obj2, obj, str);
            this.injectedInterfaces.add(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static URL getUrl(Object obj) {
        try {
            String str = (String) obj.getClass().getMethod("getUrl", null).invoke(obj, null);
            if (str != null) {
                return new URL(str);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
