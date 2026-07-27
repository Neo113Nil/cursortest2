package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Hs implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25398a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3297hN f25399b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f25400c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3511lN f25401d;

    public Hs(C2987bi c2987bi, C2987bi c2987bi2, C3040ci c3040ci) {
        this.f25398a = 1;
        this.f25399b = c2987bi;
        this.f25400c = c2987bi2;
        this.f25401d = c3040ci;
    }

    public C2570Gf a() {
        Context a9 = ((C2987bi) this.f25399b).a();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C2570Gf(a9, c3360ig, ((C3565mN) this.f25401d).f(), (Vu) ((C3243gN) this.f25400c).f());
    }

    public Or b() {
        Context a9 = ((C2987bi) this.f25399b).a();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(a9, c3360ig, ((C3795qk) this.f25401d).a(), ((C2987bi) this.f25400c).b());
    }

    public Ur c() {
        AbstractC3341iD.j(((C2739Qe) ((C2998bt) this.f25399b).f29342b.f1051v).f27044w);
        C3038cg c3038cg = (C3038cg) ((C3243gN) this.f25401d).f();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3243gN) this.f25400c).f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Ur(c3038cg, scheduledExecutorService, c3360ig);
    }

    public Or d() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(c3360ig, (Object) ((C2987bi) this.f25399b).a(), (Object) ((C2987bi) this.f25400c).b(), (Object) ((C3040ci) this.f25401d).c(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f25398a) {
            case 0:
                return b();
            case 1:
                return d();
            case 2:
                return a();
            default:
                return c();
        }
    }

    public /* synthetic */ Hs(InterfaceC3297hN interfaceC3297hN, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, int i) {
        this.f25398a = i;
        this.f25399b = interfaceC3297hN;
        this.f25401d = interfaceC3511lN;
        this.f25400c = interfaceC3511lN2;
    }
}
