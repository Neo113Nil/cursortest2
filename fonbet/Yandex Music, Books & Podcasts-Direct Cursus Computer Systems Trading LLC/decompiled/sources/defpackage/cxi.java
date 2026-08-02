package defpackage;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class cxi implements Comparator {

    @NotNull
    public static final cxi a = new cxi();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return hdo.a;
    }
}
