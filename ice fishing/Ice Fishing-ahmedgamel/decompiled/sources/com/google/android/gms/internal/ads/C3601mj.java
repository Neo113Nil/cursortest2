package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3601mj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33341a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f33342b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f33343c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f33344d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f33345e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f33346f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3534lN f33347g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f33348h;
    public final InterfaceC3534lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3534lN f33349j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC3534lN f33350k;

    public C3601mj(C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, C3010bi c3010bi2, C4031ui c4031ui, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, InterfaceC3534lN interfaceC3534lN) {
        this.f33341a = 1;
        this.f33345e = c3010bi;
        this.f33342b = c3266gN;
        this.f33343c = c3266gN2;
        this.f33346f = c3010bi2;
        this.f33344d = c3266gN3;
        this.f33347g = c3266gN4;
        this.f33348h = c3266gN5;
        this.i = c3266gN6;
        this.f33349j = c3266gN7;
        this.f33350k = interfaceC3534lN;
    }

    public C3547lj a() {
        S0.q b9 = ((C2747Pj) this.f33345e).b();
        Context context = (Context) this.f33342b.f();
        Tt tt = (Tt) ((C3763pj) this.f33346f).f33908b.f25832w;
        AbstractC3364iD.j(tt);
        View view = (View) ((C3763pj) this.f33347g).f33908b.f25831v;
        AbstractC3364iD.j(view);
        C2590Gf c2590Gf = ((C3763pj) this.f33348h).f33908b;
        InterfaceC2560Ej interfaceC2560Ej = (InterfaceC2560Ej) ((C3763pj) this.i).f33908b.f25830u;
        C2495Am c2495Am = (C2495Am) ((C3121dm) this.f33349j).f30617b.f30365u;
        AbstractC3364iD.j(c2495Am);
        return new C3547lj(b9, context, tt, view, (InterfaceC4084vh) c2590Gf.f25833x, interfaceC2560Ej, c2495Am, (C2596Gl) this.f33343c.f(), C3266gN.b((Yr) this.f33350k), (Executor) this.f33344d.f());
    }

    public C3661np b() {
        C3332hi c3332hi = (C3332hi) ((C3374iN) this.f33345e).f31812a;
        Context a9 = ((C3010bi) this.f33346f).a();
        C5189a b9 = ((C3010bi) this.f33347g).b();
        C3075cu a10 = ((C3818qk) this.f33348h).a();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3661np(c3332hi, a9, b9, a10, c3383ig, (String) ((InterfaceC3320hN) this.i).f(), (Vu) this.f33342b.f(), (C3069co) this.f33343c.f(), new C2889Yb(16), (ScheduledExecutorService) this.f33344d.f(), (C4260yv) ((C3266gN) this.f33349j).f(), new C2959al(((C3979tk) this.f33350k).f35161b.f()));
    }

    public C2839Uq c() {
        C3332hi c3332hi = (C3332hi) ((C3374iN) this.f33345e).f31812a;
        C3710ok a9 = ((C3818qk) this.f33346f).f34159b.a();
        C3771pr c3771pr = (C3771pr) this.f33347g;
        C3926sl c3926sl = (C3926sl) this.f33348h;
        C3121dm c3121dm = (C3121dm) this.i;
        return new C2839Uq(c3332hi, a9, c3771pr.f33934b, c3926sl.f34901b, c3121dm.f30617b, (C2898Yk) ((C2526Cj) this.f33349j).f24946b.f2969u, (FrameLayout) ((Ux) ((C4031ui) this.f33350k).f35333b).f28847u, (C3441jl) this.f33342b.f(), (Xq) this.f33343c.f(), (C3608mq) this.f33344d.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f33341a) {
            case 0:
                return a();
            case 1:
                return new CallableC3982tn(((C3010bi) this.f33345e).a(), (Executor) this.f33342b.f(), (C3464k7) this.f33343c.f(), ((C3010bi) this.f33346f).b(), C4031ui.b(), (C2821Tp) this.f33344d.f(), (C4260yv) ((C3266gN) this.f33347g).f(), (C3230fo) ((C3266gN) this.f33348h).f(), (BinderC2903Yp) ((C3266gN) this.i).f(), (C3236fu) ((C3266gN) this.f33349j).f(), (C3334hk) this.f33350k.f());
            case 2:
                return new C4198xn((C3925sk) this.f33342b.f(), (C2595Gk) this.f33343c.f(), (C2714Nk) this.f33344d.f(), (C2782Rk) ((C3266gN) this.f33345e).f(), (C3388il) ((C3266gN) this.f33346f).f(), (C2562El) ((C3266gN) this.f33347g).f(), (C3230fo) ((C3266gN) this.f33348h).f(), (C4260yv) ((C3266gN) this.i).f(), (C2821Tp) ((C3266gN) this.f33349j).f(), (C2712Ni) ((C3266gN) this.f33350k).f());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new Vy((RD) this.f33342b.f(), (Xy) this.f33343c.f(), (C3241fz) this.f33344d.f(), (EnumC3616my) ((C3374iN) this.f33345e).f31812a, (String) ((C3374iN) this.f33346f).f31812a, (C4002u6) ((C3374iN) this.f33347g).f31812a, (C3588mN) this.f33348h, (C3588mN) this.i, (C3588mN) this.f33349j, (C4006uA) ((C3266gN) this.f33350k).f());
        }
    }

    public C3601mj(C2747Pj c2747Pj, C3266gN c3266gN, C3763pj c3763pj, C3763pj c3763pj2, C3763pj c3763pj3, C3763pj c3763pj4, C3121dm c3121dm, C3266gN c3266gN2, Yr yr, C3266gN c3266gN3) {
        this.f33341a = 0;
        this.f33345e = c2747Pj;
        this.f33342b = c3266gN;
        this.f33346f = c3763pj;
        this.f33347g = c3763pj2;
        this.f33348h = c3763pj3;
        this.i = c3763pj4;
        this.f33349j = c3121dm;
        this.f33343c = c3266gN2;
        this.f33350k = yr;
        this.f33344d = c3266gN3;
    }

    public /* synthetic */ C3601mj(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, Object obj, Object obj2, Object obj3, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, InterfaceC3534lN interfaceC3534lN3, C3266gN c3266gN4, int i) {
        this.f33341a = i;
        this.f33342b = c3266gN;
        this.f33343c = c3266gN2;
        this.f33344d = c3266gN3;
        this.f33345e = (InterfaceC3534lN) obj;
        this.f33346f = (InterfaceC3534lN) obj2;
        this.f33347g = (InterfaceC3534lN) obj3;
        this.f33348h = interfaceC3534lN;
        this.i = interfaceC3534lN2;
        this.f33349j = interfaceC3534lN3;
        this.f33350k = c3266gN4;
    }

    public C3601mj(C3374iN c3374iN, C3010bi c3010bi, C3010bi c3010bi2, C3818qk c3818qk, InterfaceC3320hN interfaceC3320hN, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3979tk c3979tk) {
        this.f33341a = 3;
        this.f33345e = c3374iN;
        this.f33346f = c3010bi;
        this.f33347g = c3010bi2;
        this.f33348h = c3818qk;
        this.i = interfaceC3320hN;
        this.f33342b = c3266gN;
        this.f33343c = c3266gN2;
        this.f33344d = c3266gN3;
        this.f33349j = c3266gN4;
        this.f33350k = c3979tk;
    }

    public C3601mj(C3374iN c3374iN, C3818qk c3818qk, C3771pr c3771pr, C3926sl c3926sl, C3121dm c3121dm, C2526Cj c2526Cj, C4031ui c4031ui, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3) {
        this.f33341a = 4;
        this.f33345e = c3374iN;
        this.f33346f = c3818qk;
        this.f33347g = c3771pr;
        this.f33348h = c3926sl;
        this.i = c3121dm;
        this.f33349j = c2526Cj;
        this.f33350k = c4031ui;
        this.f33342b = c3266gN;
        this.f33343c = c3266gN2;
        this.f33344d = c3266gN3;
    }
}
