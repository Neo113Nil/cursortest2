package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rg0 implements RandomAccess {
    public int AvO7iQsrTN = 0;
    public og0 EljAMC1QTz;
    public Object[] OOA6hdeuvCS;

    public rg0(Object[] objArr) {
        this.OOA6hdeuvCS = objArr;
    }

    public final void AvO7iQsrTN() {
        Object[] objArr = this.OOA6hdeuvCS;
        int i = this.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.AvO7iQsrTN = 0;
    }

    public final void E7jCp8Ls(int i, int i2) {
        if (i2 > i) {
            int i3 = this.AvO7iQsrTN;
            if (i2 < i3) {
                Object[] objArr = this.OOA6hdeuvCS;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.AvO7iQsrTN;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.OOA6hdeuvCS[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.AvO7iQsrTN = i5;
        }
    }

    public final List EljAMC1QTz() {
        og0 og0Var = this.EljAMC1QTz;
        if (og0Var != null) {
            return og0Var;
        }
        og0 og0Var2 = new og0(this);
        this.EljAMC1QTz = og0Var2;
        return og0Var2;
    }

    public final void GWasM1elztuh(int i, Object obj) {
        int i2 = this.AvO7iQsrTN + 1;
        if (this.OOA6hdeuvCS.length < i2) {
            XnEVoBF0td1l(i2);
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i3 = this.AvO7iQsrTN;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.AvO7iQsrTN++;
    }

    public final boolean JFJ3QoxA(Object obj) {
        int mOu10nynGul = mOu10nynGul(obj);
        if (mOu10nynGul < 0) {
            return false;
        }
        rQPn8YBR(mOu10nynGul);
        return true;
    }

    public final boolean OOA6hdeuvCS(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.AvO7iQsrTN + size;
        if (this.OOA6hdeuvCS.length < i3) {
            XnEVoBF0td1l(i3);
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i4 = this.AvO7iQsrTN;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.AvO7iQsrTN += size;
        return true;
    }

    public final void X1lG3V04pd(int i, rg0 rg0Var) {
        int i2 = rg0Var.AvO7iQsrTN;
        if (i2 == 0) {
            return;
        }
        int i3 = this.AvO7iQsrTN + i2;
        if (this.OOA6hdeuvCS.length < i3) {
            XnEVoBF0td1l(i3);
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i4 = this.AvO7iQsrTN;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(rg0Var.OOA6hdeuvCS, 0, objArr, i, i2);
        this.AvO7iQsrTN += i2;
    }

    public final void XnEVoBF0td1l(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.OOA6hdeuvCS = objArr2;
    }

    public final void Yi7zF1RB1(Object obj) {
        int i = this.AvO7iQsrTN + 1;
        if (this.OOA6hdeuvCS.length < i) {
            XnEVoBF0td1l(i);
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i2 = this.AvO7iQsrTN;
        objArr[i2] = obj;
        this.AvO7iQsrTN = i2 + 1;
    }

    public final boolean encWxUiV2(Object obj) {
        int i = this.AvO7iQsrTN - 1;
        if (i >= 0) {
            for (int i2 = 0; !o30.rQPn8YBR(this.OOA6hdeuvCS[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int mOu10nynGul(Object obj) {
        Object[] objArr = this.OOA6hdeuvCS;
        int i = this.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            if (o30.rQPn8YBR(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final Object rQPn8YBR(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        Object obj = objArr[i];
        int i2 = this.AvO7iQsrTN;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.AvO7iQsrTN - 1;
        this.AvO7iQsrTN = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void xqGvceK5x(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.AvO7iQsrTN + size;
        if (this.OOA6hdeuvCS.length < i2) {
            XnEVoBF0td1l(i2);
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i3 = this.AvO7iQsrTN;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.AvO7iQsrTN += size;
    }
}
