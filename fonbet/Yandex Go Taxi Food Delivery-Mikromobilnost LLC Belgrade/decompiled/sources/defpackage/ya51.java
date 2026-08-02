package defpackage;

import androidx.work.DirectExecutor;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public abstract class ya51 {
    public static final String a = hgz.o("WorkerWrapper");

    public static final Object a(euy euyVar, kuy kuyVar, SuspendLambda suspendLambda) {
        Object obj;
        try {
            int i = 0;
            if (!euyVar.isDone()) {
                j18 j18Var = new j18(1, dvw.b(suspendLambda));
                j18Var.u();
                euyVar.c(new ojz0(euyVar, j18Var, i), DirectExecutor.INSTANCE);
                j18Var.w(new vg7(3, kuyVar, euyVar));
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return s;
            }
            while (true) {
                try {
                    obj = euyVar.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
