package u1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static int I(Iterable iterable, int i) {
        D1.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
