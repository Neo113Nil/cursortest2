package ru.yandex.taxi.delivery.interactors;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ati;
import defpackage.e6i;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "", "userSelection", "Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;", "<anonymous>", "(Lfnx0;Z)Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.interactors.DeliveryFormTypeInteractor$formTypeByD2dFlow$1", f = "DeliveryFormTypeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormTypeInteractor$formTypeByD2dFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryFormTypeInteractor$formTypeByD2dFlow$1 deliveryFormTypeInteractor$formTypeByD2dFlow$1 = new DeliveryFormTypeInteractor$formTypeByD2dFlow$1(3, (Continuation) obj3);
        deliveryFormTypeInteractor$formTypeByD2dFlow$1.L$0 = (fnx0) obj;
        deliveryFormTypeInteractor$formTypeByD2dFlow$1.L$1 = (Boolean) obj2;
        return deliveryFormTypeInteractor$formTypeByD2dFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e6i e6iVar;
        fnx0 fnx0Var = (fnx0) this.L$0;
        Boolean bool = (Boolean) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ati atiVar = fnx0Var.c.Z;
        if (atiVar != null && (e6iVar = atiVar.j) != null) {
            if (bool != null ? bool.booleanValue() : e6iVar.a) {
                return DeliveryFormType.FULL;
            }
        }
        return null;
    }
}
