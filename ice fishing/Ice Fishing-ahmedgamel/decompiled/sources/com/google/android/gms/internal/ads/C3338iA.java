package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3338iA implements InterfaceC3284hA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3135eN f31005a;

    /* renamed from: b, reason: collision with root package name */
    public final C3983uA f31006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31007c;

    public C3338iA(InterfaceC3135eN interfaceC3135eN, C3983uA c3983uA, long j6) {
        this.f31005a = interfaceC3135eN;
        this.f31006b = c3983uA;
        this.f31007c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3284hA
    public final boolean a(Ky ky) {
        C3983uA c3983uA = this.f31006b;
        if (ky == null || ky.equals(Ky.G())) {
            c3983uA.b(15104);
            return true;
        }
        if (ky.C() != this.f31005a.f()) {
            c3983uA.b(15105);
            return true;
        }
        boolean z3 = (ky.A().C() * 1000) - System.currentTimeMillis() <= this.f31007c;
        if (z3) {
            c3983uA.b(15106);
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3284hA
    public final boolean b(Ky ky) {
        C3983uA c3983uA = this.f31006b;
        if (ky == null || ky.equals(Ky.G())) {
            c3983uA.b(15102);
            return false;
        }
        if (ky.C() == this.f31005a.f()) {
            return true;
        }
        c3983uA.b(15103);
        return false;
    }
}
