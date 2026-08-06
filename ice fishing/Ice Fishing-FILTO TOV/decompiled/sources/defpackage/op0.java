package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class op0 extends pog2g9KITJA implements Collection, q40 {
    public Object[] AvO7iQsrTN;
    public int E7jCp8Ls;
    public Object[] EljAMC1QTz;
    public Object[] JFJ3QoxA;
    public EXrPz3p7hFb OOA6hdeuvCS;
    public int encWxUiV2;
    public vt mOu10nynGul = new vt(9);
    public Object[] rQPn8YBR;

    public op0(EXrPz3p7hFb eXrPz3p7hFb, Object[] objArr, Object[] objArr2, int i) {
        this.OOA6hdeuvCS = eXrPz3p7hFb;
        this.EljAMC1QTz = objArr;
        this.AvO7iQsrTN = objArr2;
        this.encWxUiV2 = i;
        this.JFJ3QoxA = objArr;
        this.rQPn8YBR = objArr2;
        this.E7jCp8Ls = eXrPz3p7hFb.GWasM1elztuh();
    }

    public static void OOA6hdeuvCS(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int AEn1Rrio() {
        int i = this.E7jCp8Ls;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final void AvO7iQsrTN(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.JFJ3QoxA == null) {
            o4.jivtDDk9H("root is null");
            return;
        }
        int i4 = i >> 5;
        WdrkLMV3xh rQPn8YBR = rQPn8YBR(k8h8IjolWQ() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (rQPn8YBR.OOA6hdeuvCS - 1 != i4) {
            Object[] objArr4 = (Object[]) rQPn8YBR.previous();
            d5.Fm8W7vP7q(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = XnEVoBF0td1l(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) rQPn8YBR.previous();
        int k8h8IjolWQ = i3 - (((k8h8IjolWQ() >> 5) - 1) - i4);
        if (k8h8IjolWQ < i3) {
            objArr2 = objArr[k8h8IjolWQ];
            objArr2.getClass();
        }
        ozMwhSAI(collection, i, objArr5, 32, objArr, k8h8IjolWQ, objArr2);
    }

    public final Object[] E7jCp8Ls(Object[] objArr) {
        if (objArr == null) {
            return uFEq9NpZ();
        }
        if (JFJ3QoxA(objArr)) {
            return objArr;
        }
        Object[] uFEq9NpZ = uFEq9NpZ();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        d5.mqNvfisv7(objArr, uFEq9NpZ, 0, length, 6);
        return uFEq9NpZ;
    }

    public final Object[] EXrPz3p7hFb(Object[] objArr, int i, int i2, Object obj, iriv6doqetn iriv6doqetnVar) {
        int cilMamHF = d70.cilMamHF(i2, i);
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        if (i != 0) {
            Object obj2 = E7jCp8Ls[cilMamHF];
            obj2.getClass();
            E7jCp8Ls[cilMamHF] = EXrPz3p7hFb((Object[]) obj2, i - 5, i2, obj, iriv6doqetnVar);
            return E7jCp8Ls;
        }
        if (E7jCp8Ls != objArr) {
            ((AbstractList) this).modCount++;
        }
        iriv6doqetnVar.GWasM1elztuh = E7jCp8Ls[cilMamHF];
        E7jCp8Ls[cilMamHF] = obj;
        return E7jCp8Ls;
    }

    public final int EljAMC1QTz() {
        return ((AbstractList) this).modCount;
    }

    @Override // defpackage.pog2g9KITJA
    public final int GWasM1elztuh() {
        return this.E7jCp8Ls;
    }

    public final boolean JFJ3QoxA(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.mOu10nynGul;
    }

    public final Object M3K9sHhK(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.E7jCp8Ls - i;
        Object[] objArr2 = this.rQPn8YBR;
        if (i4 == 1) {
            Object obj = objArr2[0];
            Mjvvu5DE(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] E7jCp8Ls = E7jCp8Ls(objArr2);
        d5.Fm8W7vP7q(objArr2, E7jCp8Ls, i3, i3 + 1, i4);
        E7jCp8Ls[i4 - 1] = null;
        this.JFJ3QoxA = objArr;
        this.rQPn8YBR = E7jCp8Ls;
        this.E7jCp8Ls = (i + i4) - 1;
        this.encWxUiV2 = i2;
        return obj2;
    }

    public final void Mjvvu5DE(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.JFJ3QoxA = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.rQPn8YBR = objArr;
            this.E7jCp8Ls = i;
            this.encWxUiV2 = i2;
            return;
        }
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
        objArr.getClass();
        Object[] YmKjaVtbfp5Z = YmKjaVtbfp5Z(objArr, i2, i, iriv6doqetnVar);
        YmKjaVtbfp5Z.getClass();
        Object obj = iriv6doqetnVar.GWasM1elztuh;
        obj.getClass();
        this.rQPn8YBR = (Object[]) obj;
        this.E7jCp8Ls = i;
        if (YmKjaVtbfp5Z[1] == null) {
            this.JFJ3QoxA = (Object[]) YmKjaVtbfp5Z[0];
            this.encWxUiV2 = i2 - 5;
        } else {
            this.JFJ3QoxA = YmKjaVtbfp5Z;
            this.encWxUiV2 = i2;
        }
    }

    public final Object[] WIEu4Ya2g8(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            tq0.GWasM1elztuh("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int cilMamHF = d70.cilMamHF(i, i2);
        Object obj = objArr[cilMamHF];
        obj.getClass();
        Object WIEu4Ya2g8 = WIEu4Ya2g8((Object[]) obj, i, i2 - 5);
        if (cilMamHF < 31) {
            int i3 = cilMamHF + 1;
            if (objArr[i3] != null) {
                if (JFJ3QoxA(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] uFEq9NpZ = uFEq9NpZ();
                d5.Fm8W7vP7q(objArr, uFEq9NpZ, 0, 0, i3);
                objArr = uFEq9NpZ;
            }
        }
        if (WIEu4Ya2g8 == objArr[cilMamHF]) {
            return objArr;
        }
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        E7jCp8Ls[cilMamHF] = WIEu4Ya2g8;
        return E7jCp8Ls;
    }

    public final int WRKkgoJXwDn(hv hvVar, int i, iriv6doqetn iriv6doqetnVar) {
        int WdrkLMV3xh = WdrkLMV3xh(hvVar, this.rQPn8YBR, i, iriv6doqetnVar);
        Object obj = iriv6doqetnVar.GWasM1elztuh;
        if (WdrkLMV3xh == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, WdrkLMV3xh, i, (Object) null);
        this.rQPn8YBR = objArr;
        this.E7jCp8Ls -= i - WdrkLMV3xh;
        return WdrkLMV3xh;
    }

    public final int WdrkLMV3xh(hv hvVar, Object[] objArr, int i, iriv6doqetn iriv6doqetnVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) hvVar.mOu10nynGul(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = E7jCp8Ls(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        iriv6doqetnVar.GWasM1elztuh = objArr2;
        return i2;
    }

    public final EXrPz3p7hFb X1lG3V04pd() {
        EXrPz3p7hFb d31Var;
        Object[] objArr = this.JFJ3QoxA;
        if (objArr == this.EljAMC1QTz && this.rQPn8YBR == this.AvO7iQsrTN) {
            d31Var = this.OOA6hdeuvCS;
        } else {
            this.mOu10nynGul = new vt(9);
            this.EljAMC1QTz = objArr;
            Object[] objArr2 = this.rQPn8YBR;
            this.AvO7iQsrTN = objArr2;
            d31Var = objArr == null ? objArr2.length == 0 ? d31.EljAMC1QTz : new d31(Arrays.copyOf(objArr2, this.E7jCp8Ls)) : new np0(objArr, objArr2, this.E7jCp8Ls, this.encWxUiV2);
        }
        this.OOA6hdeuvCS = d31Var;
        return d31Var;
    }

    public final Object[] XnEVoBF0td1l(int i, Object[] objArr) {
        if (JFJ3QoxA(objArr)) {
            d5.Fm8W7vP7q(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] uFEq9NpZ = uFEq9NpZ();
        d5.Fm8W7vP7q(objArr, uFEq9NpZ, i, 0, 32 - i);
        return uFEq9NpZ;
    }

    public final void Y6hRI1cF8(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.E7jCp8Ls;
        int i2 = i >> 5;
        int i3 = this.encWxUiV2;
        if (i2 > (1 << i3)) {
            this.JFJ3QoxA = cilMamHF(this.encWxUiV2 + 5, iwATDS1i01k(objArr), objArr2);
            this.rQPn8YBR = objArr3;
            this.encWxUiV2 += 5;
            this.E7jCp8Ls++;
            return;
        }
        if (objArr == null) {
            this.JFJ3QoxA = objArr2;
            this.rQPn8YBR = objArr3;
            this.E7jCp8Ls = i + 1;
        } else {
            this.JFJ3QoxA = cilMamHF(i3, objArr, objArr2);
            this.rQPn8YBR = objArr3;
            this.E7jCp8Ls++;
        }
    }

    @Override // defpackage.pog2g9KITJA
    public final Object Yi7zF1RB1(int i) {
        z50.EljAMC1QTz(i, GWasM1elztuh());
        ((AbstractList) this).modCount++;
        int k8h8IjolWQ = k8h8IjolWQ();
        if (i >= k8h8IjolWQ) {
            return M3K9sHhK(this.JFJ3QoxA, k8h8IjolWQ, this.encWxUiV2, i - k8h8IjolWQ);
        }
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(this.rQPn8YBR[0]);
        Object[] objArr = this.JFJ3QoxA;
        objArr.getClass();
        M3K9sHhK(pog2g9KITJA(objArr, this.encWxUiV2, i, iriv6doqetnVar), k8h8IjolWQ, this.encWxUiV2, 0);
        return iriv6doqetnVar.GWasM1elztuh;
    }

    public final Object[] YmKjaVtbfp5Z(Object[] objArr, int i, int i2, iriv6doqetn iriv6doqetnVar) {
        Object[] YmKjaVtbfp5Z;
        int cilMamHF = d70.cilMamHF(i2 - 1, i);
        if (i == 5) {
            iriv6doqetnVar.GWasM1elztuh = objArr[cilMamHF];
            YmKjaVtbfp5Z = null;
        } else {
            Object obj = objArr[cilMamHF];
            obj.getClass();
            YmKjaVtbfp5Z = YmKjaVtbfp5Z((Object[]) obj, i - 5, i2, iriv6doqetnVar);
        }
        if (YmKjaVtbfp5Z == null && cilMamHF == 0) {
            return null;
        }
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        E7jCp8Ls[cilMamHF] = YmKjaVtbfp5Z;
        return E7jCp8Ls;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        z50.AvO7iQsrTN(i, GWasM1elztuh());
        if (i == GWasM1elztuh()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int k8h8IjolWQ = k8h8IjolWQ();
        if (i >= k8h8IjolWQ) {
            mOu10nynGul(this.JFJ3QoxA, i - k8h8IjolWQ, obj);
            return;
        }
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
        Object[] objArr = this.JFJ3QoxA;
        objArr.getClass();
        mOu10nynGul(encWxUiV2(objArr, this.encWxUiV2, i, obj, iriv6doqetnVar), 0, iriv6doqetnVar.GWasM1elztuh);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] uFEq9NpZ;
        z50.AvO7iQsrTN(i, this.E7jCp8Ls);
        if (i == this.E7jCp8Ls) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.E7jCp8Ls - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.rQPn8YBR;
            Object[] E7jCp8Ls = E7jCp8Ls(objArr);
            d5.Fm8W7vP7q(objArr, E7jCp8Ls, size2 + 1, i3, AEn1Rrio());
            OOA6hdeuvCS(E7jCp8Ls, i3, collection.iterator());
            this.rQPn8YBR = E7jCp8Ls;
            this.E7jCp8Ls = collection.size() + this.E7jCp8Ls;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int AEn1Rrio = AEn1Rrio();
        int size3 = collection.size() + this.E7jCp8Ls;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= k8h8IjolWQ()) {
            uFEq9NpZ = uFEq9NpZ();
            collection2 = collection;
            ozMwhSAI(collection2, i, this.rQPn8YBR, AEn1Rrio, objArr2, size, uFEq9NpZ);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.rQPn8YBR;
            if (size3 > AEn1Rrio) {
                int i4 = size3 - AEn1Rrio;
                Object[] XnEVoBF0td1l = XnEVoBF0td1l(i4, objArr3);
                AvO7iQsrTN(collection2, i, i4, objArr2, size, XnEVoBF0td1l);
                objArr2 = objArr2;
                uFEq9NpZ = XnEVoBF0td1l;
            } else {
                uFEq9NpZ = uFEq9NpZ();
                int i5 = AEn1Rrio - size3;
                d5.Fm8W7vP7q(objArr3, uFEq9NpZ, 0, i5, AEn1Rrio);
                int i6 = 32 - i5;
                Object[] XnEVoBF0td1l2 = XnEVoBF0td1l(i6, this.rQPn8YBR);
                int i7 = size - 1;
                objArr2[i7] = XnEVoBF0td1l2;
                AvO7iQsrTN(collection2, i, i6, objArr2, i7, XnEVoBF0td1l2);
                collection2 = collection2;
            }
        }
        this.JFJ3QoxA = jivtDDk9H(this.JFJ3QoxA, i2, objArr2);
        this.rQPn8YBR = uFEq9NpZ;
        this.E7jCp8Ls = collection2.size() + this.E7jCp8Ls;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (WRKkgoJXwDn(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean arNh8D4Z5gB(hv hvVar) {
        int i;
        hv hvVar2 = hvVar;
        int AEn1Rrio = AEn1Rrio();
        Object[] objArr = null;
        iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
        boolean z = false;
        if (this.JFJ3QoxA != null) {
            WdrkLMV3xh rQPn8YBR = rQPn8YBR(0);
            int i2 = 32;
            while (i2 == 32 && rQPn8YBR.hasNext()) {
                i2 = WdrkLMV3xh(hvVar2, (Object[]) rQPn8YBR.next(), 32, iriv6doqetnVar);
            }
            if (i2 == 32) {
                int WRKkgoJXwDn = WRKkgoJXwDn(hvVar2, AEn1Rrio, iriv6doqetnVar);
                if (WRKkgoJXwDn == 0) {
                    Mjvvu5DE(this.JFJ3QoxA, this.E7jCp8Ls, this.encWxUiV2);
                }
            } else {
                int i3 = (rQPn8YBR.OOA6hdeuvCS - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (rQPn8YBR.hasNext()) {
                    i4 = lv06NcmrQ(hvVar2, (Object[]) rQPn8YBR.next(), 32, i4, iriv6doqetnVar, arrayList2, arrayList);
                    hvVar2 = hvVar;
                }
                int lv06NcmrQ = lv06NcmrQ(hvVar, this.rQPn8YBR, AEn1Rrio, i4, iriv6doqetnVar, arrayList2, arrayList);
                Object obj = iriv6doqetnVar.GWasM1elztuh;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, lv06NcmrQ, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.JFJ3QoxA;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = mE4lRynR(objArr3, i3, this.encWxUiV2, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    tq0.GWasM1elztuh("invalid size");
                }
                if (size == 0) {
                    this.encWxUiV2 = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.encWxUiV2;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.encWxUiV2 = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = WIEu4Ya2g8(objArr3, i5, i);
                }
                this.JFJ3QoxA = objArr;
                this.rQPn8YBR = objArr2;
                this.E7jCp8Ls = size + lv06NcmrQ;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] cilMamHF(int i, Object[] objArr, Object[] objArr2) {
        int cilMamHF = d70.cilMamHF(GWasM1elztuh() - 1, i);
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        if (i == 5) {
            E7jCp8Ls[cilMamHF] = objArr2;
            return E7jCp8Ls;
        }
        E7jCp8Ls[cilMamHF] = cilMamHF(i - 5, (Object[]) E7jCp8Ls[cilMamHF], objArr2);
        return E7jCp8Ls;
    }

    public final Object[] encWxUiV2(Object[] objArr, int i, int i2, Object obj, iriv6doqetn iriv6doqetnVar) {
        Object obj2;
        int cilMamHF = d70.cilMamHF(i2, i);
        if (i == 0) {
            iriv6doqetnVar.GWasM1elztuh = objArr[31];
            Object[] E7jCp8Ls = E7jCp8Ls(objArr);
            d5.Fm8W7vP7q(objArr, E7jCp8Ls, cilMamHF + 1, cilMamHF, 31);
            E7jCp8Ls[cilMamHF] = obj;
            return E7jCp8Ls;
        }
        Object[] E7jCp8Ls2 = E7jCp8Ls(objArr);
        int i3 = i - 5;
        Object obj3 = E7jCp8Ls2[cilMamHF];
        obj3.getClass();
        E7jCp8Ls2[cilMamHF] = encWxUiV2((Object[]) obj3, i3, i2, obj, iriv6doqetnVar);
        while (true) {
            cilMamHF++;
            if (cilMamHF >= 32 || (obj2 = E7jCp8Ls2[cilMamHF]) == null) {
                break;
            }
            E7jCp8Ls2[cilMamHF] = encWxUiV2((Object[]) obj2, i3, 0, iriv6doqetnVar.GWasM1elztuh, iriv6doqetnVar);
        }
        return E7jCp8Ls2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        z50.EljAMC1QTz(i, GWasM1elztuh());
        if (k8h8IjolWQ() <= i) {
            objArr = this.rQPn8YBR;
        } else {
            Object[] objArr2 = this.JFJ3QoxA;
            objArr2.getClass();
            for (int i2 = this.encWxUiV2; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[d70.cilMamHF(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] iwATDS1i01k(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.mOu10nynGul;
        return objArr;
    }

    public final Object[] jivtDDk9H(Object[] objArr, int i, Object[][] objArr2) {
        jivtDDk9H jivtddk9h = new jivtDDk9H(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.encWxUiV2;
        Object[] mE4lRynR = i2 < (1 << i3) ? mE4lRynR(objArr, i, i3, jivtddk9h) : E7jCp8Ls(objArr);
        while (jivtddk9h.hasNext()) {
            this.encWxUiV2 += 5;
            mE4lRynR = iwATDS1i01k(mE4lRynR);
            int i4 = this.encWxUiV2;
            mE4lRynR(mE4lRynR, 1 << i4, i4, jivtddk9h);
        }
        return mE4lRynR;
    }

    public final int k8h8IjolWQ() {
        int i = this.E7jCp8Ls;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        z50.AvO7iQsrTN(i, this.E7jCp8Ls);
        return new qp0(this, i);
    }

    public final int lv06NcmrQ(hv hvVar, Object[] objArr, int i, int i2, iriv6doqetn iriv6doqetnVar, ArrayList arrayList, ArrayList arrayList2) {
        if (JFJ3QoxA(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = iriv6doqetnVar.GWasM1elztuh;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) hvVar.mOu10nynGul(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : uFEq9NpZ();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        iriv6doqetnVar.GWasM1elztuh = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] mE4lRynR(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            tq0.GWasM1elztuh("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            tq0.GWasM1elztuh("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        int cilMamHF = d70.cilMamHF(i, i2);
        int i3 = i2 - 5;
        E7jCp8Ls[cilMamHF] = mE4lRynR((Object[]) E7jCp8Ls[cilMamHF], i, i3, it);
        while (true) {
            cilMamHF++;
            if (cilMamHF >= 32 || !it.hasNext()) {
                break;
            }
            E7jCp8Ls[cilMamHF] = mE4lRynR((Object[]) E7jCp8Ls[cilMamHF], 0, i3, it);
        }
        return E7jCp8Ls;
    }

    public final void mOu10nynGul(Object[] objArr, int i, Object obj) {
        int AEn1Rrio = AEn1Rrio();
        Object[] E7jCp8Ls = E7jCp8Ls(this.rQPn8YBR);
        Object[] objArr2 = this.rQPn8YBR;
        if (AEn1Rrio >= 32) {
            Object obj2 = objArr2[31];
            d5.Fm8W7vP7q(objArr2, E7jCp8Ls, i + 1, i, 31);
            E7jCp8Ls[i] = obj;
            Y6hRI1cF8(objArr, E7jCp8Ls, iwATDS1i01k(obj2));
            return;
        }
        d5.Fm8W7vP7q(objArr2, E7jCp8Ls, i + 1, i, AEn1Rrio);
        E7jCp8Ls[i] = obj;
        this.JFJ3QoxA = objArr;
        this.rQPn8YBR = E7jCp8Ls;
        this.E7jCp8Ls++;
    }

    public final void ozMwhSAI(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] uFEq9NpZ;
        if (i3 < 1) {
            tq0.GWasM1elztuh("requires at least one nullBuffer");
        }
        Object[] E7jCp8Ls = E7jCp8Ls(objArr);
        objArr2[0] = E7jCp8Ls;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            d5.Fm8W7vP7q(E7jCp8Ls, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                uFEq9NpZ = E7jCp8Ls;
            } else {
                uFEq9NpZ = uFEq9NpZ();
                i3--;
                objArr2[i3] = uFEq9NpZ;
            }
            int i7 = i2 - i6;
            d5.Fm8W7vP7q(E7jCp8Ls, objArr3, 0, i7, i2);
            d5.Fm8W7vP7q(E7jCp8Ls, uFEq9NpZ, size + 1, i4, i7);
            objArr3 = uFEq9NpZ;
        }
        Iterator it = collection.iterator();
        OOA6hdeuvCS(E7jCp8Ls, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] uFEq9NpZ2 = uFEq9NpZ();
            OOA6hdeuvCS(uFEq9NpZ2, 0, it);
            objArr2[i8] = uFEq9NpZ2;
        }
        OOA6hdeuvCS(objArr3, 0, it);
    }

    public final Object[] pog2g9KITJA(Object[] objArr, int i, int i2, iriv6doqetn iriv6doqetnVar) {
        int cilMamHF = d70.cilMamHF(i2, i);
        if (i == 0) {
            Object obj = objArr[cilMamHF];
            Object[] E7jCp8Ls = E7jCp8Ls(objArr);
            d5.Fm8W7vP7q(objArr, E7jCp8Ls, cilMamHF, cilMamHF + 1, 32);
            E7jCp8Ls[31] = iriv6doqetnVar.GWasM1elztuh;
            iriv6doqetnVar.GWasM1elztuh = obj;
            return E7jCp8Ls;
        }
        int cilMamHF2 = objArr[31] == null ? d70.cilMamHF(k8h8IjolWQ() - 1, i) : 31;
        Object[] E7jCp8Ls2 = E7jCp8Ls(objArr);
        int i3 = i - 5;
        int i4 = cilMamHF + 1;
        if (i4 <= cilMamHF2) {
            while (true) {
                Object obj2 = E7jCp8Ls2[cilMamHF2];
                obj2.getClass();
                E7jCp8Ls2[cilMamHF2] = pog2g9KITJA((Object[]) obj2, i3, 0, iriv6doqetnVar);
                if (cilMamHF2 == i4) {
                    break;
                }
                cilMamHF2--;
            }
        }
        Object obj3 = E7jCp8Ls2[cilMamHF];
        obj3.getClass();
        E7jCp8Ls2[cilMamHF] = pog2g9KITJA((Object[]) obj3, i3, i2, iriv6doqetnVar);
        return E7jCp8Ls2;
    }

    public final WdrkLMV3xh rQPn8YBR(int i) {
        Object[] objArr = this.JFJ3QoxA;
        if (objArr == null) {
            o4.jivtDDk9H("Invalid root");
            return null;
        }
        int k8h8IjolWQ = k8h8IjolWQ() >> 5;
        z50.AvO7iQsrTN(i, k8h8IjolWQ);
        int i2 = this.encWxUiV2;
        return i2 == 0 ? new k8(i, objArr) : new ya1(objArr, i, k8h8IjolWQ, i2 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return arNh8D4Z5gB(new k8h8IjolWQ(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        z50.EljAMC1QTz(i, GWasM1elztuh());
        if (k8h8IjolWQ() > i) {
            iriv6doqetn iriv6doqetnVar = new iriv6doqetn(null);
            Object[] objArr = this.JFJ3QoxA;
            objArr.getClass();
            this.JFJ3QoxA = EXrPz3p7hFb(objArr, this.encWxUiV2, i, obj, iriv6doqetnVar);
            return iriv6doqetnVar.GWasM1elztuh;
        }
        Object[] E7jCp8Ls = E7jCp8Ls(this.rQPn8YBR);
        if (E7jCp8Ls != this.rQPn8YBR) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = E7jCp8Ls[i2];
        E7jCp8Ls[i2] = obj;
        this.rQPn8YBR = E7jCp8Ls;
        return obj2;
    }

    public final Object[] uFEq9NpZ() {
        Object[] objArr = new Object[33];
        objArr[32] = this.mOu10nynGul;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int AEn1Rrio = AEn1Rrio();
        if (AEn1Rrio < 32) {
            Object[] E7jCp8Ls = E7jCp8Ls(this.rQPn8YBR);
            E7jCp8Ls[AEn1Rrio] = obj;
            this.rQPn8YBR = E7jCp8Ls;
            this.E7jCp8Ls = GWasM1elztuh() + 1;
        } else {
            Y6hRI1cF8(this.JFJ3QoxA, this.rQPn8YBR, iwATDS1i01k(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int AEn1Rrio = AEn1Rrio();
        Iterator it = collection.iterator();
        if (32 - AEn1Rrio >= collection.size()) {
            Object[] E7jCp8Ls = E7jCp8Ls(this.rQPn8YBR);
            OOA6hdeuvCS(E7jCp8Ls, AEn1Rrio, it);
            this.rQPn8YBR = E7jCp8Ls;
            this.E7jCp8Ls = collection.size() + this.E7jCp8Ls;
            return true;
        }
        int size = ((collection.size() + AEn1Rrio) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] E7jCp8Ls2 = E7jCp8Ls(this.rQPn8YBR);
        OOA6hdeuvCS(E7jCp8Ls2, AEn1Rrio, it);
        objArr[0] = E7jCp8Ls2;
        for (int i = 1; i < size; i++) {
            Object[] uFEq9NpZ = uFEq9NpZ();
            OOA6hdeuvCS(uFEq9NpZ, 0, it);
            objArr[i] = uFEq9NpZ;
        }
        this.JFJ3QoxA = jivtDDk9H(this.JFJ3QoxA, k8h8IjolWQ(), objArr);
        Object[] uFEq9NpZ2 = uFEq9NpZ();
        OOA6hdeuvCS(uFEq9NpZ2, 0, it);
        this.rQPn8YBR = uFEq9NpZ2;
        this.E7jCp8Ls = collection.size() + this.E7jCp8Ls;
        return true;
    }
}
