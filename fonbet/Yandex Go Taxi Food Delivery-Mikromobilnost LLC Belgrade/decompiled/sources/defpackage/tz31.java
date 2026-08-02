package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class tz31 extends gru0 {
    public s1n n;
    public int o;
    public boolean p;
    public uz31 q;
    public eg01 r;

    @Override // defpackage.gru0
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        uz31 uz31Var = this.q;
        this.o = uz31Var != null ? uz31Var.e : 0;
    }

    @Override // defpackage.gru0
    public final long b(ef90 ef90Var) {
        byte b = ef90Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        s1n s1nVar = this.n;
        d6z.z(s1nVar);
        boolean z = ((w7o[]) s1nVar.x)[(b >> 1) & (255 >>> (8 - s1nVar.a))].a;
        uz31 uz31Var = (uz31) s1nVar.b;
        int i = !z ? uz31Var.e : uz31Var.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = ef90Var.a;
        int length = bArr.length;
        int i2 = ef90Var.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            ef90Var.I(copyOf.length, copyOf);
        } else {
            ef90Var.J(i2);
        }
        byte[] bArr2 = ef90Var.a;
        int i3 = ef90Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.gru0
    public final boolean c(ef90 ef90Var, long j, zxs0 zxs0Var) {
        s1n s1nVar;
        int i;
        if (this.n != null) {
            ((a) zxs0Var.a).getClass();
            return false;
        }
        uz31 uz31Var = this.q;
        int i2 = 4;
        if (uz31Var == null) {
            xj91.f(1, ef90Var, false);
            ef90Var.q();
            int y = ef90Var.y();
            int q = ef90Var.q();
            int m = ef90Var.m();
            int i3 = m <= 0 ? -1 : m;
            int m2 = ef90Var.m();
            int i4 = m2 <= 0 ? -1 : m2;
            ef90Var.m();
            int y2 = ef90Var.y();
            int pow = (int) Math.pow(2.0d, y2 & 15);
            int pow2 = (int) Math.pow(2.0d, (y2 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4);
            ef90Var.y();
            this.q = new uz31(y, q, i3, i4, pow, pow2, Arrays.copyOf(ef90Var.a, ef90Var.c));
        } else {
            eg01 eg01Var = this.r;
            if (eg01Var == null) {
                this.r = xj91.d(ef90Var, true, true);
            } else {
                int i5 = ef90Var.c;
                byte[] bArr = new byte[i5];
                System.arraycopy(ef90Var.a, 0, bArr, 0, i5);
                int i6 = uz31Var.a;
                int i7 = 5;
                xj91.f(5, ef90Var, false);
                int y3 = ef90Var.y() + 1;
                int i8 = 2;
                a69 a69Var = new a69(ef90Var.a, 2);
                int i9 = 8;
                a69Var.u(ef90Var.b * 8);
                int i10 = 0;
                while (true) {
                    int i11 = i9;
                    int i12 = 16;
                    if (i10 >= y3) {
                        int i13 = 6;
                        int p = a69Var.p(6) + 1;
                        for (int i14 = 0; i14 < p; i14++) {
                            if (a69Var.p(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int p2 = a69Var.p(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < p2) {
                                int p3 = a69Var.p(i12);
                                if (p3 == 0) {
                                    int i18 = i11;
                                    i = p2;
                                    a69Var.u(i18);
                                    a69Var.u(16);
                                    a69Var.u(16);
                                    a69Var.u(6);
                                    a69Var.u(i18);
                                    int p4 = a69Var.p(4) + 1;
                                    int i19 = 0;
                                    while (i19 < p4) {
                                        a69Var.u(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (p3 != i15) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + p3);
                                    }
                                    int p5 = a69Var.p(5);
                                    int[] iArr = new int[p5];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < p5; i21++) {
                                        int p6 = a69Var.p(4);
                                        iArr[i21] = p6;
                                        if (p6 > i20) {
                                            i20 = p6;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = a69Var.p(i17) + 1;
                                        int p7 = a69Var.p(2);
                                        int i24 = i11;
                                        if (p7 > 0) {
                                            a69Var.u(i24);
                                        }
                                        int i25 = p2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << p7); i27 = 1) {
                                            a69Var.u(i24);
                                            i26++;
                                            i24 = 8;
                                        }
                                        i23++;
                                        p2 = i25;
                                        i11 = 8;
                                        i17 = 3;
                                    }
                                    i = p2;
                                    a69Var.u(2);
                                    int p8 = a69Var.p(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < p5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            a69Var.u(p8);
                                            i29++;
                                        }
                                    }
                                }
                                i16++;
                                p2 = i;
                                i11 = 8;
                                i13 = 6;
                                i15 = 1;
                                i12 = 16;
                            } else {
                                int i31 = i13;
                                int p9 = a69Var.p(i31) + 1;
                                int i32 = 0;
                                while (i32 < p9) {
                                    if (a69Var.p(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    a69Var.u(24);
                                    a69Var.u(24);
                                    a69Var.u(24);
                                    int p10 = a69Var.p(i31) + 1;
                                    int i33 = 8;
                                    a69Var.u(8);
                                    int[] iArr3 = new int[p10];
                                    for (int i34 = 0; i34 < p10; i34++) {
                                        iArr3[i34] = ((a69Var.o() ? a69Var.p(5) : 0) * 8) + a69Var.p(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < p10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                a69Var.u(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i31 = 6;
                                }
                                int p11 = a69Var.p(i31) + 1;
                                for (int i37 = 0; i37 < p11; i37++) {
                                    int p12 = a69Var.p(16);
                                    if (p12 != 0) {
                                        lk91.e("VorbisUtil", "mapping type other than 0 not supported: " + p12);
                                    } else {
                                        int p13 = a69Var.o() ? a69Var.p(4) + 1 : 1;
                                        if (a69Var.o()) {
                                            int p14 = a69Var.p(8) + 1;
                                            for (int i38 = 0; i38 < p14; i38++) {
                                                int i39 = i6 - 1;
                                                int i40 = 0;
                                                for (int i41 = i39; i41 > 0; i41 >>>= 1) {
                                                    i40++;
                                                }
                                                a69Var.u(i40);
                                                int i42 = 0;
                                                while (i39 > 0) {
                                                    i42++;
                                                    i39 >>>= 1;
                                                }
                                                a69Var.u(i42);
                                            }
                                        }
                                        if (a69Var.p(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (p13 > 1) {
                                            for (int i43 = 0; i43 < i6; i43++) {
                                                a69Var.u(4);
                                            }
                                        }
                                        for (int i44 = 0; i44 < p13; i44++) {
                                            a69Var.u(8);
                                            a69Var.u(8);
                                            a69Var.u(8);
                                        }
                                    }
                                }
                                int p15 = a69Var.p(6);
                                int i45 = p15 + 1;
                                w7o[] w7oVarArr = new w7o[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean o = a69Var.o();
                                    a69Var.p(16);
                                    a69Var.p(16);
                                    a69Var.p(8);
                                    w7oVarArr[i46] = new w7o(o);
                                }
                                if (!a69Var.o()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (p15 > 0) {
                                    i47++;
                                    p15 >>>= 1;
                                }
                                s1nVar = new s1n(uz31Var, eg01Var, bArr, w7oVarArr, i47);
                            }
                        }
                    } else {
                        if (a69Var.p(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((a69Var.d * 8) + a69Var.e));
                        }
                        int p16 = a69Var.p(16);
                        int p17 = a69Var.p(24);
                        if (a69Var.o()) {
                            a69Var.u(i7);
                            int i48 = 0;
                            while (i48 < p17) {
                                int i49 = 0;
                                for (int i50 = p17 - i48; i50 > 0; i50 >>>= 1) {
                                    i49++;
                                }
                                i48 += a69Var.p(i49);
                            }
                        } else {
                            boolean o2 = a69Var.o();
                            for (int i51 = 0; i51 < p17; i51++) {
                                if (!o2) {
                                    a69Var.u(i7);
                                } else if (a69Var.o()) {
                                    a69Var.u(i7);
                                }
                            }
                        }
                        int p18 = a69Var.p(i2);
                        if (p18 > i8) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + p18);
                        }
                        if (p18 == 1 || p18 == i8) {
                            a69Var.u(32);
                            a69Var.u(32);
                            int p19 = a69Var.p(i2) + 1;
                            a69Var.u(1);
                            a69Var.u((int) ((p18 == 1 ? p16 != 0 ? (long) Math.floor(Math.pow(p17, 1.0d / p16)) : 0L : p17 * p16) * p19));
                        }
                        i10++;
                        i9 = i11;
                        i8 = 2;
                        i2 = 4;
                        i7 = 5;
                    }
                }
            }
        }
        s1nVar = null;
        this.n = s1nVar;
        if (s1nVar == null) {
            return true;
        }
        uz31 uz31Var2 = (uz31) s1nVar.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(uz31Var2.g);
        arrayList.add((byte[]) s1nVar.w);
        w820 c = xj91.c(ImmutableList.m((String[]) ((eg01) s1nVar.c).a));
        f7s f7sVar = new f7s();
        f7sVar.l = eh20.q("audio/ogg");
        f7sVar.m = eh20.q("audio/vorbis");
        f7sVar.h = uz31Var2.d;
        f7sVar.i = uz31Var2.c;
        f7sVar.C = uz31Var2.a;
        f7sVar.D = uz31Var2.b;
        f7sVar.p = arrayList;
        f7sVar.k = c;
        zxs0Var.a = new a(f7sVar);
        return true;
    }

    @Override // defpackage.gru0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
