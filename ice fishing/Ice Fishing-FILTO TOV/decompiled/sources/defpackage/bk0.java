package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class bk0 extends ub0 implements wc0, n50, hn0 {
    public boolean A1EKNP6CxJ;
    public gg0 AEn1Rrio;
    public oy DmJncFq5;
    public s9 HFYAaqMd6;
    public cd0 M3K9sHhK;
    public boolean MZhzXH72;
    public fn0 VeqTn1PQw7;
    public el WRKkgoJXwDn;
    public hv WdrkLMV3xh;
    public bk0 Y6hRI1cF8;
    public k50 YZjbz8VdP5;
    public p50 arNh8D4Z5gB;
    public boolean cilMamHF;
    public boolean dqB83aoLBB;
    public bk0 jivtDDk9H;
    public zf0 k8h8IjolWQ;
    public boolean lv06NcmrQ;
    public final g60 mE4lRynR;
    public float ozMwhSAI;
    public v rezfBrjOrqK;
    public static final yu0 z19UFEN2I = new yu0();
    public static final k50 YXi2hvwn7WL = new k50();
    public static final yj0 CMh55RymNfS = new yj0();
    public static final vt qugwajBSa59j = new vt(12);
    public float pog2g9KITJA = 0.8f;
    public long EXrPz3p7hFb = 0;
    public z11 eUH21U3apd = vc0.EljAMC1QTz;
    public final ak0 TpUsjqg3bxO = new ak0(this, 1);

    public bk0(g60 g60Var) {
        this.mE4lRynR = g60Var;
        this.WRKkgoJXwDn = g60Var.M3K9sHhK;
        this.arNh8D4Z5gB = g60Var.k8h8IjolWQ;
    }

    public final he0 AIyqmrtNPT(int i) {
        boolean AvO7iQsrTN = ck0.AvO7iQsrTN(i);
        he0 iK7aQfvhG = iK7aQfvhG();
        if (!AvO7iQsrTN && (iK7aQfvhG = iK7aQfvhG.mOu10nynGul) == null) {
            return null;
        }
        for (he0 q2wN4kodRW = q2wN4kodRW(AvO7iQsrTN); q2wN4kodRW != null && (q2wN4kodRW.encWxUiV2 & i) != 0; q2wN4kodRW = q2wN4kodRW.JFJ3QoxA) {
            if ((q2wN4kodRW.AvO7iQsrTN & i) != 0) {
                return q2wN4kodRW;
            }
            if (q2wN4kodRW == iK7aQfvhG) {
                return null;
            }
        }
        return null;
    }

    public final void AiiPg05cpff(gg0 gg0Var, boolean z, boolean z2) {
        long j;
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var != null) {
            if (this.lv06NcmrQ) {
                if (z2) {
                    long b9xEq24R1 = b9xEq24R1();
                    float f = gg0Var.GWasM1elztuh;
                    float f2 = gg0Var.Yi7zF1RB1;
                    if (gg0Var.X1lG3V04pd >= 0.0f) {
                        long j2 = this.AvO7iQsrTN;
                        if (f <= ((int) (j2 >> 32)) && gg0Var.xqGvceK5x >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (b9xEq24R1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (b9xEq24R1 & 4294967295L));
                            float f3 = (intBitsToFloat - (gg0Var.X1lG3V04pd - gg0Var.GWasM1elztuh)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (gg0Var.xqGvceK5x - gg0Var.Yi7zF1RB1)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.AvO7iQsrTN;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (b9xEq24R1 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (b9xEq24R1 & 4294967295L);
                            gg0Var.GWasM1elztuh(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.AvO7iQsrTN;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (b9xEq24R1 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (b9xEq24R1 & 4294967295L);
                    gg0Var.GWasM1elztuh(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.AvO7iQsrTN;
                    gg0Var.GWasM1elztuh(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (gg0Var.Yi7zF1RB1()) {
                    return;
                }
            }
            ry ryVar = (ry) fn0Var;
            float[] Yi7zF1RB1 = ryVar.Yi7zF1RB1();
            if (!ryVar.lv06NcmrQ) {
                if (Yi7zF1RB1 == null) {
                    gg0Var.GWasM1elztuh = 0.0f;
                    gg0Var.Yi7zF1RB1 = 0.0f;
                    gg0Var.X1lG3V04pd = 0.0f;
                    gg0Var.xqGvceK5x = 0.0f;
                } else {
                    z50.WdrkLMV3xh(Yi7zF1RB1, gg0Var);
                }
            }
        }
        long j5 = this.EXrPz3p7hFb;
        float f9 = (int) (j5 >> 32);
        gg0Var.GWasM1elztuh += f9;
        gg0Var.X1lG3V04pd += f9;
        float f10 = (int) (j5 & 4294967295L);
        gg0Var.Yi7zF1RB1 += f10;
        gg0Var.xqGvceK5x += f10;
    }

    @Override // defpackage.n50
    public final long AvO7iQsrTN(long j) {
        long pjimB8cb = pjimB8cb(j);
        c cVar = (c) j60.GWasM1elztuh(this.mE4lRynR);
        cVar.M3K9sHhK();
        return z50.lv06NcmrQ(cVar.JFXS9W1rB5s4, pjimB8cb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [he0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [rg0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [rg0] */
    public final void Bg54Cq4f(cd0 cd0Var) {
        bk0 bk0Var;
        cd0 cd0Var2 = this.M3K9sHhK;
        if (cd0Var != cd0Var2) {
            this.M3K9sHhK = cd0Var;
            g60 g60Var = this.mE4lRynR;
            int i = 0;
            if (cd0Var2 == null || cd0Var.OOA6hdeuvCS() != cd0Var2.OOA6hdeuvCS() || cd0Var.X1lG3V04pd() != cd0Var2.X1lG3V04pd()) {
                int OOA6hdeuvCS = cd0Var.OOA6hdeuvCS();
                int X1lG3V04pd = cd0Var.X1lG3V04pd();
                fn0 fn0Var = this.VeqTn1PQw7;
                if (fn0Var != null) {
                    ((ry) fn0Var).OOA6hdeuvCS((OOA6hdeuvCS << 32) | (X1lG3V04pd & 4294967295L));
                } else if (g60Var.A1EKNP6CxJ() && (bk0Var = this.Y6hRI1cF8) != null) {
                    bk0Var.r8u5JxottJCl();
                }
                dcDmLGVhzWm((X1lG3V04pd & 4294967295L) | (OOA6hdeuvCS << 32));
                if (this.WdrkLMV3xh != null) {
                    LTGLyn7xQ(false);
                }
                boolean AvO7iQsrTN = ck0.AvO7iQsrTN(4);
                he0 iK7aQfvhG = iK7aQfvhG();
                if (AvO7iQsrTN || (iK7aQfvhG = iK7aQfvhG.mOu10nynGul) != null) {
                    for (he0 q2wN4kodRW = q2wN4kodRW(AvO7iQsrTN); q2wN4kodRW != null && (q2wN4kodRW.encWxUiV2 & 4) != 0; q2wN4kodRW = q2wN4kodRW.JFJ3QoxA) {
                        if ((q2wN4kodRW.AvO7iQsrTN & 4) != 0) {
                            yk ykVar = q2wN4kodRW;
                            ?? r9 = 0;
                            while (ykVar != 0) {
                                if (ykVar instanceof go) {
                                    ((go) ykVar).Qd9Q8OZgvOo4();
                                } else if ((ykVar.AvO7iQsrTN & 4) != 0 && (ykVar instanceof yk)) {
                                    he0 he0Var = ykVar.jivtDDk9H;
                                    int i2 = 0;
                                    ykVar = ykVar;
                                    r9 = r9;
                                    while (he0Var != null) {
                                        if ((he0Var.AvO7iQsrTN & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                ykVar = he0Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new rg0(new he0[16]);
                                                }
                                                if (ykVar != 0) {
                                                    r9.Yi7zF1RB1(ykVar);
                                                    ykVar = 0;
                                                }
                                                r9.Yi7zF1RB1(he0Var);
                                            }
                                        }
                                        he0Var = he0Var.JFJ3QoxA;
                                        ykVar = ykVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ykVar = vc0.E7jCp8Ls(r9);
                            }
                        }
                        if (q2wN4kodRW == iK7aQfvhG) {
                            break;
                        }
                    }
                }
                gn0 gn0Var = g60Var.Mjvvu5DE;
                if (gn0Var != null) {
                    ((c) gn0Var).WdrkLMV3xh(g60Var);
                }
                g60Var.TpUsjqg3bxO(this);
            }
            zf0 zf0Var = this.k8h8IjolWQ;
            if ((zf0Var == null || zf0Var.OOA6hdeuvCS == 0) && cd0Var.GWasM1elztuh().isEmpty()) {
                return;
            }
            zf0 zf0Var2 = this.k8h8IjolWQ;
            Map GWasM1elztuh = cd0Var.GWasM1elztuh();
            if (zf0Var2 != null && zf0Var2.OOA6hdeuvCS == GWasM1elztuh.size()) {
                Object[] objArr = zf0Var2.Yi7zF1RB1;
                int[] iArr = zf0Var2.X1lG3V04pd;
                long[] jArr = zf0Var2.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) GWasM1elztuh.get((iK7aQfvhG) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            g60Var.MZhzXH72.WIEu4Ya2g8.M3K9sHhK.EljAMC1QTz();
            zf0 zf0Var3 = this.k8h8IjolWQ;
            if (zf0Var3 == null) {
                zf0 zf0Var4 = pk0.GWasM1elztuh;
                zf0Var3 = new zf0();
                this.k8h8IjolWQ = zf0Var3;
            }
            zf0Var3.GWasM1elztuh();
            for (Map.Entry entry : cd0Var.GWasM1elztuh().entrySet()) {
                zf0Var3.AvO7iQsrTN(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.n50
    public final long DmJncFq5() {
        return this.AvO7iQsrTN;
    }

    public final long Hc2GqxcqBiX(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - JFXS9W1rB5s4();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ZCWXqiC0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r3v34 */
    public final void HkgleTzzRy(he0 he0Var, zj0 zj0Var, long j, nz nzVar, int i, boolean z, float f, boolean z2) {
        he0 E7jCp8Ls;
        if (he0Var == null) {
            v7QF4od8F2hR(zj0Var, j, nzVar, i, z);
            return;
        }
        if (!zj0Var.X1lG3V04pd(he0Var)) {
            HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f, z2);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            yk ykVar = he0Var;
            rg0 rg0Var = null;
            while (true) {
                if (ykVar == 0) {
                    break;
                }
                int i3 = 0;
                if (ykVar instanceof nq0) {
                    int i4 = n30.iwATDS1i01k;
                    long j2 = n30.uFEq9NpZ;
                    int i5 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i5);
                    g60 g60Var = this.mE4lRynR;
                    p50 p50Var = g60Var.k8h8IjolWQ;
                    long j3 = Long.MIN_VALUE & Long.MIN_VALUE;
                    p50 p50Var2 = p50.OOA6hdeuvCS;
                    if (intBitsToFloat >= (-((j3 == 0 || p50Var == p50Var2) ? x51.xqGvceK5x(0, Long.MIN_VALUE) : x51.xqGvceK5x(2, Long.MIN_VALUE)))) {
                        if (Float.intBitsToFloat(i5) < JFXS9W1rB5s4() + ((j3 == 0 || g60Var.k8h8IjolWQ == p50Var2) ? x51.xqGvceK5x(2, Long.MIN_VALUE) : x51.xqGvceK5x(0, Long.MIN_VALUE))) {
                            int i6 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i6) >= (-x51.xqGvceK5x(1, Long.MIN_VALUE))) {
                                if (Float.intBitsToFloat(i6) < x51.xqGvceK5x(3, Long.MIN_VALUE) + ZCWXqiC0()) {
                                    uf0 uf0Var = nzVar.EljAMC1QTz;
                                    ag0 ag0Var = nzVar.OOA6hdeuvCS;
                                    int i7 = nzVar.AvO7iQsrTN;
                                    int i8 = ag0Var.Yi7zF1RB1;
                                    if (i7 == i8 - 1) {
                                        nzVar.Yi7zF1RB1(i7 + 1, i8);
                                        nzVar.AvO7iQsrTN++;
                                        ag0Var.GWasM1elztuh(he0Var);
                                        uf0Var.GWasM1elztuh(n30.Yi7zF1RB1(0.0f, z3, true));
                                        HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i2, z3, f, z2);
                                        nzVar.AvO7iQsrTN = i7;
                                        return;
                                    }
                                    long GWasM1elztuh = nzVar.GWasM1elztuh();
                                    int i9 = nzVar.AvO7iQsrTN;
                                    if (!n30.YZjbz8VdP5(GWasM1elztuh)) {
                                        if (n30.pog2g9KITJA(GWasM1elztuh) > 0.0f) {
                                            int i10 = nzVar.AvO7iQsrTN;
                                            nzVar.Yi7zF1RB1(i10 + 1, ag0Var.Yi7zF1RB1);
                                            nzVar.AvO7iQsrTN++;
                                            ag0Var.GWasM1elztuh(he0Var);
                                            uf0Var.GWasM1elztuh(n30.Yi7zF1RB1(0.0f, z3, true));
                                            HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z3, f, z2);
                                            nzVar.AvO7iQsrTN = i10;
                                            return;
                                        }
                                        return;
                                    }
                                    int i11 = ag0Var.Yi7zF1RB1;
                                    int i12 = i11 - 1;
                                    nzVar.AvO7iQsrTN = i12;
                                    nzVar.Yi7zF1RB1(i11, ag0Var.Yi7zF1RB1);
                                    nzVar.AvO7iQsrTN++;
                                    ag0Var.GWasM1elztuh(he0Var);
                                    uf0Var.GWasM1elztuh(n30.Yi7zF1RB1(0.0f, z3, true));
                                    HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z3, f, z2);
                                    nzVar.AvO7iQsrTN = i12;
                                    if (n30.pog2g9KITJA(nzVar.GWasM1elztuh()) < 0.0f) {
                                        nzVar.Yi7zF1RB1(i9 + 1, nzVar.AvO7iQsrTN + 1);
                                    }
                                    nzVar.AvO7iQsrTN = i9;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                        he0 he0Var2 = ykVar.jivtDDk9H;
                        E7jCp8Ls = ykVar;
                        rg0Var = rg0Var;
                        while (he0Var2 != null) {
                            if ((he0Var2.AvO7iQsrTN & 16) != 0) {
                                i3++;
                                rg0Var = rg0Var;
                                if (i3 == 1) {
                                    E7jCp8Ls = he0Var2;
                                } else {
                                    if (rg0Var == null) {
                                        rg0Var = new rg0(new he0[16]);
                                    }
                                    if (E7jCp8Ls != null) {
                                        rg0Var.Yi7zF1RB1(E7jCp8Ls);
                                        E7jCp8Ls = null;
                                    }
                                    rg0Var.Yi7zF1RB1(he0Var2);
                                }
                            }
                            he0Var2 = he0Var2.JFJ3QoxA;
                            E7jCp8Ls = E7jCp8Ls;
                            rg0Var = rg0Var;
                        }
                        if (i3 == 1) {
                            i2 = i;
                            z3 = z;
                            c = c2;
                            ykVar = E7jCp8Ls;
                            rg0Var = rg0Var;
                        }
                    }
                    E7jCp8Ls = vc0.E7jCp8Ls(rg0Var);
                    i2 = i;
                    z3 = z;
                    c = c2;
                    ykVar = E7jCp8Ls;
                    rg0Var = rg0Var;
                }
            }
        }
        if (z2) {
            NWXxPwoOUSX9(he0Var, zj0Var, j, nzVar, i, z, f);
        } else {
            PCrRnrghk5(he0Var, zj0Var, j, nzVar, i, z, f);
        }
    }

    @Override // defpackage.n50
    public final n50 JFJ3QoxA() {
        boolean z = iK7aQfvhG().Mjvvu5DE;
        g60 g60Var = this.mE4lRynR;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (g60 g60Var2 = g60Var; g60Var2 != null; g60Var2 = g60Var2.cilMamHF()) {
                sb.append("\n|");
                sb.append(g60Var2);
                sb.append(" isAttached=");
                sb.append(g60Var2.eUH21U3apd());
                sb.append(" modifier=");
                sb.append(g60Var2.TpUsjqg3bxO);
                sb.append(" tail=");
                sb.append(iK7aQfvhG());
            }
            t10.Yi7zF1RB1(sb.toString());
        }
        wc9Ja9tFnR();
        return g60Var.A1EKNP6CxJ.xqGvceK5x.Y6hRI1cF8;
    }

    public final void Jz7YUlEP53() {
        this.cilMamHF = true;
        this.TpUsjqg3bxO.GWasM1elztuh();
        UpJpMKXj();
        if (u20.GWasM1elztuh(this.EXrPz3p7hFb, 0L)) {
            return;
        }
        this.mE4lRynR.TpUsjqg3bxO(this);
    }

    public final void LTGLyn7xQ(boolean z) {
        char c;
        c cVar;
        boolean z2;
        c cVar2;
        gn0 gn0Var;
        wu wuVar;
        wu wuVar2;
        fn0 fn0Var = this.VeqTn1PQw7;
        hv hvVar = this.WdrkLMV3xh;
        if (fn0Var == null) {
            if (hvVar == null) {
                return;
            }
            t10.Yi7zF1RB1("null layer with a non-null layerBlock");
            return;
        }
        if (hvVar == null) {
            throw mr0.EljAMC1QTz("updateLayerParameters requires a non-null layerBlock");
        }
        yu0 yu0Var = z19UFEN2I;
        yu0Var.GWasM1elztuh();
        g60 g60Var = this.mE4lRynR;
        yu0Var.YmKjaVtbfp5Z = g60Var.M3K9sHhK;
        yu0Var.Mjvvu5DE = g60Var.k8h8IjolWQ;
        yu0Var.WIEu4Ya2g8 = o30.CMh55RymNfS(this.AvO7iQsrTN);
        ((c) j60.GWasM1elztuh(g60Var)).getSnapshotObserver().GWasM1elztuh.X1lG3V04pd(this, XdwzlWIkSDqF.arNh8D4Z5gB, new psOJLYhIz(7, hvVar, this));
        k50 k50Var = this.YZjbz8VdP5;
        if (k50Var == null) {
            k50Var = new k50();
            this.YZjbz8VdP5 = k50Var;
        }
        k50 k50Var2 = YXi2hvwn7WL;
        k50Var2.getClass();
        k50Var2.GWasM1elztuh = k50Var.GWasM1elztuh;
        k50Var2.Yi7zF1RB1 = k50Var.Yi7zF1RB1;
        k50Var2.X1lG3V04pd = k50Var.X1lG3V04pd;
        k50Var2.xqGvceK5x = k50Var.xqGvceK5x;
        float f = yu0Var.EljAMC1QTz;
        k50Var.GWasM1elztuh = f;
        k50Var.Yi7zF1RB1 = yu0Var.AvO7iQsrTN;
        k50Var.X1lG3V04pd = yu0Var.E7jCp8Ls;
        long j = yu0Var.XnEVoBF0td1l;
        k50Var.xqGvceK5x = j;
        ry ryVar = (ry) fn0Var;
        c cVar3 = ryVar.AvO7iQsrTN;
        int i = yu0Var.OOA6hdeuvCS | ryVar.Mjvvu5DE;
        ryVar.WIEu4Ya2g8 = yu0Var.Mjvvu5DE;
        ryVar.iwATDS1i01k = yu0Var.YmKjaVtbfp5Z;
        int i2 = i & 4096;
        if (i2 != 0) {
            ryVar.mE4lRynR = j;
        }
        if ((i & 1) != 0) {
            qy qyVar = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar.OOA6hdeuvCS() != f) {
                qyVar.uFEq9NpZ(f);
            }
        }
        if ((i & 2) != 0) {
            oy oyVar = ryVar.OOA6hdeuvCS;
            float f2 = yu0Var.AvO7iQsrTN;
            qy qyVar2 = oyVar.GWasM1elztuh;
            if (qyVar2.MZhzXH72() != f2) {
                qyVar2.k8h8IjolWQ(f2);
            }
        }
        if ((i & 4) != 0) {
            oy oyVar2 = ryVar.OOA6hdeuvCS;
            float f3 = yu0Var.encWxUiV2;
            qy qyVar3 = oyVar2.GWasM1elztuh;
            if (qyVar3.Yi7zF1RB1() != f3) {
                qyVar3.xqGvceK5x(f3);
            }
        }
        if ((i & 8) != 0) {
            qy qyVar4 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar4.Mjvvu5DE() != 0.0f) {
                qyVar4.mE4lRynR();
            }
        }
        if ((i & 16) != 0) {
            qy qyVar5 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar5.AvO7iQsrTN() != 0.0f) {
                qyVar5.encWxUiV2();
            }
        }
        if ((i & 32) != 0) {
            oy oyVar3 = ryVar.OOA6hdeuvCS;
            float f4 = yu0Var.mOu10nynGul;
            qy qyVar6 = oyVar3.GWasM1elztuh;
            if (qyVar6.eUH21U3apd() != f4) {
                qyVar6.EljAMC1QTz(f4);
                oyVar3.AvO7iQsrTN = true;
                oyVar3.GWasM1elztuh();
            }
            if (yu0Var.mOu10nynGul > 0.0f && !ryVar.WdrkLMV3xh && (wuVar2 = ryVar.mOu10nynGul) != null) {
                wuVar2.GWasM1elztuh();
            }
        }
        if ((i & 64) != 0) {
            oy oyVar4 = ryVar.OOA6hdeuvCS;
            long j2 = yu0Var.JFJ3QoxA;
            qy qyVar7 = oyVar4.GWasM1elztuh;
            if (!yb.X1lG3V04pd(j2, qyVar7.TpUsjqg3bxO())) {
                qyVar7.rQPn8YBR(j2);
            }
        }
        if ((i & 128) != 0) {
            oy oyVar5 = ryVar.OOA6hdeuvCS;
            long j3 = yu0Var.rQPn8YBR;
            qy qyVar8 = oyVar5.GWasM1elztuh;
            if (!yb.X1lG3V04pd(j3, qyVar8.JFJ3QoxA())) {
                qyVar8.M3K9sHhK(j3);
            }
        }
        if ((i & 1024) != 0) {
            qy qyVar9 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar9.DmJncFq5() != 0.0f) {
                qyVar9.pog2g9KITJA();
            }
        }
        if ((i & 256) != 0) {
            qy qyVar10 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar10.lv06NcmrQ() != 0.0f) {
                qyVar10.X1lG3V04pd();
            }
        }
        if ((i & 512) != 0) {
            qy qyVar11 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar11.AEn1Rrio() != 0.0f) {
                qyVar11.mOu10nynGul();
            }
        }
        if ((i & 2048) != 0) {
            oy oyVar6 = ryVar.OOA6hdeuvCS;
            float f5 = yu0Var.E7jCp8Ls;
            qy qyVar12 = oyVar6.GWasM1elztuh;
            if (qyVar12.WIEu4Ya2g8() != f5) {
                qyVar12.YZjbz8VdP5(f5);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean GWasM1elztuh = ga1.GWasM1elztuh(ryVar.mE4lRynR, ga1.Yi7zF1RB1);
            oy oyVar7 = ryVar.OOA6hdeuvCS;
            if (!GWasM1elztuh) {
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ryVar.mE4lRynR & 4294967295L)) * ((int) (ryVar.JFJ3QoxA & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ryVar.mE4lRynR >> 32)) * ((int) (ryVar.JFJ3QoxA >> 32))) << 32);
                if (!uk0.Yi7zF1RB1(oyVar7.cilMamHF, floatToRawIntBits)) {
                    oyVar7.cilMamHF = floatToRawIntBits;
                    oyVar7.GWasM1elztuh.rezfBrjOrqK(floatToRawIntBits);
                }
            } else if (!uk0.Yi7zF1RB1(oyVar7.cilMamHF, 9205357640488583168L)) {
                oyVar7.cilMamHF = 9205357640488583168L;
                oyVar7.GWasM1elztuh.rezfBrjOrqK(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            oy oyVar8 = ryVar.OOA6hdeuvCS;
            boolean z3 = yu0Var.iwATDS1i01k;
            if (oyVar8.lv06NcmrQ != z3) {
                oyVar8.lv06NcmrQ = z3;
                oyVar8.AvO7iQsrTN = true;
                oyVar8.GWasM1elztuh();
            }
        }
        if ((131072 & i) != 0) {
            qy qyVar13 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
        }
        if ((262144 & i) != 0) {
            qy qyVar14 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (!o30.rQPn8YBR(qyVar14.WRKkgoJXwDn(), null)) {
                qyVar14.XnEVoBF0td1l();
            }
        }
        if ((524288 & i) != 0) {
            oy oyVar9 = ryVar.OOA6hdeuvCS;
            int i3 = yu0Var.mE4lRynR;
            qy qyVar15 = oyVar9.GWasM1elztuh;
            if (qyVar15.HFYAaqMd6() != i3) {
                qyVar15.iwATDS1i01k(i3);
            }
        }
        if ((32768 & i) != 0) {
            qy qyVar16 = ryVar.OOA6hdeuvCS.GWasM1elztuh;
            if (qyVar16.cilMamHF() != 0) {
                qyVar16.arNh8D4Z5gB(0);
            }
        }
        if ((i & 7963) != 0) {
            ryVar.Y6hRI1cF8 = true;
            ryVar.cilMamHF = true;
        }
        if (o30.rQPn8YBR(ryVar.jivtDDk9H, yu0Var.jivtDDk9H)) {
            cVar = cVar3;
            z2 = false;
        } else {
            z50 z50Var = yu0Var.jivtDDk9H;
            ryVar.jivtDDk9H = z50Var;
            if (z50Var == null) {
                cVar = cVar3;
            } else {
                oy oyVar10 = ryVar.OOA6hdeuvCS;
                if (z50Var instanceof an0) {
                    kt0 kt0Var = ((an0) z50Var).Yi7zF1RB1;
                    float f6 = kt0Var.GWasM1elztuh;
                    float f7 = kt0Var.Yi7zF1RB1;
                    cVar = cVar3;
                    oyVar10.OOA6hdeuvCS((Float.floatToRawIntBits(f6) << c) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(kt0Var.X1lG3V04pd - f6) << c) | (Float.floatToRawIntBits(kt0Var.xqGvceK5x - f7) & 4294967295L), 0.0f);
                } else {
                    cVar = cVar3;
                    if (z50Var instanceof zm0) {
                        h1 h1Var = ((zm0) z50Var).Yi7zF1RB1;
                        oyVar10.rQPn8YBR = null;
                        oyVar10.mOu10nynGul = 9205357640488583168L;
                        oyVar10.encWxUiV2 = 0L;
                        oyVar10.JFJ3QoxA = 0.0f;
                        oyVar10.AvO7iQsrTN = true;
                        oyVar10.uFEq9NpZ = false;
                        oyVar10.E7jCp8Ls = h1Var;
                        oyVar10.GWasM1elztuh();
                    } else {
                        if (!(z50Var instanceof bn0)) {
                            o4.xqGvceK5x();
                            return;
                        }
                        bn0 bn0Var = (bn0) z50Var;
                        h1 h1Var2 = bn0Var.X1lG3V04pd;
                        if (h1Var2 != null) {
                            oyVar10.rQPn8YBR = null;
                            oyVar10.mOu10nynGul = 9205357640488583168L;
                            oyVar10.encWxUiV2 = 0L;
                            oyVar10.JFJ3QoxA = 0.0f;
                            oyVar10.AvO7iQsrTN = true;
                            oyVar10.uFEq9NpZ = false;
                            oyVar10.E7jCp8Ls = h1Var2;
                            oyVar10.GWasM1elztuh();
                        } else {
                            sv0 sv0Var = bn0Var.Yi7zF1RB1;
                            float f8 = sv0Var.Yi7zF1RB1;
                            float f9 = sv0Var.GWasM1elztuh;
                            oyVar10.OOA6hdeuvCS((Float.floatToRawIntBits(f9) << c) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(sv0Var.X1lG3V04pd - f9) << c) | (Float.floatToRawIntBits(sv0Var.xqGvceK5x - f8) & 4294967295L), Float.intBitsToFloat((int) (sv0Var.encWxUiV2 >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((z50Var instanceof zm0) || ((z50Var instanceof bn0) && !n4.iwATDS1i01k(((bn0) z50Var).Yi7zF1RB1))) && (wuVar = ryVar.mOu10nynGul) != null)) {
                    wuVar.GWasM1elztuh();
                }
            }
            z2 = true;
        }
        ryVar.Mjvvu5DE = yu0Var.OOA6hdeuvCS;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = cVar.getParent();
                if (parent != null) {
                    cVar2 = cVar;
                    parent.onDescendantInvalidated(cVar2, cVar2);
                } else {
                    cVar2 = cVar;
                }
            } else {
                cVar2 = cVar;
                cVar2.invalidate();
            }
            if (c.WIEu4Ya2g8()) {
                cVar2.DmJncFq5(0.0f);
            }
        }
        boolean z4 = this.lv06NcmrQ;
        this.lv06NcmrQ = yu0Var.iwATDS1i01k;
        this.pog2g9KITJA = yu0Var.encWxUiV2;
        boolean z5 = k50Var2.GWasM1elztuh == k50Var.GWasM1elztuh && k50Var2.Yi7zF1RB1 == k50Var.Yi7zF1RB1 && k50Var2.X1lG3V04pd == k50Var.X1lG3V04pd && ga1.GWasM1elztuh(k50Var2.xqGvceK5x, k50Var.xqGvceK5x);
        if (z && ((!z5 || z4 != this.lv06NcmrQ) && (gn0Var = g60Var.Mjvvu5DE) != null)) {
            ((c) gn0Var).WdrkLMV3xh(g60Var);
        }
        if (z5) {
            return;
        }
        g60Var.TpUsjqg3bxO(this);
        if (g60Var.z19UFEN2I > 0) {
            c cVar4 = (c) j60.GWasM1elztuh(g60Var);
            d dVar = cVar4.c4eaifQP.OOA6hdeuvCS;
            dVar.getClass();
            if (g60Var.z19UFEN2I > 0) {
                ((rg0) dVar.EljAMC1QTz).Yi7zF1RB1(g60Var);
                g60Var.VeqTn1PQw7 = true;
            }
            cVar4.ozMwhSAI(null);
        }
    }

    @Override // defpackage.n50
    public final long M3K9sHhK(n50 n50Var, long j) {
        return YZjbz8VdP5(n50Var, j);
    }

    public final void NWXxPwoOUSX9(he0 he0Var, zj0 zj0Var, long j, nz nzVar, int i, boolean z, float f) {
        if (he0Var == null) {
            v7QF4od8F2hR(zj0Var, j, nzVar, i, z);
            return;
        }
        if (!zj0Var.X1lG3V04pd(he0Var)) {
            NWXxPwoOUSX9(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f);
            return;
        }
        int i2 = nzVar.AvO7iQsrTN;
        ag0 ag0Var = nzVar.OOA6hdeuvCS;
        nzVar.Yi7zF1RB1(i2 + 1, ag0Var.Yi7zF1RB1);
        nzVar.AvO7iQsrTN++;
        ag0Var.GWasM1elztuh(he0Var);
        nzVar.EljAMC1QTz.GWasM1elztuh(n30.Yi7zF1RB1(f, z, false));
        HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f, true);
        nzVar.AvO7iQsrTN = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.n30.YmKjaVtbfp5Z(r18.GWasM1elztuh(), defpackage.n30.Yi7zF1RB1(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void NsRGN7gRqWF(zj0 zj0Var, long j, nz nzVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        he0 AIyqmrtNPT = AIyqmrtNPT(zj0Var.Yi7zF1RB1());
        if (!psOJLYhIz(j)) {
            if (i == 1) {
                float OGdJP42E = OGdJP42E(j, b9xEq24R1());
                if ((Float.floatToRawIntBits(OGdJP42E) & Integer.MAX_VALUE) < 2139095040) {
                    if (nzVar.AvO7iQsrTN != nzVar.OOA6hdeuvCS.Yi7zF1RB1 - 1) {
                        if (n30.YmKjaVtbfp5Z(nzVar.GWasM1elztuh(), n30.Yi7zF1RB1(OGdJP42E, false, false)) <= 0) {
                            return;
                        }
                    }
                    NWXxPwoOUSX9(AIyqmrtNPT, zj0Var, j, nzVar, i, false, OGdJP42E);
                    return;
                }
                return;
            }
            return;
        }
        if (AIyqmrtNPT == null) {
            v7QF4od8F2hR(zj0Var, j, nzVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < JFXS9W1rB5s4() && intBitsToFloat2 < ZCWXqiC0()) {
            d6sfifL1(AIyqmrtNPT, zj0Var, j, nzVar, i, z);
            return;
        }
        float OGdJP42E2 = i == 1 ? OGdJP42E(j, b9xEq24R1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(OGdJP42E2) & Integer.MAX_VALUE) < 2139095040) {
            if (nzVar.AvO7iQsrTN == nzVar.OOA6hdeuvCS.Yi7zF1RB1 - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            HkgleTzzRy(AIyqmrtNPT, zj0Var, j, nzVar, i, z2, OGdJP42E2, z3);
        }
        z2 = z;
        z3 = false;
        HkgleTzzRy(AIyqmrtNPT, zj0Var, j, nzVar, i, z2, OGdJP42E2, z3);
    }

    public final float OGdJP42E(long j, long j2) {
        if (JFXS9W1rB5s4() >= Float.intBitsToFloat((int) (j2 >> 32)) && ZCWXqiC0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long Hc2GqxcqBiX = Hc2GqxcqBiX(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (Hc2GqxcqBiX >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Hc2GqxcqBiX & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - JFXS9W1rB5s4());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - ZCWXqiC0())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public abstract wb0 P4U4zqyW7wx();

    public final void PCrRnrghk5(he0 he0Var, zj0 zj0Var, long j, nz nzVar, int i, boolean z, float f) {
        int i2;
        if (he0Var == null) {
            v7QF4od8F2hR(zj0Var, j, nzVar, i, z);
            return;
        }
        if (!zj0Var.X1lG3V04pd(he0Var)) {
            PCrRnrghk5(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f);
            return;
        }
        if (!zj0Var.GWasM1elztuh(he0Var)) {
            HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f, false);
            return;
        }
        uf0 uf0Var = nzVar.EljAMC1QTz;
        ag0 ag0Var = nzVar.OOA6hdeuvCS;
        int i3 = nzVar.AvO7iQsrTN;
        int i4 = ag0Var.Yi7zF1RB1;
        if (i3 != i4 - 1) {
            long GWasM1elztuh = nzVar.GWasM1elztuh();
            int i5 = nzVar.AvO7iQsrTN;
            int i6 = ag0Var.Yi7zF1RB1;
            int i7 = i6 - 1;
            nzVar.AvO7iQsrTN = i7;
            nzVar.Yi7zF1RB1(i6, ag0Var.Yi7zF1RB1);
            nzVar.AvO7iQsrTN++;
            ag0Var.GWasM1elztuh(he0Var);
            uf0Var.GWasM1elztuh(n30.Yi7zF1RB1(f, z, false));
            HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f, false);
            nzVar.AvO7iQsrTN = i7;
            long GWasM1elztuh2 = nzVar.GWasM1elztuh();
            if (nzVar.AvO7iQsrTN + 1 >= ag0Var.Yi7zF1RB1 - 1 || n30.YmKjaVtbfp5Z(GWasM1elztuh, GWasM1elztuh2) <= 0) {
                nzVar.Yi7zF1RB1(nzVar.AvO7iQsrTN + 1, ag0Var.Yi7zF1RB1);
            } else {
                int i8 = i5 + 1;
                boolean YZjbz8VdP5 = n30.YZjbz8VdP5(GWasM1elztuh2);
                int i9 = nzVar.AvO7iQsrTN;
                nzVar.Yi7zF1RB1(i8, YZjbz8VdP5 ? i9 + 2 : i9 + 1);
            }
            nzVar.AvO7iQsrTN = i5;
            return;
        }
        int i10 = i3 + 1;
        nzVar.Yi7zF1RB1(i10, i4);
        nzVar.AvO7iQsrTN++;
        ag0Var.GWasM1elztuh(he0Var);
        uf0Var.GWasM1elztuh(n30.Yi7zF1RB1(f, z, false));
        HkgleTzzRy(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z, f, false);
        nzVar.AvO7iQsrTN = i3;
        if (i10 == ag0Var.Yi7zF1RB1 - 1 || n30.YZjbz8VdP5(nzVar.GWasM1elztuh())) {
            int i11 = nzVar.AvO7iQsrTN;
            int i12 = i11 + 1;
            ag0Var.rQPn8YBR(i12);
            if (i12 < 0 || i12 >= (i2 = uf0Var.Yi7zF1RB1)) {
                o4.uFEq9NpZ("Index must be between 0 and size");
                return;
            }
            long[] jArr = uf0Var.GWasM1elztuh;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                d5.Uxq83abb04(jArr, jArr, i12, i11 + 2, i2);
            }
            uf0Var.Yi7zF1RB1--;
        }
    }

    public final long R46bVSe7ra(long j) {
        long j2 = this.EXrPz3p7hFb;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var != null) {
            ry ryVar = (ry) fn0Var;
            float[] GWasM1elztuh = ryVar.GWasM1elztuh();
            if (GWasM1elztuh == null) {
                return 9187343241974906880L;
            }
            if (!ryVar.lv06NcmrQ) {
                return z50.lv06NcmrQ(GWasM1elztuh, floatToRawIntBits);
            }
        }
        return floatToRawIntBits;
    }

    public final void UpJpMKXj() {
        if (this.VeqTn1PQw7 != null) {
            wDCmwMuMZmB(null, false);
            this.mE4lRynR.J3Xc8BaqpN8(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [he0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [he0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void VJUcwvGgb9W() {
        he0 he0Var;
        boolean AvO7iQsrTN = ck0.AvO7iQsrTN(128);
        he0 q2wN4kodRW = q2wN4kodRW(AvO7iQsrTN);
        if (q2wN4kodRW == null || (q2wN4kodRW.OOA6hdeuvCS.encWxUiV2 & 128) == 0) {
            return;
        }
        y31 Mjvvu5DE = d70.Mjvvu5DE();
        hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
        y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
        try {
            if (AvO7iQsrTN) {
                he0Var = iK7aQfvhG();
            } else {
                he0Var = iK7aQfvhG().mOu10nynGul;
                if (he0Var == null) {
                }
            }
            for (he0 q2wN4kodRW2 = q2wN4kodRW(AvO7iQsrTN); q2wN4kodRW2 != null; q2wN4kodRW2 = q2wN4kodRW2.JFJ3QoxA) {
                if ((q2wN4kodRW2.encWxUiV2 & 128) == 0) {
                    break;
                }
                if ((q2wN4kodRW2.AvO7iQsrTN & 128) != 0) {
                    yk ykVar = q2wN4kodRW2;
                    ?? r8 = 0;
                    while (ykVar != 0) {
                        if (ykVar instanceof ed0) {
                            ((ed0) ykVar).X1lG3V04pd(this.AvO7iQsrTN);
                        } else if ((ykVar.AvO7iQsrTN & 128) != 0 && (ykVar instanceof yk)) {
                            he0 he0Var2 = ykVar.jivtDDk9H;
                            int i = 0;
                            ykVar = ykVar;
                            r8 = r8;
                            while (he0Var2 != null) {
                                if ((he0Var2.AvO7iQsrTN & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        ykVar = he0Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new rg0(new he0[16]);
                                        }
                                        if (ykVar != 0) {
                                            r8.Yi7zF1RB1(ykVar);
                                            ykVar = 0;
                                        }
                                        r8.Yi7zF1RB1(he0Var2);
                                    }
                                }
                                he0Var2 = he0Var2.JFJ3QoxA;
                                ykVar = ykVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        ykVar = vc0.E7jCp8Ls(r8);
                    }
                }
                if (q2wN4kodRW2 == he0Var) {
                    break;
                }
            }
        } finally {
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
        }
    }

    @Override // defpackage.ub0
    public final ub0 WkXHDbKiD() {
        return this.jivtDDk9H;
    }

    @Override // defpackage.n50
    public final long X1lG3V04pd(long j) {
        if (!iK7aQfvhG().Mjvvu5DE) {
            t10.Yi7zF1RB1("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((c) j60.GWasM1elztuh(this.mE4lRynR)).jivtDDk9H(pjimB8cb(j));
    }

    public final long XmVeRDAr(bk0 bk0Var, long j) {
        if (bk0Var == this) {
            return j;
        }
        bk0 bk0Var2 = this.Y6hRI1cF8;
        return (bk0Var2 == null || o30.rQPn8YBR(bk0Var, bk0Var2)) ? R46bVSe7ra(j) : R46bVSe7ra(bk0Var2.XmVeRDAr(bk0Var, j));
    }

    @Override // defpackage.hn0
    public final boolean Y6hRI1cF8() {
        return (this.VeqTn1PQw7 == null || this.cilMamHF || !this.mE4lRynR.eUH21U3apd()) ? false : true;
    }

    @Override // defpackage.n50
    public final long YZjbz8VdP5(n50 n50Var, long j) {
        bk0 bk0Var;
        boolean z = n50Var instanceof xb0;
        if (z) {
            xb0 xb0Var = (xb0) n50Var;
            xb0Var.OOA6hdeuvCS.mE4lRynR.wc9Ja9tFnR();
            return xb0Var.YZjbz8VdP5(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        xb0 xb0Var2 = z ? (xb0) n50Var : null;
        if (xb0Var2 == null || (bk0Var = xb0Var2.OOA6hdeuvCS.mE4lRynR) == null) {
            n50Var.getClass();
            bk0Var = (bk0) n50Var;
        }
        bk0Var.wc9Ja9tFnR();
        bk0 oCbv4H4NsA = oCbv4H4NsA(bk0Var);
        while (bk0Var != oCbv4H4NsA) {
            fn0 fn0Var = bk0Var.VeqTn1PQw7;
            if (fn0Var != null) {
                ry ryVar = (ry) fn0Var;
                float[] Yi7zF1RB1 = ryVar.Yi7zF1RB1();
                if (!ryVar.lv06NcmrQ) {
                    j = z50.lv06NcmrQ(Yi7zF1RB1, j);
                }
            }
            j = qj.rezfBrjOrqK(j, bk0Var.EXrPz3p7hFb);
            bk0Var = bk0Var.Y6hRI1cF8;
            bk0Var.getClass();
        }
        return XmVeRDAr(oCbv4H4NsA, j);
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.mE4lRynR.M3K9sHhK.Yi7zF1RB1();
    }

    public final long b9xEq24R1() {
        return this.WRKkgoJXwDn.CMh55RymNfS(this.mE4lRynR.EXrPz3p7hFb.X1lG3V04pd());
    }

    @Override // defpackage.ub0
    public final g60 bCsSzSHkbaQ() {
        return this.mE4lRynR;
    }

    public final void bfDgRvRIg(s9 s9Var, oy oyVar) {
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var == null) {
            long j = this.EXrPz3p7hFb;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            s9Var.AvO7iQsrTN(f, f2);
            fX9rg6CD(s9Var, oyVar);
            s9Var.AvO7iQsrTN(-f, -f2);
            return;
        }
        ry ryVar = (ry) fn0Var;
        u9 u9Var = ryVar.YmKjaVtbfp5Z;
        ryVar.AvO7iQsrTN();
        ryVar.WdrkLMV3xh = ryVar.OOA6hdeuvCS.GWasM1elztuh.eUH21U3apd() > 0.0f;
        f4 f4Var = u9Var.EljAMC1QTz;
        f4Var.YmKjaVtbfp5Z(s9Var);
        f4Var.X1lG3V04pd = oyVar;
        p.rQPn8YBR(u9Var, ryVar.OOA6hdeuvCS);
    }

    @Override // defpackage.ub0
    public final boolean cTIXpaxc() {
        return this.M3K9sHhK != null;
    }

    public abstract void d5idzIhj55b();

    public final void d6sfifL1(he0 he0Var, zj0 zj0Var, long j, nz nzVar, int i, boolean z) {
        if (he0Var == null) {
            v7QF4od8F2hR(zj0Var, j, nzVar, i, z);
            return;
        }
        if (!zj0Var.X1lG3V04pd(he0Var)) {
            d6sfifL1(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z);
            return;
        }
        int i2 = nzVar.AvO7iQsrTN;
        ag0 ag0Var = nzVar.OOA6hdeuvCS;
        nzVar.Yi7zF1RB1(i2 + 1, ag0Var.Yi7zF1RB1);
        nzVar.AvO7iQsrTN++;
        ag0Var.GWasM1elztuh(he0Var);
        nzVar.EljAMC1QTz.GWasM1elztuh(n30.Yi7zF1RB1(-1.0f, z, false));
        d6sfifL1(l60.EljAMC1QTz(he0Var, zj0Var.Yi7zF1RB1()), zj0Var, j, nzVar, i, z);
        nzVar.AvO7iQsrTN = i2;
    }

    public final void ddkiCTz5mZ() {
        boolean AvO7iQsrTN = ck0.AvO7iQsrTN(1048576);
        he0 q2wN4kodRW = q2wN4kodRW(AvO7iQsrTN);
        if (q2wN4kodRW == null || (q2wN4kodRW.OOA6hdeuvCS.encWxUiV2 & 1048576) == 0) {
            return;
        }
        he0 iK7aQfvhG = iK7aQfvhG();
        if (!AvO7iQsrTN && (iK7aQfvhG = iK7aQfvhG.mOu10nynGul) == null) {
            return;
        }
        for (he0 q2wN4kodRW2 = q2wN4kodRW(AvO7iQsrTN); q2wN4kodRW2 != null && (q2wN4kodRW2.encWxUiV2 & 1048576) != 0; q2wN4kodRW2 = q2wN4kodRW2.JFJ3QoxA) {
            if ((q2wN4kodRW2.AvO7iQsrTN & 1048576) != 0) {
                he0 he0Var = q2wN4kodRW2;
                rg0 rg0Var = null;
                while (he0Var != null) {
                    if ((he0Var.AvO7iQsrTN & 1048576) != 0 && (he0Var instanceof yk)) {
                        int i = 0;
                        for (he0 he0Var2 = ((yk) he0Var).jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
                            if ((he0Var2.AvO7iQsrTN & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    he0Var = he0Var2;
                                } else {
                                    if (rg0Var == null) {
                                        rg0Var = new rg0(new he0[16]);
                                    }
                                    if (he0Var != null) {
                                        rg0Var.Yi7zF1RB1(he0Var);
                                        he0Var = null;
                                    }
                                    rg0Var.Yi7zF1RB1(he0Var2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    he0Var = vc0.E7jCp8Ls(rg0Var);
                }
            }
            if (q2wN4kodRW2 == iK7aQfvhG) {
                return;
            }
        }
    }

    @Override // defpackage.n50
    public final kt0 eUH21U3apd(n50 n50Var, boolean z) {
        bk0 bk0Var;
        if (!iK7aQfvhG().Mjvvu5DE) {
            t10.Yi7zF1RB1("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!n50Var.ozMwhSAI()) {
            t10.Yi7zF1RB1("LayoutCoordinates " + n50Var + " is not attached!");
        }
        xb0 xb0Var = n50Var instanceof xb0 ? (xb0) n50Var : null;
        if (xb0Var == null || (bk0Var = xb0Var.OOA6hdeuvCS.mE4lRynR) == null) {
            bk0Var = (bk0) n50Var;
        }
        bk0Var.wc9Ja9tFnR();
        bk0 oCbv4H4NsA = oCbv4H4NsA(bk0Var);
        gg0 gg0Var = this.AEn1Rrio;
        if (gg0Var == null) {
            gg0Var = new gg0();
            this.AEn1Rrio = gg0Var;
        }
        gg0Var.GWasM1elztuh = 0.0f;
        gg0Var.Yi7zF1RB1 = 0.0f;
        gg0Var.X1lG3V04pd = (int) (n50Var.DmJncFq5() >> 32);
        gg0Var.xqGvceK5x = (int) (n50Var.DmJncFq5() & 4294967295L);
        while (bk0Var != oCbv4H4NsA) {
            bk0Var.AiiPg05cpff(gg0Var, z, false);
            if (gg0Var.Yi7zF1RB1()) {
                return kt0.OOA6hdeuvCS;
            }
            bk0Var = bk0Var.Y6hRI1cF8;
            bk0Var.getClass();
        }
        sb9fmtV8A(oCbv4H4NsA, gg0Var, z);
        return new kt0(gg0Var.GWasM1elztuh, gg0Var.Yi7zF1RB1, gg0Var.X1lG3V04pd, gg0Var.xqGvceK5x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.up0, defpackage.wc0
    public final Object encWxUiV2() {
        g60 g60Var = this.mE4lRynR;
        if (!g60Var.A1EKNP6CxJ.xqGvceK5x(64)) {
            return null;
        }
        iK7aQfvhG();
        Object obj = null;
        for (he0 he0Var = g60Var.A1EKNP6CxJ.OOA6hdeuvCS; he0Var != null; he0Var = he0Var.mOu10nynGul) {
            if ((he0Var.AvO7iQsrTN & 64) != 0) {
                yk ykVar = he0Var;
                ?? r4 = 0;
                while (ykVar != 0) {
                    if (ykVar instanceof go0) {
                        obj = ((go0) ykVar).dcDmLGVhzWm(obj);
                    } else if ((ykVar.AvO7iQsrTN & 64) != 0 && (ykVar instanceof yk)) {
                        he0 he0Var2 = ykVar.jivtDDk9H;
                        int i = 0;
                        ykVar = ykVar;
                        r4 = r4;
                        while (he0Var2 != null) {
                            if ((he0Var2.AvO7iQsrTN & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    ykVar = he0Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new rg0(new he0[16]);
                                    }
                                    if (ykVar != 0) {
                                        r4.Yi7zF1RB1(ykVar);
                                        ykVar = 0;
                                    }
                                    r4.Yi7zF1RB1(he0Var2);
                                }
                            }
                            he0Var2 = he0Var2.JFJ3QoxA;
                            ykVar = ykVar;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    ykVar = vc0.E7jCp8Ls(r4);
                }
            }
        }
        return obj;
    }

    public final void fX9rg6CD(s9 s9Var, oy oyVar) {
        bk0 bk0Var;
        s9 s9Var2;
        oy oyVar2;
        he0 AIyqmrtNPT = AIyqmrtNPT(4);
        if (AIyqmrtNPT == null) {
            gY3jNtCS0(s9Var, oyVar);
            return;
        }
        g60 g60Var = this.mE4lRynR;
        g60Var.getClass();
        i60 sharedDrawScope = ((c) j60.GWasM1elztuh(g60Var)).getSharedDrawScope();
        long CMh55RymNfS2 = o30.CMh55RymNfS(this.AvO7iQsrTN);
        sharedDrawScope.getClass();
        rg0 rg0Var = null;
        while (AIyqmrtNPT != null) {
            if (AIyqmrtNPT instanceof go) {
                bk0Var = this;
                s9Var2 = s9Var;
                oyVar2 = oyVar;
                sharedDrawScope.X1lG3V04pd(s9Var2, CMh55RymNfS2, bk0Var, (go) AIyqmrtNPT, oyVar2);
            } else {
                bk0Var = this;
                s9Var2 = s9Var;
                oyVar2 = oyVar;
                if ((AIyqmrtNPT.AvO7iQsrTN & 4) != 0 && (AIyqmrtNPT instanceof yk)) {
                    int i = 0;
                    for (he0 he0Var = ((yk) AIyqmrtNPT).jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
                        if ((he0Var.AvO7iQsrTN & 4) != 0) {
                            i++;
                            if (i == 1) {
                                AIyqmrtNPT = he0Var;
                            } else {
                                if (rg0Var == null) {
                                    rg0Var = new rg0(new he0[16]);
                                }
                                if (AIyqmrtNPT != null) {
                                    rg0Var.Yi7zF1RB1(AIyqmrtNPT);
                                    AIyqmrtNPT = null;
                                }
                                rg0Var.Yi7zF1RB1(he0Var);
                            }
                        }
                    }
                    if (i == 1) {
                        s9Var = s9Var2;
                        this = bk0Var;
                        oyVar = oyVar2;
                    }
                }
            }
            AIyqmrtNPT = vc0.E7jCp8Ls(rg0Var);
            s9Var = s9Var2;
            this = bk0Var;
            oyVar = oyVar2;
        }
    }

    @Override // defpackage.ub0
    public final cd0 gHe2tSmr6w() {
        cd0 cd0Var = this.M3K9sHhK;
        if (cd0Var != null) {
            return cd0Var;
        }
        o4.jivtDDk9H("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public abstract void gY3jNtCS0(s9 s9Var, oy oyVar);

    @Override // defpackage.k30
    public final p50 getLayoutDirection() {
        return this.mE4lRynR.k8h8IjolWQ;
    }

    @Override // defpackage.ub0
    public final void gqMuANyCes() {
        EDwNPVYuViP0(this.EXrPz3p7hFb, this.ozMwhSAI, this.WdrkLMV3xh);
    }

    @Override // defpackage.ub0
    public final ub0 hOpoc9RpANL() {
        return this.Y6hRI1cF8;
    }

    public abstract he0 iK7aQfvhG();

    public final void jEYdxQDjs(long j, float f, hv hvVar) {
        wDCmwMuMZmB(hvVar, false);
        boolean GWasM1elztuh = u20.GWasM1elztuh(this.EXrPz3p7hFb, j);
        g60 g60Var = this.mE4lRynR;
        if (!GWasM1elztuh) {
            ((c) j60.GWasM1elztuh(g60Var)).DmJncFq5(-4.0f);
            this.EXrPz3p7hFb = j;
            fn0 fn0Var = this.VeqTn1PQw7;
            if (fn0Var != null) {
                ((ry) fn0Var).xqGvceK5x(j);
            } else {
                bk0 bk0Var = this.Y6hRI1cF8;
                if (bk0Var != null) {
                    bk0Var.r8u5JxottJCl();
                }
            }
            g60Var.TpUsjqg3bxO(this);
            ub0.j6IIN2O8eOU(this);
            gn0 gn0Var = g60Var.Mjvvu5DE;
            if (gn0Var != null) {
                ((c) gn0Var).WdrkLMV3xh(g60Var);
            }
        }
        this.ozMwhSAI = f;
        if (this == g60Var.A1EKNP6CxJ.xqGvceK5x) {
            ((c) j60.GWasM1elztuh(g60Var)).getRectManager().EljAMC1QTz(g60Var);
        }
        if (this.iwATDS1i01k) {
            return;
        }
        UjhVk5crk(gHe2tSmr6w());
    }

    @Override // defpackage.ub0
    public final long kbVzROOfKK() {
        return this.EXrPz3p7hFb;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.mE4lRynR.M3K9sHhK.mOu10nynGul();
    }

    public final boolean o6lobyFa() {
        if (this.VeqTn1PQw7 != null && this.pog2g9KITJA <= 0.0f) {
            return true;
        }
        bk0 bk0Var = this.Y6hRI1cF8;
        if (bk0Var != null) {
            return bk0Var.o6lobyFa();
        }
        return false;
    }

    public final kt0 o9oGstcVt9() {
        if (iK7aQfvhG().Mjvvu5DE) {
            n50 iwATDS1i01k = o50.iwATDS1i01k(this);
            gg0 gg0Var = this.AEn1Rrio;
            if (gg0Var == null) {
                gg0Var = new gg0();
                this.AEn1Rrio = gg0Var;
            }
            long Hc2GqxcqBiX = Hc2GqxcqBiX(b9xEq24R1());
            int i = (int) (Hc2GqxcqBiX >> 32);
            gg0Var.GWasM1elztuh = -Float.intBitsToFloat(i);
            int i2 = (int) (Hc2GqxcqBiX & 4294967295L);
            gg0Var.Yi7zF1RB1 = -Float.intBitsToFloat(i2);
            gg0Var.X1lG3V04pd = Float.intBitsToFloat(i) + JFXS9W1rB5s4();
            gg0Var.xqGvceK5x = Float.intBitsToFloat(i2) + ZCWXqiC0();
            while (this != iwATDS1i01k) {
                this.AiiPg05cpff(gg0Var, false, true);
                if (!gg0Var.Yi7zF1RB1()) {
                    this = this.Y6hRI1cF8;
                    this.getClass();
                }
            }
            return new kt0(gg0Var.GWasM1elztuh, gg0Var.Yi7zF1RB1, gg0Var.X1lG3V04pd, gg0Var.xqGvceK5x);
        }
        return kt0.OOA6hdeuvCS;
    }

    public final bk0 oCbv4H4NsA(bk0 bk0Var) {
        g60 g60Var = bk0Var.mE4lRynR;
        g60 g60Var2 = this.mE4lRynR;
        if (g60Var == g60Var2) {
            he0 iK7aQfvhG = bk0Var.iK7aQfvhG();
            he0 iK7aQfvhG2 = iK7aQfvhG();
            if (!iK7aQfvhG2.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitLocalAncestors called on an unattached node");
            }
            for (he0 he0Var = iK7aQfvhG2.OOA6hdeuvCS.mOu10nynGul; he0Var != null; he0Var = he0Var.mOu10nynGul) {
                if ((he0Var.AvO7iQsrTN & 2) != 0 && he0Var == iK7aQfvhG) {
                    return bk0Var;
                }
            }
            return this;
        }
        while (g60Var.mE4lRynR > g60Var2.mE4lRynR) {
            g60Var = g60Var.cilMamHF();
            g60Var.getClass();
        }
        g60 g60Var3 = g60Var2;
        while (g60Var3.mE4lRynR > g60Var.mE4lRynR) {
            g60Var3 = g60Var3.cilMamHF();
            g60Var3.getClass();
        }
        while (g60Var != g60Var3) {
            g60Var = g60Var.cilMamHF();
            g60Var3 = g60Var3.cilMamHF();
            if (g60Var == null || g60Var3 == null) {
                o4.mE4lRynR("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (g60Var3 != g60Var2) {
            if (g60Var != bk0Var.mE4lRynR) {
                return g60Var.A1EKNP6CxJ.X1lG3V04pd;
            }
            return bk0Var;
        }
        return this;
    }

    @Override // defpackage.n50
    public final boolean ozMwhSAI() {
        return iK7aQfvhG().Mjvvu5DE;
    }

    public final long pjimB8cb(long j) {
        if (!iK7aQfvhG().Mjvvu5DE) {
            t10.Yi7zF1RB1("LayoutCoordinate operations are only valid when isAttached is true");
        }
        wc9Ja9tFnR();
        while (this != null) {
            g60 g60Var = this.mE4lRynR;
            if (this == g60Var.A1EKNP6CxJ.xqGvceK5x && !g60Var.AvO7iQsrTN) {
                long Yi7zF1RB1 = ((c) j60.GWasM1elztuh(g60Var)).getRectManager().Yi7zF1RB1(g60Var);
                if (!u20.GWasM1elztuh(Yi7zF1RB1, 9223372034707292159L)) {
                    return qj.rezfBrjOrqK(j, Yi7zF1RB1);
                }
            }
            fn0 fn0Var = this.VeqTn1PQw7;
            if (fn0Var != null) {
                ry ryVar = (ry) fn0Var;
                float[] Yi7zF1RB12 = ryVar.Yi7zF1RB1();
                if (!ryVar.lv06NcmrQ) {
                    j = z50.lv06NcmrQ(Yi7zF1RB12, j);
                }
            }
            j = qj.rezfBrjOrqK(j, this.EXrPz3p7hFb);
            this = this.Y6hRI1cF8;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean psOJLYhIz(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var == null || !this.lv06NcmrQ) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        oy oyVar = ((ry) fn0Var).OOA6hdeuvCS;
        if (oyVar.lv06NcmrQ) {
            z50 xqGvceK5x = oyVar.xqGvceK5x();
            if (!(xqGvceK5x instanceof an0)) {
                if (xqGvceK5x instanceof bn0) {
                    sv0 sv0Var = ((bn0) xqGvceK5x).Yi7zF1RB1;
                    float f = sv0Var.X1lG3V04pd;
                    float f2 = sv0Var.Yi7zF1RB1;
                    float f3 = sv0Var.xqGvceK5x;
                    float f4 = sv0Var.GWasM1elztuh;
                    long j2 = sv0Var.EljAMC1QTz;
                    long j3 = sv0Var.encWxUiV2;
                    z = false;
                    z2 = true;
                    long j4 = sv0Var.AvO7iQsrTN;
                    long j5 = sv0Var.OOA6hdeuvCS;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = z50.Y6hRI1cF8(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, sv0Var.OOA6hdeuvCS);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = z50.Y6hRI1cF8(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, sv0Var.encWxUiV2);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = z50.Y6hRI1cF8(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, sv0Var.AvO7iQsrTN);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = z50.Y6hRI1cF8(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, sv0Var.EljAMC1QTz);
                                        }
                                    }
                                }
                            }
                        }
                        h1 GWasM1elztuh = j1.GWasM1elztuh();
                        h1.Yi7zF1RB1(GWasM1elztuh, sv0Var);
                        z3 = z50.jivtDDk9H(intBitsToFloat, intBitsToFloat2, GWasM1elztuh);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(xqGvceK5x instanceof zm0)) {
                        o4.xqGvceK5x();
                        return false;
                    }
                    z3 = z50.jivtDDk9H(intBitsToFloat, intBitsToFloat2, ((zm0) xqGvceK5x).Yi7zF1RB1);
                }
                return z3 ? z2 : z;
            }
            kt0 kt0Var = ((an0) xqGvceK5x).Yi7zF1RB1;
            if (kt0Var.GWasM1elztuh > intBitsToFloat || intBitsToFloat >= kt0Var.X1lG3V04pd || kt0Var.Yi7zF1RB1 > intBitsToFloat2 || intBitsToFloat2 >= kt0Var.xqGvceK5x) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    public final he0 q2wN4kodRW(boolean z) {
        he0 iK7aQfvhG;
        xj0 xj0Var = this.mE4lRynR.A1EKNP6CxJ;
        if (xj0Var.xqGvceK5x == this) {
            return xj0Var.EljAMC1QTz;
        }
        bk0 bk0Var = this.Y6hRI1cF8;
        if (!z) {
            if (bk0Var != null) {
                return bk0Var.iK7aQfvhG();
            }
            return null;
        }
        if (bk0Var == null || (iK7aQfvhG = bk0Var.iK7aQfvhG()) == null) {
            return null;
        }
        return iK7aQfvhG.JFJ3QoxA;
    }

    public final void r8u5JxottJCl() {
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var != null) {
            ((ry) fn0Var).X1lG3V04pd();
            return;
        }
        bk0 bk0Var = this.Y6hRI1cF8;
        if (bk0Var != null) {
            bk0Var.r8u5JxottJCl();
        }
    }

    public final void sb9fmtV8A(bk0 bk0Var, gg0 gg0Var, boolean z) {
        if (bk0Var == this) {
            return;
        }
        bk0 bk0Var2 = this.Y6hRI1cF8;
        if (bk0Var2 != null) {
            bk0Var2.sb9fmtV8A(bk0Var, gg0Var, z);
        }
        long j = this.EXrPz3p7hFb;
        float f = (int) (j >> 32);
        gg0Var.GWasM1elztuh -= f;
        gg0Var.X1lG3V04pd -= f;
        float f2 = (int) (j & 4294967295L);
        gg0Var.Yi7zF1RB1 -= f2;
        gg0Var.xqGvceK5x -= f2;
        fn0 fn0Var = this.VeqTn1PQw7;
        if (fn0Var != null) {
            ry ryVar = (ry) fn0Var;
            float[] GWasM1elztuh = ryVar.GWasM1elztuh();
            if (!ryVar.lv06NcmrQ) {
                if (GWasM1elztuh == null) {
                    gg0Var.GWasM1elztuh = 0.0f;
                    gg0Var.Yi7zF1RB1 = 0.0f;
                    gg0Var.X1lG3V04pd = 0.0f;
                    gg0Var.xqGvceK5x = 0.0f;
                } else {
                    z50.WdrkLMV3xh(GWasM1elztuh, gg0Var);
                }
            }
            if (this.lv06NcmrQ && z) {
                long j2 = this.AvO7iQsrTN;
                gg0Var.GWasM1elztuh(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public void v7QF4od8F2hR(zj0 zj0Var, long j, nz nzVar, int i, boolean z) {
        bk0 bk0Var = this.jivtDDk9H;
        if (bk0Var != null) {
            bk0Var.NsRGN7gRqWF(zj0Var, bk0Var.R46bVSe7ra(j), nzVar, i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void v9x4KbmAO() {
        boolean AvO7iQsrTN = ck0.AvO7iQsrTN(4194304);
        he0 iK7aQfvhG = iK7aQfvhG();
        if (!AvO7iQsrTN && (iK7aQfvhG = iK7aQfvhG.mOu10nynGul) == null) {
            return;
        }
        for (he0 q2wN4kodRW = q2wN4kodRW(AvO7iQsrTN); q2wN4kodRW != null && (q2wN4kodRW.encWxUiV2 & 4194304) != 0; q2wN4kodRW = q2wN4kodRW.JFJ3QoxA) {
            if ((q2wN4kodRW.AvO7iQsrTN & 4194304) != 0) {
                yk ykVar = q2wN4kodRW;
                ?? r5 = 0;
                while (ykVar != 0) {
                    if (ykVar instanceof l50) {
                        ((l50) ykVar).rQPn8YBR(this);
                    } else if ((ykVar.AvO7iQsrTN & 4194304) != 0 && (ykVar instanceof yk)) {
                        he0 he0Var = ykVar.jivtDDk9H;
                        int i = 0;
                        ykVar = ykVar;
                        r5 = r5;
                        while (he0Var != null) {
                            if ((he0Var.AvO7iQsrTN & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    ykVar = he0Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new rg0(new he0[16]);
                                    }
                                    if (ykVar != 0) {
                                        r5.Yi7zF1RB1(ykVar);
                                        ykVar = 0;
                                    }
                                    r5.Yi7zF1RB1(he0Var);
                                }
                            }
                            he0Var = he0Var.JFJ3QoxA;
                            ykVar = ykVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    ykVar = vc0.E7jCp8Ls(r5);
                }
            }
            if (q2wN4kodRW == iK7aQfvhG) {
                return;
            }
        }
    }

    public final void wDCmwMuMZmB(hv hvVar, boolean z) {
        gn0 gn0Var;
        rg0 rg0Var;
        Reference poll;
        v vVar;
        rg0 rg0Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        g60 g60Var = this.mE4lRynR;
        boolean z2 = (!z && this.WdrkLMV3xh == hvVar && o30.rQPn8YBR(this.WRKkgoJXwDn, g60Var.M3K9sHhK) && this.arNh8D4Z5gB == g60Var.k8h8IjolWQ) ? false : true;
        this.WRKkgoJXwDn = g60Var.M3K9sHhK;
        this.arNh8D4Z5gB = g60Var.k8h8IjolWQ;
        boolean eUH21U3apd = g60Var.eUH21U3apd();
        ak0 ak0Var = this.TpUsjqg3bxO;
        if (!eUH21U3apd || hvVar == null) {
            this.WdrkLMV3xh = null;
            fn0 fn0Var = this.VeqTn1PQw7;
            if (fn0Var != null) {
                ry ryVar = (ry) fn0Var;
                if (!n4.uFEq9NpZ(ryVar.Yi7zF1RB1())) {
                    g60Var.TpUsjqg3bxO(this);
                }
                ryVar.encWxUiV2 = null;
                ryVar.mOu10nynGul = null;
                ryVar.rQPn8YBR = true;
                ryVar.EljAMC1QTz(false);
                ny nyVar = ryVar.EljAMC1QTz;
                if (nyVar != null) {
                    nyVar.GWasM1elztuh(ryVar.OOA6hdeuvCS);
                    c cVar = ryVar.AvO7iQsrTN;
                    d dVar = cVar.gHe2tSmr6w;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) dVar.AvO7iQsrTN;
                        rg0Var = (rg0) dVar.EljAMC1QTz;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            rg0Var.JFJ3QoxA(poll);
                        }
                    } while (poll != null);
                    rg0Var.Yi7zF1RB1(new WeakReference(ryVar, (ReferenceQueue) dVar.AvO7iQsrTN));
                    cVar.A1EKNP6CxJ.JFJ3QoxA(ryVar);
                }
                this.VeqTn1PQw7 = null;
                g60Var.rezfBrjOrqK = true;
                ak0Var.GWasM1elztuh();
                if (iK7aQfvhG().Mjvvu5DE && g60Var.A1EKNP6CxJ() && (gn0Var = g60Var.Mjvvu5DE) != null) {
                    ((c) gn0Var).WdrkLMV3xh(g60Var);
                }
            }
            this.dqB83aoLBB = false;
            return;
        }
        this.WdrkLMV3xh = hvVar;
        if (this.VeqTn1PQw7 != null) {
            if (z2) {
                LTGLyn7xQ(true);
                return;
            }
            return;
        }
        gn0 GWasM1elztuh = j60.GWasM1elztuh(g60Var);
        v vVar2 = this.rezfBrjOrqK;
        if (vVar2 == null) {
            v vVar3 = new v(2, this, new ak0(this, i));
            this.rezfBrjOrqK = vVar3;
            vVar = vVar3;
        } else {
            vVar = vVar2;
        }
        c cVar2 = (c) GWasM1elztuh;
        d dVar2 = cVar2.gHe2tSmr6w;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) dVar2.AvO7iQsrTN;
            rg0Var2 = (rg0) dVar2.EljAMC1QTz;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                rg0Var2.JFJ3QoxA(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = rg0Var2.AvO7iQsrTN;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) rg0Var2.rQPn8YBR(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        fn0 fn0Var2 = (fn0) obj;
        if (fn0Var2 != null) {
            ry ryVar2 = (ry) fn0Var2;
            ny nyVar2 = ryVar2.EljAMC1QTz;
            if (nyVar2 == null) {
                throw mr0.EljAMC1QTz("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!ryVar2.OOA6hdeuvCS.mE4lRynR) {
                t10.GWasM1elztuh("layer should have been released before reuse");
            }
            ryVar2.OOA6hdeuvCS = nyVar2.Yi7zF1RB1();
            ryVar2.rQPn8YBR = false;
            ryVar2.encWxUiV2 = vVar;
            ryVar2.mOu10nynGul = ak0Var;
            ryVar2.Y6hRI1cF8 = false;
            ryVar2.cilMamHF = false;
            ryVar2.lv06NcmrQ = true;
            z50.M3K9sHhK(ryVar2.E7jCp8Ls);
            float[] fArr = ryVar2.XnEVoBF0td1l;
            if (fArr != null) {
                z50.M3K9sHhK(fArr);
            }
            ryVar2.mE4lRynR = ga1.Yi7zF1RB1;
            ryVar2.WdrkLMV3xh = false;
            ryVar2.JFJ3QoxA = 9223372034707292159L;
            ryVar2.jivtDDk9H = null;
            ryVar2.Mjvvu5DE = 0;
        } else {
            fn0Var2 = new ry(cVar2.getGraphicsContext().Yi7zF1RB1(), cVar2.getGraphicsContext(), cVar2, vVar, ak0Var);
        }
        ry ryVar3 = (ry) fn0Var2;
        ryVar3.OOA6hdeuvCS(this.AvO7iQsrTN);
        ryVar3.xqGvceK5x(this.EXrPz3p7hFb);
        this.VeqTn1PQw7 = fn0Var2;
        LTGLyn7xQ(true);
        g60Var.rezfBrjOrqK = true;
        ak0Var.GWasM1elztuh();
    }

    public final void wc9Ja9tFnR() {
        this.mE4lRynR.MZhzXH72.Yi7zF1RB1();
    }

    @Override // defpackage.ub0
    public final n50 vaTCmWUgXF() {
        return this;
    }
}
