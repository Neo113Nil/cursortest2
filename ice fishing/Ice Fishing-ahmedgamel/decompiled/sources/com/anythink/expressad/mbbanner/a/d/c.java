package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.mbbanner.a.c.e;
import com.anythink.expressad.mbbanner.view.ATBannerWebView;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.i;
import com.anythink.expressad.out.q;
import com.anythink.expressad.videocommon.b.j;
import com.anythink.expressad.widget.ATAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20702c = "BannerShowManager";

    /* renamed from: B, reason: collision with root package name */
    private float f20704B;

    /* renamed from: C, reason: collision with root package name */
    private float f20705C;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.b.a f20709a;

    /* renamed from: b, reason: collision with root package name */
    i f20710b;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f20711d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20712e;

    /* renamed from: f, reason: collision with root package name */
    private d f20713f;

    /* renamed from: g, reason: collision with root package name */
    private final TemplateBannerView f20714g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f20715h;
    private ATBannerWebView i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f20716j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f20717k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20718l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20719m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20720n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20721o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20722p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20723q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20724r;

    /* renamed from: s, reason: collision with root package name */
    private final String f20725s;

    /* renamed from: t, reason: collision with root package name */
    private final String f20726t;

    /* renamed from: u, reason: collision with root package name */
    private List<d> f20727u;

    /* renamed from: w, reason: collision with root package name */
    private int f20729w;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.a.c f20731y;

    /* renamed from: v, reason: collision with root package name */
    private int f20728v = 1;

    /* renamed from: x, reason: collision with root package name */
    private final long f20730x = 15000;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f20732z = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.mbbanner.a.d.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.expressad.foundation.g.h.a f20703A = new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.5
        @Override // com.anythink.expressad.foundation.g.h.a
        public final void a() {
            c.this.a(com.anythink.expressad.mbbanner.a.a.f20609n);
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void c() {
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private final View.OnClickListener f20706D = new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f20724r) {
                c.b(c.this);
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f20707E = new com.anythink.expressad.mbbanner.a.c.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.7
        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(int i) {
            if (i == 2) {
                c.c(c.this);
            } else {
                c.this.j();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void b() {
            c.b(c.this);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void b(int i) {
            if (i == 1) {
                c.this.f();
            } else {
                c.this.c();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a() {
            c.b(c.this);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(d dVar) {
            c.this.a(dVar, false, "");
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z6) {
            if (c.this.f20711d != null) {
                c.this.f20723q = z6;
                if (z6) {
                    c.this.f20711d.b();
                } else {
                    c.this.f20711d.c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z6, String str) {
            try {
                if (c.this.f20711d != null) {
                    if (TextUtils.isEmpty(str)) {
                        c.this.f20711d.a(c.this.f20713f);
                        c.this.f20711d.a();
                    } else {
                        d b9 = d.b(d.a(c.this.f20713f));
                        b9.p(str);
                        c.this.a(b9, z6, str);
                    }
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.b.b f20708F = new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.mbbanner.a.d.c.3
        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            c.n(c.this);
            h.a();
            com.anythink.core.express.d.a.a(webView);
            c.r(c.this);
            if (c.this.f20713f == null || c.this.f20713f.t()) {
                return;
            }
            c.this.f();
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            c.this.a(str);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onRenderProcessGone(WebView webView) {
            c.this.c();
        }
    };

    public c(TemplateBannerView templateBannerView, com.anythink.expressad.mbbanner.a.c.c cVar, String str, String str2, boolean z6, com.anythink.expressad.f.c cVar2) {
        this.f20712e = z6;
        this.f20714g = templateBannerView;
        this.f20725s = str2;
        this.f20726t = str;
        this.f20711d = new e(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f20714g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
            this.f20714g.removeView(this.i);
        }
        if (this.f20715h == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f20715h = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    c.this.f20704B = motionEvent.getRawX();
                    c.this.f20705C = motionEvent.getRawY();
                    float unused = c.this.f20704B;
                    float unused2 = c.this.f20705C;
                    return false;
                }
            });
            this.f20715h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.this.a(com.anythink.expressad.mbbanner.a.e.b.a(CommonJSBridgeImpUtils.buildClickJsonObject(c.this.f20704B, c.this.f20705C), c.this.f20713f), false, "");
                }
            });
        }
        String bm = this.f20713f.bm();
        if (TextUtils.isEmpty(bm)) {
            a(com.anythink.expressad.mbbanner.a.a.f20604h);
        } else {
            k.m().a(bm, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.mbbanner.a.d.c.11
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str) {
                    if (c.this.f20715h != null) {
                        c.this.f20715h.setImageBitmap(bitmap);
                    }
                    c.n(c.this);
                    c.o(c.this);
                    c.this.j();
                    c.this.k();
                    if (c.this.f20724r) {
                        return;
                    }
                    c.this.f();
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str, String str2) {
                    c.this.a(com.anythink.expressad.mbbanner.a.a.f20605j);
                }
            });
        }
    }

    private static void m() {
    }

    public static /* synthetic */ boolean n(c cVar) {
        cVar.f20720n = true;
        return true;
    }

    private static /* synthetic */ void o() {
    }

    public static /* synthetic */ boolean r(c cVar) {
        cVar.f20722p = true;
        return true;
    }

    private boolean b() {
        String a9 = a(this.f20713f);
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        if (this.f20714g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return true;
        }
        if (this.i == null) {
            try {
                ATBannerWebView aTBannerWebView = new ATBannerWebView(t.b().g());
                this.i = aTBannerWebView;
                aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.i.setWebViewClient(new com.anythink.expressad.mbbanner.view.a(this.f20725s, this.f20727u, this.f20707E));
            } catch (Throwable unused) {
                return false;
            }
        }
        ImageView imageView = this.f20715h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.i.getVisibility() != 0) {
            this.i.setVisibility(0);
        }
        if (this.i.getParent() == null) {
            this.f20714g.addView(this.i);
            d(this.f20713f.I());
        }
        if (this.f20713f.I()) {
            k();
        }
        j();
        com.anythink.expressad.mbbanner.a.a.c cVar = new com.anythink.expressad.mbbanner.a.a.c(this.f20714g.getContext(), this.f20726t, this.f20725s);
        this.f20731y = cVar;
        cVar.a(this.f20727u);
        this.f20731y.a(this.f20707E);
        this.f20731y.a(this.f20729w);
        this.i.setWebViewListener(this.f20708F);
        this.i.setObject(this.f20731y);
        if (a9.startsWith("file")) {
            this.i.loadUrl(a9);
        } else {
            this.i.loadDataWithBaseURL(this.f20713f.p(), a9, "text/html", com.anythink.expressad.foundation.g.a.bR, null);
        }
        ATBannerWebView aTBannerWebView2 = this.i;
        if (aTBannerWebView2 == null) {
            return true;
        }
        aTBannerWebView2.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (c.this.i != null) {
                        String str = c.this.f20728v == 2 ? "false" : "true";
                        c.this.i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                    }
                } catch (Throwable unused2) {
                }
            }
        }, 1000L);
        return true;
    }

    private void d() {
        if (this.f20712e && this.f20716j == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f20716j = imageView;
            imageView.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_banner_close", com.anythink.expressad.foundation.h.k.f20419c));
            this.f20716j.setVisibility(8);
            this.f20716j.setContentDescription("closeButton");
        }
    }

    private boolean e() {
        if (this.f20714g == null) {
            return false;
        }
        d dVar = this.f20713f;
        return (aa.a(this.f20714g, dVar != null ? dVar.aL() : 0) || this.f20723q) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        boolean z6;
        TemplateBannerView templateBannerView;
        if (this.f20720n && !this.f20721o && this.f20711d != null) {
            this.f20721o = true;
            this.f20732z.removeCallbacks(this.f20703A);
            d dVar = this.f20713f;
            if (dVar != null && !dVar.ao()) {
                this.f20713f.ap();
                this.f20711d.a(this.f20727u);
            }
        }
        if (!this.f20720n || !this.f20718l || !this.f20719m || !this.f20721o || this.f20713f == null || g()) {
            return;
        }
        if (this.f20714g != null) {
            d dVar2 = this.f20713f;
            if (!aa.a(this.f20714g, dVar2 != null ? dVar2.aL() : 0) && !this.f20723q) {
                z6 = true;
                if (!z6 && (templateBannerView = this.f20714g) != null) {
                    templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f();
                        }
                    }, 1000L);
                }
                if (this.f20722p && z6) {
                    int[] iArr = new int[2];
                    this.f20714g.getLocationInWindow(iArr);
                    ATBannerWebView aTBannerWebView = this.i;
                    float f2 = iArr[0];
                    float f9 = iArr[1];
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", f2);
                        jSONObject.put("startY", f9);
                        jSONObject.put("scale", v.c(t.b().g()));
                        String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) aTBannerWebView, "webviewshow", encodeToString);
                    } catch (Throwable unused) {
                    }
                    ATBannerWebView aTBannerWebView2 = this.i;
                    int i = iArr[0];
                    int i4 = iArr[1];
                    int width = this.f20714g.getWidth();
                    int height = this.f20714g.getHeight();
                    try {
                        int i6 = t.b().g().getResources().getConfiguration().orientation;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("orientation", i6 != 2 ? "landscape" : i6 == 1 ? "portrait" : "undefined");
                        jSONObject2.put("locked", "true");
                        float f10 = n.f(t.b().g());
                        float g9 = n.g(t.b().g());
                        HashMap h3 = n.h(t.b().g());
                        int intValue = ((Integer) h3.get("width")).intValue();
                        int intValue2 = ((Integer) h3.get("height")).intValue();
                        HashMap hashMap = new HashMap();
                        hashMap.put(com.anythink.core.express.b.a.f18312a, com.anythink.core.express.b.a.f18321k);
                        hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
                        hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
                        hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject2);
                        com.anythink.core.express.b.a.a();
                        float f11 = i;
                        float f12 = i4;
                        float f13 = width;
                        float f14 = height;
                        com.anythink.core.express.b.a.a(aTBannerWebView2, f11, f12, f13, f14);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.b(aTBannerWebView2, f11, f12, f13, f14);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.b(aTBannerWebView2, f10, g9);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.c(aTBannerWebView2, intValue, intValue2);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.a(aTBannerWebView2, hashMap);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.a(aTBannerWebView2);
                    } catch (Throwable unused2) {
                    }
                    this.f20722p = false;
                    if (!TextUtils.isEmpty(this.f20713f.bm())) {
                        k.m().c(this.f20713f.bm());
                    }
                }
                this.f20713f.bh();
                if (z6) {
                    this.f20713f.c(false);
                    return;
                }
                ImageView imageView = this.f20715h;
                if (imageView == null || imageView.getVisibility() != 0) {
                    List<d> list = this.f20727u;
                    if (list != null && list.size() > 0) {
                        boolean z9 = false;
                        int i9 = 0;
                        for (int i10 = 0; i10 < this.f20727u.size(); i10++) {
                            if (!this.f20727u.get(i10).t() && (i10 == 0 || !this.f20727u.get(i10).W())) {
                                c(this.f20727u.get(i10), t.b().g(), this.f20725s);
                                this.f20727u.get(i10).c(true);
                                f.a(this.f20725s, this.f20727u.get(i10), f.f19910e);
                                i9 = i10;
                                z9 = true;
                            }
                        }
                        if (z9) {
                            b(this.f20727u.get(i9), t.b().g(), this.f20725s);
                            a(this.f20727u.get(i9), t.b().g(), this.f20725s);
                        }
                    }
                } else {
                    d dVar3 = this.f20713f;
                    if (dVar3 != null) {
                        if (dVar3 != null) {
                            c(dVar3, t.b().g(), this.f20725s);
                            b(dVar3, t.b().g(), this.f20725s);
                            a(dVar3, t.b().g(), this.f20725s);
                        }
                        this.f20713f.c(true);
                        f.a(this.f20725s, this.f20713f, f.f19910e);
                    }
                }
                this.f20724r = true;
                com.anythink.expressad.mbbanner.a.c.c cVar = this.f20711d;
                if (cVar != null) {
                    cVar.a(this.f20713f, false);
                }
                this.f20732z.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
        }
        z6 = false;
        if (!z6) {
            templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f();
                }
            }, 1000L);
        }
        if (this.f20722p) {
            int[] iArr2 = new int[2];
            this.f20714g.getLocationInWindow(iArr2);
            ATBannerWebView aTBannerWebView3 = this.i;
            float f22 = iArr2[0];
            float f92 = iArr2[1];
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("startX", f22);
            jSONObject3.put("startY", f92);
            jSONObject3.put("scale", v.c(t.b().g()));
            String encodeToString2 = Base64.encodeToString(jSONObject3.toString().getBytes(), 2);
            h.a();
            com.anythink.core.express.d.a.a((WebView) aTBannerWebView3, "webviewshow", encodeToString2);
            ATBannerWebView aTBannerWebView22 = this.i;
            int i11 = iArr2[0];
            int i42 = iArr2[1];
            int width2 = this.f20714g.getWidth();
            int height2 = this.f20714g.getHeight();
            int i62 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("orientation", i62 != 2 ? "landscape" : i62 == 1 ? "portrait" : "undefined");
            jSONObject22.put("locked", "true");
            float f102 = n.f(t.b().g());
            float g92 = n.g(t.b().g());
            HashMap h32 = n.h(t.b().g());
            int intValue3 = ((Integer) h32.get("width")).intValue();
            int intValue22 = ((Integer) h32.get("height")).intValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.anythink.core.express.b.a.f18312a, com.anythink.core.express.b.a.f18321k);
            hashMap2.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
            hashMap2.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap2.put(com.anythink.core.express.b.a.f18315d, jSONObject22);
            com.anythink.core.express.b.a.a();
            float f112 = i11;
            float f122 = i42;
            float f132 = width2;
            float f142 = height2;
            com.anythink.core.express.b.a.a(aTBannerWebView22, f112, f122, f132, f142);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(aTBannerWebView22, f112, f122, f132, f142);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(aTBannerWebView22, f102, g92);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(aTBannerWebView22, intValue3, intValue22);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView22, hashMap2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView22);
            this.f20722p = false;
            if (!TextUtils.isEmpty(this.f20713f.bm())) {
            }
        }
        this.f20713f.bh();
        if (z6) {
        }
    }

    private synchronized boolean g() {
        boolean W3;
        W3 = this.f20713f.W();
        if (!W3) {
            this.f20713f.c(true);
        }
        return W3;
    }

    private void h() {
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f20711d;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void i() {
        if (this.f20715h != null) {
            ATBannerWebView aTBannerWebView = this.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f20715h.getVisibility() != 0) {
                this.f20715h.setVisibility(0);
            }
            if (this.f20714g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f20715h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f20715h.getParent() == null) {
                    this.f20714g.addView(this.f20715h, layoutParams);
                }
                d(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ImageView imageView;
        if (!this.f20712e || (imageView = this.f20716j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f20716j.setVisibility(0);
            this.f20716j.setOnClickListener(this.f20706D);
        }
        if (this.f20716j.getParent() != null || this.f20714g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(k.e(12.0f), k.e(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f20714g.addView(this.f20716j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f20714g == null) {
            return;
        }
        d dVar = this.f20713f;
        if (dVar == null || dVar.a() == 1) {
            ATAdChoice aTAdChoice = new ATAdChoice(t.b().g());
            aTAdChoice.setCampaign(this.f20713f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(k.e(6.0f), k.e(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f20714g.addView(aTAdChoice, layoutParams);
        }
    }

    private void l() {
        ImageView imageView;
        if (this.f20712e && (imageView = this.f20716j) != null && imageView.getVisibility() == 0) {
            this.f20716j.setVisibility(8);
            this.f20716j.setOnClickListener(null);
            if (this.f20714g == null || this.f20716j.getParent() == null) {
                return;
            }
            this.f20714g.removeView(this.f20716j);
        }
    }

    private int n() {
        return this.f20728v;
    }

    public static /* synthetic */ void o(c cVar) {
        if (cVar.f20715h != null) {
            ATBannerWebView aTBannerWebView = cVar.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (cVar.f20715h.getVisibility() != 0) {
                cVar.f20715h.setVisibility(0);
            }
            if (cVar.f20714g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f20715h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f20715h.getParent() == null) {
                    cVar.f20714g.addView(cVar.f20715h, layoutParams);
                }
                cVar.d(true);
            }
        }
    }

    public final void a(i iVar) {
        this.f20710b = iVar;
    }

    public final void a(boolean z6, int i) {
        this.f20729w = i;
        if (i == 0) {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20725s);
            if (c9 == null) {
                return;
            } else {
                z6 = c9.d() == 1;
            }
        }
        this.f20712e = z6;
    }

    private void d(boolean z6) {
        if (this.f20714g != null) {
            View b9 = com.anythink.expressad.foundation.f.b.a().b(this.f20725s);
            if (com.anythink.expressad.foundation.f.b.a().b() && z6 && b9 != null) {
                ViewGroup viewGroup = (ViewGroup) b9.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b9);
                }
                b9.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19834a, com.anythink.expressad.foundation.f.b.f19835b);
                }
                layoutParams.addRule(12);
                b9.setLayoutParams(layoutParams);
                this.f20714g.addView(b9);
            }
            com.anythink.expressad.foundation.f.b.a().a(this.f20725s, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.4
                @Override // com.anythink.expressad.foundation.f.a
                public final void a() {
                    String str;
                    c.this.f20714g.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (t.b().g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        th.getMessage();
                        str = "";
                    }
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void b() {
                    String str;
                    c.this.f20714g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (t.b().g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        th.getMessage();
                        str = "";
                    }
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void c() {
                    String str;
                    c.this.f20714g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (t.b().g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        th.getMessage();
                        str = "";
                    }
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
                }
            });
            this.f20713f.l(this.f20725s);
            com.anythink.expressad.foundation.f.b.a().a(this.f20725s, this.f20713f);
        }
    }

    public final void a(boolean z6) {
        this.f20712e = z6;
    }

    private static String a(d dVar) {
        if (dVar == null) {
            return "";
        }
        String c9 = j.a().c(dVar.p());
        if (TextUtils.isEmpty(c9)) {
            c9 = dVar.q();
            if (dVar.aA()) {
                try {
                    File file = new File(c9);
                    if (!file.exists()) {
                        return "";
                    }
                    return p.a(file);
                } catch (Exception unused) {
                    File file2 = new File(c9);
                    return (file2.exists() && file2.isFile() && file2.canRead()) ? "file:////".concat(String.valueOf(c9)) : c9;
                }
            }
            File file3 = new File(c9);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                return "file:////".concat(String.valueOf(c9));
            }
        }
        return c9;
    }

    public final void c(boolean z6) {
        this.f20719m = z6;
        f();
    }

    private static void c(d dVar, Context context, String str) {
        d dVar2;
        Context context2;
        String str2;
        if (TextUtils.isEmpty(dVar.ai())) {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
        } else {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
            com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar.ai(), false, true, com.anythink.expressad.b.b.a.i);
        }
        if (TextUtils.isEmpty(str2) || dVar2.M() == null || dVar2.M().o() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar2.M().o(), false);
    }

    public static /* synthetic */ void c(c cVar) {
        ImageView imageView;
        if (cVar.f20712e && (imageView = cVar.f20716j) != null && imageView.getVisibility() == 0) {
            cVar.f20716j.setVisibility(8);
            cVar.f20716j.setOnClickListener(null);
            if (cVar.f20714g == null || cVar.f20716j.getParent() == null) {
                return;
            }
            cVar.f20714g.removeView(cVar.f20716j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f20713f == null || g()) {
            return;
        }
        this.f20732z.removeCallbacks(this.f20703A);
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f20711d;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public final void a() {
        if (this.f20711d != null) {
            this.f20711d = null;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.f20708F != null) {
            this.f20708F = null;
        }
        ImageView imageView = this.f20716j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f20715h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.f20714g;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.i;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        com.anythink.expressad.mbbanner.a.a.c cVar = this.f20731y;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f20707E != null) {
            this.f20707E = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f20725s);
    }

    public final void b(boolean z6) {
        this.f20718l = z6;
        f();
    }

    private void b(d dVar) {
        if (dVar != null) {
            c(dVar, t.b().g(), this.f20725s);
            b(dVar, t.b().g(), this.f20725s);
            a(dVar, t.b().g(), this.f20725s);
        }
    }

    private static void b(d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18944j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private d b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null) {
            return null;
        }
        ArrayList<d> arrayList = eVar.f19467K;
        this.f20727u = arrayList;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return this.f20727u.get(0);
    }

    public static /* synthetic */ void b(c cVar) {
        com.anythink.expressad.mbbanner.a.c.c cVar2 = cVar.f20711d;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    private static void a(d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> d9 = dVar.d();
                if (d9 == null || d9.size() <= 0) {
                    return;
                }
                Iterator<String> it = d9.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(context, dVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public final void a(d dVar, boolean z6, String str) {
        if (this.f20724r) {
            if (this.f20709a == null) {
                this.f20709a = new com.anythink.expressad.b.a(t.b().g(), this.f20725s);
            }
            this.f20709a.a(new q.e() { // from class: com.anythink.expressad.mbbanner.a.d.c.2
                @Override // com.anythink.expressad.out.q.c
                public final void a(com.anythink.expressad.out.k kVar) {
                }

                @Override // com.anythink.expressad.out.q.c
                public final void b(com.anythink.expressad.out.k kVar) {
                }

                @Override // com.anythink.expressad.out.q.c
                public final void c() {
                }

                @Override // com.anythink.expressad.out.q.c
                public final void d(com.anythink.expressad.out.k kVar) {
                }

                @Override // com.anythink.expressad.out.q.c
                public final void a(d dVar2, String str2) {
                    TemplateBannerView unused = c.this.f20714g;
                    u.a();
                }

                @Override // com.anythink.expressad.out.q.c
                public final boolean b() {
                    return false;
                }

                @Override // com.anythink.expressad.out.q.c
                public final void c(com.anythink.expressad.out.k kVar) {
                }

                @Override // com.anythink.expressad.out.q.c
                public final void a(com.anythink.expressad.out.k kVar, String str2) {
                    if (kVar == null) {
                        return;
                    }
                    TemplateBannerView unused = c.this.f20714g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.c
                public final void b(com.anythink.expressad.out.k kVar, String str2) {
                    if (kVar == null) {
                        return;
                    }
                    TemplateBannerView unused = c.this.f20714g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.e
                public final void a() {
                    if (c.this.f20711d != null) {
                        c.this.f20711d.a();
                    }
                }
            });
            dVar.l(this.f20725s);
            if (!this.f20713f.X()) {
                this.f20713f.Y();
            }
            com.anythink.expressad.mbbanner.a.c.c cVar = this.f20711d;
            if (cVar != null) {
                cVar.a(dVar);
            }
            if (z6) {
                TextUtils.isEmpty(str);
            }
        }
    }

    public final void a(int i, int i4, int i6, int i9) {
        if (i == i6 && i4 == i9) {
            return;
        }
        ATBannerWebView aTBannerWebView = this.i;
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView, i, i4);
        } catch (Throwable unused) {
        }
    }

    private void a(int i) {
        this.f20728v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        d dVar;
        if (eVar != null) {
            ArrayList<d> arrayList = eVar.f19467K;
            this.f20727u = arrayList;
            if (arrayList != null && arrayList.size() > 0) {
                dVar = this.f20727u.get(0);
                this.f20713f = dVar;
                if (dVar != null) {
                    a(com.anythink.expressad.mbbanner.a.a.f20604h);
                    return;
                }
                this.f20732z.removeCallbacks(this.f20703A);
                if (this.f20712e && this.f20716j == null) {
                    ImageView imageView = new ImageView(t.b().g());
                    this.f20716j = imageView;
                    imageView.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_banner_close", com.anythink.expressad.foundation.h.k.f20419c));
                    this.f20716j.setVisibility(8);
                    this.f20716j.setContentDescription("closeButton");
                }
                this.f20720n = false;
                this.f20721o = false;
                this.f20724r = false;
                if (TextUtils.isEmpty(this.f20713f.q())) {
                    TextUtils.isEmpty(this.f20713f.p());
                }
                this.f20732z.postDelayed(this.f20703A, 15000L);
                if (b()) {
                    return;
                }
                if (TextUtils.isEmpty(this.f20713f.q())) {
                    TextUtils.isEmpty(this.f20713f.p());
                }
                c();
                return;
            }
        }
        dVar = null;
        this.f20713f = dVar;
        if (dVar != null) {
        }
    }
}
