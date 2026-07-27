package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4139x4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3384j4 f34940a;

    /* renamed from: b, reason: collision with root package name */
    public final C4233yr f34941b = new C4233yr(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f34942c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f34943d;

    /* renamed from: e, reason: collision with root package name */
    public Dt f34944e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34945f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34947h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34948j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34949k;

    public C4139x4(InterfaceC3384j4 interfaceC3384j4) {
        this.f34940a = interfaceC3384j4;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, Cr cr) {
        int i6;
        int i9;
        int i10;
        int i11;
        long j6;
        long j9;
        this.f34944e.getClass();
        int i12 = i & 1;
        InterfaceC3384j4 interfaceC3384j4 = this.f34940a;
        int i13 = 1;
        int i14 = 0;
        int i15 = -1;
        int i16 = 2;
        if (i12 != 0) {
            int i17 = this.f34942c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    int i18 = this.f34948j;
                    if (i18 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i18).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i18);
                        sb.append(" more bytes");
                        AbstractC2968bG.y("PesReader", sb.toString());
                    }
                    interfaceC3384j4.e();
                } else {
                    AbstractC2968bG.y("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (cr.f24254c == 0) {
                interfaceC3384j4.p();
            }
            this.f34942c = 1;
            this.f34943d = 0;
        }
        int i19 = i;
        while (cr.B() > 0) {
            int i20 = this.f34942c;
            if (i20 != 0) {
                C4233yr c4233yr = this.f34941b;
                if (i20 != i13) {
                    if (i20 != i16) {
                        int B9 = cr.B();
                        int i21 = this.f34948j;
                        int i22 = i21 == i15 ? i14 : B9 - i21;
                        if (i22 > 0) {
                            B9 -= i22;
                            cr.C(cr.f24253b + B9);
                        }
                        interfaceC3384j4.b(cr);
                        int i23 = this.f34948j;
                        if (i23 != i15) {
                            int i24 = i23 - B9;
                            this.f34948j = i24;
                            if (i24 == 0) {
                                interfaceC3384j4.e();
                                this.f34942c = i13;
                                this.f34943d = i14;
                            }
                        }
                    } else {
                        if (c(cr, c4233yr.f35232a, Math.min(10, this.i)) && c(cr, null, this.i)) {
                            c4233yr.d(i14);
                            if (this.f34945f) {
                                c4233yr.f(4);
                                long h9 = c4233yr.h(3);
                                c4233yr.f(i13);
                                int h10 = c4233yr.h(15) << 15;
                                c4233yr.f(i13);
                                long h11 = c4233yr.h(15);
                                c4233yr.f(i13);
                                if (this.f34947h || !this.f34946g) {
                                    j9 = h9;
                                } else {
                                    c4233yr.f(4);
                                    j9 = h9;
                                    c4233yr.f(i13);
                                    int h12 = c4233yr.h(15) << 15;
                                    c4233yr.f(i13);
                                    long h13 = c4233yr.h(15);
                                    c4233yr.f(i13);
                                    this.f34944e.c((c4233yr.h(3) << 30) | h12 | h13);
                                    this.f34947h = true;
                                }
                                j6 = this.f34944e.c((j9 << 30) | h10 | h11);
                            } else {
                                j6 = com.anythink.basead.exoplayer.b.f6382b;
                            }
                            i19 |= true != this.f34949k ? 0 : 4;
                            interfaceC3384j4.d(i19, j6);
                            this.f34942c = 3;
                            this.f34943d = 0;
                            i14 = 0;
                            i13 = 1;
                            i15 = -1;
                            i16 = 2;
                        }
                    }
                    i6 = i13;
                    i9 = i15;
                    i10 = i16;
                } else {
                    int i25 = i14;
                    if (c(cr, c4233yr.f35232a, 9)) {
                        c4233yr.d(i25);
                        int h14 = c4233yr.h(24);
                        i6 = 1;
                        if (h14 != 1) {
                            com.anythink.basead.exoplayer.f.f.q(h14, "Unexpected start code prefix: ", "PesReader", new StringBuilder(String.valueOf(h14).length() + 30));
                            i9 = -1;
                            this.f34948j = -1;
                            i11 = 0;
                            i10 = 2;
                        } else {
                            c4233yr.f(8);
                            int h15 = c4233yr.h(16);
                            c4233yr.f(5);
                            this.f34949k = c4233yr.g();
                            i10 = 2;
                            c4233yr.f(2);
                            this.f34945f = c4233yr.g();
                            this.f34946g = c4233yr.g();
                            c4233yr.f(6);
                            int h16 = c4233yr.h(8);
                            this.i = h16;
                            if (h15 == 0) {
                                this.f34948j = -1;
                                i11 = 2;
                                i9 = -1;
                            } else {
                                int i26 = (h15 - 3) - h16;
                                this.f34948j = i26;
                                if (i26 < 0) {
                                    com.anythink.basead.exoplayer.f.f.q(i26, "Found negative packet payload size: ", "PesReader", new StringBuilder(String.valueOf(i26).length() + 36));
                                    i9 = -1;
                                    this.f34948j = -1;
                                } else {
                                    i9 = -1;
                                }
                                i11 = 2;
                            }
                        }
                        this.f34942c = i11;
                        i14 = 0;
                        this.f34943d = 0;
                    } else {
                        i14 = i25;
                        i9 = -1;
                        i10 = 2;
                        i6 = 1;
                    }
                }
            } else {
                i6 = i13;
                i9 = i15;
                i10 = i16;
                cr.G(cr.B());
            }
            i16 = i10;
            i15 = i9;
            i13 = i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void b(Dt dt, S0 s02, F4 f42) {
        this.f34944e = dt;
        this.f34940a.a(s02, f42);
    }

    public final boolean c(Cr cr, byte[] bArr, int i) {
        int min = Math.min(cr.B(), i - this.f34943d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            cr.G(min);
        } else {
            cr.H(bArr, this.f34943d, min);
        }
        int i6 = this.f34943d + min;
        this.f34943d = i6;
        return i6 == i;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void f() {
        this.f34942c = 0;
        this.f34943d = 0;
        this.f34947h = false;
        this.f34940a.c();
    }
}
