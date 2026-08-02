package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class z5 extends SuspendLambda implements Function1 {
    public final /* synthetic */ g6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(g6 g6Var, Continuation continuation) {
        super(1, continuation);
        this.a = g6Var;
    }

    public static final String a() {
        return "Ending subscription after delay";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new z5(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new z5(this.a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(28), 7, (Object) null);
        this.a.a();
        return Unit.INSTANCE;
    }
}
