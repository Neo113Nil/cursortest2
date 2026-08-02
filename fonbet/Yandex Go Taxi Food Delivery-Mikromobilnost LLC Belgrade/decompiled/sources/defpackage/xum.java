package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class xum implements tqn {
    public final ef90 a;
    public final String c;
    public final int d;
    public String f;
    public g001 g;
    public int i;
    public int j;
    public long k;
    public a l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public xum(String str, int i, int i2) {
        this.a = new ef90(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(ef90 ef90Var, byte[] bArr, int i) {
        int min = Math.min(ef90Var.a(), i - this.i);
        ef90Var.i(this.i, min, bArr);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b9  */
    @Override // defpackage.tqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ef90 ef90Var) {
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
        d6z.z(this.g);
        while (ef90Var.a() > 0) {
            int i16 = this.h;
            int i17 = 8;
            ef90 ef90Var2 = this.a;
            switch (i16) {
                case 0:
                    while (true) {
                        if (ef90Var.a() > 0) {
                            int i18 = this.j << 8;
                            this.j = i18;
                            int y = i18 | ef90Var.y();
                            this.j = y;
                            int i19 = (y == 2147385345 || y == -25230976 || y == 536864768 || y == -14745368) ? 1 : (y == 1683496997 || y == 622876772) ? 2 : (y == 1078008818 || y == -233094848) ? 3 : (y == 1908687592 || y == -398277519) ? 4 : 0;
                            this.n = i19;
                            if (i19 != 0) {
                                byte[] bArr = ef90Var2.a;
                                bArr[0] = (byte) ((y >> 24) & 255);
                                bArr[1] = (byte) ((y >> 16) & 255);
                                bArr[2] = (byte) ((y >> 8) & 255);
                                bArr[3] = (byte) (y & 255);
                                this.i = 4;
                                this.j = 0;
                                if (i19 != 3 && i19 != 4) {
                                    if (i19 == 1) {
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
                    if (!a(ef90Var, ef90Var2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = ef90Var2.a;
                        if (this.l == null) {
                            String str = this.f;
                            df90 b5 = ua91.b(bArr2);
                            b5.o(60);
                            int i20 = ua91.a[b5.g(6)];
                            int i21 = ua91.b[b5.g(4)];
                            int g = b5.g(5);
                            int i22 = g >= 29 ? -1 : (ua91.c[g] * 1000) / 2;
                            b5.o(10);
                            int i23 = i20 + (b5.g(2) > 0 ? 1 : 0);
                            f7s f7sVar = new f7s();
                            f7sVar.a = str;
                            f7sVar.l = eh20.q(this.e);
                            f7sVar.m = eh20.q("audio/vnd.dts");
                            f7sVar.h = i22;
                            f7sVar.C = i23;
                            f7sVar.D = i21;
                            f7sVar.q = null;
                            f7sVar.d = this.c;
                            f7sVar.f = this.d;
                            a aVar = new a(f7sVar);
                            this.l = aVar;
                            this.g.d(aVar);
                        }
                        byte b6 = bArr2[0];
                        if (b6 != -2) {
                            if (b6 == -1) {
                                i5 = ((3 & bArr2[7]) << 12) | ((bArr2[6] & 255) << 4);
                                b4 = bArr2[9];
                            } else if (b6 != 31) {
                                i = ((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4);
                                b = bArr2[7];
                            } else {
                                i5 = ((3 & bArr2[6]) << 12) | ((bArr2[7] & 255) << 4);
                                b4 = bArr2[8];
                            }
                            i2 = (i5 | ((b4 & Alerts.alert_export_restriction) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i2 = (i2 * 16) / 14;
                            }
                            this.m = i2;
                            if (b6 == -2) {
                                if (b6 == -1) {
                                    i3 = (bArr2[4] & 7) << 4;
                                    b3 = bArr2[7];
                                } else if (b6 != 31) {
                                    i3 = (bArr2[4] & 1) << 6;
                                    b2 = bArr2[5];
                                } else {
                                    i3 = (bArr2[5] & 7) << 4;
                                    b3 = bArr2[6];
                                }
                                i4 = b3 & Alerts.alert_export_restriction;
                                this.k = com.google.common.primitives.a.b(tw21.c0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                                ef90Var2.K(0);
                                this.g.a(ef90Var2, 18, 0);
                                this.h = 6;
                                break;
                            } else {
                                i3 = (bArr2[5] & 1) << 6;
                                b2 = bArr2[4];
                            }
                            i4 = b2 & 252;
                            this.k = com.google.common.primitives.a.b(tw21.c0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                            ef90Var2.K(0);
                            this.g.a(ef90Var2, 18, 0);
                            this.h = 6;
                        } else {
                            i = ((3 & bArr2[4]) << 12) | ((bArr2[7] & 255) << 4);
                            b = bArr2[6];
                        }
                        i2 = (i | ((b & 240) >> 4)) + 1;
                        z = false;
                        if (z) {
                        }
                        this.m = i2;
                        if (b6 == -2) {
                        }
                        i4 = b2 & 252;
                        this.k = com.google.common.primitives.a.b(tw21.c0(this.l.E, (((i4 >> 2) | i3) + 1) * 32));
                        ef90Var2.K(0);
                        this.g.a(ef90Var2, 18, 0);
                        this.h = 6;
                    }
                case 2:
                    if (a(ef90Var, ef90Var2.a, 7)) {
                        df90 b7 = ua91.b(ef90Var2.a);
                        b7.o(42);
                        this.o = b7.g(b7.f() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a(ef90Var, ef90Var2.a, this.o)) {
                        df90 b8 = ua91.b(ef90Var2.a);
                        b8.o(40);
                        int g2 = b8.g(2);
                        if (b8.f()) {
                            i6 = 20;
                            i7 = 12;
                        } else {
                            i6 = 16;
                            i7 = 8;
                        }
                        b8.o(i7);
                        int g3 = b8.g(i6) + 1;
                        boolean f = b8.f();
                        if (f) {
                            i8 = b8.g(2);
                            i9 = (b8.g(3) + 1) * 512;
                            if (b8.f()) {
                                b8.o(36);
                            }
                            int g4 = b8.g(3) + 1;
                            int g5 = b8.g(3) + 1;
                            if (g4 != 1 || g5 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i24 = g2 + 1;
                            int g6 = b8.g(i24);
                            int i25 = 0;
                            while (i25 < i24) {
                                if (((g6 >> i25) & 1) == 1) {
                                    b8.o(i17);
                                }
                                i25++;
                                i17 = 8;
                            }
                            if (b8.f()) {
                                b8.o(2);
                                int g7 = (b8.g(2) + 1) << 2;
                                int g8 = b8.g(2) + 1;
                                for (int i26 = 0; i26 < g8; i26++) {
                                    b8.o(g7);
                                }
                            }
                        } else {
                            i8 = -1;
                            i9 = 0;
                        }
                        b8.o(i6);
                        b8.o(12);
                        if (f) {
                            if (b8.f()) {
                                b8.o(4);
                            }
                            if (b8.f()) {
                                b8.o(24);
                            }
                            if (b8.f()) {
                                b8.p(b8.g(10) + 1);
                            }
                            b8.o(5);
                            i11 = ua91.d[b8.g(4)];
                            i10 = b8.g(8) + 1;
                        } else {
                            i10 = -1;
                            i11 = -2147483647;
                        }
                        if (f) {
                            if (i8 == 0) {
                                i12 = 32000;
                            } else if (i8 == 1) {
                                i12 = 44100;
                            } else {
                                if (i8 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i8);
                                }
                                i12 = 48000;
                            }
                            int i27 = tw21.a;
                            j = tw21.e0(i9, 1000000L, i12, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        c(new a4("audio/vnd.dts.hd;profile=lbr", i10, i11, g3, j));
                        this.m = g3;
                        this.k = j == -9223372036854775807L ? 0L : j;
                        ef90Var2.K(0);
                        this.g.a(ef90Var2, this.o, 0);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(ef90Var, ef90Var2.a, 6)) {
                        df90 b9 = ua91.b(ef90Var2.a);
                        b9.o(32);
                        int c = ua91.c(b9, ua91.i) + 1;
                        this.p = c;
                        int i28 = this.i;
                        if (i28 > c) {
                            int i29 = i28 - c;
                            this.i = i28 - i29;
                            ef90Var.K(ef90Var.b - i29);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(ef90Var, ef90Var2.a, this.p)) {
                        byte[] bArr3 = ef90Var2.a;
                        df90 b10 = ua91.b(bArr3);
                        int i30 = b10.g(32) == 1078008818 ? 1 : 0;
                        int c2 = ua91.c(b10, ua91.e);
                        int i31 = c2 + 1;
                        if (i30 == 0) {
                            j2 = -9223372036854775807L;
                            i13 = -2147483647;
                        } else {
                            if (!b10.f()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i32 = c2 - 1;
                            int i33 = ((bArr3[i32] << 8) & 65535) | (bArr3[c2] & 255);
                            int i34 = tw21.a;
                            int i35 = 65535;
                            for (int i36 = 0; i36 < i32; i36++) {
                                int unsignedInt = Byte.toUnsignedInt(bArr3[i36]);
                                int[] iArr = tw21.m;
                                int i37 = (((i35 << 4) & 65535) ^ iArr[(((i35 >> 12) & 255) ^ (unsignedInt >> 4)) & 255]) & 65535;
                                i35 = (iArr[(((i37 >> 12) & 255) ^ (unsignedInt & 15)) & 255] ^ ((i37 << 4) & 65535)) & 65535;
                            }
                            if (i33 != i35) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int g9 = b10.g(2);
                            if (g9 == 0) {
                                i14 = 512;
                            } else if (g9 == 1) {
                                i14 = 480;
                            } else {
                                if (g9 != 2) {
                                    throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + g9);
                                }
                                i14 = 384;
                            }
                            int g10 = (b10.g(3) + 1) * i14;
                            int g11 = b10.g(2);
                            if (g11 == 0) {
                                i15 = 32000;
                            } else if (g11 == 1) {
                                i15 = 44100;
                            } else {
                                if (g11 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + g11);
                                }
                                i15 = 48000;
                            }
                            if (b10.f()) {
                                b10.o(36);
                            }
                            i13 = i15 * (1 << b10.g(2));
                            j2 = tw21.e0(g10, 1000000L, i15, RoundingMode.DOWN);
                        }
                        int i38 = 0;
                        for (int i39 = 0; i39 < i30; i39++) {
                            i38 += ua91.c(b10, ua91.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i30 != 0) {
                            atomicInteger.set(ua91.c(b10, ua91.g));
                        }
                        int c3 = i38 + (atomicInteger.get() != 0 ? ua91.c(b10, ua91.h) : 0) + i31;
                        a4 a4Var = new a4("audio/vnd.dts.uhd;profile=p2", 2, i13, c3, j2);
                        if (this.n == 3) {
                            c(a4Var);
                        }
                        this.m = c3;
                        this.k = j2 == -9223372036854775807L ? 0L : j2;
                        ef90Var2.K(0);
                        this.g.a(ef90Var2, this.p, 0);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(ef90Var.a(), this.m - this.i);
                    this.g.a(ef90Var, min, 0);
                    int i40 = this.i + min;
                    this.i = i40;
                    if (i40 != this.m) {
                        break;
                    } else {
                        d6z.x(this.q != -9223372036854775807L);
                        this.g.c(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    ny61.k();
                    return;
            }
        }
    }

    public final void c(a4 a4Var) {
        int i = a4Var.b;
        String str = a4Var.a;
        int i2 = a4Var.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        a aVar = this.l;
        if (aVar != null && i2 == aVar.D && i == aVar.E && str.equals(aVar.n)) {
            return;
        }
        a aVar2 = this.l;
        f7s f7sVar = aVar2 == null ? new f7s() : aVar2.a();
        f7sVar.a = this.f;
        f7sVar.l = eh20.q(this.e);
        f7sVar.m = eh20.q(str);
        f7sVar.C = i2;
        f7sVar.D = i;
        f7sVar.d = this.c;
        f7sVar.f = this.d;
        a aVar3 = new a(f7sVar);
        this.l = aVar3;
        this.g.d(aVar3);
    }

    @Override // defpackage.tqn
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.f = xi11Var.e;
        xi11Var.d();
        this.g = d5pVar.B(xi11Var.d, 1);
    }
}
