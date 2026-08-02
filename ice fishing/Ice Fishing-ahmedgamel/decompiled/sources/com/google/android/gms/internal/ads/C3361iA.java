package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3361iA implements InterfaceC3307hA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3158eN f31778a;

    /* renamed from: b, reason: collision with root package name */
    public final C4006uA f31779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31780c;

    public C3361iA(InterfaceC3158eN interfaceC3158eN, C4006uA c4006uA, long j6) {
        this.f31778a = interfaceC3158eN;
        this.f31779b = c4006uA;
        this.f31780c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3307hA
    public final boolean a(Ky ky) {
        C4006uA c4006uA = this.f31779b;
        if (ky == null || ky.equals(Ky.G())) {
            c4006uA.b(15104);
            return true;
        }
        if (ky.C() != this.f31778a.f()) {
            c4006uA.b(15105);
            return true;
        }
        boolean z6 = (ky.A().C() * 1000) - System.currentTimeMillis() <= this.f31780c;
        if (z6) {
            c4006uA.b(15106);
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3307hA
    public final boolean b(Ky ky) {
        C4006uA c4006uA = this.f31779b;
        if (ky == null || ky.equals(Ky.G())) {
            c4006uA.b(15102);
            return false;
        }
        if (ky.C() == this.f31778a.f()) {
            return true;
        }
        c4006uA.b(15103);
        return false;
    }
}
