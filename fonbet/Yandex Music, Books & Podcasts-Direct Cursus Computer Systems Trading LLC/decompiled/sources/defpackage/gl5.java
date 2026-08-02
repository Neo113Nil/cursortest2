package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public class gl5 {
    public static ze0 a(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new ze0(1, function1Arr);
        }
        xq0.x("Failed requirement.");
        return null;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
