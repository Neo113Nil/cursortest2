package kotlinx.coroutines.flow.internal;

import defpackage.mqq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.onq0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {65}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class ChannelFlowMerge$collectTo$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ mqq0 $collector;
    final /* synthetic */ tpr $inner;
    final /* synthetic */ onq0 $semaphore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$1(tpr tprVar, mqq0 mqq0Var, onq0 onq0Var, Continuation continuation) {
        super(2, continuation);
        this.$inner = tprVar;
        this.$collector = mqq0Var;
        this.$semaphore = onq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChannelFlowMerge$collectTo$2$1(this.$inner, this.$collector, this.$semaphore, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlowMerge$collectTo$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, zy11] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tpr tprVar = this.$inner;
                mqq0 mqq0Var = this.$collector;
                this.label = 1;
                if (tprVar.collect(mqq0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ((kotlinx.coroutines.sync.b) this.$semaphore).f();
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            ((kotlinx.coroutines.sync.b) this.$semaphore).f();
            throw th;
        }
    }
}
