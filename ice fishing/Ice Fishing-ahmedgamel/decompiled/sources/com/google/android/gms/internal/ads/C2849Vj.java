package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2849Vj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29026a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3818qk f29027b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f29028c;

    public C2849Vj(C3818qk c3818qk, C3266gN c3266gN) {
        this.f29027b = c3818qk;
        this.f29028c = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f29026a) {
            case 0:
                return new C2832Uj((C2881Xj) this.f29028c.f(), this.f29027b.a());
            default:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                C3075cu a9 = this.f29027b.a();
                return new Sr(c3383ig, a9, 0);
        }
    }

    public C2849Vj(C3266gN c3266gN, C3818qk c3818qk) {
        this.f29028c = c3266gN;
        this.f29027b = c3818qk;
    }
}
