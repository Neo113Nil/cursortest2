package defpackage;

import androidx.compose.foundation.interaction.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.state.ToggleableState;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class r5a1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-952199771);
        if (btsVar.V(i & 1, i != 0)) {
            sya1.a(y9b1.b(), null, null, AppColor$Palette.Line, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new txk(i, 10);
        }
    }

    public static final void b(uu21 uu21Var, boolean z, sls slsVar, fid fidVar, int i, int i2) {
        boolean z2;
        int i3;
        sls slsVar2;
        int i4;
        uu21 uu21Var2;
        boolean z3;
        sls slsVar3;
        sls slsVar4;
        oz40 oz40Var;
        boolean z4;
        uu21 uu21Var3;
        sls slsVar5;
        f530 a;
        boolean z5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1732984277);
        int i5 = i | (btsVar.k(uu21Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (btsVar.a(z2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            slsVar2 = slsVar;
        } else {
            slsVar2 = slsVar;
            i4 = i3 | (btsVar.e(slsVar2) ? 256 : 128);
        }
        int i8 = 0;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            boolean z6 = i6 != 0 ? false : z2;
            Object obj = did.a;
            if (i7 != 0) {
                Object Q = btsVar.Q();
                if (Q == obj) {
                    Q = new bgc(12);
                    btsVar.o0(Q);
                }
                slsVar4 = (sls) Q;
            } else {
                slsVar4 = slsVar2;
            }
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q2;
            oz40 b = a.b(zx40Var, btsVar, 6);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q3;
            dur durVar = (dur) btsVar.m(j.i);
            f530 d = hi91.d(gi91.b(ljs0.m(an91.k(c530.a, 6.0f), 44.0f), yurVar), false, zx40Var, 1);
            boolean k = ((i4 & 896) == 256) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | btsVar.k(b) | btsVar.e(durVar);
            Object Q4 = btsVar.Q();
            if (k || Q4 == obj) {
                oz40Var = b;
                dpf dpfVar = new dpf(z6, uu21Var, oz40Var, durVar, yurVar, slsVar4);
                z4 = z6;
                uu21Var3 = uu21Var;
                slsVar5 = slsVar4;
                btsVar.o0(dpfVar);
                Q4 = dpfVar;
            } else {
                z4 = z6;
                oz40Var = b;
                slsVar5 = slsVar4;
                uu21Var3 = uu21Var;
            }
            a = b.a(q791.b(d, zx40Var, null, false, null, null, (sls) Q4, 28), m.a(), new jtn(oz40Var, i8));
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar6 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar6);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            if (uu21Var3 instanceof tu21) {
                btsVar.e0(-1586453345);
                jeb1.f(((tu21) uu21Var3).a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 0, 0, 32766);
                btsVar = btsVar;
                btsVar.t(false);
                z5 = true;
                uu21Var2 = uu21Var;
            } else {
                uu21Var2 = uu21Var3;
                if (uu21Var2 instanceof su21) {
                    btsVar.e0(-1586451693);
                    ovi0 a2 = mja1.a(((su21) uu21Var2).a, null, 6);
                    c7d.a.getClass();
                    v0b1.a(a2, null, null, null, c7d.b, null, null, null, 0.0f, 0, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 1006);
                    btsVar.t(false);
                } else {
                    if (uu21Var2 != null) {
                        throw unr0.y(-1586454323, btsVar, false);
                    }
                    btsVar.e0(-1586447757);
                    a(btsVar, 0);
                    btsVar.t(false);
                }
                z5 = true;
            }
            btsVar.t(z5);
            z3 = z4;
            slsVar3 = slsVar5;
        } else {
            uu21Var2 = uu21Var;
            btsVar.Y();
            z3 = z2;
            slsVar3 = slsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(uu21Var2, z3, slsVar3, i, i2);
        }
    }

    public static int c(int[] iArr, int[] iArr2) {
        if (iArr.length <= 8 || iArr2.length <= 8) {
            int i = iArr[7];
            if (i != iArr2[7]) {
                return e(i) > e(iArr2[7]) ? 1 : -1;
            }
            int i2 = iArr[6];
            if (i2 != iArr2[6]) {
                return e(i2) > e(iArr2[6]) ? 1 : -1;
            }
            int i3 = iArr[5];
            if (i3 != iArr2[5]) {
                return e(i3) > e(iArr2[5]) ? 1 : -1;
            }
            int i4 = iArr[4];
            if (i4 != iArr2[4]) {
                return e(i4) > e(iArr2[4]) ? 1 : -1;
            }
            int i5 = iArr[3];
            if (i5 != iArr2[3]) {
                return e(i5) > e(iArr2[3]) ? 1 : -1;
            }
            int i6 = iArr[2];
            if (i6 != iArr2[2]) {
                return e(i6) > e(iArr2[2]) ? 1 : -1;
            }
            int i7 = iArr[1];
            if (i7 != iArr2[1]) {
                return e(i7) > e(iArr2[1]) ? 1 : -1;
            }
            int i8 = iArr[0];
            if (i8 != iArr2[0]) {
                return e(i8) > e(iArr2[0]) ? 1 : -1;
            }
            return 0;
        }
        int i9 = iArr[15];
        if (i9 != iArr2[15]) {
            return e(i9) > e(iArr2[15]) ? 1 : -1;
        }
        int i10 = iArr[14];
        if (i10 != iArr2[14]) {
            return e(i10) > e(iArr2[14]) ? 1 : -1;
        }
        int i11 = iArr[13];
        if (i11 != iArr2[13]) {
            return e(i11) > e(iArr2[13]) ? 1 : -1;
        }
        int i12 = iArr[12];
        if (i12 != iArr2[12]) {
            return e(i12) > e(iArr2[12]) ? 1 : -1;
        }
        int i13 = iArr[11];
        if (i13 != iArr2[11]) {
            return e(i13) > e(iArr2[11]) ? 1 : -1;
        }
        int i14 = iArr[10];
        if (i14 != iArr2[10]) {
            return e(i14) > e(iArr2[10]) ? 1 : -1;
        }
        int i15 = iArr[9];
        if (i15 != iArr2[9]) {
            return e(i15) > e(iArr2[9]) ? 1 : -1;
        }
        int i16 = iArr[8];
        if (i16 != iArr2[8]) {
            return e(i16) > e(iArr2[8]) ? 1 : -1;
        }
        int i17 = iArr[7];
        if (i17 != iArr2[7]) {
            return e(i17) > e(iArr2[7]) ? 1 : -1;
        }
        int i18 = iArr[6];
        if (i18 != iArr2[6]) {
            return e(i18) > e(iArr2[6]) ? 1 : -1;
        }
        int i19 = iArr[5];
        if (i19 != iArr2[5]) {
            return e(i19) > e(iArr2[5]) ? 1 : -1;
        }
        int i20 = iArr[4];
        if (i20 != iArr2[4]) {
            return e(i20) > e(iArr2[4]) ? 1 : -1;
        }
        int i21 = iArr[3];
        if (i21 != iArr2[3]) {
            return e(i21) > e(iArr2[3]) ? 1 : -1;
        }
        int i22 = iArr[2];
        if (i22 != iArr2[2]) {
            return e(i22) > e(iArr2[2]) ? 1 : -1;
        }
        int i23 = iArr[1];
        if (i23 != iArr2[1]) {
            return e(i23) > e(iArr2[1]) ? 1 : -1;
        }
        int i24 = iArr[0];
        if (i24 != iArr2[0]) {
            return e(i24) > e(iArr2[0]) ? 1 : -1;
        }
        return 0;
    }

    public static int d(long[] jArr, long[] jArr2) {
        long j = jArr[8];
        long j2 = jArr2[8];
        if (j == j2) {
            long j3 = jArr[7];
            long j4 = jArr2[7];
            if (j3 == j4) {
                long j5 = jArr[6];
                long j6 = jArr2[6];
                if (j5 == j6) {
                    long j7 = jArr[5];
                    long j8 = jArr2[5];
                    if (j7 == j8) {
                        long j9 = jArr[4];
                        long j10 = jArr2[4];
                        if (j9 == j10) {
                            long j11 = jArr[3];
                            long j12 = jArr2[3];
                            if (j11 == j12) {
                                long j13 = jArr[2];
                                long j14 = jArr2[2];
                                if (j13 == j14) {
                                    long j15 = jArr[1];
                                    long j16 = jArr2[1];
                                    if (j15 == j16) {
                                        long j17 = jArr[0];
                                        long j18 = jArr2[0];
                                        if (j17 == j18) {
                                            return 0;
                                        }
                                        if (!m(j18, j17)) {
                                            return -1;
                                        }
                                    } else if (!m(j16, j15)) {
                                        return -1;
                                    }
                                } else if (!m(j14, j13)) {
                                    return -1;
                                }
                            } else if (!m(j12, j11)) {
                                return -1;
                            }
                        } else if (!m(j10, j9)) {
                            return -1;
                        }
                    } else if (!m(j8, j7)) {
                        return -1;
                    }
                } else if (!m(j6, j5)) {
                    return -1;
                }
            } else if (!m(j4, j3)) {
                return -1;
            }
        } else if (!m(j2, j)) {
            return -1;
        }
        return 1;
    }

    public static long e(int i) {
        return (i << 32) >>> 32;
    }

    public static long f(int i, int i2) {
        return (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
    }

    public static long g(long j) {
        return (j << 32) >>> 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0161, code lost:
    
        if (r38 > r12) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x016a, code lost:
    
        if (r38 > r19) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0173, code lost:
    
        if (r26 > r16) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x017c, code lost:
    
        if (r26 > r13) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0187, code lost:
    
        if (r26 > r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0192, code lost:
    
        if (r26 > r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x019b, code lost:
    
        if (r26 > r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0b5a, code lost:
    
        if (r0 > r14) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0ba4, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0ba7, code lost:
    
        if (r3 >= 8) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0ba9, code lost:
    
        r58[r3] = (int) r62[r3];
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b65, code lost:
    
        if (r2 > r12) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0b6e, code lost:
    
        if (r2 > r19) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0b77, code lost:
    
        if (r2 > r16) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0b80, code lost:
    
        if (r2 > r13) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0b8b, code lost:
    
        if (r2 > r10) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0b96, code lost:
    
        if (r2 > r7) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0ba1, code lost:
    
        if (r2 <= r4) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x080e, code lost:
    
        if (r0 > r14) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0810, code lost:
    
        r34 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x081d, code lost:
    
        if (r0 > r12) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0826, code lost:
    
        if (r0 > r19) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x082f, code lost:
    
        if (r0 > r16) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0838, code lost:
    
        if (r0 > r13) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0843, code lost:
    
        if (r0 > r10) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x084e, code lost:
    
        if (r0 > r7) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0859, code lost:
    
        if (r0 <= r4) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0a47, code lost:
    
        if ((r0 & 4294967296L) != r35) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        if (r38 > r14) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r18 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(int[] iArr, int[] iArr2, int[] iArr3, int i, long[] jArr) {
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11 = 0;
        long e = e(iArr3[0]);
        long e2 = e(iArr3[1]);
        long e3 = e(iArr3[2]);
        long e4 = e(iArr3[3]);
        long e5 = e(iArr3[4]);
        long e6 = e(iArr3[5]);
        long e7 = e(iArr3[6]);
        long e8 = e(iArr3[7]);
        int i12 = 7;
        while (i12 >= 0 && iArr2[i12] == 0) {
            i12--;
        }
        int i13 = i12 + 1;
        if (i13 == 0) {
            Arrays.fill(iArr, 0, 8, 0);
            return;
        }
        long j3 = 0;
        Arrays.fill(jArr, 0, 17, 0L);
        int i14 = 0;
        while (i14 < i13) {
            long e9 = e(iArr2[i14]);
            long j4 = j3;
            long j5 = j4;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i14 + i15;
                long e10 = (e(iArr2[i15]) * e9) + jArr[i16] + j5;
                j5 = e10 >>> 32;
                jArr[i16] = g(e10);
            }
            jArr[i14 + i14] = j5;
            i14++;
            j3 = j4;
        }
        long j6 = j3;
        int i17 = 0;
        long j7 = j6;
        while (true) {
            i2 = i11;
            if (i17 >= (i13 * 2) + 1) {
                break;
            }
            long j8 = jArr[i17];
            long j9 = j8 + j8 + j7;
            j7 = j9 >>> 32;
            jArr[i17] = g(j9);
            i17++;
            i11 = i2;
        }
        int i18 = i2;
        long j10 = j6;
        while (i18 < i13) {
            long e11 = e(iArr2[i18]);
            int i19 = i18 + i18;
            long j11 = jArr[i19] + (e11 * e11) + j10;
            jArr[i19] = g(j11);
            int i20 = i19 + 1;
            long j12 = jArr[i20] + (j11 >>> 32);
            jArr[i20] = g(j12);
            i18++;
            j10 = j12 >>> 32;
        }
        jArr[i13 + i13] = g(j10);
        long j13 = 1;
        if (i == -1) {
            long e12 = e(-iArr3[i2]);
            long j14 = jArr[8] * e12;
            long g = g(j14);
            long j15 = (jArr[9] * e12) + (j14 >>> 32);
            long g2 = g(j15);
            long j16 = (jArr[10] * e12) + (j15 >>> 32);
            long g3 = g(j16);
            long j17 = (jArr[11] * e12) + (j16 >>> 32);
            long g4 = g(j17);
            long j18 = (jArr[12] * e12) + (j17 >>> 32);
            long g5 = g(j18);
            long j19 = (jArr[13] * e12) + (j18 >>> 32);
            long g6 = g(j19);
            long j20 = (jArr[14] * e12) + (j19 >>> 32);
            long g7 = g(j20);
            long j21 = (jArr[15] * e12) + (j20 >>> 32);
            long g8 = g(j21);
            long g9 = g(j21 >>> 32);
            jArr[8] = j6;
            long j22 = jArr[0] + g;
            jArr[0] = g(j22);
            long j23 = jArr[1] + g2 + (j22 >>> 32);
            jArr[1] = g(j23);
            long j24 = jArr[2] + g3 + (j23 >>> 32);
            jArr[2] = g(j24);
            long j25 = jArr[3] + g4 + (j24 >>> 32);
            jArr[3] = g(j25);
            long j26 = jArr[4] + g5 + (j25 >>> 32);
            jArr[4] = g(j26);
            long j27 = jArr[5] + g6 + (j26 >>> 32);
            jArr[5] = g(j27);
            long j28 = jArr[6] + g7 + (j27 >>> 32);
            jArr[6] = g(j28);
            long j29 = jArr[7] + g8 + (j28 >>> 32);
            jArr[7] = g(j29);
            if ((j29 >>> 32) != j6) {
                g9++;
            }
            long g10 = g(g(g9) * e12) + jArr[0];
            jArr[0] = g(g10);
            if ((g10 & 4294967296L) != j6) {
                long j30 = jArr[1] + 1;
                jArr[1] = g(j30);
                if ((j30 & 4294967296L) != j6) {
                    long j31 = jArr[2] + 1;
                    jArr[2] = g(j31);
                    if ((j31 & 4294967296L) != j6) {
                        long j32 = jArr[3] + 1;
                        jArr[3] = g(j32);
                        if ((j32 & 4294967296L) != j6) {
                            long j33 = jArr[4] + 1;
                            jArr[4] = g(j33);
                            if ((j33 & 4294967296L) != j6) {
                                long j34 = jArr[5] + 1;
                                jArr[5] = g(j34);
                                if ((j34 & 4294967296L) != j6) {
                                    long j35 = jArr[6] + 1;
                                    jArr[6] = g(j35);
                                    if ((j35 & 4294967296L) != j6) {
                                        long j36 = jArr[7] + 1;
                                        jArr[7] = g(j36);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j13 = j6;
            if (j13 != j6) {
                jArr[0] = g(jArr[0] - e);
                jArr[1] = g((jArr[1] - e2) - ((int) (-(r0 >> 32))));
                jArr[2] = g((jArr[2] - e3) - ((int) (-(r2 >> 32))));
                jArr[3] = g((jArr[3] - e4) - ((int) (-(r0 >> 32))));
                jArr[4] = g((jArr[4] - e5) - ((int) (-(r2 >> 32))));
                jArr[5] = g((jArr[5] - e6) - ((int) (-(r0 >> 32))));
                jArr[6] = g((jArr[6] - e7) - ((int) (-(r2 >> 32))));
                long j37 = (jArr[7] - e8) - ((int) (-(r0 >> 32)));
                jArr[7] = g(j37);
                if (e((int) (-(j37 >> 32))) == j6) {
                    jArr[0] = g(jArr[0] - e);
                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r0 >> 32))));
                    jArr[2] = g((jArr[2] - e3) - ((int) (-(r2 >> 32))));
                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r0 >> 32))));
                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r2 >> 32))));
                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r0 >> 32))));
                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r2 >> 32))));
                    jArr[7] = g((jArr[7] - e8) - ((int) (-(r0 >> 32))));
                }
            }
        } else if (i == 1) {
            long g11 = g(e << 1);
            long j38 = jArr[8] * g11;
            long g12 = g(j38);
            long j39 = (jArr[9] * g11) + (j38 >>> 32);
            long g13 = g(j39);
            long j40 = (jArr[10] * g11) + (j39 >>> 32);
            long g14 = g(j40);
            long j41 = (jArr[11] * g11) + (j40 >>> 32);
            long g15 = g(j41);
            long j42 = (jArr[12] * g11) + (j41 >>> 32);
            long g16 = g(j42);
            long j43 = (jArr[13] * g11) + (j42 >>> 32);
            long g17 = g(j43);
            long j44 = (jArr[14] * g11) + (j43 >>> 32);
            long g18 = g(j44);
            long j45 = (jArr[15] * g11) + (j44 >>> 32);
            long g19 = g(j45);
            long g20 = g(g(j45 >>> 32) * g11) + jArr[0];
            jArr[0] = g(g20);
            if ((g20 & 4294967296L) != j6) {
                long j46 = jArr[1] + 1;
                jArr[1] = g(j46);
                if ((j46 & 4294967296L) != j6) {
                    long j47 = jArr[2] + 1;
                    jArr[2] = g(j47);
                    if ((j47 & 4294967296L) != j6) {
                        long j48 = jArr[3] + 1;
                        jArr[3] = g(j48);
                        if ((j48 & 4294967296L) != j6) {
                            long j49 = jArr[4] + 1;
                            jArr[4] = g(j49);
                            if ((j49 & 4294967296L) != j6) {
                                long j50 = jArr[5] + 1;
                                jArr[5] = g(j50);
                                if ((j50 & 4294967296L) != j6) {
                                    long j51 = jArr[6] + 1;
                                    jArr[6] = g(j51);
                                    if ((j51 & 4294967296L) != j6) {
                                        long j52 = jArr[7] + 1;
                                        jArr[7] = g(j52);
                                        if ((j52 & 4294967296L) != j6) {
                                            i3 = 1;
                                            jArr[0] = g(jArr[0] - g12);
                                            jArr[1] = g((jArr[1] - g13) - ((int) (-(r37 >> 32))));
                                            jArr[2] = g((jArr[2] - g14) - ((int) (-(r4 >> 32))));
                                            jArr[3] = g((jArr[3] - g15) - ((int) (-(r1 >> 32))));
                                            jArr[4] = g((jArr[4] - g16) - ((int) (-(r3 >> 32))));
                                            jArr[5] = g((jArr[5] - g17) - ((int) (-(r1 >> 32))));
                                            jArr[6] = g((jArr[6] - g18) - ((int) (-(r3 >> 32))));
                                            j = (jArr[7] - g19) - ((int) (-(r1 >> 32)));
                                            jArr[7] = g(j);
                                            if (i3 != ((int) (-(j >> 32)))) {
                                                if (i3 == 0) {
                                                    long j53 = jArr[0] + e;
                                                    jArr[0] = g(j53);
                                                    long j54 = jArr[1] + e2 + (j53 >>> 32);
                                                    jArr[1] = g(j54);
                                                    long j55 = jArr[2] + e3 + (j54 >>> 32);
                                                    jArr[2] = g(j55);
                                                    long j56 = jArr[3] + e4 + (j55 >>> 32);
                                                    jArr[3] = g(j56);
                                                    long j57 = jArr[4] + e5 + (j56 >>> 32);
                                                    jArr[4] = g(j57);
                                                    long j58 = jArr[5] + e6 + (j57 >>> 32);
                                                    jArr[5] = g(j58);
                                                    long j59 = jArr[6] + e7 + (j58 >>> 32);
                                                    jArr[6] = g(j59);
                                                    long j60 = jArr[7] + e8 + (j59 >>> 32);
                                                    jArr[7] = g(j60);
                                                    if ((j60 >>> 32) == j6) {
                                                        long j61 = jArr[0] + e;
                                                        jArr[0] = g(j61);
                                                        long j62 = jArr[1] + e2 + (j61 >>> 32);
                                                        jArr[1] = g(j62);
                                                        long j63 = jArr[2] + e3 + (j62 >>> 32);
                                                        jArr[2] = g(j63);
                                                        long j64 = jArr[3] + e4 + (j63 >>> 32);
                                                        jArr[3] = g(j64);
                                                        long j65 = jArr[4] + e5 + (j64 >>> 32);
                                                        jArr[4] = g(j65);
                                                        long j66 = jArr[5] + e6 + (j65 >>> 32);
                                                        jArr[5] = g(j66);
                                                        long j67 = jArr[6] + e7 + (j66 >>> 32);
                                                        jArr[6] = g(j67);
                                                        jArr[7] = g(jArr[7] + e8 + (j67 >>> 32));
                                                    }
                                                } else {
                                                    jArr[0] = g(jArr[0] - e);
                                                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r0 >> 32))));
                                                    jArr[2] = g((jArr[2] - e3) - ((int) (-(r2 >> 32))));
                                                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r0 >> 32))));
                                                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r2 >> 32))));
                                                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r0 >> 32))));
                                                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r2 >> 32))));
                                                    long j68 = (jArr[7] - e8) - ((int) (-(r0 >> 32)));
                                                    jArr[7] = g(j68);
                                                    if (((int) (-(j68 >> 32))) == 0) {
                                                        jArr[0] = g(jArr[0] - e);
                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r0 >> 32))));
                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r2 >> 32))));
                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r0 >> 32))));
                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r2 >> 32))));
                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r0 >> 32))));
                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r2 >> 32))));
                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r0 >> 32))));
                                                    }
                                                }
                                            }
                                            j2 = jArr[7];
                                            if (j2 != e8) {
                                                long j69 = jArr[6];
                                                if (j69 == e7) {
                                                    long j70 = jArr[5];
                                                    if (j70 == e6) {
                                                        long j71 = jArr[4];
                                                        if (j71 == e5) {
                                                            long j72 = jArr[3];
                                                            if (j72 == e4) {
                                                                long j73 = jArr[2];
                                                                if (j73 == e3) {
                                                                    long j74 = jArr[1];
                                                                    if (j74 == e2) {
                                                                        char c = 0;
                                                                        long j75 = jArr[0];
                                                                        if (j75 != e) {
                                                                        }
                                                                        jArr[c] = g(jArr[c] - e);
                                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r0 >> 32))));
                                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r2 >> 32))));
                                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r0 >> 32))));
                                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r2 >> 32))));
                                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r0 >> 32))));
                                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r2 >> 32))));
                                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r0 >> 32))));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i3 = 0;
            jArr[0] = g(jArr[0] - g12);
            jArr[1] = g((jArr[1] - g13) - ((int) (-(r37 >> 32))));
            jArr[2] = g((jArr[2] - g14) - ((int) (-(r4 >> 32))));
            jArr[3] = g((jArr[3] - g15) - ((int) (-(r1 >> 32))));
            jArr[4] = g((jArr[4] - g16) - ((int) (-(r3 >> 32))));
            jArr[5] = g((jArr[5] - g17) - ((int) (-(r1 >> 32))));
            jArr[6] = g((jArr[6] - g18) - ((int) (-(r3 >> 32))));
            j = (jArr[7] - g19) - ((int) (-(r1 >> 32)));
            jArr[7] = g(j);
            if (i3 != ((int) (-(j >> 32)))) {
            }
            j2 = jArr[7];
            if (j2 != e8) {
            }
        } else if (i == 2) {
            if (e8 == j6) {
                w511.w("Wrong usage of method");
                return;
            }
            long j76 = jArr[15];
            if (j76 == j6 && jArr[14] == j6 && jArr[13] == j6 && jArr[12] == j6 && jArr[11] == j6 && jArr[10] == j6 && jArr[9] == j6 && jArr[8] == j6) {
                long j77 = jArr[7];
                if (j77 == e8) {
                    long j78 = jArr[6];
                    if (j78 == e7) {
                        long j79 = jArr[5];
                        if (j79 == e6) {
                            long j80 = jArr[4];
                            if (j80 == e5) {
                                long j81 = jArr[3];
                                if (j81 == e4) {
                                    long j82 = jArr[2];
                                    if (j82 == e3) {
                                        long j83 = jArr[1];
                                        if (j83 == e2) {
                                            long j84 = jArr[i2];
                                            if (j84 == e) {
                                                i4 = i2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i4 >= 0) {
                    for (int i21 = i2; i21 < 8; i21++) {
                        iArr[i21] = (int) jArr[i21];
                    }
                    return;
                }
                int i22 = 9;
                if (i4 == 0) {
                    Arrays.fill(iArr, i2, 8, i2);
                    return;
                }
                if (j76 != j6) {
                    i22 = 16;
                } else if (jArr[14] != j6) {
                    i22 = 15;
                } else if (jArr[13] != j6) {
                    i22 = 14;
                } else if (jArr[12] != j6) {
                    i22 = 13;
                } else if (jArr[11] != j6) {
                    i22 = 12;
                } else if (jArr[10] != j6) {
                    i22 = 11;
                } else if (jArr[9] != j6) {
                    i22 = 10;
                } else if (jArr[8] == j6) {
                    i22 = 8;
                }
                if (((-2147483648L) & e8) == j6) {
                    w511.w("Wrong usage of method");
                    return;
                }
                jArr[i22] = j6;
                int i23 = (int) e8;
                long e13 = e(i23);
                int i24 = (int) e7;
                int i25 = i22 - 8;
                while (i25 >= 0) {
                    int i26 = i25 + 8;
                    long j85 = e13;
                    int i27 = (int) jArr[i26];
                    int i28 = i27 - 2147483648;
                    int i29 = i25 + 7;
                    int i30 = (int) jArr[i29];
                    if (i27 == i23) {
                        int i31 = i27 + i30;
                        i5 = i28;
                        z = i31 + Integer.MIN_VALUE < i5;
                        i6 = i23;
                        i10 = i31;
                        i8 = i24;
                        i7 = i26;
                        i9 = -1;
                    } else {
                        i5 = i28;
                        i6 = i23;
                        long e14 = (i27 << 32) | e(i30);
                        if (e14 >= j6) {
                            i9 = (int) (e14 / j85);
                            i7 = i26;
                            i10 = (int) (e14 - (i9 * j85));
                            i8 = i24;
                        } else {
                            int i32 = i24;
                            i7 = i26;
                            long e15 = e(i6);
                            if (e15 == 1) {
                                i9 = (int) e14;
                                i8 = i32;
                                i10 = 0;
                            } else {
                                long j86 = (e14 >>> 1) / (e15 >>> 1);
                                long j87 = e14 - (j86 * e15);
                                while (j87 < j6) {
                                    j87 += e15;
                                    j86--;
                                }
                                i8 = i32;
                                long j88 = j86;
                                while (j87 >= e15) {
                                    j87 -= e15;
                                    j88++;
                                }
                                i9 = (int) j88;
                                i10 = (int) j87;
                            }
                        }
                        z = false;
                    }
                    if (i9 != 0) {
                        if (!z) {
                            long j89 = jArr[i25 + 6];
                            if ((e(i9) * e(i8)) - Long.MIN_VALUE > ((e(i10) << 32) | j89) - Long.MIN_VALUE) {
                                int i33 = i9 - 1;
                                if (e((int) (e(i10) + j85)) >= j85) {
                                    if ((e(i33) * e(i8)) - Long.MIN_VALUE > ((e(r0) << 32) | j89) - Long.MIN_VALUE) {
                                        i9 -= 2;
                                    }
                                }
                                i9 = i33;
                            }
                        }
                        jArr[i7] = j6;
                        long e16 = e(i9);
                        long j90 = e * e16;
                        long j91 = jArr[i25] - j90;
                        jArr[i25] = g(j91);
                        long j92 = (e2 * e16) + (j90 >>> 32) + (g(j91) > e(~((int) j90)) ? 1 : 0);
                        int i34 = i25 + 1;
                        long j93 = jArr[i34] - j92;
                        jArr[i34] = g(j93);
                        long j94 = (e3 * e16) + (j92 >>> 32) + (g(j93) > e(~((int) j92)) ? 1 : 0);
                        int i35 = i25 + 2;
                        long j95 = jArr[i35] - j94;
                        jArr[i35] = g(j95);
                        long j96 = (e4 * e16) + (j94 >>> 32) + (g(j95) > e(~((int) j94)) ? 1 : 0);
                        int i36 = i25 + 3;
                        long j97 = jArr[i36] - j96;
                        jArr[i36] = g(j97);
                        long j98 = (e5 * e16) + (j96 >>> 32) + (g(j97) > e(~((int) j96)) ? 1 : 0);
                        int i37 = i25 + 4;
                        long j99 = jArr[i37] - j98;
                        jArr[i37] = g(j99);
                        long j100 = (e6 * e16) + (j98 >>> 32) + (g(j99) > e(~((int) j98)) ? 1 : 0);
                        int i38 = i25 + 5;
                        long j101 = jArr[i38] - j100;
                        jArr[i38] = g(j101);
                        long j102 = (e7 * e16) + (j100 >>> 32) + (g(j101) > e(~((int) j100)) ? 1 : 0);
                        int i39 = i25 + 6;
                        long j103 = jArr[i39] - j102;
                        jArr[i39] = g(j103);
                        long j104 = (e16 * e8) + (j102 >>> 32) + (g(j103) > e(~((int) j102)) ? 1 : 0);
                        long j105 = jArr[i29] - j104;
                        jArr[i29] = g(j105);
                        if (((int) ((j104 >>> 32) + (g(j105) > e(~((int) j104)) ? 1 : 0))) - 2147483648 > i5) {
                            long j106 = e + jArr[i25];
                            jArr[i25] = g(j106);
                            long j107 = jArr[i34] + e2 + (j106 >>> 32);
                            jArr[i34] = g(j107);
                            long j108 = jArr[i35] + e3 + (j107 >>> 32);
                            jArr[i35] = g(j108);
                            long j109 = e4 + jArr[i36] + (j108 >>> 32);
                            jArr[i36] = g(j109);
                            long j110 = e5 + jArr[i37] + (j109 >>> 32);
                            jArr[i37] = g(j110);
                            long j111 = e6 + jArr[i38] + (j110 >>> 32);
                            jArr[i38] = g(j111);
                            long j112 = jArr[i39] + e7 + (j111 >>> 32);
                            jArr[i39] = g(j112);
                            long j113 = jArr[i29] + e8 + (j112 >>> 32);
                            jArr[i29] = g(j113);
                            jArr[i7] = g(jArr[i7] + (j113 >>> 32));
                        }
                    }
                    i25--;
                    e13 = j85;
                    i23 = i6;
                    i24 = i8;
                }
                for (int i40 = 0; i40 < 8; i40++) {
                    iArr[i40] = (int) jArr[i40];
                }
                return;
            }
            i4 = 1;
            if (i4 >= 0) {
            }
        }
        long j114 = jArr[7];
        if (j114 == e8) {
            long j115 = jArr[6];
            if (j115 == e7) {
                long j116 = jArr[5];
                if (j116 == e6) {
                    long j117 = jArr[4];
                    if (j117 == e5) {
                        long j118 = jArr[3];
                        if (j118 == e4) {
                            long j119 = jArr[2];
                            if (j119 == e3) {
                                long j120 = jArr[1];
                                if (j120 == e2) {
                                    long j121 = jArr[0];
                                    if (j121 != e) {
                                    }
                                    iArr[0] = (int) (jArr[0] - e);
                                    iArr[1] = (int) ((jArr[1] - e2) - ((int) (-(r2 >> 32))));
                                    iArr[2] = (int) ((jArr[2] - e3) - ((int) (-(r4 >> 32))));
                                    iArr[3] = (int) ((jArr[3] - e4) - ((int) (-(r2 >> 32))));
                                    iArr[4] = (int) ((jArr[4] - e5) - ((int) (-(r4 >> 32))));
                                    iArr[5] = (int) ((jArr[5] - e6) - ((int) (-(r2 >> 32))));
                                    iArr[6] = (int) ((jArr[6] - e7) - ((int) (-(r4 >> 32))));
                                    iArr[7] = (int) ((j114 - e8) - ((int) (-(r2 >> 32))));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iArr2.length; i++) {
            j2 = (j2 >>> 32) + e(iArr3[i]) + e(iArr2[i]);
            iArr[i] = (int) j2;
        }
        if (((int) (j2 >>> 32)) != 0 || c(iArr, iArr4) >= 0) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                j = (e(iArr[i2]) - e(iArr4[i2])) - ((int) (-(j >> 32)));
                iArr[i2] = (int) j;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0142, code lost:
    
        if (r39 > r12) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x014b, code lost:
    
        if (r39 > r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0154, code lost:
    
        if (r26 > r16) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x015d, code lost:
    
        if (r26 > r13) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0168, code lost:
    
        if (r21 > r10) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0173, code lost:
    
        if (r21 > r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x017c, code lost:
    
        if (r21 > r4) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x07f0, code lost:
    
        if (r1 > r14) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x07f2, code lost:
    
        r29 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x07ff, code lost:
    
        if (r1 > r12) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0808, code lost:
    
        if (r1 > r19) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0811, code lost:
    
        if (r1 > r16) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x081a, code lost:
    
        if (r1 > r13) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0825, code lost:
    
        if (r1 > r10) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0830, code lost:
    
        if (r1 > r7) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x083b, code lost:
    
        if (r1 <= r43) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b4e, code lost:
    
        if (r1 > r14) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0b98, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0b9b, code lost:
    
        if (r3 >= 8) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0b9d, code lost:
    
        r59[r3] = (int) r64[r3];
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ba5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b59, code lost:
    
        if (r3 > r12) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b62, code lost:
    
        if (r3 > r19) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0b6b, code lost:
    
        if (r3 > r16) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0b74, code lost:
    
        if (r3 > r13) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0b7f, code lost:
    
        if (r3 > r10) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0b8a, code lost:
    
        if (r3 > r7) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0b95, code lost:
    
        if (r3 <= r43) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0136, code lost:
    
        if (r39 > r14) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0139, code lost:
    
        r18 = 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, long[] jArr) {
        int i2;
        long j;
        long j2;
        int i3;
        long j3;
        long j4;
        char c;
        long j5;
        int i4;
        long j6;
        int i5;
        long j7;
        int i6;
        int i7;
        boolean z;
        long[] jArr2 = jArr;
        long e = e(iArr4[0]);
        long e2 = e(iArr4[1]);
        long e3 = e(iArr4[2]);
        long e4 = e(iArr4[3]);
        long e5 = e(iArr4[4]);
        long e6 = e(iArr4[5]);
        long e7 = e(iArr4[6]);
        long e8 = e(iArr4[7]);
        int i8 = 7;
        while (i8 >= 0 && iArr2[i8] == 0) {
            i8--;
        }
        int i9 = 7;
        while (i9 >= 0 && iArr3[i9] == 0) {
            i9--;
        }
        int i10 = i8 + 1;
        int i11 = i9 + 1;
        if (i10 == 0) {
            i2 = 0;
        } else if (i11 == 0) {
            i2 = 0;
        } else {
            long j8 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                long e9 = (e(iArr3[0]) * e(iArr2[i12])) + j8;
                j8 = e9 >>> 32;
                jArr2[i12] = g(e9);
            }
            jArr2[i10] = j8;
            for (int i13 = 1; i13 < i11; i13++) {
                long j9 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = i13 + i14;
                    long g = g(jArr2[i15]) + (e(iArr3[i13]) * e(iArr2[i14])) + j9;
                    j9 = g >>> 32;
                    jArr2[i15] = g(g);
                }
                jArr2[i13 + i10] = j9;
            }
            Arrays.fill(jArr2, i10 + i11, 17, 0L);
            if (i == -1) {
                j = e;
                long e10 = e(-iArr4[0]);
                long j10 = jArr[8] * e10;
                long g2 = g(j10);
                long j11 = (jArr[9] * e10) + (j10 >>> 32);
                long g3 = g(j11);
                long j12 = (jArr[10] * e10) + (j11 >>> 32);
                long g4 = g(j12);
                long j13 = (jArr[11] * e10) + (j12 >>> 32);
                long g5 = g(j13);
                long j14 = (jArr[12] * e10) + (j13 >>> 32);
                long g6 = g(j14);
                long j15 = (jArr[13] * e10) + (j14 >>> 32);
                long g7 = g(j15);
                long j16 = (jArr[14] * e10) + (j15 >>> 32);
                long g8 = g(j16);
                long j17 = (jArr[15] * e10) + (j16 >>> 32);
                long g9 = g(j17);
                long g10 = g(j17 >>> 32);
                jArr[8] = 0;
                long j18 = jArr[0] + g2;
                jArr[0] = g(j18);
                long j19 = jArr[1] + g3 + (j18 >>> 32);
                jArr[1] = g(j19);
                long j20 = jArr[2] + g4 + (j19 >>> 32);
                jArr[2] = g(j20);
                long j21 = jArr[3] + g5 + (j20 >>> 32);
                jArr[3] = g(j21);
                long j22 = jArr[4] + g6 + (j21 >>> 32);
                jArr[4] = g(j22);
                long j23 = jArr[5] + g7 + (j22 >>> 32);
                jArr[5] = g(j23);
                long j24 = jArr[6] + g8 + (j23 >>> 32);
                jArr[6] = g(j24);
                long j25 = jArr[7] + g9 + (j24 >>> 32);
                jArr[7] = g(j25);
                if ((j25 >>> 32) != 0) {
                    g10++;
                }
                long g11 = g(g(g10) * e10) + jArr[0];
                jArr[0] = g(g11);
                if ((g11 & 4294967296L) != 0) {
                    long j26 = jArr[1] + 1;
                    jArr[1] = g(j26);
                    if ((j26 & 4294967296L) != 0) {
                        long j27 = jArr[2] + 1;
                        jArr[2] = g(j27);
                        if ((j27 & 4294967296L) != 0) {
                            long j28 = jArr[3] + 1;
                            jArr[3] = g(j28);
                            if ((j28 & 4294967296L) != 0) {
                                long j29 = jArr[4] + 1;
                                jArr[4] = g(j29);
                                if ((j29 & 4294967296L) != 0) {
                                    long j30 = jArr[5] + 1;
                                    jArr[5] = g(j30);
                                    if ((j30 & 4294967296L) != 0) {
                                        long j31 = jArr[6] + 1;
                                        jArr[6] = g(j31);
                                        if ((j31 & 4294967296L) != 0) {
                                            long j32 = jArr[7] + 1;
                                            jArr[7] = g(j32);
                                            if ((j32 & 4294967296L) != 0) {
                                                j2 = 1;
                                                if (j2 != 0) {
                                                    jArr[0] = g(jArr[0] - j);
                                                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                    jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                    long j33 = (jArr[7] - e8) - ((int) (-(r1 >> 32)));
                                                    jArr[7] = g(j33);
                                                    if (e((int) (-(j33 >> 32))) == 0) {
                                                        jArr[0] = g(jArr[0] - j);
                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                j2 = 0;
                if (j2 != 0) {
                }
            } else if (i == 1) {
                j = e;
                long g12 = g(j << 1);
                long j34 = jArr[8] * g12;
                long g13 = g(j34);
                long j35 = (jArr[9] * g12) + (j34 >>> 32);
                long g14 = g(j35);
                long j36 = (jArr[10] * g12) + (j35 >>> 32);
                long g15 = g(j36);
                long j37 = (jArr[11] * g12) + (j36 >>> 32);
                long g16 = g(j37);
                long j38 = (jArr[12] * g12) + (j37 >>> 32);
                long g17 = g(j38);
                long j39 = (jArr[13] * g12) + (j38 >>> 32);
                long g18 = g(j39);
                long j40 = (jArr[14] * g12) + (j39 >>> 32);
                long g19 = g(j40);
                long j41 = (jArr[15] * g12) + (j40 >>> 32);
                long g20 = g(j41);
                long g21 = g(g(j41 >>> 32) * g12) + jArr[0];
                jArr[0] = g(g21);
                if ((g21 & 4294967296L) != 0) {
                    long j42 = jArr[1] + 1;
                    jArr[1] = g(j42);
                    if ((j42 & 4294967296L) != 0) {
                        long j43 = jArr[2] + 1;
                        jArr[2] = g(j43);
                        if ((j43 & 4294967296L) != 0) {
                            long j44 = jArr[3] + 1;
                            jArr[3] = g(j44);
                            if ((j44 & 4294967296L) != 0) {
                                long j45 = jArr[4] + 1;
                                jArr[4] = g(j45);
                                if ((j45 & 4294967296L) != 0) {
                                    long j46 = jArr[5] + 1;
                                    jArr[5] = g(j46);
                                    if ((j46 & 4294967296L) != 0) {
                                        long j47 = jArr[6] + 1;
                                        jArr[6] = g(j47);
                                        if ((j47 & 4294967296L) != 0) {
                                            long j48 = jArr[7] + 1;
                                            jArr[7] = g(j48);
                                            if ((j48 & 4294967296L) != 0) {
                                                i3 = 1;
                                                jArr[0] = g(jArr[0] - g13);
                                                jArr[1] = g((jArr[1] - g14) - ((int) (-(r38 >> 32))));
                                                jArr[2] = g((jArr[2] - g15) - ((int) (-(r5 >> 32))));
                                                jArr[3] = g((jArr[3] - g16) - ((int) (-(r2 >> 32))));
                                                jArr[4] = g((jArr[4] - g17) - ((int) (-(r4 >> 32))));
                                                jArr[5] = g((jArr[5] - g18) - ((int) (-(r2 >> 32))));
                                                jArr[6] = g((jArr[6] - g19) - ((int) (-(r4 >> 32))));
                                                j3 = (jArr[7] - g20) - ((int) (-(r2 >> 32)));
                                                jArr[7] = g(j3);
                                                if (i3 != ((int) (-(j3 >> 32)))) {
                                                    if (i3 == 0) {
                                                        long j49 = jArr[0] + j;
                                                        jArr[0] = g(j49);
                                                        long j50 = jArr[1] + e2 + (j49 >>> 32);
                                                        jArr[1] = g(j50);
                                                        long j51 = jArr[2] + e3 + (j50 >>> 32);
                                                        jArr[2] = g(j51);
                                                        long j52 = jArr[3] + e4 + (j51 >>> 32);
                                                        jArr[3] = g(j52);
                                                        long j53 = jArr[4] + e5 + (j52 >>> 32);
                                                        jArr[4] = g(j53);
                                                        long j54 = jArr[5] + e6 + (j53 >>> 32);
                                                        jArr[5] = g(j54);
                                                        long j55 = jArr[6] + e7 + (j54 >>> 32);
                                                        jArr[6] = g(j55);
                                                        long j56 = jArr[7] + e8 + (j55 >>> 32);
                                                        jArr[7] = g(j56);
                                                        if ((j56 >>> 32) == 0) {
                                                            long j57 = jArr[0] + j;
                                                            jArr[0] = g(j57);
                                                            long j58 = jArr[1] + e2 + (j57 >>> 32);
                                                            jArr[1] = g(j58);
                                                            long j59 = jArr[2] + e3 + (j58 >>> 32);
                                                            jArr[2] = g(j59);
                                                            long j60 = jArr[3] + e4 + (j59 >>> 32);
                                                            jArr[3] = g(j60);
                                                            long j61 = jArr[4] + e5 + (j60 >>> 32);
                                                            jArr[4] = g(j61);
                                                            long j62 = jArr[5] + e6 + (j61 >>> 32);
                                                            jArr[5] = g(j62);
                                                            long j63 = jArr[6] + e7 + (j62 >>> 32);
                                                            jArr[6] = g(j63);
                                                            jArr[7] = g(jArr[7] + e8 + (j63 >>> 32));
                                                        }
                                                    } else {
                                                        jArr[0] = g(jArr[0] - j);
                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                        long j64 = (jArr[7] - e8) - ((int) (-(r1 >> 32)));
                                                        jArr[7] = g(j64);
                                                        if (((int) (-(j64 >> 32))) == 0) {
                                                            jArr[0] = g(jArr[0] - j);
                                                            jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                            jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                            jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                            jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                            jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                            jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                            jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                        }
                                                    }
                                                }
                                                j4 = jArr[7];
                                                if (j4 != e8) {
                                                    long j65 = jArr[6];
                                                    if (j65 == e7) {
                                                        long j66 = jArr[5];
                                                        if (j66 == e6) {
                                                            long j67 = jArr[4];
                                                            if (j67 == e5) {
                                                                long j68 = jArr[3];
                                                                if (j68 == e4) {
                                                                    long j69 = jArr[2];
                                                                    if (j69 == e3) {
                                                                        long j70 = jArr[1];
                                                                        if (j70 == e2) {
                                                                            char c2 = 0;
                                                                            long j71 = jArr[0];
                                                                            if (j71 != j) {
                                                                            }
                                                                            jArr[c2] = g(jArr[c2] - j);
                                                                            jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                                            jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                                            jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                                            jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                                            jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                                            jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                                            jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i3 = 0;
                jArr[0] = g(jArr[0] - g13);
                jArr[1] = g((jArr[1] - g14) - ((int) (-(r38 >> 32))));
                jArr[2] = g((jArr[2] - g15) - ((int) (-(r5 >> 32))));
                jArr[3] = g((jArr[3] - g16) - ((int) (-(r2 >> 32))));
                jArr[4] = g((jArr[4] - g17) - ((int) (-(r4 >> 32))));
                jArr[5] = g((jArr[5] - g18) - ((int) (-(r2 >> 32))));
                jArr[6] = g((jArr[6] - g19) - ((int) (-(r4 >> 32))));
                j3 = (jArr[7] - g20) - ((int) (-(r2 >> 32)));
                jArr[7] = g(j3);
                if (i3 != ((int) (-(j3 >> 32)))) {
                }
                j4 = jArr[7];
                if (j4 != e8) {
                }
            } else if (i != 2) {
                j = e;
            } else {
                if (e8 == 0) {
                    w511.w("Wrong usage of method");
                    return;
                }
                long j72 = jArr2[15];
                if (j72 == 0 && jArr2[14] == 0 && jArr2[13] == 0 && jArr2[12] == 0 && jArr2[11] == 0 && jArr2[10] == 0 && jArr2[9] == 0 && jArr2[8] == 0) {
                    long j73 = jArr2[7];
                    if (j73 == e8) {
                        long j74 = jArr2[6];
                        if (j74 == e7) {
                            long j75 = jArr2[5];
                            if (j75 == e6) {
                                long j76 = jArr2[4];
                                if (j76 == e5) {
                                    long j77 = jArr2[3];
                                    if (j77 == e4) {
                                        long j78 = jArr2[2];
                                        if (j78 == e3) {
                                            long j79 = jArr2[1];
                                            if (j79 == e2) {
                                                long j80 = jArr2[0];
                                                if (j80 == e) {
                                                    c = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c >= 0) {
                        for (int i16 = 0; i16 < 8; i16++) {
                            iArr[i16] = (int) jArr2[i16];
                        }
                        return;
                    }
                    if (c == 0) {
                        Arrays.fill(iArr, 0, 8, 0);
                        return;
                    }
                    if (j72 != 0) {
                        i4 = 16;
                        j5 = 0;
                    } else {
                        j5 = 0;
                        i4 = jArr2[14] != 0 ? 15 : jArr2[13] != 0 ? 14 : jArr2[12] != 0 ? 13 : jArr2[11] != 0 ? 12 : jArr2[10] != 0 ? 11 : jArr2[9] != 0 ? 10 : jArr2[8] != 0 ? 9 : 8;
                    }
                    if (((-2147483648L) & e8) == j5) {
                        w511.w("Wrong usage of method");
                        return;
                    }
                    jArr2[i4] = j5;
                    int i17 = (int) e8;
                    long e11 = e(i17);
                    int i18 = (int) e7;
                    int i19 = i4 - 8;
                    while (i19 >= 0) {
                        int i20 = i19 + 8;
                        int i21 = i18;
                        int i22 = (int) jArr2[i20];
                        int i23 = i22 - 2147483648;
                        int i24 = i19 + 7;
                        int i25 = i19;
                        int i26 = (int) jArr[i24];
                        if (i22 == i17) {
                            i7 = i26 + i22;
                            z = i7 + Integer.MIN_VALUE < i23;
                            j6 = e;
                            i6 = -1;
                            i5 = i17;
                        } else {
                            long e12 = (i22 << 32) | e(i26);
                            j6 = e;
                            i5 = i17;
                            if (e12 >= 0) {
                                i6 = (int) (e12 / e11);
                                j7 = e12 - (i6 * e11);
                            } else {
                                long e13 = e(i5);
                                if (e13 == 1) {
                                    i6 = (int) e12;
                                    i7 = 0;
                                    z = false;
                                } else {
                                    long j81 = (e12 >>> 1) / (e13 >>> 1);
                                    j7 = e12 - (j81 * e13);
                                    while (j7 < 0) {
                                        j7 += e13;
                                        j81--;
                                    }
                                    long j82 = j81;
                                    while (j7 >= e13) {
                                        j7 -= e13;
                                        j82++;
                                    }
                                    i6 = (int) j82;
                                }
                            }
                            i7 = (int) j7;
                            z = false;
                        }
                        if (i6 != 0) {
                            if (!z) {
                                long j83 = jArr[i25 + 6];
                                if ((e(i6) * e(i21)) - Long.MIN_VALUE > ((e(i7) << 32) | j83) - Long.MIN_VALUE) {
                                    int i27 = i6 - 1;
                                    if (e((int) (e(i7) + e11)) >= e11) {
                                        if ((e(i27) * e(i21)) - Long.MIN_VALUE > ((e(r1) << 32) | j83) - Long.MIN_VALUE) {
                                            i6 -= 2;
                                        }
                                    }
                                    i6 = i27;
                                }
                            }
                            jArr[i20] = 0;
                            long e14 = e(i6);
                            long j84 = j6 * e14;
                            long j85 = jArr[i25] - j84;
                            jArr[i25] = g(j85);
                            long j86 = (e2 * e14) + (j84 >>> 32) + (g(j85) > e(~((int) j84)) ? 1 : 0);
                            int i28 = i25 + 1;
                            long j87 = jArr[i28] - j86;
                            jArr[i28] = g(j87);
                            long j88 = (e3 * e14) + (j86 >>> 32) + (g(j87) > e(~((int) j86)) ? 1 : 0);
                            int i29 = i25 + 2;
                            long j89 = jArr[i29] - j88;
                            jArr[i29] = g(j89);
                            long j90 = (e4 * e14) + (j88 >>> 32) + (g(j89) > e(~((int) j88)) ? 1 : 0);
                            int i30 = i25 + 3;
                            long j91 = jArr[i30] - j90;
                            jArr[i30] = g(j91);
                            long j92 = (e5 * e14) + (j90 >>> 32) + (g(j91) > e(~((int) j90)) ? 1 : 0);
                            int i31 = i25 + 4;
                            long j93 = jArr[i31] - j92;
                            jArr[i31] = g(j93);
                            long j94 = (e6 * e14) + (j92 >>> 32) + (g(j93) > e(~((int) j92)) ? 1 : 0);
                            int i32 = i25 + 5;
                            long j95 = jArr[i32] - j94;
                            jArr[i32] = g(j95);
                            long j96 = (e7 * e14) + (j94 >>> 32) + (g(j95) > e(~((int) j94)) ? 1 : 0);
                            int i33 = i25 + 6;
                            long j97 = jArr[i33] - j96;
                            jArr[i33] = g(j97);
                            long j98 = (e14 * e8) + (j96 >>> 32) + (g(j97) > e(~((int) j96)) ? 1 : 0);
                            long j99 = jArr[i24] - j98;
                            jArr[i24] = g(j99);
                            if (((int) ((j98 >>> 32) + (g(j99) > e(~((int) j98)) ? 1 : 0))) - 2147483648 > i23) {
                                long j100 = j6 + jArr[i25];
                                jArr[i25] = g(j100);
                                long j101 = e2 + jArr[i28] + (j100 >>> 32);
                                jArr[i28] = g(j101);
                                long j102 = jArr[i29] + e3 + (j101 >>> 32);
                                jArr[i29] = g(j102);
                                long j103 = e4 + jArr[i30] + (j102 >>> 32);
                                jArr[i30] = g(j103);
                                long j104 = e5 + jArr[i31] + (j103 >>> 32);
                                jArr[i31] = g(j104);
                                long j105 = e6 + jArr[i32] + (j104 >>> 32);
                                jArr[i32] = g(j105);
                                long j106 = jArr[i33] + e7 + (j105 >>> 32);
                                jArr[i33] = g(j106);
                                long j107 = jArr[i24] + e8 + (j106 >>> 32);
                                jArr[i24] = g(j107);
                                jArr[i20] = g(jArr[i20] + (j107 >>> 32));
                            }
                        }
                        i19 = i25 - 1;
                        jArr2 = jArr;
                        i17 = i5;
                        i18 = i21;
                        e = j6;
                    }
                    for (int i34 = 0; i34 < 8; i34++) {
                        iArr[i34] = (int) jArr[i34];
                    }
                    return;
                }
                c = 1;
                if (c >= 0) {
                }
            }
            long j108 = jArr[7];
            if (j108 == e8) {
                long j109 = jArr[6];
                if (j109 == e7) {
                    long j110 = jArr[5];
                    if (j110 == e6) {
                        long j111 = jArr[4];
                        if (j111 == e5) {
                            long j112 = jArr[3];
                            if (j112 == e4) {
                                long j113 = jArr[2];
                                if (j113 == e3) {
                                    long j114 = jArr[1];
                                    if (j114 == e2) {
                                        long j115 = jArr[0];
                                        if (j115 != j) {
                                        }
                                        iArr[0] = (int) (jArr[0] - j);
                                        iArr[1] = (int) ((jArr[1] - e2) - ((int) (-(r3 >> 32))));
                                        iArr[2] = (int) ((jArr[2] - e3) - ((int) (-(r5 >> 32))));
                                        iArr[3] = (int) ((jArr[3] - e4) - ((int) (-(r3 >> 32))));
                                        iArr[4] = (int) ((jArr[4] - e5) - ((int) (-(r5 >> 32))));
                                        iArr[5] = (int) ((jArr[5] - e6) - ((int) (-(r3 >> 32))));
                                        iArr[6] = (int) ((jArr[6] - e7) - ((int) (-(r5 >> 32))));
                                        iArr[7] = (int) ((j108 - e8) - ((int) (-(r3 >> 32))));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Arrays.fill(iArr, i2, 8, i2);
    }

    public static void k(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        jArr[0] = (j >>> 1) | (j2 << 63);
        long j3 = jArr[2];
        jArr[1] = (j2 >>> 1) | (j3 << 63);
        long j4 = jArr[3];
        jArr[2] = (j3 >>> 1) | (j4 << 63);
        long j5 = jArr[4];
        jArr[3] = (j4 >>> 1) | (j5 << 63);
        long j6 = jArr[5];
        jArr[4] = (j5 >>> 1) | (j6 << 63);
        long j7 = jArr[6];
        jArr[5] = (j6 >>> 1) | (j7 << 63);
        long j8 = jArr[7];
        jArr[6] = (j7 >>> 1) | (j8 << 63);
        long j9 = jArr[8];
        jArr[7] = (j9 << 63) | (j8 >>> 1);
        jArr[8] = j9 >> 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0127, code lost:
    
        if (r70 > r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0131, code lost:
    
        if (r70 > r41) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x013b, code lost:
    
        if (r70 > r38) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0145, code lost:
    
        if (r70 > r35) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x014f, code lost:
    
        if (r70 > r32) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0159, code lost:
    
        if (r70 > r29) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0162, code lost:
    
        if (r70 > r26) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x016b, code lost:
    
        if (r70 > r23) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0174, code lost:
    
        if (r70 > r20) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x017d, code lost:
    
        if (r70 > r17) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0186, code lost:
    
        if (r70 > r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x018f, code lost:
    
        if (r48 > r11) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0198, code lost:
    
        if (r48 > r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01a1, code lost:
    
        if (r48 > r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01aa, code lost:
    
        if (r48 > r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        if (r70 > r9) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        r16 = 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b4 A[ADDED_TO_REGION, LOOP:0: B:40:0x01b4->B:41:0x01b6, LOOP_START, PHI: r1
      0x01b4: PHI (r1v12 int) = (r1v0 int), (r1v13 int) binds: [B:39:0x01b2, B:41:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(long[] jArr, int[] iArr, int[] iArr2) {
        char c;
        int i;
        int i2;
        long j;
        int i3;
        boolean z;
        int i4;
        long e = e(iArr2[0]);
        long e2 = e(iArr2[1]);
        long e3 = e(iArr2[2]);
        long e4 = e(iArr2[3]);
        long e5 = e(iArr2[4]);
        long e6 = e(iArr2[5]);
        long e7 = e(iArr2[6]);
        long e8 = e(iArr2[7]);
        long e9 = e(iArr2[8]);
        long e10 = e(iArr2[9]);
        long e11 = e(iArr2[10]);
        long e12 = e(iArr2[11]);
        long e13 = e(iArr2[12]);
        long e14 = e(iArr2[13]);
        long e15 = e(iArr2[14]);
        long e16 = e(iArr2[15]);
        if (e16 == 0) {
            w511.w("Wrong usage of method");
            return;
        }
        int i5 = 31;
        long j2 = jArr[31];
        int i6 = 16;
        if (j2 == 0 && jArr[30] == 0 && jArr[29] == 0 && jArr[28] == 0 && jArr[27] == 0 && jArr[26] == 0 && jArr[25] == 0 && jArr[24] == 0 && jArr[23] == 0 && jArr[22] == 0 && jArr[21] == 0 && jArr[20] == 0 && jArr[19] == 0 && jArr[18] == 0 && jArr[17] == 0 && jArr[16] == 0) {
            long j3 = jArr[15];
            if (j3 == e16) {
                long j4 = jArr[14];
                if (j4 == e15) {
                    long j5 = jArr[13];
                    if (j5 == e14) {
                        long j6 = jArr[12];
                        if (j6 == e13) {
                            long j7 = jArr[11];
                            if (j7 == e12) {
                                long j8 = jArr[10];
                                if (j8 == e11) {
                                    long j9 = jArr[9];
                                    if (j9 == e10) {
                                        long j10 = jArr[8];
                                        if (j10 == e9) {
                                            long j11 = jArr[7];
                                            if (j11 == e8) {
                                                long j12 = jArr[6];
                                                if (j12 == e7) {
                                                    long j13 = jArr[5];
                                                    if (j13 == e6) {
                                                        long j14 = jArr[4];
                                                        if (j14 == e5) {
                                                            long j15 = jArr[3];
                                                            if (j15 == e4) {
                                                                long j16 = jArr[2];
                                                                if (j16 == e3) {
                                                                    long j17 = jArr[1];
                                                                    if (j17 == e2) {
                                                                        long j18 = jArr[0];
                                                                        if (j18 == e) {
                                                                            c = 0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (c >= 0) {
                for (int i7 = 0; i7 < 8; i7++) {
                    iArr[i7] = (int) jArr[i7];
                }
                return;
            }
            if (c == 0) {
                Arrays.fill(iArr, 0, 8, 0);
                return;
            }
            if (j2 != 0) {
                i5 = 32;
            } else if (jArr[30] == 0) {
                i5 = jArr[29] != 0 ? 30 : jArr[28] != 0 ? 29 : jArr[27] != 0 ? 28 : jArr[26] != 0 ? 27 : jArr[25] != 0 ? 26 : jArr[24] != 0 ? 25 : jArr[23] != 0 ? 24 : jArr[22] != 0 ? 23 : jArr[21] != 0 ? 22 : jArr[20] != 0 ? 21 : jArr[19] != 0 ? 20 : jArr[18] != 0 ? 19 : jArr[17] != 0 ? 18 : jArr[16] != 0 ? 17 : 16;
            }
            if ((e16 & (-2147483648L)) == 0) {
                w511.w("Wrong usage of method");
                return;
            }
            jArr[i5] = 0;
            int i8 = (int) e16;
            long e17 = e(i8);
            int i9 = (int) e15;
            int i10 = i5 - 16;
            while (i10 >= 0) {
                int i11 = i10 + 16;
                long j19 = e5;
                int i12 = (int) jArr[i11];
                int i13 = i12 - 2147483648;
                int i14 = i10 + 15;
                long j20 = e;
                int i15 = (int) jArr[i14];
                if (i12 == i8) {
                    int i16 = i12 + i15;
                    boolean z2 = i16 + Integer.MIN_VALUE < i13;
                    i = i8;
                    i4 = i16;
                    z = z2;
                    i2 = i9;
                    i3 = -1;
                } else {
                    long e18 = (i12 << 32) | e(i15);
                    i = i8;
                    if (e18 >= 0) {
                        i3 = (int) (e18 / e17);
                        i2 = i9;
                        j = e18 - (i3 * e17);
                    } else {
                        i2 = i9;
                        long e19 = e(i);
                        if (e19 == 1) {
                            i3 = (int) e18;
                            z = false;
                            i4 = 0;
                        } else {
                            long j21 = (e18 >>> 1) / (e19 >>> 1);
                            j = e18 - (j21 * e19);
                            while (j < 0) {
                                j += e19;
                                j21--;
                            }
                            long j22 = j21;
                            while (j >= e19) {
                                j -= e19;
                                j22++;
                            }
                            i3 = (int) j22;
                        }
                    }
                    i4 = (int) j;
                    z = false;
                }
                if (i3 != 0) {
                    if (!z) {
                        long j23 = jArr[i10 + 14];
                        if ((e(i3) * e(i2)) - Long.MIN_VALUE > ((e(i4) << 32) | j23) - Long.MIN_VALUE) {
                            int i17 = i3 - 1;
                            if (e((int) (e(i4) + e17)) >= e17) {
                                if ((e(i17) * e(i2)) - Long.MIN_VALUE > ((e(r0) << 32) | j23) - Long.MIN_VALUE) {
                                    i3 -= 2;
                                }
                            }
                            i3 = i17;
                        }
                    }
                    jArr[i11] = 0;
                    long e20 = e(i3);
                    long j24 = j20 * e20;
                    long j25 = jArr[i10] - j24;
                    jArr[i10] = g(j25);
                    long j26 = (e2 * e20) + (j24 >>> 32) + (g(j25) > e(~((int) j24)) ? 1 : 0);
                    int i18 = i10 + 1;
                    long j27 = jArr[i18] - j26;
                    jArr[i18] = g(j27);
                    long j28 = (e3 * e20) + (j26 >>> 32) + (g(j27) > e(~((int) j26)) ? 1 : 0);
                    int i19 = i10 + 2;
                    long j29 = jArr[i19] - j28;
                    jArr[i19] = g(j29);
                    long j30 = (e4 * e20) + (j28 >>> 32) + (g(j29) > e(~((int) j28)) ? 1 : 0);
                    int i20 = i10 + 3;
                    long j31 = jArr[i20] - j30;
                    jArr[i20] = g(j31);
                    long j32 = (j19 * e20) + (j30 >>> 32) + (g(j31) > e(~((int) j30)) ? 1 : 0);
                    int i21 = i10 + 4;
                    long j33 = jArr[i21] - j32;
                    jArr[i21] = g(j33);
                    long j34 = (e6 * e20) + (j32 >>> 32) + (g(j33) > e(~((int) j32)) ? 1 : 0);
                    int i22 = i10 + 5;
                    long j35 = jArr[i22] - j34;
                    jArr[i22] = g(j35);
                    long j36 = (e7 * e20) + (j34 >>> 32) + (g(j35) > e(~((int) j34)) ? 1 : 0);
                    int i23 = i10 + 6;
                    long j37 = jArr[i23] - j36;
                    jArr[i23] = g(j37);
                    long j38 = (e8 * e20) + (j36 >>> 32) + (g(j37) > e(~((int) j36)) ? 1 : 0);
                    int i24 = i10 + 7;
                    long j39 = jArr[i24] - j38;
                    jArr[i24] = g(j39);
                    long j40 = (e9 * e20) + (j38 >>> 32) + (g(j39) > e(~((int) j38)) ? 1 : 0);
                    int i25 = i10 + 8;
                    long j41 = jArr[i25] - j40;
                    jArr[i25] = g(j41);
                    long j42 = (e10 * e20) + (j40 >>> 32) + (g(j41) > e(~((int) j40)) ? 1 : 0);
                    int i26 = i10 + 9;
                    long j43 = jArr[i26] - j42;
                    jArr[i26] = g(j43);
                    long j44 = (e11 * e20) + (j42 >>> 32) + (g(j43) > e(~((int) j42)) ? 1 : 0);
                    int i27 = i10 + 10;
                    long j45 = jArr[i27] - j44;
                    jArr[i27] = g(j45);
                    long j46 = (e12 * e20) + (j44 >>> 32) + (g(j45) > e(~((int) j44)) ? 1 : 0);
                    int i28 = i10 + 11;
                    long j47 = jArr[i28] - j46;
                    jArr[i28] = g(j47);
                    long j48 = (e13 * e20) + (j46 >>> 32) + (g(j47) > e(~((int) j46)) ? 1 : 0);
                    int i29 = i10 + 12;
                    long j49 = jArr[i29] - j48;
                    jArr[i29] = g(j49);
                    long j50 = (e14 * e20) + (j48 >>> 32) + (g(j49) > e(~((int) j48)) ? 1 : 0);
                    int i30 = i10 + 13;
                    long j51 = jArr[i30] - j50;
                    jArr[i30] = g(j51);
                    long j52 = (e15 * e20) + (j50 >>> 32) + (g(j51) > e(~((int) j50)) ? 1 : 0);
                    int i31 = i10 + 14;
                    long j53 = jArr[i31] - j52;
                    jArr[i31] = g(j53);
                    long j54 = (e20 * e16) + (j52 >>> 32) + (g(j53) > e(~((int) j52)) ? 1 : 0);
                    long j55 = jArr[i14] - j54;
                    jArr[i14] = g(j55);
                    if (((int) ((j54 >>> 32) + (g(j55) > e(~((int) j54)) ? 1 : 0))) - 2147483648 > i13) {
                        long j56 = j20 + jArr[i10];
                        jArr[i10] = g(j56);
                        long j57 = jArr[i18] + e2 + (j56 >>> 32);
                        jArr[i18] = g(j57);
                        long j58 = e3 + jArr[i19] + (j57 >>> 32);
                        jArr[i19] = g(j58);
                        long j59 = jArr[i20] + e4 + (j58 >>> 32);
                        jArr[i20] = g(j59);
                        long j60 = j19 + jArr[i21] + (j59 >>> 32);
                        jArr[i21] = g(j60);
                        long j61 = e6 + jArr[i22] + (j60 >>> 32);
                        jArr[i22] = g(j61);
                        long j62 = e7 + jArr[i23] + (j61 >>> 32);
                        jArr[i23] = g(j62);
                        long j63 = e8 + jArr[i24] + (j62 >>> 32);
                        jArr[i24] = g(j63);
                        long j64 = e9 + jArr[i25] + (j63 >>> 32);
                        jArr[i25] = g(j64);
                        long j65 = e10 + jArr[i26] + (j64 >>> 32);
                        jArr[i26] = g(j65);
                        long j66 = e11 + jArr[i27] + (j65 >>> 32);
                        jArr[i27] = g(j66);
                        long j67 = e12 + jArr[i28] + (j66 >>> 32);
                        jArr[i28] = g(j67);
                        long j68 = e13 + jArr[i29] + (j67 >>> 32);
                        jArr[i29] = g(j68);
                        long j69 = e14 + jArr[i30] + (j68 >>> 32);
                        jArr[i30] = g(j69);
                        long j70 = jArr[i31] + e15 + (j69 >>> 32);
                        jArr[i31] = g(j70);
                        long j71 = jArr[i14] + e16 + (j70 >>> 32);
                        jArr[i14] = g(j71);
                        jArr[i11] = g(jArr[i24] + (j71 >>> 32));
                    }
                }
                i10--;
                i8 = i;
                i9 = i2;
                e5 = j19;
                e = j20;
                i6 = 16;
            }
            int i32 = i6;
            for (int i33 = 0; i33 < i32; i33++) {
                iArr[i33] = (int) jArr[i33];
            }
            return;
        }
        c = 1;
        if (c >= 0) {
        }
    }

    public static boolean m(long j, long j2) {
        long j3 = j >>> 63;
        long j4 = j2 >>> 63;
        return j3 == j4 ? j < j2 : j3 < j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x07ab, code lost:
    
        if (r7 > r50) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x07b5, code lost:
    
        if (r7 > r47) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x07bf, code lost:
    
        if (r7 > r44) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x07c9, code lost:
    
        if (r7 > r41) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x07d3, code lost:
    
        if (r7 > r38) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x07dd, code lost:
    
        if (r7 > r35) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x07e7, code lost:
    
        if (r7 > r32) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x07f0, code lost:
    
        if (r7 > r29) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x07f9, code lost:
    
        if (r7 > r26) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0802, code lost:
    
        if (r7 > r23) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x080b, code lost:
    
        if (r7 > r20) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0814, code lost:
    
        if (r7 > r17) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x081d, code lost:
    
        if (r7 > r14) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0828, code lost:
    
        if (r7 > r77) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0833, code lost:
    
        if (r7 > r8) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x083c, code lost:
    
        if (r7 <= r5) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0be1, code lost:
    
        if ((r7 & 4294967296L) != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0dd6, code lost:
    
        if (r7 > r50) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0e6c, code lost:
    
        r4 = r60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0e70, code lost:
    
        if (r4 >= 16) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e72, code lost:
    
        r103[r4] = (int) r107[r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e7a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0de0, code lost:
    
        if (r9 > r47) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0dea, code lost:
    
        if (r9 > r44) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0df4, code lost:
    
        if (r9 > r41) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0dfe, code lost:
    
        if (r9 > r38) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e08, code lost:
    
        if (r9 > r35) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e12, code lost:
    
        if (r9 > r32) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e1c, code lost:
    
        if (r9 > r29) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0e26, code lost:
    
        if (r9 > r26) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0e2f, code lost:
    
        if (r9 > r23) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0e38, code lost:
    
        if (r9 > r20) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0e41, code lost:
    
        if (r9 > r17) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e4a, code lost:
    
        if (r9 > r14) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0e55, code lost:
    
        if (r9 > r77) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0e60, code lost:
    
        if (r9 > r8) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0e69, code lost:
    
        if (r9 <= r5) goto L247;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(int[] iArr, int[] iArr2, int[] iArr3, int i, long[] jArr) {
        char c;
        long j;
        int i2;
        long j2;
        long j3;
        int i3 = 0;
        long e = e(iArr3[0]);
        long e2 = e(iArr3[1]);
        long e3 = e(iArr3[2]);
        long e4 = e(iArr3[3]);
        long e5 = e(iArr3[4]);
        long e6 = e(iArr3[5]);
        long e7 = e(iArr3[6]);
        long e8 = e(iArr3[7]);
        long e9 = e(iArr3[8]);
        long e10 = e(iArr3[9]);
        long e11 = e(iArr3[10]);
        long e12 = e(iArr3[11]);
        long e13 = e(iArr3[12]);
        long e14 = e(iArr3[13]);
        long e15 = e(iArr3[14]);
        long e16 = e(iArr3[15]);
        int i4 = 15;
        while (i4 >= 0 && iArr2[i4] == 0) {
            i4--;
        }
        int i5 = i4 + 1;
        if (i5 == 0) {
            Arrays.fill(iArr, 0, 16, 0);
            return;
        }
        Arrays.fill(jArr, 0, 33, 0L);
        int i6 = 0;
        while (i6 < i5) {
            long e17 = e(iArr2[i6]);
            int i7 = i3;
            long j4 = 0;
            while (i3 < i6) {
                int i8 = i6 + i3;
                long e18 = (e(iArr2[i3]) * e17) + jArr[i8] + j4;
                j4 = e18 >>> 32;
                jArr[i8] = g(e18);
                i3++;
            }
            jArr[i6 + i6] = j4;
            i6++;
            i3 = i7;
        }
        int i9 = i3;
        long j5 = 0;
        while (i3 < (i5 * 2) + 1) {
            long j6 = jArr[i3];
            long j7 = j6 + j6 + j5;
            j5 = j7 >>> 32;
            jArr[i3] = g(j7);
            i3++;
        }
        long j8 = 0;
        int i10 = i9;
        while (i10 < i5) {
            long e19 = e(iArr2[i10]);
            int i11 = i10 + i10;
            long j9 = jArr[i11] + (e19 * e19) + j8;
            jArr[i11] = g(j9);
            int i12 = i11 + 1;
            long j10 = jArr[i12] + (j9 >>> 32);
            jArr[i12] = g(j10);
            i10++;
            j8 = j10 >>> 32;
        }
        jArr[i5 + i5] = g(j8);
        long j11 = 1;
        if (i == -1) {
            c = ' ';
            j = e3;
            long e20 = e(-iArr3[i9]);
            long j12 = jArr[16] * e20;
            long g = g(j12);
            long j13 = (jArr[17] * e20) + (j12 >>> 32);
            long g2 = g(j13);
            long j14 = (jArr[18] * e20) + (j13 >>> 32);
            long g3 = g(j14);
            long j15 = (jArr[19] * e20) + (j14 >>> 32);
            long g4 = g(j15);
            long j16 = (jArr[20] * e20) + (j15 >>> 32);
            long g5 = g(j16);
            long j17 = (jArr[21] * e20) + (j16 >>> 32);
            long g6 = g(j17);
            long j18 = (jArr[22] * e20) + (j17 >>> 32);
            long g7 = g(j18);
            long j19 = (jArr[23] * e20) + (j18 >>> 32);
            long g8 = g(j19);
            long j20 = (jArr[24] * e20) + (j19 >>> 32);
            long g9 = g(j20);
            long j21 = (jArr[25] * e20) + (j20 >>> 32);
            long g10 = g(j21);
            long j22 = (jArr[26] * e20) + (j21 >>> 32);
            long g11 = g(j22);
            long j23 = (jArr[27] * e20) + (j22 >>> 32);
            long g12 = g(j23);
            long j24 = (jArr[28] * e20) + (j23 >>> 32);
            long g13 = g(j24);
            long j25 = (jArr[29] * e20) + (j24 >>> 32);
            long g14 = g(j25);
            long j26 = (jArr[30] * e20) + (j25 >>> 32);
            long g15 = g(j26);
            long j27 = (jArr[31] * e20) + (j26 >>> 32);
            long g16 = g(j27);
            long g17 = g(j27 >>> 32);
            jArr[16] = 0;
            long j28 = jArr[i9] + g;
            jArr[i9] = g(j28);
            long j29 = jArr[1] + g2 + (j28 >>> 32);
            jArr[1] = g(j29);
            long j30 = jArr[2] + g3 + (j29 >>> 32);
            jArr[2] = g(j30);
            long j31 = jArr[3] + g4 + (j30 >>> 32);
            jArr[3] = g(j31);
            long j32 = jArr[4] + g5 + (j31 >>> 32);
            jArr[4] = g(j32);
            long j33 = jArr[5] + g6 + (j32 >>> 32);
            jArr[5] = g(j33);
            long j34 = jArr[6] + g7 + (j33 >>> 32);
            jArr[6] = g(j34);
            long j35 = jArr[7] + g8 + (j34 >>> 32);
            jArr[7] = g(j35);
            long j36 = jArr[8] + g9 + (j35 >>> 32);
            jArr[8] = g(j36);
            long j37 = jArr[9] + g10 + (j36 >>> 32);
            jArr[9] = g(j37);
            long j38 = jArr[10] + g11 + (j37 >>> 32);
            jArr[10] = g(j38);
            long j39 = jArr[11] + g12 + (j38 >>> 32);
            jArr[11] = g(j39);
            long j40 = jArr[12] + g13 + (j39 >>> 32);
            jArr[12] = g(j40);
            long j41 = jArr[13] + g14 + (j40 >>> 32);
            jArr[13] = g(j41);
            long j42 = jArr[14] + g15 + (j41 >>> 32);
            jArr[14] = g(j42);
            long j43 = jArr[15] + g16 + (j42 >>> 32);
            jArr[15] = g(j43);
            if ((j43 >>> 32) != 0) {
                g17++;
            }
            long g18 = g(g(g17) * e20) + jArr[i9];
            jArr[i9] = g(g18);
            if ((g18 & 4294967296L) != 0) {
                long j44 = jArr[1] + 1;
                jArr[1] = g(j44);
                if ((j44 & 4294967296L) != 0) {
                    long j45 = jArr[2] + 1;
                    jArr[2] = g(j45);
                    if ((j45 & 4294967296L) != 0) {
                        long j46 = jArr[3] + 1;
                        jArr[3] = g(j46);
                        if ((j46 & 4294967296L) != 0) {
                            long j47 = jArr[4] + 1;
                            jArr[4] = g(j47);
                            if ((j47 & 4294967296L) != 0) {
                                long j48 = jArr[5] + 1;
                                jArr[5] = g(j48);
                                if ((j48 & 4294967296L) != 0) {
                                    long j49 = jArr[6] + 1;
                                    jArr[6] = g(j49);
                                    if ((j49 & 4294967296L) != 0) {
                                        long j50 = jArr[7] + 1;
                                        jArr[7] = g(j50);
                                        if ((j50 & 4294967296L) != 0) {
                                            long j51 = jArr[8] + 1;
                                            jArr[8] = g(j51);
                                            if ((j51 & 4294967296L) != 0) {
                                                long j52 = jArr[9] + 1;
                                                jArr[9] = g(j52);
                                                if ((j52 & 4294967296L) != 0) {
                                                    long j53 = jArr[10] + 1;
                                                    jArr[10] = g(j53);
                                                    if ((j53 & 4294967296L) != 0) {
                                                        long j54 = jArr[11] + 1;
                                                        jArr[11] = g(j54);
                                                        if ((j54 & 4294967296L) != 0) {
                                                            long j55 = jArr[12] + 1;
                                                            jArr[12] = g(j55);
                                                            if ((j55 & 4294967296L) != 0) {
                                                                long j56 = jArr[13] + 1;
                                                                jArr[13] = g(j56);
                                                                if ((j56 & 4294967296L) != 0) {
                                                                    long j57 = jArr[14] + 1;
                                                                    jArr[14] = g(j57);
                                                                    if ((j57 & 4294967296L) != 0) {
                                                                        long j58 = jArr[15] + 1;
                                                                        jArr[15] = g(j58);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j11 = 0;
            if (j11 != 0) {
                jArr[i9] = g(jArr[i9] - e);
                jArr[1] = g((jArr[1] - e2) - ((int) (-(r7 >> 32))));
                jArr[2] = g((jArr[2] - j) - ((int) (-(r9 >> 32))));
                jArr[3] = g((jArr[3] - e4) - ((int) (-(r7 >> 32))));
                jArr[4] = g((jArr[4] - e5) - ((int) (-(r9 >> 32))));
                jArr[5] = g((jArr[5] - e6) - ((int) (-(r7 >> 32))));
                jArr[6] = g((jArr[6] - e7) - ((int) (-(r9 >> 32))));
                jArr[7] = g((jArr[7] - e8) - ((int) (-(r7 >> 32))));
                jArr[8] = g((jArr[8] - e9) - ((int) (-(r9 >> 32))));
                jArr[9] = g((jArr[9] - e10) - ((int) (-(r7 >> 32))));
                jArr[10] = g((jArr[10] - e11) - ((int) (-(r9 >> 32))));
                jArr[11] = g((jArr[11] - e12) - ((int) (-(r7 >> 32))));
                jArr[12] = g((jArr[12] - e13) - ((int) (-(r9 >> 32))));
                jArr[13] = g((jArr[13] - e14) - ((int) (-(r7 >> 32))));
                jArr[14] = g((jArr[14] - e15) - ((int) (-(r9 >> 32))));
                long j59 = (jArr[15] - e16) - ((int) (-(r7 >> 32)));
                jArr[15] = g(j59);
                if (e((int) (-(j59 >> 32))) == 0) {
                    jArr[i9] = g(jArr[i9] - e);
                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r7 >> 32))));
                    jArr[2] = g((jArr[2] - j) - ((int) (-(r9 >> 32))));
                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r7 >> 32))));
                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r9 >> 32))));
                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r7 >> 32))));
                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r9 >> 32))));
                    jArr[7] = g((jArr[7] - e8) - ((int) (-(r7 >> 32))));
                    jArr[8] = g((jArr[8] - e9) - ((int) (-(r9 >> 32))));
                    jArr[9] = g((jArr[9] - e10) - ((int) (-(r7 >> 32))));
                    jArr[10] = g((jArr[10] - e11) - ((int) (-(r9 >> 32))));
                    jArr[11] = g((jArr[11] - e12) - ((int) (-(r7 >> 32))));
                    jArr[12] = g((jArr[12] - e13) - ((int) (-(r9 >> 32))));
                    jArr[13] = g((jArr[13] - e14) - ((int) (-(r7 >> 32))));
                    jArr[14] = g((jArr[14] - e15) - ((int) (-(r9 >> 32))));
                    jArr[15] = g((jArr[15] - e16) - ((int) (-(r7 >> 32))));
                }
            }
        } else if (i == 1) {
            long g19 = g(e << 1);
            long j60 = jArr[16] * g19;
            long g20 = g(j60);
            long j61 = (jArr[17] * g19) + (j60 >>> 32);
            long g21 = g(j61);
            long j62 = (jArr[18] * g19) + (j61 >>> 32);
            long g22 = g(j62);
            long j63 = (jArr[19] * g19) + (j62 >>> 32);
            long g23 = g(j63);
            long j64 = (jArr[20] * g19) + (j63 >>> 32);
            long g24 = g(j64);
            long j65 = (jArr[21] * g19) + (j64 >>> 32);
            long g25 = g(j65);
            long j66 = (jArr[22] * g19) + (j65 >>> 32);
            long g26 = g(j66);
            long j67 = (jArr[23] * g19) + (j66 >>> 32);
            long g27 = g(j67);
            long j68 = (jArr[24] * g19) + (j67 >>> 32);
            long g28 = g(j68);
            long j69 = (jArr[25] * g19) + (j68 >>> 32);
            long g29 = g(j69);
            long j70 = (jArr[26] * g19) + (j69 >>> 32);
            long g30 = g(j70);
            long j71 = (jArr[27] * g19) + (j70 >>> 32);
            long g31 = g(j71);
            long j72 = (jArr[28] * g19) + (j71 >>> 32);
            long g32 = g(j72);
            long j73 = (jArr[29] * g19) + (j72 >>> 32);
            long g33 = g(j73);
            long j74 = (jArr[30] * g19) + (j73 >>> 32);
            long g34 = g(j74);
            long j75 = (jArr[31] * g19) + (j74 >>> 32);
            long g35 = g(j75);
            long g36 = g(g(j75 >>> 32) * g19) + jArr[i9];
            jArr[i9] = g(g36);
            if ((g36 & 4294967296L) != 0) {
                long j76 = jArr[1] + 1;
                jArr[1] = g(j76);
                if ((j76 & 4294967296L) != 0) {
                    long j77 = jArr[2] + 1;
                    jArr[2] = g(j77);
                    if ((j77 & 4294967296L) != 0) {
                        long j78 = jArr[3] + 1;
                        jArr[3] = g(j78);
                        if ((j78 & 4294967296L) != 0) {
                            long j79 = jArr[4] + 1;
                            jArr[4] = g(j79);
                            if ((j79 & 4294967296L) != 0) {
                                long j80 = jArr[5] + 1;
                                jArr[5] = g(j80);
                                if ((j80 & 4294967296L) != 0) {
                                    long j81 = jArr[6] + 1;
                                    jArr[6] = g(j81);
                                    if ((j81 & 4294967296L) != 0) {
                                        long j82 = jArr[7] + 1;
                                        jArr[7] = g(j82);
                                        if ((j82 & 4294967296L) != 0) {
                                            long j83 = jArr[8] + 1;
                                            jArr[8] = g(j83);
                                            if ((j83 & 4294967296L) != 0) {
                                                long j84 = jArr[9] + 1;
                                                jArr[9] = g(j84);
                                                if ((j84 & 4294967296L) != 0) {
                                                    long j85 = jArr[10] + 1;
                                                    jArr[10] = g(j85);
                                                    if ((j85 & 4294967296L) != 0) {
                                                        long j86 = jArr[11] + 1;
                                                        jArr[11] = g(j86);
                                                        if ((j86 & 4294967296L) != 0) {
                                                            long j87 = jArr[12] + 1;
                                                            jArr[12] = g(j87);
                                                            if ((j87 & 4294967296L) != 0) {
                                                                long j88 = jArr[13] + 1;
                                                                jArr[13] = g(j88);
                                                                if ((j88 & 4294967296L) != 0) {
                                                                    long j89 = jArr[14] + 1;
                                                                    jArr[14] = g(j89);
                                                                    if ((j89 & 4294967296L) != 0) {
                                                                        long j90 = jArr[15] + 1;
                                                                        jArr[15] = g(j90);
                                                                        if ((j90 & 4294967296L) != 0) {
                                                                            i2 = 1;
                                                                            jArr[i9] = g(jArr[i9] - g20);
                                                                            jArr[1] = g((jArr[1] - g21) - ((int) (-(r70 >> 32))));
                                                                            c = ' ';
                                                                            j = e3;
                                                                            jArr[2] = g((jArr[2] - g22) - ((int) (-(r72 >> 32))));
                                                                            jArr[3] = g((jArr[3] - g23) - ((int) (-(r7 >> 32))));
                                                                            jArr[4] = g((jArr[4] - g24) - ((int) (-(r9 >> 32))));
                                                                            jArr[5] = g((jArr[5] - g25) - ((int) (-(r7 >> 32))));
                                                                            jArr[6] = g((jArr[6] - g26) - ((int) (-(r9 >> 32))));
                                                                            jArr[7] = g((jArr[7] - g27) - ((int) (-(r7 >> 32))));
                                                                            jArr[8] = g((jArr[8] - g28) - ((int) (-(r9 >> 32))));
                                                                            jArr[9] = g((jArr[9] - g29) - ((int) (-(r7 >> 32))));
                                                                            jArr[10] = g((jArr[10] - g30) - ((int) (-(r9 >> 32))));
                                                                            jArr[11] = g((jArr[11] - g31) - ((int) (-(r7 >> 32))));
                                                                            jArr[12] = g((jArr[12] - g32) - ((int) (-(r9 >> 32))));
                                                                            jArr[13] = g((jArr[13] - g33) - ((int) (-(r7 >> 32))));
                                                                            jArr[14] = g((jArr[14] - g34) - ((int) (-(r9 >> 32))));
                                                                            j2 = (jArr[15] - g35) - ((int) (-(r7 >> 32)));
                                                                            jArr[15] = g(j2);
                                                                            if (i2 != ((int) (-(j2 >> 32)))) {
                                                                                if (i2 == 0) {
                                                                                    long j91 = jArr[i9] + e;
                                                                                    jArr[i9] = g(j91);
                                                                                    long j92 = jArr[1] + e2 + (j91 >>> 32);
                                                                                    jArr[1] = g(j92);
                                                                                    long j93 = jArr[2] + j + (j92 >>> 32);
                                                                                    jArr[2] = g(j93);
                                                                                    long j94 = jArr[3] + e4 + (j93 >>> 32);
                                                                                    jArr[3] = g(j94);
                                                                                    long j95 = jArr[4] + e5 + (j94 >>> 32);
                                                                                    jArr[4] = g(j95);
                                                                                    long j96 = jArr[5] + e6 + (j95 >>> 32);
                                                                                    jArr[5] = g(j96);
                                                                                    long j97 = jArr[6] + e7 + (j96 >>> 32);
                                                                                    jArr[6] = g(j97);
                                                                                    long j98 = jArr[7] + e8 + (j97 >>> 32);
                                                                                    jArr[7] = g(j98);
                                                                                    long j99 = jArr[8] + e9 + (j98 >>> 32);
                                                                                    jArr[8] = g(j99);
                                                                                    long j100 = jArr[9] + e10 + (j99 >>> 32);
                                                                                    jArr[9] = g(j100);
                                                                                    long j101 = jArr[10] + e11 + (j100 >>> 32);
                                                                                    jArr[10] = g(j101);
                                                                                    long j102 = jArr[11] + e12 + (j101 >>> 32);
                                                                                    jArr[11] = g(j102);
                                                                                    long j103 = jArr[12] + e13 + (j102 >>> 32);
                                                                                    jArr[12] = g(j103);
                                                                                    long j104 = jArr[13] + e14 + (j103 >>> 32);
                                                                                    jArr[13] = g(j104);
                                                                                    long j105 = jArr[14] + e15 + (j104 >>> 32);
                                                                                    jArr[14] = g(j105);
                                                                                    long j106 = jArr[15] + e16 + (j105 >>> 32);
                                                                                    jArr[15] = g(j106);
                                                                                    if ((j106 >>> 32) == 0) {
                                                                                        long j107 = jArr[i9] + e;
                                                                                        jArr[i9] = g(j107);
                                                                                        long j108 = jArr[1] + e2 + (j107 >>> 32);
                                                                                        jArr[1] = g(j108);
                                                                                        long j109 = jArr[2] + j + (j108 >>> 32);
                                                                                        jArr[2] = g(j109);
                                                                                        long j110 = jArr[3] + e4 + (j109 >>> 32);
                                                                                        jArr[3] = g(j110);
                                                                                        long j111 = jArr[4] + e5 + (j110 >>> 32);
                                                                                        jArr[4] = g(j111);
                                                                                        long j112 = jArr[5] + e6 + (j111 >>> 32);
                                                                                        jArr[5] = g(j112);
                                                                                        long j113 = jArr[6] + e7 + (j112 >>> 32);
                                                                                        jArr[6] = g(j113);
                                                                                        long j114 = jArr[7] + e8 + (j113 >>> 32);
                                                                                        jArr[7] = g(j114);
                                                                                        long j115 = jArr[8] + e9 + (j114 >>> 32);
                                                                                        jArr[8] = g(j115);
                                                                                        long j116 = jArr[9] + e10 + (j115 >>> 32);
                                                                                        jArr[9] = g(j116);
                                                                                        long j117 = jArr[10] + e11 + (j116 >>> 32);
                                                                                        jArr[10] = g(j117);
                                                                                        long j118 = jArr[11] + e12 + (j117 >>> 32);
                                                                                        jArr[11] = g(j118);
                                                                                        long j119 = jArr[12] + e13 + (j118 >>> 32);
                                                                                        jArr[12] = g(j119);
                                                                                        long j120 = jArr[13] + e14 + (j119 >>> 32);
                                                                                        jArr[13] = g(j120);
                                                                                        long j121 = jArr[14] + e15 + (j120 >>> 32);
                                                                                        jArr[14] = g(j121);
                                                                                        jArr[15] = g(jArr[15] + e16 + (j121 >>> 32));
                                                                                    }
                                                                                } else {
                                                                                    jArr[i9] = g(jArr[i9] - e);
                                                                                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r7 >> 32))));
                                                                                    jArr[2] = g((jArr[2] - j) - ((int) (-(r9 >> 32))));
                                                                                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r7 >> 32))));
                                                                                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r9 >> 32))));
                                                                                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r7 >> 32))));
                                                                                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r9 >> 32))));
                                                                                    jArr[7] = g((jArr[7] - e8) - ((int) (-(r7 >> 32))));
                                                                                    jArr[8] = g((jArr[8] - e9) - ((int) (-(r9 >> 32))));
                                                                                    jArr[9] = g((jArr[9] - e10) - ((int) (-(r7 >> 32))));
                                                                                    jArr[10] = g((jArr[10] - e11) - ((int) (-(r9 >> 32))));
                                                                                    jArr[11] = g((jArr[11] - e12) - ((int) (-(r7 >> 32))));
                                                                                    jArr[12] = g((jArr[12] - e13) - ((int) (-(r9 >> 32))));
                                                                                    jArr[13] = g((jArr[13] - e14) - ((int) (-(r7 >> 32))));
                                                                                    jArr[14] = g((jArr[14] - e15) - ((int) (-(r9 >> 32))));
                                                                                    long j122 = (jArr[15] - e16) - ((int) (-(r7 >> 32)));
                                                                                    jArr[15] = g(j122);
                                                                                    if (((int) (-(j122 >> 32))) == 0) {
                                                                                        jArr[i9] = g(jArr[i9] - e);
                                                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r7 >> 32))));
                                                                                        jArr[2] = g((jArr[2] - j) - ((int) (-(r9 >> 32))));
                                                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r7 >> 32))));
                                                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r9 >> 32))));
                                                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r7 >> 32))));
                                                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r9 >> 32))));
                                                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r7 >> 32))));
                                                                                        jArr[8] = g((jArr[8] - e9) - ((int) (-(r9 >> 32))));
                                                                                        jArr[9] = g((jArr[9] - e10) - ((int) (-(r7 >> 32))));
                                                                                        jArr[10] = g((jArr[10] - e11) - ((int) (-(r9 >> 32))));
                                                                                        jArr[11] = g((jArr[11] - e12) - ((int) (-(r7 >> 32))));
                                                                                        jArr[12] = g((jArr[12] - e13) - ((int) (-(r9 >> 32))));
                                                                                        jArr[13] = g((jArr[13] - e14) - ((int) (-(r7 >> 32))));
                                                                                        jArr[14] = g((jArr[14] - e15) - ((int) (-(r9 >> 32))));
                                                                                        jArr[15] = g((jArr[15] - e16) - ((int) (-(r7 >> 32))));
                                                                                    }
                                                                                }
                                                                            }
                                                                            j3 = jArr[15];
                                                                            if (j3 != e16) {
                                                                                long j123 = jArr[14];
                                                                                if (j123 == e15) {
                                                                                    long j124 = jArr[13];
                                                                                    if (j124 == e14) {
                                                                                        long j125 = jArr[12];
                                                                                        if (j125 == e13) {
                                                                                            long j126 = jArr[11];
                                                                                            if (j126 == e12) {
                                                                                                long j127 = jArr[10];
                                                                                                if (j127 == e11) {
                                                                                                    long j128 = jArr[9];
                                                                                                    if (j128 == e10) {
                                                                                                        long j129 = jArr[8];
                                                                                                        if (j129 == e9) {
                                                                                                            long j130 = jArr[7];
                                                                                                            if (j130 == e8) {
                                                                                                                long j131 = jArr[6];
                                                                                                                if (j131 == e7) {
                                                                                                                    long j132 = jArr[5];
                                                                                                                    if (j132 == e6) {
                                                                                                                        long j133 = jArr[4];
                                                                                                                        if (j133 == e5) {
                                                                                                                            long j134 = jArr[3];
                                                                                                                            if (j134 == e4) {
                                                                                                                                long j135 = jArr[2];
                                                                                                                                if (j135 == j) {
                                                                                                                                    long j136 = jArr[1];
                                                                                                                                    if (j136 == e2) {
                                                                                                                                        long j137 = jArr[i9];
                                                                                                                                        if (j137 != e) {
                                                                                                                                        }
                                                                                                                                        jArr[i9] = g(jArr[i9] - e);
                                                                                                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[2] = g((jArr[2] - j) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[8] = g((jArr[8] - e9) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[9] = g((jArr[9] - e10) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[10] = g((jArr[10] - e11) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[11] = g((jArr[11] - e12) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[12] = g((jArr[12] - e13) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[13] = g((jArr[13] - e14) - ((int) (-(r7 >> 32))));
                                                                                                                                        jArr[14] = g((jArr[14] - e15) - ((int) (-(r9 >> 32))));
                                                                                                                                        jArr[15] = g((jArr[15] - e16) - ((int) (-(r7 >> 32))));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i2 = i9;
            jArr[i9] = g(jArr[i9] - g20);
            jArr[1] = g((jArr[1] - g21) - ((int) (-(r70 >> 32))));
            c = ' ';
            j = e3;
            jArr[2] = g((jArr[2] - g22) - ((int) (-(r72 >> 32))));
            jArr[3] = g((jArr[3] - g23) - ((int) (-(r7 >> 32))));
            jArr[4] = g((jArr[4] - g24) - ((int) (-(r9 >> 32))));
            jArr[5] = g((jArr[5] - g25) - ((int) (-(r7 >> 32))));
            jArr[6] = g((jArr[6] - g26) - ((int) (-(r9 >> 32))));
            jArr[7] = g((jArr[7] - g27) - ((int) (-(r7 >> 32))));
            jArr[8] = g((jArr[8] - g28) - ((int) (-(r9 >> 32))));
            jArr[9] = g((jArr[9] - g29) - ((int) (-(r7 >> 32))));
            jArr[10] = g((jArr[10] - g30) - ((int) (-(r9 >> 32))));
            jArr[11] = g((jArr[11] - g31) - ((int) (-(r7 >> 32))));
            jArr[12] = g((jArr[12] - g32) - ((int) (-(r9 >> 32))));
            jArr[13] = g((jArr[13] - g33) - ((int) (-(r7 >> 32))));
            jArr[14] = g((jArr[14] - g34) - ((int) (-(r9 >> 32))));
            j2 = (jArr[15] - g35) - ((int) (-(r7 >> 32)));
            jArr[15] = g(j2);
            if (i2 != ((int) (-(j2 >> 32)))) {
            }
            j3 = jArr[15];
            if (j3 != e16) {
            }
        } else if (i == 2) {
            l(jArr, iArr, iArr3);
            return;
        } else {
            c = ' ';
            j = e3;
        }
        long j138 = jArr[15];
        if (j138 == e16) {
            long j139 = jArr[14];
            if (j139 == e15) {
                long j140 = jArr[13];
                if (j140 == e14) {
                    long j141 = jArr[12];
                    if (j141 == e13) {
                        long j142 = jArr[11];
                        if (j142 == e12) {
                            long j143 = jArr[10];
                            if (j143 == e11) {
                                long j144 = jArr[9];
                                if (j144 == e10) {
                                    long j145 = jArr[8];
                                    if (j145 == e9) {
                                        long j146 = jArr[7];
                                        if (j146 == e8) {
                                            long j147 = jArr[6];
                                            if (j147 == e7) {
                                                long j148 = jArr[5];
                                                if (j148 == e6) {
                                                    long j149 = jArr[4];
                                                    if (j149 == e5) {
                                                        long j150 = jArr[3];
                                                        if (j150 == e4) {
                                                            long j151 = jArr[2];
                                                            if (j151 == j) {
                                                                long j152 = jArr[1];
                                                                if (j152 == e2) {
                                                                    long j153 = jArr[i9];
                                                                    if (j153 != e) {
                                                                    }
                                                                    iArr[i9] = (int) (jArr[i9] - e);
                                                                    iArr[1] = (int) ((jArr[1] - e2) - ((int) (-(r9 >> c))));
                                                                    iArr[2] = (int) ((jArr[2] - j) - ((int) (-(r4 >> c))));
                                                                    iArr[3] = (int) ((jArr[3] - e4) - ((int) (-(r9 >> c))));
                                                                    iArr[4] = (int) ((jArr[4] - e5) - ((int) (-(r4 >> c))));
                                                                    iArr[5] = (int) ((jArr[5] - e6) - ((int) (-(r9 >> c))));
                                                                    iArr[6] = (int) ((jArr[6] - e7) - ((int) (-(r4 >> c))));
                                                                    iArr[7] = (int) ((jArr[7] - e8) - ((int) (-(r9 >> c))));
                                                                    iArr[8] = (int) ((jArr[8] - e9) - ((int) (-(r4 >> c))));
                                                                    iArr[9] = (int) ((jArr[9] - e10) - ((int) (-(r9 >> c))));
                                                                    iArr[10] = (int) ((jArr[10] - e11) - ((int) (-(r4 >> c))));
                                                                    iArr[11] = (int) ((jArr[11] - e12) - ((int) (-(r9 >> c))));
                                                                    iArr[12] = (int) ((jArr[12] - e13) - ((int) (-(r4 >> c))));
                                                                    iArr[13] = (int) ((jArr[13] - e14) - ((int) (-(r9 >> c))));
                                                                    iArr[14] = (int) ((jArr[14] - e15) - ((int) (-(r4 >> c))));
                                                                    iArr[15] = (int) ((j138 - e16) - ((int) (-(r9 >> c))));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        long e;
        long e2;
        long e3;
        long e4;
        long e5;
        long e6;
        long e7;
        long e8;
        long e9;
        long e10;
        long e11;
        long e12;
        long e13;
        long e14;
        long e15;
        long j = -1;
        if (c(iArr3, iArr2) > 0) {
            long e16 = e(iArr4[0]) + e(iArr2[0]);
            e4 = g(e16);
            long e17 = e(iArr4[1]) + e(iArr2[1]) + (e16 >>> 32);
            e = g(e17);
            long e18 = e(iArr4[2]) + e(iArr2[2]) + (e17 >>> 32);
            e2 = g(e18);
            long e19 = e(iArr4[3]) + e(iArr2[3]) + (e18 >>> 32);
            e3 = g(e19);
            long e20 = e(iArr4[4]) + e(iArr2[4]) + (e19 >>> 32);
            e5 = g(e20);
            long e21 = e(iArr4[5]) + e(iArr2[5]) + (e20 >>> 32);
            e6 = g(e21);
            long e22 = e(iArr4[6]) + e(iArr2[6]) + (e21 >>> 32);
            e7 = g(e22);
            e8 = e(iArr4[7]) + e(iArr2[7]) + (e22 >>> 32);
            if (iArr.length != 8) {
                long g = g(e8);
                long e23 = e(iArr4[8]) + e(iArr2[8]) + (e8 >>> 32);
                long g2 = g(e23);
                long e24 = e(iArr4[9]) + e(iArr2[9]) + (e23 >>> 32);
                long g3 = g(e24);
                long e25 = e(iArr4[10]) + e(iArr2[10]) + (e24 >>> 32);
                long g4 = g(e25);
                long e26 = e(iArr4[11]) + e(iArr2[11]) + (e25 >>> 32);
                e11 = g(e26);
                long e27 = e(iArr4[12]) + e(iArr2[12]) + (e26 >>> 32);
                e12 = g(e27);
                long e28 = e(iArr4[13]) + e(iArr2[13]) + (e27 >>> 32);
                e13 = g(e28);
                long e29 = e(iArr4[14]) + e(iArr2[14]) + (e28 >>> 32);
                e14 = g(e29);
                e15 = e(iArr4[15]) + e(iArr2[15]) + (e29 >>> 32);
                e8 = g;
                j = g2;
                e9 = g3;
                e10 = g4;
            }
            e9 = -1;
            e10 = -1;
            e11 = -1;
            e12 = -1;
            e13 = -1;
            e14 = -1;
            e15 = -1;
        } else {
            e = e(iArr2[1]);
            e2 = e(iArr2[2]);
            e3 = e(iArr2[3]);
            e4 = e(iArr2[0]);
            e5 = e(iArr2[4]);
            e6 = e(iArr2[5]);
            e7 = e(iArr2[6]);
            e8 = e(iArr2[7]);
            if (iArr.length > 8) {
                j = e(iArr2[8]);
                e9 = e(iArr2[9]);
                e10 = e(iArr2[10]);
                e11 = e(iArr2[11]);
                e12 = e(iArr2[12]);
                e13 = e(iArr2[13]);
                e14 = e(iArr2[14]);
                e15 = e(iArr2[15]);
            }
            e9 = -1;
            e10 = -1;
            e11 = -1;
            e12 = -1;
            e13 = -1;
            e14 = -1;
            e15 = -1;
        }
        iArr[0] = (int) (e4 - e(iArr3[0]));
        iArr[1] = (int) ((e - e(iArr3[1])) - ((int) (-(r5 >> 32))));
        iArr[2] = (int) ((e2 - e(iArr3[2])) - ((int) (-(r5 >> 32))));
        iArr[3] = (int) ((e3 - e(iArr3[3])) - ((int) (-(r5 >> 32))));
        iArr[4] = (int) ((e5 - e(iArr3[4])) - ((int) (-(r5 >> 32))));
        iArr[5] = (int) ((e6 - e(iArr3[5])) - ((int) (-(r5 >> 32))));
        iArr[6] = (int) ((e7 - e(iArr3[6])) - ((int) (-(r5 >> 32))));
        iArr[7] = (int) ((e8 - e(iArr3[7])) - ((int) (-(r5 >> 32))));
        if (iArr.length > 8) {
            iArr[8] = (int) ((j - e(iArr3[8])) - ((int) (-(r5 >> 32))));
            iArr[9] = (int) ((e9 - e(iArr3[9])) - ((int) (-(r5 >> 32))));
            iArr[10] = (int) ((e10 - e(iArr3[10])) - ((int) (-(r4 >> 32))));
            iArr[11] = (int) ((e11 - e(iArr3[11])) - ((int) (-(r4 >> 32))));
            iArr[12] = (int) ((e12 - e(iArr3[12])) - ((int) (-(r4 >> 32))));
            iArr[13] = (int) ((e13 - e(iArr3[13])) - ((int) (-(r4 >> 32))));
            iArr[14] = (int) ((e14 - e(iArr3[14])) - ((int) (-(r4 >> 32))));
            iArr[15] = (int) ((e15 - e(iArr3[15])) - ((int) (-(r3 >> 32))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x07ce, code lost:
    
        if (r1 > r50) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x07d8, code lost:
    
        if (r1 > r47) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x07e2, code lost:
    
        if (r1 > r44) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x07ec, code lost:
    
        if (r1 > r41) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x07f6, code lost:
    
        if (r1 > r38) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0800, code lost:
    
        if (r1 > r35) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x080a, code lost:
    
        if (r1 > r32) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0813, code lost:
    
        if (r1 > r29) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x081c, code lost:
    
        if (r1 > r26) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0825, code lost:
    
        if (r1 > r23) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x082e, code lost:
    
        if (r1 > r20) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0837, code lost:
    
        if (r1 > r17) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0840, code lost:
    
        if (r1 > r14) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x084b, code lost:
    
        if (r1 > r11) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0856, code lost:
    
        if (r1 > r8) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x085f, code lost:
    
        if (r1 <= r5) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0c0a, code lost:
    
        if ((r1 & 4294967296L) != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0e1b, code lost:
    
        if (r1 > r50) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0eb1, code lost:
    
        r4 = 0;
        r12 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0eb5, code lost:
    
        if (r4 >= r12) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0eb7, code lost:
    
        r101[r4] = (int) r106[r4];
        r4 = r4 + 1;
        r12 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0ec1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e25, code lost:
    
        if (r3 > r47) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e2f, code lost:
    
        if (r3 > r44) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e39, code lost:
    
        if (r3 > r41) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e43, code lost:
    
        if (r3 > r38) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e4d, code lost:
    
        if (r3 > r35) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e57, code lost:
    
        if (r3 > r32) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e61, code lost:
    
        if (r3 > r29) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0e6b, code lost:
    
        if (r3 > r26) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0e74, code lost:
    
        if (r3 > r23) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0e7d, code lost:
    
        if (r3 > r20) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0e86, code lost:
    
        if (r3 > r17) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e8f, code lost:
    
        if (r3 > r14) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0e9a, code lost:
    
        if (r3 > r11) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0ea5, code lost:
    
        if (r3 > r8) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0eae, code lost:
    
        if (r3 <= r5) goto L248;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, long[] jArr) {
        int i2;
        long j;
        long j2;
        long e = e(iArr4[0]);
        long e2 = e(iArr4[1]);
        long e3 = e(iArr4[2]);
        long e4 = e(iArr4[3]);
        long e5 = e(iArr4[4]);
        long e6 = e(iArr4[5]);
        long e7 = e(iArr4[6]);
        long e8 = e(iArr4[7]);
        long e9 = e(iArr4[8]);
        long e10 = e(iArr4[9]);
        long e11 = e(iArr4[10]);
        long e12 = e(iArr4[11]);
        long e13 = e(iArr4[12]);
        long e14 = e(iArr4[13]);
        long e15 = e(iArr4[14]);
        long e16 = e(iArr4[15]);
        int i3 = 15;
        while (i3 >= 0 && iArr2[i3] == 0) {
            i3--;
        }
        int i4 = 15;
        while (i4 >= 0 && iArr3[i4] == 0) {
            i4--;
        }
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        if (i5 == 0 || i6 == 0) {
            Arrays.fill(iArr, 0, 16, 0);
            return;
        }
        long j3 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            long e17 = (e(iArr3[0]) * e(iArr2[i7])) + j3;
            j3 = e17 >>> 32;
            jArr[i7] = g(e17);
        }
        jArr[i5] = j3;
        for (int i8 = 1; i8 < i6; i8++) {
            long j4 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = i8 + i9;
                long g = g(jArr[i10]) + (e(iArr3[i8]) * e(iArr2[i9])) + j4;
                j4 = g >>> 32;
                jArr[i10] = g(g);
            }
            jArr[i8 + i5] = j4;
        }
        Arrays.fill(jArr, i5 + i6, 33, 0L);
        long j5 = 1;
        if (i == -1) {
            long e18 = e(-iArr4[0]);
            long j6 = jArr[16] * e18;
            long g2 = g(j6);
            long j7 = (jArr[17] * e18) + (j6 >>> 32);
            long g3 = g(j7);
            long j8 = (jArr[18] * e18) + (j7 >>> 32);
            long g4 = g(j8);
            long j9 = (jArr[19] * e18) + (j8 >>> 32);
            long g5 = g(j9);
            long j10 = (jArr[20] * e18) + (j9 >>> 32);
            long g6 = g(j10);
            long j11 = (jArr[21] * e18) + (j10 >>> 32);
            long g7 = g(j11);
            long j12 = (jArr[22] * e18) + (j11 >>> 32);
            long g8 = g(j12);
            long j13 = (jArr[23] * e18) + (j12 >>> 32);
            long g9 = g(j13);
            long j14 = (jArr[24] * e18) + (j13 >>> 32);
            long g10 = g(j14);
            long j15 = (jArr[25] * e18) + (j14 >>> 32);
            long g11 = g(j15);
            long j16 = (jArr[26] * e18) + (j15 >>> 32);
            long g12 = g(j16);
            long j17 = (jArr[27] * e18) + (j16 >>> 32);
            long g13 = g(j17);
            long j18 = (jArr[28] * e18) + (j17 >>> 32);
            long g14 = g(j18);
            long j19 = (jArr[29] * e18) + (j18 >>> 32);
            long g15 = g(j19);
            long j20 = (jArr[30] * e18) + (j19 >>> 32);
            long g16 = g(j20);
            long j21 = (jArr[31] * e18) + (j20 >>> 32);
            long g17 = g(j21);
            long g18 = g(j21 >>> 32);
            jArr[16] = 0;
            long j22 = jArr[0] + g2;
            jArr[0] = g(j22);
            long j23 = jArr[1] + g3 + (j22 >>> 32);
            jArr[1] = g(j23);
            long j24 = jArr[2] + g4 + (j23 >>> 32);
            jArr[2] = g(j24);
            long j25 = jArr[3] + g5 + (j24 >>> 32);
            jArr[3] = g(j25);
            long j26 = jArr[4] + g6 + (j25 >>> 32);
            jArr[4] = g(j26);
            long j27 = jArr[5] + g7 + (j26 >>> 32);
            jArr[5] = g(j27);
            long j28 = jArr[6] + g8 + (j27 >>> 32);
            jArr[6] = g(j28);
            long j29 = jArr[7] + g9 + (j28 >>> 32);
            jArr[7] = g(j29);
            long j30 = jArr[8] + g10 + (j29 >>> 32);
            jArr[8] = g(j30);
            long j31 = jArr[9] + g11 + (j30 >>> 32);
            jArr[9] = g(j31);
            long j32 = jArr[10] + g12 + (j31 >>> 32);
            jArr[10] = g(j32);
            long j33 = jArr[11] + g13 + (j32 >>> 32);
            jArr[11] = g(j33);
            long j34 = jArr[12] + g14 + (j33 >>> 32);
            jArr[12] = g(j34);
            long j35 = jArr[13] + g15 + (j34 >>> 32);
            jArr[13] = g(j35);
            long j36 = jArr[14] + g16 + (j35 >>> 32);
            jArr[14] = g(j36);
            long j37 = jArr[15] + g17 + (j36 >>> 32);
            jArr[15] = g(j37);
            if ((j37 >>> 32) != 0) {
                g18++;
            }
            long g19 = g(g(g18) * e18) + jArr[0];
            jArr[0] = g(g19);
            if ((g19 & 4294967296L) != 0) {
                long j38 = jArr[1] + 1;
                jArr[1] = g(j38);
                if ((j38 & 4294967296L) != 0) {
                    long j39 = jArr[2] + 1;
                    jArr[2] = g(j39);
                    if ((j39 & 4294967296L) != 0) {
                        long j40 = jArr[3] + 1;
                        jArr[3] = g(j40);
                        if ((j40 & 4294967296L) != 0) {
                            long j41 = jArr[4] + 1;
                            jArr[4] = g(j41);
                            if ((j41 & 4294967296L) != 0) {
                                long j42 = jArr[5] + 1;
                                jArr[5] = g(j42);
                                if ((j42 & 4294967296L) != 0) {
                                    long j43 = jArr[6] + 1;
                                    jArr[6] = g(j43);
                                    if ((j43 & 4294967296L) != 0) {
                                        long j44 = jArr[7] + 1;
                                        jArr[7] = g(j44);
                                        if ((j44 & 4294967296L) != 0) {
                                            long j45 = jArr[8] + 1;
                                            jArr[8] = g(j45);
                                            if ((j45 & 4294967296L) != 0) {
                                                long j46 = jArr[9] + 1;
                                                jArr[9] = g(j46);
                                                if ((j46 & 4294967296L) != 0) {
                                                    long j47 = jArr[10] + 1;
                                                    jArr[10] = g(j47);
                                                    if ((j47 & 4294967296L) != 0) {
                                                        long j48 = jArr[11] + 1;
                                                        jArr[11] = g(j48);
                                                        if ((j48 & 4294967296L) != 0) {
                                                            long j49 = jArr[12] + 1;
                                                            jArr[12] = g(j49);
                                                            if ((j49 & 4294967296L) != 0) {
                                                                long j50 = jArr[13] + 1;
                                                                jArr[13] = g(j50);
                                                                if ((j50 & 4294967296L) != 0) {
                                                                    long j51 = jArr[14] + 1;
                                                                    jArr[14] = g(j51);
                                                                    if ((j51 & 4294967296L) != 0) {
                                                                        long j52 = jArr[15] + 1;
                                                                        jArr[15] = g(j52);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j5 = 0;
            if (j5 != 0) {
                jArr[0] = g(jArr[0] - e);
                jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                jArr[8] = g((jArr[8] - e9) - ((int) (-(r3 >> 32))));
                jArr[9] = g((jArr[9] - e10) - ((int) (-(r1 >> 32))));
                jArr[10] = g((jArr[10] - e11) - ((int) (-(r3 >> 32))));
                jArr[11] = g((jArr[11] - e12) - ((int) (-(r1 >> 32))));
                jArr[12] = g((jArr[12] - e13) - ((int) (-(r3 >> 32))));
                jArr[13] = g((jArr[13] - e14) - ((int) (-(r1 >> 32))));
                jArr[14] = g((jArr[14] - e15) - ((int) (-(r3 >> 32))));
                long j53 = (jArr[15] - e16) - ((int) (-(r1 >> 32)));
                jArr[15] = g(j53);
                if (e((int) (-(j53 >> 32))) == 0) {
                    jArr[0] = g(jArr[0] - e);
                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                    jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                    jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                    jArr[8] = g((jArr[8] - e9) - ((int) (-(r3 >> 32))));
                    jArr[9] = g((jArr[9] - e10) - ((int) (-(r1 >> 32))));
                    jArr[10] = g((jArr[10] - e11) - ((int) (-(r3 >> 32))));
                    jArr[11] = g((jArr[11] - e12) - ((int) (-(r1 >> 32))));
                    jArr[12] = g((jArr[12] - e13) - ((int) (-(r3 >> 32))));
                    jArr[13] = g((jArr[13] - e14) - ((int) (-(r1 >> 32))));
                    jArr[14] = g((jArr[14] - e15) - ((int) (-(r3 >> 32))));
                    jArr[15] = g((jArr[15] - e16) - ((int) (-(r1 >> 32))));
                }
            }
        } else if (i == 1) {
            long g20 = g(e << 1);
            long j54 = jArr[16] * g20;
            long g21 = g(j54);
            long j55 = (jArr[17] * g20) + (j54 >>> 32);
            long g22 = g(j55);
            long j56 = (jArr[18] * g20) + (j55 >>> 32);
            long g23 = g(j56);
            long j57 = (jArr[19] * g20) + (j56 >>> 32);
            long g24 = g(j57);
            long j58 = (jArr[20] * g20) + (j57 >>> 32);
            long g25 = g(j58);
            long j59 = (jArr[21] * g20) + (j58 >>> 32);
            long g26 = g(j59);
            long j60 = (jArr[22] * g20) + (j59 >>> 32);
            long g27 = g(j60);
            long j61 = (jArr[23] * g20) + (j60 >>> 32);
            long g28 = g(j61);
            long j62 = (jArr[24] * g20) + (j61 >>> 32);
            long g29 = g(j62);
            long j63 = (jArr[25] * g20) + (j62 >>> 32);
            long g30 = g(j63);
            long j64 = (jArr[26] * g20) + (j63 >>> 32);
            long g31 = g(j64);
            long j65 = (jArr[27] * g20) + (j64 >>> 32);
            long g32 = g(j65);
            long j66 = (jArr[28] * g20) + (j65 >>> 32);
            long g33 = g(j66);
            long j67 = (jArr[29] * g20) + (j66 >>> 32);
            long g34 = g(j67);
            long j68 = (jArr[30] * g20) + (j67 >>> 32);
            long g35 = g(j68);
            long j69 = (jArr[31] * g20) + (j68 >>> 32);
            long g36 = g(j69);
            long g37 = g(g(j69 >>> 32) * g20) + jArr[0];
            jArr[0] = g(g37);
            if ((g37 & 4294967296L) != 0) {
                long j70 = jArr[1] + 1;
                jArr[1] = g(j70);
                if ((j70 & 4294967296L) != 0) {
                    long j71 = jArr[2] + 1;
                    jArr[2] = g(j71);
                    if ((j71 & 4294967296L) != 0) {
                        long j72 = jArr[3] + 1;
                        jArr[3] = g(j72);
                        if ((j72 & 4294967296L) != 0) {
                            long j73 = jArr[4] + 1;
                            jArr[4] = g(j73);
                            if ((j73 & 4294967296L) != 0) {
                                long j74 = jArr[5] + 1;
                                jArr[5] = g(j74);
                                if ((j74 & 4294967296L) != 0) {
                                    long j75 = jArr[6] + 1;
                                    jArr[6] = g(j75);
                                    if ((j75 & 4294967296L) != 0) {
                                        long j76 = jArr[7] + 1;
                                        jArr[7] = g(j76);
                                        if ((j76 & 4294967296L) != 0) {
                                            long j77 = jArr[8] + 1;
                                            jArr[8] = g(j77);
                                            if ((j77 & 4294967296L) != 0) {
                                                long j78 = jArr[9] + 1;
                                                jArr[9] = g(j78);
                                                if ((j78 & 4294967296L) != 0) {
                                                    long j79 = jArr[10] + 1;
                                                    jArr[10] = g(j79);
                                                    if ((j79 & 4294967296L) != 0) {
                                                        long j80 = jArr[11] + 1;
                                                        jArr[11] = g(j80);
                                                        if ((j80 & 4294967296L) != 0) {
                                                            long j81 = jArr[12] + 1;
                                                            jArr[12] = g(j81);
                                                            if ((j81 & 4294967296L) != 0) {
                                                                long j82 = jArr[13] + 1;
                                                                jArr[13] = g(j82);
                                                                if ((j82 & 4294967296L) != 0) {
                                                                    long j83 = jArr[14] + 1;
                                                                    jArr[14] = g(j83);
                                                                    if ((j83 & 4294967296L) != 0) {
                                                                        long j84 = jArr[15] + 1;
                                                                        jArr[15] = g(j84);
                                                                        if ((j84 & 4294967296L) != 0) {
                                                                            i2 = 1;
                                                                            jArr[0] = g(jArr[0] - g21);
                                                                            jArr[1] = g((jArr[1] - g22) - ((int) (-(r70 >> 32))));
                                                                            jArr[2] = g((jArr[2] - g23) - ((int) (-(r72 >> 32))));
                                                                            jArr[3] = g((jArr[3] - g24) - ((int) (-(r10 >> 32))));
                                                                            jArr[4] = g((jArr[4] - g25) - ((int) (-(r2 >> 32))));
                                                                            jArr[5] = g((jArr[5] - g26) - ((int) (-(r10 >> 32))));
                                                                            jArr[6] = g((jArr[6] - g27) - ((int) (-(r2 >> 32))));
                                                                            jArr[7] = g((jArr[7] - g28) - ((int) (-(r10 >> 32))));
                                                                            jArr[8] = g((jArr[8] - g29) - ((int) (-(r2 >> 32))));
                                                                            jArr[9] = g((jArr[9] - g30) - ((int) (-(r10 >> 32))));
                                                                            jArr[10] = g((jArr[10] - g31) - ((int) (-(r2 >> 32))));
                                                                            jArr[11] = g((jArr[11] - g32) - ((int) (-(r10 >> 32))));
                                                                            jArr[12] = g((jArr[12] - g33) - ((int) (-(r2 >> 32))));
                                                                            jArr[13] = g((jArr[13] - g34) - ((int) (-(r10 >> 32))));
                                                                            jArr[14] = g((jArr[14] - g35) - ((int) (-(r2 >> 32))));
                                                                            j = (jArr[15] - g36) - ((int) (-(r10 >> 32)));
                                                                            jArr[15] = g(j);
                                                                            if (i2 != ((int) (-(j >> 32)))) {
                                                                                if (i2 == 0) {
                                                                                    long j85 = jArr[0] + e;
                                                                                    jArr[0] = g(j85);
                                                                                    long j86 = jArr[1] + e2 + (j85 >>> 32);
                                                                                    jArr[1] = g(j86);
                                                                                    long j87 = jArr[2] + e3 + (j86 >>> 32);
                                                                                    jArr[2] = g(j87);
                                                                                    long j88 = jArr[3] + e4 + (j87 >>> 32);
                                                                                    jArr[3] = g(j88);
                                                                                    long j89 = jArr[4] + e5 + (j88 >>> 32);
                                                                                    jArr[4] = g(j89);
                                                                                    long j90 = jArr[5] + e6 + (j89 >>> 32);
                                                                                    jArr[5] = g(j90);
                                                                                    long j91 = jArr[6] + e7 + (j90 >>> 32);
                                                                                    jArr[6] = g(j91);
                                                                                    long j92 = jArr[7] + e8 + (j91 >>> 32);
                                                                                    jArr[7] = g(j92);
                                                                                    long j93 = jArr[8] + e9 + (j92 >>> 32);
                                                                                    jArr[8] = g(j93);
                                                                                    long j94 = jArr[9] + e10 + (j93 >>> 32);
                                                                                    jArr[9] = g(j94);
                                                                                    long j95 = jArr[10] + e11 + (j94 >>> 32);
                                                                                    jArr[10] = g(j95);
                                                                                    long j96 = jArr[11] + e12 + (j95 >>> 32);
                                                                                    jArr[11] = g(j96);
                                                                                    long j97 = jArr[12] + e13 + (j96 >>> 32);
                                                                                    jArr[12] = g(j97);
                                                                                    long j98 = jArr[13] + e14 + (j97 >>> 32);
                                                                                    jArr[13] = g(j98);
                                                                                    long j99 = jArr[14] + e15 + (j98 >>> 32);
                                                                                    jArr[14] = g(j99);
                                                                                    long j100 = jArr[15] + e16 + (j99 >>> 32);
                                                                                    jArr[15] = g(j100);
                                                                                    if ((j100 >>> 32) == 0) {
                                                                                        long j101 = jArr[0] + e;
                                                                                        jArr[0] = g(j101);
                                                                                        long j102 = jArr[1] + e2 + (j101 >>> 32);
                                                                                        jArr[1] = g(j102);
                                                                                        long j103 = jArr[2] + e3 + (j102 >>> 32);
                                                                                        jArr[2] = g(j103);
                                                                                        long j104 = jArr[3] + e4 + (j103 >>> 32);
                                                                                        jArr[3] = g(j104);
                                                                                        long j105 = jArr[4] + e5 + (j104 >>> 32);
                                                                                        jArr[4] = g(j105);
                                                                                        long j106 = jArr[5] + e6 + (j105 >>> 32);
                                                                                        jArr[5] = g(j106);
                                                                                        long j107 = jArr[6] + e7 + (j106 >>> 32);
                                                                                        jArr[6] = g(j107);
                                                                                        long j108 = jArr[7] + e8 + (j107 >>> 32);
                                                                                        jArr[7] = g(j108);
                                                                                        long j109 = jArr[8] + e9 + (j108 >>> 32);
                                                                                        jArr[8] = g(j109);
                                                                                        long j110 = jArr[9] + e10 + (j109 >>> 32);
                                                                                        jArr[9] = g(j110);
                                                                                        long j111 = jArr[10] + e11 + (j110 >>> 32);
                                                                                        jArr[10] = g(j111);
                                                                                        long j112 = jArr[11] + e12 + (j111 >>> 32);
                                                                                        jArr[11] = g(j112);
                                                                                        long j113 = jArr[12] + e13 + (j112 >>> 32);
                                                                                        jArr[12] = g(j113);
                                                                                        long j114 = jArr[13] + e14 + (j113 >>> 32);
                                                                                        jArr[13] = g(j114);
                                                                                        long j115 = jArr[14] + e15 + (j114 >>> 32);
                                                                                        jArr[14] = g(j115);
                                                                                        jArr[15] = g(jArr[15] + e16 + (j115 >>> 32));
                                                                                    }
                                                                                } else {
                                                                                    jArr[0] = g(jArr[0] - e);
                                                                                    jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                                                    jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                                                    jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                                                    jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                                                    jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                                                    jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                                                    jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                                                    jArr[8] = g((jArr[8] - e9) - ((int) (-(r3 >> 32))));
                                                                                    jArr[9] = g((jArr[9] - e10) - ((int) (-(r1 >> 32))));
                                                                                    jArr[10] = g((jArr[10] - e11) - ((int) (-(r3 >> 32))));
                                                                                    jArr[11] = g((jArr[11] - e12) - ((int) (-(r1 >> 32))));
                                                                                    jArr[12] = g((jArr[12] - e13) - ((int) (-(r3 >> 32))));
                                                                                    jArr[13] = g((jArr[13] - e14) - ((int) (-(r1 >> 32))));
                                                                                    jArr[14] = g((jArr[14] - e15) - ((int) (-(r3 >> 32))));
                                                                                    long j116 = (jArr[15] - e16) - ((int) (-(r1 >> 32)));
                                                                                    jArr[15] = g(j116);
                                                                                    if (((int) (-(j116 >> 32))) == 0) {
                                                                                        jArr[0] = g(jArr[0] - e);
                                                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                                                        jArr[8] = g((jArr[8] - e9) - ((int) (-(r3 >> 32))));
                                                                                        jArr[9] = g((jArr[9] - e10) - ((int) (-(r1 >> 32))));
                                                                                        jArr[10] = g((jArr[10] - e11) - ((int) (-(r3 >> 32))));
                                                                                        jArr[11] = g((jArr[11] - e12) - ((int) (-(r1 >> 32))));
                                                                                        jArr[12] = g((jArr[12] - e13) - ((int) (-(r3 >> 32))));
                                                                                        jArr[13] = g((jArr[13] - e14) - ((int) (-(r1 >> 32))));
                                                                                        jArr[14] = g((jArr[14] - e15) - ((int) (-(r3 >> 32))));
                                                                                        jArr[15] = g((jArr[15] - e16) - ((int) (-(r1 >> 32))));
                                                                                    }
                                                                                }
                                                                            }
                                                                            j2 = jArr[15];
                                                                            if (j2 != e16) {
                                                                                long j117 = jArr[14];
                                                                                if (j117 == e15) {
                                                                                    long j118 = jArr[13];
                                                                                    if (j118 == e14) {
                                                                                        long j119 = jArr[12];
                                                                                        if (j119 == e13) {
                                                                                            long j120 = jArr[11];
                                                                                            if (j120 == e12) {
                                                                                                long j121 = jArr[10];
                                                                                                if (j121 == e11) {
                                                                                                    long j122 = jArr[9];
                                                                                                    if (j122 == e10) {
                                                                                                        long j123 = jArr[8];
                                                                                                        if (j123 == e9) {
                                                                                                            long j124 = jArr[7];
                                                                                                            if (j124 == e8) {
                                                                                                                long j125 = jArr[6];
                                                                                                                if (j125 == e7) {
                                                                                                                    long j126 = jArr[5];
                                                                                                                    if (j126 == e6) {
                                                                                                                        long j127 = jArr[4];
                                                                                                                        if (j127 == e5) {
                                                                                                                            long j128 = jArr[3];
                                                                                                                            if (j128 == e4) {
                                                                                                                                long j129 = jArr[2];
                                                                                                                                if (j129 == e3) {
                                                                                                                                    long j130 = jArr[1];
                                                                                                                                    if (j130 == e2) {
                                                                                                                                        long j131 = jArr[0];
                                                                                                                                        if (j131 != e) {
                                                                                                                                        }
                                                                                                                                        jArr[0] = g(jArr[0] - e);
                                                                                                                                        jArr[1] = g((jArr[1] - e2) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[2] = g((jArr[2] - e3) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[3] = g((jArr[3] - e4) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[4] = g((jArr[4] - e5) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[5] = g((jArr[5] - e6) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[6] = g((jArr[6] - e7) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[7] = g((jArr[7] - e8) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[8] = g((jArr[8] - e9) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[9] = g((jArr[9] - e10) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[10] = g((jArr[10] - e11) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[11] = g((jArr[11] - e12) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[12] = g((jArr[12] - e13) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[13] = g((jArr[13] - e14) - ((int) (-(r1 >> 32))));
                                                                                                                                        jArr[14] = g((jArr[14] - e15) - ((int) (-(r3 >> 32))));
                                                                                                                                        jArr[15] = g((jArr[15] - e16) - ((int) (-(r1 >> 32))));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i2 = 0;
            jArr[0] = g(jArr[0] - g21);
            jArr[1] = g((jArr[1] - g22) - ((int) (-(r70 >> 32))));
            jArr[2] = g((jArr[2] - g23) - ((int) (-(r72 >> 32))));
            jArr[3] = g((jArr[3] - g24) - ((int) (-(r10 >> 32))));
            jArr[4] = g((jArr[4] - g25) - ((int) (-(r2 >> 32))));
            jArr[5] = g((jArr[5] - g26) - ((int) (-(r10 >> 32))));
            jArr[6] = g((jArr[6] - g27) - ((int) (-(r2 >> 32))));
            jArr[7] = g((jArr[7] - g28) - ((int) (-(r10 >> 32))));
            jArr[8] = g((jArr[8] - g29) - ((int) (-(r2 >> 32))));
            jArr[9] = g((jArr[9] - g30) - ((int) (-(r10 >> 32))));
            jArr[10] = g((jArr[10] - g31) - ((int) (-(r2 >> 32))));
            jArr[11] = g((jArr[11] - g32) - ((int) (-(r10 >> 32))));
            jArr[12] = g((jArr[12] - g33) - ((int) (-(r2 >> 32))));
            jArr[13] = g((jArr[13] - g34) - ((int) (-(r10 >> 32))));
            jArr[14] = g((jArr[14] - g35) - ((int) (-(r2 >> 32))));
            j = (jArr[15] - g36) - ((int) (-(r10 >> 32)));
            jArr[15] = g(j);
            if (i2 != ((int) (-(j >> 32)))) {
            }
            j2 = jArr[15];
            if (j2 != e16) {
            }
        } else if (i == 2) {
            l(jArr, iArr, iArr4);
            return;
        }
        long j132 = jArr[15];
        if (j132 == e16) {
            long j133 = jArr[14];
            if (j133 == e15) {
                long j134 = jArr[13];
                if (j134 == e14) {
                    long j135 = jArr[12];
                    if (j135 == e13) {
                        long j136 = jArr[11];
                        if (j136 == e12) {
                            long j137 = jArr[10];
                            if (j137 == e11) {
                                long j138 = jArr[9];
                                if (j138 == e10) {
                                    long j139 = jArr[8];
                                    if (j139 == e9) {
                                        long j140 = jArr[7];
                                        if (j140 == e8) {
                                            long j141 = jArr[6];
                                            if (j141 == e7) {
                                                long j142 = jArr[5];
                                                if (j142 == e6) {
                                                    long j143 = jArr[4];
                                                    if (j143 == e5) {
                                                        long j144 = jArr[3];
                                                        if (j144 == e4) {
                                                            long j145 = jArr[2];
                                                            if (j145 == e3) {
                                                                long j146 = jArr[1];
                                                                if (j146 == e2) {
                                                                    long j147 = jArr[0];
                                                                    if (j147 != e) {
                                                                    }
                                                                    iArr[0] = (int) (jArr[0] - e);
                                                                    iArr[1] = (int) ((jArr[1] - e2) - ((int) (-(r3 >> 32))));
                                                                    iArr[2] = (int) ((jArr[2] - e3) - ((int) (-(r5 >> 32))));
                                                                    iArr[3] = (int) ((jArr[3] - e4) - ((int) (-(r3 >> 32))));
                                                                    iArr[4] = (int) ((jArr[4] - e5) - ((int) (-(r5 >> 32))));
                                                                    iArr[5] = (int) ((jArr[5] - e6) - ((int) (-(r3 >> 32))));
                                                                    iArr[6] = (int) ((jArr[6] - e7) - ((int) (-(r5 >> 32))));
                                                                    iArr[7] = (int) ((jArr[7] - e8) - ((int) (-(r3 >> 32))));
                                                                    iArr[8] = (int) ((jArr[8] - e9) - ((int) (-(r5 >> 32))));
                                                                    iArr[9] = (int) ((jArr[9] - e10) - ((int) (-(r3 >> 32))));
                                                                    iArr[10] = (int) ((jArr[10] - e11) - ((int) (-(r5 >> 32))));
                                                                    iArr[11] = (int) ((jArr[11] - e12) - ((int) (-(r3 >> 32))));
                                                                    iArr[12] = (int) ((jArr[12] - e13) - ((int) (-(r5 >> 32))));
                                                                    iArr[13] = (int) ((jArr[13] - e14) - ((int) (-(r3 >> 32))));
                                                                    iArr[14] = (int) ((jArr[14] - e15) - ((int) (-(r5 >> 32))));
                                                                    iArr[15] = (int) ((j132 - e16) - ((int) (-(r3 >> 32))));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void q(long[] jArr, long[] jArr2) {
        long j = 1;
        long j2 = (m(-1L, jArr[0]) || m(~jArr2[0], jArr[0])) ? 1L : 0L;
        jArr[0] = jArr[0] + jArr2[0];
        long j3 = (m(~j2, jArr[1]) || m(~jArr2[1], jArr[1] + j2)) ? 1L : 0L;
        jArr[1] = jArr[1] + jArr2[1] + j2;
        long j4 = (m(~j3, jArr[2]) || m(~jArr2[2], jArr[2] + j3)) ? 1L : 0L;
        jArr[2] = jArr[2] + jArr2[2] + j3;
        long j5 = (m(~j4, jArr[3]) || m(~jArr2[3], jArr[3] + j4)) ? 1L : 0L;
        jArr[3] = jArr[3] + jArr2[3] + j4;
        long j6 = (m(~j5, jArr[4]) || m(~jArr2[4], jArr[4] + j5)) ? 1L : 0L;
        jArr[4] = jArr[4] + jArr2[4] + j5;
        long j7 = (m(~j6, jArr[5]) || m(~jArr2[5], jArr[5] + j6)) ? 1L : 0L;
        jArr[5] = jArr[5] + jArr2[5] + j6;
        long j8 = (m(~j7, jArr[6]) || m(~jArr2[6], jArr[6] + j7)) ? 1L : 0L;
        jArr[6] = jArr[6] + jArr2[6] + j7;
        long j9 = ~j8;
        long j10 = ~jArr2[7];
        if (!m(j9, jArr[7]) && !m(j10, jArr[7] + j8)) {
            j = 0;
        }
        jArr[7] = jArr[7] + jArr2[7] + j8;
        jArr[8] = jArr[8] + jArr2[8] + j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03da, code lost:
    
        if (r2 != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03dc, code lost:
    
        r79 = r0;
        r39 = r3;
        r41 = r11;
        r11 = r65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0855, code lost:
    
        if (m(r114, r8) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0857, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x096b, code lost:
    
        if (m(r14, r1) != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x094d, code lost:
    
        r16 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x094a, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0960, code lost:
    
        if (m(r10, r8) != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0948, code lost:
    
        if (m(0, r3) != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x085a, code lost:
    
        r2 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0873, code lost:
    
        if (m(r10, r6) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x087e, code lost:
    
        if (m(r14, r0) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0889, code lost:
    
        if (m(r12, r4) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x03e8, code lost:
    
        r39 = r11;
        r11 = r65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x040a, code lost:
    
        if (r2 != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0423, code lost:
    
        if (r2 != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0436, code lost:
    
        if (r2 != false) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x09a6 -> B:232:0x0867). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        char c;
        char c2;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long f = f(iArr2[1], iArr2[0]);
        long f2 = f(iArr2[3], iArr2[2]);
        long f3 = f(iArr2[5], iArr2[4]);
        long f4 = f(iArr2[7], iArr2[6]);
        long f5 = f(iArr3[1], iArr3[0]);
        long f6 = f(iArr3[3], iArr3[2]);
        long f7 = f(iArr3[5], iArr3[4]);
        long f8 = f(iArr3[7], iArr3[6]);
        long j34 = f5;
        long j35 = f6;
        long j36 = f2;
        long j37 = f7;
        long j38 = f3;
        long j39 = f8;
        long j40 = f4;
        long j41 = f;
        long j42 = 1;
        long j43 = 1;
        long j44 = 0;
        long j45 = 0;
        long j46 = 0;
        long j47 = 0;
        long j48 = 0;
        long j49 = 0;
        long j50 = 0;
        long j51 = 0;
        long j52 = 0;
        long j53 = 0;
        long j54 = 0;
        long j55 = 0;
        long j56 = 0;
        long j57 = 0;
        long j58 = 0;
        long j59 = 0;
        long j60 = 0;
        long j61 = 0;
        long j62 = 0;
        long j63 = 0;
        long j64 = 0;
        while (true) {
            long j65 = f8;
            if ((j41 & 1) == j44) {
                j41 = (j36 << 63) | (j41 >>> 1);
                j36 = (j38 << 63) | (j36 >>> 1);
                j38 = (j40 << 63) | (j38 >>> 1);
                j40 = (j50 << 63) | (j40 >>> 1);
                j50 >>= 1;
                if ((j42 & 1) == j44 && (j52 & 1) == j44) {
                    j32 = j42;
                    j33 = j65;
                } else {
                    long j66 = j46;
                    int i = (m(-1L, j42) || m(~f5, j42)) ? 1 : 0;
                    long j67 = j42 + f5;
                    int i2 = (m((long) (~i), j45) || m(~f6, ((long) i) + j45)) ? 1 : 0;
                    long j68 = j45 + f6 + i;
                    j32 = j67;
                    int i3 = (m((long) (~i2), j66) || m(~f7, ((long) i2) + j66)) ? 1 : 0;
                    long j69 = i2 + j66 + f7;
                    j33 = j65;
                    long j70 = j64;
                    int i4 = (m((long) (~i3), j70) || m(~j33, ((long) i3) + j70)) ? 1 : 0;
                    long j71 = j70 + j33 + i3;
                    j54 += i4;
                    long j72 = j52;
                    int i5 = (m(j72, j72) || m(j72, j72 - f)) ? 1 : 0;
                    long j73 = j72 - f;
                    long j74 = i5;
                    long j75 = j56;
                    long j76 = j75 - j74;
                    j64 = j71;
                    int i6 = (m(j75, j76) || m(j76, j76 - f2)) ? 1 : 0;
                    long j77 = (j75 - f2) - j74;
                    long j78 = i6;
                    long j79 = j58;
                    long j80 = j79 - j78;
                    j58 = (j79 - f3) - j78;
                    long j81 = (m(j79, j80) || m(j80, j80 - f3)) ? 1 : 0;
                    long j82 = j60;
                    long j83 = j82 - j81;
                    j60 = (j82 - f4) - j81;
                    j62 -= (m(j82, j83) || m(j83, j83 - f4)) ? 1 : 0;
                    j56 = j77;
                    j52 = j73;
                    j46 = j69;
                    j45 = j68;
                }
                long j84 = (j45 << 63) | (j32 >>> 1);
                j45 = (j46 << 63) | (j45 >>> 1);
                j46 = (j64 << 63) | (j46 >>> 1);
                j64 = (j54 << 63) | (j64 >>> 1);
                j54 >>= 1;
                j52 = (j56 << 63) | (j52 >>> 1);
                j56 = (j58 << 63) | (j56 >>> 1);
                j58 = (j60 << 63) | (j58 >>> 1);
                j60 = (j62 << 63) | (j60 >>> 1);
                j62 >>= 1;
                j21 = j84;
                f8 = j33;
            } else {
                long j85 = j46;
                long j86 = j42;
                long j87 = j56;
                long j88 = j52;
                long j89 = j64;
                long j90 = j47;
                long j91 = j45;
                long j92 = j48;
                long j93 = j49;
                long j94 = j90;
                long j95 = j51;
                long j96 = j53;
                long j97 = j57;
                long j98 = j59;
                long j99 = j61;
                long j100 = j37;
                long j101 = j39;
                long j102 = j43;
                long j103 = j34;
                long j104 = j65;
                long j105 = j35;
                while ((j103 & 1) == j44) {
                    j103 = (j105 << 63) | (j103 >>> 1);
                    long j106 = (j100 << 63) | (j105 >>> 1);
                    j100 = (j101 << 63) | (j100 >>> 1);
                    j101 = (j94 << 63) | (j101 >>> 1);
                    j94 >>= 1;
                    if ((j92 & 1) == j44 && (j102 & 1) == j44) {
                        j28 = f5;
                        j27 = j106;
                        j31 = j104;
                        j30 = j102;
                        j29 = f7;
                    } else {
                        j27 = j106;
                        j28 = f5;
                        int i7 = (m(-1L, j92) || m(~f5, j92)) ? 1 : 0;
                        long j107 = j92 + j28;
                        int i8 = (m((long) (~i7), j93) || m(~f6, ((long) i7) + j93)) ? 1 : 0;
                        j93 = j93 + f6 + i7;
                        int i9 = (m((long) (~i8), j95) || m(~f7, ((long) i8) + j95)) ? 1 : 0;
                        j95 = j95 + f7 + i8;
                        long j108 = j104;
                        j29 = f7;
                        long j109 = j96;
                        j96 = j109 + j108 + i9;
                        j55 += (m((long) (~i9), j109) || m(~j108, ((long) i9) + j109)) ? 1 : 0;
                        long j110 = j102;
                        j30 = j110 - f;
                        long j111 = (m(j110, j110) || m(j110, j110 - f)) ? 1 : 0;
                        long j112 = j97;
                        long j113 = j112 - j111;
                        j31 = j108;
                        j97 = (j112 - f2) - j111;
                        long j114 = (m(j112, j113) || m(j113, j113 - f2)) ? 1 : 0;
                        long j115 = j98;
                        long j116 = j115 - j114;
                        j98 = (j115 - f3) - j114;
                        long j117 = (m(j115, j116) || m(j116, j116 - f3)) ? 1 : 0;
                        long j118 = j99;
                        long j119 = j118 - j117;
                        j99 = (j118 - f4) - j117;
                        j63 -= (m(j118, j119) || m(j119, j119 - f4)) ? 1 : 0;
                        j92 = j107;
                    }
                    j92 = (j93 << 63) | (j92 >>> 1);
                    j93 = (j93 >>> 1) | (j95 << 63);
                    j95 = (j96 << 63) | (j95 >>> 1);
                    j96 = (j55 << 63) | (j96 >>> 1);
                    j55 >>= 1;
                    j102 = (j97 << 63) | (j30 >>> 1);
                    j97 = (j98 << 63) | (j97 >>> 1);
                    j98 = (j99 << 63) | (j98 >>> 1);
                    j99 = (j63 << 63) | (j99 >>> 1);
                    j63 >>= 1;
                    f7 = j29;
                    j105 = j27;
                    f5 = j28;
                    j104 = j31;
                }
                j = f5;
                j2 = j104;
                long j120 = j102;
                long j121 = j98;
                long j122 = j99;
                j3 = f6;
                j4 = f7;
                long j123 = j96;
                long j124 = j97;
                long j125 = j94;
                long j126 = j50;
                if (j50 != j94) {
                    boolean m = m(j125, j126);
                    long j127 = j101;
                    j5 = j126;
                    j6 = j127;
                    long j128 = j100;
                    j53 = j123;
                    j8 = j128;
                    j7 = j125;
                    j14 = j41;
                } else {
                    long j129 = j101;
                    j5 = j126;
                    j6 = j129;
                    j7 = j125;
                    long j130 = j40;
                    if (j40 != j101) {
                        boolean m2 = m(j6, j130);
                        long j131 = j100;
                        j53 = j123;
                        j8 = j131;
                        j40 = j130;
                        j14 = j41;
                    } else {
                        long j132 = j100;
                        j53 = j123;
                        j8 = j132;
                        j40 = j130;
                        long j133 = j38;
                        if (j38 != j100) {
                            boolean m3 = m(j8, j133);
                            j38 = j133;
                            j14 = j41;
                        } else {
                            j38 = j133;
                            long j134 = j36;
                            if (j36 != j105) {
                                boolean m4 = m(j105, j134);
                                j36 = j134;
                                j14 = j41;
                            } else {
                                j36 = j134;
                                if (j41 != j103) {
                                    j14 = j41;
                                    long j135 = j95;
                                    j10 = j103;
                                    if (m(j10, j14)) {
                                        j13 = j120;
                                        j9 = j135;
                                        j11 = j92;
                                        j12 = j121;
                                        long j136 = j12;
                                        long j137 = j14 - j10;
                                        long j138 = (!m(j14, j14) || m(j14, j14 - j10)) ? 1 : 0;
                                        long j139 = j36 - j138;
                                        long j140 = (j36 - j105) - j138;
                                        long j141 = (!m(j36, j139) || m(j139, j139 - j105)) ? 1 : 0;
                                        long j142 = j38 - j141;
                                        long j143 = (j38 - j8) - j141;
                                        long j144 = (!m(j38, j142) || m(j142, j142 - j8)) ? 1 : 0;
                                        long j145 = j40 - j144;
                                        long j146 = (j40 - j6) - j144;
                                        long j147 = (j5 - j7) - ((!m(j40, j145) || m(j145, j145 - j6)) ? 1 : 0);
                                        long j148 = j86 - j11;
                                        long j149 = (!m(j86, j86) || m(j86, j86 - j11)) ? 1 : 0;
                                        long j150 = j91 - j149;
                                        long j151 = (j91 - j93) - j149;
                                        long j152 = (!m(j91, j150) || m(j150, j150 - j93)) ? 1 : 0;
                                        long j153 = j85 - j152;
                                        long j154 = (j85 - j9) - j152;
                                        long j155 = (!m(j85, j153) || m(j153, j153 - j9)) ? 1 : 0;
                                        long j156 = j89 - j155;
                                        long j157 = (j89 - j53) - j155;
                                        j54 = (j54 - j55) - ((!m(j89, j156) || m(j156, j156 - j53)) ? 1 : 0);
                                        long j158 = j88 - j13;
                                        long j159 = (!m(j88, j88) || m(j88, j88 - j13)) ? 1 : 0;
                                        long j160 = j87 - j159;
                                        long j161 = (j87 - j124) - j159;
                                        long j162 = (!m(j87, j160) || m(j160, j160 - j124)) ? 1 : 0;
                                        long j163 = j58 - j162;
                                        int i10 = (!m(j58, j163) || m(j163, j163 - j136)) ? 1 : 0;
                                        j58 = (j58 - j136) - j162;
                                        long j164 = i10;
                                        long j165 = j60 - j164;
                                        int i11 = (!m(j60, j165) || m(j165, j165 - j122)) ? 1 : 0;
                                        j60 = (j60 - j122) - j164;
                                        j62 = (j62 - j63) - i11;
                                        j15 = j6;
                                        j20 = j157;
                                        j52 = j158;
                                        j56 = j161;
                                        j17 = j9;
                                        j45 = j151;
                                        j16 = j136;
                                        j49 = j93;
                                        j46 = j154;
                                        j47 = j7;
                                        j40 = j146;
                                        j57 = j124;
                                        j50 = j147;
                                        j48 = j11;
                                        j41 = j137;
                                        j43 = j13;
                                        j37 = j8;
                                        j19 = j10;
                                        j18 = j148;
                                        j38 = j143;
                                        j36 = j140;
                                        j61 = j122;
                                        j35 = j105;
                                        if (j50 != j44 && j40 == j44 && j38 == j44 && j36 == j44 && j41 == j44) {
                                            break;
                                        }
                                        long j166 = j20;
                                        long j167 = j19;
                                        f8 = j2;
                                        f7 = j4;
                                        j64 = j166;
                                        j59 = j16;
                                        j44 = 0;
                                        j21 = j18;
                                        j51 = j17;
                                        f5 = j;
                                        j39 = j15;
                                        j34 = j167;
                                        f6 = j3;
                                    }
                                    long j168 = j14;
                                    long j169 = j10 - j168;
                                    long j170 = (m(j10, j10) || m(j10, j10 - j168)) ? 1 : 0;
                                    long j171 = j105 - j170;
                                    int i12 = (m(j105, j171) || m(j171, j171 - j36)) ? 1 : 0;
                                    j105 = (j105 - j36) - j170;
                                    long j172 = i12;
                                    long j173 = j8 - j172;
                                    long j174 = (j8 - j38) - j172;
                                    long j175 = (m(j8, j173) || m(j173, j173 - j38)) ? 1 : 0;
                                    long j176 = j6 - j175;
                                    long j177 = (j6 - j40) - j175;
                                    long j178 = (j7 - j5) - ((m(j6, j176) || m(j176, j176 - j40)) ? 1 : 0);
                                    int i13 = (m(j92, j92) || m(j92, j92 - j86)) ? 1 : 0;
                                    long j179 = j92 - j86;
                                    long j180 = i13;
                                    long j181 = j93 - j180;
                                    j15 = j177;
                                    int i14 = (m(j93, j181) || m(j181, j181 - j91)) ? 1 : 0;
                                    long j182 = (j93 - j91) - j180;
                                    long j183 = i14;
                                    long j184 = j135 - j183;
                                    long j185 = j135;
                                    int i15 = (m(j185, j184) || m(j184, j184 - j85)) ? 1 : 0;
                                    long j186 = (j185 - j85) - j183;
                                    long j187 = i15;
                                    long j188 = j53 - j187;
                                    long j189 = (j53 - j89) - j187;
                                    j55 = (j55 - j54) - ((m(j53, j188) || m(j188, j188 - j89)) ? 1 : 0);
                                    int i16 = (m(j120, j120) || m(j120, j120 - j88)) ? 1 : 0;
                                    long j190 = j120 - j88;
                                    long j191 = i16;
                                    long j192 = j124 - j191;
                                    long j193 = (j124 - j87) - j191;
                                    long j194 = (m(j124, j192) || m(j192, j192 - j87)) ? 1 : 0;
                                    long j195 = j121 - j194;
                                    j16 = (j121 - j58) - j194;
                                    long j196 = (m(j121, j195) || m(j195, j195 - j58)) ? 1 : 0;
                                    long j197 = j122 - j196;
                                    long j198 = (j122 - j60) - j196;
                                    j63 = (j63 - j62) - ((m(j122, j197) || m(j197, j197 - j60)) ? 1 : 0);
                                    j17 = j186;
                                    j45 = j91;
                                    j18 = j86;
                                    j48 = j179;
                                    j50 = j5;
                                    j19 = j169;
                                    j37 = j174;
                                    j53 = j189;
                                    j57 = j193;
                                    j47 = j178;
                                    j49 = j182;
                                    j43 = j190;
                                    j20 = j89;
                                    j52 = j88;
                                    j41 = j168;
                                    j56 = j87;
                                    j46 = j85;
                                    j61 = j198;
                                    j35 = j105;
                                    if (j50 != j44) {
                                    }
                                    long j1662 = j20;
                                    long j1672 = j19;
                                    f8 = j2;
                                    f7 = j4;
                                    j64 = j1662;
                                    j59 = j16;
                                    j44 = 0;
                                    j21 = j18;
                                    j51 = j17;
                                    f5 = j;
                                    j39 = j15;
                                    j34 = j1672;
                                    f6 = j3;
                                } else {
                                    j9 = j95;
                                    j10 = j103;
                                    long j199 = j41;
                                    j11 = j92;
                                    j12 = j121;
                                    j13 = j120;
                                    j14 = j199;
                                    long j1362 = j12;
                                    long j1372 = j14 - j10;
                                    long j1382 = (!m(j14, j14) || m(j14, j14 - j10)) ? 1 : 0;
                                    long j1392 = j36 - j1382;
                                    long j1402 = (j36 - j105) - j1382;
                                    long j1412 = (!m(j36, j1392) || m(j1392, j1392 - j105)) ? 1 : 0;
                                    long j1422 = j38 - j1412;
                                    long j1432 = (j38 - j8) - j1412;
                                    long j1442 = (!m(j38, j1422) || m(j1422, j1422 - j8)) ? 1 : 0;
                                    long j1452 = j40 - j1442;
                                    long j1462 = (j40 - j6) - j1442;
                                    long j1472 = (j5 - j7) - ((!m(j40, j1452) || m(j1452, j1452 - j6)) ? 1 : 0);
                                    long j1482 = j86 - j11;
                                    long j1492 = (!m(j86, j86) || m(j86, j86 - j11)) ? 1 : 0;
                                    long j1502 = j91 - j1492;
                                    long j1512 = (j91 - j93) - j1492;
                                    long j1522 = (!m(j91, j1502) || m(j1502, j1502 - j93)) ? 1 : 0;
                                    long j1532 = j85 - j1522;
                                    long j1542 = (j85 - j9) - j1522;
                                    long j1552 = (!m(j85, j1532) || m(j1532, j1532 - j9)) ? 1 : 0;
                                    long j1562 = j89 - j1552;
                                    long j1572 = (j89 - j53) - j1552;
                                    j54 = (j54 - j55) - ((!m(j89, j1562) || m(j1562, j1562 - j53)) ? 1 : 0);
                                    long j1582 = j88 - j13;
                                    long j1592 = (!m(j88, j88) || m(j88, j88 - j13)) ? 1 : 0;
                                    long j1602 = j87 - j1592;
                                    long j1612 = (j87 - j124) - j1592;
                                    long j1622 = (!m(j87, j1602) || m(j1602, j1602 - j124)) ? 1 : 0;
                                    long j1632 = j58 - j1622;
                                    if (m(j58, j1632)) {
                                    }
                                    j58 = (j58 - j1362) - j1622;
                                    long j1642 = i10;
                                    long j1652 = j60 - j1642;
                                    if (m(j60, j1652)) {
                                    }
                                    j60 = (j60 - j122) - j1642;
                                    j62 = (j62 - j63) - i11;
                                    j15 = j6;
                                    j20 = j1572;
                                    j52 = j1582;
                                    j56 = j1612;
                                    j17 = j9;
                                    j45 = j1512;
                                    j16 = j1362;
                                    j49 = j93;
                                    j46 = j1542;
                                    j47 = j7;
                                    j40 = j1462;
                                    j57 = j124;
                                    j50 = j1472;
                                    j48 = j11;
                                    j41 = j1372;
                                    j43 = j13;
                                    j37 = j8;
                                    j19 = j10;
                                    j18 = j1482;
                                    j38 = j1432;
                                    j36 = j1402;
                                    j61 = j122;
                                    j35 = j105;
                                    if (j50 != j44) {
                                    }
                                    long j16622 = j20;
                                    long j16722 = j19;
                                    f8 = j2;
                                    f7 = j4;
                                    j64 = j16622;
                                    j59 = j16;
                                    j44 = 0;
                                    j21 = j18;
                                    j51 = j17;
                                    f5 = j;
                                    j39 = j15;
                                    j34 = j16722;
                                    f6 = j3;
                                }
                            }
                        }
                    }
                }
            }
            j42 = j21;
        }
        long j200 = j48;
        long j201 = j49;
        long j202 = j53;
        long j203 = j55;
        while (j203 < j44) {
            int i17 = (m(-1L, j200) || m(~j, j200)) ? 1 : 0;
            long j204 = j200 + j;
            long j205 = j3;
            int i18 = (m((long) (~i17), j201) || m(~j205, ((long) i17) + j201)) ? 1 : 0;
            long j206 = j201 + j205 + i17;
            long j207 = j4;
            int i19 = (m((long) (~i18), j17) || m(~j207, ((long) i18) + j17)) ? 1 : 0;
            long j208 = j17 + j207 + i18;
            long j209 = j2;
            int i20 = (m((long) (~i19), j202) || m(~j209, ((long) i19) + j202)) ? 1 : 0;
            j202 = j202 + j209 + i19;
            j203 += i20;
            j2 = j209;
            j3 = j205;
            j4 = j207;
            j200 = j204;
            j201 = j206;
            j17 = j208;
        }
        long j210 = j4;
        long j211 = j3;
        long j212 = j2;
        long j213 = j200;
        if (j203 == j44) {
            if (j202 == j212) {
                if (j17 == j210) {
                    if (j201 == j211) {
                        if (j213 != j) {
                            long j214 = j17;
                            j22 = j;
                            c = m(j22, j213) ? (char) 1 : (char) 65535;
                            long j215 = j201;
                            j23 = j213;
                            j17 = j214;
                            j24 = j203;
                            j25 = j202;
                            j26 = j215;
                        } else {
                            j22 = j;
                            long j216 = j201;
                            j23 = j213;
                            j17 = j17;
                            j24 = j203;
                            j25 = j202;
                            j26 = j216;
                            c = 0;
                        }
                        while (c >= 0) {
                            j = j22;
                            int i21 = (m(j23, j23) || m(j23, j23 - j)) ? 1 : 0;
                            long j217 = j23 - j;
                            long j218 = i21;
                            long j219 = j26 - j218;
                            long j220 = j26;
                            int i22 = (m(j26, j219) || m(j219, j219 - j211)) ? 1 : 0;
                            long j221 = (j220 - j211) - j218;
                            long j222 = i22;
                            long j223 = j17 - j222;
                            long j224 = (j17 - j210) - j222;
                            long j225 = (m(j17, j223) || m(j223, j223 - j210)) ? 1 : 0;
                            long j226 = j25 - j225;
                            long j227 = j25;
                            int i23 = (m(j25, j226) || m(j226, j226 - j212)) ? 1 : 0;
                            j25 = (j227 - j212) - j225;
                            long j228 = j24 - i23;
                            if (j228 == 0) {
                                if (j25 == j212) {
                                    if (j224 == j210) {
                                        if (j221 != j211) {
                                            c = m(j211, j221) ? (char) 1 : (char) 65535;
                                            j17 = j224;
                                            j24 = j228;
                                            j26 = j221;
                                            j23 = j217;
                                        } else if (j217 != j) {
                                            c = m(j, j217) ? (char) 1 : (char) 65535;
                                            j26 = j221;
                                            j23 = j217;
                                            j22 = j;
                                            j17 = j224;
                                            j24 = j228;
                                        } else {
                                            j26 = j221;
                                            c = 0;
                                            j17 = j224;
                                            j24 = j228;
                                            j23 = j217;
                                        }
                                        j22 = j;
                                        while (c >= 0) {
                                        }
                                    }
                                }
                            }
                            j17 = j224;
                            j26 = j221;
                            j24 = j228;
                            j23 = j217;
                            j22 = j;
                            while (c >= 0) {
                            }
                        }
                        long j229 = j17;
                        long j230 = j23;
                        long j231 = j26;
                        long j232 = j25;
                        iArr[0] = (int) j230;
                        iArr[1] = (int) (j230 >>> 32);
                        iArr[2] = (int) j231;
                        iArr[3] = (int) (j231 >>> 32);
                        iArr[4] = (int) j229;
                        iArr[5] = (int) (j229 >>> 32);
                        iArr[6] = (int) j232;
                        iArr[7] = (int) (j232 >>> 32);
                    }
                }
            }
        }
        long j233 = j202;
        j26 = j201;
        j23 = j213;
        j24 = j203;
        j25 = j233;
        c = c2;
        j22 = j;
        while (c >= 0) {
        }
        long j2292 = j17;
        long j2302 = j23;
        long j2312 = j26;
        long j2322 = j25;
        iArr[0] = (int) j2302;
        iArr[1] = (int) (j2302 >>> 32);
        iArr[2] = (int) j2312;
        iArr[3] = (int) (j2312 >>> 32);
        iArr[4] = (int) j2292;
        iArr[5] = (int) (j2292 >>> 32);
        iArr[6] = (int) j2322;
        iArr[7] = (int) (j2322 >>> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(long[] jArr, long[] jArr2) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15 = jArr[0];
        long j16 = 1;
        if (!m(j15, j15)) {
            long j17 = jArr[0];
            if (!m(j17, j17 - jArr2[0])) {
                j = 0;
                jArr[0] = jArr[0] - jArr2[0];
                j2 = jArr[1];
                if (!m(j2, j2 - j)) {
                    long j18 = jArr[1] - j;
                    if (!m(j18, j18 - jArr2[1])) {
                        j3 = 0;
                        jArr[1] = (jArr[1] - jArr2[1]) - j;
                        j4 = jArr[2];
                        if (!m(j4, j4 - j3)) {
                            long j19 = jArr[2] - j3;
                            if (!m(j19, j19 - jArr2[2])) {
                                j5 = 0;
                                jArr[2] = (jArr[2] - jArr2[2]) - j3;
                                j6 = jArr[3];
                                if (!m(j6, j6 - j5)) {
                                    long j20 = jArr[3] - j5;
                                    if (!m(j20, j20 - jArr2[3])) {
                                        j7 = 0;
                                        jArr[3] = (jArr[3] - jArr2[3]) - j5;
                                        j8 = jArr[4];
                                        if (!m(j8, j8 - j7)) {
                                            long j21 = jArr[4] - j7;
                                            if (!m(j21, j21 - jArr2[4])) {
                                                j9 = 0;
                                                jArr[4] = (jArr[4] - jArr2[4]) - j7;
                                                j10 = jArr[5];
                                                if (!m(j10, j10 - j9)) {
                                                    long j22 = jArr[5] - j9;
                                                    if (!m(j22, j22 - jArr2[5])) {
                                                        j11 = 0;
                                                        jArr[5] = (jArr[5] - jArr2[5]) - j9;
                                                        j12 = jArr[6];
                                                        if (!m(j12, j12 - j11)) {
                                                            long j23 = jArr[6] - j11;
                                                            if (!m(j23, j23 - jArr2[6])) {
                                                                j13 = 0;
                                                                jArr[6] = (jArr[6] - jArr2[6]) - j11;
                                                                j14 = jArr[7];
                                                                if (!m(j14, j14 - j13)) {
                                                                    long j24 = jArr[7] - j13;
                                                                    if (!m(j24, j24 - jArr2[7])) {
                                                                        j16 = 0;
                                                                    }
                                                                }
                                                                jArr[7] = (jArr[7] - jArr2[7]) - j13;
                                                                jArr[8] = (jArr[8] - jArr2[8]) - j16;
                                                            }
                                                        }
                                                        j13 = 1;
                                                        jArr[6] = (jArr[6] - jArr2[6]) - j11;
                                                        j14 = jArr[7];
                                                        if (!m(j14, j14 - j13)) {
                                                        }
                                                        jArr[7] = (jArr[7] - jArr2[7]) - j13;
                                                        jArr[8] = (jArr[8] - jArr2[8]) - j16;
                                                    }
                                                }
                                                j11 = 1;
                                                jArr[5] = (jArr[5] - jArr2[5]) - j9;
                                                j12 = jArr[6];
                                                if (!m(j12, j12 - j11)) {
                                                }
                                                j13 = 1;
                                                jArr[6] = (jArr[6] - jArr2[6]) - j11;
                                                j14 = jArr[7];
                                                if (!m(j14, j14 - j13)) {
                                                }
                                                jArr[7] = (jArr[7] - jArr2[7]) - j13;
                                                jArr[8] = (jArr[8] - jArr2[8]) - j16;
                                            }
                                        }
                                        j9 = 1;
                                        jArr[4] = (jArr[4] - jArr2[4]) - j7;
                                        j10 = jArr[5];
                                        if (!m(j10, j10 - j9)) {
                                        }
                                        j11 = 1;
                                        jArr[5] = (jArr[5] - jArr2[5]) - j9;
                                        j12 = jArr[6];
                                        if (!m(j12, j12 - j11)) {
                                        }
                                        j13 = 1;
                                        jArr[6] = (jArr[6] - jArr2[6]) - j11;
                                        j14 = jArr[7];
                                        if (!m(j14, j14 - j13)) {
                                        }
                                        jArr[7] = (jArr[7] - jArr2[7]) - j13;
                                        jArr[8] = (jArr[8] - jArr2[8]) - j16;
                                    }
                                }
                                j7 = 1;
                                jArr[3] = (jArr[3] - jArr2[3]) - j5;
                                j8 = jArr[4];
                                if (!m(j8, j8 - j7)) {
                                }
                                j9 = 1;
                                jArr[4] = (jArr[4] - jArr2[4]) - j7;
                                j10 = jArr[5];
                                if (!m(j10, j10 - j9)) {
                                }
                                j11 = 1;
                                jArr[5] = (jArr[5] - jArr2[5]) - j9;
                                j12 = jArr[6];
                                if (!m(j12, j12 - j11)) {
                                }
                                j13 = 1;
                                jArr[6] = (jArr[6] - jArr2[6]) - j11;
                                j14 = jArr[7];
                                if (!m(j14, j14 - j13)) {
                                }
                                jArr[7] = (jArr[7] - jArr2[7]) - j13;
                                jArr[8] = (jArr[8] - jArr2[8]) - j16;
                            }
                        }
                        j5 = 1;
                        jArr[2] = (jArr[2] - jArr2[2]) - j3;
                        j6 = jArr[3];
                        if (!m(j6, j6 - j5)) {
                        }
                        j7 = 1;
                        jArr[3] = (jArr[3] - jArr2[3]) - j5;
                        j8 = jArr[4];
                        if (!m(j8, j8 - j7)) {
                        }
                        j9 = 1;
                        jArr[4] = (jArr[4] - jArr2[4]) - j7;
                        j10 = jArr[5];
                        if (!m(j10, j10 - j9)) {
                        }
                        j11 = 1;
                        jArr[5] = (jArr[5] - jArr2[5]) - j9;
                        j12 = jArr[6];
                        if (!m(j12, j12 - j11)) {
                        }
                        j13 = 1;
                        jArr[6] = (jArr[6] - jArr2[6]) - j11;
                        j14 = jArr[7];
                        if (!m(j14, j14 - j13)) {
                        }
                        jArr[7] = (jArr[7] - jArr2[7]) - j13;
                        jArr[8] = (jArr[8] - jArr2[8]) - j16;
                    }
                }
                j3 = 1;
                jArr[1] = (jArr[1] - jArr2[1]) - j;
                j4 = jArr[2];
                if (!m(j4, j4 - j3)) {
                }
                j5 = 1;
                jArr[2] = (jArr[2] - jArr2[2]) - j3;
                j6 = jArr[3];
                if (!m(j6, j6 - j5)) {
                }
                j7 = 1;
                jArr[3] = (jArr[3] - jArr2[3]) - j5;
                j8 = jArr[4];
                if (!m(j8, j8 - j7)) {
                }
                j9 = 1;
                jArr[4] = (jArr[4] - jArr2[4]) - j7;
                j10 = jArr[5];
                if (!m(j10, j10 - j9)) {
                }
                j11 = 1;
                jArr[5] = (jArr[5] - jArr2[5]) - j9;
                j12 = jArr[6];
                if (!m(j12, j12 - j11)) {
                }
                j13 = 1;
                jArr[6] = (jArr[6] - jArr2[6]) - j11;
                j14 = jArr[7];
                if (!m(j14, j14 - j13)) {
                }
                jArr[7] = (jArr[7] - jArr2[7]) - j13;
                jArr[8] = (jArr[8] - jArr2[8]) - j16;
            }
        }
        j = 1;
        jArr[0] = jArr[0] - jArr2[0];
        j2 = jArr[1];
        if (!m(j2, j2 - j)) {
        }
        j3 = 1;
        jArr[1] = (jArr[1] - jArr2[1]) - j;
        j4 = jArr[2];
        if (!m(j4, j4 - j3)) {
        }
        j5 = 1;
        jArr[2] = (jArr[2] - jArr2[2]) - j3;
        j6 = jArr[3];
        if (!m(j6, j6 - j5)) {
        }
        j7 = 1;
        jArr[3] = (jArr[3] - jArr2[3]) - j5;
        j8 = jArr[4];
        if (!m(j8, j8 - j7)) {
        }
        j9 = 1;
        jArr[4] = (jArr[4] - jArr2[4]) - j7;
        j10 = jArr[5];
        if (!m(j10, j10 - j9)) {
        }
        j11 = 1;
        jArr[5] = (jArr[5] - jArr2[5]) - j9;
        j12 = jArr[6];
        if (!m(j12, j12 - j11)) {
        }
        j13 = 1;
        jArr[6] = (jArr[6] - jArr2[6]) - j11;
        j14 = jArr[7];
        if (!m(j14, j14 - j13)) {
        }
        jArr[7] = (jArr[7] - jArr2[7]) - j13;
        jArr[8] = (jArr[8] - jArr2[8]) - j16;
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = {f(iArr2[1], iArr2[0]), f(iArr2[3], iArr2[2]), f(iArr2[5], iArr2[4]), f(iArr2[7], iArr2[6]), f(iArr2[9], iArr2[8]), f(iArr2[11], iArr2[10]), f(iArr2[13], iArr2[12]), f(iArr2[15], iArr2[14]), 0};
        long[] jArr6 = {f(iArr3[1], iArr3[0]), f(iArr3[3], iArr3[2]), f(iArr3[5], iArr3[4]), f(iArr3[7], iArr3[6]), f(iArr3[9], iArr3[8]), f(iArr3[11], iArr3[10]), f(iArr3[13], iArr3[12]), f(iArr3[15], iArr3[14]), 0};
        long[] jArr7 = {jArr5[0], jArr5[1], jArr5[2], jArr5[3], jArr5[4], jArr5[5], jArr5[6], jArr5[7], 0};
        long[] jArr8 = {jArr6[0], jArr6[1], jArr6[2], jArr6[3], jArr6[4], jArr6[5], jArr6[6], jArr6[7], 0};
        long j = 0;
        Arrays.fill(jArr, 0L);
        Arrays.fill(jArr2, 0L);
        Arrays.fill(jArr3, 0L);
        Arrays.fill(jArr4, 0L);
        jArr4[0] = 1;
        jArr[0] = 1;
        while (true) {
            if ((jArr7[0] & 1) != j) {
                while ((jArr8[0] & 1) == 0) {
                    k(jArr8);
                    if ((jArr3[0] & 1) != 0 || (jArr4[0] & 1) != 0) {
                        q(jArr3, jArr6);
                        s(jArr4, jArr5);
                    }
                    k(jArr3);
                    k(jArr4);
                }
                if (d(jArr7, jArr8) >= 0) {
                    s(jArr7, jArr8);
                    s(jArr, jArr3);
                    s(jArr2, jArr4);
                } else {
                    s(jArr8, jArr7);
                    s(jArr3, jArr);
                    s(jArr4, jArr2);
                }
                if (jArr7[8] == 0 && jArr7[7] == 0 && jArr7[6] == 0 && jArr7[5] == 0 && jArr7[4] == 0 && jArr7[3] == 0 && jArr7[2] == 0 && jArr7[1] == 0 && jArr7[0] == 0) {
                    break;
                } else {
                    j = 0;
                }
            } else {
                k(jArr7);
                if ((jArr[0] & 1) != j || (jArr2[0] & 1) != j) {
                    q(jArr, jArr6);
                    s(jArr2, jArr5);
                }
                k(jArr);
                k(jArr2);
                j = 0;
            }
        }
        while (jArr3[8] < 0) {
            q(jArr3, jArr6);
        }
        while (d(jArr3, jArr6) >= 0) {
            s(jArr3, jArr6);
        }
        long j2 = jArr3[0];
        iArr[0] = (int) j2;
        iArr[1] = (int) (j2 >>> 32);
        long j3 = jArr3[1];
        iArr[2] = (int) j3;
        iArr[3] = (int) (j3 >>> 32);
        long j4 = jArr3[2];
        iArr[4] = (int) j4;
        iArr[5] = (int) (j4 >>> 32);
        long j5 = jArr3[3];
        iArr[6] = (int) j5;
        iArr[7] = (int) (j5 >>> 32);
        long j6 = jArr3[4];
        iArr[8] = (int) j6;
        iArr[9] = (int) (j6 >>> 32);
        long j7 = jArr3[5];
        iArr[10] = (int) j7;
        iArr[11] = (int) (j7 >>> 32);
        long j8 = jArr3[6];
        iArr[12] = (int) j8;
        iArr[13] = (int) (j8 >>> 32);
        long j9 = jArr3[7];
        iArr[14] = (int) j9;
        iArr[15] = (int) (j9 >>> 32);
    }

    public static final f530 u(f530 f530Var, boolean z, zx40 zx40Var, jrv jrvVar, boolean z2, awk0 awk0Var, tls tlsVar) {
        f530 k;
        if (jrvVar instanceof prv) {
            k = new flz0(z, zx40Var, (prv) jrvVar, false, z2, awk0Var, tlsVar);
        } else if (jrvVar == null) {
            k = new flz0(z, zx40Var, null, false, z2, awk0Var, tlsVar);
        } else {
            c530 c530Var = c530.a;
            k = zx40Var != null ? lrv.a(c530Var, zx40Var, jrvVar).k(new flz0(z, zx40Var, null, false, z2, awk0Var, tlsVar)) : b.a(c530Var, m.a(), new efq0(jrvVar, z, z2, awk0Var, tlsVar, 1));
        }
        return f530Var.k(k);
    }

    public static /* synthetic */ f530 v(f530 f530Var, boolean z, zx40 zx40Var, jrv jrvVar, boolean z2, awk0 awk0Var, tls tlsVar, int i) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            awk0Var = null;
        }
        return u(f530Var, z, zx40Var, jrvVar, z3, awk0Var, tlsVar);
    }

    public static f530 w(f530 f530Var, boolean z, boolean z2, awk0 awk0Var, tls tlsVar, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return f530Var.k(new flz0(z, null, null, true, z2, awk0Var, tlsVar));
    }

    public static f530 x(f530 f530Var, ToggleableState toggleableState, zx40 zx40Var, boolean z, sls slsVar) {
        return f530Var.k(new xd11(toggleableState, zx40Var, z, slsVar));
    }
}
