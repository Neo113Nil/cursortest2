package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qb0 implements Cloneable {
    public /* synthetic */ Object[] AvO7iQsrTN;
    public /* synthetic */ long[] EljAMC1QTz;
    public /* synthetic */ boolean OOA6hdeuvCS;
    public /* synthetic */ int encWxUiV2;

    public qb0(int i) {
        if (i == 0) {
            this.EljAMC1QTz = fb1.X1lG3V04pd;
            this.AvO7iQsrTN = fb1.xqGvceK5x;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.EljAMC1QTz = new long[i5];
        this.AvO7iQsrTN = new Object[i5];
    }

    public final long GWasM1elztuh(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.encWxUiV2)) {
            o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.OOA6hdeuvCS) {
            long[] jArr = this.EljAMC1QTz;
            Object[] objArr = this.AvO7iQsrTN;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ki1.mOu10nynGul) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.OOA6hdeuvCS = false;
            this.encWxUiV2 = i3;
        }
        return this.EljAMC1QTz[i];
    }

    public final Object OOA6hdeuvCS(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.encWxUiV2)) {
            o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.OOA6hdeuvCS) {
            long[] jArr = this.EljAMC1QTz;
            Object[] objArr = this.AvO7iQsrTN;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ki1.mOu10nynGul) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.OOA6hdeuvCS = false;
            this.encWxUiV2 = i3;
        }
        return this.AvO7iQsrTN[i];
    }

    public final void X1lG3V04pd(long j) {
        int iwATDS1i01k = fb1.iwATDS1i01k(this.EljAMC1QTz, this.encWxUiV2, j);
        if (iwATDS1i01k >= 0) {
            Object[] objArr = this.AvO7iQsrTN;
            Object obj = objArr[iwATDS1i01k];
            Object obj2 = ki1.mOu10nynGul;
            if (obj != obj2) {
                objArr[iwATDS1i01k] = obj2;
                this.OOA6hdeuvCS = true;
            }
        }
    }

    public final void Yi7zF1RB1(long j, Object obj) {
        Object obj2 = ki1.mOu10nynGul;
        int iwATDS1i01k = fb1.iwATDS1i01k(this.EljAMC1QTz, this.encWxUiV2, j);
        if (iwATDS1i01k >= 0) {
            this.AvO7iQsrTN[iwATDS1i01k] = obj;
            return;
        }
        int i = ~iwATDS1i01k;
        int i2 = this.encWxUiV2;
        if (i < i2) {
            Object[] objArr = this.AvO7iQsrTN;
            if (objArr[i] == obj2) {
                this.EljAMC1QTz[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.OOA6hdeuvCS) {
            long[] jArr = this.EljAMC1QTz;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.AvO7iQsrTN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.OOA6hdeuvCS = false;
                this.encWxUiV2 = i3;
                i = ~fb1.iwATDS1i01k(this.EljAMC1QTz, i3, j);
            }
        }
        int i5 = this.encWxUiV2;
        if (i5 >= this.EljAMC1QTz.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.EljAMC1QTz = Arrays.copyOf(this.EljAMC1QTz, i9);
            this.AvO7iQsrTN = Arrays.copyOf(this.AvO7iQsrTN, i9);
        }
        int i10 = this.encWxUiV2;
        if (i10 - i != 0) {
            long[] jArr2 = this.EljAMC1QTz;
            int i11 = i + 1;
            d5.Uxq83abb04(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.AvO7iQsrTN;
            d5.Fm8W7vP7q(objArr3, objArr3, i11, i, this.encWxUiV2);
        }
        this.EljAMC1QTz[i] = j;
        this.AvO7iQsrTN[i] = obj;
        this.encWxUiV2++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        qb0 qb0Var = (qb0) clone;
        qb0Var.EljAMC1QTz = (long[]) this.EljAMC1QTz.clone();
        qb0Var.AvO7iQsrTN = (Object[]) this.AvO7iQsrTN.clone();
        return qb0Var;
    }

    public final String toString() {
        if (xqGvceK5x() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.encWxUiV2 * 28);
        sb.append('{');
        int i = this.encWxUiV2;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(GWasM1elztuh(i2));
            sb.append('=');
            Object OOA6hdeuvCS = OOA6hdeuvCS(i2);
            if (OOA6hdeuvCS != sb) {
                sb.append(OOA6hdeuvCS);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int xqGvceK5x() {
        if (this.OOA6hdeuvCS) {
            int i = this.encWxUiV2;
            long[] jArr = this.EljAMC1QTz;
            Object[] objArr = this.AvO7iQsrTN;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ki1.mOu10nynGul) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.OOA6hdeuvCS = false;
            this.encWxUiV2 = i2;
        }
        return this.encWxUiV2;
    }

    public /* synthetic */ qb0() {
        this(10);
    }
}
