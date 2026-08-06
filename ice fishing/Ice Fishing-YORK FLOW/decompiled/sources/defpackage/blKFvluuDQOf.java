package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class blKFvluuDQOf extends defpackage.IJ0hOnjhPOri {
    public defpackage.blKFvluuDQOf JhCgjQRTAOCT(java.util.Collection collection) {
        defpackage.ly0 WDYagTQQm9ns = WDYagTQQm9ns();
        WDYagTQQm9ns.addAll(collection);
        return WDYagTQQm9ns.fWTAfUmVKrZq();
    }

    public abstract defpackage.blKFvluuDQOf P05cfTpS5W5L(int i, java.lang.Object obj);

    public abstract defpackage.blKFvluuDQOf QiMR8OkAhezm(int i);

    public abstract defpackage.ly0 WDYagTQQm9ns();

    @Override // defpackage.lr1, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.lr1, java.util.Collection, java.util.List
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

    public abstract defpackage.blKFvluuDQOf fWTAfUmVKrZq(java.lang.Object obj);

    public abstract defpackage.blKFvluuDQOf giKS3J6vZuNy(int i, java.lang.Object obj);

    @Override // defpackage.IJ0hOnjhPOri, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract defpackage.blKFvluuDQOf oh71FJcDz6S2(defpackage.OcTWLQzke1i2 ocTWLQzke1i2);

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.q60(this, i, i2);
    }
}
