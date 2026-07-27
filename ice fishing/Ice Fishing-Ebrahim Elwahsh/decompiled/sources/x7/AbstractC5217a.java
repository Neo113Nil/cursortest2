package x7;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.Q0;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5217a implements InterfaceC5133d, d, Serializable {
    private final InterfaceC5133d completion;

    public AbstractC5217a(InterfaceC5133d interfaceC5133d) {
        this.completion = interfaceC5133d;
    }

    public InterfaceC5133d create(InterfaceC5133d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.completion;
        if (interfaceC5133d instanceof d) {
            return (d) interfaceC5133d;
        }
        return null;
    }

    public final InterfaceC5133d getCompletion() {
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
        Q0 q02 = f.f41799b;
        Q0 q03 = f.f41798a;
        if (q02 == null) {
            try {
                Q0 q04 = new Q0(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]), 8);
                f.f41799b = q04;
                q02 = q04;
            } catch (Exception unused2) {
                f.f41799b = q03;
                q02 = q03;
            }
        }
        if (q02 != q03 && (method = (Method) q02.f39325b) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = (Method) q02.f39326c) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = (Method) q02.f39327d;
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

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        InterfaceC5133d interfaceC5133d = this;
        while (true) {
            AbstractC5217a abstractC5217a = (AbstractC5217a) interfaceC5133d;
            InterfaceC5133d interfaceC5133d2 = abstractC5217a.completion;
            kotlin.jvm.internal.h.b(interfaceC5133d2);
            try {
                obj = abstractC5217a.invokeSuspend(obj);
                if (obj == EnumC5179a.f41704n) {
                    return;
                }
            } catch (Throwable th) {
                obj = com.bumptech.glide.f.e(th);
            }
            abstractC5217a.releaseIntercepted();
            if (!(interfaceC5133d2 instanceof AbstractC5217a)) {
                interfaceC5133d2.resumeWith(obj);
                return;
            }
            interfaceC5133d = interfaceC5133d2;
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

    public InterfaceC5133d create(Object obj, InterfaceC5133d completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
