package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class xra1 {
    public static String a(StringBuilder sb, String str, boolean z, String str2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Set b(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                ny61.g(qv10.o("duplicate element: ", obj));
                return null;
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ void c(Comparable comparable) {
        if (comparable == null) {
            return;
        }
        ny61.u();
    }
}
