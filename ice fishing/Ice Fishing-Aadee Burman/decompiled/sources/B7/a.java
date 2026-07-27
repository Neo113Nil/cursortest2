package B7;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public abstract class a implements InterfaceC5267d, d, Serializable {
    private final InterfaceC5267d completion;

    public a(InterfaceC5267d interfaceC5267d) {
        this.completion = interfaceC5267d;
    }

    public InterfaceC5267d create(InterfaceC5267d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // B7.d
    public d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.completion;
        if (interfaceC5267d instanceof d) {
            return (d) interfaceC5267d;
        }
        return null;
    }

    public final InterfaceC5267d getCompletion() {
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
        int i6 = i >= 0 ? eVar.l()[i] : -1;
        Z2.e eVar2 = f.f222b;
        Z2.e eVar3 = f.f221a;
        if (eVar2 == null) {
            try {
                Z2.e eVar4 = new Z2.e(4, Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f222b = eVar4;
                eVar2 = eVar4;
            } catch (Exception unused2) {
                f.f222b = eVar3;
                eVar2 = eVar3;
            }
        }
        if (eVar2 != eVar3 && (method = (Method) eVar2.f4170u) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = (Method) eVar2.f4171v) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = (Method) eVar2.f4172w;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i6);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        InterfaceC5267d interfaceC5267d = this;
        while (true) {
            a aVar = (a) interfaceC5267d;
            InterfaceC5267d interfaceC5267d2 = aVar.completion;
            kotlin.jvm.internal.h.b(interfaceC5267d2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == A7.a.f58n) {
                    return;
                }
            } catch (Throwable th) {
                obj = com.bumptech.glide.d.f(th);
            }
            aVar.releaseIntercepted();
            if (!(interfaceC5267d2 instanceof a)) {
                interfaceC5267d2.resumeWith(obj);
                return;
            }
            interfaceC5267d = interfaceC5267d2;
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

    public InterfaceC5267d create(Object obj, InterfaceC5267d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
