package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2667Ko implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26769a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f26770b;

    /* renamed from: c, reason: collision with root package name */
    public final C3818qk f26771c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f26772d;

    public /* synthetic */ C2667Ko(C3266gN c3266gN, C3818qk c3818qk, C3266gN c3266gN2, int i) {
        this.f26769a = i;
        this.f26770b = c3266gN;
        this.f26771c = c3818qk;
        this.f26772d = c3266gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f26769a) {
            case 0:
                return new C2650Jo((C2786Ro) this.f26770b.f(), this.f26771c.a(), (String) this.f26772d.f());
            default:
                return new Qr((V2.a) this.f26770b.f(), this.f26771c.a(), ((Long) this.f26772d.f()).longValue());
        }
    }
}
