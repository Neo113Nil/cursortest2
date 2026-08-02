package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import o1.C4797a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2649Jn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26491a;

    /* renamed from: b, reason: collision with root package name */
    public final C3464k7 f26492b;

    /* renamed from: c, reason: collision with root package name */
    public final C2483Aa f26493c;

    /* renamed from: d, reason: collision with root package name */
    public final C5189a f26494d;

    /* renamed from: e, reason: collision with root package name */
    public final C4797a f26495e;

    /* renamed from: f, reason: collision with root package name */
    public final C3091d9 f26496f;

    /* renamed from: g, reason: collision with root package name */
    public final C2898Yk f26497g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2903Yp f26498h;
    public final C3236fu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3230fo f26499j;

    /* renamed from: k, reason: collision with root package name */
    public final C2762Qh f26500k;

    public C2649Jn(Context context, C3464k7 c3464k7, C2483Aa c2483Aa, C5189a c5189a, C4797a c4797a, C3091d9 c3091d9, C2898Yk c2898Yk, BinderC2903Yp binderC2903Yp, C3236fu c3236fu, C3230fo c3230fo, C2762Qh c2762Qh) {
        this.f26491a = context;
        this.f26492b = c3464k7;
        this.f26493c = c2483Aa;
        this.f26494d = c5189a;
        this.f26495e = c4797a;
        this.f26496f = c3091d9;
        this.f26497g = c2898Yk;
        this.f26498h = binderC2903Yp;
        this.i = c3236fu;
        this.f26499j = c3230fo;
        this.f26500k = c2762Qh;
    }

    public final InterfaceC4084vh a(s2.f1 f1Var, St st, Ut ut) {
        A3.r a9 = A3.r.a(f1Var);
        C3717or c3717or = new C3717or(this);
        C5189a c5189a = this.f26494d;
        C4797a c4797a = this.f26495e;
        BinderC2903Yp binderC2903Yp = this.f26498h;
        C3236fu c3236fu = this.i;
        Context context = this.f26491a;
        String str = f1Var.f40441n;
        InterfaceC4084vh g9 = C2889Yb.g(a9, context, this.f26492b, this.f26496f, this.f26493c, this.f26499j, binderC2903Yp, c3717or, st, ut, c3236fu, str, c4797a, c5189a, false, false);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ef)).booleanValue()) {
            WebView q8 = g9.q();
            if (this.f26500k.f27838a != null) {
                try {
                    int i = H0.e.f1187a;
                    if (!I0.m.f1299g.b()) {
                        throw I0.m.a();
                    }
                    ((WebViewProviderBoundaryInterface) H0.e.c(q8).f1291u).setProfile("GMA_WEBVIEW_PROFILE");
                    w2.z.k("WebViewCompat Profile is defined");
                    return g9;
                } catch (IllegalStateException e9) {
                    String concat = "WebViewCompat error: ".concat(e9.toString());
                    int i4 = w2.z.f41712b;
                    x2.i.f(concat);
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Df)).booleanValue()) {
                        C4906k.f40186C.f40196h.d("WebViewCompat.setProfile", e9);
                    }
                }
            }
        }
        return g9;
    }
}
