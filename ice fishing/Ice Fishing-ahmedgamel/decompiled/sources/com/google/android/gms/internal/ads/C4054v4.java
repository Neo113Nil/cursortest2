package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4054v4 implements InterfaceC3407j4 {

    /* renamed from: e, reason: collision with root package name */
    public String f35412e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3566m1 f35413f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f35417k;

    /* renamed from: l, reason: collision with root package name */
    public int f35418l;

    /* renamed from: n, reason: collision with root package name */
    public int f35420n;

    /* renamed from: o, reason: collision with root package name */
    public int f35421o;

    /* renamed from: s, reason: collision with root package name */
    public int f35425s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35427u;

    /* renamed from: d, reason: collision with root package name */
    public int f35411d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f35408a = new Cr(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final C4256yr f35409b = new C4256yr();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f35410c = new Cr();

    /* renamed from: p, reason: collision with root package name */
    public final E2 f35422p = new E2();

    /* renamed from: q, reason: collision with root package name */
    public int f35423q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f35424r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f35426t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35416j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35419m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f35414g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f35415h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f35412e = f42.f25502e;
        f42.b();
        this.f35413f = s02.C(f42.f25501d, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        char c9;
        byte[] bArr;
        long j6;
        long j9;
        char c10;
        int i11;
        char c11;
        long j10;
        this.f35413f.getClass();
        while (cr.B() > 0) {
            int i12 = this.f35411d;
            int i13 = 8;
            int i14 = 1;
            if (i12 != 0) {
                E2 e22 = this.f35422p;
                Cr cr2 = this.f35410c;
                if (i12 != 1) {
                    int i15 = e22.f25289u;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = cr.f24998b;
                        int min = Math.min(cr.B(), cr2.B());
                        cr.H(cr2.f24997a, cr2.f24998b, min);
                        cr2.G(min);
                        cr.E(i16);
                    }
                    int min2 = Math.min(cr.B(), e22.f25291w - this.f35420n);
                    this.f35413f.a(min2, cr);
                    int i17 = this.f35420n + min2;
                    this.f35420n = i17;
                    if (i17 != e22.f25291w) {
                        continue;
                    } else {
                        int i18 = e22.f25289u;
                        if (i18 == 1) {
                            byte[] bArr2 = cr2.f24997a;
                            C4256yr c4256yr = new C4256yr(bArr2, bArr2.length);
                            int h3 = c4256yr.h(8);
                            char c12 = 5;
                            int h9 = c4256yr.h(5);
                            if (h9 != 31) {
                                switch (h9) {
                                    case 0:
                                        i9 = 96000;
                                        break;
                                    case 1:
                                        i9 = 88200;
                                        break;
                                    case 2:
                                        i9 = 64000;
                                        break;
                                    case 3:
                                        i9 = 48000;
                                        break;
                                    case 4:
                                        i9 = 44100;
                                        break;
                                    case 5:
                                        i9 = 32000;
                                        break;
                                    case 6:
                                        i9 = 24000;
                                        break;
                                    case 7:
                                        i9 = 22050;
                                        break;
                                    case 8:
                                        i9 = 16000;
                                        break;
                                    case 9:
                                        i9 = 12000;
                                        break;
                                    case 10:
                                        i9 = 11025;
                                        break;
                                    case 11:
                                        i9 = 8000;
                                        break;
                                    case 12:
                                        i9 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(h9).length() + 32);
                                        sb.append("Unsupported sampling rate index ");
                                        sb.append(h9);
                                        throw U4.c(sb.toString());
                                    case 15:
                                        i9 = 57600;
                                        break;
                                    case 16:
                                        i9 = 51200;
                                        break;
                                    case 17:
                                        i9 = 40000;
                                        break;
                                    case 18:
                                        i9 = 38400;
                                        break;
                                    case 19:
                                        i9 = 34150;
                                        break;
                                    case 20:
                                        i9 = 28800;
                                        break;
                                    case 21:
                                        i9 = 25600;
                                        break;
                                    case 22:
                                        i9 = 20000;
                                        break;
                                    case 23:
                                        i9 = 19200;
                                        break;
                                    case 24:
                                        i9 = 17075;
                                        break;
                                    case 25:
                                        i9 = 14400;
                                        break;
                                    case 26:
                                        i9 = 12800;
                                        break;
                                    case 27:
                                        i9 = 9600;
                                        break;
                                }
                            } else {
                                i9 = c4256yr.h(24);
                            }
                            int h10 = c4256yr.h(3);
                            int i19 = 4;
                            if (h10 == 0) {
                                i10 = 768;
                            } else if (h10 == 1) {
                                i10 = 1024;
                            } else if (h10 == 2 || h10 == 3) {
                                i10 = 2048;
                            } else {
                                if (h10 != 4) {
                                    StringBuilder sb2 = new StringBuilder(Wv.b(h10, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(h10);
                                    throw U4.c(sb2.toString());
                                }
                                i10 = 4096;
                            }
                            int i20 = i10;
                            if (h10 == 0 || h10 == 1) {
                                c9 = 0;
                            } else if (h10 == 2) {
                                c9 = 2;
                            } else if (h10 == 3) {
                                c9 = 3;
                            } else {
                                if (h10 != 4) {
                                    StringBuilder sb3 = new StringBuilder(Wv.b(h10, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(h10);
                                    throw U4.c(sb3.toString());
                                }
                                c9 = 1;
                            }
                            c4256yr.f(2);
                            MA.B(c4256yr);
                            int h11 = c4256yr.h(5);
                            int i21 = 0;
                            int i22 = 0;
                            while (true) {
                                int i23 = i14;
                                int i24 = 16;
                                if (i21 < h11 + 1) {
                                    int h12 = c4256yr.h(3);
                                    i22 = MA.R(c4256yr, 5, 8, 16) + 1 + i22;
                                    if ((h12 == 0 || h12 == 2) && c4256yr.g()) {
                                        MA.B(c4256yr);
                                    }
                                    i21++;
                                    i14 = i23;
                                } else {
                                    int R8 = MA.R(c4256yr, 4, 8, 16) + 1;
                                    c4256yr.e();
                                    int i25 = 0;
                                    while (true) {
                                        double d9 = 2.0d;
                                        if (i25 < R8) {
                                            int h13 = c4256yr.h(2);
                                            if (h13 == 0) {
                                                c10 = c12;
                                                c4256yr.f(3);
                                                if (c4256yr.g()) {
                                                    c4256yr.f(13);
                                                }
                                                if (c9 > 0) {
                                                    MA.K(c4256yr);
                                                }
                                            } else if (h13 != i23) {
                                                if (h13 == 3) {
                                                    MA.R(c4256yr, i19, i13, i24);
                                                    int R9 = MA.R(c4256yr, i19, i13, i24);
                                                    if (c4256yr.g()) {
                                                        MA.R(c4256yr, i13, i24, 0);
                                                    }
                                                    c4256yr.e();
                                                    if (R9 > 0) {
                                                        c4256yr.f(R9 * 8);
                                                    }
                                                }
                                                c10 = 5;
                                            } else {
                                                c4256yr.f(3);
                                                boolean g9 = c4256yr.g();
                                                if (g9) {
                                                    c4256yr.f(13);
                                                }
                                                if (g9) {
                                                    c4256yr.e();
                                                }
                                                if (c9 > 0) {
                                                    MA.K(c4256yr);
                                                    i11 = c4256yr.h(2);
                                                    c11 = c9;
                                                } else {
                                                    i11 = 0;
                                                    c11 = 0;
                                                }
                                                if (i11 > 0) {
                                                    c4256yr.f(6);
                                                    int h14 = c4256yr.h(2);
                                                    c4256yr.f(i19);
                                                    c10 = 5;
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(5);
                                                    }
                                                    if (i11 == 2 || i11 == 3) {
                                                        c4256yr.f(6);
                                                    }
                                                    if (h14 == 2) {
                                                        c4256yr.e();
                                                    }
                                                } else {
                                                    c10 = 5;
                                                }
                                                int floor = ((int) Math.floor(Math.log(i22 - 1) / Math.log(2.0d))) + 1;
                                                int h15 = c4256yr.h(2);
                                                if (h15 > 0 && c4256yr.g()) {
                                                    c4256yr.f(floor);
                                                }
                                                if (c4256yr.g()) {
                                                    c4256yr.f(floor);
                                                }
                                                if (c11 == 0 && h15 == 0) {
                                                    c4256yr.e();
                                                }
                                            }
                                            i25++;
                                            c12 = c10;
                                            i13 = 8;
                                            i24 = 16;
                                            i19 = 4;
                                            i23 = 1;
                                        } else {
                                            if (c4256yr.g()) {
                                                int i26 = 8;
                                                int R10 = MA.R(c4256yr, 2, 4, 8) + 1;
                                                int i27 = 0;
                                                bArr = null;
                                                while (i27 < R10) {
                                                    int R11 = MA.R(c4256yr, 4, i26, 16);
                                                    int R12 = MA.R(c4256yr, 4, i26, 16);
                                                    if (R11 == 7) {
                                                        int h16 = c4256yr.h(4) + 1;
                                                        c4256yr.f(4);
                                                        byte[] bArr3 = new byte[h16];
                                                        for (int i28 = 0; i28 < h16; i28++) {
                                                            bArr3[i28] = (byte) c4256yr.h(i26);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        c4256yr.f(R12 * i26);
                                                    }
                                                    i27++;
                                                    i26 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i9) {
                                                case 14700:
                                                case 16000:
                                                    d9 = 3.0d;
                                                    this.f35423q = (int) (i9 * d9);
                                                    this.f35424r = (int) (i20 * d9);
                                                    j6 = this.f35426t;
                                                    j9 = e22.f25290v;
                                                    if (j6 != j9) {
                                                        this.f35426t = j9;
                                                        String concat = h3 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(h3))) : "mhm1";
                                                        C3523lC k9 = (bArr == null || bArr.length <= 0) ? null : RB.k(AbstractC3182eu.f30783b, bArr);
                                                        C3322hP c3322hP = new C3322hP();
                                                        c3322hP.f31546a = this.f35412e;
                                                        c3322hP.d("video/mp2t");
                                                        c3322hP.e("audio/mhm1");
                                                        c3322hP.f31540I = this.f35423q;
                                                        c3322hP.f31554j = concat;
                                                        c3322hP.f31561q = k9;
                                                        this.f35413f.e(new DP(c3322hP));
                                                    }
                                                    i4 = 1;
                                                    this.f35427u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f35423q = (int) (i9 * d9);
                                                    this.f35424r = (int) (i20 * d9);
                                                    j6 = this.f35426t;
                                                    j9 = e22.f25290v;
                                                    if (j6 != j9) {
                                                    }
                                                    i4 = 1;
                                                    this.f35427u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d9 = 1.5d;
                                                    this.f35423q = (int) (i9 * d9);
                                                    this.f35424r = (int) (i20 * d9);
                                                    j6 = this.f35426t;
                                                    j9 = e22.f25290v;
                                                    if (j6 != j9) {
                                                    }
                                                    i4 = 1;
                                                    this.f35427u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d9 = 1.0d;
                                                    this.f35423q = (int) (i9 * d9);
                                                    this.f35424r = (int) (i20 * d9);
                                                    j6 = this.f35426t;
                                                    j9 = e22.f25290v;
                                                    if (j6 != j9) {
                                                    }
                                                    i4 = 1;
                                                    this.f35427u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i9).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(i9);
                                                    throw U4.c(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr4 = cr2.f24997a;
                                C4256yr c4256yr2 = new C4256yr(bArr4, bArr4.length);
                                if (c4256yr2.g()) {
                                    c4256yr2.f(2);
                                    i6 = c4256yr2.h(13);
                                } else {
                                    i6 = 0;
                                }
                                this.f35425s = i6;
                            } else if (i18 == 2) {
                                if (this.f35427u) {
                                    this.f35416j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i29 = this.f35424r - this.f35425s;
                                double d10 = this.f35423q;
                                long round = Math.round(this.f35414g);
                                if (this.i) {
                                    this.i = false;
                                    this.f35414g = this.f35415h;
                                } else {
                                    this.f35414g += (i29 * 1000000.0d) / d10;
                                }
                                this.f35413f.c(round, i, this.f35421o, 0, null);
                                this.f35427u = false;
                                this.f35425s = 0;
                                this.f35421o = 0;
                            }
                            i4 = 1;
                        }
                        this.f35411d = i4;
                    }
                } else {
                    int B3 = cr.B();
                    Cr cr3 = this.f35408a;
                    int min3 = Math.min(B3, cr3.B());
                    cr.H(cr3.f24997a, cr3.f24998b, min3);
                    cr3.G(min3);
                    if (cr3.B() == 0) {
                        int i30 = cr3.f24999c;
                        byte[] bArr5 = cr3.f24997a;
                        C4256yr c4256yr3 = this.f35409b;
                        c4256yr3.f36016a = bArr5;
                        c4256yr3.f36017b = 0;
                        c4256yr3.f36018c = 0;
                        c4256yr3.f36019d = i30;
                        c4256yr3.c();
                        int R13 = MA.R(c4256yr3, 3, 8, 8);
                        e22.f25289u = R13;
                        if (R13 != -1) {
                            AbstractC2792Sd.i(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (c4256yr3.b() >= 2) {
                                long i31 = c4256yr3.i(2);
                                if (i31 == 3) {
                                    if (c4256yr3.b() >= 8) {
                                        long i32 = c4256yr3.i(8);
                                        long j11 = i32 + 3;
                                        if (i32 != 255) {
                                            i31 = j11;
                                        } else if (c4256yr3.b() >= 32) {
                                            i31 = c4256yr3.i(32) + j11;
                                        }
                                    }
                                }
                                j10 = i31;
                                e22.f25290v = j10;
                                if (j10 != -1) {
                                    if (j10 > 16) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 49);
                                        sb5.append("Contains sub-stream with an invalid packet label ");
                                        sb5.append(j10);
                                        throw U4.c(sb5.toString());
                                    }
                                    if (j10 == 0) {
                                        int i33 = e22.f25289u;
                                        if (i33 == 1) {
                                            throw U4.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i33 == 2) {
                                            throw U4.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i33 == 17) {
                                            throw U4.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int R14 = MA.R(c4256yr3, 11, 24, 24);
                                    e22.f25291w = R14;
                                    if (R14 != -1) {
                                        this.f35420n = 0;
                                        this.f35421o = R14 + i30 + this.f35421o;
                                        cr3.E(0);
                                        this.f35413f.a(cr3.f24999c, cr3);
                                        cr3.y(2);
                                        cr2.y(e22.f25291w);
                                        this.f35419m = true;
                                        this.f35411d = 2;
                                    }
                                }
                            }
                            j10 = -1;
                            e22.f25290v = j10;
                            if (j10 != -1) {
                            }
                        }
                        int i34 = cr3.f24999c;
                        if (i34 < 15) {
                            cr3.C(i34 + 1);
                        }
                    }
                    this.f35419m = false;
                }
            } else {
                int i35 = this.f35417k;
                if ((i35 & 2) == 0) {
                    cr.E(cr.f24999c);
                } else {
                    if ((i35 & 4) == 0) {
                        while (cr.B() > 0) {
                            int i36 = this.f35418l << 8;
                            this.f35418l = i36;
                            int K7 = i36 | cr.K();
                            this.f35418l = K7;
                            if ((K7 & 16777215) == 12583333) {
                                cr.E(cr.f24998b - 3);
                                this.f35418l = 0;
                            }
                        }
                    }
                    this.f35411d = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f35411d = 0;
        this.f35418l = 0;
        this.f35408a.y(2);
        this.f35420n = 0;
        this.f35421o = 0;
        this.f35423q = -2147483647;
        this.f35424r = -1;
        this.f35425s = 0;
        this.f35426t = -1L;
        this.f35427u = false;
        this.i = false;
        this.f35419m = true;
        this.f35416j = true;
        this.f35414g = -9.223372036854776E18d;
        this.f35415h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f35417k = i;
        if (!this.f35416j && (this.f35421o != 0 || !this.f35419m)) {
            this.i = true;
        }
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            double d9 = j6;
            if (this.i) {
                this.f35415h = d9;
            } else {
                this.f35414g = d9;
            }
        }
    }
}
