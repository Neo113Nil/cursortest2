package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p41 implements Parcelable, s51, List, RandomAccess, q40 {
    public static final Parcelable.Creator<p41> CREATOR = new o41();
    public r51 OOA6hdeuvCS;

    public p41(EXrPz3p7hFb eXrPz3p7hFb) {
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        r51 r51Var = new r51(JFJ3QoxA.AvO7iQsrTN(), eXrPz3p7hFb);
        if (!(JFJ3QoxA instanceof jy)) {
            r51Var.Yi7zF1RB1 = new r51(1L, eXrPz3p7hFb);
        }
        this.OOA6hdeuvCS = r51Var;
    }

    @Override // defpackage.s51
    public final u51 GWasM1elztuh() {
        return this.OOA6hdeuvCS;
    }

    public final void OOA6hdeuvCS(int i, int i2) {
        int i3;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i3 = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            op0 EljAMC1QTz = eXrPz3p7hFb.EljAMC1QTz();
            EljAMC1QTz.subList(i, i2).clear();
            EXrPz3p7hFb X1lG3V04pd = EljAMC1QTz.X1lG3V04pd();
            if (o30.rQPn8YBR(X1lG3V04pd, eXrPz3p7hFb)) {
                return;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i3, X1lG3V04pd, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
    }

    @Override // defpackage.s51
    public final void X1lG3V04pd(u51 u51Var) {
        u51Var.Yi7zF1RB1 = this.OOA6hdeuvCS;
        this.OOA6hdeuvCS = (r51) u51Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb X1lG3V04pd = eXrPz3p7hFb.X1lG3V04pd(obj);
            if (X1lG3V04pd.equals(eXrPz3p7hFb)) {
                return false;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i, X1lG3V04pd, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb OOA6hdeuvCS = eXrPz3p7hFb.OOA6hdeuvCS(collection);
            if (o30.rQPn8YBR(OOA6hdeuvCS, eXrPz3p7hFb)) {
                return false;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i, OOA6hdeuvCS, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        y31 JFJ3QoxA;
        r51 r51Var = this.OOA6hdeuvCS;
        r51Var.getClass();
        synchronized (e41.X1lG3V04pd) {
            JFJ3QoxA = e41.JFJ3QoxA();
            r51 r51Var2 = (r51) e41.lv06NcmrQ(r51Var, this, JFJ3QoxA);
            synchronized (qj.YmKjaVtbfp5Z) {
                r51Var2.X1lG3V04pd = d31.EljAMC1QTz;
                r51Var2.xqGvceK5x++;
                r51Var2.OOA6hdeuvCS++;
            }
        }
        e41.uFEq9NpZ(JFJ3QoxA, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return qj.M3K9sHhK(this).X1lG3V04pd.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return qj.M3K9sHhK(this).X1lG3V04pd.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return qj.M3K9sHhK(this).X1lG3V04pd.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return qj.M3K9sHhK(this).X1lG3V04pd.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return qj.M3K9sHhK(this).X1lG3V04pd.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return qj.M3K9sHhK(this).X1lG3V04pd.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new lz(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            int indexOf = eXrPz3p7hFb.indexOf(obj);
            EXrPz3p7hFb encWxUiV2 = indexOf != -1 ? eXrPz3p7hFb.encWxUiV2(indexOf) : eXrPz3p7hFb;
            if (encWxUiV2.equals(eXrPz3p7hFb)) {
                return false;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i, encWxUiV2, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb AvO7iQsrTN = eXrPz3p7hFb.AvO7iQsrTN(new k8h8IjolWQ(0, collection));
            if (o30.rQPn8YBR(AvO7iQsrTN, eXrPz3p7hFb)) {
                return false;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i, AvO7iQsrTN, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return qj.DmJncFq5(this, new k8h8IjolWQ(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        Object obj2 = get(i);
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i2 = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb mOu10nynGul = eXrPz3p7hFb.mOu10nynGul(i, obj);
            if (mOu10nynGul.equals(eXrPz3p7hFb)) {
                break;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i2, mOu10nynGul, false);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return qj.M3K9sHhK(this).X1lG3V04pd.GWasM1elztuh();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            tq0.GWasM1elztuh("fromIndex or toIndex are out of bounds");
        }
        return new l61(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fb1.Fm8W7vP7q(this);
    }

    public final String toString() {
        r51 r51Var = this.OOA6hdeuvCS;
        r51Var.getClass();
        return "SnapshotStateList(value=" + ((r51) e41.encWxUiV2(r51Var)).X1lG3V04pd + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EXrPz3p7hFb eXrPz3p7hFb = qj.M3K9sHhK(this).X1lG3V04pd;
        int GWasM1elztuh = eXrPz3p7hFb.GWasM1elztuh();
        parcel.writeInt(GWasM1elztuh);
        for (int i2 = 0; i2 < GWasM1elztuh; i2++) {
            parcel.writeValue(eXrPz3p7hFb.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fb1.c4eaifQP(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new lz(this, i);
    }

    public p41() {
        this(d31.EljAMC1QTz);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i2 = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb Yi7zF1RB1 = eXrPz3p7hFb.Yi7zF1RB1(i, obj);
            if (Yi7zF1RB1.equals(eXrPz3p7hFb)) {
                return;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i2, Yi7zF1RB1, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return qj.DmJncFq5(this, new hv() { // from class: n41
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        Object obj = get(i);
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = this.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i2 = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            EXrPz3p7hFb encWxUiV2 = eXrPz3p7hFb.encWxUiV2(i);
            if (encWxUiV2.equals(eXrPz3p7hFb)) {
                break;
            }
            r51 r51Var3 = this.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, this, JFJ3QoxA), i2, encWxUiV2, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        } while (!JFJ3QoxA2);
        return obj;
    }
}
