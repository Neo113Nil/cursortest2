package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4079vz implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34775a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f34776b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f34777c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f34778d;

    /* renamed from: e, reason: collision with root package name */
    public final C3351iN f34779e;

    public /* synthetic */ C4079vz(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3351iN c3351iN, int i) {
        this.f34775a = i;
        this.f34776b = c3243gN;
        this.f34777c = c3243gN2;
        this.f34778d = c3243gN3;
        this.f34779e = c3351iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f34775a) {
            case 0:
                InterfaceC3135eN b9 = C3243gN.b(this.f34776b);
                InterfaceC3135eN b10 = C3243gN.b(this.f34777c);
                InterfaceC3135eN b11 = C3243gN.b(this.f34778d);
                C2949ay c2949ay = (C2949ay) this.f34779e.f31039a;
                return new C4025uz(b9, b10, b11, c2949ay.X().A(), c2949ay.X().D());
            default:
                InterfaceC3135eN b12 = C3243gN.b(this.f34776b);
                C3983uA c3983uA = (C3983uA) this.f34777c.f();
                return new C3338iA(b12, c3983uA, ((C2949ay) this.f34779e.f31039a).X().B());
        }
    }
}
