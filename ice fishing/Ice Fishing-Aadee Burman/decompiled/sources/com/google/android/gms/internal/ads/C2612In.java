package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.In, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2612In {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25567a;

    /* renamed from: b, reason: collision with root package name */
    public final C3441k7 f25568b;

    /* renamed from: c, reason: collision with root package name */
    public final C2463Aa f25569c;

    /* renamed from: d, reason: collision with root package name */
    public final C5110a f25570d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.b f25571e;

    /* renamed from: f, reason: collision with root package name */
    public final C3068d9 f25572f;

    /* renamed from: g, reason: collision with root package name */
    public final C2875Yk f25573g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2880Yp f25574h;
    public final C3213fu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3153eo f25575j;

    /* renamed from: k, reason: collision with root package name */
    public final C2742Qh f25576k;

    public C2612In(Context context, C3441k7 c3441k7, C2463Aa c2463Aa, C5110a c5110a, k8.b bVar, C3068d9 c3068d9, C2875Yk c2875Yk, BinderC2880Yp binderC2880Yp, C3213fu c3213fu, C3153eo c3153eo, C2742Qh c2742Qh) {
        this.f25567a = context;
        this.f25568b = c3441k7;
        this.f25569c = c2463Aa;
        this.f25570d = c5110a;
        this.f25571e = bVar;
        this.f25572f = c3068d9;
        this.f25573g = c2875Yk;
        this.f25574h = binderC2880Yp;
        this.i = c3213fu;
        this.f25575j = c3153eo;
        this.f25576k = c2742Qh;
    }

    public final InterfaceC4061vh a(q2.f1 f1Var, St st, Ut ut) {
        X2.b a9 = X2.b.a(f1Var);
        C3694or c3694or = new C3694or(this);
        C5110a c5110a = this.f25570d;
        k8.b bVar = this.f25571e;
        BinderC2880Yp binderC2880Yp = this.f25574h;
        C3213fu c3213fu = this.i;
        Context context = this.f25567a;
        String str = f1Var.f40139n;
        InterfaceC4061vh g4 = C2866Yb.g(a9, context, this.f25568b, this.f25572f, this.f25569c, this.f25575j, binderC2880Yp, c3694or, st, ut, c3213fu, str, bVar, c5110a, false, false);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ef)).booleanValue()) {
            WebView q8 = g4.q();
            if (this.f25576k.f27053a != null) {
                try {
                    int i = H0.e.f1084a;
                    if (!I0.m.f1272g.b()) {
                        throw I0.m.a();
                    }
                    ((WebViewProviderBoundaryInterface) H0.e.c(q8).f1264u).setProfile("GMA_WEBVIEW_PROFILE");
                    u2.z.k("WebViewCompat Profile is defined");
                    return g4;
                } catch (IllegalStateException e9) {
                    String concat = "WebViewCompat error: ".concat(e9.toString());
                    int i6 = u2.z.f41319b;
                    v2.i.f(concat);
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Df)).booleanValue()) {
                        C4835j.f39730C.f39740h.d("WebViewCompat.setProfile", e9);
                    }
                }
            }
        }
        return g4;
    }
}
