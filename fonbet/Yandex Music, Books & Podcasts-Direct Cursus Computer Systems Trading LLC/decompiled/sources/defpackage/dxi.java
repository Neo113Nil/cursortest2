package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class dxi extends zwj implements Serializable {
    public static final dxi a = new dxi();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.zwj
    public final zwj a() {
        return gdo.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
