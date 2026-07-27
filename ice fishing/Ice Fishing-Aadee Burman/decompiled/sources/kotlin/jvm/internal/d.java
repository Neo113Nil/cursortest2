package kotlin.jvm.internal;

import I7.v;
import I7.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u7.C5089g;
import v7.AbstractC5130k;
import v7.AbstractC5131l;

/* loaded from: classes2.dex */
public final class d implements O7.c, c {

    /* renamed from: u, reason: collision with root package name */
    public static final Map f38709u;

    /* renamed from: n, reason: collision with root package name */
    public final Class f38710n;

    static {
        List v9 = AbstractC5130k.v(I7.a.class, I7.l.class, I7.p.class, I7.q.class, I7.r.class, I7.s.class, I7.t.class, I7.u.class, v.class, w.class, I7.b.class, I7.c.class, I7.d.class, I7.e.class, I7.f.class, I7.g.class, I7.h.class, I7.i.class, I7.j.class, I7.k.class, I7.m.class, I7.n.class, I7.o.class);
        ArrayList arrayList = new ArrayList(AbstractC5131l.y(v9, 10));
        int i = 0;
        for (Object obj : v9) {
            int i6 = i + 1;
            if (i < 0) {
                AbstractC5130k.x();
                throw null;
            }
            arrayList.add(new C5089g((Class) obj, Integer.valueOf(i)));
            i = i6;
        }
        f38709u = v7.t.T(arrayList);
    }

    public d(Class jClass) {
        h.e(jClass, "jClass");
        this.f38710n = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f38710n;
    }

    public final String b() {
        String j6;
        Class jClass = this.f38710n;
        h.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String j9 = h.j(jClass.getName());
                return j9 == null ? jClass.getSimpleName() : j9;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (j6 = h.j(componentType.getName())) != null) {
                str = j6.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return Q7.j.n0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return Q7.j.n0(simpleName, enclosingConstructor.getName() + '$');
        }
        int Z8 = Q7.j.Z(simpleName, '$', 0, 6);
        if (Z8 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(Z8 + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && S0.f.j(this).equals(S0.f.j((O7.c) obj));
    }

    public final int hashCode() {
        return S0.f.j(this).hashCode();
    }

    public final String toString() {
        return this.f38710n.toString() + " (Kotlin reflection is not available)";
    }
}
