package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3119dk implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30603a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f30604b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f30605c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30606d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f30607e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f30608f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3534lN f30609g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f30610h;

    public C3119dk(C3010bi c3010bi, C3818qk c3818qk, C3010bi c3010bi2, C2911Zh c2911Zh, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3) {
        this.f30603a = 0;
        this.f30607e = c3010bi;
        this.f30608f = c3818qk;
        this.f30609g = c3010bi2;
        this.f30610h = c2911Zh;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30606d = c3266gN3;
    }

    public C4147wq a() {
        return new C4147wq((C3600mi) ((C3374iN) this.f30607e).f31812a, (Context) this.f30604b.f(), (Executor) this.f30605c.f(), (C2649Jn) ((C3266gN) this.f30606d).f(), ((C3818qk) this.f30608f).a(), (UA) ((C3266gN) this.f30609g).f(), (C3069co) ((C3266gN) this.f30610h).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f30603a) {
            case 0:
                return new C3065ck(((C3010bi) this.f30607e).a(), ((C3818qk) this.f30608f).a(), ((C3010bi) this.f30609g).b(), ((C2911Zh) this.f30610h).b(), (C2531Co) this.f30604b.f(), (Wu) this.f30605c.f(), (C2786Ro) ((C3266gN) this.f30606d).f());
            case 1:
                return new C3494kk((Context) this.f30604b.f(), ((C2696Mj) this.f30607e).a(), (InterfaceC4084vh) ((InterfaceC3320hN) this.f30608f).f(), ((C2696Mj) this.f30609g).b(), (V2.a) this.f30605c.f(), (C3230fo) ((C3266gN) this.f30606d).f(), (C3334hk) this.f30610h.f());
            case 2:
                return new C2885Xn(((C3010bi) this.f30607e).a(), (C3450ju) this.f30604b.f(), (C3230fo) this.f30605c.f(), ((C2696Mj) this.f30608f).b(), ((C2696Mj) this.f30609g).a(), (C2821Tp) ((C3266gN) this.f30606d).f(), (String) ((InterfaceC3320hN) this.f30610h).f());
            case 3:
                return a();
            case 4:
                C3224fi c3224fi = (C3224fi) ((C3374iN) this.f30607e).f31812a;
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2720Nq(c3224fi, c3383ig, ((C2556Ef) this.f30608f).b(), (C3612mu) this.f30604b.f(), (C4252yn) this.f30605c.f(), (C3069co) ((C3266gN) this.f30606d).f(), ((C3010bi) this.f30609g).b(), (Context) ((C3266gN) this.f30610h).f(), new C2889Yb(17));
            case 5:
                return new BinderC3665nt((C3332hi) ((C3374iN) this.f30607e).f31812a, (Context) ((C3374iN) this.f30608f).f31812a, (String) ((C3374iN) this.f30610h).f31812a, (C3449jt) this.f30604b.f(), (C3289gt) this.f30605c.f(), ((C3010bi) this.f30609g).b(), (C3230fo) ((C3266gN) this.f30606d).f());
            case 6:
                return new Yx((By) this.f30604b.f(), (Py) this.f30605c.f(), (C3521lA) ((C3266gN) this.f30606d).f(), (C4006uA) ((C3266gN) this.f30607e).f(), (InterfaceC3832qy) ((C3266gN) this.f30608f).f(), C3266gN.b((C3266gN) this.f30609g), (C2972ay) ((C3374iN) this.f30610h).f31812a);
            case 7:
                return new Qy((ExecutorService) ((C3374iN) this.f30607e).f31812a, C3266gN.b(this.f30604b), C3266gN.b(this.f30605c), (C3521lA) ((C3266gN) this.f30606d).f(), C3266gN.b((C3266gN) this.f30608f), (C3079cy) this.f30609g, (C2972ay) ((C3374iN) this.f30610h).f31812a);
            default:
                return new C3455jz((C4002u6) ((C3374iN) this.f30607e).f31812a, (C3241fz) this.f30604b.f(), (Map) ((C3374iN) this.f30608f).f31812a, (Context) ((C3374iN) this.f30609g).f31812a, (EnumC3616my) ((C3374iN) this.f30610h).f31812a, (C2972ay) ((C3374iN) this.f30606d).f31812a, (C4006uA) this.f30605c.f());
        }
    }

    public C3119dk(C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, C2696Mj c2696Mj, C2696Mj c2696Mj2, C3266gN c3266gN3, InterfaceC3320hN interfaceC3320hN) {
        this.f30603a = 2;
        this.f30607e = c3010bi;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30608f = c2696Mj;
        this.f30609g = c2696Mj2;
        this.f30606d = c3266gN3;
        this.f30610h = interfaceC3320hN;
    }

    public C3119dk(C3266gN c3266gN, C2696Mj c2696Mj, InterfaceC3320hN interfaceC3320hN, C2696Mj c2696Mj2, C3266gN c3266gN2, C3266gN c3266gN3, InterfaceC3534lN interfaceC3534lN) {
        this.f30603a = 1;
        this.f30604b = c3266gN;
        this.f30607e = c2696Mj;
        this.f30608f = interfaceC3320hN;
        this.f30609g = c2696Mj2;
        this.f30605c = c3266gN2;
        this.f30606d = c3266gN3;
        this.f30610h = interfaceC3534lN;
    }

    public C3119dk(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3374iN c3374iN) {
        this.f30603a = 6;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30606d = c3266gN3;
        this.f30607e = c3266gN4;
        this.f30608f = c3266gN5;
        this.f30609g = c3266gN6;
        this.f30610h = c3374iN;
    }

    public C3119dk(C3374iN c3374iN, C2556Ef c2556Ef, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3010bi c3010bi, C3266gN c3266gN4) {
        this.f30603a = 4;
        this.f30607e = c3374iN;
        this.f30608f = c2556Ef;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30606d = c3266gN3;
        this.f30609g = c3010bi;
        this.f30610h = c3266gN4;
    }

    public /* synthetic */ C3119dk(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, Object obj, int i) {
        this.f30603a = i;
        this.f30607e = c3374iN;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30606d = c3266gN3;
        this.f30608f = interfaceC3534lN;
        this.f30609g = interfaceC3534lN2;
        this.f30610h = (InterfaceC3534lN) obj;
    }

    public C3119dk(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3374iN c3374iN3, C3374iN c3374iN4, C3374iN c3374iN5, C3266gN c3266gN2) {
        this.f30603a = 8;
        this.f30607e = c3374iN;
        this.f30604b = c3266gN;
        this.f30608f = c3374iN2;
        this.f30609g = c3374iN3;
        this.f30610h = c3374iN4;
        this.f30606d = c3374iN5;
        this.f30605c = c3266gN2;
    }

    public C3119dk(C3374iN c3374iN, C3374iN c3374iN2, C3374iN c3374iN3, C3266gN c3266gN, C3266gN c3266gN2, C3010bi c3010bi, C3266gN c3266gN3) {
        this.f30603a = 5;
        this.f30607e = c3374iN;
        this.f30608f = c3374iN2;
        this.f30610h = c3374iN3;
        this.f30604b = c3266gN;
        this.f30605c = c3266gN2;
        this.f30609g = c3010bi;
        this.f30606d = c3266gN3;
    }
}
