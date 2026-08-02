package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import s2.InterfaceC4964x;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4248yj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36002a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f36003b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f36004c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f36005d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f36006e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f36007f;

    public C4248yj(C3010bi c3010bi, C3010bi c3010bi2, C2696Mj c2696Mj, InterfaceC3320hN interfaceC3320hN, C3266gN c3266gN) {
        this.f36002a = 8;
        this.f36005d = c3010bi;
        this.f36007f = c3010bi2;
        this.f36004c = c2696Mj;
        this.f36006e = interfaceC3320hN;
        this.f36003b = c3266gN;
    }

    public BinderC3871rk a() {
        return new BinderC3871rk(((C2696Mj) this.f36004c).a(), (String) ((C2696Mj) this.f36005d).f27111b.f32447w, (C3608mq) this.f36003b.f(), ((C2696Mj) this.f36006e).f27111b.r(), (String) ((C3266gN) this.f36007f).f());
    }

    public C2753Pp b() {
        return new C2753Pp(((C3010bi) this.f36005d).a(), ((C2747Pj) this.f36006e).a(), (C2719Np) this.f36003b.f(), ((C2709Nf) this.f36004c).a(), ((C2911Zh) this.f36007f).b());
    }

    public Xs c() {
        C2889Yb c2889Yb = new C2889Yb(18);
        Context a9 = ((C3010bi) this.f36005d).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f36003b.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        I1.a aVar = ((C3021bt) this.f36006e).f30130b;
        return new Xs(c2889Yb, a9, scheduledExecutorService, c3383ig, aVar.f1303u, ((C2759Qe) ((C3021bt) this.f36004c).f30130b.f1304v).f27824E, ((C2759Qe) ((C3021bt) this.f36007f).f30130b.f1304v).f27823D);
    }

    public C3074ct d() {
        C3061cg c3061cg = (C3061cg) this.f36003b.f();
        boolean z6 = ((C2759Qe) ((C3021bt) this.f36005d).f30130b.f1304v).f27823D;
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        AbstractC3364iD.j(((C2759Qe) ((C3021bt) this.f36006e).f30130b.f1304v).f27829w);
        return new C3074ct(c3061cg, z6, c3383ig, (ScheduledExecutorService) ((C3266gN) this.f36004c).f(), ((C3021bt) this.f36007f).a().intValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f36002a) {
            case 0:
                return new C4194xj(((C3010bi) this.f36005d).a(), (InterfaceC4084vh) ((C3763pj) this.f36006e).f33908b.f25833x, ((C2696Mj) this.f36004c).a(), ((C3010bi) this.f36007f).b(), (C3178eq) this.f36003b.f());
            case 1:
                C2527Ck c2527Ck = (C2527Ck) this.f36003b.f();
                St a9 = ((C2696Mj) this.f36004c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3266gN) this.f36005d).f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3280gk(c2527Ck, a9, scheduledExecutorService, c3383ig, (String) ((C2696Mj) this.f36006e).f27111b.f32447w, (C2833Uk) ((C3266gN) this.f36007f).f());
            case 2:
                return new C3548lk(((C2696Mj) this.f36005d).b(), ((C2696Mj) this.f36004c).a(), (V2.a) this.f36003b.f(), (C3230fo) ((C3266gN) this.f36006e).f(), (ScheduledExecutorService) ((C3266gN) this.f36007f).f());
            case 3:
                return a();
            case 4:
                return new C2899Yl(((C3010bi) this.f36005d).a(), (InterfaceC4084vh) ((C2766Ql) this.f36006e).f27848b.f2970v, ((C2696Mj) this.f36004c).a(), ((C3010bi) this.f36007f).b(), (C3178eq) this.f36003b.f());
            case 5:
                Map f2 = ((C3426jN) this.f36005d).f();
                Map f9 = ((C3426jN) this.f36006e).f();
                Map f10 = ((C3426jN) this.f36004c).f();
                C2495Am c2495Am = (C2495Am) ((C3121dm) this.f36007f).f30617b.f30365u;
                AbstractC3364iD.j(c2495Am);
                return new C3014bm(f2, f9, f10, this.f36003b, c2495Am);
            case 6:
                Context a10 = ((C3010bi) this.f36005d).a();
                String packageName = ((C3063ci) this.f36006e).f30321b.a().getPackageName();
                AbstractC3364iD.j(packageName);
                C5189a b9 = ((C3010bi) this.f36007f).b();
                EnumC3144e9 enumC3144e9 = (EnumC3144e9) this.f36004c.f();
                String str = (String) this.f36003b.f();
                C3091d9 c3091d9 = new C3091d9(new com.bumptech.glide.manager.o(a10, 6));
                C4005u9 B3 = C4059v9.B();
                int i = b9.f41846u;
                B3.h();
                ((C4059v9) B3.f28504u).C(i);
                int i4 = b9.f41847v;
                B3.h();
                ((C4059v9) B3.f28504u).D(i4);
                int i6 = true != b9.f41848w ? 2 : 0;
                B3.h();
                ((C4059v9) B3.f28504u).A(i6);
                c3091d9.a(new C2590Gf(enumC3144e9, packageName, (C4059v9) B3.j(), str, 15));
                return c3091d9;
            case 7:
                return b();
            case 8:
                return new C3178eq(((C3010bi) this.f36005d).a(), ((C3010bi) this.f36007f).b(), ((C2696Mj) this.f36004c).a(), (InterfaceC4084vh) ((InterfaceC3320hN) this.f36006e).f(), (C3230fo) this.f36003b.f());
            case 9:
                return new C2822Tq((C3332hi) ((C3374iN) this.f36005d).f31812a, ((C3818qk) this.f36006e).f34159b.a(), ((C3926sl) this.f36004c).f34901b, (Xq) this.f36003b.f(), (C3608mq) ((C3266gN) this.f36007f).f());
            case 10:
                V2.a aVar = (V2.a) this.f36003b.f();
                C3439jj c3439jj = (C3439jj) this.f36006e;
                C3504ku c3504ku = new C3504ku(14, (C3450ju) c3439jj.f32091b.f(), (C2768Qn) c3439jj.f32092c.f(), (C3230fo) c3439jj.f32093d.f());
                C3608mq c3608mq = (C3608mq) ((C3266gN) this.f36004c).f();
                C4260yv c4260yv = (C4260yv) ((C3266gN) this.f36007f).f();
                Xq xq = (Xq) ((C3680o7) this.f36005d).f33649u;
                return xq != null ? xq : new Xq(aVar, c3504ku, c3608mq, c4260yv);
            case 11:
                return new C2550Dq((Context) this.f36003b.f(), (C3600mi) ((C3374iN) this.f36005d).f31812a, (Lu) ((C3266gN) this.f36006e).f(), (RD) ((C3266gN) this.f36004c).f(), (C3915sa) ((C3771pr) this.f36007f).f33934b.f33740u);
            case 12:
                return new BinderC4202xr((Context) this.f36003b.f(), (InterfaceC4964x) ((C3121dm) this.f36005d).f30617b.f30366v, ((C3818qk) this.f36006e).a(), ((C3601mj) ((C4031ui) this.f36004c).f35333b).a(), (C3230fo) ((C3266gN) this.f36007f).f());
            case 13:
                return c();
            default:
                return d();
        }
    }

    public C4248yj(C3010bi c3010bi, C3063ci c3063ci, C3010bi c3010bi2, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN) {
        this.f36002a = 6;
        this.f36005d = c3010bi;
        this.f36006e = c3063ci;
        this.f36007f = c3010bi2;
        this.f36004c = interfaceC3534lN;
        this.f36003b = c3266gN;
    }

    public C4248yj(C3010bi c3010bi, C2747Pj c2747Pj, C3266gN c3266gN, C2709Nf c2709Nf, C2911Zh c2911Zh) {
        this.f36002a = 7;
        this.f36005d = c3010bi;
        this.f36006e = c2747Pj;
        this.f36003b = c3266gN;
        this.f36004c = c2709Nf;
        this.f36007f = c2911Zh;
    }

    public /* synthetic */ C4248yj(C3010bi c3010bi, InterfaceC3320hN interfaceC3320hN, C2696Mj c2696Mj, C3010bi c3010bi2, C3266gN c3266gN, int i) {
        this.f36002a = i;
        this.f36005d = c3010bi;
        this.f36006e = interfaceC3320hN;
        this.f36004c = c2696Mj;
        this.f36007f = c3010bi2;
        this.f36003b = c3266gN;
    }

    public C4248yj(C2696Mj c2696Mj, C2696Mj c2696Mj2, C3266gN c3266gN, C2696Mj c2696Mj3, C3266gN c3266gN2) {
        this.f36002a = 3;
        this.f36004c = c2696Mj;
        this.f36005d = c2696Mj2;
        this.f36003b = c3266gN;
        this.f36006e = c2696Mj3;
        this.f36007f = c3266gN2;
    }

    public C4248yj(C2696Mj c2696Mj, C2696Mj c2696Mj2, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3) {
        this.f36002a = 2;
        this.f36005d = c2696Mj;
        this.f36004c = c2696Mj2;
        this.f36003b = c3266gN;
        this.f36006e = c3266gN2;
        this.f36007f = c3266gN3;
    }

    public C4248yj(C3266gN c3266gN, C2696Mj c2696Mj, C3266gN c3266gN2, C2696Mj c2696Mj2, C3266gN c3266gN3) {
        this.f36002a = 1;
        this.f36003b = c3266gN;
        this.f36004c = c2696Mj;
        this.f36005d = c3266gN2;
        this.f36006e = c2696Mj2;
        this.f36007f = c3266gN3;
    }

    public /* synthetic */ C4248yj(C3266gN c3266gN, InterfaceC3320hN interfaceC3320hN, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, InterfaceC3534lN interfaceC3534lN3, int i) {
        this.f36002a = i;
        this.f36003b = c3266gN;
        this.f36005d = interfaceC3320hN;
        this.f36006e = interfaceC3534lN;
        this.f36004c = interfaceC3534lN2;
        this.f36007f = interfaceC3534lN3;
    }

    public /* synthetic */ C4248yj(InterfaceC3320hN interfaceC3320hN, InterfaceC3320hN interfaceC3320hN2, InterfaceC3320hN interfaceC3320hN3, C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, int i) {
        this.f36002a = i;
        this.f36005d = interfaceC3320hN;
        this.f36006e = interfaceC3320hN2;
        this.f36004c = interfaceC3320hN3;
        this.f36003b = c3266gN;
        this.f36007f = interfaceC3534lN;
    }

    public /* synthetic */ C4248yj(Object obj, C3266gN c3266gN, InterfaceC3320hN interfaceC3320hN, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, int i) {
        this.f36002a = i;
        this.f36005d = obj;
        this.f36003b = c3266gN;
        this.f36006e = interfaceC3320hN;
        this.f36004c = interfaceC3534lN;
        this.f36007f = interfaceC3534lN2;
    }
}
