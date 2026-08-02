package defpackage;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class q2k0 implements Comparator {
    public static final q2k0 a = new q2k0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return u450.a;
    }
}
