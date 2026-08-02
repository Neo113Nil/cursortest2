package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class u450 implements Comparator {
    public static final u450 a = new u450();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return q2k0.a;
    }
}
