package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3936t4 implements InterfaceC3291h4 {

    /* renamed from: e, reason: collision with root package name */
    public String f34349e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3448k1 f34350f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f34354k;

    /* renamed from: l, reason: collision with root package name */
    public int f34355l;

    /* renamed from: n, reason: collision with root package name */
    public int f34357n;

    /* renamed from: o, reason: collision with root package name */
    public int f34358o;

    /* renamed from: s, reason: collision with root package name */
    public int f34362s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34364u;

    /* renamed from: d, reason: collision with root package name */
    public int f34348d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Lr f34345a = new Lr(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final Er f34346b = new Er();

    /* renamed from: c, reason: collision with root package name */
    public final Lr f34347c = new Lr();

    /* renamed from: p, reason: collision with root package name */
    public final C2 f34359p = new C2();

    /* renamed from: q, reason: collision with root package name */
    public int f34360q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f34361r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f34363t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34353j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34356m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f34351g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f34352h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f34348d = 0;
        this.f34355l = 0;
        this.f34345a.y(2);
        this.f34357n = 0;
        this.f34358o = 0;
        this.f34360q = -2147483647;
        this.f34361r = -1;
        this.f34362s = 0;
        this.f34363t = -1L;
        this.f34364u = false;
        this.i = false;
        this.f34356m = true;
        this.f34353j = true;
        this.f34351g = -9.223372036854776E18d;
        this.f34352h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        char c4;
        byte[] bArr;
        long j9;
        long j10;
        char c9;
        int i12;
        char c10;
        long j11;
        this.f34350f.getClass();
        while (lr.B() > 0) {
            int i13 = this.f34348d;
            int i14 = 8;
            int i15 = 1;
            if (i13 != 0) {
                C2 c22 = this.f34359p;
                Lr lr2 = this.f34347c;
                if (i13 != 1) {
                    int i16 = c22.f24129u;
                    if (i16 == 1 || i16 == 17) {
                        int i17 = lr.f26234b;
                        int min = Math.min(lr.B(), lr2.B());
                        lr.H(lr2.f26233a, lr2.f26234b, min);
                        lr2.G(min);
                        lr.E(i17);
                    }
                    int min2 = Math.min(lr.B(), c22.f24131w - this.f34357n);
                    this.f34350f.a(min2, lr);
                    int i18 = this.f34357n + min2;
                    this.f34357n = i18;
                    if (i18 != c22.f24131w) {
                        continue;
                    } else {
                        int i19 = c22.f24129u;
                        if (i19 == 1) {
                            byte[] bArr2 = lr2.f26233a;
                            Er er = new Er(bArr2, bArr2.length);
                            int h9 = er.h(8);
                            char c11 = 5;
                            int h10 = er.h(5);
                            if (h10 != 31) {
                                switch (h10) {
                                    case 0:
                                        i10 = 96000;
                                        break;
                                    case 1:
                                        i10 = 88200;
                                        break;
                                    case 2:
                                        i10 = 64000;
                                        break;
                                    case 3:
                                        i10 = 48000;
                                        break;
                                    case 4:
                                        i10 = 44100;
                                        break;
                                    case 5:
                                        i10 = 32000;
                                        break;
                                    case 6:
                                        i10 = 24000;
                                        break;
                                    case 7:
                                        i10 = 22050;
                                        break;
                                    case 8:
                                        i10 = 16000;
                                        break;
                                    case 9:
                                        i10 = 12000;
                                        break;
                                    case 10:
                                        i10 = 11025;
                                        break;
                                    case 11:
                                        i10 = 8000;
                                        break;
                                    case 12:
                                        i10 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 32);
                                        sb.append("Unsupported sampling rate index ");
                                        sb.append(h10);
                                        throw W4.c(sb.toString());
                                    case 15:
                                        i10 = 57600;
                                        break;
                                    case 16:
                                        i10 = 51200;
                                        break;
                                    case 17:
                                        i10 = 40000;
                                        break;
                                    case 18:
                                        i10 = 38400;
                                        break;
                                    case 19:
                                        i10 = 34150;
                                        break;
                                    case 20:
                                        i10 = 28800;
                                        break;
                                    case 21:
                                        i10 = 25600;
                                        break;
                                    case 22:
                                        i10 = 20000;
                                        break;
                                    case 23:
                                        i10 = 19200;
                                        break;
                                    case 24:
                                        i10 = 17075;
                                        break;
                                    case 25:
                                        i10 = 14400;
                                        break;
                                    case 26:
                                        i10 = 12800;
                                        break;
                                    case 27:
                                        i10 = 9600;
                                        break;
                                }
                            } else {
                                i10 = er.h(24);
                            }
                            int h11 = er.h(3);
                            int i20 = 4;
                            if (h11 == 0) {
                                i11 = 768;
                            } else if (h11 == 1) {
                                i11 = 1024;
                            } else if (h11 == 2 || h11 == 3) {
                                i11 = 2048;
                            } else {
                                if (h11 != 4) {
                                    StringBuilder sb2 = new StringBuilder(CL.b(h11, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(h11);
                                    throw W4.c(sb2.toString());
                                }
                                i11 = 4096;
                            }
                            int i21 = i11;
                            if (h11 == 0 || h11 == 1) {
                                c4 = 0;
                            } else if (h11 == 2) {
                                c4 = 2;
                            } else if (h11 == 3) {
                                c4 = 3;
                            } else {
                                if (h11 != 4) {
                                    StringBuilder sb3 = new StringBuilder(CL.b(h11, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(h11);
                                    throw W4.c(sb3.toString());
                                }
                                c4 = 1;
                            }
                            er.f(2);
                            AbstractC2720Pd.z(er);
                            int h12 = er.h(5);
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                int i24 = i15;
                                int i25 = 16;
                                if (i22 < h12 + 1) {
                                    int h13 = er.h(3);
                                    i23 = AbstractC2720Pd.N(er, 5, 8, 16) + 1 + i23;
                                    if ((h13 == 0 || h13 == 2) && er.g()) {
                                        AbstractC2720Pd.z(er);
                                    }
                                    i22++;
                                    i15 = i24;
                                } else {
                                    int N8 = AbstractC2720Pd.N(er, 4, 8, 16) + 1;
                                    er.e();
                                    int i26 = 0;
                                    while (true) {
                                        double d2 = 2.0d;
                                        if (i26 < N8) {
                                            int h14 = er.h(2);
                                            if (h14 == 0) {
                                                c9 = c11;
                                                er.f(3);
                                                if (er.g()) {
                                                    er.f(13);
                                                }
                                                if (c4 > 0) {
                                                    AbstractC2720Pd.I(er);
                                                }
                                            } else if (h14 != i24) {
                                                if (h14 == 3) {
                                                    AbstractC2720Pd.N(er, i20, i14, i25);
                                                    int N9 = AbstractC2720Pd.N(er, i20, i14, i25);
                                                    if (er.g()) {
                                                        AbstractC2720Pd.N(er, i14, i25, 0);
                                                    }
                                                    er.e();
                                                    if (N9 > 0) {
                                                        er.f(N9 * 8);
                                                    }
                                                }
                                                c9 = 5;
                                            } else {
                                                er.f(3);
                                                boolean g9 = er.g();
                                                if (g9) {
                                                    er.f(13);
                                                }
                                                if (g9) {
                                                    er.e();
                                                }
                                                if (c4 > 0) {
                                                    AbstractC2720Pd.I(er);
                                                    i12 = er.h(2);
                                                    c10 = c4;
                                                } else {
                                                    i12 = 0;
                                                    c10 = 0;
                                                }
                                                if (i12 > 0) {
                                                    er.f(6);
                                                    int h15 = er.h(2);
                                                    er.f(i20);
                                                    c9 = 5;
                                                    if (er.g()) {
                                                        er.f(5);
                                                    }
                                                    if (i12 == 2 || i12 == 3) {
                                                        er.f(6);
                                                    }
                                                    if (h15 == 2) {
                                                        er.e();
                                                    }
                                                } else {
                                                    c9 = 5;
                                                }
                                                int floor = ((int) Math.floor(Math.log(i23 - 1) / Math.log(2.0d))) + 1;
                                                int h16 = er.h(2);
                                                if (h16 > 0 && er.g()) {
                                                    er.f(floor);
                                                }
                                                if (er.g()) {
                                                    er.f(floor);
                                                }
                                                if (c10 == 0 && h16 == 0) {
                                                    er.e();
                                                }
                                            }
                                            i26++;
                                            c11 = c9;
                                            i14 = 8;
                                            i25 = 16;
                                            i20 = 4;
                                            i24 = 1;
                                        } else {
                                            if (er.g()) {
                                                int i27 = 8;
                                                int N10 = AbstractC2720Pd.N(er, 2, 4, 8) + 1;
                                                int i28 = 0;
                                                bArr = null;
                                                while (i28 < N10) {
                                                    int N11 = AbstractC2720Pd.N(er, 4, i27, 16);
                                                    int N12 = AbstractC2720Pd.N(er, 4, i27, 16);
                                                    if (N11 == 7) {
                                                        int h17 = er.h(4) + 1;
                                                        er.f(4);
                                                        byte[] bArr3 = new byte[h17];
                                                        for (int i29 = 0; i29 < h17; i29++) {
                                                            bArr3[i29] = (byte) er.h(i27);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        er.f(N12 * i27);
                                                    }
                                                    i28++;
                                                    i27 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i10) {
                                                case 14700:
                                                case 16000:
                                                    d2 = 3.0d;
                                                    this.f34360q = (int) (i10 * d2);
                                                    this.f34361r = (int) (i21 * d2);
                                                    j9 = this.f34363t;
                                                    j10 = c22.f24130v;
                                                    if (j9 != j10) {
                                                        this.f34363t = j10;
                                                        String concat = h9 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(h9))) : "mhm1";
                                                        C3675oC k6 = (bArr == null || bArr.length <= 0) ? null : UB.k(AbstractC3548lu.f32614b, bArr);
                                                        C4065vP c4065vP = new C4065vP();
                                                        c4065vP.f34773a = this.f34349e;
                                                        c4065vP.d("video/mp2t");
                                                        c4065vP.e("audio/mhm1");
                                                        c4065vP.f34767H = this.f34360q;
                                                        c4065vP.f34781j = concat;
                                                        c4065vP.f34788q = k6;
                                                        this.f34350f.e(new TP(c4065vP));
                                                    }
                                                    i4 = 1;
                                                    this.f34364u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f34360q = (int) (i10 * d2);
                                                    this.f34361r = (int) (i21 * d2);
                                                    j9 = this.f34363t;
                                                    j10 = c22.f24130v;
                                                    if (j9 != j10) {
                                                    }
                                                    i4 = 1;
                                                    this.f34364u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d2 = 1.5d;
                                                    this.f34360q = (int) (i10 * d2);
                                                    this.f34361r = (int) (i21 * d2);
                                                    j9 = this.f34363t;
                                                    j10 = c22.f24130v;
                                                    if (j9 != j10) {
                                                    }
                                                    i4 = 1;
                                                    this.f34364u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d2 = 1.0d;
                                                    this.f34360q = (int) (i10 * d2);
                                                    this.f34361r = (int) (i21 * d2);
                                                    j9 = this.f34363t;
                                                    j10 = c22.f24130v;
                                                    if (j9 != j10) {
                                                    }
                                                    i4 = 1;
                                                    this.f34364u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(i10);
                                                    throw W4.c(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i19 == 17) {
                                byte[] bArr4 = lr2.f26233a;
                                Er er2 = new Er(bArr4, bArr4.length);
                                if (er2.g()) {
                                    er2.f(2);
                                    i9 = er2.h(13);
                                } else {
                                    i9 = 0;
                                }
                                this.f34362s = i9;
                            } else if (i19 == 2) {
                                if (this.f34364u) {
                                    this.f34353j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i30 = this.f34361r - this.f34362s;
                                double d3 = this.f34360q;
                                long round = Math.round(this.f34351g);
                                if (this.i) {
                                    this.i = false;
                                    this.f34351g = this.f34352h;
                                } else {
                                    this.f34351g += (i30 * 1000000.0d) / d3;
                                }
                                this.f34350f.b(round, i, this.f34358o, 0, null);
                                this.f34364u = false;
                                this.f34362s = 0;
                                this.f34358o = 0;
                            }
                            i4 = 1;
                        }
                        this.f34348d = i4;
                    }
                } else {
                    int B8 = lr.B();
                    Lr lr3 = this.f34345a;
                    int min3 = Math.min(B8, lr3.B());
                    lr.H(lr3.f26233a, lr3.f26234b, min3);
                    lr3.G(min3);
                    if (lr3.B() == 0) {
                        int i31 = lr3.f26235c;
                        byte[] bArr5 = lr3.f26233a;
                        Er er3 = this.f34346b;
                        er3.f24829a = bArr5;
                        er3.f24830b = 0;
                        er3.f24831c = 0;
                        er3.f24832d = i31;
                        er3.c();
                        int N13 = AbstractC2720Pd.N(er3, 3, 8, 8);
                        c22.f24129u = N13;
                        if (N13 != -1) {
                            PA.n(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (er3.b() >= 2) {
                                long i32 = er3.i(2);
                                if (i32 == 3) {
                                    if (er3.b() >= 8) {
                                        long i33 = er3.i(8);
                                        long j12 = i33 + 3;
                                        if (i33 != 255) {
                                            i32 = j12;
                                        } else if (er3.b() >= 32) {
                                            i32 = er3.i(32) + j12;
                                        }
                                    }
                                }
                                j11 = i32;
                                c22.f24130v = j11;
                                if (j11 != -1) {
                                    if (j11 > 16) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(j11).length() + 49);
                                        sb5.append("Contains sub-stream with an invalid packet label ");
                                        sb5.append(j11);
                                        throw W4.c(sb5.toString());
                                    }
                                    if (j11 == 0) {
                                        int i34 = c22.f24129u;
                                        if (i34 == 1) {
                                            throw W4.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i34 == 2) {
                                            throw W4.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i34 == 17) {
                                            throw W4.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int N14 = AbstractC2720Pd.N(er3, 11, 24, 24);
                                    c22.f24131w = N14;
                                    if (N14 != -1) {
                                        this.f34357n = 0;
                                        this.f34358o = N14 + i31 + this.f34358o;
                                        lr3.E(0);
                                        this.f34350f.a(lr3.f26235c, lr3);
                                        lr3.y(2);
                                        lr2.y(c22.f24131w);
                                        this.f34356m = true;
                                        this.f34348d = 2;
                                    }
                                }
                            }
                            j11 = -1;
                            c22.f24130v = j11;
                            if (j11 != -1) {
                            }
                        }
                        int i35 = lr3.f26235c;
                        if (i35 < 15) {
                            lr3.C(i35 + 1);
                        }
                    }
                    this.f34356m = false;
                }
            } else {
                int i36 = this.f34354k;
                if ((i36 & 2) == 0) {
                    lr.E(lr.f26235c);
                } else {
                    if ((i36 & 4) == 0) {
                        while (lr.B() > 0) {
                            int i37 = this.f34355l << 8;
                            this.f34355l = i37;
                            int K8 = i37 | lr.K();
                            this.f34355l = K8;
                            if ((K8 & 16777215) == 12583333) {
                                lr.E(lr.f26234b - 3);
                                this.f34355l = 0;
                            }
                        }
                    }
                    this.f34348d = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f34354k = i;
        if (!this.f34353j && (this.f34358o != 0 || !this.f34356m)) {
            this.i = true;
        }
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            double d2 = j9;
            if (this.i) {
                this.f34352h = d2;
            } else {
                this.f34351g = d2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f34349e = d42.f24338e;
        d42.b();
        this.f34350f = q02.x(d42.f24337d, 1);
    }
}
