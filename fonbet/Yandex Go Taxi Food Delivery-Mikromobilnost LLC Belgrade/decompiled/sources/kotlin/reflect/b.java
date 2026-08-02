package kotlin.reflect;

import defpackage.cvu0;
import defpackage.ffx;
import defpackage.kbs;
import defpackage.kys;
import defpackage.lfx;
import defpackage.mgx;
import defpackage.ogx;
import defpackage.qrq0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.w511;
import defpackage.w551;
import defpackage.wp11;
import defpackage.zzb;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class b {
    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        qrq0 d = kotlin.sequences.a.d(TypesJVMKt$typeToString$unwrap$1.b, type);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) kotlin.sequences.b.n(d)).getName());
        Iterator it = d.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                scc.l();
                throw null;
            }
        }
        sb.append(cvu0.u(i, "[]"));
        return sb.toString();
    }

    public static final Type b(mgx mgxVar, boolean z) {
        lfx f = mgxVar.f();
        if (!(f instanceof lfx)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + mgxVar);
        }
        lfx lfxVar = f;
        Class N = z ? ffx.N(lfxVar) : ((zzb) lfxVar).a();
        List g = mgxVar.g();
        if (g.isEmpty()) {
            return N;
        }
        if (!N.isArray()) {
            return c(N, g);
        }
        if (N.getComponentType().isPrimitive()) {
            return N;
        }
        ogx ogxVar = (ogx) kotlin.collections.a.u0(g);
        if (ogxVar == null) {
            kbs.f(mgxVar, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance kVariance = ogxVar.a;
        mgx mgxVar2 = ogxVar.b;
        int i = kVariance == null ? -1 : wp11.a[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return N;
        }
        if (i == 2 || i == 3) {
            Type b = b(mgxVar2, false);
            return b instanceof Class ? N : new kys(b);
        }
        w511.b();
        return null;
    }

    public static final a c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(e((ogx) it.next()));
            }
            return new a(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e((ogx) it2.next()));
            }
            return new a(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        a c = c(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(tcc.n(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(e((ogx) it3.next()));
        }
        return new a(cls, c, arrayList3);
    }

    public static final Type d(mgx mgxVar) {
        return b(mgxVar, false);
    }

    public static final Type e(ogx ogxVar) {
        KVariance kVariance = ogxVar.a;
        if (kVariance == null) {
            return w551.c;
        }
        mgx mgxVar = ogxVar.b;
        int i = wp11.a[kVariance.ordinal()];
        if (i == 1) {
            return new w551(null, b(mgxVar, true));
        }
        if (i == 2) {
            return b(mgxVar, true);
        }
        if (i == 3) {
            return new w551(b(mgxVar, true), null);
        }
        w511.b();
        return null;
    }
}
