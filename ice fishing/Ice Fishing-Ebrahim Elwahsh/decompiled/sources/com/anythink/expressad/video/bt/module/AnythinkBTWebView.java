package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.b.g;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.out.k;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.e.d;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTWebView extends BTBaseView implements IMraidJSBridge, g {

    /* renamed from: s, reason: collision with root package name */
    private static final String f21184s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21185t = "landscape";

    /* renamed from: A, reason: collision with root package name */
    private j f21186A;

    /* renamed from: B, reason: collision with root package name */
    private WebView f21187B;

    /* renamed from: p, reason: collision with root package name */
    private String f21188p;

    /* renamed from: q, reason: collision with root package name */
    private String f21189q;

    /* renamed from: r, reason: collision with root package name */
    private String f21190r;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21191u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21192v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21193w;

    /* renamed from: x, reason: collision with root package name */
    private d f21194x;

    /* renamed from: y, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f21195y;

    /* renamed from: z, reason: collision with root package name */
    private WindVaneWebView f21196z;

    public AnythinkBTWebView(Context context) {
        super(context);
        this.f21191u = false;
        this.f21193w = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21196z != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f21201n);
                jSONObject2.put("id", this.f21207d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                h.a();
                a.a((WebView) this.f21196z, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a((WebView) this.f21196z, "broadcast", this.f21207d);
            }
        }
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        WebView webView = this.f21187B;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f21207d);
        }
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z8) {
    }

    public List<com.anythink.expressad.foundation.d.d> getCampaigns() {
        return this.f21195y;
    }

    public String getFilePath() {
        return this.f21189q;
    }

    public String getFileURL() {
        return this.f21188p;
    }

    public String getHtml() {
        return this.f21190r;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.d getMraidCampaign() {
        return this.f21205b;
    }

    public d getRewardUnitSetting() {
        return this.f21194x;
    }

    public WindVaneWebView getWebView() {
        return this.f21196z;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f21196z = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f21196z.setVisibility(0);
        j jVar = new j(null, this.f21205b, this.f21195y);
        this.f21186A = jVar;
        jVar.a(this.f21206c);
        this.f21196z.setObject(this.f21186A);
        this.f21196z.setMraidObject(this);
        this.f21196z.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.1
            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.expressad.atsignalcommon.windvane.c
            public final void a(Object obj) {
                super.a(obj);
                try {
                    String i = AnythinkBTWebView.this.f21186A != null ? AnythinkBTWebView.this.f21186A.i() : "";
                    h.a().a(obj, TextUtils.isEmpty(i) ? "" : Base64.encodeToString(i.getBytes(), 2));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (AnythinkBTWebView.this.f21187B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject.put("code", BTBaseView.f21201n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject2.put("result", 1);
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21187B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e6) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21187B, e6.getMessage());
                        e6.getMessage();
                    }
                }
                h.a();
                a.a(AnythinkBTWebView.this.f21196z);
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (AnythinkBTWebView.this.f21187B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject.put("code", BTBaseView.f21201n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21187B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e6) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21187B, e6.getMessage());
                        e6.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (AnythinkBTWebView.this.f21187B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject.put("code", BTBaseView.f21201n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21207d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21187B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e6) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21187B, e6.getMessage());
                        e6.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
            }
        });
        addView(this.f21196z, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AnythinkBTWebView.this.f21187B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21201n);
                        jSONObject.put("id", AnythinkBTWebView.this.f21207d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21187B, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21187B, "onClicked", AnythinkBTWebView.this.f21207d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f21192v = imageView;
            imageView.setImageResource(findDrawable("anythink_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f21192v.setLayoutParams(layoutParams);
            this.f21192v.setVisibility(this.f21191u ? 4 : 8);
            com.anythink.expressad.foundation.d.d dVar = this.f21205b;
            if (dVar != null && dVar.I()) {
                this.f21192v.setVisibility(4);
            }
            this.f21192v.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTWebView.this.close();
                }
            });
            addView(this.f21192v);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView != null) {
            BTBaseView.a(windVaneWebView, str, this.f21207d);
        }
    }

    public void onBackPressed() {
        if (this.f21196z != null) {
            c.a();
            c.a((WebView) this.f21196z, "onSystemBackPressed", this.f21207d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f21196z != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", f21185t);
                } else {
                    jSONObject.put("orientation", f21184s);
                }
                jSONObject.put("instanceId", this.f21207d);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                h.a();
                a.a((WebView) this.f21196z, "orientation", encodeToString);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f21193w) {
            return;
        }
        this.f21193w = true;
        try {
            if (this.f21196z != null) {
                c.a();
                c.a((WebView) this.f21196z, "onSystemDestory", this.f21207d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (AnythinkBTWebView.this.f21196z != null) {
                            AnythinkBTWebView.this.f21196z.clearWebView();
                            AnythinkBTWebView.this.f21196z.release();
                        }
                        AnythinkBTWebView.this.f21188p = null;
                        AnythinkBTWebView.this.f21189q = null;
                        AnythinkBTWebView.this.f21190r = null;
                        if (AnythinkBTWebView.this.f21187B != null) {
                            AnythinkBTWebView.this.f21187B = null;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.out.j
    public void onFinishRedirection(k kVar, String str) {
        if (kVar == null) {
            return;
        }
        u.b();
    }

    @Override // com.anythink.expressad.out.j
    public void onRedirectionFailed(k kVar, String str) {
        if (kVar == null) {
            return;
        }
        u.b();
    }

    @Override // com.anythink.expressad.out.j
    public void onStartRedirection(k kVar, String str) {
        u.a();
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        try {
            String af = this.f21205b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21205b.p(str);
                try {
                    getMraidCampaign();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            new com.anythink.expressad.b.a(getContext(), this.f21206c);
            this.f21205b.p(af);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f21188p)) {
            this.f21196z.loadUrl(this.f21188p);
        } else if (!TextUtils.isEmpty(this.f21189q)) {
            this.f21196z.loadUrl(this.f21189q);
        } else {
            if (TextUtils.isEmpty(this.f21190r)) {
                return;
            }
            this.f21196z.loadDataWithBaseURL("", this.f21190r, "text/html", "UTF-8", null);
        }
    }

    public void setCampaigns(List<com.anythink.expressad.foundation.d.d> list) {
        this.f21195y = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f21187B = webView;
    }

    public void setFilePath(String str) {
        this.f21189q = str;
    }

    public void setFileURL(String str) {
        this.f21188p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean contains = str.contains("play.google.com");
        setWebviewClickable(!contains);
        if (contains) {
            com.anythink.core.express.web.d dVar = new com.anythink.core.express.web.d();
            WindVaneWebView windVaneWebView = this.f21196z;
            if (windVaneWebView != null) {
                windVaneWebView.setFilter(dVar);
            }
        }
    }

    public void setHtml(String str) {
        this.f21190r = str;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setRewardUnitSetting(d dVar) {
        this.f21194x = dVar;
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z8) {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z8);
        }
    }

    @Override // com.anythink.core.express.b.b
    public void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public void useCustomClose(boolean z8) {
        try {
            this.f21192v.setVisibility(z8 ? 4 : 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f21196z.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f21196z.goForward();
        return true;
    }

    public void webviewLoad(int i) {
        if (this.f21186A == null) {
            this.f21186A = new j(null, this.f21205b, this.f21195y);
        }
        com.anythink.expressad.foundation.d.d dVar = this.f21205b;
        if (dVar != null) {
            this.f21186A.a(dVar);
        } else {
            List<com.anythink.expressad.foundation.d.d> list = this.f21195y;
            if (list != null && list.size() > 0) {
                this.f21186A.a(this.f21195y);
                if (this.f21195y.size() == 1) {
                    this.f21186A.a(this.f21195y.get(0));
                }
            }
        }
        d dVar2 = this.f21194x;
        if (dVar2 != null) {
            this.f21186A.a(dVar2);
        }
        this.f21186A.a(this.f21206c);
        this.f21186A.c(this.f21207d);
        if (i == 1) {
            this.f21186A.q();
        }
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f21186A);
        }
        com.anythink.expressad.foundation.d.d dVar3 = this.f21205b;
        if (dVar3 != null && dVar3.I()) {
            this.f21192v.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    private void b() {
        try {
            getMraidCampaign();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21191u = false;
        this.f21193w = false;
    }

    private void a(com.anythink.core.express.web.d dVar) {
        WindVaneWebView windVaneWebView = this.f21196z;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(dVar);
        }
    }
}
