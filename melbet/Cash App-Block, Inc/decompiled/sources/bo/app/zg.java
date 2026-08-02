package bo.app;

import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class zg extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ah b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(ah ahVar, Continuation continuation) {
        super(2, continuation);
        this.b = ahVar;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zg zgVar = new zg(this.b, continuation);
        zgVar.a = obj;
        return zgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zg zgVar = new zg(this.b, (Continuation) obj2);
        zgVar.a = (CoroutineScope) obj;
        return zgVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        z4 z4Var;
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        try {
            SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.b.a().a;
            semaphoreAndMutexImpl.getClass();
            atomicIntegerFieldUpdater = SemaphoreAndMutexImpl._availablePermits$volatile$FU;
            if (Math.max(atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl), 0) == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(0), 6, (Object) null);
                xg a = this.b.a();
                a.getClass();
                JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new a(a, null));
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(1), 7, (Object) null);
            }
            z4Var = this.b.h;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new zg$$ExternalSyntheticLambda0(4), 4, (Object) null);
        }
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            throw null;
        }
        SemaphoreAndMutexImpl semaphoreAndMutexImpl2 = (SemaphoreAndMutexImpl) z4Var.a;
        semaphoreAndMutexImpl2.getClass();
        if (Math.max(atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl2), 0) == 0) {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(2), 6, (Object) null);
            z4 z4Var2 = this.b.h;
            if (z4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                throw null;
            }
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new a(z4Var2, null));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(3), 7, (Object) null);
        }
        this.b.A.e();
        this.b.i.c();
        this.b.n.m();
        try {
            this.b.m.f();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new zg$$ExternalSyntheticLambda0(5), 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
