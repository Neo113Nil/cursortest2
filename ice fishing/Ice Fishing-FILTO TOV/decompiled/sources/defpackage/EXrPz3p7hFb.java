package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class EXrPz3p7hFb extends lv06NcmrQ {
    public abstract EXrPz3p7hFb AvO7iQsrTN(k8h8IjolWQ k8h8ijolwq);

    public abstract op0 EljAMC1QTz();

    public EXrPz3p7hFb OOA6hdeuvCS(Collection collection) {
        op0 EljAMC1QTz = EljAMC1QTz();
        EljAMC1QTz.addAll(collection);
        return EljAMC1QTz.X1lG3V04pd();
    }

    public abstract EXrPz3p7hFb X1lG3V04pd(Object obj);

    public abstract EXrPz3p7hFb Yi7zF1RB1(int i, Object obj);

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract EXrPz3p7hFb encWxUiV2(int i);

    @Override // defpackage.lv06NcmrQ, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract EXrPz3p7hFb mOu10nynGul(int i, Object obj);

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final List subList(int i, int i2) {
        return new n00(this, i, i2);
    }
}
