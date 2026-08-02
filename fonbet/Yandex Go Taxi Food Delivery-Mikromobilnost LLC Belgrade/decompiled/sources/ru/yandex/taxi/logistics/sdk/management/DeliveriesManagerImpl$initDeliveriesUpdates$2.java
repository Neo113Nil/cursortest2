package ru.yandex.taxi.logistics.sdk.management;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lhfi;", "deliveries", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.DeliveriesManagerImpl$initDeliveriesUpdates$2", f = "DeliveriesManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeliveriesManagerImpl$initDeliveriesUpdates$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerImpl$initDeliveriesUpdates$2(Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveriesManagerImpl$initDeliveriesUpdates$2 deliveriesManagerImpl$initDeliveriesUpdates$2 = new DeliveriesManagerImpl$initDeliveriesUpdates$2(continuation, this.this$0);
        deliveriesManagerImpl$initDeliveriesUpdates$2.L$0 = obj;
        return deliveriesManagerImpl$initDeliveriesUpdates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveriesManagerImpl$initDeliveriesUpdates$2 deliveriesManagerImpl$initDeliveriesUpdates$2 = (DeliveriesManagerImpl$initDeliveriesUpdates$2) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveriesManagerImpl$initDeliveriesUpdates$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.j(list);
        return zy11.a;
    }
}
