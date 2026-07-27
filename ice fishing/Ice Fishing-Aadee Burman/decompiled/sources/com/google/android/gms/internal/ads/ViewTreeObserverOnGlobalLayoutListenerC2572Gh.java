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
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;
import q2.InterfaceC4870a;
import t2.BinderC5036d;
import t2.C5037e;
import t2.InterfaceC5035c;
import u2.C5070a;
import u2.HandlerC5068A;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2572Gh extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC4061vh {

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ int f25049I0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final DisplayMetrics f25050A;

    /* renamed from: A0, reason: collision with root package name */
    public int f25051A0;

    /* renamed from: B, reason: collision with root package name */
    public final float f25052B;

    /* renamed from: B0, reason: collision with root package name */
    public int f25053B0;

    /* renamed from: C, reason: collision with root package name */
    public St f25054C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public Ut f25055D;

    /* renamed from: D0, reason: collision with root package name */
    public int f25056D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f25057E;

    /* renamed from: E0, reason: collision with root package name */
    public HashMap f25058E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25059F;

    /* renamed from: F0, reason: collision with root package name */
    public final WindowManager f25060F0;

    /* renamed from: G, reason: collision with root package name */
    public C2657Lh f25061G;

    /* renamed from: G0, reason: collision with root package name */
    public final C3068d9 f25062G0;

    /* renamed from: H, reason: collision with root package name */
    public BinderC5036d f25063H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f25064H0;

    /* renamed from: I, reason: collision with root package name */
    public C3209fq f25065I;
    public C3155eq J;

    /* renamed from: K, reason: collision with root package name */
    public X2.b f25066K;

    /* renamed from: L, reason: collision with root package name */
    public final String f25067L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f25068M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f25069N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f25070O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f25071P;

    /* renamed from: Q, reason: collision with root package name */
    public Boolean f25072Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f25073R;

    /* renamed from: S, reason: collision with root package name */
    public final String f25074S;

    /* renamed from: T, reason: collision with root package name */
    public BinderC2606Ih f25075T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f25076U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f25077V;

    /* renamed from: W, reason: collision with root package name */
    public InterfaceC3408jb f25078W;

    /* renamed from: n, reason: collision with root package name */
    public final C2759Rh f25079n;

    /* renamed from: n0, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC3420jn f25080n0;

    /* renamed from: o0, reason: collision with root package name */
    public I8 f25081o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f25082p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f25083q0;

    /* renamed from: r0, reason: collision with root package name */
    public C3677oa f25084r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C3677oa f25085s0;

    /* renamed from: t0, reason: collision with root package name */
    public C3677oa f25086t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3441k7 f25087u;

    /* renamed from: u0, reason: collision with root package name */
    public final S0.l f25088u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3213fu f25089v;

    /* renamed from: v0, reason: collision with root package name */
    public int f25090v0;

    /* renamed from: w, reason: collision with root package name */
    public final C2463Aa f25091w;

    /* renamed from: w0, reason: collision with root package name */
    public BinderC5036d f25092w0;

    /* renamed from: x, reason: collision with root package name */
    public final C5110a f25093x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f25094x0;

    /* renamed from: y, reason: collision with root package name */
    public C3694or f25095y;

    /* renamed from: y0, reason: collision with root package name */
    public final f8.j f25096y0;

    /* renamed from: z, reason: collision with root package name */
    public final k8.b f25097z;

    /* renamed from: z0, reason: collision with root package name */
    public int f25098z0;

    public ViewTreeObserverOnGlobalLayoutListenerC2572Gh(C2759Rh c2759Rh, X2.b bVar, String str, boolean z3, C3441k7 c3441k7, C2463Aa c2463Aa, C5110a c5110a, C3694or c3694or, k8.b bVar2, C3068d9 c3068d9, St st, Ut ut, C3213fu c3213fu) {
        super(c2759Rh);
        Ut ut2;
        String str2;
        C4300b a9;
        this.f25057E = false;
        this.f25059F = false;
        this.f25073R = true;
        this.f25074S = "";
        this.f25098z0 = -1;
        this.f25051A0 = -1;
        this.f25053B0 = -1;
        this.C0 = -1;
        this.f25056D0 = -1;
        this.f25079n = c2759Rh;
        this.f25066K = bVar;
        this.f25067L = str;
        this.f25070O = z3;
        this.f25087u = c3441k7;
        this.f25089v = c3213fu;
        this.f25091w = c2463Aa;
        this.f25093x = c5110a;
        this.f25095y = c3694or;
        this.f25097z = bVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f25060F0 = windowManager;
        u2.D d2 = C4835j.f39730C.f39735c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f25050A = displayMetrics;
        this.f25052B = displayMetrics.density;
        this.f25062G0 = c3068d9;
        this.f25054C = st;
        this.f25055D = ut;
        this.f25096y0 = new f8.j(c2759Rh.f27316a, this, this);
        this.f25064H0 = false;
        setBackgroundColor(0);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ad)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to enable Javascript.", e9);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C3301ha c3301ha = AbstractC3569ma.Zc;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Me)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        C4835j c4835j = C4835j.f39730C;
        settings.setUserAgentString(c4835j.f39735c.E(c2759Rh, c5110a.f41388n));
        Context context = getContext();
        O3.b.G(context, new C2.x(17, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        D();
        addJavascriptInterface(new C2623Jh(this, new Ux(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        S0.l lVar = this.f25088u0;
        if (lVar != null && (a9 = c4835j.f39740h.a()) != null) {
            ((ArrayBlockingQueue) a9.f35648a).offer((C3785qa) lVar.f2798v);
        }
        C3785qa c3785qa = new C3785qa(this.f25067L);
        S0.l lVar2 = new S0.l(c3785qa);
        this.f25088u0 = lVar2;
        synchronized (c3785qa.f33245c) {
        }
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue() && (ut2 = this.f25055D) != null && (str2 = ut2.f28004b) != null) {
            c3785qa.c("gqi", str2);
        }
        C3677oa d9 = C3785qa.d();
        this.f25085s0 = d9;
        ((HashMap) lVar2.f2797u).put("native:view_create", d9);
        Context context2 = null;
        this.f25086t0 = null;
        this.f25084r0 = null;
        if (D2.b.f632v == null) {
            D2.b.f632v = new D2.b(4);
        }
        D2.b bVar3 = D2.b.f632v;
        bVar3.getClass();
        u2.z.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c2759Rh);
        if (!defaultUserAgent.equals(bVar3.f634u)) {
            int i6 = M2.h.f1847c;
            try {
                context2 = c2759Rh.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                c2759Rh.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c2759Rh)).apply();
            }
            bVar3.f634u = defaultUserAgent;
        }
        u2.z.k("User agent is updated.");
        c4835j.f39740h.f29526k.incrementAndGet();
    }

    public final /* synthetic */ void A() {
        super.loadUrl(com.anythink.core.common.res.d.f16215a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Ut A0() {
        return this.f25055D;
    }

    public final synchronized void B() {
        try {
            u2.D.f41234l.post(new RunnableC2538Eh(this, 3));
        } catch (Throwable th) {
            C4835j.f39730C.f39740h.d("AdWebViewImpl.loadUrlUnsafe", th);
            int i = u2.z.f41319b;
            v2.i.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void B0() {
        u2.z.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C5110a C() {
        return this.f25093x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void C0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (n0()) {
                    int i = u2.z.f41319b;
                    v2.i.f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32417y0);
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
                    int i6 = u2.z.f41319b;
                    v2.i.g("Unable to build MRAID_ENV", e9);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, AbstractC2691Nh.a(str2, str3), "text/html", "UTF-8", null);
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

    public final synchronized void D() {
        try {
            St st = this.f25054C;
            if (st != null && st.m0) {
                int i = u2.z.f41319b;
                v2.i.a("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f25071P) {
                            setLayerType(1, null);
                        }
                        this.f25071P = true;
                    } finally {
                    }
                }
                return;
            }
            if (!this.f25070O && !this.f25066K.b()) {
                int i6 = u2.z.f41319b;
                v2.i.a("Enabling hardware acceleration on an AdView.");
                synchronized (this) {
                    try {
                        if (this.f25071P) {
                            setLayerType(0, null);
                        }
                        this.f25071P = false;
                    } finally {
                    }
                }
                return;
            }
            int i9 = u2.z.f41319b;
            v2.i.a("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                try {
                    if (this.f25071P) {
                        setLayerType(0, null);
                    }
                    this.f25071P = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized C3209fq D0() {
        return this.f25065I;
    }

    public final synchronized void E() {
        if (this.f25094x0) {
            return;
        }
        this.f25094x0 = true;
        C4835j.f39730C.f39740h.f29526k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void E0(Context context) {
        C2759Rh c2759Rh = this.f25079n;
        c2759Rh.setBaseContext(context);
        this.f25096y0.f37560f = c2759Rh.f27316a;
    }

    public final synchronized void F() {
        try {
            HashMap hashMap = this.f25058E0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC2839Wg) it.next()).a();
                }
            }
            this.f25058E0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized BinderC5036d F0() {
        return this.f25092w0;
    }

    public final void G(boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z3 ? "0" : "1");
        d("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized C3155eq G0() {
        return this.J;
    }

    public final synchronized String H() {
        return this.f25074S;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized boolean H0() {
        return this.f25070O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final int I() {
        return getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void I0(int i, boolean z3, boolean z6) {
        InterfaceC4870a interfaceC4870a;
        InterfaceC2542El interfaceC2542El;
        BinderC2880Yp binderC2880Yp;
        int i6;
        InterfaceC4870a interfaceC4870a2;
        boolean z9;
        C2657Lh c2657Lh = this.f25061G;
        C2555Fh c2555Fh = c2657Lh.f26152n;
        boolean w6 = C2657Lh.w(c2555Fh.f24817n.H0(), c2555Fh);
        boolean z10 = true;
        if (!w6 && z6) {
            z10 = false;
        }
        if (w6) {
            interfaceC4870a = null;
            interfaceC2542El = null;
        } else {
            interfaceC4870a = c2657Lh.f26157x;
            interfaceC2542El = null;
        }
        t2.l lVar = c2657Lh.f26158y;
        InterfaceC2542El interfaceC2542El2 = interfaceC2542El;
        InterfaceC5035c interfaceC5035c = c2657Lh.f26140N;
        C5110a c5110a = c2555Fh.f24817n.f25093x;
        InterfaceC2542El interfaceC2542El3 = z10 ? interfaceC2542El2 : c2657Lh.f26131D;
        if (C2657Lh.v(c2555Fh)) {
            binderC2880Yp = c2657Lh.f26151Z;
            i6 = i;
            z9 = z3;
            interfaceC4870a2 = interfaceC4870a;
        } else {
            binderC2880Yp = interfaceC2542El2;
            i6 = i;
            interfaceC4870a2 = interfaceC4870a;
            z9 = z3;
        }
        c2657Lh.a(new AdOverlayInfoParcel(interfaceC4870a2, lVar, interfaceC5035c, c2555Fh, z9, i6, c5110a, interfaceC2542El3, binderC2880Yp));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void J() {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            c2657Lh.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void J0(int i) {
        this.f25090v0 = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final St K() {
        return this.f25054C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void K0(boolean z3) {
        BinderC5036d binderC5036d;
        int i = this.f25082p0 + (true != z3 ? -1 : 1);
        this.f25082p0 = i;
        if (i > 0 || (binderC5036d = this.f25063H) == null) {
            return;
        }
        synchronized (binderC5036d.f40813H) {
            try {
                binderC5036d.f40815K = true;
                p3.b bVar = binderC5036d.J;
                if (bVar != null) {
                    HandlerC5068A handlerC5068A = u2.D.f41234l;
                    handlerC5068A.removeCallbacks(bVar);
                    handlerC5068A.post(binderC5036d.J);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void L0(C3155eq c3155eq) {
        this.J = c3155eq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            c2657Lh.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void N0(long j6, boolean z3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z3 ? "0" : "1");
        hashMap.put("duration", Long.toString(j6));
        d("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void O0(boolean z3, int i, String str, boolean z6, boolean z9) {
        C2657Lh c2657Lh = this.f25061G;
        C2555Fh c2555Fh = c2657Lh.f26152n;
        boolean H02 = c2555Fh.f24817n.H0();
        boolean w6 = C2657Lh.w(H02, c2555Fh);
        boolean z10 = true;
        if (!w6 && z6) {
            z10 = false;
        }
        InterfaceC4870a interfaceC4870a = w6 ? null : c2657Lh.f26157x;
        C4223yh c4223yh = H02 ? null : new C4223yh(c2555Fh, c2657Lh.f26158y);
        InterfaceC2834Wb interfaceC2834Wb = c2657Lh.f26129B;
        BinderC2880Yp binderC2880Yp = null;
        InterfaceC2850Xb interfaceC2850Xb = c2657Lh.f26130C;
        boolean z11 = z10;
        C4223yh c4223yh2 = c4223yh;
        InterfaceC5035c interfaceC5035c = c2657Lh.f26140N;
        C5110a c5110a = c2555Fh.f24817n.f25093x;
        InterfaceC2542El interfaceC2542El = z11 ? null : c2657Lh.f26131D;
        if (C2657Lh.v(c2555Fh)) {
            binderC2880Yp = c2657Lh.f26151Z;
        }
        c2657Lh.a(new AdOverlayInfoParcel(interfaceC4870a, c4223yh2, interfaceC2834Wb, interfaceC2850Xb, interfaceC5035c, c2555Fh, z3, i, str, c5110a, interfaceC2542El, binderC2880Yp, z9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final ArrayList P() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void P0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Q(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void Q0(C3209fq c3209fq) {
        this.f25065I = c3209fq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized String R() {
        return this.f25067L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3441k7 R0() {
        return this.f25087u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void S0(BinderC2606Ih binderC2606Ih) {
        if (this.f25075T == null) {
            this.f25075T = binderC2606Ih;
        } else {
            int i = u2.z.f41319b;
            v2.i.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void T0(String str, InterfaceC3249gc interfaceC3249gc) {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            synchronized (c2657Lh.f26156w) {
                try {
                    List list = (List) c2657Lh.f26155v.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC3249gc);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void U0(int i) {
        C3677oa c3677oa = this.f25085s0;
        S0.l lVar = this.f25088u0;
        if (i == 0) {
            AbstractC2968bG.j((C3785qa) lVar.f2798v, c3677oa, "aebb2");
        }
        AbstractC2968bG.j((C3785qa) lVar.f2798v, c3677oa, "aeh2");
        lVar.getClass();
        ((C3785qa) lVar.f2798v).c("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f25093x.f41388n);
        d("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final View V() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean V0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void W0(InterfaceC3408jb interfaceC3408jb) {
        this.f25078W = interfaceC3408jb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3864s X0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Y0(boolean z3) {
        this.f25061G.f26150X = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Z0(St st, Ut ut) {
        this.f25054C = st;
        this.f25055D = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void a(String str, JSONObject jSONObject) {
        c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void a1(String str, InterfaceC3249gc interfaceC3249gc) {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            c2657Lh.b(str, interfaceC3249gc);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void b(String str) {
        s(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized boolean b1() {
        return this.f25082p0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void c(String str, String str2) {
        s(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(u1.h.a(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized InterfaceC3408jb c1() {
        return this.f25078W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
    public final void d(String str, Map map) {
        try {
            e(str, C4900p.f40196g.f40197a.l(map));
        } catch (JSONException unused) {
            int i = u2.z.f41319b;
            v2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Context d0() {
        return this.f25079n.f27318c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void d1() {
        this.f25064H0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0074, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:26:0x00a9, B:29:0x00b8, B:32:0x0028, B:34:0x002c, B:39:0x0041, B:40:0x0048, B:41:0x0033, B:43:0x0039, B:44:0x0006, B:46:0x0010), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        C4300b a9;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        try {
            S0.l lVar = this.f25088u0;
            if (lVar != null && (a9 = C4835j.f39730C.f39740h.a()) != null) {
                ((ArrayBlockingQueue) a9.f35648a).offer((C3785qa) lVar.f2798v);
            }
            f8.j jVar = this.f25096y0;
            jVar.f37558d = false;
            Activity activity = (Activity) jVar.f37560f;
            if (activity != null && jVar.f37556b) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) jVar.f37561g);
                    }
                    jVar.f37556b = false;
                }
                viewTreeObserver = null;
                if (viewTreeObserver != null) {
                }
                jVar.f37556b = false;
            }
            BinderC5036d binderC5036d = this.f25063H;
            if (binderC5036d != null) {
                binderC5036d.t();
                this.f25063H.J();
                this.f25063H = null;
            }
            this.f25065I = null;
            this.J = null;
            this.f25061G.d();
            this.f25081o0 = null;
            this.f25095y = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f25069N) {
                return;
            }
            C4835j.f39730C.f39731A.a(this);
            F();
            this.f25069N = true;
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.hc)).booleanValue()) {
                u2.z.k("Destroying the WebView immediately...");
                n();
                return;
            }
            Activity activity2 = this.f25079n.f27316a;
            if (activity2 != null && activity2.isDestroyed()) {
                u2.z.k("Destroying the WebView immediately...");
                n();
            } else {
                u2.z.k("Initiating WebView self destruct sequence in 3...");
                u2.z.k("Loading blank page in WebView, 2...");
                B();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
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
        int i = u2.z.f41319b;
        v2.i.a("Dispatching AFMA event: ".concat(sb2));
        s(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void e1() {
        boolean z3;
        HashMap hashMap = new HashMap(3);
        C4835j c4835j = C4835j.f39730C;
        C5070a c5070a = c4835j.i;
        synchronized (c5070a) {
            z3 = c5070a.f41249a;
        }
        hashMap.put("app_muted", String.valueOf(z3));
        hashMap.put("app_volume", String.valueOf(c4835j.i.a()));
        hashMap.put("device_volume", String.valueOf(C5070a.b(getContext())));
        d("volume", hashMap);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (n0()) {
            int i = u2.z.f41319b;
            v2.i.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ic)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC3413jg.f31273f.a(new RunnableC3865s0(4, this, str, valueCallback));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        boolean z3;
        synchronized (this) {
            z3 = c3873s8.f33899j;
            this.f25076U = z3;
        }
        G(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3213fu f0() {
        return this.f25089v;
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f25069N) {
                        this.f25061G.d();
                        C4835j.f39730C.f39731A.a(this);
                        F();
                        E();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized BinderC2606Ih g() {
        return this.f25075T;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final /* synthetic */ C2657Lh g0() {
        return this.f25061G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void g1(C5037e c5037e, boolean z3, boolean z6, String str) {
        this.f25061G.D(c5037e, z3, z6, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void h0(boolean z3, int i, String str, String str2, boolean z6) {
        C2657Lh c2657Lh = this.f25061G;
        C2555Fh c2555Fh = c2657Lh.f26152n;
        boolean H02 = c2555Fh.f24817n.H0();
        boolean w6 = C2657Lh.w(H02, c2555Fh);
        boolean z9 = true;
        if (!w6 && z6) {
            z9 = false;
        }
        InterfaceC4870a interfaceC4870a = w6 ? null : c2657Lh.f26157x;
        C4223yh c4223yh = H02 ? null : new C4223yh(c2555Fh, c2657Lh.f26158y);
        InterfaceC2834Wb interfaceC2834Wb = c2657Lh.f26129B;
        BinderC2880Yp binderC2880Yp = null;
        InterfaceC2850Xb interfaceC2850Xb = c2657Lh.f26130C;
        boolean z10 = z9;
        C4223yh c4223yh2 = c4223yh;
        InterfaceC5035c interfaceC5035c = c2657Lh.f26140N;
        C5110a c5110a = c2555Fh.f24817n.f25093x;
        InterfaceC2542El interfaceC2542El = z10 ? null : c2657Lh.f26131D;
        if (C2657Lh.v(c2555Fh)) {
            binderC2880Yp = c2657Lh.f26151Z;
        }
        c2657Lh.a(new AdOverlayInfoParcel(interfaceC4870a, c4223yh2, interfaceC2834Wb, interfaceC2850Xb, interfaceC5035c, c2555Fh, z3, i, str, str2, c5110a, interfaceC2542El, binderC2880Yp));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized X2.b i0() {
        return this.f25066K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void i1(boolean z3) {
        try {
            boolean z6 = this.f25070O;
            this.f25070O = z3;
            D();
            if (z3 != z6) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32426z0)).booleanValue()) {
                    if (!this.f25066K.b()) {
                    }
                }
                try {
                    e("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f17526b, true != z3 ? com.anythink.core.express.b.a.f17530f : com.anythink.core.express.b.a.f17531g));
                } catch (JSONException e9) {
                    int i = u2.z.f41319b;
                    v2.i.d("Error occurred while dispatching state change.", e9);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Activity j() {
        return this.f25079n.f27316a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void j0(BinderC5036d binderC5036d) {
        this.f25092w0 = binderC5036d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void j1(ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn) {
        this.f25080n0 = viewTreeObserverOnGlobalLayoutListenerC3420jn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final k8.b k() {
        return this.f25097z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void k0() {
        if (this.f25084r0 == null) {
            S0.l lVar = this.f25088u0;
            AbstractC2968bG.j((C3785qa) lVar.f2798v, this.f25085s0, "aes2");
            C3677oa d2 = C3785qa.d();
            this.f25084r0 = d2;
            ((HashMap) lVar.f2797u).put("native:view_show", d2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f25093x.f41388n);
        d("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized boolean k1() {
        return this.f25073R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void l() {
        BinderC5036d z02 = z0();
        if (z02 != null) {
            z02.f40810E.f40843u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void l0(int i) {
        BinderC5036d binderC5036d = this.f25063H;
        if (binderC5036d != null) {
            binderC5036d.Q(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void l1(boolean z3) {
        this.f25073R = z3;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!n0()) {
            super.loadData(str, str2, str3);
        } else {
            int i = u2.z.f41319b;
            v2.i.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!n0()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = u2.z.f41319b;
                    v2.i.f("#004 The webview is destroyed. Ignoring action.");
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void loadUrl(String str) {
        if (n0()) {
            int i = u2.z.f41319b;
            v2.i.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            u2.D.f41234l.post(new RunnableC3973u0(16, this, str));
        } catch (Throwable th) {
            C4835j.f39730C.f39740h.d("AdWebViewImpl.loadUrl", th);
            int i6 = u2.z.f41319b;
            v2.i.g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final S0.l m() {
        return this.f25088u0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void m0(String str, String str2) {
        C2657Lh c2657Lh = this.f25061G;
        c2657Lh.getClass();
        C2555Fh c2555Fh = c2657Lh.f26152n;
        c2657Lh.a(new AdOverlayInfoParcel(c2555Fh, c2555Fh.f24817n.f25093x, str, str2, c2657Lh.f26151Z));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized boolean m1() {
        return this.f25068M;
    }

    public final synchronized void n() {
        u2.z.k("Destroying WebView!");
        E();
        u2.D.f41234l.post(new RunnableC2538Eh(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized boolean n0() {
        return this.f25069N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r10.f25056D0 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r10.f25056D0 != r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z3;
        int i;
        int i6;
        C2657Lh c2657Lh = this.f25061G;
        synchronized (c2657Lh.f26156w) {
            z3 = c2657Lh.J;
        }
        boolean z6 = false;
        if (z3 || this.f25061G.z()) {
            v2.d dVar = C4900p.f40196g.f40197a;
            DisplayMetrics displayMetrics = this.f25050A;
            int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            int round2 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
            Activity activity = this.f25079n.f27316a;
            if (activity == null || activity.getWindow() == null) {
                i = round;
                i6 = round2;
            } else {
                u2.D d2 = C4835j.f39730C.f39735c;
                int[] p9 = u2.D.p(activity);
                i = Math.round(p9[0] / displayMetrics.density);
                i6 = Math.round(p9[1] / displayMetrics.density);
            }
            u2.D d9 = C4835j.f39730C.f39735c;
            int rotation = this.f25060F0.getDefaultDisplay().getRotation();
            if (this.f25051A0 == round && this.f25098z0 == round2 && this.f25053B0 == i && this.C0 == i6) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31979B0)).booleanValue()) {
                }
            }
            if (this.f25051A0 == round && this.f25098z0 == round2) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31979B0)).booleanValue()) {
                }
                this.f25051A0 = round;
                this.f25098z0 = round2;
                this.f25053B0 = i;
                this.C0 = i6;
                this.f25056D0 = rotation;
                new S0.s(11, this, "").B(round, round2, i, i6, displayMetrics.density, rotation);
                return z6;
            }
            z6 = true;
            this.f25051A0 = round;
            this.f25098z0 = round2;
            this.f25053B0 = i;
            this.C0 = i6;
            this.f25056D0 = rotation;
            new S0.s(11, this, "").B(round, round2, i, i6, displayMetrics.density, rotation);
            return z6;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void o0(X2.b bVar) {
        this.f25066K = bVar;
        requestLayout();
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            c2657Lh.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z3 = true;
            if (!n0()) {
                f8.j jVar = this.f25096y0;
                jVar.f37557c = true;
                if (jVar.f37558d) {
                    jVar.d();
                }
            }
            if (this.f25064H0) {
                onResume();
                this.f25064H0 = false;
            }
            boolean z6 = this.f25076U;
            C2657Lh c2657Lh = this.f25061G;
            if (c2657Lh == null || !c2657Lh.z()) {
                z3 = z6;
            } else {
                if (!this.f25077V) {
                    synchronized (this.f25061G.f26156w) {
                    }
                    synchronized (this.f25061G.f26156w) {
                    }
                    this.f25077V = true;
                }
                o();
            }
            G(z3);
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
        C2657Lh c2657Lh;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        synchronized (this) {
            try {
                if (!n0()) {
                    f8.j jVar = this.f25096y0;
                    jVar.f37557c = false;
                    Activity activity = (Activity) jVar.f37560f;
                    if (activity != null && jVar.f37556b) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) jVar.f37561g);
                            }
                            jVar.f37556b = false;
                        }
                        viewTreeObserver = null;
                        if (viewTreeObserver != null) {
                        }
                        jVar.f37556b = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f25077V && (c2657Lh = this.f25061G) != null && c2657Lh.z() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f25061G.f26156w) {
                    }
                    synchronized (this.f25061G.f26156w) {
                    }
                    this.f25077V = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.wc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            u2.D d2 = C4835j.f39730C.f39735c;
            u2.D.s(getContext(), intent);
        } catch (ActivityNotFoundException e9) {
            String o6 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = u2.z.f41319b;
            v2.i.a(o6);
            C4835j.f39730C.f39740h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e9);
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
        boolean o6 = o();
        BinderC5036d z02 = z0();
        if (z02 != null && o6 && z02.f40811F) {
            z02.f40811F = false;
            z02.f40825w.k0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i6) {
        X2.b bVar;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13 = 8;
        synchronized (this) {
            int i14 = 0;
            if (n0()) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (!isInEditMode() && !this.f25070O && (i9 = (bVar = this.f25066K).f3771a) != 0) {
                if (i9 == 5) {
                    super.onMeasure(i, i6);
                    return;
                }
                if (i9 == 4) {
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32050J4)).booleanValue()) {
                        super.onMeasure(i, i6);
                        return;
                    }
                    BinderC2606Ih g4 = g();
                    float q8 = g4 != null ? g4.q() : 0.0f;
                    if (q8 == 0.0f) {
                        super.onMeasure(i, i6);
                        return;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i6);
                    float f3 = size2 * q8;
                    int i15 = (int) (size / q8);
                    if (size2 == 0) {
                        if (i15 != 0) {
                            i12 = (int) (i15 * q8);
                            i14 = size;
                            i11 = i15;
                            setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                            return;
                        }
                        size2 = 0;
                    }
                    int i16 = (int) f3;
                    if (size != 0) {
                        i14 = size;
                    } else if (i16 != 0) {
                        i15 = (int) (i16 / q8);
                        i11 = size2;
                        i12 = i16;
                        i14 = i12;
                        setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                        return;
                    }
                    i11 = size2;
                    i12 = i16;
                    setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                    return;
                }
                if (i9 == 2) {
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32119R4)).booleanValue()) {
                        super.onMeasure(i, i6);
                        return;
                    }
                    a1("/contentHeight", new C2818Vb(i13, this));
                    s("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f9 = this.f25050A.density;
                    int size3 = View.MeasureSpec.getSize(i);
                    int i17 = this.f25083q0;
                    setMeasuredDimension(size3, i17 != -1 ? (int) (i17 * f9) : View.MeasureSpec.getSize(i6));
                    return;
                }
                if (bVar.b()) {
                    DisplayMetrics displayMetrics = this.f25050A;
                    setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    return;
                }
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i6);
                int size5 = View.MeasureSpec.getSize(i6);
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i10 = Integer.MAX_VALUE;
                    int i18 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                    X2.b bVar2 = this.f25066K;
                    z3 = bVar2.f3773c <= i10 || bVar2.f3772b > i18;
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.u6)).booleanValue()) {
                        X2.b bVar3 = this.f25066K;
                        float f10 = bVar3.f3773c;
                        float f11 = this.f25052B;
                        z3 &= f10 / f11 <= ((float) i10) / f11 && ((float) bVar3.f3772b) / f11 <= ((float) i18) / f11;
                    }
                    if (z3) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.f25059F) {
                            this.f25062G0.b(10002);
                            this.f25059F = true;
                        }
                        X2.b bVar4 = this.f25066K;
                        setMeasuredDimension(bVar4.f3773c, bVar4.f3772b);
                        return;
                    }
                    float f12 = this.f25066K.f3773c;
                    float f13 = this.f25052B;
                    int i19 = (int) (f12 / f13);
                    int i20 = (int) (r1.f3772b / f13);
                    int i21 = (int) (size4 / f13);
                    int i22 = (int) (size5 / f13);
                    StringBuilder sb = new StringBuilder(String.valueOf(i19).length() + 36 + String.valueOf(i20).length() + 18 + String.valueOf(i21).length() + 1 + String.valueOf(i22).length() + 4);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append(i19);
                    sb.append("x");
                    sb.append(i20);
                    sb.append(" dp, but only has ");
                    sb.append(i21);
                    sb.append("x");
                    sb.append(i22);
                    sb.append(" dp.");
                    String sb2 = sb.toString();
                    int i23 = u2.z.f41319b;
                    v2.i.f(sb2);
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.f25057E) {
                        return;
                    }
                    this.f25062G0.b(com.anythink.core.common.u.g.f16550a);
                    this.f25057E = true;
                    return;
                }
                i10 = size4;
                if (mode2 != Integer.MIN_VALUE) {
                }
                X2.b bVar22 = this.f25066K;
                if (bVar22.f3773c <= i10) {
                }
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.u6)).booleanValue()) {
                }
                if (z3) {
                }
            }
            super.onMeasure(i, i6);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void onPause() {
        if (n0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ae)).booleanValue() && com.bumptech.glide.f.o("MUTE_AUDIO")) {
                int i = u2.z.f41319b;
                v2.i.a("Muting webview");
                int i6 = H0.e.f1084a;
                if (!I0.m.f1273h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f1264u).setAudioMuted(true);
            }
        } catch (Exception e9) {
            int i9 = u2.z.f41319b;
            v2.i.d("Could not pause webview.", e9);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.de)).booleanValue()) {
                C4835j.f39730C.f39740h.d("AdWebViewImpl.onPause", e9);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void onResume() {
        if (n0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ae)).booleanValue() && com.bumptech.glide.f.o("MUTE_AUDIO")) {
                int i = u2.z.f41319b;
                v2.i.a("Unmuting webview");
                int i6 = H0.e.f1084a;
                if (!I0.m.f1273h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f1264u).setAudioMuted(false);
            }
        } catch (Exception e9) {
            int i9 = u2.z.f41319b;
            v2.i.d("Could not resume webview.", e9);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.de)).booleanValue()) {
                C4835j.f39730C.f39740h.d("AdWebViewImpl.onResume", e9);
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
        boolean z3;
        boolean z6;
        boolean z9;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32355r4)).booleanValue()) {
            C2657Lh c2657Lh = this.f25061G;
            synchronized (c2657Lh.f26156w) {
                z9 = c2657Lh.f26138L;
            }
            if (z9) {
                z3 = true;
                if (this.f25061G.z()) {
                    C2657Lh c2657Lh2 = this.f25061G;
                    synchronized (c2657Lh2.f26156w) {
                        z6 = c2657Lh2.f26139M;
                    }
                    if (z6) {
                    }
                    synchronized (this) {
                        try {
                            InterfaceC3408jb interfaceC3408jb = this.f25078W;
                            if (interfaceC3408jb != null) {
                                interfaceC3408jb.h(motionEvent);
                            }
                        } finally {
                        }
                    }
                    if (n0()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }
                if (!z3) {
                    C3441k7 c3441k7 = this.f25087u;
                    if (c3441k7 != null) {
                        c3441k7.f31381b.b(motionEvent);
                    }
                    C2463Aa c2463Aa = this.f25091w;
                    if (c2463Aa != null) {
                        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > c2463Aa.f23679a.getEventTime()) {
                            c2463Aa.f23679a = MotionEvent.obtain(motionEvent);
                        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > c2463Aa.f23680b.getEventTime()) {
                            c2463Aa.f23680b = MotionEvent.obtain(motionEvent);
                        }
                    }
                    if (n0()) {
                    }
                }
                synchronized (this) {
                }
            }
        }
        z3 = false;
        if (this.f25061G.z()) {
        }
        if (!z3) {
        }
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized String p() {
        Ut ut = this.f25055D;
        if (ut == null) {
            return null;
        }
        return ut.f28004b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final int p0() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final WebView q() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized I8 q0() {
        return this.f25081o0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized int r() {
        return this.f25090v0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void r0(I8 i82) {
        this.f25081o0 = i82;
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
            bool = this.f25072Q;
        }
        if (bool == null) {
            synchronized (this) {
                C3038cg c3038cg = C4835j.f39730C.f39740h;
                synchronized (c3038cg.f29517a) {
                    bool3 = c3038cg.f29525j;
                }
                this.f25072Q = bool3;
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
                        int i = u2.z.f41319b;
                        v2.i.f("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String concat = "javascript:".concat(str);
            synchronized (this) {
                if (n0()) {
                    int i6 = u2.z.f41319b;
                    v2.i.f("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(concat);
                }
            }
            return;
        }
        synchronized (this) {
            bool2 = this.f25072Q;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void s0(String str, Qx qx) {
        C2657Lh c2657Lh = this.f25061G;
        if (c2657Lh != null) {
            synchronized (c2657Lh.f26156w) {
                try {
                    List<InterfaceC3249gc> list = (List) c2657Lh.f26155v.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC3249gc interfaceC3249gc : list) {
                        if ((interfaceC3249gc instanceof C2686Nc) && ((C2686Nc) interfaceC3249gc).f26503n.equals((InterfaceC3249gc) qx.f27139u)) {
                            arrayList.add(interfaceC3249gc);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C2657Lh) {
            this.f25061G = (C2657Lh) webViewClient;
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
            int i = u2.z.f41319b;
            v2.i.d("Could not stop loading webview.", e9);
        }
    }

    public final void t(Boolean bool) {
        synchronized (this) {
            this.f25072Q = bool;
        }
        C3038cg c3038cg = C4835j.f39730C.f39740h;
        synchronized (c3038cg.f29517a) {
            c3038cg.f29525j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void t0(BinderC5036d binderC5036d) {
        this.f25063H = binderC5036d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void u() {
        ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn = this.f25080n0;
        if (viewTreeObserverOnGlobalLayoutListenerC3420jn != null) {
            u2.D.f41234l.post(new RunnableC3470kj(8, viewTreeObserverOnGlobalLayoutListenerC3420jn));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void u0(String str, AbstractC2839Wg abstractC2839Wg) {
        try {
            if (this.f25058E0 == null) {
                this.f25058E0 = new HashMap();
            }
            this.f25058E0.put(str, abstractC2839Wg);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p2.InterfaceC4832g
    public final synchronized void v() {
        C3694or c3694or = this.f25095y;
        if (c3694or != null) {
            c3694or.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final N3.a v0() {
        C2463Aa c2463Aa = this.f25091w;
        return c2463Aa == null ? ND.f26473u : (ID) QC.s(ID.s(ND.f26473u), ((Long) AbstractC2701Oa.f26619c.r()).longValue(), TimeUnit.MILLISECONDS, c2463Aa.f23681c);
    }

    public final /* synthetic */ void x(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void x0(boolean z3) {
        boolean z6;
        BinderC5036d binderC5036d = this.f25063H;
        if (binderC5036d == null) {
            this.f25068M = z3;
            return;
        }
        C2657Lh c2657Lh = this.f25061G;
        synchronized (c2657Lh.f26156w) {
            z6 = c2657Lh.J;
        }
        binderC5036d.Y3(z6, z3);
    }

    public final /* synthetic */ void y(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized void y0(int i, boolean z3) {
        if (z3) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC5036d binderC5036d = this.f25063H;
        if (binderC5036d != null) {
            binderC5036d.Z3(i, z3);
        }
    }

    @Override // p2.InterfaceC4832g
    public final synchronized void z() {
        C3694or c3694or = this.f25095y;
        if (c3694or != null) {
            c3694or.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final synchronized BinderC5036d z0() {
        return this.f25063H;
    }
}
