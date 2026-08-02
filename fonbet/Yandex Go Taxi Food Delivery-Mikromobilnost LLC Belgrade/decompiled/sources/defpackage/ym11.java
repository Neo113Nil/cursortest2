package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class ym11 {
    public static Collection a(Object obj) {
        if ((obj instanceof xfx) && !(obj instanceof yfx)) {
            j(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            jl40.J(e, ym11.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof xfx) && !(obj instanceof zfx)) {
            j(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            jl40.J(e, ym11.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof xfx) && !(obj instanceof bgx)) {
            j(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            jl40.J(e, ym11.class.getName());
            throw e;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof xfx) && !(obj instanceof fgx)) {
            j(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            jl40.J(e, ym11.class.getName());
            throw e;
        }
    }

    public static void e(int i, Object obj) {
        if (obj == null || f(i, obj)) {
            return;
        }
        j(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean f(int i, Object obj) {
        int i2;
        if (obj instanceof cms) {
            if (obj instanceof lms) {
                i2 = ((lms) obj).getArity();
            } else if (obj instanceof sls) {
                i2 = 0;
            } else if (obj instanceof tls) {
                i2 = 1;
            } else if (obj instanceof wls) {
                i2 = 2;
            } else if (obj instanceof zls) {
                i2 = 3;
            } else if (obj instanceof bms) {
                i2 = 4;
            } else if (obj instanceof dms) {
                i2 = 5;
            } else if (obj instanceof ems) {
                i2 = 6;
            } else if (obj instanceof fms) {
                i2 = 7;
            } else if (obj instanceof gms) {
                i2 = 8;
            } else if (obj instanceof hms) {
                i2 = 9;
            } else {
                boolean z = obj instanceof r1d;
                i2 = z ? 10 : z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof xfx) || (obj instanceof zfx);
        }
        return false;
    }

    public static boolean h(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof xfx) || (obj instanceof bgx);
        }
        return false;
    }

    public static boolean i(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof xfx) || (obj instanceof agx);
        }
        return false;
    }

    public static void j(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(g8e.p(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        jl40.J(classCastException, ym11.class.getName());
        throw classCastException;
    }
}
