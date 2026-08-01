package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3578mj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32561a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f32562b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f32563c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f32564d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f32565e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f32566f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3511lN f32567g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f32568h;
    public final InterfaceC3511lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3511lN f32569j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC3511lN f32570k;

    public C3578mj(C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, C2987bi c2987bi2, C4008ui c4008ui, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, InterfaceC3511lN interfaceC3511lN) {
        this.f32561a = 1;
        this.f32565e = c2987bi;
        this.f32562b = c3243gN;
        this.f32563c = c3243gN2;
        this.f32566f = c2987bi2;
        this.f32564d = c3243gN3;
        this.f32567g = c3243gN4;
        this.f32568h = c3243gN5;
        this.i = c3243gN6;
        this.f32569j = c3243gN7;
        this.f32570k = interfaceC3511lN;
    }

    public C3524lj a() {
        S0.q b9 = ((C2727Pj) this.f32565e).b();
        Context context = (Context) this.f32562b.f();
        Tt tt = (Tt) ((C3740pj) this.f32566f).f33119b.f25044w;
        AbstractC3341iD.j(tt);
        View view = (View) ((C3740pj) this.f32567g).f33119b.f25043v;
        AbstractC3341iD.j(view);
        C2570Gf c2570Gf = ((C3740pj) this.f32568h).f33119b;
        InterfaceC2540Ej interfaceC2540Ej = (InterfaceC2540Ej) ((C3740pj) this.i).f33119b.f25042u;
        C4282zm c4282zm = (C4282zm) ((C3044cm) this.f32569j).f29580b.f29323u;
        AbstractC3341iD.j(c4282zm);
        return new C3524lj(b9, context, tt, view, (InterfaceC4061vh) c2570Gf.f25045x, interfaceC2540Ej, c4282zm, (C2559Fl) this.f32563c.f(), C3243gN.b((Yr) this.f32570k), (Executor) this.f32564d.f());
    }

    public C3638np b() {
        C3309hi c3309hi = (C3309hi) ((C3351iN) this.f32565e).f31039a;
        Context a9 = ((C2987bi) this.f32566f).a();
        C5110a b9 = ((C2987bi) this.f32567g).b();
        C3052cu a10 = ((C3795qk) this.f32568h).a();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3638np(c3309hi, a9, b9, a10, c3360ig, (String) ((InterfaceC3297hN) this.i).f(), (Vu) this.f32562b.f(), (C2993bo) this.f32563c.f(), new C2866Yb(16), (ScheduledExecutorService) this.f32564d.f(), (C4237yv) ((C3243gN) this.f32569j).f(), new C2936al(((C3956tk) this.f32570k).f34382b.f()));
    }

    public Uq c() {
        C3309hi c3309hi = (C3309hi) ((C3351iN) this.f32565e).f31039a;
        C3687ok a9 = ((C3795qk) this.f32566f).f33377b.a();
        C3748pr c3748pr = (C3748pr) this.f32567g;
        C3903sl c3903sl = (C3903sl) this.f32568h;
        C3044cm c3044cm = (C3044cm) this.i;
        return new Uq(c3309hi, a9, c3748pr.f33148b, c3903sl.f34134b, c3044cm.f29580b, (C2875Yk) ((C2506Cj) this.f32569j).f24211b.f2840u, (FrameLayout) ((Ux) ((C4008ui) this.f32570k).f34561b).f28050u, (C3418jl) this.f32562b.f(), (Xq) this.f32563c.f(), (C3585mq) this.f32564d.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f32561a) {
            case 0:
                return a();
            case 1:
                return new CallableC3905sn(((C2987bi) this.f32565e).a(), (Executor) this.f32562b.f(), (C3441k7) this.f32563c.f(), ((C2987bi) this.f32566f).b(), C4008ui.b(), (C2800Tp) this.f32564d.f(), (C4237yv) ((C3243gN) this.f32567g).f(), (C3153eo) ((C3243gN) this.f32568h).f(), (BinderC2880Yp) ((C3243gN) this.i).f(), (C3213fu) ((C3243gN) this.f32569j).f(), (C3311hk) this.f32570k.f());
            case 2:
                return new C4121wn((C3902sk) this.f32562b.f(), (C2575Gk) this.f32563c.f(), (C2694Nk) this.f32564d.f(), (C2762Rk) ((C3243gN) this.f32565e).f(), (C3365il) ((C3243gN) this.f32566f).f(), (C2525Dl) ((C3243gN) this.f32567g).f(), (C3153eo) ((C3243gN) this.f32568h).f(), (C4237yv) ((C3243gN) this.i).f(), (C2800Tp) ((C3243gN) this.f32569j).f(), (C2692Ni) ((C3243gN) this.f32570k).f());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new Vy((RD) this.f32562b.f(), (Xy) this.f32563c.f(), (C3218fz) this.f32564d.f(), (EnumC3593my) ((C3351iN) this.f32565e).f31039a, (String) ((C3351iN) this.f32566f).f31039a, (C3979u6) ((C3351iN) this.f32567g).f31039a, (C3565mN) this.f32568h, (C3565mN) this.i, (C3565mN) this.f32569j, (C3983uA) ((C3243gN) this.f32570k).f());
        }
    }

    public C3578mj(C2727Pj c2727Pj, C3243gN c3243gN, C3740pj c3740pj, C3740pj c3740pj2, C3740pj c3740pj3, C3740pj c3740pj4, C3044cm c3044cm, C3243gN c3243gN2, Yr yr, C3243gN c3243gN3) {
        this.f32561a = 0;
        this.f32565e = c2727Pj;
        this.f32562b = c3243gN;
        this.f32566f = c3740pj;
        this.f32567g = c3740pj2;
        this.f32568h = c3740pj3;
        this.i = c3740pj4;
        this.f32569j = c3044cm;
        this.f32563c = c3243gN2;
        this.f32570k = yr;
        this.f32564d = c3243gN3;
    }

    public /* synthetic */ C3578mj(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, Object obj, Object obj2, Object obj3, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, InterfaceC3511lN interfaceC3511lN3, C3243gN c3243gN4, int i) {
        this.f32561a = i;
        this.f32562b = c3243gN;
        this.f32563c = c3243gN2;
        this.f32564d = c3243gN3;
        this.f32565e = (InterfaceC3511lN) obj;
        this.f32566f = (InterfaceC3511lN) obj2;
        this.f32567g = (InterfaceC3511lN) obj3;
        this.f32568h = interfaceC3511lN;
        this.i = interfaceC3511lN2;
        this.f32569j = interfaceC3511lN3;
        this.f32570k = c3243gN4;
    }

    public C3578mj(C3351iN c3351iN, C2987bi c2987bi, C2987bi c2987bi2, C3795qk c3795qk, InterfaceC3297hN interfaceC3297hN, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3956tk c3956tk) {
        this.f32561a = 3;
        this.f32565e = c3351iN;
        this.f32566f = c2987bi;
        this.f32567g = c2987bi2;
        this.f32568h = c3795qk;
        this.i = interfaceC3297hN;
        this.f32562b = c3243gN;
        this.f32563c = c3243gN2;
        this.f32564d = c3243gN3;
        this.f32569j = c3243gN4;
        this.f32570k = c3956tk;
    }

    public C3578mj(C3351iN c3351iN, C3795qk c3795qk, C3748pr c3748pr, C3903sl c3903sl, C3044cm c3044cm, C2506Cj c2506Cj, C4008ui c4008ui, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3) {
        this.f32561a = 4;
        this.f32565e = c3351iN;
        this.f32566f = c3795qk;
        this.f32567g = c3748pr;
        this.f32568h = c3903sl;
        this.i = c3044cm;
        this.f32569j = c2506Cj;
        this.f32570k = c4008ui;
        this.f32562b = c3243gN;
        this.f32563c = c3243gN2;
        this.f32564d = c3243gN3;
    }
}
