package bo.app;

import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class s0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ IValueCallback b;
    public final /* synthetic */ Braze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.b = iValueCallback;
        this.c = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            com.braze.a aVar = new com.braze.a(this.b, this.c, null);
            this.a = 1;
            if (JobKt.withContext(coroutineContext, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
