package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3511lA implements InterfaceC3457kA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3901sN f32545a;

    /* renamed from: b, reason: collision with root package name */
    public final C4158xA f32546b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32547c;

    public C3511lA(InterfaceC3901sN interfaceC3901sN, C4158xA c4158xA, long j9) {
        this.f32545a = interfaceC3901sN;
        this.f32546b = c4158xA;
        this.f32547c = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3457kA
    public final boolean a(My my) {
        C4158xA c4158xA = this.f32546b;
        if (my == null || my.equals(My.G())) {
            c4158xA.b(15102);
            return false;
        }
        if (my.C() == this.f32545a.d()) {
            return true;
        }
        c4158xA.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3457kA
    public final boolean b(My my) {
        C4158xA c4158xA = this.f32546b;
        if (my == null || my.equals(My.G())) {
            c4158xA.b(15104);
            return true;
        }
        if (my.C() != this.f32545a.d()) {
            c4158xA.b(15105);
            return true;
        }
        boolean z8 = (my.A().C() * 1000) - System.currentTimeMillis() <= this.f32547c;
        if (z8) {
            c4158xA.b(15106);
        }
        return z8;
    }
}
