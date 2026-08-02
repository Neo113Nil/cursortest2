package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class a extends SuspendLambda implements Function2 {
    public Semaphore a;
    public int b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Semaphore semaphore = this.c.a;
            this.a = semaphore;
            this.b = 1;
            if (((SemaphoreAndMutexImpl) semaphore).acquire(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = semaphore;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.a;
            SafeTrace.throwOnFailure(obj);
        }
        try {
            return Unit.INSTANCE;
        } finally {
            ((SemaphoreAndMutexImpl) obj2).release();
        }
    }
}
