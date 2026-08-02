package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class kq2 implements Continuation, om6, Serializable {
    private final Continuation<Object> completion;

    public kq2(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.om6
    public om6 getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Override // defpackage.om6
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        we7 we7Var = (we7) getClass().getAnnotation(we7.class);
        String str2 = null;
        if (we7Var == null || we7Var.v() < 1) {
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
        int i2 = i >= 0 ? we7Var.l()[i] : -1;
        ndi.a.getClass();
        bq4 bq4Var = ndi.c;
        bq4 bq4Var2 = ndi.b;
        if (bq4Var == null) {
            try {
                bq4 bq4Var3 = new bq4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                ndi.c = bq4Var3;
                bq4Var = bq4Var3;
            } catch (Exception unused2) {
                ndi.c = bq4Var2;
                bq4Var = bq4Var2;
            }
        }
        if (bq4Var != bq4Var2 && (method = bq4Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = bq4Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = bq4Var.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = we7Var.c();
        } else {
            str = str2 + '/' + we7Var.c();
        }
        return new StackTraceElement(str, we7Var.m(), we7Var.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Continuation continuation = this;
        while (true) {
            kq2 kq2Var = (kq2) continuation;
            Continuation continuation2 = kq2Var.completion;
            continuation2.getClass();
            try {
                obj = kq2Var.invokeSuspend(obj);
            } catch (Throwable th) {
                r7o r7oVar = z7o.b;
                obj = new t7o(th);
            }
            if (obj == nm6.a) {
                return;
            }
            r7o r7oVar2 = z7o.b;
            kq2Var.releaseIntercepted();
            if (!(continuation2 instanceof kq2)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
