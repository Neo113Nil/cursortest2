package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesManagerActor$releaseDeliveryCancelling$1", f = "DeliveriesManagerActor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerActor$releaseDeliveryCancelling$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $deliveryId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerActor$releaseDeliveryCancelling$1(d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveriesManagerActor$releaseDeliveryCancelling$1(this.this$0, this.$deliveryId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DeliveriesManagerActor$releaseDeliveryCancelling$1 deliveriesManagerActor$releaseDeliveryCancelling$1 = (DeliveriesManagerActor$releaseDeliveryCancelling$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        deliveriesManagerActor$releaseDeliveryCancelling$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String o = g8e.o("Release delivery cancelling: deliveryId = ", this.$deliveryId);
        dVar.getClass();
        d.i(o);
        this.this$0.B.remove(this.$deliveryId);
        return zy11.a;
    }
}
