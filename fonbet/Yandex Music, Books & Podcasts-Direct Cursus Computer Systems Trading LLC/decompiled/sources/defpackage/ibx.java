package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ibx {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(ibx.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = hbx.a;
        }
        a = comparator;
    }
}
