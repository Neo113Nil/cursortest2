package x1;

import D1.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements v1.d, d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final v1.d f4758a;

    public a(v1.d dVar) {
        this.f4758a = dVar;
    }

    @Override // v1.d
    public final void b(Object obj) {
        v1.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            v1.d dVar2 = aVar.f4758a;
            i.b(dVar2);
            try {
                obj = aVar.k(obj);
                if (obj == w1.a.f4662a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new t1.e(th);
            }
            aVar.l();
            if (!(dVar2 instanceof a)) {
                dVar2.b(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public d e() {
        v1.d dVar = this.f4758a;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public v1.d i(Object obj, v1.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement j() {
        int i;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v2 = eVar.v();
        if (v2 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? eVar.l()[i] : -1;
        M0.h hVar = f.f4763b;
        M0.h hVar2 = f.f4762a;
        if (hVar == null) {
            try {
                M0.h hVar3 = new M0.h(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f4763b = hVar3;
                hVar = hVar3;
            } catch (Exception unused2) {
                f.f4763b = hVar2;
                hVar = hVar2;
            }
        }
        if (hVar != hVar2) {
            Method method = (Method) hVar.f616b;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = (Method) hVar.f617c;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = (Method) hVar.f618d;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i2);
    }

    public abstract Object k(Object obj);

    public void l() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j = j();
        if (j == null) {
            j = getClass().getName();
        }
        sb.append(j);
        return sb.toString();
    }
}
