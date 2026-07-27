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
    protected j f9588a;

    /* renamed from: b, reason: collision with root package name */
    protected a f9589b;

    /* renamed from: c, reason: collision with root package name */
    protected h f9590c;

    /* renamed from: d, reason: collision with root package name */
    private Object f9591d;

    /* renamed from: e, reason: collision with root package name */
    private Object f9592e;

    /* renamed from: f, reason: collision with root package name */
    private String f9593f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.core.express.web.c f9594g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9595j;

    /* renamed from: k, reason: collision with root package name */
    private float f9596k;

    /* renamed from: l, reason: collision with root package name */
    private float f9597l;

    /* renamed from: m, reason: collision with root package name */
    private String f9598m;

    /* renamed from: n, reason: collision with root package name */
    private int f9599n;

    public MraidBaseWebView(Context context) {
        super(context);
        this.f9595j = false;
        this.f9596k = 0.0f;
        this.f9597l = 0.0f;
    }

    public static /* synthetic */ boolean a(MraidBaseWebView mraidBaseWebView) {
        mraidBaseWebView.f9595j = true;
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
        return com.anythink.core.common.res.d.f16215a;
    }

    public void clearWebView() {
        if (this.f9595j) {
            return;
        }
        loadUrl(com.anythink.core.common.res.d.f16215a);
    }

    public String getCampaignId() {
        return this.f9593f;
    }

    public Object getJsObject(String str) {
        h hVar = this.f9590c;
        if (hVar == null) {
            return null;
        }
        hVar.a(this.f17579h, this);
        return this.f9590c;
    }

    public String getLocalRequestId() {
        return this.f9598m;
    }

    public Object getMraidObject() {
        return this.f9592e;
    }

    public Object getObject() {
        return this.f9591d;
    }

    public String getRid() {
        return this.i;
    }

    public a getSignalCommunication() {
        return this.f9589b;
    }

    public com.anythink.core.express.web.c getWebViewListener() {
        return this.f9594g;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public boolean isDestroyed() {
        return this.f9595j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.anythink.core.express.web.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f9596k = motionEvent.getRawX();
                    this.f9597l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f9596k;
                    float y7 = motionEvent.getY() - this.f9597l;
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
            this.f9591d = null;
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
                this.f9595j = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setCampaignId(String str) {
        this.f9593f = str;
    }

    public void setLocalRequestId(String str) {
        this.f9598m = str;
    }

    public void setMraidObject(Object obj) {
        this.f9592e = obj;
    }

    public void setObject(Object obj) {
        this.f9591d = obj;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public void setSignalCommunication(a aVar) {
        this.f9589b = aVar;
        aVar.f9609c = this;
    }

    public void setTempTypeForMetrics(int i) {
        this.f9599n = i;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f9588a = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(com.anythink.core.express.web.c cVar) {
        this.f9594g = cVar;
        j jVar = this.f9588a;
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
        if (this.f9588a == null) {
            this.f9588a = new j(this);
        }
        setWebViewChromeClient(this.f9588a);
        this.f9590c = new h();
        if (this.f9589b == null) {
            a aVar = new a(this.f17579h);
            this.f9589b = aVar;
            setSignalCommunication(aVar);
        }
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9595j = false;
        this.f9596k = 0.0f;
        this.f9597l = 0.0f;
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9595j = false;
        this.f9596k = 0.0f;
        this.f9597l = 0.0f;
    }
}
