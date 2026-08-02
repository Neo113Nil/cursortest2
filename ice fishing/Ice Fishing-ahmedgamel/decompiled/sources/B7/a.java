package B7;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public abstract class a implements InterfaceC5240d, d, Serializable {
    private final InterfaceC5240d completion;

    public a(InterfaceC5240d interfaceC5240d) {
        this.completion = interfaceC5240d;
    }

    public InterfaceC5240d create(InterfaceC5240d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // B7.d
    public d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.completion;
        if (interfaceC5240d instanceof d) {
            return (d) interfaceC5240d;
        }
        return null;
    }

    public final InterfaceC5240d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
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
        int i4 = i >= 0 ? eVar.l()[i] : -1;
        b3.e eVar2 = f.f288b;
        b3.e eVar3 = f.f287a;
        if (eVar2 == null) {
            try {
                b3.e eVar4 = new b3.e(1, Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f288b = eVar4;
                eVar2 = eVar4;
            } catch (Exception unused2) {
                f.f288b = eVar3;
                eVar2 = eVar3;
            }
        }
        if (eVar2 != eVar3 && (method = (Method) eVar2.f5557u) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = (Method) eVar2.f5558v) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = (Method) eVar2.f5559w;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        InterfaceC5240d interfaceC5240d = this;
        while (true) {
            a aVar = (a) interfaceC5240d;
            InterfaceC5240d interfaceC5240d2 = aVar.completion;
            kotlin.jvm.internal.h.b(interfaceC5240d2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == A7.a.f215n) {
                    return;
                }
            } catch (Throwable th) {
                obj = Q3.b.b(th);
            }
            aVar.releaseIntercepted();
            if (!(interfaceC5240d2 instanceof a)) {
                interfaceC5240d2.resumeWith(obj);
                return;
            }
            interfaceC5240d = interfaceC5240d2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC5240d create(Object obj, InterfaceC5240d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
