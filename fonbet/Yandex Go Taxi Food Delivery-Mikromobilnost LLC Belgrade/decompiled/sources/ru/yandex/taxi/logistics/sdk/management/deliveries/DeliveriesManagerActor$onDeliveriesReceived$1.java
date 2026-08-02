package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.hfi;
import defpackage.kn2;
import defpackage.lsi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesManagerActor$onDeliveriesReceived$1", f = "DeliveriesManagerActor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeliveriesManagerActor$onDeliveriesReceived$1 extends SuspendLambda implements tls {
    final /* synthetic */ List<hfi> $newDeliveries;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerActor$onDeliveriesReceived$1(d dVar, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$newDeliveries = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveriesManagerActor$onDeliveriesReceived$1(this.this$0, this.$newDeliveries, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DeliveriesManagerActor$onDeliveriesReceived$1 deliveriesManagerActor$onDeliveriesReceived$1 = (DeliveriesManagerActor$onDeliveriesReceived$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        deliveriesManagerActor$onDeliveriesReceived$1.invokeSuspend(zy11Var);
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
        String str = "Deliveries received: " + this.$newDeliveries;
        dVar.getClass();
        d.i(str);
        this.this$0.A = new ArrayList(this.$newDeliveries);
        List<hfi> list = this.$newDeliveries;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String j = ((hfi) it.next()).j();
            if (j != null) {
                arrayList.add(j);
            }
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        lsi lsiVar = this.this$0.c;
        kn2 kn2Var = new kn2(4, this.$newDeliveries, N0);
        ycc.w(lsiVar.b, kn2Var, true);
        if (ycc.w(lsiVar.c(), kn2Var, true)) {
            lsiVar.a.set(lsiVar.c());
        }
        return zy11.a;
    }
}
