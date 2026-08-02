package yads;

import defpackage.f371;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class n62 extends f371 implements Serializable {
    public static final n62 a = new n62();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.f371
    public final f371 a() {
        return io2.a;
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
