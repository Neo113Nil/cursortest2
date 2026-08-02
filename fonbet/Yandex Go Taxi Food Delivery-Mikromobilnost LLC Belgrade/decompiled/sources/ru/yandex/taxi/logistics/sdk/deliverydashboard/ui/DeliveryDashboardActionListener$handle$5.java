package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.hhg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhhg;", "a", "Lzy11;", "<anonymous>", "(Lhhg;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.DeliveryDashboardActionListener$handle$5", f = "DeliveryDashboardActionListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryDashboardActionListener$handle$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDashboardActionListener$handle$5(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryDashboardActionListener$handle$5 deliveryDashboardActionListener$handle$5 = new DeliveryDashboardActionListener$handle$5(this.this$0, continuation);
        deliveryDashboardActionListener$handle$5.L$0 = obj;
        return deliveryDashboardActionListener$handle$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryDashboardActionListener$handle$5 deliveryDashboardActionListener$handle$5 = (DeliveryDashboardActionListener$handle$5) create((hhg) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryDashboardActionListener$handle$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hhg hhgVar = (hhg) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        tje.N(bVar.e, null, null, new DeliveryDashboardActionListener$handle$1(hhgVar, null, bVar), 3);
        return zy11.a;
    }
}
