package bo.app;

import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class n2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ BroadcastReceiver.PendingResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q2 q2Var, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.b = q2Var;
        this.c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n2 n2Var = new n2(this.b, this.c, continuation);
        n2Var.a = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        q2 q2Var = this.b;
        ReentrantLock reentrantLock = q2Var.h;
        reentrantLock.lock();
        try {
            try {
                q2Var.j();
            } catch (Exception e) {
                try {
                    q2Var.c.b(e, Throwable.class);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l$$ExternalSyntheticLambda0(23), 4, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.c.finish();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
