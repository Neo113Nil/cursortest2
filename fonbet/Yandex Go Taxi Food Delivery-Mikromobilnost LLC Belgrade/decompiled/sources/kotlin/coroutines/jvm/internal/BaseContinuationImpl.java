package kotlin.coroutines.jvm.internal;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.gwk0;
import defpackage.jb7;
import defpackage.mvg;
import defpackage.wse;
import defpackage.zy11;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lwse;", "Ljava/io/Serializable;", "Lkotlin/Result;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "resumeWith", "(Ljava/lang/Object;)V", "completion", "create", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/Continuation;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lwse;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseContinuationImpl implements Continuation<Object>, wse, Serializable {
    private final Continuation<Object> completion;

    public BaseContinuationImpl(Continuation continuation) {
        this.completion = continuation;
    }

    public Continuation<zy11> create(Continuation<?> completion) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.wse
    public wse getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof wse) {
            return (wse) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        mvg mvgVar = (mvg) getClass().getAnnotation(mvg.class);
        String str2 = null;
        if (mvgVar == null || mvgVar.v() < 1) {
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
        int i2 = i >= 0 ? mvgVar.l()[i] : -1;
        jb7 jb7Var = gwk0.b;
        jb7 jb7Var2 = gwk0.c;
        if (jb7Var2 == null) {
            try {
                jb7 jb7Var3 = new jb7(21, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                gwk0.c = jb7Var3;
                jb7Var2 = jb7Var3;
            } catch (Exception unused2) {
                gwk0.c = jb7Var;
                jb7Var2 = jb7Var;
            }
        }
        if (jb7Var2 != jb7Var && (method = (Method) jb7Var2.b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) jb7Var2.c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) jb7Var2.w;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = mvgVar.c();
        } else {
            str = str2 + '/' + mvgVar.c();
        }
        return new StackTraceElement(str, mvgVar.m(), mvgVar.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object result) {
        while (true) {
            BaseContinuationImpl baseContinuationImpl = this;
            ?? r0 = baseContinuationImpl.completion;
            try {
                result = baseContinuationImpl.invokeSuspend(result);
                if (result == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                result = new Result.Failure(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(r0 instanceof BaseContinuationImpl)) {
                r0.resumeWith(result);
                return;
            }
            this = r0;
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

    public Continuation<zy11> create(Object value, Continuation<?> completion) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
