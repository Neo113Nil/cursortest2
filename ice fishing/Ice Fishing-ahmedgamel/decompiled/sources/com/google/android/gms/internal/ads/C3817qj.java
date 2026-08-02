package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3817qj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34153a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f34154b;

    /* renamed from: c, reason: collision with root package name */
    public final C3010bi f34155c;

    /* renamed from: d, reason: collision with root package name */
    public final C2696Mj f34156d;

    /* renamed from: e, reason: collision with root package name */
    public final C3818qk f34157e;

    public C3817qj(C2590Gf c2590Gf, C3266gN c3266gN, C3010bi c3010bi, C2696Mj c2696Mj, C3818qk c3818qk) {
        this.f34154b = c3266gN;
        this.f34155c = c3010bi;
        this.f34156d = c2696Mj;
        this.f34157e = c3818qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f34153a) {
            case 0:
                return new C2528Cl(new C3709oj((Context) this.f34154b.f(), this.f34155c.b(), this.f34156d.a(), this.f34157e.a(), 0), AbstractC3436jg.f32062h);
            default:
                return new C2528Cl(new C3709oj((Context) this.f34154b.f(), this.f34155c.b(), this.f34156d.a(), this.f34157e.a(), 1), AbstractC3436jg.f32062h);
        }
    }

    public C3817qj(C3266gN c3266gN, C3010bi c3010bi, C2696Mj c2696Mj, C3818qk c3818qk) {
        this.f34154b = c3266gN;
        this.f34155c = c3010bi;
        this.f34156d = c2696Mj;
        this.f34157e = c3818qk;
    }
}
