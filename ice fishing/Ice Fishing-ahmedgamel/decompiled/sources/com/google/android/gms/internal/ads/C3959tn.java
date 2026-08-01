package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3959tn {

    /* renamed from: b, reason: collision with root package name */
    public final k8.b f34387b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f34388c;

    /* renamed from: d, reason: collision with root package name */
    public final C3153eo f34389d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34390e;

    /* renamed from: f, reason: collision with root package name */
    public final C3441k7 f34391f;

    /* renamed from: g, reason: collision with root package name */
    public final C5110a f34392g;
    public final C2800Tp i;

    /* renamed from: j, reason: collision with root package name */
    public final C4237yv f34394j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC2880Yp f34395k;

    /* renamed from: l, reason: collision with root package name */
    public final C3213fu f34396l;

    /* renamed from: m, reason: collision with root package name */
    public final C3311hk f34397m;

    /* renamed from: n, reason: collision with root package name */
    public C3932tD f34398n;

    /* renamed from: a, reason: collision with root package name */
    public final C3744pn f34386a = new C3744pn();

    /* renamed from: h, reason: collision with root package name */
    public final C3088dc f34393h = new C3088dc();

    public C3959tn(CallableC3905sn callableC3905sn) {
        this.f34388c = callableC3905sn.f34137b;
        this.f34390e = callableC3905sn.f34140e;
        this.f34391f = callableC3905sn.f34141f;
        this.f34392g = callableC3905sn.f34142g;
        this.f34387b = callableC3905sn.f34136a;
        this.i = callableC3905sn.f34139d;
        this.f34394j = callableC3905sn.f34143h;
        this.f34389d = callableC3905sn.f34138c;
        this.f34395k = callableC3905sn.i;
        this.f34396l = callableC3905sn.f34144j;
        this.f34397m = callableC3905sn.f34145k;
    }

    public final synchronized N3.a a(String str, JSONObject jSONObject) {
        C3932tD c3932tD = this.f34398n;
        if (c3932tD == null) {
            return ND.f26473u;
        }
        return QC.t(c3932tD, new C2625Jj(2, this, str, jSONObject), this.f34390e);
    }

    public final synchronized void b(String str, InterfaceC3249gc interfaceC3249gc) {
        C3932tD c3932tD = this.f34398n;
        if (c3932tD == null) {
            return;
        }
        S0.s sVar = new S0.s(this, str, interfaceC3249gc);
        c3932tD.a(new LD(0, c3932tD, sVar), this.f34390e);
    }

    public final synchronized void c(String str, InterfaceC3249gc interfaceC3249gc) {
        C3932tD c3932tD = this.f34398n;
        if (c3932tD == null) {
            return;
        }
        C2991bm c2991bm = new C2991bm(this, str, interfaceC3249gc);
        c3932tD.a(new LD(0, c3932tD, c2991bm), this.f34390e);
    }

    public final synchronized void d(Map map) {
        C3932tD c3932tD = this.f34398n;
        if (c3932tD == null) {
            return;
        }
        C3657o7 c3657o7 = new C3657o7(this, map);
        c3932tD.a(new LD(0, c3932tD, c3657o7), this.f34390e);
    }
}
