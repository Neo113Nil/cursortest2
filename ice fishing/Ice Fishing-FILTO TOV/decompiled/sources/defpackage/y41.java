package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y41 implements Cloneable {
    public /* synthetic */ Object[] AvO7iQsrTN;
    public /* synthetic */ int[] EljAMC1QTz;
    public /* synthetic */ boolean OOA6hdeuvCS;
    public /* synthetic */ int encWxUiV2;

    public y41() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.EljAMC1QTz = new int[i4];
        this.AvO7iQsrTN = new Object[i4];
    }

    public final Object EljAMC1QTz(int i) {
        if (this.OOA6hdeuvCS) {
            o30.encWxUiV2(this);
        }
        Object[] objArr = this.AvO7iQsrTN;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: GWasM1elztuh, reason: merged with bridge method [inline-methods] */
    public final y41 clone() {
        Object clone = super.clone();
        clone.getClass();
        y41 y41Var = (y41) clone;
        y41Var.EljAMC1QTz = (int[]) this.EljAMC1QTz.clone();
        y41Var.AvO7iQsrTN = (Object[]) this.AvO7iQsrTN.clone();
        return y41Var;
    }

    public final int OOA6hdeuvCS() {
        if (this.OOA6hdeuvCS) {
            o30.encWxUiV2(this);
        }
        return this.encWxUiV2;
    }

    public final int X1lG3V04pd(int i) {
        if (this.OOA6hdeuvCS) {
            o30.encWxUiV2(this);
        }
        return this.EljAMC1QTz[i];
    }

    public final Object Yi7zF1RB1(int i) {
        Object obj;
        int uFEq9NpZ = fb1.uFEq9NpZ(this.EljAMC1QTz, this.encWxUiV2, i);
        if (uFEq9NpZ < 0 || (obj = this.AvO7iQsrTN[uFEq9NpZ]) == o30.Mjvvu5DE) {
            return null;
        }
        return obj;
    }

    public final String toString() {
        if (OOA6hdeuvCS() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.encWxUiV2 * 28);
        sb.append('{');
        int i = this.encWxUiV2;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(X1lG3V04pd(i2));
            sb.append('=');
            Object EljAMC1QTz = EljAMC1QTz(i2);
            if (EljAMC1QTz != this) {
                sb.append(EljAMC1QTz);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void xqGvceK5x(int i, Object obj) {
        int uFEq9NpZ = fb1.uFEq9NpZ(this.EljAMC1QTz, this.encWxUiV2, i);
        if (uFEq9NpZ >= 0) {
            this.AvO7iQsrTN[uFEq9NpZ] = obj;
            return;
        }
        int i2 = ~uFEq9NpZ;
        int i3 = this.encWxUiV2;
        if (i2 < i3) {
            Object[] objArr = this.AvO7iQsrTN;
            if (objArr[i2] == o30.Mjvvu5DE) {
                this.EljAMC1QTz[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.OOA6hdeuvCS && i3 >= this.EljAMC1QTz.length) {
            o30.encWxUiV2(this);
            i2 = ~fb1.uFEq9NpZ(this.EljAMC1QTz, this.encWxUiV2, i);
        }
        int i4 = this.encWxUiV2;
        if (i4 >= this.EljAMC1QTz.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.EljAMC1QTz = Arrays.copyOf(this.EljAMC1QTz, i8);
            this.AvO7iQsrTN = Arrays.copyOf(this.AvO7iQsrTN, i8);
        }
        int i9 = this.encWxUiV2;
        if (i9 - i2 != 0) {
            int[] iArr = this.EljAMC1QTz;
            int i10 = i2 + 1;
            d5.MjxSquD6Av(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.AvO7iQsrTN;
            d5.Fm8W7vP7q(objArr2, objArr2, i10, i2, this.encWxUiV2);
        }
        this.EljAMC1QTz[i2] = i;
        this.AvO7iQsrTN[i2] = obj;
        this.encWxUiV2++;
    }
}
