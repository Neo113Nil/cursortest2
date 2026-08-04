package com.gamericefishpro.space.p2;

import android.os.Handler;
import com.gamericefishpro.space.c3.i;
import com.gamericefishpro.space.f1.z;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.i0;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.n1;
import com.gamericefishpro.space.h2.v0;
import com.gamericefishpro.space.i2.g1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.w;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final z a;
    public final e b;
    public final d0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public com.gamericefishpro.space.f3.a g;
    public long h;
    public final com.gamericefishpro.space.a2.b i;
    public final com.gamericefishpro.space.n1.a j;

    public b() {
        z zVar = new z();
        zVar.b = new long[192];
        zVar.c = new long[192];
        this.a = zVar;
        this.b = new e();
        this.c = new d0();
        this.h = -1L;
        this.i = new com.gamericefishpro.space.a2.b(9, this);
        this.j = new com.gamericefishpro.space.n1.a();
    }

    public static long f(f0 f0Var) {
        a1 a1Var = f0Var.Z;
        f1 f1Var = a1Var.d;
        long jC = 0;
        for (f1 f1Var2 = a1Var.c; f1Var2 != null && f1Var2 != f1Var; f1Var2 = f1Var2.J) {
            n1 n1Var = f1Var2.e0;
            if (n1Var != null && !o.p(((g1) n1Var).b())) {
                return 9223372034707292159L;
            }
            jC = i.c(jC, f1Var2.S);
        }
        return jC;
    }

    public static void h(f0 f0Var) {
        if (f0Var.i) {
            n1 n1Var = f0Var.Z.d.e0;
            if (n1Var == null || o.p(((g1) n1Var).b())) {
                f0Var.i = false;
                if (f0Var.z) {
                    f0Var.y = f(f0Var);
                    f0Var.z = false;
                }
                if (i.a(f0Var.y, 9223372034707292159L)) {
                    return;
                }
                com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
                Object[] objArr = eVarZ.d;
                int i = eVarZ.i;
                for (int i2 = 0; i2 < i; i2++) {
                    h((f0) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251 A[LOOP:11: B:102:0x024f->B:103:0x0251, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x025c A[LOOP:9: B:95:0x022b->B:107:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0263 A[ADDED_TO_REGION, LOOP:12: B:110:0x0263->B:111:0x0265, LOOP_START, PHI: r1
      0x0263: PHI (r1v10 com.gamericefishpro.space.p2.d) = (r1v9 com.gamericefishpro.space.p2.d), (r1v11 com.gamericefishpro.space.p2.d) binds: [B:109:0x0261, B:111:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0265 A[LOOP:12: B:110:0x0263->B:111:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0272  */
    /* JADX WARN: Code duplicated, block: B:135:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x025f A[EDGE_INSN: B:136:0x025f->B:108:0x025f BREAK  A[LOOP:9: B:95:0x022b->B:107:0x025c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x025f A[EDGE_INSN: B:137:0x025f->B:108:0x025f BREAK  A[LOOP:9: B:95:0x022b->B:107:0x025c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[ADDED_TO_REGION, LOOP:7: B:73:0x018b->B:74:0x018d, LOOP_START, PHI: r3
      0x018b: PHI (r3v7 com.gamericefishpro.space.p2.d) = (r3v6 com.gamericefishpro.space.p2.d), (r3v8 com.gamericefishpro.space.p2.d) binds: [B:72:0x0189, B:74:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[LOOP:7: B:73:0x018b->B:74:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:92:0x021f  */
    /* JADX WARN: Code duplicated, block: B:94:0x022a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        Object[] objArr;
        long[] jArr;
        int length;
        d dVar;
        int i3;
        long j4;
        int i4;
        long j5;
        int i5;
        d dVar2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        float[] fArr;
        d dVar3;
        long[] jArr4;
        long j8;
        long j9;
        com.gamericefishpro.space.f3.a aVar = this.g;
        if (aVar != null) {
            com.gamericefishpro.space.h1.a.a.removeCallbacks(aVar);
            this.g = null;
        }
        Handler handler = com.gamericefishpro.space.h1.a.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        z zVar = this.a;
        boolean z4 = true;
        e eVar = this.b;
        if (z2) {
            this.d = false;
            d0 d0Var = this.c;
            Object[] objArr2 = d0Var.a;
            int i9 = d0Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((Function0) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) zVar.b;
            int i11 = zVar.a;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j10 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr5[i12];
                    long j12 = jArr5[i12 + 1];
                    d dVar4 = (d) eVar.a.b(((int) j10) & 33554431);
                    while (dVar4 != null) {
                        d dVar5 = dVar4.d;
                        boolean z6 = z3;
                        long j13 = dVar4.g;
                        boolean z7 = (jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE) ? z5 : false;
                        dVar4.e = j11;
                        dVar4.f = j12;
                        if (z7) {
                            dVar4.g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            dVar4.a(j8, j9, eVar.d, eVar.e, eVar.g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        dVar4 = dVar5;
                        j11 = j8;
                        j12 = j9;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) zVar.b;
            int i14 = zVar.a;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.e) {
            this.e = false;
            long j14 = eVar.d;
            long j15 = eVar.e;
            float[] fArr2 = eVar.g;
            w wVar = eVar.a;
            j2 = 128;
            Object[] objArr3 = wVar.c;
            long[] jArr7 = wVar.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j16 = j14;
                    long j17 = jArr7[i17];
                    int i19 = i18;
                    zVar = zVar;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j18 = j17;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j18 & 255) < 128) {
                                d dVar6 = (d) objArr3[(i17 << 3) + i21];
                                while (dVar6 != null) {
                                    eVar.a(dVar6, j16, j15, fArr2, jCurrentTimeMillis);
                                    dVar6 = dVar6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j18 >>= i22;
                            i21++;
                            j16 = j16;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    zVar = zVar;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j6 = eVar.d;
                j7 = eVar.e;
                fArr = eVar.g;
                dVar3 = eVar.b;
                if (dVar3 != null) {
                    while (dVar3 != null) {
                        f0 f0VarS = k.s(dVar3.b);
                        long jB = ((t) i0.a(f0VarS)).getRectManager().b(f0VarS);
                        long j19 = f0VarS.w;
                        dVar3.e = jB;
                        dVar3.f = (((long) (((int) (jB & 4294967295L)) + ((int) (j19 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jB >> 32)) + ((int) (j19 >> 32)))) << 32);
                        eVar.a(dVar3, j6, j7, fArr, jCurrentTimeMillis);
                        dVar3 = dVar3.d;
                    }
                }
            }
            if (this.f) {
                i2 = 0;
                this.f = false;
                z zVar2 = zVar;
                jArr2 = (long[]) zVar2.b;
                int i23 = zVar2.a;
                jArr3 = (long[]) zVar2.c;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != a.c) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                zVar2.a = i7;
                zVar2.b = jArr3;
                zVar2.c = jArr2;
            } else {
                i2 = 0;
            }
            if (eVar.c <= jCurrentTimeMillis) {
                w wVar2 = eVar.a;
                objArr = wVar2.c;
                jArr = wVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j4 = jArr[i3];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j5 = j4;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j5 & j3) < j2) {
                                    for (dVar2 = (d) objArr[(i3 << 3) + i5]; dVar2 != null; dVar2 = dVar2.d) {
                                    }
                                }
                                j5 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                dVar = eVar.b;
                if (dVar != null) {
                    while (dVar != null) {
                        dVar = dVar.d;
                    }
                }
                eVar.c = -1L;
            }
            if (eVar.c > j) {
                i();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j6 = eVar.d;
            j7 = eVar.e;
            fArr = eVar.g;
            dVar3 = eVar.b;
            if (dVar3 != null) {
                while (dVar3 != null) {
                    f0 f0VarS2 = k.s(dVar3.b);
                    long jB2 = ((t) i0.a(f0VarS2)).getRectManager().b(f0VarS2);
                    long j110 = f0VarS2.w;
                    dVar3.e = jB2;
                    dVar3.f = (((long) (((int) (jB2 & 4294967295L)) + ((int) (j110 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jB2 >> 32)) + ((int) (j110 >> 32)))) << 32);
                    eVar.a(dVar3, j6, j7, fArr, jCurrentTimeMillis);
                    dVar3 = dVar3.d;
                }
            }
        }
        if (this.f) {
            i2 = 0;
            this.f = false;
            z zVar3 = zVar;
            jArr2 = (long[]) zVar3.b;
            int i24 = zVar3.a;
            jArr3 = (long[]) zVar3.c;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != a.c) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            zVar3.a = i7;
            zVar3.b = jArr3;
            zVar3.c = jArr2;
        } else {
            i2 = 0;
        }
        if (eVar.c <= jCurrentTimeMillis) {
            w wVar3 = eVar.a;
            objArr = wVar3.c;
            jArr = wVar3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j4 = jArr[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j5 = j4;
                        while (i5 < i4) {
                            if ((j5 & j3) < j2) {
                                while (dVar2 != null) {
                                }
                            }
                            j5 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            dVar = eVar.b;
            if (dVar != null) {
                while (dVar != null) {
                    dVar = dVar.d;
                }
            }
            eVar.c = -1L;
        }
        if (eVar.c > j) {
            i();
        }
    }

    public final long b(f0 f0Var) {
        long j;
        int i = f0Var.e & 33554431;
        z zVar = this.a;
        long[] jArr = (long[]) zVar.b;
        int i2 = zVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    public final void c(f0 f0Var) {
        char c;
        boolean z;
        f0 f0VarV;
        int i;
        boolean z2 = true;
        f0Var.i = true;
        f0Var.v = 9223372034707292159L;
        a1 a1Var = f0Var.Z;
        f1 f1Var = a1Var.d;
        v0 v0Var = f0Var.a0.p;
        int iY = v0Var.Y();
        float fX = v0Var.X();
        com.gamericefishpro.space.n1.a aVar = this.j;
        aVar.a = 0.0f;
        aVar.b = 0.0f;
        aVar.c = iY;
        aVar.d = fX;
        while (true) {
            c = ' ';
            if (f1Var == null) {
                break;
            }
            f0 f0Var2 = f1Var.H;
            if (f1Var == f0Var2.Z.d && !f0Var2.i) {
                long jB = b(f0Var2);
                if (!i.a(jB, 9223372034707292159L)) {
                    aVar.c((((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jB >> 32)) << 32));
                    break;
                }
            }
            n1 n1Var = f1Var.e0;
            if (n1Var != null) {
                float[] fArrB = ((g1) n1Var).b();
                if (!o.p(fArrB)) {
                    o.r(fArrB, aVar);
                }
            }
            long j = f1Var.S;
            aVar.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            f1Var = f1Var.J;
        }
        int i2 = (int) aVar.a;
        int i3 = (int) aVar.b;
        int i4 = (int) aVar.c;
        int i5 = (int) aVar.d;
        int i6 = f0Var.e;
        boolean z3 = f0Var.A;
        f0Var.A = true;
        z zVar = this.a;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) zVar.b;
            int i8 = zVar.a;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    z zVar2 = zVar;
                    f0VarV = f0Var.v();
                    if (f0VarV != null) {
                        i = f0VarV.e;
                    } else {
                        i = -1;
                    }
                    zVar2.f(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, a1Var.d(1024), a1Var.d(16), this.b.a.a(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    char c2 = c;
                    z zVar3 = zVar;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << c2) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i5) & 4294967295L) | (((long) i4) << c2);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        c = c2;
                        zVar = zVar3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            z zVar4 = zVar;
            f0VarV = f0Var.v();
            if (f0VarV != null) {
                i = f0VarV.e;
            } else {
                i = -1;
            }
            zVar4.f(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, a1Var.d(1024), a1Var.d(16), this.b.a.a(i6), -1);
        }
        this.d = z;
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i11 = eVarZ.i;
        for (int i12 = 0; i12 < i11; i12++) {
            f0 f0Var3 = (f0) objArr[i12];
            if (f0Var3.I()) {
                c(f0Var3);
            }
        }
    }

    public final void d(f0 f0Var) {
        if (f0Var.A) {
            this.d = true;
            int i = f0Var.e & 33554431;
            z zVar = this.a;
            long[] jArr = (long[]) zVar.b;
            int i2 = zVar.a;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
            }
        }
        i();
    }

    public final void e(f0 f0Var, boolean z) {
        long j;
        n1 n1Var;
        int i;
        int i2;
        int i3;
        boolean zI = f0Var.I();
        a1 a1Var = f0Var.Z;
        if (zI) {
            f0 f0VarV = f0Var.v();
            if (f0VarV == null || f0VarV.i) {
                j = f0VarV == null ? 0L : 9223372034707292159L;
            } else {
                if (f0VarV.z) {
                    f0VarV.z = false;
                    f0VarV.y = f(f0VarV);
                }
                j = f0VarV.y;
            }
            f1 f1Var = a1Var.d;
            if (i.a(j, 9223372034707292159L) || !((n1Var = f1Var.e0) == null || o.p(((g1) n1Var).b()))) {
                c(f0Var);
                return;
            }
            if (f0Var.i) {
                c(f0Var);
                h(f0Var);
                return;
            }
            long jC = i.c(j, f1Var.S);
            v0 v0Var = f0Var.a0.p;
            int iY = v0Var.Y();
            int iX = v0Var.X();
            long j2 = (((long) iY) << 32) | (((long) iX) & 4294967295L);
            int i4 = f0Var.e;
            boolean z2 = f0Var.A;
            int i5 = 33554431;
            z zVar = this.a;
            if (!z2) {
                f0Var.A = true;
                boolean zD = a1Var.d(1024);
                boolean zD2 = a1Var.d(16);
                boolean zA = this.b.a.a(i4);
                if (f0VarV != null) {
                    int i6 = f0VarV.e;
                    int i7 = (int) (jC >> 32);
                    int i8 = (int) (jC & 4294967295L);
                    char c = ' ';
                    int i9 = i4 & 33554431;
                    long[] jArr = (long[]) zVar.b;
                    int i10 = zVar.a;
                    int i11 = 0;
                    while (i11 < jArr.length - 2 && i11 < i10) {
                        char c2 = c;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i11 + 2]) & i5) == i6) {
                            long j3 = jArr2[i11];
                            int i12 = ((int) (j3 >> c2)) + i7;
                            int i13 = ((int) j3) + i8;
                            zVar.f(i9, i12, i13, i12 + iY, i13 + iX, i6, zD, zD2, zA, i11);
                            break;
                        }
                        i11 += 3;
                        c = c2;
                        jArr = jArr2;
                        i5 = i5;
                        i6 = i6;
                    }
                } else {
                    int i14 = (int) (jC >> 32);
                    int i15 = (int) (jC & 4294967295L);
                    zVar.f(i4, i14, i15, i14 + iY, i15 + iX, (512 & 32) != 0 ? -1 : 0, zD, zD2, zA, -1);
                }
                this.d = true;
            } else if (z || !i.a(jC, f0Var.v) || !com.gamericefishpro.space.c3.k.a(j2, f0Var.w)) {
                if (f0VarV != null) {
                    int i16 = f0VarV.e;
                    int i17 = (int) (jC >> 32);
                    int i18 = (int) (jC & 4294967295L);
                    int i19 = i4 & 33554431;
                    long[] jArr3 = (long[]) zVar.b;
                    int i20 = zVar.a;
                    int i21 = 0;
                    loop0: while (i21 < jArr3.length - 2 && i21 < i20) {
                        int i22 = iY;
                        if ((((int) jArr3[i21 + 2]) & 33554431) == i16) {
                            long j4 = jArr3[i21];
                            i2 = i17;
                            i3 = i18;
                            int i23 = ((int) (j4 >> 32)) + i2;
                            int i24 = ((int) j4) + i3;
                            int i25 = i23 + i22;
                            int i26 = i24 + iX;
                            int i27 = i21 + 3;
                            while (i27 < jArr3.length - 2 && i27 < i20) {
                                int i28 = i27 + 2;
                                int i29 = i20;
                                long j5 = jArr3[i28];
                                int i30 = i27;
                                if ((((int) j5) & 33554431) == i19) {
                                    long j6 = jArr3[i30];
                                    int i31 = i23 - ((int) (j6 >> 32));
                                    int i32 = i24 - ((int) j6);
                                    jArr3[i30] = (((long) i23) << 32) | (((long) i24) & 4294967295L);
                                    jArr3[i30 + 1] = (((long) i25) << 32) | (((long) i26) & 4294967295L);
                                    jArr3[i28] = j5 | (((j5 >> 63) & 1) << 60);
                                    if (i31 != 0 || i32 != 0) {
                                        zVar.l(i31, i32, (j5 & a.b) | (((long) ((i30 + 3) & 33554431)) << 25));
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i27 = i30 + 3;
                                i20 = i29;
                            }
                            i = i20;
                            i21 = i27;
                        } else {
                            i = i20;
                            i2 = i17;
                            i3 = i18;
                        }
                        i21 += 3;
                        iY = i22;
                        i17 = i2;
                        i18 = i3;
                        i16 = i16;
                        i20 = i;
                    }
                } else {
                    int i33 = (int) (jC >> 32);
                    int i34 = (int) (jC & 4294967295L);
                    int i35 = i33 + iY;
                    int i36 = i34 + iX;
                    int i37 = i4 & 33554431;
                    long[] jArr4 = (long[]) zVar.b;
                    int i38 = zVar.a;
                    int i39 = 0;
                    while (i39 < jArr4.length - 2 && i39 < i38) {
                        int i40 = i39 + 2;
                        int i41 = i38;
                        int i42 = i39;
                        long j7 = jArr4[i40];
                        long[] jArr5 = jArr4;
                        if ((((int) j7) & 33554431) == i37) {
                            long j8 = jArr5[i42];
                            jArr5[i42] = (((long) i33) << 32) | (((long) i34) & 4294967295L);
                            jArr5[i42 + 1] = (((long) i35) << 32) | (((long) i36) & 4294967295L);
                            jArr5[i40] = j7 | (((j7 >> 63) & 1) << 60);
                            int i43 = i33 - ((int) (j8 >> 32));
                            int i44 = i34 - ((int) j8);
                            if (!(i43 != 0) && !(i44 != 0)) {
                                break;
                            }
                            zVar.l(i43, i44, (j7 & a.b) | (((long) ((i42 + 3) & 33554431)) << 25));
                            break;
                        }
                        i39 = i42 + 3;
                        i38 = i41;
                        jArr4 = jArr5;
                    }
                }
                this.d = true;
            }
            f0Var.w = j2;
            f0Var.v = jC;
        }
    }

    public final void g(f0 f0Var) {
        if (f0Var.A) {
            int i = f0Var.e & 33554431;
            z zVar = this.a;
            long[] jArr = (long[]) zVar.b;
            int i2 = zVar.a;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = a.c;
                    break;
                }
            }
            f0Var.A = false;
            this.d = true;
            this.f = true;
        }
    }

    public final void i() {
        com.gamericefishpro.space.f3.a aVar = this.g;
        boolean z = aVar != null;
        long j = this.b.c;
        if (j >= 0 || !z) {
            if (this.h == j && z) {
                return;
            }
            if (aVar != null) {
                Handler handler = com.gamericefishpro.space.h1.a.a;
                com.gamericefishpro.space.h1.a.a.removeCallbacks(aVar);
            }
            Handler handler2 = com.gamericefishpro.space.h1.a.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            long j2 = jMax - jCurrentTimeMillis;
            com.gamericefishpro.space.f3.a aVar2 = new com.gamericefishpro.space.f3.a(2, this.i);
            com.gamericefishpro.space.h1.a.a.postDelayed(aVar2, j2);
            this.g = aVar2;
        }
    }
}
