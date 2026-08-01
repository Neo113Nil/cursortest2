package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3221g1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30486c;

    /* renamed from: d, reason: collision with root package name */
    public int f30487d;

    /* renamed from: e, reason: collision with root package name */
    public int f30488e;

    /* renamed from: f, reason: collision with root package name */
    public CQ f30489f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3543m1 f30490g;

    public C3221g1(int i, int i6, String str) {
        this.f30484a = i;
        this.f30485b = i6;
        this.f30486c = str;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        int i = this.f30488e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC3543m1 interfaceC3543m1 = this.f30490g;
        interfaceC3543m1.getClass();
        int d2 = interfaceC3543m1.d(r02, 1024, true);
        if (d2 != -1) {
            this.f30487d += d2;
            return 0;
        }
        this.f30488e = 2;
        this.f30490g.c(0L, 1, this.f30487d, 0, null);
        this.f30487d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        CQ cq = (CQ) s02;
        this.f30489f = cq;
        InterfaceC3543m1 C8 = cq.C(1024, 4);
        this.f30490g = C8;
        C3299hP c3299hP = new C3299hP();
        String str = this.f30486c;
        c3299hP.d(str);
        c3299hP.e(str);
        C8.e(new DP(c3299hP));
        this.f30489f.B();
        this.f30489f.D(new C3275h1());
        this.f30488e = 1;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0 || this.f30488e == 1) {
            this.f30488e = 1;
            this.f30487d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        int i = this.f30485b;
        int i6 = this.f30484a;
        AbstractC2772Sd.H((i6 == -1 || i == -1) ? false : true);
        Cr cr = new Cr(i);
        ((K0) r02).A(cr.f24252a, 0, i, false);
        return cr.L() == i6;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
