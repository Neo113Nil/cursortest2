package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.anythink.core.express.web.BaseWebView;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: a, reason: collision with root package name */
    protected l f18835a;

    /* renamed from: b, reason: collision with root package name */
    protected d f18836b;

    /* renamed from: c, reason: collision with root package name */
    protected g f18837c;

    /* renamed from: d, reason: collision with root package name */
    private Object f18838d;

    /* renamed from: e, reason: collision with root package name */
    private Object f18839e;

    /* renamed from: f, reason: collision with root package name */
    private String f18840f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.core.express.web.c f18841g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18842j;

    /* renamed from: k, reason: collision with root package name */
    private float f18843k;

    /* renamed from: l, reason: collision with root package name */
    private float f18844l;

    /* renamed from: m, reason: collision with root package name */
    private String f18845m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f18846n;

    /* renamed from: o, reason: collision with root package name */
    private int f18847o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f18842j = false;
        this.f18843k = 0.0f;
        this.f18844l = 0.0f;
    }

    public static /* synthetic */ boolean a(WindVaneWebView windVaneWebView) {
        windVaneWebView.f18842j = true;
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
            if (!TextUtils.isEmpty(path) && path.contains(t.a())) {
                return str;
            }
        }
        Log.e("anythink_express", "illegal URL: ".concat(String.valueOf(str)));
        return com.anythink.core.common.res.d.f17002a;
    }

    public void clearWebView() {
        if (this.f18842j) {
            return;
        }
        loadUrl(com.anythink.core.common.res.d.f17002a);
    }

    public com.anythink.expressad.foundation.d.d getCampaignEx() {
        return this.f18846n;
    }

    public String getCampaignId() {
        return this.f18840f;
    }

    public Object getJsObject(String str) {
        g gVar = this.f18837c;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f18845m;
    }

    public Object getMraidObject() {
        return this.f18839e;
    }

    public Object getObject() {
        return this.f18838d;
    }

    public String getRid() {
        return this.i;
    }

    public d getSignalCommunication() {
        return this.f18836b;
    }

    public com.anythink.core.express.web.c getWebViewListener() {
        return this.f18841g;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public boolean isDestroyed() {
        return this.f18842j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.anythink.core.express.web.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f18843k = motionEvent.getRawX();
                    this.f18844l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f18843k;
                    float y7 = motionEvent.getY() - this.f18844l;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48.0f) && ((rawX <= 0.0f || rawX <= 48.0f) && ((y7 >= 0.0f || (-1.0f) * y7 <= 48.0f) && (y7 <= 0.0f || y7 <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        if (this.f18837c == null) {
            return;
        }
        g.a(cls);
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.f18838d = null;
            if (v.j(getContext()) != 0) {
                com.anythink.core.common.d.t.b().a(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.a(WindVaneWebView.this);
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            } else {
                this.f18842j = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        g gVar = this.f18837c;
        if (gVar != null) {
            gVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        g gVar = this.f18837c;
        if (gVar != null) {
            gVar.a(obj);
        }
    }

    public void setCampaignEx(com.anythink.expressad.foundation.d.d dVar) {
        this.f18846n = dVar;
    }

    public void setCampaignId(String str) {
        this.f18840f = str;
    }

    public void setLocalRequestId(String str) {
        this.f18845m = str;
    }

    public void setMraidObject(Object obj) {
        this.f18839e = obj;
    }

    public void setObject(Object obj) {
        this.f18838d = obj;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public void setSignalCommunication(d dVar) {
        this.f18836b = dVar;
        dVar.a(this);
    }

    public void setTempTypeForMetrics(int i) {
        this.f18847o = i;
    }

    public void setWebViewChromeClient(l lVar) {
        this.f18835a = lVar;
        setWebChromeClient(lVar);
    }

    public void setWebViewListener(com.anythink.core.express.web.c cVar) {
        this.f18841g = cVar;
        l lVar = this.f18835a;
        if (lVar != null) {
            lVar.a(cVar);
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
            getSettings().setUserAgentString(com.anythink.core.common.v.m.h() + " WindVane/3.0.2");
        }
        if (this.f18835a == null) {
            this.f18835a = new l(this);
        }
        setWebViewChromeClient(this.f18835a);
        m mVar = new m();
        this.mWebViewClient = mVar;
        setWebViewClient(mVar);
        if (this.f18836b == null) {
            d kVar = new k(this.f18366h);
            this.f18836b = kVar;
            setSignalCommunication(kVar);
        }
        this.f18837c = new g(this.f18366h, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18842j = false;
        this.f18843k = 0.0f;
        this.f18844l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18842j = false;
        this.f18843k = 0.0f;
        this.f18844l = 0.0f;
    }
}
