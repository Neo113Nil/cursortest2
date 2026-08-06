package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d31 extends EXrPz3p7hFb {
    public static final d31 EljAMC1QTz = new d31(new Object[0]);
    public final Object[] OOA6hdeuvCS;

    public d31(Object[] objArr) {
        this.OOA6hdeuvCS = objArr;
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb AvO7iQsrTN(k8h8IjolWQ k8h8ijolwq) {
        Object[] objArr = this.OOA6hdeuvCS;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) k8h8ijolwq.mOu10nynGul(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? EljAMC1QTz : new d31(d5.ZCWXqiC0(objArr2, 0, length));
    }

    @Override // defpackage.EXrPz3p7hFb
    public final op0 EljAMC1QTz() {
        return new op0(this, null, this.OOA6hdeuvCS, 0);
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.length;
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb OOA6hdeuvCS(Collection collection) {
        Object[] objArr = this.OOA6hdeuvCS;
        if (collection.size() + objArr.length > 32) {
            op0 EljAMC1QTz2 = EljAMC1QTz();
            EljAMC1QTz2.addAll(collection);
            return EljAMC1QTz2.X1lG3V04pd();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new d31(copyOf);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb X1lG3V04pd(Object obj) {
        Object[] objArr = this.OOA6hdeuvCS;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new d31(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new np0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb Yi7zF1RB1(int i, Object obj) {
        Object[] objArr = this.OOA6hdeuvCS;
        z50.AvO7iQsrTN(i, objArr.length);
        if (i == objArr.length) {
            return X1lG3V04pd(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            d5.mqNvfisv7(objArr, objArr2, 0, i, 6);
            d5.Fm8W7vP7q(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new d31(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        d5.Fm8W7vP7q(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new np0(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb encWxUiV2(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        z50.EljAMC1QTz(i, objArr.length);
        if (objArr.length == 1) {
            return EljAMC1QTz;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        d5.Fm8W7vP7q(objArr, copyOf, i, i + 1, objArr.length);
        return new d31(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        z50.EljAMC1QTz(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final int indexOf(Object obj) {
        return d5.dcDmLGVhzWm(this.OOA6hdeuvCS, obj);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.OOA6hdeuvCS;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        z50.AvO7iQsrTN(i, objArr.length);
        return new k8(objArr, i, objArr.length);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb mOu10nynGul(int i, Object obj) {
        Object[] objArr = this.OOA6hdeuvCS;
        z50.EljAMC1QTz(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new d31(copyOf);
    }
}
