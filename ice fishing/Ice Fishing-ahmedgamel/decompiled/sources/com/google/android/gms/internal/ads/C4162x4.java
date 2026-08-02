package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4162x4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3407j4 f35721a;

    /* renamed from: b, reason: collision with root package name */
    public final C4256yr f35722b = new C4256yr(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f35723c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f35724d;

    /* renamed from: e, reason: collision with root package name */
    public Dt f35725e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35727g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35728h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35729j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35730k;

    public C4162x4(InterfaceC3407j4 interfaceC3407j4) {
        this.f35721a = interfaceC3407j4;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, Cr cr) {
        int i4;
        int i6;
        int i9;
        int i10;
        long j6;
        long j9;
        this.f35725e.getClass();
        int i11 = i & 1;
        InterfaceC3407j4 interfaceC3407j4 = this.f35721a;
        int i12 = 1;
        int i13 = 0;
        int i14 = -1;
        int i15 = 2;
        if (i11 != 0) {
            int i16 = this.f35723c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.f35729j;
                    if (i17 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i17);
                        sb.append(" more bytes");
                        AbstractC2991bG.y("PesReader", sb.toString());
                    }
                    interfaceC3407j4.e();
                } else {
                    AbstractC2991bG.y("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (cr.f24999c == 0) {
                interfaceC3407j4.p();
            }
            this.f35723c = 1;
            this.f35724d = 0;
        }
        int i18 = i;
        while (cr.B() > 0) {
            int i19 = this.f35723c;
            if (i19 != 0) {
                C4256yr c4256yr = this.f35722b;
                if (i19 != i12) {
                    if (i19 != i15) {
                        int B3 = cr.B();
                        int i20 = this.f35729j;
                        int i21 = i20 == i14 ? i13 : B3 - i20;
                        if (i21 > 0) {
                            B3 -= i21;
                            cr.C(cr.f24998b + B3);
                        }
                        interfaceC3407j4.b(cr);
                        int i22 = this.f35729j;
                        if (i22 != i14) {
                            int i23 = i22 - B3;
                            this.f35729j = i23;
                            if (i23 == 0) {
                                interfaceC3407j4.e();
                                this.f35723c = i12;
                                this.f35724d = i13;
                            }
                        }
                    } else {
                        if (c(cr, c4256yr.f36016a, Math.min(10, this.i)) && c(cr, null, this.i)) {
                            c4256yr.d(i13);
                            if (this.f35726f) {
                                c4256yr.f(4);
                                long h3 = c4256yr.h(3);
                                c4256yr.f(i12);
                                int h9 = c4256yr.h(15) << 15;
                                c4256yr.f(i12);
                                long h10 = c4256yr.h(15);
                                c4256yr.f(i12);
                                if (this.f35728h || !this.f35727g) {
                                    j9 = h3;
                                } else {
                                    c4256yr.f(4);
                                    j9 = h3;
                                    c4256yr.f(i12);
                                    int h11 = c4256yr.h(15) << 15;
                                    c4256yr.f(i12);
                                    long h12 = c4256yr.h(15);
                                    c4256yr.f(i12);
                                    this.f35725e.c((c4256yr.h(3) << 30) | h11 | h12);
                                    this.f35728h = true;
                                }
                                j6 = this.f35725e.c((j9 << 30) | h9 | h10);
                            } else {
                                j6 = com.anythink.basead.exoplayer.b.f7168b;
                            }
                            i18 |= true != this.f35730k ? 0 : 4;
                            interfaceC3407j4.d(i18, j6);
                            this.f35723c = 3;
                            this.f35724d = 0;
                            i13 = 0;
                            i12 = 1;
                            i14 = -1;
                            i15 = 2;
                        }
                    }
                    i4 = i12;
                    i6 = i14;
                    i9 = i15;
                } else {
                    int i24 = i13;
                    if (c(cr, c4256yr.f36016a, 9)) {
                        c4256yr.d(i24);
                        int h13 = c4256yr.h(24);
                        i4 = 1;
                        if (h13 != 1) {
                            com.IceFishing.LiveIceFishing.k.t(h13, "Unexpected start code prefix: ", "PesReader", new StringBuilder(String.valueOf(h13).length() + 30));
                            i6 = -1;
                            this.f35729j = -1;
                            i10 = 0;
                            i9 = 2;
                        } else {
                            c4256yr.f(8);
                            int h14 = c4256yr.h(16);
                            c4256yr.f(5);
                            this.f35730k = c4256yr.g();
                            i9 = 2;
                            c4256yr.f(2);
                            this.f35726f = c4256yr.g();
                            this.f35727g = c4256yr.g();
                            c4256yr.f(6);
                            int h15 = c4256yr.h(8);
                            this.i = h15;
                            if (h14 == 0) {
                                this.f35729j = -1;
                                i10 = 2;
                                i6 = -1;
                            } else {
                                int i25 = (h14 - 3) - h15;
                                this.f35729j = i25;
                                if (i25 < 0) {
                                    com.IceFishing.LiveIceFishing.k.t(i25, "Found negative packet payload size: ", "PesReader", new StringBuilder(String.valueOf(i25).length() + 36));
                                    i6 = -1;
                                    this.f35729j = -1;
                                } else {
                                    i6 = -1;
                                }
                                i10 = 2;
                            }
                        }
                        this.f35723c = i10;
                        i13 = 0;
                        this.f35724d = 0;
                    } else {
                        i13 = i24;
                        i6 = -1;
                        i9 = 2;
                        i4 = 1;
                    }
                }
            } else {
                i4 = i12;
                i6 = i14;
                i9 = i15;
                cr.G(cr.B());
            }
            i15 = i9;
            i14 = i6;
            i12 = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void b(Dt dt, S0 s02, F4 f42) {
        this.f35725e = dt;
        this.f35721a.a(s02, f42);
    }

    public final boolean c(Cr cr, byte[] bArr, int i) {
        int min = Math.min(cr.B(), i - this.f35724d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            cr.G(min);
        } else {
            cr.H(bArr, this.f35724d, min);
        }
        int i4 = this.f35724d + min;
        this.f35724d = i4;
        return i4 == i;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void f() {
        this.f35723c = 0;
        this.f35724d = 0;
        this.f35728h = false;
        this.f35721a.c();
    }
}
