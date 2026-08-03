package pc;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class v {
    public static Collection a(Collection collection) {
        if ((collection instanceof qc.a) && !(collection instanceof qc.b)) {
            e(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e10) {
            j.j(e10, v.class.getName());
            throw e10;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof qc.a) && !(obj instanceof qc.e)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            j.j(e10, v.class.getName());
            throw e10;
        }
    }

    public static void c(int i10, Object obj) {
        if (obj == null || d(i10, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean d(int i10, Object obj) {
        int i11;
        if (obj instanceof ac.c) {
            if (obj instanceof g) {
                i11 = ((g) obj).getArity();
            } else if (obj instanceof oc.a) {
                i11 = 0;
            } else if (obj instanceof oc.c) {
                i11 = 1;
            } else if (obj instanceof oc.e) {
                i11 = 2;
            } else if (obj instanceof oc.f) {
                i11 = 3;
            } else if (obj instanceof oc.g) {
                i11 = 4;
            } else if (obj instanceof oc.h) {
                i11 = 5;
            } else {
                boolean z10 = obj instanceof u0.b;
                i11 = z10 ? 6 : z10 ? 7 : z10 ? 8 : z10 ? 9 : z10 ? 10 : z10 ? 11 : z10 ? 13 : z10 ? 14 : z10 ? 15 : z10 ? 16 : z10 ? 17 : z10 ? 18 : z10 ? 19 : z10 ? 20 : z10 ? 21 : -1;
            }
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        j.j(classCastException, v.class.getName());
        throw classCastException;
    }
}
