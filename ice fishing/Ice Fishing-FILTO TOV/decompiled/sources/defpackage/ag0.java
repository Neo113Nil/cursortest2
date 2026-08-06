package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ag0 {
    public Object[] GWasM1elztuh;
    public int Yi7zF1RB1;

    public ag0(int i) {
        this.GWasM1elztuh = i == 0 ? qk0.GWasM1elztuh : new Object[i];
    }

    public final int AvO7iQsrTN(Object obj) {
        Object[] objArr = this.GWasM1elztuh;
        int i = 0;
        if (obj == null) {
            int i2 = this.Yi7zF1RB1;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.Yi7zF1RB1;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void E7jCp8Ls(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.Yi7zF1RB1) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.Yi7zF1RB1);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.GWasM1elztuh;
                d5.Fm8W7vP7q(objArr, objArr, i, i2, i3);
            }
            int i4 = this.Yi7zF1RB1;
            int i5 = i4 - (i2 - i);
            d5.JFXS9W1rB5s4(this.GWasM1elztuh, i5, i4);
            this.Yi7zF1RB1 = i5;
        }
    }

    public final Object EljAMC1QTz(int i) {
        if (i >= 0 && i < this.Yi7zF1RB1) {
            return this.GWasM1elztuh[i];
        }
        iwATDS1i01k(i);
        throw null;
    }

    public final void GWasM1elztuh(Object obj) {
        int i = this.Yi7zF1RB1 + 1;
        Object[] objArr = this.GWasM1elztuh;
        if (objArr.length < i) {
            XnEVoBF0td1l(i, objArr);
        }
        Object[] objArr2 = this.GWasM1elztuh;
        int i2 = this.Yi7zF1RB1;
        objArr2[i2] = obj;
        this.Yi7zF1RB1 = i2 + 1;
    }

    public final boolean JFJ3QoxA(Object obj) {
        int AvO7iQsrTN = AvO7iQsrTN(obj);
        if (AvO7iQsrTN < 0) {
            return false;
        }
        rQPn8YBR(AvO7iQsrTN);
        return true;
    }

    public final Object OOA6hdeuvCS() {
        if (!encWxUiV2()) {
            return this.GWasM1elztuh[0];
        }
        o4.AvO7iQsrTN("ObjectList is empty.");
        return null;
    }

    public final void X1lG3V04pd(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.Yi7zF1RB1;
        int size = list.size() + i;
        Object[] objArr = this.GWasM1elztuh;
        if (objArr.length < size) {
            XnEVoBF0td1l(size, objArr);
        }
        Object[] objArr2 = this.GWasM1elztuh;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.Yi7zF1RB1 = list.size() + this.Yi7zF1RB1;
    }

    public final void XnEVoBF0td1l(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        d5.Fm8W7vP7q(objArr, objArr2, 0, 0, length);
        this.GWasM1elztuh = objArr2;
    }

    public final void Yi7zF1RB1(ag0 ag0Var) {
        ag0Var.getClass();
        if (ag0Var.encWxUiV2()) {
            return;
        }
        int i = this.Yi7zF1RB1 + ag0Var.Yi7zF1RB1;
        Object[] objArr = this.GWasM1elztuh;
        if (objArr.length < i) {
            XnEVoBF0td1l(i, objArr);
        }
        d5.Fm8W7vP7q(ag0Var.GWasM1elztuh, this.GWasM1elztuh, this.Yi7zF1RB1, 0, ag0Var.Yi7zF1RB1);
        this.Yi7zF1RB1 += ag0Var.Yi7zF1RB1;
    }

    public final boolean encWxUiV2() {
        return this.Yi7zF1RB1 == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ag0) {
            ag0 ag0Var = (ag0) obj;
            int i = ag0Var.Yi7zF1RB1;
            int i2 = this.Yi7zF1RB1;
            if (i == i2) {
                Object[] objArr = this.GWasM1elztuh;
                Object[] objArr2 = ag0Var.GWasM1elztuh;
                x20 MZhzXH72 = o50.MZhzXH72(0, i2);
                int i3 = MZhzXH72.OOA6hdeuvCS;
                int i4 = MZhzXH72.EljAMC1QTz;
                if (i3 > i4) {
                    return true;
                }
                while (o30.rQPn8YBR(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final void iwATDS1i01k(int i) {
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Index ", i, " must be in 0..");
        rQPn8YBR.append(this.Yi7zF1RB1 - 1);
        throw new IndexOutOfBoundsException(rQPn8YBR.toString());
    }

    public final boolean mOu10nynGul() {
        return this.Yi7zF1RB1 != 0;
    }

    public final Object rQPn8YBR(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.Yi7zF1RB1)) {
            iwATDS1i01k(i);
            throw null;
        }
        Object[] objArr = this.GWasM1elztuh;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            d5.Fm8W7vP7q(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.Yi7zF1RB1 - 1;
        this.Yi7zF1RB1 = i3;
        objArr[i3] = null;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public final Object uFEq9NpZ(int i, Object obj) {
        if (i < 0 || i >= this.Yi7zF1RB1) {
            iwATDS1i01k(i);
            throw null;
        }
        Object[] objArr = this.GWasM1elztuh;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void xqGvceK5x() {
        d5.JFXS9W1rB5s4(this.GWasM1elztuh, 0, this.Yi7zF1RB1);
        this.Yi7zF1RB1 = 0;
    }

    public /* synthetic */ ag0() {
        this(16);
    }
}
