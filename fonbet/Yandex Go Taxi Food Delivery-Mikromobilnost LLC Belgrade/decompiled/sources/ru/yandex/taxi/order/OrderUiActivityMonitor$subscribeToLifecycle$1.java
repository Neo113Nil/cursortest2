package ru.yandex.taxi.order;

import androidx.lifecycle.Lifecycle;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ssu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zdy;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderUiActivityMonitor$subscribeToLifecycle$1", f = "OrderUiActivityMonitor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class OrderUiActivityMonitor$subscribeToLifecycle$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderUiActivityMonitor$subscribeToLifecycle$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderUiActivityMonitor$subscribeToLifecycle$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderUiActivityMonitor$subscribeToLifecycle$1 orderUiActivityMonitor$subscribeToLifecycle$1 = (OrderUiActivityMonitor$subscribeToLifecycle$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderUiActivityMonitor$subscribeToLifecycle$1.invokeSuspend(zy11Var);
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
        Lifecycle lifecycle = this.this$0.a;
        lifecycle.a(new zdy(j73.f0(new Lifecycle.Event[]{Lifecycle.Event.ON_RESUME, Lifecycle.Event.ON_PAUSE}), new ssu(18, this.this$0), lifecycle));
        return zy11.a;
    }
}
