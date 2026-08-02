package ru.yandex.taxi.delivery.addresscorrection;

import defpackage.as0;
import defpackage.fvh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tqo;
import defpackage.yr0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltqo;", "titlesViewModel", "Lyr0;", "correctionFieldsViewModel", "Las0;", "<anonymous>", "(Ltqo;Lyr0;)Las0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionPresenter$observeState$1", f = "DeliveryAddressCorrectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryAddressCorrectionPresenter$observeState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ fvh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressCorrectionPresenter$observeState$1(fvh fvhVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fvhVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryAddressCorrectionPresenter$observeState$1 deliveryAddressCorrectionPresenter$observeState$1 = new DeliveryAddressCorrectionPresenter$observeState$1(this.this$0, (Continuation) obj3);
        deliveryAddressCorrectionPresenter$observeState$1.L$0 = (tqo) obj;
        deliveryAddressCorrectionPresenter$observeState$1.L$1 = (yr0) obj2;
        return deliveryAddressCorrectionPresenter$observeState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tqo tqoVar = (tqo) this.L$0;
        yr0 yr0Var = (yr0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new as0(tqoVar, yr0Var, this.this$0.x.d);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
