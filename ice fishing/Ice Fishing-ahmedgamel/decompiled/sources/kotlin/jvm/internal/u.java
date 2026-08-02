package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.Wv;
import java.util.Collection;
import u7.InterfaceC5077c;

/* loaded from: classes2.dex */
public abstract class u {
    public static Collection a(Collection collection) {
        if (!(collection instanceof J7.a) || (collection instanceof J7.b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        if (obj instanceof InterfaceC5077c) {
            if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof I7.a ? 0 : obj instanceof I7.l ? 1 : obj instanceof I7.p ? 2 : obj instanceof I7.q ? 3 : obj instanceof I7.r ? 4 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(Wv.h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.i(classCastException, u.class.getName());
        throw classCastException;
    }
}
