package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import o1.C4797a;
import org.json.JSONObject;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4036un {

    /* renamed from: b, reason: collision with root package name */
    public final C4797a f35340b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f35341c;

    /* renamed from: d, reason: collision with root package name */
    public final C3230fo f35342d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f35343e;

    /* renamed from: f, reason: collision with root package name */
    public final C3464k7 f35344f;

    /* renamed from: g, reason: collision with root package name */
    public final C5189a f35345g;
    public final C2821Tp i;

    /* renamed from: j, reason: collision with root package name */
    public final C4260yv f35347j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC2903Yp f35348k;

    /* renamed from: l, reason: collision with root package name */
    public final C3236fu f35349l;

    /* renamed from: m, reason: collision with root package name */
    public final C3334hk f35350m;

    /* renamed from: n, reason: collision with root package name */
    public C3955tD f35351n;

    /* renamed from: a, reason: collision with root package name */
    public final C3821qn f35339a = new C3821qn();

    /* renamed from: h, reason: collision with root package name */
    public final C3111dc f35346h = new C3111dc();

    public C4036un(CallableC3982tn callableC3982tn) {
        this.f35341c = callableC3982tn.f35166b;
        this.f35343e = callableC3982tn.f35169e;
        this.f35344f = callableC3982tn.f35170f;
        this.f35345g = callableC3982tn.f35171g;
        this.f35340b = callableC3982tn.f35165a;
        this.i = callableC3982tn.f35168d;
        this.f35347j = callableC3982tn.f35172h;
        this.f35342d = callableC3982tn.f35167c;
        this.f35348k = callableC3982tn.i;
        this.f35349l = callableC3982tn.f35173j;
        this.f35350m = callableC3982tn.f35174k;
    }

    public final synchronized P3.a a(String str, JSONObject jSONObject) {
        C3955tD c3955tD = this.f35351n;
        if (c3955tD == null) {
            return ND.f27257u;
        }
        return QC.t(c3955tD, new C2645Jj(2, this, str, jSONObject), this.f35343e);
    }

    public final synchronized void b(String str, InterfaceC3272gc interfaceC3272gc) {
        C3955tD c3955tD = this.f35351n;
        if (c3955tD == null) {
            return;
        }
        S0.s sVar = new S0.s(this, str, interfaceC3272gc);
        c3955tD.a(new LD(0, c3955tD, sVar), this.f35343e);
    }

    public final synchronized void c(String str, InterfaceC3272gc interfaceC3272gc) {
        C3955tD c3955tD = this.f35351n;
        if (c3955tD == null) {
            return;
        }
        C3067cm c3067cm = new C3067cm(this, str, interfaceC3272gc);
        c3955tD.a(new LD(0, c3955tD, c3067cm), this.f35343e);
    }

    public final synchronized void d(Map map) {
        C3955tD c3955tD = this.f35351n;
        if (c3955tD == null) {
            return;
        }
        C3680o7 c3680o7 = new C3680o7(this, map);
        c3955tD.a(new LD(0, c3955tD, c3680o7), this.f35343e);
    }
}
