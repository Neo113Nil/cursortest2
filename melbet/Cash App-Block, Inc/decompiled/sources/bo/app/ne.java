package bo.app;

import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class ne implements CoroutineScope {
    public static final ne a = new ne();
    public static r7 b;
    public static final CoroutineContext c;

    static {
        me meVar = new me(CoroutineExceptionHandler.Key.$$INSTANCE);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        c = new ExecutorCoroutineDispatcherImpl(newSingleThreadExecutor).plus(meVar).plus(JobKt.SupervisorJob$default());
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(10), 6, (Object) null);
        JobKt.cancelChildren$default(c);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return c;
    }
}
