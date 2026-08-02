package ru.yandex.taxi.delivery.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;", "formTypeByExp", "formTypeByD2d"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.delivery.interactors.DeliveryFormTypeInteractor$observeFormType$1", f = "DeliveryFormTypeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormTypeInteractor$observeFormType$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryFormTypeInteractor$observeFormType$1 deliveryFormTypeInteractor$observeFormType$1 = new DeliveryFormTypeInteractor$observeFormType$1(3, (Continuation) obj3);
        deliveryFormTypeInteractor$observeFormType$1.L$0 = (DeliveryFormType) obj;
        deliveryFormTypeInteractor$observeFormType$1.L$1 = (DeliveryFormType) obj2;
        return deliveryFormTypeInteractor$observeFormType$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeliveryFormType deliveryFormType = (DeliveryFormType) this.L$0;
        DeliveryFormType deliveryFormType2 = (DeliveryFormType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return deliveryFormType2 == null ? deliveryFormType : deliveryFormType2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
