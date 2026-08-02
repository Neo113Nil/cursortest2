package ru.yandex.taxi.logistics.deliveries;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.jjv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.DeliveryPreorderRouterImpl$openPreorder$2", f = "DeliveryPreorderRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPreorderRouterImpl$openPreorder$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $needRequestPaymentMethods;
    final /* synthetic */ Preorder $preorder;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPreorderRouterImpl$openPreorder$2(a aVar, Preorder preorder, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$preorder = preorder;
        this.$needRequestPaymentMethods = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPreorderRouterImpl$openPreorder$2(this.this$0, this.$preorder, this.$needRequestPaymentMethods, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryPreorderRouterImpl$openPreorder$2 deliveryPreorderRouterImpl$openPreorder$2 = (DeliveryPreorderRouterImpl$openPreorder$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryPreorderRouterImpl$openPreorder$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ynv0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        b = this.this$0.n.b(null, null);
        a aVar = this.this$0;
        Preorder preorder = this.$preorder;
        aVar.c.getClass();
        aVar.c(preorder, jjv0.b(b), this.$needRequestPaymentMethods);
        return zy11.a;
    }
}
