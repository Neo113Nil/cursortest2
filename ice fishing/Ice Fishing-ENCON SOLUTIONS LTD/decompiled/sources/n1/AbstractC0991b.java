package n1;

import A1.C0005f;
import F1.h;
import R1.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l1.g;
import l1.i;
import m1.EnumC0985a;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0991b implements l1.d, InterfaceC0992c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final l1.d f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8213b;

    /* renamed from: c, reason: collision with root package name */
    public transient l1.d f8214c;

    public AbstractC0991b(l1.d dVar, i iVar) {
        this.f8212a = dVar;
        this.f8213b = iVar;
    }

    public l1.d b(Object obj, l1.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement c() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC0993d interfaceC0993d = (InterfaceC0993d) getClass().getAnnotation(InterfaceC0993d.class);
        String str2 = null;
        if (interfaceC0993d == null) {
            return null;
        }
        int v2 = interfaceC0993d.v();
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
        int i3 = i2 >= 0 ? interfaceC0993d.l()[i2] : -1;
        S1.i iVar = AbstractC0994e.f8216b;
        S1.i iVar2 = AbstractC0994e.f8215a;
        if (iVar == null) {
            try {
                S1.i iVar3 = new S1.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0994e.f8216b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                AbstractC0994e.f8216b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f1786a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f1787b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = iVar.f1788c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC0993d.c();
        } else {
            str = str2 + '/' + interfaceC0993d.c();
        }
        return new StackTraceElement(str, interfaceC0993d.m(), interfaceC0993d.f(), i3);
    }

    public InterfaceC0992c f() {
        l1.d dVar = this.f8212a;
        if (dVar instanceof InterfaceC0992c) {
            return (InterfaceC0992c) dVar;
        }
        return null;
    }

    public abstract Object g(Object obj);

    @Override // l1.d
    public i getContext() {
        i iVar = this.f8213b;
        kotlin.jvm.internal.i.b(iVar);
        return iVar;
    }

    public void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1.d dVar = this.f8214c;
        if (dVar != null && dVar != this) {
            g m2 = getContext().m(l1.e.f8137a);
            kotlin.jvm.internal.i.b(m2);
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f602h;
            } while (atomicReferenceFieldUpdater.get(hVar) == F1.a.f592d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0005f c0005f = obj instanceof C0005f ? (C0005f) obj : null;
            if (c0005f != null) {
                c0005f.q();
            }
        }
        this.f8214c = C0990a.f8211a;
    }

    @Override // l1.d
    public final void i(Object obj) {
        l1.d dVar = this;
        while (true) {
            AbstractC0991b abstractC0991b = (AbstractC0991b) dVar;
            l1.d dVar2 = abstractC0991b.f8212a;
            kotlin.jvm.internal.i.b(dVar2);
            try {
                obj = abstractC0991b.g(obj);
                if (obj == EnumC0985a.f8194a) {
                    return;
                }
            } catch (Throwable th) {
                obj = l.h(th);
            }
            abstractC0991b.h();
            if (!(dVar2 instanceof AbstractC0991b)) {
                dVar2.i(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object c2 = c();
        if (c2 == null) {
            c2 = getClass().getName();
        }
        sb.append(c2);
        return sb.toString();
    }

    public AbstractC0991b(l1.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
