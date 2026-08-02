package com.anythink.core.express.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.q;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class BaseWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18363a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnTouchListener f18364b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnTouchListener f18365c;

    /* renamed from: h, reason: collision with root package name */
    protected Context f18366h;
    public long lastTouchTime;
    public b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f18363a = false;
        this.f18364b = new View.OnTouchListener() { // from class: com.anythink.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f18365c != null) {
                    return BaseWebView.this.f18365c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f18366h = context.getApplicationContext();
        a();
    }

    public static /* synthetic */ boolean b(BaseWebView baseWebView) {
        baseWebView.f18363a = true;
        return true;
    }

    public String checkToGetUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.contains("../")) {
            if (!str.startsWith("file")) {
                return str;
            }
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.contains(com.anythink.core.common.res.d.a(t.b().g()).a())) {
                return str;
            }
        }
        Log.e("anythink_express", "illegal URL: ".concat(String.valueOf(str)));
        return com.anythink.core.common.res.d.f17002a;
    }

    public b getBaseWebViewClient() {
        return this.mWebViewClient;
    }

    public boolean isDestroyed() {
        return this.f18363a;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(checkToGetUrl(str), str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(checkToGetUrl(str));
    }

    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            Context context = getContext();
            if (context == null) {
                context = t.b().g();
            }
            float i = q.i(context);
            if (i != 0.0f) {
                t.b().a(new Runnable() { // from class: com.anythink.core.express.web.BaseWebView.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseWebView.b(BaseWebView.this);
                        BaseWebView.this.destroy();
                    }
                }, (long) (i * 1000.0f));
            } else {
                this.f18363a = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(a aVar) {
        b bVar = this.mWebViewClient;
        if (bVar == null || bVar == null) {
            return;
        }
        this.mWebViewClient.a(aVar);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f18365c = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof b) {
            this.mWebViewClient = (b) webViewClient;
        }
    }

    public void a() {
        Class cls = Boolean.TYPE;
        if (this.mWebViewClient == null) {
            b bVar = new b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = this.f18366h.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(k.b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
        super.setOnTouchListener(this.f18364b);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(checkToGetUrl(str), map);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f18363a = false;
        this.f18364b = new View.OnTouchListener() { // from class: com.anythink.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f18365c != null) {
                    return BaseWebView.this.f18365c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f18366h = context.getApplicationContext();
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTouchTime = 0L;
        this.f18363a = false;
        this.f18364b = new View.OnTouchListener() { // from class: com.anythink.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f18365c != null) {
                    return BaseWebView.this.f18365c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f18366h = context.getApplicationContext();
        a();
    }
}
