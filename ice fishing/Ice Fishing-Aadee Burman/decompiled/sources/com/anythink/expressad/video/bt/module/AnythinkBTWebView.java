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
    private static final String f21026s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21027t = "landscape";

    /* renamed from: A, reason: collision with root package name */
    private j f21028A;

    /* renamed from: B, reason: collision with root package name */
    private WebView f21029B;

    /* renamed from: p, reason: collision with root package name */
    private String f21030p;

    /* renamed from: q, reason: collision with root package name */
    private String f21031q;

    /* renamed from: r, reason: collision with root package name */
    private String f21032r;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21033u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21034v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21035w;

    /* renamed from: x, reason: collision with root package name */
    private d f21036x;

    /* renamed from: y, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f21037y;

    /* renamed from: z, reason: collision with root package name */
    private WindVaneWebView f21038z;

    public AnythinkBTWebView(Context context) {
        super(context);
        this.f21033u = false;
        this.f21035w = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21038z != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f21043n);
                jSONObject2.put("id", this.f21049d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                h.a();
                a.a((WebView) this.f21038z, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a((WebView) this.f21038z, "broadcast", this.f21049d);
            }
        }
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        WebView webView = this.f21029B;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f21049d);
        }
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z3) {
    }

    public List<com.anythink.expressad.foundation.d.d> getCampaigns() {
        return this.f21037y;
    }

    public String getFilePath() {
        return this.f21031q;
    }

    public String getFileURL() {
        return this.f21030p;
    }

    public String getHtml() {
        return this.f21032r;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.d getMraidCampaign() {
        return this.f21047b;
    }

    public d getRewardUnitSetting() {
        return this.f21036x;
    }

    public WindVaneWebView getWebView() {
        return this.f21038z;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f21038z = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f21038z.setVisibility(0);
        j jVar = new j(null, this.f21047b, this.f21037y);
        this.f21028A = jVar;
        jVar.a(this.f21048c);
        this.f21038z.setObject(this.f21028A);
        this.f21038z.setMraidObject(this);
        this.f21038z.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.1
            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.expressad.atsignalcommon.windvane.c
            public final void a(Object obj) {
                super.a(obj);
                try {
                    String i = AnythinkBTWebView.this.f21028A != null ? AnythinkBTWebView.this.f21028A.i() : "";
                    h.a().a(obj, TextUtils.isEmpty(i) ? "" : Base64.encodeToString(i.getBytes(), 2));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (AnythinkBTWebView.this.f21029B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject.put("code", BTBaseView.f21043n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject2.put("result", 1);
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21029B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21029B, e9.getMessage());
                        e9.getMessage();
                    }
                }
                h.a();
                a.a(AnythinkBTWebView.this.f21038z);
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (AnythinkBTWebView.this.f21029B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject.put("code", BTBaseView.f21043n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21029B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21029B, e9.getMessage());
                        e9.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (AnythinkBTWebView.this.f21029B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject.put("code", BTBaseView.f21043n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f21049d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21029B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21029B, e9.getMessage());
                        e9.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
            }
        });
        addView(this.f21038z, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AnythinkBTWebView.this.f21029B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21043n);
                        jSONObject.put("id", AnythinkBTWebView.this.f21049d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        h.a();
                        a.a(AnythinkBTWebView.this.f21029B, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        c.a();
                        c.a(AnythinkBTWebView.this.f21029B, "onClicked", AnythinkBTWebView.this.f21049d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f21034v = imageView;
            imageView.setImageResource(findDrawable("anythink_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f21034v.setLayoutParams(layoutParams);
            this.f21034v.setVisibility(this.f21033u ? 4 : 8);
            com.anythink.expressad.foundation.d.d dVar = this.f21047b;
            if (dVar != null && dVar.I()) {
                this.f21034v.setVisibility(4);
            }
            this.f21034v.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTWebView.this.close();
                }
            });
            addView(this.f21034v);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView != null) {
            BTBaseView.a(windVaneWebView, str, this.f21049d);
        }
    }

    public void onBackPressed() {
        if (this.f21038z != null) {
            c.a();
            c.a((WebView) this.f21038z, "onSystemBackPressed", this.f21049d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f21038z != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", f21027t);
                } else {
                    jSONObject.put("orientation", f21026s);
                }
                jSONObject.put("instanceId", this.f21049d);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                h.a();
                a.a((WebView) this.f21038z, "orientation", encodeToString);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f21035w) {
            return;
        }
        this.f21035w = true;
        try {
            if (this.f21038z != null) {
                c.a();
                c.a((WebView) this.f21038z, "onSystemDestory", this.f21049d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (AnythinkBTWebView.this.f21038z != null) {
                            AnythinkBTWebView.this.f21038z.clearWebView();
                            AnythinkBTWebView.this.f21038z.release();
                        }
                        AnythinkBTWebView.this.f21030p = null;
                        AnythinkBTWebView.this.f21031q = null;
                        AnythinkBTWebView.this.f21032r = null;
                        if (AnythinkBTWebView.this.f21029B != null) {
                            AnythinkBTWebView.this.f21029B = null;
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
            String af = this.f21047b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21047b.p(str);
                try {
                    getMraidCampaign();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            new com.anythink.expressad.b.a(getContext(), this.f21048c);
            this.f21047b.p(af);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f21030p)) {
            this.f21038z.loadUrl(this.f21030p);
        } else if (!TextUtils.isEmpty(this.f21031q)) {
            this.f21038z.loadUrl(this.f21031q);
        } else {
            if (TextUtils.isEmpty(this.f21032r)) {
                return;
            }
            this.f21038z.loadDataWithBaseURL("", this.f21032r, "text/html", "UTF-8", null);
        }
    }

    public void setCampaigns(List<com.anythink.expressad.foundation.d.d> list) {
        this.f21037y = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f21029B = webView;
    }

    public void setFilePath(String str) {
        this.f21031q = str;
    }

    public void setFileURL(String str) {
        this.f21030p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean contains = str.contains("play.google.com");
        setWebviewClickable(!contains);
        if (contains) {
            com.anythink.core.express.web.d dVar = new com.anythink.core.express.web.d();
            WindVaneWebView windVaneWebView = this.f21038z;
            if (windVaneWebView != null) {
                windVaneWebView.setFilter(dVar);
            }
        }
    }

    public void setHtml(String str) {
        this.f21032r = str;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setRewardUnitSetting(d dVar) {
        this.f21036x = dVar;
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z3) {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z3);
        }
    }

    @Override // com.anythink.core.express.b.b
    public void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public void useCustomClose(boolean z3) {
        try {
            this.f21034v.setVisibility(z3 ? 4 : 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f21038z.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f21038z.goForward();
        return true;
    }

    public void webviewLoad(int i) {
        if (this.f21028A == null) {
            this.f21028A = new j(null, this.f21047b, this.f21037y);
        }
        com.anythink.expressad.foundation.d.d dVar = this.f21047b;
        if (dVar != null) {
            this.f21028A.a(dVar);
        } else {
            List<com.anythink.expressad.foundation.d.d> list = this.f21037y;
            if (list != null && list.size() > 0) {
                this.f21028A.a(this.f21037y);
                if (this.f21037y.size() == 1) {
                    this.f21028A.a(this.f21037y.get(0));
                }
            }
        }
        d dVar2 = this.f21036x;
        if (dVar2 != null) {
            this.f21028A.a(dVar2);
        }
        this.f21028A.a(this.f21048c);
        this.f21028A.c(this.f21049d);
        if (i == 1) {
            this.f21028A.q();
        }
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f21028A);
        }
        com.anythink.expressad.foundation.d.d dVar3 = this.f21047b;
        if (dVar3 != null && dVar3.I()) {
            this.f21034v.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f21038z;
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
        this.f21033u = false;
        this.f21035w = false;
    }

    private void a(com.anythink.core.express.web.d dVar) {
        WindVaneWebView windVaneWebView = this.f21038z;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(dVar);
        }
    }
}
