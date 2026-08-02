package ru.yandex.taxi.delivery.addresscorrection;

import defpackage.as0;
import defpackage.avh;
import defpackage.fvh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Las0;", "it", "Lzy11;", "<anonymous>", "(Las0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionPresenter$observeState$2", f = "DeliveryAddressCorrectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryAddressCorrectionPresenter$observeState$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fvh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressCorrectionPresenter$observeState$2(fvh fvhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fvhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryAddressCorrectionPresenter$observeState$2 deliveryAddressCorrectionPresenter$observeState$2 = new DeliveryAddressCorrectionPresenter$observeState$2(this.this$0, continuation);
        deliveryAddressCorrectionPresenter$observeState$2.L$0 = obj;
        return deliveryAddressCorrectionPresenter$observeState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryAddressCorrectionPresenter$observeState$2 deliveryAddressCorrectionPresenter$observeState$2 = (DeliveryAddressCorrectionPresenter$observeState$2) create((as0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryAddressCorrectionPresenter$observeState$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        as0 as0Var = (as0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ((avh) this.this$0.Dg()).x6(as0Var);
        return zy11.a;
    }
}
