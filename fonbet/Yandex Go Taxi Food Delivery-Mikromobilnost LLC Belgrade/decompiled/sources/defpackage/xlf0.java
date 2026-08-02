package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.go.chargers.offer.passes.data.model.PurchaseInfo;
import com.yandex.go.chargers.offer.passes.data.model.PurchaseInfo$Description$$serializer;
import com.yandex.go.chargers.offer.passes.data.model.h;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.places.models.data.entities.network.bottom_panel.PromoDetailsDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.PromoInfoDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.p;
import com.yandex.go.places.models.data.entities.network.bottom_panel.q;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionTypeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationIdDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeSectionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeStatusDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.a;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.b;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.c;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.j;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.QualityQuestionExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.f;
import com.yandex.go.taxi.order.queue.interactor.e;
import com.yandex.payment.common.result.ResultType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.c0;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes13.dex */
public final /* synthetic */ class xlf0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ xlf0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = PromoCodeActionDto.Companion;
                return new p53(omf0.e, 0);
            case 1:
                return vez0.g("com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionTypeDto", PromoCodeActionTypeDto.values(), new String[]{"popup"}, new Annotation[][]{null});
            case 2:
                b bVar = PromoCodeDecorationDto.Companion;
                return PromoCodeDecorationIdDto.Companion.serializer();
            case 3:
                return vez0.g("com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationIdDto", PromoCodeDecorationIdDto.values(), new String[]{"balloons", "image_tag"}, new Annotation[][]{null, null});
            case 4:
                c cVar = PromoCodeDto.Companion;
                return PromoCodeStatusDto.Companion.serializer();
            case 5:
                c cVar2 = PromoCodeDto.Companion;
                return new p53(auu0.a, 0);
            case 6:
                c cVar3 = PromoCodeDto.Companion;
                return new p53(auu0.a, 0);
            case 7:
                j jVar = PromoCodeSectionDto.Companion;
                return new p53(auu0.a, 0);
            case 8:
                return vez0.g("com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeStatusDto", PromoCodeStatusDto.values(), new String[]{"valid", "invalid", "restricted", null}, new Annotation[][]{null, null, null, null});
            case 9:
                p pVar = PromoDetailsDto.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 10:
                onf0 onf0Var = pnf0.Companion;
                return new k8u(auu0.a, fi2.a, 1);
            case 11:
                q qVar = PromoInfoDto.Companion;
                return new p53(auu0.a, 0);
            case 12:
                nsf0 nsf0Var = msf0.Companion;
                return new p53(ksf0.a, 0);
            case 13:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.PullOutOfZoneAction", c0.INSTANCE, new Annotation[0]);
            case 14:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto", PurchaseErrorTypeDto.values(), new String[]{"unknownError", "choosePaymentMethodError", "paymentError", "cancel", "parseConfigError", "noTarget", "noProductsByTarget", "emptyProductsByTarget", "unknownPaymentMethod", "noProductById", "unknownPurchaseType"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 15:
                yzf0 yzf0Var = b0g0.Companion;
                return new p53(zzf0.a, 0);
            case 16:
                h hVar = PurchaseInfo.Companion;
                return new p53(PurchaseInfo$Description$$serializer.INSTANCE, 0);
            case 17:
                return vez0.g("ru.yandex.taxi.scooters.data.model.PurchaseStatus", PurchaseStatus.values(), new String[]{"success", "pending", "failed"}, new Annotation[][]{null, null, null});
            case 18:
                return vez0.g("com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus", com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus.values(), new String[]{"success", "pending", "failed"}, new Annotation[][]{null, null, null});
            case 19:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto", PurchaseStatusTypeDto.values(), new String[]{"success", ResultType.RESULT_TYPE_FAILURE, "cancel"}, new Annotation[][]{null, null, null});
            case 20:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto", PurchaseTypeDto.values(), new String[]{URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "deprecated_host", "inApp", "native", "web", "unknown"}, new Annotation[][]{null, null, null, null, null, null});
            case 21:
                com.yandex.go.notifications.acknowledge.data.model.a aVar2 = PushAckParam.Companion;
                return PushAckStatus.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.notifications.acknowledge.data.model.PushAckStatus", PushAckStatus.values(), new String[]{"shown", "tapped", "button_tapped", "dismissed", "blocked", "hidden", "delivered", "error"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 23:
                return new p53(z5g0.a, 0);
            case 24:
                return new h9g0(0);
            case 25:
                return new j1v0(new t8j0(), 2);
            case 26:
                return "Error while getting data";
            case 27:
                f fVar = QualityQuestionExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 28:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "QueueChangePriceInteractor");
            default:
                int i = e.j;
                return "Unable to parse QueueChangePriceResponseErrorDto";
        }
    }
}
