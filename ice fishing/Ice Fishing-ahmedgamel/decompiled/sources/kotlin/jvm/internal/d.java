package kotlin.jvm.internal;

import I7.v;
import I7.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u7.C5081g;
import v7.AbstractC5120k;
import v7.AbstractC5121l;

/* loaded from: classes2.dex */
public final class d implements O7.c, c {

    /* renamed from: u, reason: collision with root package name */
    public static final Map f38636u;

    /* renamed from: n, reason: collision with root package name */
    public final Class f38637n;

    static {
        List t6 = AbstractC5120k.t(I7.a.class, I7.l.class, I7.p.class, I7.q.class, I7.r.class, I7.s.class, I7.t.class, I7.u.class, v.class, w.class, I7.b.class, I7.c.class, I7.d.class, I7.e.class, I7.f.class, I7.g.class, I7.h.class, I7.i.class, I7.j.class, I7.k.class, I7.m.class, I7.n.class, I7.o.class);
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(t6, 10));
        int i = 0;
        for (Object obj : t6) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC5120k.v();
                throw null;
            }
            arrayList.add(new C5081g((Class) obj, Integer.valueOf(i)));
            i = i4;
        }
        f38636u = v7.t.x(arrayList);
    }

    public d(Class jClass) {
        h.e(jClass, "jClass");
        this.f38637n = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f38637n;
    }

    public final String b() {
        String j6;
        Class jClass = this.f38637n;
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
            return Q7.j.D0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return Q7.j.D0(simpleName, enclosingConstructor.getName() + '$');
        }
        int p02 = Q7.j.p0(simpleName, '$', 0, 6);
        if (p02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(p02 + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && A8.b.l(this).equals(A8.b.l((O7.c) obj));
    }

    public final int hashCode() {
        return A8.b.l(this).hashCode();
    }

    public final String toString() {
        return this.f38637n.toString() + " (Kotlin reflection is not available)";
    }
}
