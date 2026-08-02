package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$subscribeToTransportCardEvents$2", f = "MtTransportCardSubscriber.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTransportCardSubscriber$subscribeToTransportCardEvents$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTransportCardSubscriber$subscribeToTransportCardEvents$2(Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtTransportCardSubscriber$subscribeToTransportCardEvents$2 mtTransportCardSubscriber$subscribeToTransportCardEvents$2 = new MtTransportCardSubscriber$subscribeToTransportCardEvents$2(continuation, this.this$0);
        mtTransportCardSubscriber$subscribeToTransportCardEvents$2.L$0 = obj;
        return mtTransportCardSubscriber$subscribeToTransportCardEvents$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTransportCardSubscriber$subscribeToTransportCardEvents$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Boolean valueOf = Boolean.valueOf(this.this$0.b.f());
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
