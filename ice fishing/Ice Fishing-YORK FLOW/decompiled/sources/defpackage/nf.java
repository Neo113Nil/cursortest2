package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class nf extends defpackage.mf {
    public static java.lang.Object CZa7MwI9IzLd(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public static java.lang.Object EPEWHACkMcF1(java.util.AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static java.lang.Object Fu5WBEia9jBo(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static void Jkfc0NcwyPL8(java.util.AbstractList abstractList, java.lang.Iterable iterable) {
        abstractList.getClass();
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            abstractList.addAll((java.util.Collection) iterable);
            return;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }
}
