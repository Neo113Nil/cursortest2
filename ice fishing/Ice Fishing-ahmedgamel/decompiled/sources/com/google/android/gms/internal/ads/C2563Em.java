package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2563Em implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25400a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f25401b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f25402c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3534lN f25403d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f25404e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f25405f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3534lN f25406g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f25407h;
    public final InterfaceC3534lN i;

    public C2563Em(C2911Zh c2911Zh, C3818qk c3818qk, InterfaceC3534lN interfaceC3534lN, C4031ui c4031ui, InterfaceC3320hN interfaceC3320hN, InterfaceC3320hN interfaceC3320hN2, C3266gN c3266gN, C3266gN c3266gN2) {
        this.f25400a = 0;
        this.f25403d = c2911Zh;
        this.f25404e = c3818qk;
        this.f25405f = interfaceC3534lN;
        this.f25406g = c4031ui;
        this.f25407h = interfaceC3320hN;
        this.i = interfaceC3320hN2;
        this.f25401b = c3266gN;
        this.f25402c = c3266gN2;
    }

    public C2546Dm a() {
        C5140B b9 = ((C2911Zh) this.f25403d).b();
        C3075cu a9 = ((C3818qk) this.f25404e).a();
        C4197xm c4197xm = (C4197xm) this.f25405f.f();
        C4089vm a10 = ((C4031ui) this.f25406g).a();
        C2682Lm c2682Lm = (C2682Lm) ((InterfaceC3320hN) this.f25407h).f();
        C2733Om c2733Om = (C2733Om) ((InterfaceC3320hN) this.i).f();
        Executor executor = (Executor) this.f25401b.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C2546Dm(b9, a9, c4197xm, a10, c2682Lm, c2733Om, executor, c3383ig, (C3981tm) this.f25402c.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25400a) {
            case 0:
                return a();
            case 1:
                return new C3928sn((C3925sk) this.f25401b.f(), (C2595Gk) this.f25402c.f(), (C2714Nk) ((C3266gN) this.f25403d).f(), (C2782Rk) ((C3266gN) this.f25404e).f(), (C3388il) ((C3266gN) this.f25405f).f(), ((C2696Mj) this.f25406g).a(), ((C2696Mj) this.f25407h).f27111b.r(), (C2712Ni) ((C3266gN) this.i).f());
            case 2:
                return new C3069co(((C3010bi) this.f25403d).a(), (C3391io) this.f25401b.f(), ((C2911Zh) this.f25406g).a(), ((C3818qk) this.f25404e).a(), (String) this.f25402c.f(), (String) this.f25405f.f(), (C3464k7) ((C3266gN) this.f25407h).f(), (D2.d) ((C3266gN) this.i).f());
            case 3:
                return new C2786Ro((C2820To) this.f25401b.f(), (C2963ap) this.f25402c.f(), (C2616Ho) ((C3266gN) this.f25403d).f(), ((C3010bi) this.f25404e).a(), ((C3010bi) this.f25405f).b(), (C2718No) ((C3266gN) this.f25406g).f(), (BinderC2918Zo) ((C3266gN) this.f25407h).f(), new SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(), new SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(), ((C3063ci) this.i).c());
            case 4:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new Ks(c3383ig, (ScheduledExecutorService) this.f25401b.f(), (String) this.f25405f.f(), (C3986tr) this.f25402c.f(), (Context) ((C3266gN) this.f25403d).f(), ((C3818qk) this.f25404e).a(), (C3878rr) ((C3266gN) this.f25406g).f(), (C2785Rn) ((C3266gN) this.f25407h).f(), (C2565Eo) ((C3266gN) this.i).f());
            case 5:
                return new Ot((String) ((C3374iN) this.f25403d).f31812a, (Mt) this.f25401b.f(), (Context) ((C3374iN) this.f25404e).f31812a, (Jt) this.f25402c.f(), (Zt) ((C3266gN) this.f25405f).f(), ((C3010bi) this.f25406g).b(), (C3464k7) ((C3266gN) this.f25407h).f(), (C3230fo) ((C3266gN) this.i).f());
            default:
                return new Qv(((C3010bi) this.f25403d).a(), ((C3010bi) this.f25404e).b(), (ScheduledExecutorService) this.f25401b.f(), (Gu) this.f25402c.f(), C3504ku.d(((C3063ci) this.f25405f).f30321b.a()), (V2.a) ((C3266gN) this.f25406g).f(), (Cv) ((C3266gN) this.f25407h).f(), ((E2.F) this.i).c());
        }
    }

    public C2563Em(C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN, C3266gN c3266gN2, C3063ci c3063ci, C3266gN c3266gN3, C3266gN c3266gN4, E2.F f2) {
        this.f25400a = 6;
        this.f25403d = c3010bi;
        this.f25404e = c3010bi2;
        this.f25401b = c3266gN;
        this.f25402c = c3266gN2;
        this.f25405f = c3063ci;
        this.f25406g = c3266gN3;
        this.f25407h = c3266gN4;
        this.i = f2;
    }

    public C2563Em(C3010bi c3010bi, C3266gN c3266gN, C2911Zh c2911Zh, C3818qk c3818qk, C3266gN c3266gN2, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f25400a = 2;
        this.f25403d = c3010bi;
        this.f25401b = c3266gN;
        this.f25406g = c2911Zh;
        this.f25404e = c3818qk;
        this.f25402c = c3266gN2;
        this.f25405f = interfaceC3534lN;
        this.f25407h = c3266gN3;
        this.i = c3266gN4;
    }

    public /* synthetic */ C2563Em(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, InterfaceC3534lN interfaceC3534lN3, InterfaceC3534lN interfaceC3534lN4, InterfaceC3534lN interfaceC3534lN5, int i) {
        this.f25400a = i;
        this.f25401b = c3266gN;
        this.f25402c = c3266gN2;
        this.f25403d = c3266gN3;
        this.f25404e = interfaceC3534lN;
        this.f25405f = interfaceC3534lN2;
        this.f25406g = interfaceC3534lN3;
        this.f25407h = interfaceC3534lN4;
        this.i = interfaceC3534lN5;
    }

    public C2563Em(C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN2, C3266gN c3266gN3, C3818qk c3818qk, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6) {
        this.f25400a = 4;
        this.f25401b = c3266gN;
        this.f25405f = interfaceC3534lN;
        this.f25402c = c3266gN2;
        this.f25403d = c3266gN3;
        this.f25404e = c3818qk;
        this.f25406g = c3266gN4;
        this.f25407h = c3266gN5;
        this.i = c3266gN6;
    }

    public C2563Em(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3266gN c3266gN2, C3266gN c3266gN3, C3010bi c3010bi, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f25400a = 5;
        this.f25403d = c3374iN;
        this.f25401b = c3266gN;
        this.f25404e = c3374iN2;
        this.f25402c = c3266gN2;
        this.f25405f = c3266gN3;
        this.f25406g = c3010bi;
        this.f25407h = c3266gN4;
        this.i = c3266gN5;
    }
}
