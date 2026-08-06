package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class e41 {
    public static final x0 AvO7iQsrTN;
    public static final hf0 EljAMC1QTz;
    public static final jy JFJ3QoxA;
    public static long OOA6hdeuvCS;
    public static List encWxUiV2;
    public static List mOu10nynGul;
    public static final i5 rQPn8YBR;
    public static c41 xqGvceK5x;
    public static final dx0 GWasM1elztuh = new dx0(23);
    public static final f4 Yi7zF1RB1 = new f4(15);
    public static final Object X1lG3V04pd = new Object();

    static {
        c41 c41Var = c41.mOu10nynGul;
        xqGvceK5x = c41Var;
        OOA6hdeuvCS = 2L;
        hf0 hf0Var = new hf0();
        hf0Var.X1lG3V04pd = new long[16];
        hf0Var.xqGvceK5x = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        hf0Var.OOA6hdeuvCS = iArr;
        EljAMC1QTz = hf0Var;
        x0 x0Var = new x0();
        x0Var.Yi7zF1RB1 = new int[16];
        x0Var.X1lG3V04pd = new mf1[16];
        AvO7iQsrTN = x0Var;
        xp xpVar = xp.OOA6hdeuvCS;
        encWxUiV2 = xpVar;
        mOu10nynGul = xpVar;
        long j = OOA6hdeuvCS;
        OOA6hdeuvCS = 1 + j;
        jy jyVar = new jy(j, c41Var, null, new bCsSzSHkbaQ(20));
        xqGvceK5x = xqGvceK5x.EljAMC1QTz(jyVar.Yi7zF1RB1);
        JFJ3QoxA = jyVar;
        rQPn8YBR = new i5(0);
    }

    public static final y31 AvO7iQsrTN(y31 y31Var, hv hvVar, boolean z) {
        boolean z2 = y31Var instanceof lg0;
        if (z2 || y31Var == null) {
            return new sa1(z2 ? (lg0) y31Var : null, hvVar, null, false, z);
        }
        return new ta1(y31Var, hvVar, false, z);
    }

    public static final hv E7jCp8Ls(hv hvVar, hv hvVar2) {
        return (hvVar == null || hvVar2 == null || hvVar == hvVar2) ? hvVar == null ? hvVar2 : hvVar : new d41(hvVar, hvVar2, 1);
    }

    public static final void EljAMC1QTz() {
        x0 x0Var = AvO7iQsrTN;
        int i = x0Var.GWasM1elztuh;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            mf1 mf1Var = ((mf1[]) x0Var.X1lG3V04pd)[i2];
            Object obj = mf1Var != null ? mf1Var.get() : null;
            if (obj != null && WIEu4Ya2g8((s51) obj)) {
                if (i3 != i2) {
                    ((mf1[]) x0Var.X1lG3V04pd)[i3] = mf1Var;
                    int[] iArr = (int[]) x0Var.Yi7zF1RB1;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((mf1[]) x0Var.X1lG3V04pd)[i4] = null;
            ((int[]) x0Var.Yi7zF1RB1)[i4] = 0;
        }
        if (i3 != i) {
            x0Var.GWasM1elztuh = i3;
        }
    }

    public static final void GWasM1elztuh() {
        OOA6hdeuvCS(GWasM1elztuh);
    }

    public static final y31 JFJ3QoxA() {
        y31 y31Var = (y31) Yi7zF1RB1.OOA6hdeuvCS();
        return y31Var == null ? JFJ3QoxA : y31Var;
    }

    public static final void Mjvvu5DE() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final Object OOA6hdeuvCS(hv hvVar) {
        ig0 ig0Var;
        Object cilMamHF;
        jy jyVar = JFJ3QoxA;
        synchronized (X1lG3V04pd) {
            try {
                ig0Var = jyVar.encWxUiV2;
                if (ig0Var != null) {
                    rQPn8YBR.addAndGet(1);
                }
                cilMamHF = cilMamHF(jyVar, hvVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ig0Var != null) {
            try {
                List list = encWxUiV2;
                mx0 mx0Var = new mx0(ig0Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((lv) list.get(i)).EljAMC1QTz(mx0Var, jyVar);
                }
            } finally {
                rQPn8YBR.addAndGet(-1);
            }
        }
        synchronized (X1lG3V04pd) {
            EljAMC1QTz();
            if (ig0Var != null) {
                Object[] objArr = ig0Var.Yi7zF1RB1;
                long[] jArr = ig0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    YmKjaVtbfp5Z((s51) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return cilMamHF;
    }

    public static final boolean WIEu4Ya2g8(s51 s51Var) {
        u51 u51Var;
        long j = OOA6hdeuvCS;
        hf0 hf0Var = EljAMC1QTz;
        if (hf0Var.GWasM1elztuh > 0) {
            j = ((long[]) hf0Var.X1lG3V04pd)[0];
        }
        u51 u51Var2 = null;
        u51 u51Var3 = null;
        int i = 0;
        for (u51 GWasM1elztuh2 = s51Var.GWasM1elztuh(); GWasM1elztuh2 != null; GWasM1elztuh2 = GWasM1elztuh2.Yi7zF1RB1) {
            long j2 = GWasM1elztuh2.GWasM1elztuh;
            if (j2 != 0) {
                if (o30.iwATDS1i01k(j2, j) >= 0) {
                    i++;
                } else if (u51Var2 == null) {
                    i++;
                    u51Var2 = GWasM1elztuh2;
                } else {
                    if (o30.iwATDS1i01k(GWasM1elztuh2.GWasM1elztuh, u51Var2.GWasM1elztuh) < 0) {
                        u51Var = u51Var2;
                        u51Var2 = GWasM1elztuh2;
                    } else {
                        u51Var = GWasM1elztuh2;
                    }
                    if (u51Var3 == null) {
                        u51Var3 = s51Var.GWasM1elztuh();
                        u51 u51Var4 = u51Var3;
                        while (true) {
                            if (u51Var3 == null) {
                                u51Var3 = u51Var4;
                                break;
                            }
                            if (o30.iwATDS1i01k(u51Var3.GWasM1elztuh, j) >= 0) {
                                break;
                            }
                            if (o30.iwATDS1i01k(u51Var4.GWasM1elztuh, u51Var3.GWasM1elztuh) < 0) {
                                u51Var4 = u51Var3;
                            }
                            u51Var3 = u51Var3.Yi7zF1RB1;
                        }
                    }
                    u51Var2.GWasM1elztuh = 0L;
                    u51Var2.GWasM1elztuh(u51Var3);
                    u51Var2 = u51Var;
                }
            }
        }
        return i > 1;
    }

    public static final void X1lG3V04pd(y31 y31Var) {
        long j;
        if (xqGvceK5x.X1lG3V04pd(y31Var.AvO7iQsrTN())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(y31Var.AvO7iQsrTN());
        sb.append(", disposed=");
        sb.append(y31Var.X1lG3V04pd);
        sb.append(", applied=");
        lg0 lg0Var = y31Var instanceof lg0 ? (lg0) y31Var : null;
        sb.append(lg0Var != null ? Boolean.valueOf(lg0Var.XnEVoBF0td1l) : "read-only");
        sb.append(", lowestPin=");
        synchronized (X1lG3V04pd) {
            hf0 hf0Var = EljAMC1QTz;
            j = hf0Var.GWasM1elztuh > 0 ? ((long[]) hf0Var.X1lG3V04pd)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u51 XnEVoBF0td1l(u51 u51Var, s51 s51Var) {
        u51 GWasM1elztuh2 = s51Var.GWasM1elztuh();
        long j = OOA6hdeuvCS;
        hf0 hf0Var = EljAMC1QTz;
        if (hf0Var.GWasM1elztuh > 0) {
            j = ((long[]) hf0Var.X1lG3V04pd)[0];
        }
        long j2 = j - 1;
        u51 u51Var2 = null;
        u51 u51Var3 = null;
        while (true) {
            if (GWasM1elztuh2 == null) {
                break;
            }
            long j3 = GWasM1elztuh2.GWasM1elztuh;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && o30.iwATDS1i01k(j3, j2) <= 0 && !c41.mOu10nynGul.X1lG3V04pd(j3)) {
                if (u51Var3 == null) {
                    u51Var3 = GWasM1elztuh2;
                } else if (o30.iwATDS1i01k(GWasM1elztuh2.GWasM1elztuh, u51Var3.GWasM1elztuh) >= 0) {
                    u51Var2 = u51Var3;
                }
            }
            GWasM1elztuh2 = GWasM1elztuh2.Yi7zF1RB1;
        }
        if (u51Var2 != null) {
            u51Var2.GWasM1elztuh = Long.MAX_VALUE;
            return u51Var2;
        }
        u51 Yi7zF1RB12 = u51Var.Yi7zF1RB1(Long.MAX_VALUE);
        Yi7zF1RB12.Yi7zF1RB1 = s51Var.GWasM1elztuh();
        s51Var.X1lG3V04pd(Yi7zF1RB12);
        return Yi7zF1RB12;
    }

    public static final void Y6hRI1cF8(int i) {
        hf0 hf0Var = EljAMC1QTz;
        int i2 = ((int[]) hf0Var.OOA6hdeuvCS)[i];
        hf0Var.X1lG3V04pd(i2, hf0Var.GWasM1elztuh - 1);
        hf0Var.GWasM1elztuh--;
        long[] jArr = (long[]) hf0Var.X1lG3V04pd;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (o30.iwATDS1i01k(jArr[i4], j) <= 0) {
                break;
            }
            hf0Var.X1lG3V04pd(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) hf0Var.X1lG3V04pd;
        int i5 = hf0Var.GWasM1elztuh >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < hf0Var.GWasM1elztuh && o30.iwATDS1i01k(jArr2[i6], jArr2[i7]) < 0) {
                if (o30.iwATDS1i01k(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                hf0Var.X1lG3V04pd(i6, i2);
                i2 = i6;
            } else {
                if (o30.iwATDS1i01k(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                hf0Var.X1lG3V04pd(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) hf0Var.OOA6hdeuvCS)[i] = hf0Var.Yi7zF1RB1;
        hf0Var.Yi7zF1RB1 = i;
    }

    public static final HashMap Yi7zF1RB1(long j, lg0 lg0Var, c41 c41Var) {
        long[] jArr;
        c41 c41Var2;
        long[] jArr2;
        c41 c41Var3;
        int i;
        int i2;
        u51 mE4lRynR;
        ig0 WdrkLMV3xh = lg0Var.WdrkLMV3xh();
        if (WdrkLMV3xh != null) {
            long AvO7iQsrTN2 = lg0Var.AvO7iQsrTN();
            c41 OOA6hdeuvCS2 = lg0Var.xqGvceK5x().EljAMC1QTz(AvO7iQsrTN2).OOA6hdeuvCS(lg0Var.JFJ3QoxA);
            Object[] objArr = WdrkLMV3xh.Yi7zF1RB1;
            long[] jArr3 = WdrkLMV3xh.GWasM1elztuh;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                s51 s51Var = (s51) objArr[(i3 << 3) + i6];
                                u51 GWasM1elztuh2 = s51Var.GWasM1elztuh();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                u51 mE4lRynR2 = mE4lRynR(GWasM1elztuh2, j, c41Var);
                                if (mE4lRynR2 == null || (mE4lRynR = mE4lRynR(GWasM1elztuh2, AvO7iQsrTN2, OOA6hdeuvCS2)) == null || mE4lRynR2.equals(mE4lRynR)) {
                                    c41Var3 = OOA6hdeuvCS2;
                                } else {
                                    c41Var3 = OOA6hdeuvCS2;
                                    u51 mE4lRynR3 = mE4lRynR(GWasM1elztuh2, AvO7iQsrTN2, lg0Var.xqGvceK5x());
                                    if (mE4lRynR3 == null) {
                                        Mjvvu5DE();
                                        throw null;
                                    }
                                    u51 Yi7zF1RB12 = s51Var.Yi7zF1RB1(mE4lRynR, mE4lRynR2, mE4lRynR3);
                                    if (Yi7zF1RB12 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(mE4lRynR2, Yi7zF1RB12);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                c41Var3 = OOA6hdeuvCS2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            OOA6hdeuvCS2 = c41Var3;
                        }
                        jArr = jArr3;
                        c41Var2 = OOA6hdeuvCS2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        c41Var2 = OOA6hdeuvCS2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    OOA6hdeuvCS2 = c41Var2;
                }
            }
        }
        return null;
    }

    public static final void YmKjaVtbfp5Z(s51 s51Var) {
        if (WIEu4Ya2g8(s51Var)) {
            x0 x0Var = AvO7iQsrTN;
            int i = x0Var.GWasM1elztuh;
            int identityHashCode = System.identityHashCode(s51Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = x0Var.GWasM1elztuh - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) x0Var.Yi7zF1RB1)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        mf1 mf1Var = ((mf1[]) x0Var.X1lG3V04pd)[i5];
                        if (s51Var != (mf1Var != null ? mf1Var.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) x0Var.Yi7zF1RB1)[i7] == identityHashCode; i7--) {
                                mf1 mf1Var2 = ((mf1[]) x0Var.X1lG3V04pd)[i7];
                                if ((mf1Var2 != null ? mf1Var2.get() : null) == s51Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = x0Var.GWasM1elztuh;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(x0Var.GWasM1elztuh + 1);
                                    break;
                                } else {
                                    if (((int[]) x0Var.Yi7zF1RB1)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    mf1 mf1Var3 = ((mf1[]) x0Var.X1lG3V04pd)[i5];
                                    if ((mf1Var3 != null ? mf1Var3.get() : null) == s51Var) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            mf1[] mf1VarArr = (mf1[]) x0Var.X1lG3V04pd;
            int length = mf1VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                mf1[] mf1VarArr2 = new mf1[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(mf1VarArr, i9, mf1VarArr2, i11, i - i9);
                System.arraycopy((mf1[]) x0Var.X1lG3V04pd, 0, mf1VarArr2, 0, i9);
                d5.MjxSquD6Av((int[]) x0Var.Yi7zF1RB1, iArr, i11, i9, i);
                d5.c4eaifQP((int[]) x0Var.Yi7zF1RB1, iArr, 0, i9, 6);
                x0Var.X1lG3V04pd = mf1VarArr2;
                x0Var.Yi7zF1RB1 = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(mf1VarArr, i9, mf1VarArr, i12, i - i9);
                int[] iArr2 = (int[]) x0Var.Yi7zF1RB1;
                d5.MjxSquD6Av(iArr2, iArr2, i12, i9, i);
            }
            ((mf1[]) x0Var.X1lG3V04pd)[i9] = new mf1(s51Var);
            ((int[]) x0Var.Yi7zF1RB1)[i9] = identityHashCode;
            x0Var.GWasM1elztuh++;
        }
    }

    public static final Object cilMamHF(jy jyVar, hv hvVar) {
        long j = jyVar.Yi7zF1RB1;
        Object mOu10nynGul2 = hvVar.mOu10nynGul(xqGvceK5x.Yi7zF1RB1(j));
        long j2 = OOA6hdeuvCS;
        OOA6hdeuvCS = 1 + j2;
        c41 Yi7zF1RB12 = xqGvceK5x.Yi7zF1RB1(j);
        xqGvceK5x = Yi7zF1RB12;
        jyVar.Yi7zF1RB1 = j2;
        jyVar.GWasM1elztuh = Yi7zF1RB12;
        jyVar.AvO7iQsrTN = 0;
        jyVar.encWxUiV2 = null;
        jyVar.iwATDS1i01k();
        xqGvceK5x = xqGvceK5x.EljAMC1QTz(j2);
        return mOu10nynGul2;
    }

    public static final u51 encWxUiV2(u51 u51Var) {
        u51 mE4lRynR;
        y31 JFJ3QoxA2 = JFJ3QoxA();
        u51 mE4lRynR2 = mE4lRynR(u51Var, JFJ3QoxA2.AvO7iQsrTN(), JFJ3QoxA2.xqGvceK5x());
        if (mE4lRynR2 != null) {
            return mE4lRynR2;
        }
        synchronized (X1lG3V04pd) {
            y31 JFJ3QoxA3 = JFJ3QoxA();
            mE4lRynR = mE4lRynR(u51Var, JFJ3QoxA3.AvO7iQsrTN(), JFJ3QoxA3.xqGvceK5x());
        }
        if (mE4lRynR != null) {
            return mE4lRynR;
        }
        Mjvvu5DE();
        throw null;
    }

    public static final u51 iwATDS1i01k(u51 u51Var, t51 t51Var, y31 y31Var, u51 u51Var2) {
        u51 XnEVoBF0td1l;
        if (y31Var.EljAMC1QTz()) {
            y31Var.uFEq9NpZ(t51Var);
        }
        long AvO7iQsrTN2 = y31Var.AvO7iQsrTN();
        if (u51Var2.GWasM1elztuh == AvO7iQsrTN2) {
            return u51Var2;
        }
        synchronized (X1lG3V04pd) {
            XnEVoBF0td1l = XnEVoBF0td1l(u51Var, t51Var);
        }
        XnEVoBF0td1l.GWasM1elztuh = AvO7iQsrTN2;
        if (u51Var2.GWasM1elztuh != 1) {
            y31Var.uFEq9NpZ(t51Var);
        }
        return XnEVoBF0td1l;
    }

    public static final u51 jivtDDk9H(u51 u51Var, s51 s51Var) {
        u51 mE4lRynR;
        y31 JFJ3QoxA2 = JFJ3QoxA();
        hv OOA6hdeuvCS2 = JFJ3QoxA2.OOA6hdeuvCS();
        if (OOA6hdeuvCS2 != null) {
            OOA6hdeuvCS2.mOu10nynGul(s51Var);
        }
        u51 mE4lRynR2 = mE4lRynR(u51Var, JFJ3QoxA2.AvO7iQsrTN(), JFJ3QoxA2.xqGvceK5x());
        if (mE4lRynR2 != null) {
            return mE4lRynR2;
        }
        synchronized (X1lG3V04pd) {
            y31 JFJ3QoxA3 = JFJ3QoxA();
            u51 GWasM1elztuh2 = s51Var.GWasM1elztuh();
            GWasM1elztuh2.getClass();
            mE4lRynR = mE4lRynR(GWasM1elztuh2, JFJ3QoxA3.AvO7iQsrTN(), JFJ3QoxA3.xqGvceK5x());
            if (mE4lRynR == null) {
                Mjvvu5DE();
                throw null;
            }
        }
        return mE4lRynR;
    }

    public static final u51 lv06NcmrQ(u51 u51Var, s51 s51Var, y31 y31Var) {
        u51 mE4lRynR;
        if (y31Var.EljAMC1QTz()) {
            y31Var.uFEq9NpZ(s51Var);
        }
        long AvO7iQsrTN2 = y31Var.AvO7iQsrTN();
        u51 mE4lRynR2 = mE4lRynR(u51Var, AvO7iQsrTN2, y31Var.xqGvceK5x());
        if (mE4lRynR2 == null) {
            Mjvvu5DE();
            throw null;
        }
        if (mE4lRynR2.GWasM1elztuh == y31Var.AvO7iQsrTN()) {
            return mE4lRynR2;
        }
        synchronized (X1lG3V04pd) {
            mE4lRynR = mE4lRynR(s51Var.GWasM1elztuh(), AvO7iQsrTN2, y31Var.xqGvceK5x());
            if (mE4lRynR == null) {
                Mjvvu5DE();
                throw null;
            }
            if (mE4lRynR.GWasM1elztuh != AvO7iQsrTN2) {
                u51 XnEVoBF0td1l = XnEVoBF0td1l(mE4lRynR, s51Var);
                XnEVoBF0td1l.GWasM1elztuh(mE4lRynR);
                XnEVoBF0td1l.GWasM1elztuh = y31Var.AvO7iQsrTN();
                mE4lRynR = XnEVoBF0td1l;
            }
        }
        if (mE4lRynR2.GWasM1elztuh != 1) {
            y31Var.uFEq9NpZ(s51Var);
        }
        return mE4lRynR;
    }

    public static final u51 mE4lRynR(u51 u51Var, long j, c41 c41Var) {
        u51 u51Var2 = null;
        while (u51Var != null) {
            long j2 = u51Var.GWasM1elztuh;
            if (j2 != 0 && o30.iwATDS1i01k(j2, j) <= 0 && !c41Var.X1lG3V04pd(j2) && (u51Var2 == null || o30.iwATDS1i01k(u51Var2.GWasM1elztuh, u51Var.GWasM1elztuh) < 0)) {
                u51Var2 = u51Var;
            }
            u51Var = u51Var.Yi7zF1RB1;
        }
        if (u51Var2 != null) {
            return u51Var2;
        }
        return null;
    }

    public static final u51 mOu10nynGul(u51 u51Var, y31 y31Var) {
        u51 mE4lRynR;
        u51 mE4lRynR2 = mE4lRynR(u51Var, y31Var.AvO7iQsrTN(), y31Var.xqGvceK5x());
        if (mE4lRynR2 != null) {
            return mE4lRynR2;
        }
        synchronized (X1lG3V04pd) {
            mE4lRynR = mE4lRynR(u51Var, y31Var.AvO7iQsrTN(), y31Var.xqGvceK5x());
        }
        if (mE4lRynR != null) {
            return mE4lRynR;
        }
        Mjvvu5DE();
        throw null;
    }

    public static final hv rQPn8YBR(hv hvVar, hv hvVar2, boolean z) {
        if (!z) {
            hvVar2 = null;
        }
        return (hvVar == null || hvVar2 == null || hvVar == hvVar2) ? hvVar == null ? hvVar2 : hvVar : new d41(hvVar, hvVar2, 0);
    }

    public static final void uFEq9NpZ(y31 y31Var, s51 s51Var) {
        y31Var.jivtDDk9H(y31Var.encWxUiV2() + 1);
        hv mOu10nynGul2 = y31Var.mOu10nynGul();
        if (mOu10nynGul2 != null) {
            mOu10nynGul2.mOu10nynGul(s51Var);
        }
    }

    public static final c41 xqGvceK5x(c41 c41Var, long j, long j2) {
        while (o30.iwATDS1i01k(j, j2) < 0) {
            c41Var = c41Var.EljAMC1QTz(j);
            j++;
        }
        return c41Var;
    }
}
