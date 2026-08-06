package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uj0 extends gk0 {
    public gq0 AvO7iQsrTN;
    public bk0 EljAMC1QTz;
    public boolean JFJ3QoxA;
    public final qb0 OOA6hdeuvCS;
    public final he0 X1lG3V04pd;
    public boolean encWxUiV2;
    public boolean mOu10nynGul;
    public final qu xqGvceK5x;

    public uj0(he0 he0Var) {
        this.X1lG3V04pd = he0Var;
        qu quVar = new qu();
        quVar.Yi7zF1RB1 = new long[2];
        this.xqGvceK5x = quVar;
        this.OOA6hdeuvCS = new qb0(2);
        this.mOu10nynGul = true;
        this.JFJ3QoxA = true;
    }

    public final void EljAMC1QTz(long j, ag0 ag0Var) {
        qu quVar = this.xqGvceK5x;
        if (quVar.Yi7zF1RB1(j) && ag0Var.AvO7iQsrTN(this) < 0) {
            quVar.X1lG3V04pd(j);
            this.OOA6hdeuvCS.X1lG3V04pd(j);
        }
        rg0 rg0Var = this.GWasM1elztuh;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ((uj0) objArr[i2]).EljAMC1QTz(j, ag0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.gk0
    public final boolean GWasM1elztuh(qb0 qb0Var, n50 n50Var, d dVar, boolean z) {
        qu quVar;
        qb0 qb0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        gq0 gq0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        kq0 kq0Var;
        n50 n50Var2 = n50Var;
        boolean GWasM1elztuh = super.GWasM1elztuh(qb0Var, n50Var, dVar, z);
        yk ykVar = this.X1lG3V04pd;
        boolean z6 = true;
        if (ykVar.Mjvvu5DE) {
            ?? r8 = 0;
            while (ykVar != 0) {
                if (ykVar instanceof nq0) {
                    this.EljAMC1QTz = vc0.AEn1Rrio((nq0) ykVar, 16);
                } else if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                    he0 he0Var = ykVar.jivtDDk9H;
                    int i6 = 0;
                    ykVar = ykVar;
                    r8 = r8;
                    while (he0Var != null) {
                        if ((he0Var.AvO7iQsrTN & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                ykVar = he0Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new rg0(new he0[16]);
                                }
                                if (ykVar != 0) {
                                    r8.Yi7zF1RB1(ykVar);
                                    ykVar = 0;
                                }
                                r8.Yi7zF1RB1(he0Var);
                            }
                        }
                        he0Var = he0Var.JFJ3QoxA;
                        ykVar = ykVar;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                ykVar = vc0.E7jCp8Ls(r8);
            }
            if (this.EljAMC1QTz != null) {
                int xqGvceK5x = qb0Var.xqGvceK5x();
                int i7 = 0;
                while (true) {
                    quVar = this.xqGvceK5x;
                    qb0Var2 = this.OOA6hdeuvCS;
                    if (i7 >= xqGvceK5x) {
                        break;
                    }
                    long GWasM1elztuh2 = qb0Var.GWasM1elztuh(i7);
                    kq0 kq0Var2 = (kq0) qb0Var.OOA6hdeuvCS(i7);
                    if (quVar.Yi7zF1RB1(GWasM1elztuh2)) {
                        boolean z7 = z6;
                        long j = kq0Var2.AvO7iQsrTN;
                        List list = kq0Var2.XnEVoBF0td1l;
                        long j2 = kq0Var2.X1lG3V04pd;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            List list2 = xp.OOA6hdeuvCS;
                            z4 = GWasM1elztuh;
                            ArrayList arrayList = new ArrayList((list == null ? list2 : list).size());
                            List list3 = list == null ? list2 : list;
                            i3 = xqGvceK5x;
                            int size = list3.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list4 = list3;
                                jz jzVar = (jz) list3.get(i8);
                                qb0 qb0Var3 = qb0Var2;
                                long j3 = GWasM1elztuh2;
                                long j4 = jzVar.Yi7zF1RB1;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    kq0Var = kq0Var2;
                                    long j5 = jzVar.GWasM1elztuh;
                                    i5 = size;
                                    bk0 bk0Var = this.EljAMC1QTz;
                                    bk0Var.getClass();
                                    arrayList.add(new jz(j5, bk0Var.YZjbz8VdP5(n50Var2, j4), jzVar.X1lG3V04pd, jzVar.xqGvceK5x, jzVar.OOA6hdeuvCS));
                                } else {
                                    i5 = size;
                                    kq0Var = kq0Var2;
                                }
                                i8++;
                                size = i5;
                                list3 = list4;
                                qb0Var2 = qb0Var3;
                                GWasM1elztuh2 = j3;
                                kq0Var2 = kq0Var;
                            }
                            qb0 qb0Var4 = qb0Var2;
                            long j6 = GWasM1elztuh2;
                            bk0 bk0Var2 = this.EljAMC1QTz;
                            bk0Var2.getClass();
                            long YZjbz8VdP5 = bk0Var2.YZjbz8VdP5(n50Var2, j);
                            bk0 bk0Var3 = this.EljAMC1QTz;
                            bk0Var3.getClass();
                            kq0 kq0Var3 = new kq0(kq0Var2.GWasM1elztuh, kq0Var2.Yi7zF1RB1, bk0Var3.YZjbz8VdP5(n50Var2, j2), kq0Var2.xqGvceK5x, kq0Var2.OOA6hdeuvCS, kq0Var2.EljAMC1QTz, YZjbz8VdP5, kq0Var2.encWxUiV2, kq0Var2.mOu10nynGul, arrayList, kq0Var2.JFJ3QoxA, kq0Var2.rQPn8YBR, kq0Var2.E7jCp8Ls, kq0Var2.uFEq9NpZ);
                            kq0 kq0Var4 = kq0Var2.YmKjaVtbfp5Z;
                            if (kq0Var4 == null) {
                                kq0Var4 = kq0Var2;
                            }
                            kq0Var3.YmKjaVtbfp5Z = kq0Var4;
                            kq0 kq0Var5 = kq0Var2.YmKjaVtbfp5Z;
                            if (kq0Var5 != null) {
                                kq0Var2 = kq0Var5;
                            }
                            kq0Var3.YmKjaVtbfp5Z = kq0Var2;
                            qb0Var4.Yi7zF1RB1(j6, kq0Var3);
                        } else {
                            z4 = GWasM1elztuh;
                            i3 = xqGvceK5x;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = GWasM1elztuh;
                        i3 = xqGvceK5x;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    n50Var2 = n50Var;
                    xqGvceK5x = i3;
                    z6 = z5;
                    GWasM1elztuh = z4;
                }
                boolean z8 = GWasM1elztuh;
                boolean z9 = z6;
                if (qb0Var2.xqGvceK5x() == 0) {
                    quVar.GWasM1elztuh = 0;
                    this.GWasM1elztuh.AvO7iQsrTN();
                    return z9;
                }
                int i9 = quVar.GWasM1elztuh;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) quVar.Yi7zF1RB1)[i9];
                    if (qb0Var.OOA6hdeuvCS) {
                        int i10 = qb0Var.encWxUiV2;
                        long[] jArr = qb0Var.EljAMC1QTz;
                        Object[] objArr = qb0Var.AvO7iQsrTN;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != ki1.mOu10nynGul) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        qb0Var.OOA6hdeuvCS = false;
                        qb0Var.encWxUiV2 = i11;
                    }
                    if (fb1.iwATDS1i01k(qb0Var.EljAMC1QTz, qb0Var.encWxUiV2, j7) < 0 && i9 < (i2 = quVar.GWasM1elztuh)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) quVar.Yi7zF1RB1;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        quVar.GWasM1elztuh--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qb0Var2.xqGvceK5x());
                int xqGvceK5x2 = qb0Var2.xqGvceK5x();
                for (int i16 = 0; i16 < xqGvceK5x2; i16++) {
                    arrayList2.add(qb0Var2.OOA6hdeuvCS(i16));
                }
                gq0 gq0Var2 = new gq0(arrayList2, dVar);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (dVar.JFJ3QoxA(((kq0) obj).GWasM1elztuh)) {
                        break;
                    }
                    i17++;
                }
                kq0 kq0Var6 = (kq0) obj;
                if (kq0Var6 != null) {
                    boolean z10 = kq0Var6.xqGvceK5x;
                    if (z) {
                        z2 = false;
                        if (!this.mOu10nynGul && (z10 || kq0Var6.encWxUiV2)) {
                            bk0 bk0Var4 = this.EljAMC1QTz;
                            bk0Var4.getClass();
                            long j8 = bk0Var4.AvO7iQsrTN;
                            long j9 = kq0Var6.X1lG3V04pd;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.mOu10nynGul = !((intBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (intBitsToFloat2 < 0.0f ? z9 : false) | (intBitsToFloat > ((float) i18) ? z9 : false) | (intBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.mOu10nynGul = false;
                    }
                    boolean z11 = this.mOu10nynGul;
                    boolean z12 = this.encWxUiV2;
                    if (z11 == z12 || !((i = gq0Var2.X1lG3V04pd) == 3 || i == 4 || i == 5)) {
                        int i19 = gq0Var2.X1lG3V04pd;
                        if (i19 == 4 && z12 && !this.JFJ3QoxA) {
                            gq0Var2.X1lG3V04pd = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            gq0Var2.X1lG3V04pd = 3;
                        }
                    } else {
                        gq0Var2.X1lG3V04pd = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && gq0Var2.X1lG3V04pd == 3 && (gq0Var = this.AvO7iQsrTN) != null) {
                    ?? r1 = gq0Var.GWasM1elztuh;
                    int size3 = r1.size();
                    ?? r4 = gq0Var2.GWasM1elztuh;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (uk0.Yi7zF1RB1(((kq0) r1.get(r5)).X1lG3V04pd, ((kq0) r4.get(r5)).X1lG3V04pd)) {
                            }
                        }
                        z3 = z2;
                        this.AvO7iQsrTN = gq0Var2;
                        return z3;
                    }
                }
                z3 = z9;
                this.AvO7iQsrTN = gq0Var2;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [rg0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [he0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean OOA6hdeuvCS(d dVar, boolean z) {
        g60 g60Var;
        if (this.OOA6hdeuvCS.xqGvceK5x() == 0) {
            return false;
        }
        yk ykVar = this.X1lG3V04pd;
        if (ykVar.Mjvvu5DE) {
            bk0 bk0Var = ykVar.E7jCp8Ls;
            if ((bk0Var == null || (g60Var = bk0Var.mE4lRynR) == null) ? false : g60Var.A1EKNP6CxJ()) {
                gq0 gq0Var = this.AvO7iQsrTN;
                gq0Var.getClass();
                bk0 bk0Var2 = this.EljAMC1QTz;
                bk0Var2.getClass();
                long j = bk0Var2.AvO7iQsrTN;
                yk ykVar2 = ykVar;
                ?? r7 = 0;
                while (ykVar2 != 0) {
                    if (ykVar2 instanceof nq0) {
                        ((nq0) ykVar2).ozMwhSAI(gq0Var, hq0.OOA6hdeuvCS, j);
                    } else if ((ykVar2.AvO7iQsrTN & 16) != 0 && (ykVar2 instanceof yk)) {
                        he0 he0Var = ykVar2.jivtDDk9H;
                        int i = 0;
                        ykVar2 = ykVar2;
                        r7 = r7;
                        while (he0Var != null) {
                            if ((he0Var.AvO7iQsrTN & 16) != 0) {
                                i++;
                                r7 = r7;
                                if (i == 1) {
                                    ykVar2 = he0Var;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new rg0(new he0[16]);
                                    }
                                    if (ykVar2 != 0) {
                                        r7.Yi7zF1RB1(ykVar2);
                                        ykVar2 = 0;
                                    }
                                    r7.Yi7zF1RB1(he0Var);
                                }
                            }
                            he0Var = he0Var.JFJ3QoxA;
                            ykVar2 = ykVar2;
                            r7 = r7;
                        }
                        if (i == 1) {
                        }
                    }
                    ykVar2 = vc0.E7jCp8Ls(r7);
                }
                if (ykVar.Mjvvu5DE) {
                    rg0 rg0Var = this.GWasM1elztuh;
                    Object[] objArr = rg0Var.OOA6hdeuvCS;
                    int i2 = rg0Var.AvO7iQsrTN;
                    for (int i3 = 0; i3 < i2; i3++) {
                        uj0 uj0Var = (uj0) objArr[i3];
                        this.EljAMC1QTz.getClass();
                        uj0Var.OOA6hdeuvCS(dVar, z);
                    }
                }
                if (ykVar.Mjvvu5DE) {
                    ?? r13 = 0;
                    while (ykVar != 0) {
                        if (ykVar instanceof nq0) {
                            ((nq0) ykVar).ozMwhSAI(gq0Var, hq0.EljAMC1QTz, j);
                        } else if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                            he0 he0Var2 = ykVar.jivtDDk9H;
                            int i4 = 0;
                            ykVar = ykVar;
                            r13 = r13;
                            while (he0Var2 != null) {
                                if ((he0Var2.AvO7iQsrTN & 16) != 0) {
                                    i4++;
                                    r13 = r13;
                                    if (i4 == 1) {
                                        ykVar = he0Var2;
                                    } else {
                                        if (r13 == 0) {
                                            r13 = new rg0(new he0[16]);
                                        }
                                        if (ykVar != 0) {
                                            r13.Yi7zF1RB1(ykVar);
                                            ykVar = 0;
                                        }
                                        r13.Yi7zF1RB1(he0Var2);
                                    }
                                }
                                he0Var2 = he0Var2.JFJ3QoxA;
                                ykVar = ykVar;
                                r13 = r13;
                            }
                            if (i4 == 1) {
                            }
                        }
                        ykVar = vc0.E7jCp8Ls(r13);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [rg0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [rg0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [he0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [he0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void X1lG3V04pd() {
        rg0 rg0Var = this.GWasM1elztuh;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ((uj0) objArr[i2]).X1lG3V04pd();
        }
        yk ykVar = this.X1lG3V04pd;
        ?? r1 = 0;
        while (ykVar != 0) {
            if (ykVar instanceof nq0) {
                ((nq0) ykVar).mqNvfisv7();
            } else if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                he0 he0Var = ykVar.jivtDDk9H;
                int i3 = 0;
                r1 = r1;
                ykVar = ykVar;
                while (he0Var != null) {
                    if ((he0Var.AvO7iQsrTN & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            ykVar = he0Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new rg0(new he0[16]);
                            }
                            if (ykVar != 0) {
                                r1.Yi7zF1RB1(ykVar);
                                ykVar = 0;
                            }
                            r1.Yi7zF1RB1(he0Var);
                        }
                    }
                    he0Var = he0Var.JFJ3QoxA;
                    r1 = r1;
                    ykVar = ykVar;
                }
                if (i3 == 1) {
                }
            }
            ykVar = vc0.E7jCp8Ls(r1);
        }
    }

    @Override // defpackage.gk0
    public final void Yi7zF1RB1(d dVar) {
        super.Yi7zF1RB1(dVar);
        gq0 gq0Var = this.AvO7iQsrTN;
        if (gq0Var == null) {
            return;
        }
        this.encWxUiV2 = this.mOu10nynGul;
        List list = gq0Var.GWasM1elztuh;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kq0 kq0Var = (kq0) list.get(i);
            boolean z = kq0Var.xqGvceK5x;
            long j = kq0Var.GWasM1elztuh;
            boolean JFJ3QoxA = dVar.JFJ3QoxA(j);
            boolean z2 = this.mOu10nynGul;
            if ((!z && !JFJ3QoxA) || (!z && !z2)) {
                this.xqGvceK5x.X1lG3V04pd(j);
            }
        }
        this.mOu10nynGul = false;
        this.JFJ3QoxA = gq0Var.X1lG3V04pd == 5;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.X1lG3V04pd + ", children=" + this.GWasM1elztuh + ", pointerIds=" + this.xqGvceK5x + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009e A[LOOP:0: B:5:0x009c->B:6:0x009e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [he0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean xqGvceK5x(d dVar) {
        boolean z;
        g60 g60Var;
        int i;
        int i2;
        qb0 qb0Var = this.OOA6hdeuvCS;
        if (qb0Var.xqGvceK5x() != 0) {
            he0 he0Var = this.X1lG3V04pd;
            if (he0Var.Mjvvu5DE) {
                bk0 bk0Var = he0Var.E7jCp8Ls;
                if ((bk0Var == null || (g60Var = bk0Var.mE4lRynR) == null) ? false : g60Var.A1EKNP6CxJ()) {
                    gq0 gq0Var = this.AvO7iQsrTN;
                    gq0Var.getClass();
                    bk0 bk0Var2 = this.EljAMC1QTz;
                    bk0Var2.getClass();
                    long j = bk0Var2.AvO7iQsrTN;
                    yk ykVar = he0Var;
                    ?? r8 = 0;
                    while (true) {
                        z = true;
                        if (ykVar == 0) {
                            break;
                        }
                        if (ykVar instanceof nq0) {
                            ((nq0) ykVar).ozMwhSAI(gq0Var, hq0.AvO7iQsrTN, j);
                        } else if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                            he0 he0Var2 = ykVar.jivtDDk9H;
                            int i3 = 0;
                            ykVar = ykVar;
                            r8 = r8;
                            while (he0Var2 != null) {
                                if ((he0Var2.AvO7iQsrTN & 16) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
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
                            if (i3 == 1) {
                            }
                        }
                        ykVar = vc0.E7jCp8Ls(r8);
                    }
                    if (he0Var.Mjvvu5DE) {
                        rg0 rg0Var = this.GWasM1elztuh;
                        Object[] objArr = rg0Var.OOA6hdeuvCS;
                        int i4 = rg0Var.AvO7iQsrTN;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ((uj0) objArr[i5]).xqGvceK5x(dVar);
                        }
                    }
                    Yi7zF1RB1(dVar);
                    i = qb0Var.encWxUiV2;
                    Object[] objArr2 = qb0Var.AvO7iQsrTN;
                    for (i2 = 0; i2 < i; i2++) {
                        objArr2[i2] = null;
                    }
                    qb0Var.encWxUiV2 = 0;
                    qb0Var.OOA6hdeuvCS = false;
                    this.EljAMC1QTz = null;
                    return z;
                }
            }
        }
        z = false;
        Yi7zF1RB1(dVar);
        i = qb0Var.encWxUiV2;
        Object[] objArr22 = qb0Var.AvO7iQsrTN;
        while (i2 < i) {
        }
        qb0Var.encWxUiV2 = 0;
        qb0Var.OOA6hdeuvCS = false;
        this.EljAMC1QTz = null;
        return z;
    }
}
