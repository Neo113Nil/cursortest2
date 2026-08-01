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
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.k;
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
    private static final String f19915c = "BannerShowManager";

    /* renamed from: B, reason: collision with root package name */
    private float f19917B;

    /* renamed from: C, reason: collision with root package name */
    private float f19918C;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.b.a f19922a;

    /* renamed from: b, reason: collision with root package name */
    i f19923b;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f19924d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19925e;

    /* renamed from: f, reason: collision with root package name */
    private d f19926f;

    /* renamed from: g, reason: collision with root package name */
    private final TemplateBannerView f19927g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f19928h;
    private ATBannerWebView i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f19929j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f19930k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19931l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19932m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19933n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19934o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19935p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19936q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19937r;

    /* renamed from: s, reason: collision with root package name */
    private final String f19938s;

    /* renamed from: t, reason: collision with root package name */
    private final String f19939t;

    /* renamed from: u, reason: collision with root package name */
    private List<d> f19940u;

    /* renamed from: w, reason: collision with root package name */
    private int f19942w;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.a.c f19944y;

    /* renamed from: v, reason: collision with root package name */
    private int f19941v = 1;

    /* renamed from: x, reason: collision with root package name */
    private final long f19943x = 15000;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f19945z = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.mbbanner.a.d.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.expressad.foundation.g.h.a f19916A = new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.5
        @Override // com.anythink.expressad.foundation.g.h.a
        public final void a() {
            c.this.a(com.anythink.expressad.mbbanner.a.a.f19822n);
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void c() {
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private final View.OnClickListener f19919D = new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f19937r) {
                c.b(c.this);
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f19920E = new com.anythink.expressad.mbbanner.a.c.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.7
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
        public final void a(boolean z3) {
            if (c.this.f19924d != null) {
                c.this.f19936q = z3;
                if (z3) {
                    c.this.f19924d.b();
                } else {
                    c.this.f19924d.c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z3, String str) {
            try {
                if (c.this.f19924d != null) {
                    if (TextUtils.isEmpty(str)) {
                        c.this.f19924d.a(c.this.f19926f);
                        c.this.f19924d.a();
                    } else {
                        d b9 = d.b(d.a(c.this.f19926f));
                        b9.p(str);
                        c.this.a(b9, z3, str);
                    }
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.b.b f19921F = new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.mbbanner.a.d.c.3
        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            c.n(c.this);
            h.a();
            com.anythink.core.express.d.a.a(webView);
            c.r(c.this);
            if (c.this.f19926f == null || c.this.f19926f.t()) {
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

    public c(TemplateBannerView templateBannerView, com.anythink.expressad.mbbanner.a.c.c cVar, String str, String str2, boolean z3, com.anythink.expressad.f.c cVar2) {
        this.f19925e = z3;
        this.f19927g = templateBannerView;
        this.f19938s = str2;
        this.f19939t = str;
        this.f19924d = new e(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f19927g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
            this.f19927g.removeView(this.i);
        }
        if (this.f19928h == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f19928h = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    c.this.f19917B = motionEvent.getRawX();
                    c.this.f19918C = motionEvent.getRawY();
                    float unused = c.this.f19917B;
                    float unused2 = c.this.f19918C;
                    return false;
                }
            });
            this.f19928h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.this.a(com.anythink.expressad.mbbanner.a.e.b.a(CommonJSBridgeImpUtils.buildClickJsonObject(c.this.f19917B, c.this.f19918C), c.this.f19926f), false, "");
                }
            });
        }
        String bm = this.f19926f.bm();
        if (TextUtils.isEmpty(bm)) {
            a(com.anythink.expressad.mbbanner.a.a.f19817h);
        } else {
            f.l().a(bm, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.mbbanner.a.d.c.11
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str) {
                    if (c.this.f19928h != null) {
                        c.this.f19928h.setImageBitmap(bitmap);
                    }
                    c.n(c.this);
                    c.o(c.this);
                    c.this.j();
                    c.this.k();
                    if (c.this.f19937r) {
                        return;
                    }
                    c.this.f();
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str, String str2) {
                    c.this.a(com.anythink.expressad.mbbanner.a.a.f19818j);
                }
            });
        }
    }

    private static void m() {
    }

    public static /* synthetic */ boolean n(c cVar) {
        cVar.f19933n = true;
        return true;
    }

    private static /* synthetic */ void o() {
    }

    public static /* synthetic */ boolean r(c cVar) {
        cVar.f19935p = true;
        return true;
    }

    private boolean b() {
        String a9 = a(this.f19926f);
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        if (this.f19927g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return true;
        }
        if (this.i == null) {
            try {
                ATBannerWebView aTBannerWebView = new ATBannerWebView(t.b().g());
                this.i = aTBannerWebView;
                aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.i.setWebViewClient(new com.anythink.expressad.mbbanner.view.a(this.f19938s, this.f19940u, this.f19920E));
            } catch (Throwable unused) {
                return false;
            }
        }
        ImageView imageView = this.f19928h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.i.getVisibility() != 0) {
            this.i.setVisibility(0);
        }
        if (this.i.getParent() == null) {
            this.f19927g.addView(this.i);
            d(this.f19926f.I());
        }
        if (this.f19926f.I()) {
            k();
        }
        j();
        com.anythink.expressad.mbbanner.a.a.c cVar = new com.anythink.expressad.mbbanner.a.a.c(this.f19927g.getContext(), this.f19939t, this.f19938s);
        this.f19944y = cVar;
        cVar.a(this.f19940u);
        this.f19944y.a(this.f19920E);
        this.f19944y.a(this.f19942w);
        this.i.setWebViewListener(this.f19921F);
        this.i.setObject(this.f19944y);
        if (a9.startsWith("file")) {
            this.i.loadUrl(a9);
        } else {
            this.i.loadDataWithBaseURL(this.f19926f.p(), a9, "text/html", com.anythink.expressad.foundation.g.a.bR, null);
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
                        String str = c.this.f19941v == 2 ? "false" : "true";
                        c.this.i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                    }
                } catch (Throwable unused2) {
                }
            }
        }, 1000L);
        return true;
    }

    private void d() {
        if (this.f19925e && this.f19929j == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f19929j = imageView;
            imageView.setBackgroundResource(k.a(t.b().g(), "anythink_banner_close", k.f19632c));
            this.f19929j.setVisibility(8);
            this.f19929j.setContentDescription("closeButton");
        }
    }

    private boolean e() {
        if (this.f19927g == null) {
            return false;
        }
        d dVar = this.f19926f;
        return (aa.a(this.f19927g, dVar != null ? dVar.aL() : 0) || this.f19936q) ? false : true;
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
        boolean z3;
        TemplateBannerView templateBannerView;
        if (this.f19933n && !this.f19934o && this.f19924d != null) {
            this.f19934o = true;
            this.f19945z.removeCallbacks(this.f19916A);
            d dVar = this.f19926f;
            if (dVar != null && !dVar.ao()) {
                this.f19926f.ap();
                this.f19924d.a(this.f19940u);
            }
        }
        if (!this.f19933n || !this.f19931l || !this.f19932m || !this.f19934o || this.f19926f == null || g()) {
            return;
        }
        if (this.f19927g != null) {
            d dVar2 = this.f19926f;
            if (!aa.a(this.f19927g, dVar2 != null ? dVar2.aL() : 0) && !this.f19936q) {
                z3 = true;
                if (!z3 && (templateBannerView = this.f19927g) != null) {
                    templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f();
                        }
                    }, 1000L);
                }
                if (this.f19935p && z3) {
                    int[] iArr = new int[2];
                    this.f19927g.getLocationInWindow(iArr);
                    ATBannerWebView aTBannerWebView = this.i;
                    float f3 = iArr[0];
                    float f9 = iArr[1];
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", f3);
                        jSONObject.put("startY", f9);
                        jSONObject.put("scale", v.c(t.b().g()));
                        String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) aTBannerWebView, "webviewshow", encodeToString);
                    } catch (Throwable unused) {
                    }
                    ATBannerWebView aTBannerWebView2 = this.i;
                    int i = iArr[0];
                    int i6 = iArr[1];
                    int width = this.f19927g.getWidth();
                    int height = this.f19927g.getHeight();
                    try {
                        int i9 = t.b().g().getResources().getConfiguration().orientation;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("orientation", i9 != 2 ? "landscape" : i9 == 1 ? "portrait" : "undefined");
                        jSONObject2.put("locked", "true");
                        float f10 = n.f(t.b().g());
                        float g4 = n.g(t.b().g());
                        HashMap h9 = n.h(t.b().g());
                        int intValue = ((Integer) h9.get("width")).intValue();
                        int intValue2 = ((Integer) h9.get("height")).intValue();
                        HashMap hashMap = new HashMap();
                        hashMap.put(com.anythink.core.express.b.a.f17525a, com.anythink.core.express.b.a.f17534k);
                        hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
                        hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
                        hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject2);
                        com.anythink.core.express.b.a.a();
                        float f11 = i;
                        float f12 = i6;
                        float f13 = width;
                        float f14 = height;
                        com.anythink.core.express.b.a.a(aTBannerWebView2, f11, f12, f13, f14);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.b(aTBannerWebView2, f11, f12, f13, f14);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.b(aTBannerWebView2, f10, g4);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.c(aTBannerWebView2, intValue, intValue2);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.a(aTBannerWebView2, hashMap);
                        com.anythink.core.express.b.a.a();
                        com.anythink.core.express.b.a.a(aTBannerWebView2);
                    } catch (Throwable unused2) {
                    }
                    this.f19935p = false;
                    if (!TextUtils.isEmpty(this.f19926f.bm())) {
                        f.l().c(this.f19926f.bm());
                    }
                }
                this.f19926f.bh();
                if (z3) {
                    this.f19926f.c(false);
                    return;
                }
                ImageView imageView = this.f19928h;
                if (imageView == null || imageView.getVisibility() != 0) {
                    List<d> list = this.f19940u;
                    if (list != null && list.size() > 0) {
                        boolean z6 = false;
                        int i10 = 0;
                        for (int i11 = 0; i11 < this.f19940u.size(); i11++) {
                            if (!this.f19940u.get(i11).t() && (i11 == 0 || !this.f19940u.get(i11).W())) {
                                c(this.f19940u.get(i11), t.b().g(), this.f19938s);
                                this.f19940u.get(i11).c(true);
                                com.anythink.expressad.foundation.g.a.f.a(this.f19938s, this.f19940u.get(i11), com.anythink.expressad.foundation.g.a.f.f19123e);
                                i10 = i11;
                                z6 = true;
                            }
                        }
                        if (z6) {
                            b(this.f19940u.get(i10), t.b().g(), this.f19938s);
                            a(this.f19940u.get(i10), t.b().g(), this.f19938s);
                        }
                    }
                } else {
                    d dVar3 = this.f19926f;
                    if (dVar3 != null) {
                        if (dVar3 != null) {
                            c(dVar3, t.b().g(), this.f19938s);
                            b(dVar3, t.b().g(), this.f19938s);
                            a(dVar3, t.b().g(), this.f19938s);
                        }
                        this.f19926f.c(true);
                        com.anythink.expressad.foundation.g.a.f.a(this.f19938s, this.f19926f, com.anythink.expressad.foundation.g.a.f.f19123e);
                    }
                }
                this.f19937r = true;
                com.anythink.expressad.mbbanner.a.c.c cVar = this.f19924d;
                if (cVar != null) {
                    cVar.a(this.f19926f, false);
                }
                this.f19945z.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
        }
        z3 = false;
        if (!z3) {
            templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f();
                }
            }, 1000L);
        }
        if (this.f19935p) {
            int[] iArr2 = new int[2];
            this.f19927g.getLocationInWindow(iArr2);
            ATBannerWebView aTBannerWebView3 = this.i;
            float f32 = iArr2[0];
            float f92 = iArr2[1];
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("startX", f32);
            jSONObject3.put("startY", f92);
            jSONObject3.put("scale", v.c(t.b().g()));
            String encodeToString2 = Base64.encodeToString(jSONObject3.toString().getBytes(), 2);
            h.a();
            com.anythink.core.express.d.a.a((WebView) aTBannerWebView3, "webviewshow", encodeToString2);
            ATBannerWebView aTBannerWebView22 = this.i;
            int i12 = iArr2[0];
            int i62 = iArr2[1];
            int width2 = this.f19927g.getWidth();
            int height2 = this.f19927g.getHeight();
            int i92 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("orientation", i92 != 2 ? "landscape" : i92 == 1 ? "portrait" : "undefined");
            jSONObject22.put("locked", "true");
            float f102 = n.f(t.b().g());
            float g42 = n.g(t.b().g());
            HashMap h92 = n.h(t.b().g());
            int intValue3 = ((Integer) h92.get("width")).intValue();
            int intValue22 = ((Integer) h92.get("height")).intValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.anythink.core.express.b.a.f17525a, com.anythink.core.express.b.a.f17534k);
            hashMap2.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
            hashMap2.put(com.anythink.core.express.b.a.f17527c, "true");
            hashMap2.put(com.anythink.core.express.b.a.f17528d, jSONObject22);
            com.anythink.core.express.b.a.a();
            float f112 = i12;
            float f122 = i62;
            float f132 = width2;
            float f142 = height2;
            com.anythink.core.express.b.a.a(aTBannerWebView22, f112, f122, f132, f142);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(aTBannerWebView22, f112, f122, f132, f142);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(aTBannerWebView22, f102, g42);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(aTBannerWebView22, intValue3, intValue22);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView22, hashMap2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView22);
            this.f19935p = false;
            if (!TextUtils.isEmpty(this.f19926f.bm())) {
            }
        }
        this.f19926f.bh();
        if (z3) {
        }
    }

    private synchronized boolean g() {
        boolean W8;
        W8 = this.f19926f.W();
        if (!W8) {
            this.f19926f.c(true);
        }
        return W8;
    }

    private void h() {
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f19924d;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void i() {
        if (this.f19928h != null) {
            ATBannerWebView aTBannerWebView = this.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f19928h.getVisibility() != 0) {
                this.f19928h.setVisibility(0);
            }
            if (this.f19927g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f19928h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f19928h.getParent() == null) {
                    this.f19927g.addView(this.f19928h, layoutParams);
                }
                d(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ImageView imageView;
        if (!this.f19925e || (imageView = this.f19929j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f19929j.setVisibility(0);
            this.f19929j.setOnClickListener(this.f19919D);
        }
        if (this.f19929j.getParent() != null || this.f19927g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f.e(12.0f), f.e(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f19927g.addView(this.f19929j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f19927g == null) {
            return;
        }
        d dVar = this.f19926f;
        if (dVar == null || dVar.a() == 1) {
            ATAdChoice aTAdChoice = new ATAdChoice(t.b().g());
            aTAdChoice.setCampaign(this.f19926f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f.e(6.0f), f.e(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f19927g.addView(aTAdChoice, layoutParams);
        }
    }

    private void l() {
        ImageView imageView;
        if (this.f19925e && (imageView = this.f19929j) != null && imageView.getVisibility() == 0) {
            this.f19929j.setVisibility(8);
            this.f19929j.setOnClickListener(null);
            if (this.f19927g == null || this.f19929j.getParent() == null) {
                return;
            }
            this.f19927g.removeView(this.f19929j);
        }
    }

    private int n() {
        return this.f19941v;
    }

    public static /* synthetic */ void o(c cVar) {
        if (cVar.f19928h != null) {
            ATBannerWebView aTBannerWebView = cVar.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (cVar.f19928h.getVisibility() != 0) {
                cVar.f19928h.setVisibility(0);
            }
            if (cVar.f19927g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f19928h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f19928h.getParent() == null) {
                    cVar.f19927g.addView(cVar.f19928h, layoutParams);
                }
                cVar.d(true);
            }
        }
    }

    public final void a(i iVar) {
        this.f19923b = iVar;
    }

    public final void a(boolean z3, int i) {
        this.f19942w = i;
        if (i == 0) {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f19938s);
            if (c9 == null) {
                return;
            } else {
                z3 = c9.d() == 1;
            }
        }
        this.f19925e = z3;
    }

    private void d(boolean z3) {
        if (this.f19927g != null) {
            View b9 = com.anythink.expressad.foundation.f.b.a().b(this.f19938s);
            if (com.anythink.expressad.foundation.f.b.a().b() && z3 && b9 != null) {
                ViewGroup viewGroup = (ViewGroup) b9.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b9);
                }
                b9.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19047a, com.anythink.expressad.foundation.f.b.f19048b);
                }
                layoutParams.addRule(12);
                b9.setLayoutParams(layoutParams);
                this.f19927g.addView(b9);
            }
            com.anythink.expressad.foundation.f.b.a().a(this.f19938s, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.4
                @Override // com.anythink.expressad.foundation.f.a
                public final void a() {
                    String str;
                    c.this.f19927g.onPause();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18040b, f.n(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void b() {
                    String str;
                    c.this.f19927g.onResume();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18040b, f.n(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void c() {
                    String str;
                    c.this.f19927g.onResume();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18040b, f.n(2, str));
                }
            });
            this.f19926f.l(this.f19938s);
            com.anythink.expressad.foundation.f.b.a().a(this.f19938s, this.f19926f);
        }
    }

    public final void a(boolean z3) {
        this.f19925e = z3;
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

    public final void c(boolean z3) {
        this.f19932m = z3;
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
        if (cVar.f19925e && (imageView = cVar.f19929j) != null && imageView.getVisibility() == 0) {
            cVar.f19929j.setVisibility(8);
            cVar.f19929j.setOnClickListener(null);
            if (cVar.f19927g == null || cVar.f19929j.getParent() == null) {
                return;
            }
            cVar.f19927g.removeView(cVar.f19929j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f19926f == null || g()) {
            return;
        }
        this.f19945z.removeCallbacks(this.f19916A);
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f19924d;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public final void a() {
        if (this.f19924d != null) {
            this.f19924d = null;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.f19921F != null) {
            this.f19921F = null;
        }
        ImageView imageView = this.f19929j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f19928h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.f19927g;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.i;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        com.anythink.expressad.mbbanner.a.a.c cVar = this.f19944y;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f19920E != null) {
            this.f19920E = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f19938s);
    }

    public final void b(boolean z3) {
        this.f19931l = z3;
        f();
    }

    private void b(d dVar) {
        if (dVar != null) {
            c(dVar, t.b().g(), this.f19938s);
            b(dVar, t.b().g(), this.f19938s);
            a(dVar, t.b().g(), this.f19938s);
        }
    }

    private static void b(d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18157j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private d b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null) {
            return null;
        }
        ArrayList<d> arrayList = eVar.f18680K;
        this.f19940u = arrayList;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return this.f19940u.get(0);
    }

    public static /* synthetic */ void b(c cVar) {
        com.anythink.expressad.mbbanner.a.c.c cVar2 = cVar.f19924d;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    private static void a(d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> d2 = dVar.d();
                if (d2 == null || d2.size() <= 0) {
                    return;
                }
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(context, dVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public final void a(d dVar, boolean z3, String str) {
        if (this.f19937r) {
            if (this.f19922a == null) {
                this.f19922a = new com.anythink.expressad.b.a(t.b().g(), this.f19938s);
            }
            this.f19922a.a(new q.e() { // from class: com.anythink.expressad.mbbanner.a.d.c.2
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
                    TemplateBannerView unused = c.this.f19927g;
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
                    TemplateBannerView unused = c.this.f19927g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.c
                public final void b(com.anythink.expressad.out.k kVar, String str2) {
                    if (kVar == null) {
                        return;
                    }
                    TemplateBannerView unused = c.this.f19927g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.e
                public final void a() {
                    if (c.this.f19924d != null) {
                        c.this.f19924d.a();
                    }
                }
            });
            dVar.l(this.f19938s);
            if (!this.f19926f.X()) {
                this.f19926f.Y();
            }
            com.anythink.expressad.mbbanner.a.c.c cVar = this.f19924d;
            if (cVar != null) {
                cVar.a(dVar);
            }
            if (z3) {
                TextUtils.isEmpty(str);
            }
        }
    }

    public final void a(int i, int i6, int i9, int i10) {
        if (i == i9 && i6 == i10) {
            return;
        }
        ATBannerWebView aTBannerWebView = this.i;
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(aTBannerWebView, i, i6);
        } catch (Throwable unused) {
        }
    }

    private void a(int i) {
        this.f19941v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        d dVar;
        if (eVar != null) {
            ArrayList<d> arrayList = eVar.f18680K;
            this.f19940u = arrayList;
            if (arrayList != null && arrayList.size() > 0) {
                dVar = this.f19940u.get(0);
                this.f19926f = dVar;
                if (dVar != null) {
                    a(com.anythink.expressad.mbbanner.a.a.f19817h);
                    return;
                }
                this.f19945z.removeCallbacks(this.f19916A);
                if (this.f19925e && this.f19929j == null) {
                    ImageView imageView = new ImageView(t.b().g());
                    this.f19929j = imageView;
                    imageView.setBackgroundResource(k.a(t.b().g(), "anythink_banner_close", k.f19632c));
                    this.f19929j.setVisibility(8);
                    this.f19929j.setContentDescription("closeButton");
                }
                this.f19933n = false;
                this.f19934o = false;
                this.f19937r = false;
                if (TextUtils.isEmpty(this.f19926f.q())) {
                    TextUtils.isEmpty(this.f19926f.p());
                }
                this.f19945z.postDelayed(this.f19916A, 15000L);
                if (b()) {
                    return;
                }
                if (TextUtils.isEmpty(this.f19926f.q())) {
                    TextUtils.isEmpty(this.f19926f.p());
                }
                c();
                return;
            }
        }
        dVar = null;
        this.f19926f = dVar;
        if (dVar != null) {
        }
    }
}
