package ru.yandex.taxi.delivery.ui.form;

import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.dms;
import defpackage.mvg;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.wli;
import defpackage.x5i;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lx5i;", "deliveryData", "Lnvi;", ClidProvider.STATE, "", "Lzlj0;", DownloadService.KEY_REQUIREMENTS, "Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;", "formType", "Lwli;", "<anonymous>", "(Lx5i;Lnvi;Ljava/util/List;Lru/yandex/taxi/delivery/extracted_form_common_data/models/ui/DeliveryFormType;)Lwli;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeSectionsUpdating$2", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeSectionsUpdating$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        DeliveryFormPresenter$subscribeSectionsUpdating$2 deliveryFormPresenter$subscribeSectionsUpdating$2 = new DeliveryFormPresenter$subscribeSectionsUpdating$2(5, (Continuation) obj5);
        deliveryFormPresenter$subscribeSectionsUpdating$2.L$0 = (x5i) obj;
        deliveryFormPresenter$subscribeSectionsUpdating$2.L$1 = (nvi) obj2;
        deliveryFormPresenter$subscribeSectionsUpdating$2.L$2 = (List) obj3;
        deliveryFormPresenter$subscribeSectionsUpdating$2.L$3 = (DeliveryFormType) obj4;
        return deliveryFormPresenter$subscribeSectionsUpdating$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x5i x5iVar = (x5i) this.L$0;
        nvi nviVar = (nvi) this.L$1;
        List list = (List) this.L$2;
        DeliveryFormType deliveryFormType = (DeliveryFormType) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new wli(x5iVar, nviVar, list, deliveryFormType);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
