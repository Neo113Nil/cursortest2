package defpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class vop extends uop {
    public static HashSet c(Object... objArr) {
        HashSet hashSet = new HashSet(tah.a(objArr.length));
        xz0.U(objArr, hashSet);
        return hashSet;
    }

    public static Set d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(tah.a(objArr.length));
        xz0.U(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e(Object obj) {
        return obj != null ? uop.b(obj) : q5b.a;
    }

    public static Set f(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
