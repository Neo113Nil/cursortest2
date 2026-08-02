package ru.yandex.taxi.linked_order.provider;

import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.qu;
import defpackage.vms;
import defpackage.wls;
import defpackage.y7u;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lsly;", "list", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.provider.ActiveLinkedOrderRepository$activeOrdersFlow$3", f = "ActiveLinkedOrderRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ActiveLinkedOrderRepository$activeOrdersFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveLinkedOrderRepository$activeOrdersFlow$3(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActiveLinkedOrderRepository$activeOrdersFlow$3 activeLinkedOrderRepository$activeOrdersFlow$3 = new ActiveLinkedOrderRepository$activeOrdersFlow$3(continuation, this.this$0);
        activeLinkedOrderRepository$activeOrdersFlow$3.L$0 = obj;
        return activeLinkedOrderRepository$activeOrdersFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ActiveLinkedOrderRepository$activeOrdersFlow$3 activeLinkedOrderRepository$activeOrdersFlow$3 = (ActiveLinkedOrderRepository$activeOrdersFlow$3) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        activeLinkedOrderRepository$activeOrdersFlow$3.invokeSuspend(zy11Var);
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
        qrq0 qrq0Var = y7u.b;
        ArrayList g = vms.g(list, new qu(1));
        cne0 cne0Var = this.this$0.c.a;
        cne0Var.u("linked_order", !g.isEmpty());
        cne0Var.r("linked_order_statuses", vms.e("linked_order", g));
        return zy11.a;
    }
}
