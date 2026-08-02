package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4102vz implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35544a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f35545b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f35546c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f35547d;

    /* renamed from: e, reason: collision with root package name */
    public final C3374iN f35548e;

    public /* synthetic */ C4102vz(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3374iN c3374iN, int i) {
        this.f35544a = i;
        this.f35545b = c3266gN;
        this.f35546c = c3266gN2;
        this.f35547d = c3266gN3;
        this.f35548e = c3374iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f35544a) {
            case 0:
                InterfaceC3158eN b9 = C3266gN.b(this.f35545b);
                InterfaceC3158eN b10 = C3266gN.b(this.f35546c);
                InterfaceC3158eN b11 = C3266gN.b(this.f35547d);
                C2972ay c2972ay = (C2972ay) this.f35548e.f31812a;
                return new C4048uz(b9, b10, b11, c2972ay.X().A(), c2972ay.X().D());
            default:
                InterfaceC3158eN b12 = C3266gN.b(this.f35545b);
                C4006uA c4006uA = (C4006uA) this.f35546c.f();
                return new C3361iA(b12, c4006uA, ((C2972ay) this.f35548e.f31812a).X().B());
        }
    }
}
