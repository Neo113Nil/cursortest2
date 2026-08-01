package com.google.android.gms.internal.ads;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4031v4 implements InterfaceC3384j4 {

    /* renamed from: e, reason: collision with root package name */
    public String f34649e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3543m1 f34650f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f34654k;

    /* renamed from: l, reason: collision with root package name */
    public int f34655l;

    /* renamed from: n, reason: collision with root package name */
    public int f34657n;

    /* renamed from: o, reason: collision with root package name */
    public int f34658o;

    /* renamed from: s, reason: collision with root package name */
    public int f34662s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34664u;

    /* renamed from: d, reason: collision with root package name */
    public int f34648d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f34645a = new Cr(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final C4233yr f34646b = new C4233yr();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f34647c = new Cr();

    /* renamed from: p, reason: collision with root package name */
    public final E2 f34659p = new E2();

    /* renamed from: q, reason: collision with root package name */
    public int f34660q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f34661r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f34663t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34653j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34656m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f34651g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f34652h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f34649e = f42.f24746e;
        f42.b();
        this.f34650f = s02.C(f42.f24745d, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        char c9;
        byte[] bArr;
        long j6;
        long j9;
        char c10;
        int i12;
        char c11;
        long j10;
        this.f34650f.getClass();
        while (cr.B() > 0) {
            int i13 = this.f34648d;
            int i14 = 8;
            int i15 = 1;
            if (i13 != 0) {
                E2 e22 = this.f34659p;
                Cr cr2 = this.f34647c;
                if (i13 != 1) {
                    int i16 = e22.f24528u;
                    if (i16 == 1 || i16 == 17) {
                        int i17 = cr.f24253b;
                        int min = Math.min(cr.B(), cr2.B());
                        cr.H(cr2.f24252a, cr2.f24253b, min);
                        cr2.G(min);
                        cr.E(i17);
                    }
                    int min2 = Math.min(cr.B(), e22.f24530w - this.f34657n);
                    this.f34650f.a(min2, cr);
                    int i18 = this.f34657n + min2;
                    this.f34657n = i18;
                    if (i18 != e22.f24530w) {
                        continue;
                    } else {
                        int i19 = e22.f24528u;
                        if (i19 == 1) {
                            byte[] bArr2 = cr2.f24252a;
                            C4233yr c4233yr = new C4233yr(bArr2, bArr2.length);
                            int h9 = c4233yr.h(8);
                            char c12 = 5;
                            int h10 = c4233yr.h(5);
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
                                        throw U4.c(sb.toString());
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
                                i10 = c4233yr.h(24);
                            }
                            int h11 = c4233yr.h(3);
                            int i20 = 4;
                            if (h11 == 0) {
                                i11 = 768;
                            } else if (h11 == 1) {
                                i11 = 1024;
                            } else if (h11 == 2 || h11 == 3) {
                                i11 = 2048;
                            } else {
                                if (h11 != 4) {
                                    StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(h11, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(h11);
                                    throw U4.c(sb2.toString());
                                }
                                i11 = 4096;
                            }
                            int i21 = i11;
                            if (h11 == 0 || h11 == 1) {
                                c9 = 0;
                            } else if (h11 == 2) {
                                c9 = 2;
                            } else if (h11 == 3) {
                                c9 = 3;
                            } else {
                                if (h11 != 4) {
                                    StringBuilder sb3 = new StringBuilder(AbstractC4404f.b(h11, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(h11);
                                    throw U4.c(sb3.toString());
                                }
                                c9 = 1;
                            }
                            c4233yr.f(2);
                            MA.B(c4233yr);
                            int h12 = c4233yr.h(5);
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                int i24 = i15;
                                int i25 = 16;
                                if (i22 < h12 + 1) {
                                    int h13 = c4233yr.h(3);
                                    i23 = MA.R(c4233yr, 5, 8, 16) + 1 + i23;
                                    if ((h13 == 0 || h13 == 2) && c4233yr.g()) {
                                        MA.B(c4233yr);
                                    }
                                    i22++;
                                    i15 = i24;
                                } else {
                                    int R8 = MA.R(c4233yr, 4, 8, 16) + 1;
                                    c4233yr.e();
                                    int i26 = 0;
                                    while (true) {
                                        double d2 = 2.0d;
                                        if (i26 < R8) {
                                            int h14 = c4233yr.h(2);
                                            if (h14 == 0) {
                                                c10 = c12;
                                                c4233yr.f(3);
                                                if (c4233yr.g()) {
                                                    c4233yr.f(13);
                                                }
                                                if (c9 > 0) {
                                                    MA.K(c4233yr);
                                                }
                                            } else if (h14 != i24) {
                                                if (h14 == 3) {
                                                    MA.R(c4233yr, i20, i14, i25);
                                                    int R9 = MA.R(c4233yr, i20, i14, i25);
                                                    if (c4233yr.g()) {
                                                        MA.R(c4233yr, i14, i25, 0);
                                                    }
                                                    c4233yr.e();
                                                    if (R9 > 0) {
                                                        c4233yr.f(R9 * 8);
                                                    }
                                                }
                                                c10 = 5;
                                            } else {
                                                c4233yr.f(3);
                                                boolean g4 = c4233yr.g();
                                                if (g4) {
                                                    c4233yr.f(13);
                                                }
                                                if (g4) {
                                                    c4233yr.e();
                                                }
                                                if (c9 > 0) {
                                                    MA.K(c4233yr);
                                                    i12 = c4233yr.h(2);
                                                    c11 = c9;
                                                } else {
                                                    i12 = 0;
                                                    c11 = 0;
                                                }
                                                if (i12 > 0) {
                                                    c4233yr.f(6);
                                                    int h15 = c4233yr.h(2);
                                                    c4233yr.f(i20);
                                                    c10 = 5;
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(5);
                                                    }
                                                    if (i12 == 2 || i12 == 3) {
                                                        c4233yr.f(6);
                                                    }
                                                    if (h15 == 2) {
                                                        c4233yr.e();
                                                    }
                                                } else {
                                                    c10 = 5;
                                                }
                                                int floor = ((int) Math.floor(Math.log(i23 - 1) / Math.log(2.0d))) + 1;
                                                int h16 = c4233yr.h(2);
                                                if (h16 > 0 && c4233yr.g()) {
                                                    c4233yr.f(floor);
                                                }
                                                if (c4233yr.g()) {
                                                    c4233yr.f(floor);
                                                }
                                                if (c11 == 0 && h16 == 0) {
                                                    c4233yr.e();
                                                }
                                            }
                                            i26++;
                                            c12 = c10;
                                            i14 = 8;
                                            i25 = 16;
                                            i20 = 4;
                                            i24 = 1;
                                        } else {
                                            if (c4233yr.g()) {
                                                int i27 = 8;
                                                int R10 = MA.R(c4233yr, 2, 4, 8) + 1;
                                                int i28 = 0;
                                                bArr = null;
                                                while (i28 < R10) {
                                                    int R11 = MA.R(c4233yr, 4, i27, 16);
                                                    int R12 = MA.R(c4233yr, 4, i27, 16);
                                                    if (R11 == 7) {
                                                        int h17 = c4233yr.h(4) + 1;
                                                        c4233yr.f(4);
                                                        byte[] bArr3 = new byte[h17];
                                                        for (int i29 = 0; i29 < h17; i29++) {
                                                            bArr3[i29] = (byte) c4233yr.h(i27);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        c4233yr.f(R12 * i27);
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
                                                    this.f34660q = (int) (i10 * d2);
                                                    this.f34661r = (int) (i21 * d2);
                                                    j6 = this.f34663t;
                                                    j9 = e22.f24529v;
                                                    if (j6 != j9) {
                                                        this.f34663t = j9;
                                                        String concat = h9 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(h9))) : "mhm1";
                                                        C3500lC k9 = (bArr == null || bArr.length <= 0) ? null : RB.k(AbstractC3159eu.f29994b, bArr);
                                                        C3299hP c3299hP = new C3299hP();
                                                        c3299hP.f30780a = this.f34649e;
                                                        c3299hP.d("video/mp2t");
                                                        c3299hP.e("audio/mhm1");
                                                        c3299hP.f30774I = this.f34660q;
                                                        c3299hP.f30788j = concat;
                                                        c3299hP.f30795q = k9;
                                                        this.f34650f.e(new DP(c3299hP));
                                                    }
                                                    i6 = 1;
                                                    this.f34664u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f34660q = (int) (i10 * d2);
                                                    this.f34661r = (int) (i21 * d2);
                                                    j6 = this.f34663t;
                                                    j9 = e22.f24529v;
                                                    if (j6 != j9) {
                                                    }
                                                    i6 = 1;
                                                    this.f34664u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d2 = 1.5d;
                                                    this.f34660q = (int) (i10 * d2);
                                                    this.f34661r = (int) (i21 * d2);
                                                    j6 = this.f34663t;
                                                    j9 = e22.f24529v;
                                                    if (j6 != j9) {
                                                    }
                                                    i6 = 1;
                                                    this.f34664u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d2 = 1.0d;
                                                    this.f34660q = (int) (i10 * d2);
                                                    this.f34661r = (int) (i21 * d2);
                                                    j6 = this.f34663t;
                                                    j9 = e22.f24529v;
                                                    if (j6 != j9) {
                                                    }
                                                    i6 = 1;
                                                    this.f34664u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(i10);
                                                    throw U4.c(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i19 == 17) {
                                byte[] bArr4 = cr2.f24252a;
                                C4233yr c4233yr2 = new C4233yr(bArr4, bArr4.length);
                                if (c4233yr2.g()) {
                                    c4233yr2.f(2);
                                    i9 = c4233yr2.h(13);
                                } else {
                                    i9 = 0;
                                }
                                this.f34662s = i9;
                            } else if (i19 == 2) {
                                if (this.f34664u) {
                                    this.f34653j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i30 = this.f34661r - this.f34662s;
                                double d9 = this.f34660q;
                                long round = Math.round(this.f34651g);
                                if (this.i) {
                                    this.i = false;
                                    this.f34651g = this.f34652h;
                                } else {
                                    this.f34651g += (i30 * 1000000.0d) / d9;
                                }
                                this.f34650f.c(round, i, this.f34658o, 0, null);
                                this.f34664u = false;
                                this.f34662s = 0;
                                this.f34658o = 0;
                            }
                            i6 = 1;
                        }
                        this.f34648d = i6;
                    }
                } else {
                    int B9 = cr.B();
                    Cr cr3 = this.f34645a;
                    int min3 = Math.min(B9, cr3.B());
                    cr.H(cr3.f24252a, cr3.f24253b, min3);
                    cr3.G(min3);
                    if (cr3.B() == 0) {
                        int i31 = cr3.f24254c;
                        byte[] bArr5 = cr3.f24252a;
                        C4233yr c4233yr3 = this.f34646b;
                        c4233yr3.f35232a = bArr5;
                        c4233yr3.f35233b = 0;
                        c4233yr3.f35234c = 0;
                        c4233yr3.f35235d = i31;
                        c4233yr3.c();
                        int R13 = MA.R(c4233yr3, 3, 8, 8);
                        e22.f24528u = R13;
                        if (R13 != -1) {
                            AbstractC2772Sd.i(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (c4233yr3.b() >= 2) {
                                long i32 = c4233yr3.i(2);
                                if (i32 == 3) {
                                    if (c4233yr3.b() >= 8) {
                                        long i33 = c4233yr3.i(8);
                                        long j11 = i33 + 3;
                                        if (i33 != 255) {
                                            i32 = j11;
                                        } else if (c4233yr3.b() >= 32) {
                                            i32 = c4233yr3.i(32) + j11;
                                        }
                                    }
                                }
                                j10 = i32;
                                e22.f24529v = j10;
                                if (j10 != -1) {
                                    if (j10 > 16) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 49);
                                        sb5.append("Contains sub-stream with an invalid packet label ");
                                        sb5.append(j10);
                                        throw U4.c(sb5.toString());
                                    }
                                    if (j10 == 0) {
                                        int i34 = e22.f24528u;
                                        if (i34 == 1) {
                                            throw U4.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i34 == 2) {
                                            throw U4.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i34 == 17) {
                                            throw U4.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int R14 = MA.R(c4233yr3, 11, 24, 24);
                                    e22.f24530w = R14;
                                    if (R14 != -1) {
                                        this.f34657n = 0;
                                        this.f34658o = R14 + i31 + this.f34658o;
                                        cr3.E(0);
                                        this.f34650f.a(cr3.f24254c, cr3);
                                        cr3.y(2);
                                        cr2.y(e22.f24530w);
                                        this.f34656m = true;
                                        this.f34648d = 2;
                                    }
                                }
                            }
                            j10 = -1;
                            e22.f24529v = j10;
                            if (j10 != -1) {
                            }
                        }
                        int i35 = cr3.f24254c;
                        if (i35 < 15) {
                            cr3.C(i35 + 1);
                        }
                    }
                    this.f34656m = false;
                }
            } else {
                int i36 = this.f34654k;
                if ((i36 & 2) == 0) {
                    cr.E(cr.f24254c);
                } else {
                    if ((i36 & 4) == 0) {
                        while (cr.B() > 0) {
                            int i37 = this.f34655l << 8;
                            this.f34655l = i37;
                            int K7 = i37 | cr.K();
                            this.f34655l = K7;
                            if ((K7 & 16777215) == 12583333) {
                                cr.E(cr.f24253b - 3);
                                this.f34655l = 0;
                            }
                        }
                    }
                    this.f34648d = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f34648d = 0;
        this.f34655l = 0;
        this.f34645a.y(2);
        this.f34657n = 0;
        this.f34658o = 0;
        this.f34660q = -2147483647;
        this.f34661r = -1;
        this.f34662s = 0;
        this.f34663t = -1L;
        this.f34664u = false;
        this.i = false;
        this.f34656m = true;
        this.f34653j = true;
        this.f34651g = -9.223372036854776E18d;
        this.f34652h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f34654k = i;
        if (!this.f34653j && (this.f34658o != 0 || !this.f34656m)) {
            this.i = true;
        }
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            double d2 = j6;
            if (this.i) {
                this.f34652h = d2;
            } else {
                this.f34651g = d2;
            }
        }
    }
}
