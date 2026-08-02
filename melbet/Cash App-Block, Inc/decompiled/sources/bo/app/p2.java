package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class p2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(q2 q2Var, Continuation continuation) {
        super(2, continuation);
        this.b = q2Var;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p2(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = q2.o;
            this.a = 1;
            if (JobKt.delay(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q2.n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(28), 14, (Object) null);
        Braze.INSTANCE.getInstance(this.b.a).requestImmediateDataFlush();
        return Unit.INSTANCE;
    }
}
