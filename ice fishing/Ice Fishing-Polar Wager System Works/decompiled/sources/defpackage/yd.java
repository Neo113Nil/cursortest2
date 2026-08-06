package defpackage;

/* loaded from: classes.dex */
public abstract class yd extends defpackage.xd {
    public static void AsxAYCCkb3Hi(java.util.AbstractList abstractList, java.lang.Iterable iterable) {
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

    public static java.lang.Object QUKZkWRtw6(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public static java.lang.Object RmCzwkUxICV(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static java.lang.Object nVhUznk1t(java.util.AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }
}
