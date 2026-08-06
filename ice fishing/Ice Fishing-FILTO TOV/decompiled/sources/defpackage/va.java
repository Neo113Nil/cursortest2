package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class va implements ua {
    public static final Map Yi7zF1RB1;
    public final Class GWasM1elztuh;

    static {
        List rezfBrjOrqK = fb1.rezfBrjOrqK(wu.class, hv.class, lv.class, mv.class, nv.class, ov.class, pv.class, qv.class, rv.class, sv.class, xu.class, yu.class, zu.class, av.class, bv.class, cv.class, dv.class, ev.class, fv.class, gv.class, iv.class, jv.class, kv.class);
        ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(rezfBrjOrqK, 10));
        int i = 0;
        for (Object obj : rezfBrjOrqK) {
            int i2 = i + 1;
            if (i < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            arrayList.add(new rn0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Yi7zF1RB1 = rc0.ozMwhSAI(arrayList);
    }

    public va(Class cls) {
        cls.getClass();
        this.GWasM1elztuh = cls;
    }

    public final String GWasM1elztuh() {
        String XnEVoBF0td1l;
        Class cls = this.GWasM1elztuh;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String XnEVoBF0td1l2 = qj.XnEVoBF0td1l(cls.getName());
            return XnEVoBF0td1l2 == null ? cls.getCanonicalName() : XnEVoBF0td1l2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (XnEVoBF0td1l = qj.XnEVoBF0td1l(componentType.getName())) != null) {
            str = XnEVoBF0td1l.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final boolean X1lG3V04pd(Object obj) {
        Class cls = this.GWasM1elztuh;
        cls.getClass();
        Map map = Yi7zF1RB1;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return fb1.eUH21U3apd(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = qj.WRKkgoJXwDn(st0.GWasM1elztuh(cls));
        }
        return cls.isInstance(obj);
    }

    public final String Yi7zF1RB1() {
        String VeqTn1PQw7;
        Class cls = this.GWasM1elztuh;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String VeqTn1PQw72 = qj.VeqTn1PQw7(cls.getName());
                return VeqTn1PQw72 == null ? cls.getSimpleName() : VeqTn1PQw72;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (VeqTn1PQw7 = qj.VeqTn1PQw7(componentType.getName())) != null) {
                str = VeqTn1PQw7.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return b61.c4eaifQP(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int qugwajBSa59j = b61.qugwajBSa59j(simpleName, '$', 0, 6);
            return qugwajBSa59j == -1 ? simpleName : simpleName.substring(qugwajBSa59j + 1, simpleName.length());
        }
        return b61.c4eaifQP(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof va) && qj.WRKkgoJXwDn(this).equals(qj.WRKkgoJXwDn((va) obj));
    }

    public final int hashCode() {
        return qj.WRKkgoJXwDn(this).hashCode();
    }

    public final String toString() {
        return this.GWasM1elztuh.toString() + " (Kotlin reflection is not available)";
    }
}
