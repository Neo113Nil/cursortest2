package ru.yandex.taxi.net.tracker;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o201;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1", f = "BaseSmoothMovementTracker.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ o201 $data;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1(e eVar, o201 o201Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$data = o201Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1 baseSmoothMovementTracker$startWebSocketConsumer$2$2$1 = new BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1(this.this$0, this.$data, continuation);
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$1.L$0 = obj;
        return baseSmoothMovementTracker$startWebSocketConsumer$2$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            e.ae(this.this$0, this.$data);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
