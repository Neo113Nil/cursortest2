package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Hs implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26141a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3320hN f26142b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f26143c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3534lN f26144d;

    public Hs(C3010bi c3010bi, C3010bi c3010bi2, C3063ci c3063ci) {
        this.f26141a = 1;
        this.f26142b = c3010bi;
        this.f26143c = c3010bi2;
        this.f26144d = c3063ci;
    }

    public C2590Gf a() {
        Context a9 = ((C3010bi) this.f26142b).a();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C2590Gf(a9, c3383ig, ((C3588mN) this.f26144d).f(), (Vu) ((C3266gN) this.f26143c).f());
    }

    public Or b() {
        Context a9 = ((C3010bi) this.f26142b).a();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(a9, c3383ig, ((C3818qk) this.f26144d).a(), ((C3010bi) this.f26143c).b());
    }

    public Ur c() {
        AbstractC3364iD.j(((C2759Qe) ((C3021bt) this.f26142b).f30130b.f1304v).f27829w);
        C3061cg c3061cg = (C3061cg) ((C3266gN) this.f26144d).f();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3266gN) this.f26143c).f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Ur(c3061cg, scheduledExecutorService, c3383ig);
    }

    public Or d() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(c3383ig, (Object) ((C3010bi) this.f26142b).a(), (Object) ((C3010bi) this.f26143c).b(), (Object) ((C3063ci) this.f26144d).c(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f26141a) {
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

    public /* synthetic */ Hs(InterfaceC3320hN interfaceC3320hN, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, int i) {
        this.f26141a = i;
        this.f26142b = interfaceC3320hN;
        this.f26144d = interfaceC3534lN;
        this.f26143c = interfaceC3534lN2;
    }
}
