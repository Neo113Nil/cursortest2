package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class lju extends rjr {
    public c1t n;
    public int o;
    public boolean p;
    public bgi q;
    public mju r;

    @Override // defpackage.rjr
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        bgi bgiVar = this.q;
        this.o = bgiVar != null ? bgiVar.e : 0;
    }

    @Override // defpackage.rjr
    public final long b(d7k d7kVar) {
        byte b = d7kVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        c1t c1tVar = this.n;
        vq1.B(c1tVar);
        boolean z = ((n20[]) c1tVar.f)[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - c1tVar.b))].a;
        bgi bgiVar = (bgi) c1tVar.c;
        int i = !z ? bgiVar.e : bgiVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = d7kVar.a;
        int length = bArr.length;
        int i2 = d7kVar.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            d7kVar.F(copyOf.length, copyOf);
        } else {
            d7kVar.G(i2);
        }
        byte[] bArr2 = d7kVar.a;
        int i3 = d7kVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // defpackage.rjr
    public final boolean c(d7k d7kVar, long j, aqd aqdVar) {
        c1t c1tVar;
        if (this.n != null) {
            ((dsc) aqdVar.b).getClass();
            return false;
        }
        bgi bgiVar = this.q;
        int i = 4;
        if (bgiVar == null) {
            szf.w0(1, d7kVar, false);
            d7kVar.n();
            int v = d7kVar.v();
            int n = d7kVar.n();
            int j2 = d7kVar.j();
            if (j2 <= 0) {
                j2 = -1;
            }
            int j3 = d7kVar.j();
            int i2 = j3 > 0 ? j3 : -1;
            d7kVar.j();
            int v2 = d7kVar.v();
            int pow = (int) Math.pow(2.0d, v2 & 15);
            int pow2 = (int) Math.pow(2.0d, (v2 & 240) >> 4);
            d7kVar.v();
            ?? copyOf = Arrays.copyOf(d7kVar.a, d7kVar.c);
            bgi bgiVar2 = new bgi();
            bgiVar2.a = v;
            bgiVar2.b = n;
            bgiVar2.c = j2;
            bgiVar2.d = i2;
            bgiVar2.e = pow;
            bgiVar2.f = pow2;
            bgiVar2.g = copyOf;
            this.q = bgiVar2;
        } else {
            mju mjuVar = this.r;
            if (mjuVar == null) {
                this.r = szf.n0(d7kVar, true, true);
            } else {
                int i3 = d7kVar.c;
                byte[] bArr = new byte[i3];
                System.arraycopy(d7kVar.a, 0, bArr, 0, i3);
                int i4 = bgiVar.a;
                int i5 = 5;
                szf.w0(5, d7kVar, false);
                int v3 = d7kVar.v() + 1;
                v94 v94Var = new v94(d7kVar.a);
                int i6 = 8;
                v94Var.t(d7kVar.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 16;
                    if (i7 < v3) {
                        int i9 = i6;
                        if (v94Var.i(24) != 5653314) {
                            throw r7k.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((v94Var.d * 8) + v94Var.e));
                        }
                        int i10 = v94Var.i(16);
                        int i11 = v94Var.i(24);
                        if (v94Var.h()) {
                            v94Var.t(i5);
                            int i12 = 0;
                            while (i12 < i11) {
                                int i13 = 0;
                                for (int i14 = i11 - i12; i14 > 0; i14 >>>= 1) {
                                    i13++;
                                }
                                i12 += v94Var.i(i13);
                            }
                        } else {
                            boolean h = v94Var.h();
                            for (int i15 = 0; i15 < i11; i15++) {
                                if (!h) {
                                    v94Var.t(i5);
                                } else if (v94Var.h()) {
                                    v94Var.t(i5);
                                }
                            }
                        }
                        int i16 = v94Var.i(4);
                        if (i16 > 2) {
                            throw r7k.a(null, "lookup type greater than 2 not decodable: " + i16);
                        }
                        if (i16 == 1 || i16 == 2) {
                            v94Var.t(32);
                            v94Var.t(32);
                            int i17 = v94Var.i(4) + 1;
                            v94Var.t(1);
                            v94Var.t((int) ((i16 == 1 ? i10 != 0 ? (long) Math.floor(Math.pow(i11, 1.0d / i10)) : 0L : i11 * i10) * i17));
                        }
                        i7++;
                        i6 = i9;
                        i5 = 5;
                    } else {
                        int i18 = i6;
                        int i19 = 6;
                        int i20 = v94Var.i(6) + 1;
                        for (int i21 = 0; i21 < i20; i21++) {
                            if (v94Var.i(16) != 0) {
                                throw r7k.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i22 = 1;
                        int i23 = v94Var.i(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < i23) {
                                int i26 = v94Var.i(i8);
                                if (i26 == 0) {
                                    int i27 = i18;
                                    v94Var.t(i27);
                                    v94Var.t(16);
                                    v94Var.t(16);
                                    v94Var.t(6);
                                    v94Var.t(i27);
                                    int i28 = v94Var.i(4) + 1;
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        v94Var.t(i27);
                                        i29++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (i26 != i22) {
                                        throw r7k.a(null, "floor type greater than 1 not decodable: " + i26);
                                    }
                                    int i30 = v94Var.i(5);
                                    int[] iArr = new int[i30];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = v94Var.i(i);
                                        iArr[i32] = i33;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    int i34 = i31 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = v94Var.i(i25) + 1;
                                        int i36 = v94Var.i(2);
                                        int i37 = i18;
                                        if (i36 > 0) {
                                            v94Var.t(i37);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << i36); i39 = 1) {
                                            v94Var.t(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i35++;
                                        iArr2 = iArr3;
                                        i18 = 8;
                                        i25 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    v94Var.t(2);
                                    int i40 = v94Var.i(4);
                                    int i41 = 0;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i30; i43++) {
                                        i41 += iArr4[iArr[i43]];
                                        while (i42 < i41) {
                                            v94Var.t(i40);
                                            i42++;
                                        }
                                    }
                                }
                                i24++;
                                i18 = 8;
                                i19 = 6;
                                i = 4;
                                i8 = 16;
                                i22 = 1;
                            } else {
                                int i44 = v94Var.i(i19) + 1;
                                int i45 = 0;
                                while (i45 < i44) {
                                    if (v94Var.i(16) > 2) {
                                        throw r7k.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    v94Var.t(24);
                                    v94Var.t(24);
                                    v94Var.t(24);
                                    int i46 = v94Var.i(i19) + 1;
                                    int i47 = 8;
                                    v94Var.t(8);
                                    int[] iArr5 = new int[i46];
                                    for (int i48 = 0; i48 < i46; i48++) {
                                        iArr5[i48] = ((v94Var.h() ? v94Var.i(5) : 0) * 8) + v94Var.i(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr5[i49] & (1 << i50)) != 0) {
                                                v94Var.t(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i45++;
                                    i19 = 6;
                                }
                                int i51 = v94Var.i(i19) + 1;
                                for (int i52 = 0; i52 < i51; i52++) {
                                    int i53 = v94Var.i(16);
                                    if (i53 != 0) {
                                        vq1.K("VorbisUtil", "mapping type other than 0 not supported: " + i53);
                                    } else {
                                        int i54 = v94Var.h() ? v94Var.i(4) + 1 : 1;
                                        if (v94Var.h()) {
                                            int i55 = v94Var.i(8) + 1;
                                            for (int i56 = 0; i56 < i55; i56++) {
                                                int i57 = i4 - 1;
                                                int i58 = 0;
                                                for (int i59 = i57; i59 > 0; i59 >>>= 1) {
                                                    i58++;
                                                }
                                                v94Var.t(i58);
                                                int i60 = 0;
                                                while (i57 > 0) {
                                                    i60++;
                                                    i57 >>>= 1;
                                                }
                                                v94Var.t(i60);
                                            }
                                        }
                                        if (v94Var.i(2) != 0) {
                                            throw r7k.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i54 > 1) {
                                            for (int i61 = 0; i61 < i4; i61++) {
                                                v94Var.t(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i54; i62++) {
                                            v94Var.t(8);
                                            v94Var.t(8);
                                            v94Var.t(8);
                                        }
                                    }
                                }
                                int i63 = v94Var.i(6);
                                int i64 = i63 + 1;
                                n20[] n20VarArr = new n20[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean h2 = v94Var.h();
                                    v94Var.i(16);
                                    v94Var.i(16);
                                    v94Var.i(8);
                                    n20VarArr[i65] = new n20(h2);
                                }
                                if (!v94Var.h()) {
                                    throw r7k.a(null, "framing bit after modes not set as expected");
                                }
                                int i66 = 0;
                                while (i63 > 0) {
                                    i66++;
                                    i63 >>>= 1;
                                }
                                c1tVar = new c1t(bgiVar, mjuVar, bArr, n20VarArr, i66);
                            }
                        }
                    }
                }
            }
        }
        c1tVar = null;
        this.n = c1tVar;
        if (c1tVar == null) {
            return true;
        }
        bgi bgiVar3 = (bgi) c1tVar.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) bgiVar3.g);
        arrayList.add((byte[]) c1tVar.e);
        u2i h0 = szf.h0(yde.w(((mju) c1tVar.d).a));
        bsc bscVar = new bsc();
        bscVar.l = l5i.p("audio/ogg");
        bscVar.m = l5i.p("audio/vorbis");
        bscVar.h = bgiVar3.d;
        bscVar.i = bgiVar3.c;
        bscVar.C = bgiVar3.a;
        bscVar.D = bgiVar3.b;
        bscVar.p = arrayList;
        bscVar.k = h0;
        aqdVar.b = new dsc(bscVar);
        return true;
    }

    @Override // defpackage.rjr
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
