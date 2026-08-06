package defpackage;

/* loaded from: classes.dex */
public abstract class D2vUnMij extends defpackage.abhbClRa {
    public abstract defpackage.D2vUnMij AARZUJiTa(defpackage.v5iciZok v5icizok);

    public abstract defpackage.D2vUnMij EXtogiMhuM(int i);

    public defpackage.D2vUnMij adDC3e2L(java.util.Collection collection) {
        defpackage.su0 xiZrDbcSW0 = xiZrDbcSW0();
        xiZrDbcSW0.addAll(collection);
        return xiZrDbcSW0.r1MBDhnF();
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.abhbClRa, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract defpackage.D2vUnMij oh6vYeIP(int i, java.lang.Object obj);

    public abstract defpackage.D2vUnMij r1MBDhnF(java.lang.Object obj);

    public abstract defpackage.D2vUnMij riuEU0zW4(int i, java.lang.Object obj);

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.v40(this, i, i2);
    }

    public abstract defpackage.su0 xiZrDbcSW0();
}
