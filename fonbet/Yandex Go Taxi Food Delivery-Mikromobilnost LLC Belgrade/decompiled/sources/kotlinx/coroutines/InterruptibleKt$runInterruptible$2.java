package kotlinx.coroutines;

import defpackage.fse;
import defpackage.kyy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$block = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, continuation);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InterruptibleKt$runInterruptible$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fse coroutineContext = tseVar.getCoroutineContext();
        sls slsVar = this.$block;
        try {
            kyy0 kyy0Var = new kyy0();
            kyy0Var.B = a.o(a.n(coroutineContext), true, kyy0Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = kyy0.C;
            try {
                do {
                    i = atomicIntegerFieldUpdater.get(kyy0Var);
                    if (i != 0) {
                        if (i != 2 && i != 3) {
                            kyy0.q(i);
                            throw null;
                        }
                    }
                    return slsVar.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(kyy0Var, i, 0));
                return slsVar.invoke();
            } finally {
                kyy0Var.p();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
