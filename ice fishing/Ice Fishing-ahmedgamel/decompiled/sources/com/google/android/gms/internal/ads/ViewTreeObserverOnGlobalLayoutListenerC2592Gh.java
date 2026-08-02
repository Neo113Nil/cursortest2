package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.C4797a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4949p;
import s2.InterfaceC4919a;
import v2.BinderC5100d;
import v2.C5101e;
import v2.InterfaceC5099c;
import w.AbstractC5128c;
import w2.C5141a;
import w2.HandlerC5139A;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2592Gh extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC4084vh {

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ int f25837D0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final DisplayMetrics f25838A;

    /* renamed from: A0, reason: collision with root package name */
    public final WindowManager f25839A0;

    /* renamed from: B, reason: collision with root package name */
    public final float f25840B;

    /* renamed from: B0, reason: collision with root package name */
    public final C3091d9 f25841B0;

    /* renamed from: C, reason: collision with root package name */
    public St f25842C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public Ut f25843D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f25844E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25845F;

    /* renamed from: G, reason: collision with root package name */
    public C2677Lh f25846G;

    /* renamed from: H, reason: collision with root package name */
    public BinderC5100d f25847H;

    /* renamed from: I, reason: collision with root package name */
    public C3232fq f25848I;
    public C3178eq J;

    /* renamed from: K, reason: collision with root package name */
    public A3.r f25849K;

    /* renamed from: L, reason: collision with root package name */
    public final String f25850L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f25851M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f25852N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f25853O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f25854P;

    /* renamed from: Q, reason: collision with root package name */
    public Boolean f25855Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f25856R;

    /* renamed from: S, reason: collision with root package name */
    public final String f25857S;

    /* renamed from: T, reason: collision with root package name */
    public BinderC2626Ih f25858T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f25859U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f25860V;

    /* renamed from: W, reason: collision with root package name */
    public InterfaceC3431jb f25861W;

    /* renamed from: i0, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC3497kn f25862i0;

    /* renamed from: j0, reason: collision with root package name */
    public I8 f25863j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f25864k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f25865l0;
    public C3700oa m0;

    /* renamed from: n, reason: collision with root package name */
    public final C2779Rh f25866n;

    /* renamed from: n0, reason: collision with root package name */
    public final C3700oa f25867n0;

    /* renamed from: o0, reason: collision with root package name */
    public C3700oa f25868o0;

    /* renamed from: p0, reason: collision with root package name */
    public final S0.l f25869p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f25870q0;

    /* renamed from: r0, reason: collision with root package name */
    public BinderC5100d f25871r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f25872s0;

    /* renamed from: t0, reason: collision with root package name */
    public final f8.j f25873t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3464k7 f25874u;

    /* renamed from: u0, reason: collision with root package name */
    public int f25875u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3236fu f25876v;

    /* renamed from: v0, reason: collision with root package name */
    public int f25877v0;

    /* renamed from: w, reason: collision with root package name */
    public final C2483Aa f25878w;

    /* renamed from: w0, reason: collision with root package name */
    public int f25879w0;

    /* renamed from: x, reason: collision with root package name */
    public final C5189a f25880x;

    /* renamed from: x0, reason: collision with root package name */
    public int f25881x0;

    /* renamed from: y, reason: collision with root package name */
    public C3717or f25882y;

    /* renamed from: y0, reason: collision with root package name */
    public int f25883y0;

    /* renamed from: z, reason: collision with root package name */
    public final C4797a f25884z;

    /* renamed from: z0, reason: collision with root package name */
    public HashMap f25885z0;

    public ViewTreeObserverOnGlobalLayoutListenerC2592Gh(C2779Rh c2779Rh, A3.r rVar, String str, boolean z6, C3464k7 c3464k7, C2483Aa c2483Aa, C5189a c5189a, C3717or c3717or, C4797a c4797a, C3091d9 c3091d9, St st, Ut ut, C3236fu c3236fu) {
        super(c2779Rh);
        Ut ut2;
        String str2;
        C4323b a9;
        this.f25844E = false;
        this.f25845F = false;
        this.f25856R = true;
        this.f25857S = "";
        this.f25875u0 = -1;
        this.f25877v0 = -1;
        this.f25879w0 = -1;
        this.f25881x0 = -1;
        this.f25883y0 = -1;
        this.f25866n = c2779Rh;
        this.f25849K = rVar;
        this.f25850L = str;
        this.f25853O = z6;
        this.f25874u = c3464k7;
        this.f25876v = c3236fu;
        this.f25878w = c2483Aa;
        this.f25880x = c5189a;
        this.f25882y = c3717or;
        this.f25884z = c4797a;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f25839A0 = windowManager;
        w2.D d9 = C4906k.f40186C.f40191c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f25838A = displayMetrics;
        this.f25840B = displayMetrics.density;
        this.f25841B0 = c3091d9;
        this.f25842C = st;
        this.f25843D = ut;
        this.f25873t0 = new f8.j(c2779Rh.f28000a, this, this);
        this.C0 = false;
        setBackgroundColor(0);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ad)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to enable Javascript.", e9);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C3324ha c3324ha = AbstractC3592ma.Zc;
        s2.r rVar2 = s2.r.f40506e;
        if (((Boolean) rVar2.f40509c.a(c3324ha)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.Me)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        C4906k c4906k = C4906k.f40186C;
        settings.setUserAgentString(c4906k.f40191c.E(c2779Rh, c5189a.f41845n));
        Context context = getContext();
        A8.b.y(context, new E2.w(17, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        E();
        addJavascriptInterface(new C2643Jh(this, new Ux(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        S0.l lVar = this.f25869p0;
        if (lVar != null && (a9 = c4906k.f40196h.a()) != null) {
            ((ArrayBlockingQueue) a9.f36417a).offer((C3808qa) lVar.f2927v);
        }
        C3808qa c3808qa = new C3808qa(this.f25850L);
        S0.l lVar2 = new S0.l(c3808qa);
        this.f25869p0 = lVar2;
        synchronized (c3808qa.f34027c) {
        }
        if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() && (ut2 = this.f25843D) != null && (str2 = ut2.f28801b) != null) {
            c3808qa.c("gqi", str2);
        }
        C3700oa d10 = C3808qa.d();
        this.f25867n0 = d10;
        ((HashMap) lVar2.f2926u).put("native:view_create", d10);
        Context context2 = null;
        this.f25868o0 = null;
        this.m0 = null;
        if (F2.b.f976v == null) {
            F2.b.f976v = new F2.b(4);
        }
        F2.b bVar = F2.b.f976v;
        bVar.getClass();
        w2.z.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c2779Rh);
        if (!defaultUserAgent.equals(bVar.f978u)) {
            AtomicBoolean atomicBoolean = O2.h.f2271a;
            try {
                context2 = c2779Rh.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                c2779Rh.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c2779Rh)).apply();
            }
            bVar.f978u = defaultUserAgent;
        }
        w2.z.k("User agent is updated.");
        c4906k.f40196h.f30311k.incrementAndGet();
    }

    public final /* synthetic */ void A() {
        super.loadUrl(com.anythink.core.common.res.d.f17002a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void A0() {
        w2.z.k("Cannot add text view to inner AdWebView");
    }

    public final synchronized void B() {
        try {
            w2.D.f41627l.post(new RunnableC2558Eh(this, 3));
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("AdWebViewImpl.loadUrlUnsafe", th);
            int i = w2.z.f41712b;
            x2.i.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void B0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (n0()) {
                    int i = w2.z.f41712b;
                    x2.i.f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33196y0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put(com.anythink.expressad.foundation.g.a.i, str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e9) {
                    int i4 = w2.z.f41712b;
                    x2.i.g("Unable to build MRAID_ENV", e9);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, AbstractC2711Nh.a(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C5189a C() {
        return this.f25880x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized C3232fq C0() {
        return this.f25848I;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void D() {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            c2677Lh.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void D0(Context context) {
        C2779Rh c2779Rh = this.f25866n;
        c2779Rh.setBaseContext(context);
        this.f25873t0.f37522f = c2779Rh.f28000a;
    }

    public final synchronized void E() {
        try {
            St st = this.f25842C;
            if (st != null && st.m0) {
                int i = w2.z.f41712b;
                x2.i.a("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f25854P) {
                            setLayerType(1, null);
                        }
                        this.f25854P = true;
                    } finally {
                    }
                }
                return;
            }
            if (!this.f25853O && !this.f25849K.b()) {
                int i4 = w2.z.f41712b;
                x2.i.a("Enabling hardware acceleration on an AdView.");
                synchronized (this) {
                    try {
                        if (this.f25854P) {
                            setLayerType(0, null);
                        }
                        this.f25854P = false;
                    } finally {
                    }
                }
                return;
            }
            int i6 = w2.z.f41712b;
            x2.i.a("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                try {
                    if (this.f25854P) {
                        setLayerType(0, null);
                    }
                    this.f25854P = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized BinderC5100d E0() {
        return this.f25871r0;
    }

    public final synchronized void F() {
        if (this.f25872s0) {
            return;
        }
        this.f25872s0 = true;
        C4906k.f40186C.f40196h.f30311k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized C3178eq F0() {
        return this.J;
    }

    public final synchronized void G() {
        try {
            HashMap hashMap = this.f25885z0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC2862Wg) it.next()).a();
                }
            }
            this.f25885z0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized boolean G0() {
        return this.f25853O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final int H() {
        return getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void H0(int i, boolean z6, boolean z9) {
        InterfaceC4919a interfaceC4919a;
        InterfaceC2579Fl interfaceC2579Fl;
        BinderC2903Yp binderC2903Yp;
        int i4;
        InterfaceC4919a interfaceC4919a2;
        boolean z10;
        C2677Lh c2677Lh = this.f25846G;
        C2575Fh c2575Fh = c2677Lh.f26950n;
        boolean w3 = C2677Lh.w(c2575Fh.f25606n.G0(), c2575Fh);
        boolean z11 = true;
        if (!w3 && z9) {
            z11 = false;
        }
        if (w3) {
            interfaceC4919a = null;
            interfaceC2579Fl = null;
        } else {
            interfaceC4919a = c2677Lh.f26954x;
            interfaceC2579Fl = null;
        }
        v2.l lVar = c2677Lh.f26955y;
        InterfaceC2579Fl interfaceC2579Fl2 = interfaceC2579Fl;
        InterfaceC5099c interfaceC5099c = c2677Lh.f26937N;
        C5189a c5189a = c2575Fh.f25606n.f25880x;
        InterfaceC2579Fl interfaceC2579Fl3 = z11 ? interfaceC2579Fl2 : c2677Lh.f26928D;
        if (C2677Lh.v(c2575Fh)) {
            binderC2903Yp = c2677Lh.f26948Z;
            i4 = i;
            z10 = z6;
            interfaceC4919a2 = interfaceC4919a;
        } else {
            binderC2903Yp = interfaceC2579Fl2;
            i4 = i;
            interfaceC4919a2 = interfaceC4919a;
            z10 = z6;
        }
        c2677Lh.a(new AdOverlayInfoParcel(interfaceC4919a2, lVar, interfaceC5099c, c2575Fh, z10, i4, c5189a, interfaceC2579Fl3, binderC2903Yp));
    }

    public final void I(boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z6 ? "0" : "1");
        d("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void I0(int i) {
        this.f25870q0 = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final St J() {
        return this.f25842C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void J0(boolean z6) {
        BinderC5100d binderC5100d;
        int i = this.f25864k0 + (true != z6 ? -1 : 1);
        this.f25864k0 = i;
        if (i > 0 || (binderC5100d = this.f25847H) == null) {
            return;
        }
        synchronized (binderC5100d.f41104H) {
            try {
                binderC5100d.f41106K = true;
                r3.b bVar = binderC5100d.J;
                if (bVar != null) {
                    HandlerC5139A handlerC5139A = w2.D.f41627l;
                    handlerC5139A.removeCallbacks(bVar);
                    handlerC5139A.post(binderC5100d.J);
                }
            } finally {
            }
        }
    }

    public final synchronized String K() {
        return this.f25857S;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            c2677Lh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void L0(C3178eq c3178eq) {
        this.J = c3178eq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void M0(long j6, boolean z6) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z6 ? "0" : "1");
        hashMap.put("duration", Long.toString(j6));
        d("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void N0(boolean z6, int i, String str, boolean z9, boolean z10) {
        C2677Lh c2677Lh = this.f25846G;
        C2575Fh c2575Fh = c2677Lh.f26950n;
        boolean G02 = c2575Fh.f25606n.G0();
        boolean w3 = C2677Lh.w(G02, c2575Fh);
        boolean z11 = true;
        if (!w3 && z9) {
            z11 = false;
        }
        InterfaceC4919a interfaceC4919a = w3 ? null : c2677Lh.f26954x;
        C4246yh c4246yh = G02 ? null : new C4246yh(c2575Fh, c2677Lh.f26955y);
        InterfaceC2857Wb interfaceC2857Wb = c2677Lh.f26926B;
        BinderC2903Yp binderC2903Yp = null;
        InterfaceC2873Xb interfaceC2873Xb = c2677Lh.f26927C;
        boolean z12 = z11;
        C4246yh c4246yh2 = c4246yh;
        InterfaceC5099c interfaceC5099c = c2677Lh.f26937N;
        C5189a c5189a = c2575Fh.f25606n.f25880x;
        InterfaceC2579Fl interfaceC2579Fl = z12 ? null : c2677Lh.f26928D;
        if (C2677Lh.v(c2575Fh)) {
            binderC2903Yp = c2677Lh.f26948Z;
        }
        c2677Lh.a(new AdOverlayInfoParcel(interfaceC4919a, c4246yh2, interfaceC2857Wb, interfaceC2873Xb, interfaceC5099c, c2575Fh, z6, i, str, c5189a, interfaceC2579Fl, binderC2903Yp, z10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void O0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final ArrayList P() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void P0(C3232fq c3232fq) {
        this.f25848I = c3232fq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Q(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3464k7 Q0() {
        return this.f25874u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized String R() {
        return this.f25850L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void R0(BinderC2626Ih binderC2626Ih) {
        if (this.f25858T == null) {
            this.f25858T = binderC2626Ih;
        } else {
            int i = w2.z.f41712b;
            x2.i.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void S0(String str, InterfaceC3272gc interfaceC3272gc) {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            synchronized (c2677Lh.f26953w) {
                try {
                    List list = (List) c2677Lh.f26952v.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC3272gc);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void T0(int i) {
        C3700oa c3700oa = this.f25867n0;
        S0.l lVar = this.f25869p0;
        if (i == 0) {
            AbstractC2991bG.j((C3808qa) lVar.f2927v, c3700oa, "aebb2");
        }
        AbstractC2991bG.j((C3808qa) lVar.f2927v, c3700oa, "aeh2");
        lVar.getClass();
        ((C3808qa) lVar.f2927v).c("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f25880x.f41845n);
        d("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean U0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final View V() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void V0(InterfaceC3431jb interfaceC3431jb) {
        this.f25861W = interfaceC3431jb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3887s W0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void X0(boolean z6) {
        this.f25846G.f26947X = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Y0(St st, Ut ut) {
        this.f25842C = st;
        this.f25843D = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Z0(String str, InterfaceC3272gc interfaceC3272gc) {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            c2677Lh.b(str, interfaceC3272gc);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void a(String str, JSONObject jSONObject) {
        c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized boolean a1() {
        return this.f25864k0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void b(String str) {
        s(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized InterfaceC3431jb b1() {
        return this.f25861W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void c(String str, String str2) {
        s(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(AbstractC5128c.j(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void c1() {
        this.C0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    public final void d(String str, Map map) {
        try {
            e(str, C4949p.f40498g.f40499a.l(map));
        } catch (JSONException unused) {
            int i = w2.z.f41712b;
            x2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Context d0() {
        return this.f25866n.f28002c;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0074, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:26:0x00a9, B:29:0x00b8, B:32:0x0028, B:34:0x002c, B:39:0x0041, B:40:0x0048, B:41:0x0033, B:43:0x0039, B:44:0x0006, B:46:0x0010), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        C4323b a9;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        try {
            S0.l lVar = this.f25869p0;
            if (lVar != null && (a9 = C4906k.f40186C.f40196h.a()) != null) {
                ((ArrayBlockingQueue) a9.f36417a).offer((C3808qa) lVar.f2927v);
            }
            f8.j jVar = this.f25873t0;
            jVar.f37520d = false;
            Activity activity = (Activity) jVar.f37522f;
            if (activity != null && jVar.f37518b) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) jVar.f37523g);
                    }
                    jVar.f37518b = false;
                }
                viewTreeObserver = null;
                if (viewTreeObserver != null) {
                }
                jVar.f37518b = false;
            }
            BinderC5100d binderC5100d = this.f25847H;
            if (binderC5100d != null) {
                binderC5100d.t();
                this.f25847H.I();
                this.f25847H = null;
            }
            this.f25848I = null;
            this.J = null;
            this.f25846G.d();
            this.f25863j0 = null;
            this.f25882y = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f25852N) {
                return;
            }
            C4906k.f40186C.f40187A.a(this);
            G();
            this.f25852N = true;
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.hc)).booleanValue()) {
                w2.z.k("Destroying the WebView immediately...");
                n();
                return;
            }
            Activity activity2 = this.f25866n.f28000a;
            if (activity2 != null && activity2.isDestroyed()) {
                w2.z.k("Destroying the WebView immediately...");
                n();
            } else {
                w2.z.k("Initiating WebView self destruct sequence in 3...");
                w2.z.k("Loading blank page in WebView, 2...");
                B();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = w2.z.f41712b;
        x2.i.a("Dispatching AFMA event: ".concat(sb2));
        s(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void e1() {
        boolean z6;
        HashMap hashMap = new HashMap(3);
        C4906k c4906k = C4906k.f40186C;
        C5141a c5141a = c4906k.i;
        synchronized (c5141a) {
            z6 = c5141a.f41642a;
        }
        hashMap.put("app_muted", String.valueOf(z6));
        hashMap.put("app_volume", String.valueOf(c4906k.i.a()));
        hashMap.put("device_volume", String.valueOf(C5141a.b(getContext())));
        d("volume", hashMap);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (n0()) {
            int i = w2.z.f41712b;
            x2.i.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ic)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC3436jg.f32060f.a(new RunnableC3888s0(4, this, str, valueCallback));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        boolean z6;
        synchronized (this) {
            z6 = c3896s8.f34667j;
            this.f25859U = z6;
        }
        I(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void f1(A3.r rVar) {
        this.f25849K = rVar;
        requestLayout();
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f25852N) {
                        this.f25846G.d();
                        C4906k.f40186C.f40187A.a(this);
                        G();
                        F();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized BinderC2626Ih g() {
        return this.f25858T;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3236fu g0() {
        return this.f25876v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void g1(boolean z6) {
        try {
            boolean z9 = this.f25853O;
            this.f25853O = z6;
            E();
            if (z6 != z9) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33205z0)).booleanValue()) {
                    if (!this.f25849K.b()) {
                    }
                }
                try {
                    e("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f18313b, true != z6 ? com.anythink.core.express.b.a.f18317f : com.anythink.core.express.b.a.f18318g));
                } catch (JSONException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error occurred while dispatching state change.", e9);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final /* synthetic */ C2677Lh h0() {
        return this.f25846G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void i0(boolean z6, int i, String str, String str2, boolean z9) {
        C2677Lh c2677Lh = this.f25846G;
        C2575Fh c2575Fh = c2677Lh.f26950n;
        boolean G02 = c2575Fh.f25606n.G0();
        boolean w3 = C2677Lh.w(G02, c2575Fh);
        boolean z10 = true;
        if (!w3 && z9) {
            z10 = false;
        }
        InterfaceC4919a interfaceC4919a = w3 ? null : c2677Lh.f26954x;
        C4246yh c4246yh = G02 ? null : new C4246yh(c2575Fh, c2677Lh.f26955y);
        InterfaceC2857Wb interfaceC2857Wb = c2677Lh.f26926B;
        BinderC2903Yp binderC2903Yp = null;
        InterfaceC2873Xb interfaceC2873Xb = c2677Lh.f26927C;
        boolean z11 = z10;
        C4246yh c4246yh2 = c4246yh;
        InterfaceC5099c interfaceC5099c = c2677Lh.f26937N;
        C5189a c5189a = c2575Fh.f25606n.f25880x;
        InterfaceC2579Fl interfaceC2579Fl = z11 ? null : c2677Lh.f26928D;
        if (C2677Lh.v(c2575Fh)) {
            binderC2903Yp = c2677Lh.f26948Z;
        }
        c2677Lh.a(new AdOverlayInfoParcel(interfaceC4919a, c4246yh2, interfaceC2857Wb, interfaceC2873Xb, interfaceC5099c, c2575Fh, z6, i, str, str2, c5189a, interfaceC2579Fl, binderC2903Yp));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void i1(BinderC5100d binderC5100d) {
        this.f25847H = binderC5100d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Activity j() {
        return this.f25866n.f28000a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized A3.r j0() {
        return this.f25849K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void j1(ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn) {
        this.f25862i0 = viewTreeObserverOnGlobalLayoutListenerC3497kn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C4797a k() {
        return this.f25884z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void k0() {
        if (this.m0 == null) {
            S0.l lVar = this.f25869p0;
            AbstractC2991bG.j((C3808qa) lVar.f2927v, this.f25867n0, "aes2");
            C3700oa d9 = C3808qa.d();
            this.m0 = d9;
            ((HashMap) lVar.f2926u).put("native:view_show", d9);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f25880x.f41845n);
        d("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized boolean k1() {
        return this.f25856R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void l() {
        BinderC5100d y02 = y0();
        if (y02 != null) {
            y02.f41101E.f41134u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void l0(int i) {
        BinderC5100d binderC5100d = this.f25847H;
        if (binderC5100d != null) {
            binderC5100d.Q(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void l1(boolean z6) {
        this.f25856R = z6;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!n0()) {
            super.loadData(str, str2, str3);
        } else {
            int i = w2.z.f41712b;
            x2.i.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!n0()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = w2.z.f41712b;
                    x2.i.f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void loadUrl(String str) {
        if (n0()) {
            int i = w2.z.f41712b;
            x2.i.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            w2.D.f41627l.post(new RunnableC3996u0(16, this, str));
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("AdWebViewImpl.loadUrl", th);
            int i4 = w2.z.f41712b;
            x2.i.g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final S0.l m() {
        return this.f25869p0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void m0(String str, String str2) {
        C2677Lh c2677Lh = this.f25846G;
        c2677Lh.getClass();
        C2575Fh c2575Fh = c2677Lh.f26950n;
        c2677Lh.a(new AdOverlayInfoParcel(c2575Fh, c2575Fh.f25606n.f25880x, str, str2, c2677Lh.f26948Z));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void m1(BinderC5100d binderC5100d) {
        this.f25871r0 = binderC5100d;
    }

    public final synchronized void n() {
        w2.z.k("Destroying WebView!");
        F();
        w2.D.f41627l.post(new RunnableC2558Eh(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized boolean n0() {
        return this.f25852N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized boolean n1() {
        return this.f25851M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r10.f25883y0 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r10.f25883y0 != r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z6;
        int i;
        int i4;
        C2677Lh c2677Lh = this.f25846G;
        synchronized (c2677Lh.f26953w) {
            z6 = c2677Lh.J;
        }
        boolean z9 = false;
        if (z6 || this.f25846G.z()) {
            x2.d dVar = C4949p.f40498g.f40499a;
            DisplayMetrics displayMetrics = this.f25838A;
            int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            int round2 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
            Activity activity = this.f25866n.f28000a;
            if (activity == null || activity.getWindow() == null) {
                i = round;
                i4 = round2;
            } else {
                w2.D d9 = C4906k.f40186C.f40191c;
                int[] p9 = w2.D.p(activity);
                i = Math.round(p9[0] / displayMetrics.density);
                i4 = Math.round(p9[1] / displayMetrics.density);
            }
            w2.D d10 = C4906k.f40186C.f40191c;
            int rotation = this.f25839A0.getDefaultDisplay().getRotation();
            if (this.f25877v0 == round && this.f25875u0 == round2 && this.f25879w0 == i && this.f25881x0 == i4) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32760B0)).booleanValue()) {
                }
            }
            if (this.f25877v0 == round && this.f25875u0 == round2) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32760B0)).booleanValue()) {
                }
                this.f25877v0 = round;
                this.f25875u0 = round2;
                this.f25879w0 = i;
                this.f25881x0 = i4;
                this.f25883y0 = rotation;
                new S0.s(13, this, "").A(round, round2, i, i4, displayMetrics.density, rotation);
                return z9;
            }
            z9 = true;
            this.f25877v0 = round;
            this.f25875u0 = round2;
            this.f25879w0 = i;
            this.f25881x0 = i4;
            this.f25883y0 = rotation;
            new S0.s(13, this, "").A(round, round2, i, i4, displayMetrics.density, rotation);
            return z9;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final int o0() {
        return getMeasuredWidth();
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            c2677Lh.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z6 = true;
            if (!n0()) {
                f8.j jVar = this.f25873t0;
                jVar.f37519c = true;
                if (jVar.f37520d) {
                    jVar.d();
                }
            }
            if (this.C0) {
                onResume();
                this.C0 = false;
            }
            boolean z9 = this.f25859U;
            C2677Lh c2677Lh = this.f25846G;
            if (c2677Lh == null || !c2677Lh.z()) {
                z6 = z9;
            } else {
                if (!this.f25860V) {
                    synchronized (this.f25846G.f26953w) {
                    }
                    synchronized (this.f25846G.f26953w) {
                    }
                    this.f25860V = true;
                }
                o();
            }
            I(z6);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:10:0x0017, B:15:0x002c, B:16:0x0033, B:17:0x001e, B:19:0x0024, B:20:0x0038, B:22:0x003f, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:30:0x0059, B:31:0x005d, B:34:0x005f, B:35:0x0063, B:38:0x0065, B:42:0x006a, B:47:0x006d, B:48:0x006e, B:37:0x0064, B:33:0x005e), top: B:2:0x0001, inners: #1, #2 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        C2677Lh c2677Lh;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        synchronized (this) {
            try {
                if (!n0()) {
                    f8.j jVar = this.f25873t0;
                    jVar.f37519c = false;
                    Activity activity = (Activity) jVar.f37522f;
                    if (activity != null && jVar.f37518b) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) jVar.f37523g);
                            }
                            jVar.f37518b = false;
                        }
                        viewTreeObserver = null;
                        if (viewTreeObserver != null) {
                        }
                        jVar.f37518b = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f25860V && (c2677Lh = this.f25846G) != null && c2677Lh.z() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f25846G.f26953w) {
                    }
                    synchronized (this.f25846G.f26953w) {
                    }
                    this.f25860V = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        I(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.wc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            w2.D d9 = C4906k.f40186C.f40191c;
            w2.D.s(getContext(), intent);
        } catch (ActivityNotFoundException e9) {
            String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = w2.z.f41712b;
            x2.i.a(r9);
            C4906k.f40186C.f40196h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e9);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (n0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean o4 = o();
        BinderC5100d y02 = y0();
        if (y02 != null && o4 && y02.f41102F) {
            y02.f41102F = false;
            y02.f41116w.k0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i4) {
        A3.r rVar;
        int i6;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12 = 8;
        synchronized (this) {
            int i13 = 0;
            if (n0()) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (!isInEditMode() && !this.f25853O && (i6 = (rVar = this.f25849K).f184a) != 0) {
                if (i6 == 5) {
                    super.onMeasure(i, i4);
                    return;
                }
                if (i6 == 4) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32830J4)).booleanValue()) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    BinderC2626Ih g9 = g();
                    float q8 = g9 != null ? g9.q() : 0.0f;
                    if (q8 == 0.0f) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i4);
                    float f2 = size2 * q8;
                    int i14 = (int) (size / q8);
                    if (size2 == 0) {
                        if (i14 != 0) {
                            i11 = (int) (i14 * q8);
                            i13 = size;
                            i10 = i14;
                            setMeasuredDimension(Math.min(i11, i13), Math.min(i14, i10));
                            return;
                        }
                        size2 = 0;
                    }
                    int i15 = (int) f2;
                    if (size != 0) {
                        i13 = size;
                    } else if (i15 != 0) {
                        i14 = (int) (i15 / q8);
                        i10 = size2;
                        i11 = i15;
                        i13 = i11;
                        setMeasuredDimension(Math.min(i11, i13), Math.min(i14, i10));
                        return;
                    }
                    i10 = size2;
                    i11 = i15;
                    setMeasuredDimension(Math.min(i11, i13), Math.min(i14, i10));
                    return;
                }
                if (i6 == 2) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32898R4)).booleanValue()) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    Z0("/contentHeight", new C2841Vb(i12, this));
                    s("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f9 = this.f25838A.density;
                    int size3 = View.MeasureSpec.getSize(i);
                    int i16 = this.f25865l0;
                    setMeasuredDimension(size3, i16 != -1 ? (int) (i16 * f9) : View.MeasureSpec.getSize(i4));
                    return;
                }
                if (rVar.b()) {
                    DisplayMetrics displayMetrics = this.f25838A;
                    setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    return;
                }
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i4);
                int size5 = View.MeasureSpec.getSize(i4);
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i9 = Integer.MAX_VALUE;
                    int i17 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                    A3.r rVar2 = this.f25849K;
                    z6 = rVar2.f186c <= i9 || rVar2.f185b > i17;
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.u6)).booleanValue()) {
                        A3.r rVar3 = this.f25849K;
                        float f10 = rVar3.f186c;
                        float f11 = this.f25840B;
                        z6 &= f10 / f11 <= ((float) i9) / f11 && ((float) rVar3.f185b) / f11 <= ((float) i17) / f11;
                    }
                    if (z6) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.f25845F) {
                            this.f25841B0.b(10002);
                            this.f25845F = true;
                        }
                        A3.r rVar4 = this.f25849K;
                        setMeasuredDimension(rVar4.f186c, rVar4.f185b);
                        return;
                    }
                    float f12 = this.f25849K.f186c;
                    float f13 = this.f25840B;
                    int i18 = (int) (f12 / f13);
                    int i19 = (int) (r1.f185b / f13);
                    int i20 = (int) (size4 / f13);
                    int i21 = (int) (size5 / f13);
                    StringBuilder sb = new StringBuilder(String.valueOf(i18).length() + 36 + String.valueOf(i19).length() + 18 + String.valueOf(i20).length() + 1 + String.valueOf(i21).length() + 4);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append(i18);
                    sb.append("x");
                    sb.append(i19);
                    sb.append(" dp, but only has ");
                    sb.append(i20);
                    sb.append("x");
                    sb.append(i21);
                    sb.append(" dp.");
                    String sb2 = sb.toString();
                    int i22 = w2.z.f41712b;
                    x2.i.f(sb2);
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.f25844E) {
                        return;
                    }
                    this.f25841B0.b(com.anythink.core.common.u.g.f17337a);
                    this.f25844E = true;
                    return;
                }
                i9 = size4;
                if (mode2 != Integer.MIN_VALUE) {
                }
                A3.r rVar22 = this.f25849K;
                if (rVar22.f186c <= i9) {
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.u6)).booleanValue()) {
                }
                if (z6) {
                }
            }
            super.onMeasure(i, i4);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void onPause() {
        if (n0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ae)).booleanValue() && com.bumptech.glide.f.m("MUTE_AUDIO")) {
                int i = w2.z.f41712b;
                x2.i.a("Muting webview");
                int i4 = H0.e.f1187a;
                if (!I0.m.f1300h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f1291u).setAudioMuted(true);
            }
        } catch (Exception e9) {
            int i6 = w2.z.f41712b;
            x2.i.d("Could not pause webview.", e9);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.de)).booleanValue()) {
                C4906k.f40186C.f40196h.d("AdWebViewImpl.onPause", e9);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void onResume() {
        if (n0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ae)).booleanValue() && com.bumptech.glide.f.m("MUTE_AUDIO")) {
                int i = w2.z.f41712b;
                x2.i.a("Unmuting webview");
                int i4 = H0.e.f1187a;
                if (!I0.m.f1300h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f1291u).setAudioMuted(false);
            }
        } catch (Exception e9) {
            int i6 = w2.z.f41712b;
            x2.i.d("Could not resume webview.", e9);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.de)).booleanValue()) {
                C4906k.f40186C.f40196h.d("AdWebViewImpl.onResume", e9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z9;
        boolean z10;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33134r4)).booleanValue()) {
            C2677Lh c2677Lh = this.f25846G;
            synchronized (c2677Lh.f26953w) {
                z10 = c2677Lh.f26935L;
            }
            if (z10) {
                z6 = true;
                if (this.f25846G.z()) {
                    C2677Lh c2677Lh2 = this.f25846G;
                    synchronized (c2677Lh2.f26953w) {
                        z9 = c2677Lh2.f26936M;
                    }
                    if (z9) {
                    }
                    synchronized (this) {
                        try {
                            InterfaceC3431jb interfaceC3431jb = this.f25861W;
                            if (interfaceC3431jb != null) {
                                interfaceC3431jb.e(motionEvent);
                            }
                        } finally {
                        }
                    }
                    if (n0()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }
                if (!z6) {
                    C3464k7 c3464k7 = this.f25874u;
                    if (c3464k7 != null) {
                        c3464k7.f32160b.b(motionEvent);
                    }
                    C2483Aa c2483Aa = this.f25878w;
                    if (c2483Aa != null) {
                        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > c2483Aa.f24461a.getEventTime()) {
                            c2483Aa.f24461a = MotionEvent.obtain(motionEvent);
                        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > c2483Aa.f24462b.getEventTime()) {
                            c2483Aa.f24462b = MotionEvent.obtain(motionEvent);
                        }
                    }
                    if (n0()) {
                    }
                }
                synchronized (this) {
                }
            }
        }
        z6 = false;
        if (this.f25846G.z()) {
        }
        if (!z6) {
        }
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized String p() {
        Ut ut = this.f25843D;
        if (ut == null) {
            return null;
        }
        return ut.f28801b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized I8 p0() {
        return this.f25863j0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final WebView q() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void q0(I8 i82) {
        this.f25863j0 = i82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized int r() {
        return this.f25870q0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void r0(String str, Qx qx) {
        C2677Lh c2677Lh = this.f25846G;
        if (c2677Lh != null) {
            synchronized (c2677Lh.f26953w) {
                try {
                    List<InterfaceC3272gc> list = (List) c2677Lh.f26952v.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC3272gc interfaceC3272gc : list) {
                        if ((interfaceC3272gc instanceof C2706Nc) && ((C2706Nc) interfaceC3272gc).f27286n.equals((InterfaceC3272gc) qx.f27895u)) {
                            arrayList.add(interfaceC3272gc);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.f25855Q;
        }
        if (bool == null) {
            synchronized (this) {
                C3061cg c3061cg = C4906k.f40186C.f40196h;
                synchronized (c3061cg.f30302a) {
                    bool3 = c3061cg.f30310j;
                }
                this.f25855Q = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        t(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        t(Boolean.FALSE);
                    }
                }
            }
            if (!bool2.booleanValue()) {
                synchronized (this) {
                    if (n0()) {
                        int i = w2.z.f41712b;
                        x2.i.f("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String concat = "javascript:".concat(str);
            synchronized (this) {
                if (n0()) {
                    int i4 = w2.z.f41712b;
                    x2.i.f("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(concat);
                }
            }
            return;
        }
        synchronized (this) {
            bool2 = this.f25855Q;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void s0(String str, AbstractC2862Wg abstractC2862Wg) {
        try {
            if (this.f25885z0 == null) {
                this.f25885z0 = new HashMap();
            }
            this.f25885z0.put(str, abstractC2862Wg);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C2677Lh) {
            this.f25846G = (C2677Lh) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (n0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e9) {
            int i = w2.z.f41712b;
            x2.i.d("Could not stop loading webview.", e9);
        }
    }

    public final void t(Boolean bool) {
        synchronized (this) {
            this.f25855Q = bool;
        }
        C3061cg c3061cg = C4906k.f40186C.f40196h;
        synchronized (c3061cg.f30302a) {
            c3061cg.f30310j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void u() {
        ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn = this.f25862i0;
        if (viewTreeObserverOnGlobalLayoutListenerC3497kn != null) {
            w2.D.f41627l.post(new RunnableC3493kj(8, viewTreeObserverOnGlobalLayoutListenerC3497kn));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final P3.a u0() {
        C2483Aa c2483Aa = this.f25878w;
        return c2483Aa == null ? ND.f27257u : (ID) QC.s(ID.s(ND.f27257u), ((Long) AbstractC2721Oa.f27395c.r()).longValue(), TimeUnit.MILLISECONDS, c2483Aa.f24463c);
    }

    @Override // r2.InterfaceC4903h
    public final synchronized void v() {
        C3717or c3717or = this.f25882y;
        if (c3717or != null) {
            c3717or.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void v0(C5101e c5101e, boolean z6, boolean z9, String str) {
        this.f25846G.E(c5101e, z6, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void w0(boolean z6) {
        boolean z9;
        BinderC5100d binderC5100d = this.f25847H;
        if (binderC5100d == null) {
            this.f25851M = z6;
            return;
        }
        C2677Lh c2677Lh = this.f25846G;
        synchronized (c2677Lh.f26953w) {
            z9 = c2677Lh.J;
        }
        binderC5100d.Y3(z9, z6);
    }

    public final /* synthetic */ void x(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized void x0(int i, boolean z6) {
        if (z6) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC5100d binderC5100d = this.f25847H;
        if (binderC5100d != null) {
            binderC5100d.Z3(i, z6);
        }
    }

    public final /* synthetic */ void y(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final synchronized BinderC5100d y0() {
        return this.f25847H;
    }

    @Override // r2.InterfaceC4903h
    public final synchronized void z() {
        C3717or c3717or = this.f25882y;
        if (c3717or != null) {
            c3717or.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Ut z0() {
        return this.f25843D;
    }
}
