package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class np0 extends EXrPz3p7hFb {
    public final int AvO7iQsrTN;
    public final Object[] EljAMC1QTz;
    public final Object[] OOA6hdeuvCS;
    public final int encWxUiV2;

    public np0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.OOA6hdeuvCS = objArr;
        this.EljAMC1QTz = objArr2;
        this.AvO7iQsrTN = i;
        this.encWxUiV2 = i2;
        if (!(GWasM1elztuh() > 32)) {
            tq0.GWasM1elztuh("Trie-based persistent vector should have at least 33 elements, got " + GWasM1elztuh());
        }
        int length = objArr2.length;
    }

    public static Object[] E7jCp8Ls(Object[] objArr, int i, int i2, iriv6doqetn iriv6doqetnVar) {
        Object[] E7jCp8Ls;
        int cilMamHF = d70.cilMamHF(i2, i);
        if (i == 5) {
            iriv6doqetnVar.GWasM1elztuh = objArr[cilMamHF];
            E7jCp8Ls = null;
        } else {
            Object obj = objArr[cilMamHF];
            obj.getClass();
            E7jCp8Ls = E7jCp8Ls((Object[]) obj, i - 5, i2, iriv6doqetnVar);
        }
        if (E7jCp8Ls == null && cilMamHF == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[cilMamHF] = E7jCp8Ls;
        return copyOf;
    }

    public static Object[] JFJ3QoxA(Object[] objArr, int i, int i2, Object obj, iriv6doqetn iriv6doqetnVar) {
        int cilMamHF = d70.cilMamHF(i2, i);
        if (i == 0) {
            Object[] copyOf = cilMamHF == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            d5.Fm8W7vP7q(objArr, copyOf, cilMamHF + 1, cilMamHF, 31);
            iriv6doqetnVar.GWasM1elztuh = objArr[31];
            copyOf[cilMamHF] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[cilMamHF];
        obj2.getClass();
        copyOf2[cilMamHF] = JFJ3QoxA((Object[]) obj2, i3, i2, obj, iriv6doqetnVar);
        while (true) {
            cilMamHF++;
            if (cilMamHF >= 32 || copyOf2[cilMamHF] == null) {
                break;
            }
            Object obj3 = objArr[cilMamHF];
            obj3.getClass();
            copyOf2[cilMamHF] = JFJ3QoxA((Object[]) obj3, i3, 0, iriv6doqetnVar.GWasM1elztuh, iriv6doqetnVar);
        }
        return copyOf2;
    }

    public static Object[] Mjvvu5DE(Object[] objArr, int i, int i2, Object obj) {
        int cilMamHF = d70.cilMamHF(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[cilMamHF] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[cilMamHF];
        obj2.getClass();
        copyOf[cilMamHF] = Mjvvu5DE((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb AvO7iQsrTN(k8h8IjolWQ k8h8ijolwq) {
        op0 op0Var = new op0(this, this.OOA6hdeuvCS, this.EljAMC1QTz, this.encWxUiV2);
        op0Var.arNh8D4Z5gB(k8h8ijolwq);
        return op0Var.X1lG3V04pd();
    }

    @Override // defpackage.EXrPz3p7hFb
    public final op0 EljAMC1QTz() {
        return new op0(this, this.OOA6hdeuvCS, this.EljAMC1QTz, this.encWxUiV2);
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    public final EXrPz3p7hFb WIEu4Ya2g8(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.AvO7iQsrTN - i;
        if (i4 != 1) {
            Object[] objArr2 = this.EljAMC1QTz;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                d5.Fm8W7vP7q(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new np0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new d31(objArr);
        }
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
        Object[] E7jCp8Ls = E7jCp8Ls(objArr, i2, i - 1, iriv6doqetnVar);
        E7jCp8Ls.getClass();
        Object obj = iriv6doqetnVar.GWasM1elztuh;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (E7jCp8Ls[1] != null) {
            return new np0(E7jCp8Ls, objArr3, i, i2);
        }
        Object obj2 = E7jCp8Ls[0];
        obj2.getClass();
        return new np0((Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb X1lG3V04pd(Object obj) {
        int YmKjaVtbfp5Z = YmKjaVtbfp5Z();
        int i = this.AvO7iQsrTN;
        int i2 = i - YmKjaVtbfp5Z;
        Object[] objArr = this.OOA6hdeuvCS;
        Object[] objArr2 = this.EljAMC1QTz;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new np0(objArr, copyOf, i + 1, this.encWxUiV2);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return XnEVoBF0td1l(objArr, objArr2, objArr3);
    }

    public final np0 XnEVoBF0td1l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.AvO7iQsrTN;
        int i2 = i >> 5;
        int i3 = this.encWxUiV2;
        if (i2 <= (1 << i3)) {
            return new np0(uFEq9NpZ(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new np0(uFEq9NpZ(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb Yi7zF1RB1(int i, Object obj) {
        int i2 = this.AvO7iQsrTN;
        z50.AvO7iQsrTN(i, i2);
        if (i == i2) {
            return X1lG3V04pd(obj);
        }
        int YmKjaVtbfp5Z = YmKjaVtbfp5Z();
        Object[] objArr = this.OOA6hdeuvCS;
        if (i >= YmKjaVtbfp5Z) {
            return rQPn8YBR(objArr, i - YmKjaVtbfp5Z, obj);
        }
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
        return rQPn8YBR(JFJ3QoxA(objArr, this.encWxUiV2, i, obj, iriv6doqetnVar), 0, iriv6doqetnVar.GWasM1elztuh);
    }

    public final int YmKjaVtbfp5Z() {
        return (this.AvO7iQsrTN - 1) & (-32);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb encWxUiV2(int i) {
        z50.EljAMC1QTz(i, GWasM1elztuh());
        int YmKjaVtbfp5Z = YmKjaVtbfp5Z();
        int i2 = this.encWxUiV2;
        Object[] objArr = this.OOA6hdeuvCS;
        return i >= YmKjaVtbfp5Z ? WIEu4Ya2g8(objArr, YmKjaVtbfp5Z, i2, i - YmKjaVtbfp5Z) : WIEu4Ya2g8(iwATDS1i01k(objArr, i2, i, new iriv6doqetn(this.EljAMC1QTz[0])), YmKjaVtbfp5Z, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        z50.EljAMC1QTz(i, GWasM1elztuh());
        if (YmKjaVtbfp5Z() <= i) {
            objArr = this.EljAMC1QTz;
        } else {
            Object[] objArr2 = this.OOA6hdeuvCS;
            for (int i2 = this.encWxUiV2; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[d70.cilMamHF(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] iwATDS1i01k(Object[] objArr, int i, int i2, iriv6doqetn iriv6doqetnVar) {
        int cilMamHF = d70.cilMamHF(i2, i);
        if (i == 0) {
            Object[] copyOf = cilMamHF == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            d5.Fm8W7vP7q(objArr, copyOf, cilMamHF, cilMamHF + 1, 32);
            copyOf[31] = iriv6doqetnVar.GWasM1elztuh;
            iriv6doqetnVar.GWasM1elztuh = objArr[cilMamHF];
            return copyOf;
        }
        int cilMamHF2 = objArr[31] == null ? d70.cilMamHF(YmKjaVtbfp5Z() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = cilMamHF + 1;
        if (i4 <= cilMamHF2) {
            while (true) {
                Object obj = copyOf2[cilMamHF2];
                obj.getClass();
                copyOf2[cilMamHF2] = iwATDS1i01k((Object[]) obj, i3, 0, iriv6doqetnVar);
                if (cilMamHF2 == i4) {
                    break;
                }
                cilMamHF2--;
            }
        }
        Object obj2 = copyOf2[cilMamHF];
        obj2.getClass();
        copyOf2[cilMamHF] = iwATDS1i01k((Object[]) obj2, i3, i2, iriv6doqetnVar);
        return copyOf2;
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final ListIterator listIterator(int i) {
        z50.AvO7iQsrTN(i, this.AvO7iQsrTN);
        return new pp0(this.OOA6hdeuvCS, this.EljAMC1QTz, i, this.AvO7iQsrTN, (this.encWxUiV2 / 5) + 1);
    }

    @Override // defpackage.EXrPz3p7hFb
    public final EXrPz3p7hFb mOu10nynGul(int i, Object obj) {
        int i2 = this.AvO7iQsrTN;
        z50.EljAMC1QTz(i, i2);
        int YmKjaVtbfp5Z = YmKjaVtbfp5Z();
        Object[] objArr = this.OOA6hdeuvCS;
        Object[] objArr2 = this.EljAMC1QTz;
        int i3 = this.encWxUiV2;
        if (YmKjaVtbfp5Z > i) {
            return new np0(Mjvvu5DE(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new np0(objArr, copyOf, i2, i3);
    }

    public final np0 rQPn8YBR(Object[] objArr, int i, Object obj) {
        int YmKjaVtbfp5Z = YmKjaVtbfp5Z();
        int i2 = this.AvO7iQsrTN;
        int i3 = i2 - YmKjaVtbfp5Z;
        Object[] objArr2 = this.EljAMC1QTz;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            d5.Fm8W7vP7q(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new np0(objArr, copyOf, i2 + 1, this.encWxUiV2);
        }
        Object obj2 = objArr2[31];
        d5.Fm8W7vP7q(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return XnEVoBF0td1l(objArr, copyOf, objArr3);
    }

    public final Object[] uFEq9NpZ(int i, Object[] objArr, Object[] objArr2) {
        int cilMamHF = d70.cilMamHF(GWasM1elztuh() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[cilMamHF] = objArr2;
            return copyOf;
        }
        copyOf[cilMamHF] = uFEq9NpZ(i - 5, (Object[]) copyOf[cilMamHF], objArr2);
        return copyOf;
    }
}
