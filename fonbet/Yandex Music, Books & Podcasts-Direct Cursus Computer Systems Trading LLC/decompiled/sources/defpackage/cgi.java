package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;

/* loaded from: classes.dex */
public final class cgi implements q2b {
    public String e;
    public azs f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final d7k a = new d7k(new byte[15], 2);
    public final v94 b = new v94();
    public final d7k c = new d7k();
    public final nmc p = new nmc();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041c  */
    @Override // defpackage.q2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        int i6;
        long j3;
        boolean z;
        int i7;
        vq1.B(this.f);
        while (d7kVar.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                d7k d7kVar2 = this.c;
                nmc nmcVar = this.p;
                if (i8 == 1) {
                    int a = d7kVar.a();
                    d7k d7kVar3 = this.a;
                    int min = Math.min(a, d7kVar3.a());
                    d7kVar.f(d7kVar3.a, d7kVar3.b, min);
                    d7kVar3.I(min);
                    if (d7kVar3.a() == 0) {
                        int i12 = d7kVar3.c;
                        byte[] bArr2 = d7kVar3.a;
                        v94 v94Var = this.b;
                        v94Var.o(i12, bArr2);
                        v94Var.f();
                        int T = g0g.T(v94Var, 3, 8, 8);
                        nmcVar.b = T;
                        if (T != -1) {
                            vq1.v(Math.max(Math.max(2, 8), 32) <= 63);
                            bzf.x(bzf.x(3L, 255L), 4294967296L);
                            if (v94Var.b() >= 2) {
                                long k = v94Var.k(2);
                                if (k == 3) {
                                    if (v94Var.b() >= 8) {
                                        long k2 = v94Var.k(8);
                                        k += k2;
                                        if (k2 == 255) {
                                            if (v94Var.b() >= 32) {
                                                k = v94Var.k(32) + k;
                                            }
                                        }
                                    }
                                }
                                j3 = k;
                                nmcVar.a = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        throw r7k.c("Contains sub-stream with an invalid packet label " + nmcVar.a);
                                    }
                                    if (j3 == 0) {
                                        int i13 = nmcVar.b;
                                        if (i13 == 1) {
                                            throw r7k.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i13 == 2) {
                                            throw r7k.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i13 == 17) {
                                            throw r7k.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int T2 = g0g.T(v94Var, 11, 24, 24);
                                    nmcVar.c = T2;
                                    if (T2 != -1) {
                                        z = true;
                                        if (z) {
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                            this.n = 0;
                                            this.o = nmcVar.c + i12 + this.o;
                                        }
                                        if (z) {
                                            int i14 = d7kVar3.c;
                                            if (i14 < 15) {
                                                d7kVar3.G(i14 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            d7kVar3.H(i7);
                                            this.f.b(d7kVar3, d7kVar3.c, i7);
                                            d7kVar3.E(2);
                                            d7kVar2.E(nmcVar.c);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j3 = -1;
                            nmcVar.a = j3;
                            if (j3 != -1) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (z) {
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i8 != 2) {
                        e7o.n();
                        return;
                    }
                    int i15 = nmcVar.b;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = d7kVar.b;
                        int min2 = Math.min(d7kVar.a(), d7kVar2.a());
                        d7kVar.f(d7kVar2.a, d7kVar2.b, min2);
                        d7kVar2.I(min2);
                        d7kVar.H(i16);
                    }
                    int min3 = Math.min(d7kVar.a(), nmcVar.c - this.n);
                    this.f.b(d7kVar, min3, 0);
                    int i17 = this.n + min3;
                    this.n = i17;
                    if (i17 != nmcVar.c) {
                        continue;
                    } else {
                        int i18 = nmcVar.b;
                        if (i18 == 1) {
                            byte[] bArr3 = d7kVar2.a;
                            v94 v94Var2 = new v94(bArr3, bArr3.length);
                            int i19 = v94Var2.i(8);
                            int i20 = v94Var2.i(5);
                            if (i20 != 31) {
                                switch (i20) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case 3:
                                        i4 = ScreenMirroringConfig.Audio.SAMPLING_RATE;
                                        break;
                                    case 4:
                                        i4 = RemoteCameraConfig.Mic.SAMPLING_RATE;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw r7k.c("Unsupported sampling rate index " + i20);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = v94Var2.i(24);
                            }
                            int i21 = v94Var2.i(3);
                            if (i21 == 0) {
                                i5 = 768;
                            } else if (i21 == 1) {
                                i5 = 1024;
                            } else if (i21 == 2 || i21 == 3) {
                                i5 = 2048;
                            } else {
                                if (i21 != 4) {
                                    throw r7k.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                i5 = 4096;
                            }
                            int i22 = i5;
                            if (i21 == 0 || i21 == 1) {
                                c = 0;
                            } else if (i21 == 2) {
                                c = 2;
                            } else if (i21 == 3) {
                                c = 3;
                            } else {
                                if (i21 != 4) {
                                    throw r7k.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                c = 1;
                            }
                            v94Var2.t(2);
                            g0g.W(v94Var2);
                            int i23 = v94Var2.i(5);
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                int i26 = i11;
                                int i27 = 16;
                                if (i24 < i23 + 1) {
                                    int i28 = v94Var2.i(3);
                                    i25 = g0g.T(v94Var2, 5, 8, 16) + 1 + i25;
                                    if ((i28 == 0 || i28 == 2) && v94Var2.h()) {
                                        g0g.W(v94Var2);
                                    }
                                    i24++;
                                    i11 = i26;
                                } else {
                                    int T3 = g0g.T(v94Var2, 4, 8, 16) + 1;
                                    v94Var2.s();
                                    int i29 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i29 < T3) {
                                            int i30 = v94Var2.i(2);
                                            if (i30 == 0) {
                                                v94Var2.t(i10);
                                                if (v94Var2.h()) {
                                                    v94Var2.t(13);
                                                }
                                                if (c > 0) {
                                                    g0g.V(v94Var2);
                                                }
                                            } else if (i30 == i26) {
                                                v94Var2.t(i10);
                                                boolean h = v94Var2.h();
                                                if (h) {
                                                    v94Var2.t(13);
                                                }
                                                if (h) {
                                                    v94Var2.s();
                                                }
                                                if (c > 0) {
                                                    g0g.V(v94Var2);
                                                    i6 = v94Var2.i(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    v94Var2.t(6);
                                                    int i31 = v94Var2.i(2);
                                                    v94Var2.t(4);
                                                    if (v94Var2.h()) {
                                                        v94Var2.t(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        v94Var2.t(6);
                                                    }
                                                    if (i31 == 2) {
                                                        v94Var2.s();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i25 - 1) / Math.log(2.0d))) + 1;
                                                int i32 = v94Var2.i(2);
                                                if (i32 > 0 && v94Var2.h()) {
                                                    v94Var2.t(floor);
                                                }
                                                if (v94Var2.h()) {
                                                    v94Var2.t(floor);
                                                }
                                                if (c == 0 && i32 == 0) {
                                                    v94Var2.s();
                                                }
                                            } else if (i30 == i10) {
                                                g0g.T(v94Var2, 4, i9, i27);
                                                int T4 = g0g.T(v94Var2, 4, i9, i27);
                                                if (v94Var2.h()) {
                                                    g0g.T(v94Var2, i9, i27, 0);
                                                }
                                                v94Var2.s();
                                                if (T4 > 0) {
                                                    v94Var2.t(T4 * 8);
                                                }
                                            }
                                            i29++;
                                            i9 = 8;
                                            i10 = 3;
                                            i27 = 16;
                                            i26 = 1;
                                        } else {
                                            if (v94Var2.h()) {
                                                int i33 = 8;
                                                int T5 = g0g.T(v94Var2, 2, 4, 8) + 1;
                                                int i34 = 0;
                                                bArr = null;
                                                while (i34 < T5) {
                                                    int T6 = g0g.T(v94Var2, 4, i33, 16);
                                                    int T7 = g0g.T(v94Var2, 4, i33, 16);
                                                    if (T6 == 7) {
                                                        int i35 = v94Var2.i(4) + 1;
                                                        v94Var2.t(4);
                                                        byte[] bArr4 = new byte[i35];
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            bArr4[i36] = (byte) v94Var2.i(i33);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        v94Var2.t(T7 * i33);
                                                    }
                                                    i34++;
                                                    i33 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = nmcVar.a;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String concat = i19 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i19))) : "mhm1";
                                                        qsn z2 = (bArr == null || bArr.length <= 0) ? null : yde.z(dvt.c, bArr);
                                                        bsc bscVar = new bsc();
                                                        bscVar.a = this.e;
                                                        bscVar.l = l5i.p("video/mp2t");
                                                        bscVar.m = l5i.p("audio/mhm1");
                                                        bscVar.D = this.q;
                                                        bscVar.j = concat;
                                                        bscVar.p = z2;
                                                        this.f.d(new dsc(bscVar));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = nmcVar.a;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = nmcVar.a;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case RemoteCameraConfig.Mic.SAMPLING_RATE /* 44100 */:
                                                case ScreenMirroringConfig.Audio.SAMPLING_RATE /* 48000 */:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = nmcVar.a;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw r7k.c("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr5 = d7kVar2.a;
                                v94 v94Var3 = new v94(bArr5, bArr5.length);
                                if (v94Var3.h()) {
                                    v94Var3.t(2);
                                    i3 = v94Var3.i(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i18 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(round, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i37 = this.k;
                if ((i37 & 2) == 0) {
                    d7kVar.H(d7kVar.c);
                } else {
                    if ((i37 & 4) == 0) {
                        while (d7kVar.a() > 0) {
                            int i38 = this.l << 8;
                            this.l = i38;
                            int v = i38 | d7kVar.v();
                            this.l = v;
                            if ((v & 16777215) == 12583333) {
                                d7kVar.H(d7kVar.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.E(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.e = (String) cp2Var.e;
        cp2Var.i();
        this.f = t2cVar.M(cp2Var.c, 1);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
    }
}
