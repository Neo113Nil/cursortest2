package i1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class k extends AbstractC0253j {
    public static int E(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
