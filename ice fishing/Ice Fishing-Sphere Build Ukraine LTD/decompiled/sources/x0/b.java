package x0;

import L0.C0048f;
import Q0.AbstractC0068a;
import Q0.h;
import h.Y;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.g;
import v0.i;

/* loaded from: classes.dex */
public abstract class b implements v0.d, c, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final v0.d f3090e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3091f;

    /* renamed from: g, reason: collision with root package name */
    public transient v0.d f3092g;

    public b(v0.d dVar, i iVar) {
        this.f3090e = dVar;
        this.f3091f = iVar;
    }

    @Override // v0.d
    public final void c(Object obj) {
        v0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            v0.d dVar2 = bVar.f3090e;
            E0.i.b(dVar2);
            try {
                obj = bVar.n(obj);
                if (obj == w0.a.f3076e) {
                    return;
                }
            } catch (Throwable th) {
                obj = g.f(th);
            }
            bVar.o();
            if (!(dVar2 instanceof b)) {
                dVar2.c(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public c h() {
        v0.d dVar = this.f3090e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // v0.d
    public i j() {
        i iVar = this.f3091f;
        E0.i.b(iVar);
        return iVar;
    }

    public v0.d l(Object obj, v0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement m() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v2 = dVar.v();
        if (v2 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? dVar.l()[i2] : -1;
        Y y2 = e.f3094b;
        Y y3 = e.f3093a;
        if (y2 == null) {
            try {
                Y y4 = new Y(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                e.f3094b = y4;
                y2 = y4;
            } catch (Exception unused2) {
                e.f3094b = y3;
                y2 = y3;
            }
        }
        if (y2 != y3 && (method = y2.f2149a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2.f2150b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = y2.f2151c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i3);
    }

    public abstract Object n(Object obj);

    public void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v0.d dVar = this.f3092g;
        if (dVar != null && dVar != this) {
            v0.g i2 = j().i(v0.e.f3013e);
            E0.i.b(i2);
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f882l;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0068a.f872d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0048f c0048f = obj instanceof C0048f ? (C0048f) obj : null;
            if (c0048f != null) {
                c0048f.r();
            }
        }
        this.f3092g = a.f3089e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object m2 = m();
        if (m2 == null) {
            m2 = getClass().getName();
        }
        sb.append(m2);
        return sb.toString();
    }

    public b(v0.d dVar) {
        this(dVar, dVar != null ? dVar.j() : null);
    }
}
