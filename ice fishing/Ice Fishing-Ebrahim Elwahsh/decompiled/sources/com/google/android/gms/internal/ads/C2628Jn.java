package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2628Jn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25799a;

    /* renamed from: b, reason: collision with root package name */
    public final C3348i7 f25800b;

    /* renamed from: c, reason: collision with root package name */
    public final C4175xa f25801c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107a f25802d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.s f25803e;

    /* renamed from: f, reason: collision with root package name */
    public final C2914a9 f25804f;

    /* renamed from: g, reason: collision with root package name */
    public final C2863Xk f25805g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2949aq f25806h;
    public final C3280gu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3165eo f25807j;

    /* renamed from: k, reason: collision with root package name */
    public final C2690Nh f25808k;

    public C2628Jn(Context context, C3348i7 c3348i7, C4175xa c4175xa, C5107a c5107a, S0.s sVar, C2914a9 c2914a9, C2863Xk c2863Xk, BinderC2949aq binderC2949aq, C3280gu c3280gu, C3165eo c3165eo, C2690Nh c2690Nh) {
        this.f25799a = context;
        this.f25800b = c3348i7;
        this.f25801c = c4175xa;
        this.f25802d = c5107a;
        this.f25803e = sVar;
        this.f25804f = c2914a9;
        this.f25805g = c2863Xk;
        this.f25806h = binderC2949aq;
        this.i = c3280gu;
        this.f25807j = c3165eo;
        this.f25808k = c2690Nh;
    }

    public final InterfaceC3858rh a(q2.g1 g1Var, Ut ut, Wt wt) {
        W2.b a9 = W2.b.a(g1Var);
        C3761pr c3761pr = new C3761pr(this);
        C5107a c5107a = this.f25802d;
        S0.s sVar = this.f25803e;
        BinderC2949aq binderC2949aq = this.f25806h;
        C3280gu c3280gu = this.i;
        Context context = this.f25799a;
        String str = g1Var.f40056n;
        InterfaceC3858rh g9 = C2837Wb.g(sVar, a9, context, this.f25800b, this.f25804f, this.f25801c, this.f25807j, binderC2949aq, c3761pr, ut, wt, c3280gu, str, c5107a, false, false);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.yf)).booleanValue()) {
            WebView s3 = g9.s();
            if (this.f25808k.f26591a != null) {
                try {
                    int i = H0.e.f1207a;
                    if (!I0.m.f1241g.b()) {
                        throw I0.m.a();
                    }
                    ((WebViewProviderBoundaryInterface) H0.e.c(s3).f37858u).setProfile("GMA_WEBVIEW_PROFILE");
                    t2.C.k("WebViewCompat Profile is defined");
                    return g9;
                } catch (IllegalStateException e6) {
                    String concat = "WebViewCompat error: ".concat(e6.toString());
                    int i4 = t2.C.f40822b;
                    u2.i.f(concat);
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.xf)).booleanValue()) {
                        p2.j.f39798C.f39808h.d("WebViewCompat.setProfile", e6);
                    }
                }
            }
        }
        return g9;
    }
}
