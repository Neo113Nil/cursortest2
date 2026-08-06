package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zz0 implements l01, Iterable, q40 {
    public boolean AvO7iQsrTN;
    public qc0 EljAMC1QTz;
    public final hg0 OOA6hdeuvCS;
    public boolean encWxUiV2;

    public zz0() {
        long[] jArr = kx0.GWasM1elztuh;
        this.OOA6hdeuvCS = new hg0();
    }

    @Override // defpackage.l01
    public final void GWasM1elztuh(k01 k01Var, Object obj) {
        boolean z = obj instanceof VeqTn1PQw7;
        hg0 hg0Var = this.OOA6hdeuvCS;
        if (z && hg0Var.X1lG3V04pd(k01Var)) {
            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(k01Var);
            AvO7iQsrTN.getClass();
            VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN;
            VeqTn1PQw7 veqTn1PQw72 = (VeqTn1PQw7) obj;
            String str = veqTn1PQw72.GWasM1elztuh;
            if (str == null) {
                str = veqTn1PQw7.GWasM1elztuh;
            }
            tv tvVar = veqTn1PQw72.Yi7zF1RB1;
            if (tvVar == null) {
                tvVar = veqTn1PQw7.Yi7zF1RB1;
            }
            hg0Var.XnEVoBF0td1l(k01Var, new VeqTn1PQw7(str, tvVar));
        } else {
            hg0Var.XnEVoBF0td1l(k01Var, obj);
        }
        k01Var.getClass();
    }

    public final void OOA6hdeuvCS(zz0 zz0Var) {
        hg0 hg0Var = zz0Var.OOA6hdeuvCS;
        Object[] objArr = hg0Var.Yi7zF1RB1;
        Object[] objArr2 = hg0Var.X1lG3V04pd;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        k01 k01Var = (k01) obj;
                        hg0 hg0Var2 = this.OOA6hdeuvCS;
                        Object AvO7iQsrTN = hg0Var2.AvO7iQsrTN(k01Var);
                        k01Var.getClass();
                        Object EljAMC1QTz = k01Var.Yi7zF1RB1.EljAMC1QTz(AvO7iQsrTN, obj2);
                        if (EljAMC1QTz != null) {
                            hg0Var2.XnEVoBF0td1l(k01Var, EljAMC1QTz);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final Object X1lG3V04pd(k01 k01Var) {
        Object AvO7iQsrTN = this.OOA6hdeuvCS.AvO7iQsrTN(k01Var);
        if (AvO7iQsrTN != null) {
            return AvO7iQsrTN;
        }
        throw new IllegalStateException("Key not present: " + k01Var + " - consider getOrElse or getOrNull");
    }

    public final zz0 Yi7zF1RB1() {
        zz0 zz0Var = new zz0();
        zz0Var.AvO7iQsrTN = this.AvO7iQsrTN;
        zz0Var.encWxUiV2 = this.encWxUiV2;
        hg0 hg0Var = zz0Var.OOA6hdeuvCS;
        hg0Var.getClass();
        hg0 hg0Var2 = this.OOA6hdeuvCS;
        hg0Var2.getClass();
        Object[] objArr = hg0Var2.Yi7zF1RB1;
        Object[] objArr2 = hg0Var2.X1lG3V04pd;
        long[] jArr = hg0Var2.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            hg0Var.XnEVoBF0td1l(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return zz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz0)) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return o30.rQPn8YBR(this.OOA6hdeuvCS, zz0Var.OOA6hdeuvCS) && this.AvO7iQsrTN == zz0Var.AvO7iQsrTN && this.encWxUiV2 == zz0Var.encWxUiV2;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.encWxUiV2) + mr0.xqGvceK5x(this.OOA6hdeuvCS.hashCode() * 31, 31, this.AvO7iQsrTN);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qc0 qc0Var = this.EljAMC1QTz;
        if (qc0Var == null) {
            hg0 hg0Var = this.OOA6hdeuvCS;
            hg0Var.getClass();
            qc0 qc0Var2 = new qc0(hg0Var);
            this.EljAMC1QTz = qc0Var2;
            qc0Var = qc0Var2;
        }
        return ((nq) qc0Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.AvO7iQsrTN) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.encWxUiV2) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        hg0 hg0Var = this.OOA6hdeuvCS;
        Object[] objArr = hg0Var.Yi7zF1RB1;
        Object[] objArr2 = hg0Var.X1lG3V04pd;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((k01) obj).GWasM1elztuh);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return p.WdrkLMV3xh(this) + "{ " + ((Object) sb) + " }";
    }
}
