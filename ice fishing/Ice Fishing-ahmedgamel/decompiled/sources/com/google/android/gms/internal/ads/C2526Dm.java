package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2526Dm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24452a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f24453b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f24454c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3511lN f24455d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f24456e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f24457f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3511lN f24458g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f24459h;
    public final InterfaceC3511lN i;

    public C2526Dm(C2888Zh c2888Zh, C3795qk c3795qk, InterfaceC3511lN interfaceC3511lN, C4008ui c4008ui, InterfaceC3297hN interfaceC3297hN, InterfaceC3297hN interfaceC3297hN2, C3243gN c3243gN, C3243gN c3243gN2) {
        this.f24452a = 0;
        this.f24455d = c2888Zh;
        this.f24456e = c3795qk;
        this.f24457f = interfaceC3511lN;
        this.f24458g = c4008ui;
        this.f24459h = interfaceC3297hN;
        this.i = interfaceC3297hN2;
        this.f24453b = c3243gN;
        this.f24454c = c3243gN2;
    }

    public C2509Cm a() {
        C5069B b9 = ((C2888Zh) this.f24455d).b();
        C3052cu a9 = ((C3795qk) this.f24456e).a();
        C4120wm c4120wm = (C4120wm) this.f24457f.f();
        C4012um a10 = ((C4008ui) this.f24458g).a();
        C2645Km c2645Km = (C2645Km) ((InterfaceC3297hN) this.f24459h).f();
        C2696Nm c2696Nm = (C2696Nm) ((InterfaceC3297hN) this.i).f();
        Executor executor = (Executor) this.f24453b.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C2509Cm(b9, a9, c4120wm, a10, c2645Km, c2696Nm, executor, c3360ig, (C3904sm) this.f24454c.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24452a) {
            case 0:
                return a();
            case 1:
                return new C3851rn((C3902sk) this.f24453b.f(), (C2575Gk) this.f24454c.f(), (C2694Nk) ((C3243gN) this.f24455d).f(), (C2762Rk) ((C3243gN) this.f24456e).f(), (C3365il) ((C3243gN) this.f24457f).f(), ((C2676Mj) this.f24458g).a(), ((C2676Mj) this.f24459h).f26322b.s(), (C2692Ni) ((C3243gN) this.i).f());
            case 2:
                return new C2993bo(((C2987bi) this.f24455d).a(), (C3315ho) this.f24453b.f(), ((C2888Zh) this.f24458g).a(), ((C3795qk) this.f24456e).a(), (String) this.f24454c.f(), (String) this.f24457f.f(), (C3441k7) ((C3243gN) this.f24459h).f(), (B2.d) ((C3243gN) this.i).f());
            case 3:
                return new C2749Qo((C2783So) this.f24453b.f(), (C2940ap) this.f24454c.f(), (C2579Go) ((C3243gN) this.f24455d).f(), ((C2987bi) this.f24456e).a(), ((C2987bi) this.f24457f).b(), (C2681Mo) ((C3243gN) this.f24458g).f(), (BinderC2895Zo) ((C3243gN) this.f24459h).f(), new SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(), new SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(), ((C3040ci) this.i).c());
            case 4:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new Ks(c3360ig, (ScheduledExecutorService) this.f24453b.f(), (String) this.f24457f.f(), (C3963tr) this.f24454c.f(), (Context) ((C3243gN) this.f24455d).f(), ((C3795qk) this.f24456e).a(), (C3855rr) ((C3243gN) this.f24458g).f(), (C2748Qn) ((C3243gN) this.f24459h).f(), (C2528Do) ((C3243gN) this.i).f());
            case 5:
                return new Ot((String) ((C3351iN) this.f24455d).f31039a, (Mt) this.f24453b.f(), (Context) ((C3351iN) this.f24456e).f31039a, (Jt) this.f24454c.f(), (Zt) ((C3243gN) this.f24457f).f(), ((C2987bi) this.f24458g).b(), (C3441k7) ((C3243gN) this.f24459h).f(), (C3153eo) ((C3243gN) this.i).f());
            default:
                return new Qv(((C2987bi) this.f24455d).a(), ((C2987bi) this.f24456e).b(), (ScheduledExecutorService) this.f24453b.f(), (Gu) this.f24454c.f(), C3481ku.d(((C3040ci) this.f24457f).f29536b.a()), (T2.a) ((C3243gN) this.f24458g).f(), (Cv) ((C3243gN) this.f24459h).f(), ((C2.G) this.i).c());
        }
    }

    public C2526Dm(C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN, C3243gN c3243gN2, C3040ci c3040ci, C3243gN c3243gN3, C3243gN c3243gN4, C2.G g4) {
        this.f24452a = 6;
        this.f24455d = c2987bi;
        this.f24456e = c2987bi2;
        this.f24453b = c3243gN;
        this.f24454c = c3243gN2;
        this.f24457f = c3040ci;
        this.f24458g = c3243gN3;
        this.f24459h = c3243gN4;
        this.i = g4;
    }

    public C2526Dm(C2987bi c2987bi, C3243gN c3243gN, C2888Zh c2888Zh, C3795qk c3795qk, C3243gN c3243gN2, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f24452a = 2;
        this.f24455d = c2987bi;
        this.f24453b = c3243gN;
        this.f24458g = c2888Zh;
        this.f24456e = c3795qk;
        this.f24454c = c3243gN2;
        this.f24457f = interfaceC3511lN;
        this.f24459h = c3243gN3;
        this.i = c3243gN4;
    }

    public /* synthetic */ C2526Dm(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, InterfaceC3511lN interfaceC3511lN3, InterfaceC3511lN interfaceC3511lN4, InterfaceC3511lN interfaceC3511lN5, int i) {
        this.f24452a = i;
        this.f24453b = c3243gN;
        this.f24454c = c3243gN2;
        this.f24455d = c3243gN3;
        this.f24456e = interfaceC3511lN;
        this.f24457f = interfaceC3511lN2;
        this.f24458g = interfaceC3511lN3;
        this.f24459h = interfaceC3511lN4;
        this.i = interfaceC3511lN5;
    }

    public C2526Dm(C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN2, C3243gN c3243gN3, C3795qk c3795qk, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6) {
        this.f24452a = 4;
        this.f24453b = c3243gN;
        this.f24457f = interfaceC3511lN;
        this.f24454c = c3243gN2;
        this.f24455d = c3243gN3;
        this.f24456e = c3795qk;
        this.f24458g = c3243gN4;
        this.f24459h = c3243gN5;
        this.i = c3243gN6;
    }

    public C2526Dm(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3243gN c3243gN2, C3243gN c3243gN3, C2987bi c2987bi, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f24452a = 5;
        this.f24455d = c3351iN;
        this.f24453b = c3243gN;
        this.f24456e = c3351iN2;
        this.f24454c = c3243gN2;
        this.f24457f = c3243gN3;
        this.f24458g = c2987bi;
        this.f24459h = c3243gN4;
        this.i = c3243gN5;
    }
}
