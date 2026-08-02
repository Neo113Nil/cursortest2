package com.anythink.basead.mraid;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import com.anythink.core.express.web.BaseWebView;

/* loaded from: classes.dex */
public class MraidBaseWebView extends BaseWebView {

    /* renamed from: a, reason: collision with root package name */
    protected j f10374a;

    /* renamed from: b, reason: collision with root package name */
    protected a f10375b;

    /* renamed from: c, reason: collision with root package name */
    protected h f10376c;

    /* renamed from: d, reason: collision with root package name */
    private Object f10377d;

    /* renamed from: e, reason: collision with root package name */
    private Object f10378e;

    /* renamed from: f, reason: collision with root package name */
    private String f10379f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.core.express.web.c f10380g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10381j;

    /* renamed from: k, reason: collision with root package name */
    private float f10382k;

    /* renamed from: l, reason: collision with root package name */
    private float f10383l;

    /* renamed from: m, reason: collision with root package name */
    private String f10384m;

    /* renamed from: n, reason: collision with root package name */
    private int f10385n;

    public MraidBaseWebView(Context context) {
        super(context);
        this.f10381j = false;
        this.f10382k = 0.0f;
        this.f10383l = 0.0f;
    }

    public static /* synthetic */ boolean a(MraidBaseWebView mraidBaseWebView) {
        mraidBaseWebView.f10381j = true;
        return true;
    }

    @Override // com.anythink.core.express.web.BaseWebView
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

    public void clearWebView() {
        if (this.f10381j) {
            return;
        }
        loadUrl(com.anythink.core.common.res.d.f17002a);
    }

    public String getCampaignId() {
        return this.f10379f;
    }

    public Object getJsObject(String str) {
        h hVar = this.f10376c;
        if (hVar == null) {
            return null;
        }
        hVar.a(this.f18366h, this);
        return this.f10376c;
    }

    public String getLocalRequestId() {
        return this.f10384m;
    }

    public Object getMraidObject() {
        return this.f10378e;
    }

    public Object getObject() {
        return this.f10377d;
    }

    public String getRid() {
        return this.i;
    }

    public a getSignalCommunication() {
        return this.f10375b;
    }

    public com.anythink.core.express.web.c getWebViewListener() {
        return this.f10380g;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public boolean isDestroyed() {
        return this.f10381j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.anythink.core.express.web.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f10382k = motionEvent.getRawX();
                    this.f10383l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f10382k;
                    float y7 = motionEvent.getY() - this.f10383l;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48.0f) && ((rawX <= 0.0f || rawX <= 48.0f) && ((y7 >= 0.0f || (-1.0f) * y7 <= 48.0f) && (y7 <= 0.0f || y7 <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.f10377d = null;
            Context context = getContext();
            if (context == null) {
                context = t.b().g();
            }
            float i = q.i(context);
            if (i != 0.0f) {
                t.b().a(new Runnable() { // from class: com.anythink.basead.mraid.MraidBaseWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MraidBaseWebView.a(MraidBaseWebView.this);
                        MraidBaseWebView.this.destroy();
                    }
                }, (long) (i * 1000.0f));
            } else {
                this.f10381j = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setCampaignId(String str) {
        this.f10379f = str;
    }

    public void setLocalRequestId(String str) {
        this.f10384m = str;
    }

    public void setMraidObject(Object obj) {
        this.f10378e = obj;
    }

    public void setObject(Object obj) {
        this.f10377d = obj;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public void setSignalCommunication(a aVar) {
        this.f10375b = aVar;
        aVar.f10395c = this;
    }

    public void setTempTypeForMetrics(int i) {
        this.f10385n = i;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f10374a = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(com.anythink.core.express.web.c cVar) {
        this.f10380g = cVar;
        j jVar = this.f10374a;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.anythink.core.express.web.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public final void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(m.h() + " WindVane/3.0.2");
        }
        if (this.f10374a == null) {
            this.f10374a = new j(this);
        }
        setWebViewChromeClient(this.f10374a);
        this.f10376c = new h();
        if (this.f10375b == null) {
            a aVar = new a(this.f18366h);
            this.f10375b = aVar;
            setSignalCommunication(aVar);
        }
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10381j = false;
        this.f10382k = 0.0f;
        this.f10383l = 0.0f;
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10381j = false;
        this.f10382k = 0.0f;
        this.f10383l = 0.0f;
    }
}
