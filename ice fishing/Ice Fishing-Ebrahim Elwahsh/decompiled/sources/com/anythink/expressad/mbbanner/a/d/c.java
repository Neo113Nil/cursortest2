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
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
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
    private static final String f20073c = "BannerShowManager";

    /* renamed from: B, reason: collision with root package name */
    private float f20075B;

    /* renamed from: C, reason: collision with root package name */
    private float f20076C;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.b.a f20080a;

    /* renamed from: b, reason: collision with root package name */
    i f20081b;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f20082d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20083e;

    /* renamed from: f, reason: collision with root package name */
    private d f20084f;

    /* renamed from: g, reason: collision with root package name */
    private final TemplateBannerView f20085g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f20086h;
    private ATBannerWebView i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f20087j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f20088k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20089l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20090m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20091n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20092o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20093p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20094q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20095r;

    /* renamed from: s, reason: collision with root package name */
    private final String f20096s;

    /* renamed from: t, reason: collision with root package name */
    private final String f20097t;

    /* renamed from: u, reason: collision with root package name */
    private List<d> f20098u;

    /* renamed from: w, reason: collision with root package name */
    private int f20100w;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.a.c f20102y;

    /* renamed from: v, reason: collision with root package name */
    private int f20099v = 1;

    /* renamed from: x, reason: collision with root package name */
    private final long f20101x = 15000;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f20103z = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.mbbanner.a.d.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.expressad.foundation.g.h.a f20074A = new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.5
        @Override // com.anythink.expressad.foundation.g.h.a
        public final void a() {
            c.this.a(com.anythink.expressad.mbbanner.a.a.f19980n);
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void c() {
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private final View.OnClickListener f20077D = new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f20095r) {
                c.b(c.this);
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f20078E = new com.anythink.expressad.mbbanner.a.c.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.7
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
        public final void a(boolean z8) {
            if (c.this.f20082d != null) {
                c.this.f20094q = z8;
                if (z8) {
                    c.this.f20082d.b();
                } else {
                    c.this.f20082d.c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.a
        public final void a(boolean z8, String str) {
            try {
                if (c.this.f20082d != null) {
                    if (TextUtils.isEmpty(str)) {
                        c.this.f20082d.a(c.this.f20084f);
                        c.this.f20082d.a();
                    } else {
                        d b9 = d.b(d.a(c.this.f20084f));
                        b9.p(str);
                        c.this.a(b9, z8, str);
                    }
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.b.b f20079F = new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.mbbanner.a.d.c.3
        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            c.n(c.this);
            h.a();
            com.anythink.core.express.d.a.a(webView);
            c.r(c.this);
            if (c.this.f20084f == null || c.this.f20084f.t()) {
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

    public c(TemplateBannerView templateBannerView, com.anythink.expressad.mbbanner.a.c.c cVar, String str, String str2, boolean z8, com.anythink.expressad.f.c cVar2) {
        this.f20083e = z8;
        this.f20085g = templateBannerView;
        this.f20096s = str2;
        this.f20097t = str;
        this.f20082d = new e(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f20085g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
            this.f20085g.removeView(this.i);
        }
        if (this.f20086h == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f20086h = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    c.this.f20075B = motionEvent.getRawX();
                    c.this.f20076C = motionEvent.getRawY();
                    float unused = c.this.f20075B;
                    float unused2 = c.this.f20076C;
                    return false;
                }
            });
            this.f20086h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.this.a(com.anythink.expressad.mbbanner.a.e.b.a(CommonJSBridgeImpUtils.buildClickJsonObject(c.this.f20075B, c.this.f20076C), c.this.f20084f), false, "");
                }
            });
        }
        String bm = this.f20084f.bm();
        if (TextUtils.isEmpty(bm)) {
            a(com.anythink.expressad.mbbanner.a.a.f19975h);
        } else {
            com.anythink.basead.b.c.i.m().a(bm, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.mbbanner.a.d.c.11
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str) {
                    if (c.this.f20086h != null) {
                        c.this.f20086h.setImageBitmap(bitmap);
                    }
                    c.n(c.this);
                    c.o(c.this);
                    c.this.j();
                    c.this.k();
                    if (c.this.f20095r) {
                        return;
                    }
                    c.this.f();
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str, String str2) {
                    c.this.a(com.anythink.expressad.mbbanner.a.a.f19976j);
                }
            });
        }
    }

    private static void m() {
    }

    public static /* synthetic */ boolean n(c cVar) {
        cVar.f20091n = true;
        return true;
    }

    private static /* synthetic */ void o() {
    }

    public static /* synthetic */ boolean r(c cVar) {
        cVar.f20093p = true;
        return true;
    }

    private boolean b() {
        String a9 = a(this.f20084f);
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        if (this.f20085g == null) {
            a(com.anythink.expressad.mbbanner.a.a.i);
            return true;
        }
        if (this.i == null) {
            try {
                ATBannerWebView aTBannerWebView = new ATBannerWebView(t.b().g());
                this.i = aTBannerWebView;
                aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.i.setWebViewClient(new com.anythink.expressad.mbbanner.view.a(this.f20096s, this.f20098u, this.f20078E));
            } catch (Throwable unused) {
                return false;
            }
        }
        ImageView imageView = this.f20086h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.i.getVisibility() != 0) {
            this.i.setVisibility(0);
        }
        if (this.i.getParent() == null) {
            this.f20085g.addView(this.i);
            d(this.f20084f.I());
        }
        if (this.f20084f.I()) {
            k();
        }
        j();
        com.anythink.expressad.mbbanner.a.a.c cVar = new com.anythink.expressad.mbbanner.a.a.c(this.f20085g.getContext(), this.f20097t, this.f20096s);
        this.f20102y = cVar;
        cVar.a(this.f20098u);
        this.f20102y.a(this.f20078E);
        this.f20102y.a(this.f20100w);
        this.i.setWebViewListener(this.f20079F);
        this.i.setObject(this.f20102y);
        if (a9.startsWith("file")) {
            this.i.loadUrl(a9);
        } else {
            this.i.loadDataWithBaseURL(this.f20084f.p(), a9, "text/html", com.anythink.expressad.foundation.g.a.bR, null);
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
                        String str = c.this.f20099v == 2 ? "false" : "true";
                        c.this.i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                    }
                } catch (Throwable unused2) {
                }
            }
        }, 1000L);
        return true;
    }

    private void d() {
        if (this.f20083e && this.f20087j == null) {
            ImageView imageView = new ImageView(t.b().g());
            this.f20087j = imageView;
            imageView.setBackgroundResource(k.a(t.b().g(), "anythink_banner_close", k.f19790c));
            this.f20087j.setVisibility(8);
            this.f20087j.setContentDescription("closeButton");
        }
    }

    private boolean e() {
        if (this.f20085g == null) {
            return false;
        }
        d dVar = this.f20084f;
        return (aa.a(this.f20085g, dVar != null ? dVar.aL() : 0) || this.f20094q) ? false : true;
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
        boolean z8;
        TemplateBannerView templateBannerView;
        if (this.f20091n && !this.f20092o && this.f20082d != null) {
            this.f20092o = true;
            this.f20103z.removeCallbacks(this.f20074A);
            d dVar = this.f20084f;
            if (dVar != null && !dVar.ao()) {
                this.f20084f.ap();
                this.f20082d.a(this.f20098u);
            }
        }
        if (!this.f20091n || !this.f20089l || !this.f20090m || !this.f20092o || this.f20084f == null || g()) {
            return;
        }
        if (this.f20085g != null) {
            d dVar2 = this.f20084f;
            if (!aa.a(this.f20085g, dVar2 != null ? dVar2.aL() : 0) && !this.f20094q) {
                z8 = true;
                if (!z8 && (templateBannerView = this.f20085g) != null) {
                    templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f();
                        }
                    }, 1000L);
                }
                if (this.f20093p && z8) {
                    int[] iArr = new int[2];
                    this.f20085g.getLocationInWindow(iArr);
                    ATBannerWebView aTBannerWebView = this.i;
                    float f6 = iArr[0];
                    float f9 = iArr[1];
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", f6);
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
                    int width = this.f20085g.getWidth();
                    int height = this.f20085g.getHeight();
                    try {
                        int i9 = t.b().g().getResources().getConfiguration().orientation;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("orientation", i9 != 2 ? "landscape" : i9 == 1 ? "portrait" : "undefined");
                        jSONObject2.put("locked", "true");
                        float f10 = n.f(t.b().g());
                        float g9 = n.g(t.b().g());
                        HashMap h9 = n.h(t.b().g());
                        int intValue = ((Integer) h9.get("width")).intValue();
                        int intValue2 = ((Integer) h9.get("height")).intValue();
                        HashMap hashMap = new HashMap();
                        hashMap.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
                        hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
                        hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
                        hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject2);
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
                    this.f20093p = false;
                    if (!TextUtils.isEmpty(this.f20084f.bm())) {
                        com.anythink.basead.b.c.i.m().c(this.f20084f.bm());
                    }
                }
                this.f20084f.bh();
                if (z8) {
                    this.f20084f.c(false);
                    return;
                }
                ImageView imageView = this.f20086h;
                if (imageView == null || imageView.getVisibility() != 0) {
                    List<d> list = this.f20098u;
                    if (list != null && list.size() > 0) {
                        boolean z9 = false;
                        int i10 = 0;
                        for (int i11 = 0; i11 < this.f20098u.size(); i11++) {
                            if (!this.f20098u.get(i11).t() && (i11 == 0 || !this.f20098u.get(i11).W())) {
                                c(this.f20098u.get(i11), t.b().g(), this.f20096s);
                                this.f20098u.get(i11).c(true);
                                f.a(this.f20096s, this.f20098u.get(i11), f.f19281e);
                                i10 = i11;
                                z9 = true;
                            }
                        }
                        if (z9) {
                            b(this.f20098u.get(i10), t.b().g(), this.f20096s);
                            a(this.f20098u.get(i10), t.b().g(), this.f20096s);
                        }
                    }
                } else {
                    d dVar3 = this.f20084f;
                    if (dVar3 != null) {
                        if (dVar3 != null) {
                            c(dVar3, t.b().g(), this.f20096s);
                            b(dVar3, t.b().g(), this.f20096s);
                            a(dVar3, t.b().g(), this.f20096s);
                        }
                        this.f20084f.c(true);
                        f.a(this.f20096s, this.f20084f, f.f19281e);
                    }
                }
                this.f20095r = true;
                com.anythink.expressad.mbbanner.a.c.c cVar = this.f20082d;
                if (cVar != null) {
                    cVar.a(this.f20084f, false);
                }
                this.f20103z.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
        }
        z8 = false;
        if (!z8) {
            templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.12
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f();
                }
            }, 1000L);
        }
        if (this.f20093p) {
            int[] iArr2 = new int[2];
            this.f20085g.getLocationInWindow(iArr2);
            ATBannerWebView aTBannerWebView3 = this.i;
            float f62 = iArr2[0];
            float f92 = iArr2[1];
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("startX", f62);
            jSONObject3.put("startY", f92);
            jSONObject3.put("scale", v.c(t.b().g()));
            String encodeToString2 = Base64.encodeToString(jSONObject3.toString().getBytes(), 2);
            h.a();
            com.anythink.core.express.d.a.a((WebView) aTBannerWebView3, "webviewshow", encodeToString2);
            ATBannerWebView aTBannerWebView22 = this.i;
            int i12 = iArr2[0];
            int i42 = iArr2[1];
            int width2 = this.f20085g.getWidth();
            int height2 = this.f20085g.getHeight();
            int i92 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("orientation", i92 != 2 ? "landscape" : i92 == 1 ? "portrait" : "undefined");
            jSONObject22.put("locked", "true");
            float f102 = n.f(t.b().g());
            float g92 = n.g(t.b().g());
            HashMap h92 = n.h(t.b().g());
            int intValue3 = ((Integer) h92.get("width")).intValue();
            int intValue22 = ((Integer) h92.get("height")).intValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
            hashMap2.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
            hashMap2.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap2.put(com.anythink.core.express.b.a.f17686d, jSONObject22);
            com.anythink.core.express.b.a.a();
            float f112 = i12;
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
            this.f20093p = false;
            if (!TextUtils.isEmpty(this.f20084f.bm())) {
            }
        }
        this.f20084f.bh();
        if (z8) {
        }
    }

    private synchronized boolean g() {
        boolean W8;
        W8 = this.f20084f.W();
        if (!W8) {
            this.f20084f.c(true);
        }
        return W8;
    }

    private void h() {
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f20082d;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void i() {
        if (this.f20086h != null) {
            ATBannerWebView aTBannerWebView = this.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f20086h.getVisibility() != 0) {
                this.f20086h.setVisibility(0);
            }
            if (this.f20085g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f20086h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f20086h.getParent() == null) {
                    this.f20085g.addView(this.f20086h, layoutParams);
                }
                d(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ImageView imageView;
        if (!this.f20083e || (imageView = this.f20087j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f20087j.setVisibility(0);
            this.f20087j.setOnClickListener(this.f20077D);
        }
        if (this.f20087j.getParent() != null || this.f20085g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.anythink.basead.b.c.i.e(12.0f), com.anythink.basead.b.c.i.e(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f20085g.addView(this.f20087j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f20085g == null) {
            return;
        }
        d dVar = this.f20084f;
        if (dVar == null || dVar.a() == 1) {
            ATAdChoice aTAdChoice = new ATAdChoice(t.b().g());
            aTAdChoice.setCampaign(this.f20084f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.anythink.basead.b.c.i.e(6.0f), com.anythink.basead.b.c.i.e(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f20085g.addView(aTAdChoice, layoutParams);
        }
    }

    private void l() {
        ImageView imageView;
        if (this.f20083e && (imageView = this.f20087j) != null && imageView.getVisibility() == 0) {
            this.f20087j.setVisibility(8);
            this.f20087j.setOnClickListener(null);
            if (this.f20085g == null || this.f20087j.getParent() == null) {
                return;
            }
            this.f20085g.removeView(this.f20087j);
        }
    }

    private int n() {
        return this.f20099v;
    }

    public static /* synthetic */ void o(c cVar) {
        if (cVar.f20086h != null) {
            ATBannerWebView aTBannerWebView = cVar.i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (cVar.f20086h.getVisibility() != 0) {
                cVar.f20086h.setVisibility(0);
            }
            if (cVar.f20085g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f20086h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f20086h.getParent() == null) {
                    cVar.f20085g.addView(cVar.f20086h, layoutParams);
                }
                cVar.d(true);
            }
        }
    }

    public final void a(i iVar) {
        this.f20081b = iVar;
    }

    public final void a(boolean z8, int i) {
        this.f20100w = i;
        if (i == 0) {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20096s);
            if (c4 == null) {
                return;
            } else {
                z8 = c4.d() == 1;
            }
        }
        this.f20083e = z8;
    }

    private void d(boolean z8) {
        if (this.f20085g != null) {
            View b9 = com.anythink.expressad.foundation.f.b.a().b(this.f20096s);
            if (com.anythink.expressad.foundation.f.b.a().b() && z8 && b9 != null) {
                ViewGroup viewGroup = (ViewGroup) b9.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b9);
                }
                b9.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19205a, com.anythink.expressad.foundation.f.b.f19206b);
                }
                layoutParams.addRule(12);
                b9.setLayoutParams(layoutParams);
                this.f20085g.addView(b9);
            }
            com.anythink.expressad.foundation.f.b.a().a(this.f20096s, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.mbbanner.a.d.c.4
                @Override // com.anythink.expressad.foundation.f.a
                public final void a() {
                    String str;
                    c.this.f20085g.onPause();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18198b, com.anythink.basead.b.c.i.n(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void b() {
                    String str;
                    c.this.f20085g.onResume();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18198b, com.anythink.basead.b.c.i.n(2, str));
                }

                @Override // com.anythink.expressad.foundation.f.a
                public final void c() {
                    String str;
                    c.this.f20085g.onResume();
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
                    com.anythink.core.express.d.a.a((WebView) c.this.i, BaseAbsFeedBackForH5.f18198b, com.anythink.basead.b.c.i.n(2, str));
                }
            });
            this.f20084f.l(this.f20096s);
            com.anythink.expressad.foundation.f.b.a().a(this.f20096s, this.f20084f);
        }
    }

    public final void a(boolean z8) {
        this.f20083e = z8;
    }

    private static String a(d dVar) {
        if (dVar == null) {
            return "";
        }
        String c4 = j.a().c(dVar.p());
        if (TextUtils.isEmpty(c4)) {
            c4 = dVar.q();
            if (dVar.aA()) {
                try {
                    File file = new File(c4);
                    if (!file.exists()) {
                        return "";
                    }
                    return p.a(file);
                } catch (Exception unused) {
                    File file2 = new File(c4);
                    return (file2.exists() && file2.isFile() && file2.canRead()) ? "file:////".concat(String.valueOf(c4)) : c4;
                }
            }
            File file3 = new File(c4);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                return "file:////".concat(String.valueOf(c4));
            }
        }
        return c4;
    }

    public final void c(boolean z8) {
        this.f20090m = z8;
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
        if (cVar.f20083e && (imageView = cVar.f20087j) != null && imageView.getVisibility() == 0) {
            cVar.f20087j.setVisibility(8);
            cVar.f20087j.setOnClickListener(null);
            if (cVar.f20085g == null || cVar.f20087j.getParent() == null) {
                return;
            }
            cVar.f20085g.removeView(cVar.f20087j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f20084f == null || g()) {
            return;
        }
        this.f20103z.removeCallbacks(this.f20074A);
        com.anythink.expressad.mbbanner.a.c.c cVar = this.f20082d;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public final void a() {
        if (this.f20082d != null) {
            this.f20082d = null;
        }
        ATBannerWebView aTBannerWebView = this.i;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.f20079F != null) {
            this.f20079F = null;
        }
        ImageView imageView = this.f20087j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f20086h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.f20085g;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.i;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        com.anythink.expressad.mbbanner.a.a.c cVar = this.f20102y;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f20078E != null) {
            this.f20078E = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f20096s);
    }

    public final void b(boolean z8) {
        this.f20089l = z8;
        f();
    }

    private void b(d dVar) {
        if (dVar != null) {
            c(dVar, t.b().g(), this.f20096s);
            b(dVar, t.b().g(), this.f20096s);
            a(dVar, t.b().g(), this.f20096s);
        }
    }

    private static void b(d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18315j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private d b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null) {
            return null;
        }
        ArrayList<d> arrayList = eVar.f18838K;
        this.f20098u = arrayList;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return this.f20098u.get(0);
    }

    public static /* synthetic */ void b(c cVar) {
        com.anythink.expressad.mbbanner.a.c.c cVar2 = cVar.f20082d;
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

    public final void a(d dVar, boolean z8, String str) {
        if (this.f20095r) {
            if (this.f20080a == null) {
                this.f20080a = new com.anythink.expressad.b.a(t.b().g(), this.f20096s);
            }
            this.f20080a.a(new q.e() { // from class: com.anythink.expressad.mbbanner.a.d.c.2
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
                    TemplateBannerView unused = c.this.f20085g;
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
                    TemplateBannerView unused = c.this.f20085g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.c
                public final void b(com.anythink.expressad.out.k kVar, String str2) {
                    if (kVar == null) {
                        return;
                    }
                    TemplateBannerView unused = c.this.f20085g;
                    u.b();
                }

                @Override // com.anythink.expressad.out.q.e
                public final void a() {
                    if (c.this.f20082d != null) {
                        c.this.f20082d.a();
                    }
                }
            });
            dVar.l(this.f20096s);
            if (!this.f20084f.X()) {
                this.f20084f.Y();
            }
            com.anythink.expressad.mbbanner.a.c.c cVar = this.f20082d;
            if (cVar != null) {
                cVar.a(dVar);
            }
            if (z8) {
                TextUtils.isEmpty(str);
            }
        }
    }

    public final void a(int i, int i4, int i9, int i10) {
        if (i == i9 && i4 == i10) {
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
        this.f20099v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        d dVar;
        if (eVar != null) {
            ArrayList<d> arrayList = eVar.f18838K;
            this.f20098u = arrayList;
            if (arrayList != null && arrayList.size() > 0) {
                dVar = this.f20098u.get(0);
                this.f20084f = dVar;
                if (dVar != null) {
                    a(com.anythink.expressad.mbbanner.a.a.f19975h);
                    return;
                }
                this.f20103z.removeCallbacks(this.f20074A);
                if (this.f20083e && this.f20087j == null) {
                    ImageView imageView = new ImageView(t.b().g());
                    this.f20087j = imageView;
                    imageView.setBackgroundResource(k.a(t.b().g(), "anythink_banner_close", k.f19790c));
                    this.f20087j.setVisibility(8);
                    this.f20087j.setContentDescription("closeButton");
                }
                this.f20091n = false;
                this.f20092o = false;
                this.f20095r = false;
                if (TextUtils.isEmpty(this.f20084f.q())) {
                    TextUtils.isEmpty(this.f20084f.p());
                }
                this.f20103z.postDelayed(this.f20074A, 15000L);
                if (b()) {
                    return;
                }
                if (TextUtils.isEmpty(this.f20084f.q())) {
                    TextUtils.isEmpty(this.f20084f.p());
                }
                c();
                return;
            }
        }
        dVar = null;
        this.f20084f = dVar;
        if (dVar != null) {
        }
    }
}
