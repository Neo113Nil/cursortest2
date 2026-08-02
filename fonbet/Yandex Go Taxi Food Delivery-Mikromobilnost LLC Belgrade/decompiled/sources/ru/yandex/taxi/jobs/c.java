package ru.yandex.taxi.jobs;

import defpackage.ec70;
import defpackage.gl7;
import defpackage.kc70;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ec70 ec70Var, ContinuationImpl continuationImpl) {
        OperationExtensionsKt$safeAwait$1 operationExtensionsKt$safeAwait$1;
        int i;
        try {
            if (continuationImpl instanceof OperationExtensionsKt$safeAwait$1) {
                operationExtensionsKt$safeAwait$1 = (OperationExtensionsKt$safeAwait$1) continuationImpl;
                int i2 = operationExtensionsKt$safeAwait$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    operationExtensionsKt$safeAwait$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = operationExtensionsKt$safeAwait$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = operationExtensionsKt$safeAwait$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        gl7 gl7Var = ((kc70) ec70Var).c;
                        operationExtensionsKt$safeAwait$1.L$0 = null;
                        operationExtensionsKt$safeAwait$1.L$1 = null;
                        operationExtensionsKt$safeAwait$1.L$2 = null;
                        operationExtensionsKt$safeAwait$1.label = 1;
                        if (ooc.e(gl7Var, operationExtensionsKt$safeAwait$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        operationExtensionsKt$safeAwait$1 = new OperationExtensionsKt$safeAwait$1(continuationImpl);
        Object obj2 = operationExtensionsKt$safeAwait$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = operationExtensionsKt$safeAwait$1.label;
    }
}
