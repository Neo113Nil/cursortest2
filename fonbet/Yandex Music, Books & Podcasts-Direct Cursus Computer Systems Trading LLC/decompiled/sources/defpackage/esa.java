package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class esa implements q2b {
    public final d7k a;
    public final String c;
    public final int d;
    public String f;
    public azs g;
    public int i;
    public int j;
    public long k;
    public dsc l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public esa(String str, int i, int i2) {
        this.a = new d7k(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(d7k d7kVar, byte[] bArr, int i) {
        int min = Math.min(d7kVar.a(), i - this.i);
        d7kVar.f(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b8  */
    @Override // defpackage.q2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar) {
        int i;
        byte b;
        boolean z;
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        byte b4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j;
        int i12;
        long j2;
        int i13;
        int i14;
        int i15;
        int i16;
        vq1.B(this.g);
        while (d7kVar.a() > 0) {
            int i17 = this.h;
            int i18 = 8;
            d7k d7kVar2 = this.a;
            switch (i17) {
                case 0:
                    while (true) {
                        if (d7kVar.a() > 0) {
                            int i19 = this.j << 8;
                            this.j = i19;
                            int v = i19 | d7kVar.v();
                            this.j = v;
                            int i20 = (v == 2147385345 || v == -25230976 || v == 536864768 || v == -14745368) ? 1 : (v == 1683496997 || v == 622876772) ? 2 : (v == 1078008818 || v == -233094848) ? 3 : (v == 1908687592 || v == -398277519) ? 4 : 0;
                            this.n = i20;
                            if (i20 != 0) {
                                byte[] bArr = d7kVar2.a;
                                bArr[0] = (byte) ((v >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[1] = (byte) ((v >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[2] = (byte) ((v >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[3] = (byte) (v & KotlinVersion.MAX_COMPONENT_VALUE);
                                this.i = 4;
                                this.j = 0;
                                if (i20 != 3 && i20 != 4) {
                                    if (i20 == 1) {
                                        this.h = 1;
                                        break;
                                    } else {
                                        this.h = 2;
                                        break;
                                    }
                                } else {
                                    this.h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(d7kVar, d7kVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = d7kVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            v94 U = cxb.U(bArr2);
                            U.t(60);
                            int i21 = cxb.h[U.i(6)];
                            int i22 = cxb.i[U.i(4)];
                            int i23 = U.i(5);
                            int i24 = i23 >= 29 ? -1 : (cxb.j[i23] * 1000) / 2;
                            U.t(10);
                            int i25 = i21 + (U.i(2) > 0 ? 1 : 0);
                            bsc bscVar = new bsc();
                            bscVar.a = str;
                            bscVar.l = l5i.p(this.e);
                            bscVar.m = l5i.p("audio/vnd.dts");
                            bscVar.h = i24;
                            bscVar.C = i25;
                            bscVar.D = i22;
                            bscVar.q = null;
                            bscVar.d = this.c;
                            bscVar.f = this.d;
                            dsc dscVar = new dsc(bscVar);
                            this.l = dscVar;
                            this.g.d(dscVar);
                        }
                        byte b5 = bArr2[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i5 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b4 = bArr2[9];
                            } else if (b5 != 31) {
                                i = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b = bArr2[7];
                            } else {
                                i5 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b4 = bArr2[8];
                            }
                            i2 = (i5 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i2 = (i2 * 16) / 14;
                            }
                            this.m = i2;
                            if (b5 == -2) {
                                if (b5 == -1) {
                                    i3 = (bArr2[4] & 7) << 4;
                                    b3 = bArr2[7];
                                } else if (b5 != 31) {
                                    i3 = (bArr2[4] & 1) << 6;
                                    b2 = bArr2[5];
                                } else {
                                    i3 = (bArr2[5] & 7) << 4;
                                    b3 = bArr2[6];
                                }
                                i4 = b3 & 60;
                                this.k = zc4.s(dvt.e0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                                d7kVar2.H(0);
                                this.g.b(d7kVar2, 18, 0);
                                this.h = 6;
                                break;
                            } else {
                                i3 = (bArr2[5] & 1) << 6;
                                b2 = bArr2[4];
                            }
                            i4 = b2 & 252;
                            this.k = zc4.s(dvt.e0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                            d7kVar2.H(0);
                            this.g.b(d7kVar2, 18, 0);
                            this.h = 6;
                        } else {
                            i = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b = bArr2[6];
                        }
                        i2 = (i | ((b & 240) >> 4)) + 1;
                        z = false;
                        if (z) {
                        }
                        this.m = i2;
                        if (b5 == -2) {
                        }
                        i4 = b2 & 252;
                        this.k = zc4.s(dvt.e0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                        d7kVar2.H(0);
                        this.g.b(d7kVar2, 18, 0);
                        this.h = 6;
                    }
                case 2:
                    if (a(d7kVar, d7kVar2.a, 7)) {
                        v94 U2 = cxb.U(d7kVar2.a);
                        U2.t(42);
                        this.o = U2.i(U2.h() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a(d7kVar, d7kVar2.a, this.o)) {
                        v94 U3 = cxb.U(d7kVar2.a);
                        U3.t(40);
                        int i26 = U3.i(2);
                        if (U3.h()) {
                            i6 = 20;
                            i7 = 12;
                        } else {
                            i6 = 16;
                            i7 = 8;
                        }
                        U3.t(i7);
                        int i27 = U3.i(i6) + 1;
                        boolean h = U3.h();
                        if (h) {
                            i8 = U3.i(2);
                            i9 = (U3.i(3) + 1) * RemoteCameraConfig.Mic.BUFFER_SIZE;
                            if (U3.h()) {
                                U3.t(36);
                            }
                            int i28 = U3.i(3) + 1;
                            int i29 = U3.i(3) + 1;
                            if (i28 != 1 || i29 != 1) {
                                throw r7k.c("Multiple audio presentations or assets not supported");
                            }
                            int i30 = i26 + 1;
                            int i31 = U3.i(i30);
                            int i32 = 0;
                            while (i32 < i30) {
                                if (((i31 >> i32) & 1) == 1) {
                                    U3.t(i18);
                                }
                                i32++;
                                i18 = 8;
                            }
                            if (U3.h()) {
                                U3.t(2);
                                int i33 = (U3.i(2) + 1) << 2;
                                int i34 = U3.i(2) + 1;
                                for (int i35 = 0; i35 < i34; i35++) {
                                    U3.t(i33);
                                }
                            }
                        } else {
                            i8 = -1;
                            i9 = 0;
                        }
                        U3.t(i6);
                        U3.t(12);
                        if (h) {
                            if (U3.h()) {
                                U3.t(4);
                            }
                            if (U3.h()) {
                                U3.t(24);
                            }
                            if (U3.h()) {
                                U3.u(U3.i(10) + 1);
                            }
                            U3.t(5);
                            i11 = cxb.k[U3.i(4)];
                            i10 = U3.i(8) + 1;
                        } else {
                            i10 = -1;
                            i11 = -2147483647;
                        }
                        if (h) {
                            if (i8 == 0) {
                                i12 = 32000;
                            } else if (i8 == 1) {
                                i12 = RemoteCameraConfig.Mic.SAMPLING_RATE;
                            } else {
                                if (i8 != 2) {
                                    throw r7k.a(null, "Unsupported reference clock code in DTS HD header: " + i8);
                                }
                                i12 = ScreenMirroringConfig.Audio.SAMPLING_RATE;
                            }
                            int i36 = dvt.a;
                            j = dvt.g0(i9, 1000000L, i12, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        g(new c1("audio/vnd.dts.hd;profile=lbr", i10, i11, i27, j));
                        this.m = i27;
                        this.k = j == -9223372036854775807L ? 0L : j;
                        d7kVar2.H(0);
                        this.g.b(d7kVar2, this.o, 0);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(d7kVar, d7kVar2.a, 6)) {
                        v94 U4 = cxb.U(d7kVar2.a);
                        U4.t(32);
                        int c0 = cxb.c0(U4, cxb.p) + 1;
                        this.p = c0;
                        int i37 = this.i;
                        if (i37 > c0) {
                            int i38 = i37 - c0;
                            this.i = i37 - i38;
                            d7kVar.H(d7kVar.b - i38);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(d7kVar, d7kVar2.a, this.p)) {
                        byte[] bArr3 = d7kVar2.a;
                        v94 U5 = cxb.U(bArr3);
                        int i39 = U5.i(32) == 1078008818 ? 1 : 0;
                        int c02 = cxb.c0(U5, cxb.l);
                        int i40 = c02 + 1;
                        if (i39 == 0) {
                            j2 = -9223372036854775807L;
                            i13 = -2147483647;
                        } else {
                            if (!U5.h()) {
                                throw r7k.c("Only supports full channel mask-based audio presentation");
                            }
                            int i41 = c02 - 1;
                            int i42 = ((bArr3[i41] << 8) & 65535) | (bArr3[c02] & 255);
                            int i43 = dvt.a;
                            int i44 = 65535;
                            for (int i45 = 0; i45 < i41; i45++) {
                                byte b6 = bArr3[i45];
                                int i46 = (((i44 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE) ^ ((b6 & 255) >> 4)) & KotlinVersion.MAX_COMPONENT_VALUE;
                                int i47 = (i44 << 4) & 65535;
                                int[] iArr = dvt.m;
                                int i48 = (iArr[i46] ^ i47) & 65535;
                                i44 = (((i48 << 4) & 65535) ^ iArr[((b6 & 15) ^ ((i48 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE]) & 65535;
                            }
                            if (i42 != i44) {
                                throw r7k.a(null, "CRC check failed");
                            }
                            int i49 = U5.i(2);
                            if (i49 != 0) {
                                if (i49 == 1) {
                                    i15 = 480;
                                } else {
                                    if (i49 != 2) {
                                        throw r7k.a(null, "Unsupported base duration index in DTS UHD header: " + i49);
                                    }
                                    i15 = 384;
                                }
                                i14 = 3;
                            } else {
                                i14 = 3;
                                i15 = RemoteCameraConfig.Mic.BUFFER_SIZE;
                            }
                            int i50 = (U5.i(i14) + 1) * i15;
                            int i51 = U5.i(2);
                            if (i51 == 0) {
                                i16 = 32000;
                            } else if (i51 == 1) {
                                i16 = RemoteCameraConfig.Mic.SAMPLING_RATE;
                            } else {
                                if (i51 != 2) {
                                    throw r7k.a(null, "Unsupported clock rate index in DTS UHD header: " + i51);
                                }
                                i16 = ScreenMirroringConfig.Audio.SAMPLING_RATE;
                            }
                            if (U5.h()) {
                                U5.t(36);
                            }
                            int i52 = i16 * (1 << U5.i(2));
                            j2 = dvt.g0(i50, 1000000L, i16, RoundingMode.DOWN);
                            i13 = i52;
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i39; i54++) {
                            i53 += cxb.c0(U5, cxb.m);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i39 != 0) {
                            atomicInteger.set(cxb.c0(U5, cxb.n));
                        }
                        int c03 = i53 + (atomicInteger.get() != 0 ? cxb.c0(U5, cxb.o) : 0) + i40;
                        c1 c1Var = new c1("audio/vnd.dts.uhd;profile=p2", 2, i13, c03, j2);
                        if (this.n == 3) {
                            g(c1Var);
                        }
                        this.m = c03;
                        this.k = j2 == -9223372036854775807L ? 0L : j2;
                        d7kVar2.H(0);
                        this.g.b(d7kVar2, this.p, 0);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(d7kVar.a(), this.m - this.i);
                    this.g.b(d7kVar, min, 0);
                    int i55 = this.i + min;
                    this.i = i55;
                    if (i55 != this.m) {
                        break;
                    } else {
                        vq1.A(this.q != -9223372036854775807L);
                        this.g.a(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    e7o.n();
                    return;
            }
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.f = (String) cp2Var.e;
        cp2Var.i();
        this.g = t2cVar.M(cp2Var.c, 1);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.q = j;
    }

    public final void g(c1 c1Var) {
        int i = c1Var.b;
        String str = c1Var.a;
        int i2 = c1Var.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        dsc dscVar = this.l;
        if (dscVar != null && i2 == dscVar.D && i == dscVar.E && str.equals(dscVar.n)) {
            return;
        }
        dsc dscVar2 = this.l;
        bsc bscVar = dscVar2 == null ? new bsc() : dscVar2.a();
        bscVar.a = this.f;
        bscVar.l = l5i.p(this.e);
        bscVar.m = l5i.p(str);
        bscVar.C = i2;
        bscVar.D = i;
        bscVar.d = this.c;
        bscVar.f = this.d;
        dsc dscVar3 = new dsc(bscVar);
        this.l = dscVar3;
        this.g.d(dscVar3);
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
    }
}
