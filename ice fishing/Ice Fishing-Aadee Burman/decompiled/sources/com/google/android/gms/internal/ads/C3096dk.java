package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3096dk implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29830a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f29831b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f29832c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29833d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f29834e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f29835f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3511lN f29836g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f29837h;

    public C3096dk(C2987bi c2987bi, C3795qk c3795qk, C2987bi c2987bi2, C2888Zh c2888Zh, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3) {
        this.f29830a = 0;
        this.f29834e = c2987bi;
        this.f29835f = c3795qk;
        this.f29836g = c2987bi2;
        this.f29837h = c2888Zh;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29833d = c3243gN3;
    }

    public C4124wq a() {
        return new C4124wq((C3577mi) ((C3351iN) this.f29834e).f31039a, (Context) this.f29831b.f(), (Executor) this.f29832c.f(), (C2612In) ((C3243gN) this.f29833d).f(), ((C3795qk) this.f29835f).a(), (UA) ((C3243gN) this.f29836g).f(), (C2993bo) ((C3243gN) this.f29837h).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29830a) {
            case 0:
                return new C3042ck(((C2987bi) this.f29834e).a(), ((C3795qk) this.f29835f).a(), ((C2987bi) this.f29836g).b(), ((C2888Zh) this.f29837h).b(), (C2494Bo) this.f29831b.f(), (Wu) this.f29832c.f(), (C2749Qo) ((C3243gN) this.f29833d).f());
            case 1:
                return new C3471kk((Context) this.f29831b.f(), ((C2676Mj) this.f29834e).a(), (InterfaceC4061vh) ((InterfaceC3297hN) this.f29835f).f(), ((C2676Mj) this.f29836g).b(), (T2.a) this.f29832c.f(), (C3153eo) ((C3243gN) this.f29833d).f(), (C3311hk) this.f29837h.f());
            case 2:
                return new C2846Wn(((C2987bi) this.f29834e).a(), (C3427ju) this.f29831b.f(), (C3153eo) this.f29832c.f(), ((C2676Mj) this.f29835f).b(), ((C2676Mj) this.f29836g).a(), (C2800Tp) ((C3243gN) this.f29833d).f(), (String) ((InterfaceC3297hN) this.f29837h).f());
            case 3:
                return a();
            case 4:
                C3201fi c3201fi = (C3201fi) ((C3351iN) this.f29834e).f31039a;
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2700Nq(c3201fi, c3360ig, ((C2536Ef) this.f29835f).b(), (C3589mu) this.f29831b.f(), (C4175xn) this.f29832c.f(), (C2993bo) ((C3243gN) this.f29833d).f(), ((C2987bi) this.f29836g).b(), (Context) ((C3243gN) this.f29837h).f(), new C2866Yb(17));
            case 5:
                return new BinderC3642nt((C3309hi) ((C3351iN) this.f29834e).f31039a, (Context) ((C3351iN) this.f29835f).f31039a, (String) ((C3351iN) this.f29837h).f31039a, (C3426jt) this.f29831b.f(), (C3266gt) this.f29832c.f(), ((C2987bi) this.f29836g).b(), (C3153eo) ((C3243gN) this.f29833d).f());
            case 6:
                return new Yx((By) this.f29831b.f(), (Py) this.f29832c.f(), (C3498lA) ((C3243gN) this.f29833d).f(), (C3983uA) ((C3243gN) this.f29834e).f(), (InterfaceC3809qy) ((C3243gN) this.f29835f).f(), C3243gN.b((C3243gN) this.f29836g), (C2949ay) ((C3351iN) this.f29837h).f31039a);
            case 7:
                return new Qy((ExecutorService) ((C3351iN) this.f29834e).f31039a, C3243gN.b(this.f29831b), C3243gN.b(this.f29832c), (C3498lA) ((C3243gN) this.f29833d).f(), C3243gN.b((C3243gN) this.f29835f), (C3056cy) this.f29836g, (C2949ay) ((C3351iN) this.f29837h).f31039a);
            default:
                return new C3432jz((C3979u6) ((C3351iN) this.f29834e).f31039a, (C3218fz) this.f29831b.f(), (Map) ((C3351iN) this.f29835f).f31039a, (Context) ((C3351iN) this.f29836g).f31039a, (EnumC3593my) ((C3351iN) this.f29837h).f31039a, (C2949ay) ((C3351iN) this.f29833d).f31039a, (C3983uA) this.f29832c.f());
        }
    }

    public C3096dk(C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, C2676Mj c2676Mj, C2676Mj c2676Mj2, C3243gN c3243gN3, InterfaceC3297hN interfaceC3297hN) {
        this.f29830a = 2;
        this.f29834e = c2987bi;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29835f = c2676Mj;
        this.f29836g = c2676Mj2;
        this.f29833d = c3243gN3;
        this.f29837h = interfaceC3297hN;
    }

    public C3096dk(C3243gN c3243gN, C2676Mj c2676Mj, InterfaceC3297hN interfaceC3297hN, C2676Mj c2676Mj2, C3243gN c3243gN2, C3243gN c3243gN3, InterfaceC3511lN interfaceC3511lN) {
        this.f29830a = 1;
        this.f29831b = c3243gN;
        this.f29834e = c2676Mj;
        this.f29835f = interfaceC3297hN;
        this.f29836g = c2676Mj2;
        this.f29832c = c3243gN2;
        this.f29833d = c3243gN3;
        this.f29837h = interfaceC3511lN;
    }

    public C3096dk(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3351iN c3351iN) {
        this.f29830a = 6;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29833d = c3243gN3;
        this.f29834e = c3243gN4;
        this.f29835f = c3243gN5;
        this.f29836g = c3243gN6;
        this.f29837h = c3351iN;
    }

    public C3096dk(C3351iN c3351iN, C2536Ef c2536Ef, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C2987bi c2987bi, C3243gN c3243gN4) {
        this.f29830a = 4;
        this.f29834e = c3351iN;
        this.f29835f = c2536Ef;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29833d = c3243gN3;
        this.f29836g = c2987bi;
        this.f29837h = c3243gN4;
    }

    public /* synthetic */ C3096dk(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, Object obj, int i) {
        this.f29830a = i;
        this.f29834e = c3351iN;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29833d = c3243gN3;
        this.f29835f = interfaceC3511lN;
        this.f29836g = interfaceC3511lN2;
        this.f29837h = (InterfaceC3511lN) obj;
    }

    public C3096dk(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3351iN c3351iN3, C3351iN c3351iN4, C3351iN c3351iN5, C3243gN c3243gN2) {
        this.f29830a = 8;
        this.f29834e = c3351iN;
        this.f29831b = c3243gN;
        this.f29835f = c3351iN2;
        this.f29836g = c3351iN3;
        this.f29837h = c3351iN4;
        this.f29833d = c3351iN5;
        this.f29832c = c3243gN2;
    }

    public C3096dk(C3351iN c3351iN, C3351iN c3351iN2, C3351iN c3351iN3, C3243gN c3243gN, C3243gN c3243gN2, C2987bi c2987bi, C3243gN c3243gN3) {
        this.f29830a = 5;
        this.f29834e = c3351iN;
        this.f29835f = c3351iN2;
        this.f29837h = c3351iN3;
        this.f29831b = c3243gN;
        this.f29832c = c3243gN2;
        this.f29836g = c2987bi;
        this.f29833d = c3243gN3;
    }
}
