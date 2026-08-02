package bo.app;

import java.io.BufferedReader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class k6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BufferedReader c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(BufferedReader bufferedReader, Continuation continuation) {
        super(2, continuation);
        this.c = bufferedReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k6 k6Var = new k6(this.c, continuation);
        k6Var.b = obj;
        return k6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k6 k6Var = new k6(this.c, (Continuation) obj2);
        k6Var.b = (ProducerScope) obj;
        return k6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope = (ProducerScope) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0 && i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        while (JobKt.isActive(producerScope)) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            j6 j6Var = new j6(this.c, producerScope, null);
            this.b = producerScope;
            this.a = 1;
            if (JobKt.withContext(defaultIoScheduler, j6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.INSTANCE;
    }
}
