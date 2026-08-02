package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o1.C4797a;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3927sm implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34902a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f34903b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f34904c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f34905d;

    /* renamed from: e, reason: collision with root package name */
    public final C3010bi f34906e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f34907f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f34908g;

    /* renamed from: h, reason: collision with root package name */
    public final C3266gN f34909h;
    public final C3266gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3266gN f34910j;

    /* renamed from: k, reason: collision with root package name */
    public final C3266gN f34911k;

    /* renamed from: l, reason: collision with root package name */
    public final C3266gN f34912l;

    /* renamed from: m, reason: collision with root package name */
    public final C3266gN f34913m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3320hN f34914n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC3320hN f34915o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC3534lN f34916p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC3534lN f34917q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC3534lN f34918r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3534lN f34919s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC3534lN f34920t;

    public C3927sm(C2747Pj c2747Pj, C3266gN c3266gN, C4031ui c4031ui, InterfaceC3320hN interfaceC3320hN, C2563Em c2563Em, InterfaceC3534lN interfaceC3534lN, C3121dm c3121dm, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3870rj c3870rj, C3266gN c3266gN7, C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN8, C3266gN c3266gN9, C3266gN c3266gN10) {
        this.f34914n = c2747Pj;
        this.f34903b = c3266gN;
        this.f34915o = c4031ui;
        this.f34916p = interfaceC3320hN;
        this.f34917q = c2563Em;
        this.f34904c = interfaceC3534lN;
        this.f34918r = c3121dm;
        this.f34905d = c3266gN2;
        this.f34907f = c3266gN3;
        this.f34908g = c3266gN4;
        this.f34909h = c3266gN5;
        this.i = c3266gN6;
        this.f34919s = c3870rj;
        this.f34910j = c3266gN7;
        this.f34906e = c3010bi;
        this.f34920t = c3010bi2;
        this.f34911k = c3266gN8;
        this.f34912l = c3266gN9;
        this.f34913m = c3266gN10;
    }

    public C3122dn a() {
        Context context = (Context) this.f34903b.f();
        C2868Wm c2868Wm = (C2868Wm) this.f34904c.f();
        C3464k7 c3464k7 = (C3464k7) this.f34905d.f();
        C5189a b9 = this.f34906e.b();
        Object obj = ((C4031ui) this.f34914n).f35333b;
        C4797a b10 = C4031ui.b();
        C3091d9 c3091d9 = (C3091d9) this.f34907f.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3122dn(context, c2868Wm, c3464k7, b9, b10, c3091d9, c3383ig, ((C3818qk) this.f34915o).a(), (C3390in) this.f34908g.f(), (C2649Jn) this.f34909h.f(), (ScheduledExecutorService) this.i.f(), (C3230fo) this.f34910j.f(), (C4260yv) this.f34911k.f(), (C2821Tp) this.f34912l.f(), (C4252yn) this.f34913m.f(), (BinderC2903Yp) ((C3266gN) this.f34916p).f(), (C3236fu) ((C3266gN) this.f34917q).f(), (C3069co) ((C3266gN) this.f34918r).f(), (C3768po) ((C3266gN) this.f34919s).f(), (C3334hk) this.f34920t.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f34902a) {
            case 0:
                S0.q b9 = ((C2747Pj) this.f34914n).b();
                Executor executor = (Executor) this.f34903b.f();
                C4089vm a9 = ((C4031ui) this.f34915o).a();
                InterfaceC4251ym interfaceC4251ym = (InterfaceC4251ym) ((InterfaceC3320hN) this.f34916p).f();
                C2546Dm a10 = ((C2563Em) this.f34917q).a();
                C4197xm c4197xm = (C4197xm) this.f34904c.f();
                C2495Am c2495Am = (C2495Am) ((C3121dm) this.f34918r).f30617b.f30365u;
                AbstractC3364iD.j(c2495Am);
                InterfaceC3158eN b10 = C3266gN.b(this.f34905d);
                InterfaceC3158eN b11 = C3266gN.b(this.f34907f);
                InterfaceC3158eN b12 = C3266gN.b(this.f34908g);
                InterfaceC3158eN b13 = C3266gN.b(this.f34909h);
                InterfaceC3158eN b14 = C3266gN.b(this.i);
                C3870rj c3870rj = (C3870rj) this.f34919s;
                C2607Hf c2607Hf = new C2607Hf(c3870rj.f34464b.a(), c3870rj.f34465c.a().f30396g);
                C3464k7 c3464k7 = (C3464k7) this.f34910j.f();
                C5189a b15 = this.f34906e.b();
                Context a11 = ((C3010bi) this.f34920t).a();
                C3981tm c3981tm = (C3981tm) this.f34911k.f();
                Er er = (Er) this.f34912l.f();
                return new C3873rm(b9, executor, a9, interfaceC4251ym, a10, c4197xm, c2495Am, b10, b11, b12, b13, b14, c2607Hf, c3464k7, b15, a11, c3981tm, er);
            default:
                return a();
        }
    }

    public C3927sm(C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN2, C3010bi c3010bi, C4031ui c4031ui, C3266gN c3266gN3, C3818qk c3818qk, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, C3266gN c3266gN8, C3266gN c3266gN9, C3266gN c3266gN10, C3266gN c3266gN11, C3266gN c3266gN12, C3266gN c3266gN13, C3266gN c3266gN14, InterfaceC3534lN interfaceC3534lN2) {
        this.f34903b = c3266gN;
        this.f34904c = interfaceC3534lN;
        this.f34905d = c3266gN2;
        this.f34906e = c3010bi;
        this.f34914n = c4031ui;
        this.f34907f = c3266gN3;
        this.f34915o = c3818qk;
        this.f34908g = c3266gN4;
        this.f34909h = c3266gN5;
        this.i = c3266gN6;
        this.f34910j = c3266gN7;
        this.f34911k = c3266gN8;
        this.f34912l = c3266gN9;
        this.f34913m = c3266gN10;
        this.f34916p = c3266gN11;
        this.f34917q = c3266gN12;
        this.f34918r = c3266gN13;
        this.f34919s = c3266gN14;
        this.f34920t = interfaceC3534lN2;
    }
}
