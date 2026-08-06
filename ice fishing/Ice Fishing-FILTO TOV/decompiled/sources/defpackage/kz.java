package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kz {
    public final n50 GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public boolean X1lG3V04pd;
    public boolean Yi7zF1RB1;
    public boolean xqGvceK5x;
    public final ag0 EljAMC1QTz = new ag0();
    public final gk0 AvO7iQsrTN = new gk0();
    public final vf0 encWxUiV2 = new vf0(10);

    public kz(n50 n50Var) {
        this.GWasM1elztuh = n50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void GWasM1elztuh(long j, List list, boolean z) {
        vf0 vf0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        uj0 uj0Var;
        uj0 uj0Var2;
        int size = list.size();
        gk0 gk0Var = this.AvO7iQsrTN;
        gk0 gk0Var2 = gk0Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            vf0Var = this.encWxUiV2;
            if (i2 >= size) {
                break;
            }
            he0 he0Var = (he0) list.get(i2);
            if (he0Var.Mjvvu5DE) {
                he0Var.YmKjaVtbfp5Z = new psOJLYhIz(5, this, he0Var);
                if (z2) {
                    rg0 rg0Var = gk0Var2.GWasM1elztuh;
                    ?? r14 = rg0Var.OOA6hdeuvCS;
                    int i3 = rg0Var.AvO7iQsrTN;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            uj0Var2 = 0;
                            break;
                        }
                        uj0Var2 = r14[i4];
                        if (o30.rQPn8YBR(((uj0) uj0Var2).X1lG3V04pd, he0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    uj0Var = uj0Var2;
                    if (uj0Var != null) {
                        uj0Var.mOu10nynGul = true;
                        uj0Var.xqGvceK5x.GWasM1elztuh(j);
                        if (z) {
                            Object xqGvceK5x = vf0Var.xqGvceK5x(j);
                            if (xqGvceK5x == null) {
                                xqGvceK5x = new ag0();
                                vf0Var.EljAMC1QTz(j, xqGvceK5x);
                            }
                            ((ag0) xqGvceK5x).GWasM1elztuh(uj0Var);
                        }
                        gk0Var2 = uj0Var;
                    } else {
                        z2 = false;
                    }
                }
                uj0Var = new uj0(he0Var);
                uj0Var.xqGvceK5x.GWasM1elztuh(j);
                if (z) {
                    Object xqGvceK5x2 = vf0Var.xqGvceK5x(j);
                    if (xqGvceK5x2 == null) {
                        xqGvceK5x2 = new ag0();
                        vf0Var.EljAMC1QTz(j, xqGvceK5x2);
                    }
                    ((ag0) xqGvceK5x2).GWasM1elztuh(uj0Var);
                }
                gk0Var2.GWasM1elztuh.Yi7zF1RB1(uj0Var);
                gk0Var2 = uj0Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = vf0Var.Yi7zF1RB1;
            Object[] objArr = vf0Var.X1lG3V04pd;
            long[] jArr4 = vf0Var.GWasM1elztuh;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                ag0 ag0Var = (ag0) objArr[i9];
                                rg0 rg0Var2 = gk0Var.GWasM1elztuh;
                                i = i6;
                                Object[] objArr2 = rg0Var2.OOA6hdeuvCS;
                                int i10 = rg0Var2.AvO7iQsrTN;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((uj0) objArr2[i11]).EljAMC1QTz(j3, ag0Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        vf0Var.GWasM1elztuh();
    }

    public final void X1lG3V04pd() {
        if (this.Yi7zF1RB1) {
            this.X1lG3V04pd = true;
            return;
        }
        gk0 gk0Var = this.AvO7iQsrTN;
        rg0 rg0Var = gk0Var.GWasM1elztuh;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ((uj0) objArr[i2]).X1lG3V04pd();
        }
        if (this.xqGvceK5x) {
            this.xqGvceK5x = true;
        } else {
            gk0Var.GWasM1elztuh.AvO7iQsrTN();
        }
    }

    public final boolean Yi7zF1RB1(d dVar, boolean z) {
        qb0 qb0Var = (qb0) dVar.EljAMC1QTz;
        n50 n50Var = this.GWasM1elztuh;
        gk0 gk0Var = this.AvO7iQsrTN;
        boolean GWasM1elztuh = gk0Var.GWasM1elztuh(qb0Var, n50Var, dVar, z);
        rg0 rg0Var = gk0Var.GWasM1elztuh;
        if (!GWasM1elztuh) {
            return false;
        }
        boolean z2 = true;
        this.Yi7zF1RB1 = true;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((uj0) objArr[i2]).OOA6hdeuvCS(dVar, z) || z3;
        }
        Object[] objArr2 = rg0Var.OOA6hdeuvCS;
        int i3 = rg0Var.AvO7iQsrTN;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((uj0) objArr2[i4]).xqGvceK5x(dVar) || z4;
        }
        gk0Var.Yi7zF1RB1(dVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.Yi7zF1RB1 = false;
        if (this.OOA6hdeuvCS) {
            this.OOA6hdeuvCS = false;
            ag0 ag0Var = this.EljAMC1QTz;
            int i5 = ag0Var.Yi7zF1RB1;
            for (int i6 = 0; i6 < i5; i6++) {
                xqGvceK5x((he0) ag0Var.EljAMC1QTz(i6));
            }
            ag0Var.xqGvceK5x();
        }
        if (this.X1lG3V04pd) {
            this.X1lG3V04pd = false;
            X1lG3V04pd();
        }
        if (this.xqGvceK5x) {
            this.xqGvceK5x = false;
            gk0Var.GWasM1elztuh.AvO7iQsrTN();
        }
        return z2;
    }

    public final void xqGvceK5x(he0 he0Var) {
        if (this.Yi7zF1RB1) {
            this.OOA6hdeuvCS = true;
            this.EljAMC1QTz.GWasM1elztuh(he0Var);
            return;
        }
        gk0 gk0Var = this.AvO7iQsrTN;
        ag0 ag0Var = gk0Var.Yi7zF1RB1;
        ag0Var.xqGvceK5x();
        ag0Var.GWasM1elztuh(gk0Var);
        while (ag0Var.mOu10nynGul()) {
            gk0 gk0Var2 = (gk0) ag0Var.rQPn8YBR(ag0Var.Yi7zF1RB1 - 1);
            int i = 0;
            while (true) {
                rg0 rg0Var = gk0Var2.GWasM1elztuh;
                if (i < rg0Var.AvO7iQsrTN) {
                    uj0 uj0Var = (uj0) rg0Var.OOA6hdeuvCS[i];
                    if (o30.rQPn8YBR(uj0Var.X1lG3V04pd, he0Var)) {
                        gk0Var2.GWasM1elztuh.JFJ3QoxA(uj0Var);
                        uj0Var.X1lG3V04pd();
                    } else {
                        ag0Var.GWasM1elztuh(uj0Var);
                        i++;
                    }
                }
            }
        }
    }
}
