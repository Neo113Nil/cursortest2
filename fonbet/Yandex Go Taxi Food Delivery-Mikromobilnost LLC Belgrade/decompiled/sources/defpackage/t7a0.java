package defpackage;

import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment;
import com.yandex.go.payments.badges.b;
import com.yandex.go.payments.badges.c;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationResult;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus;
import com.yandex.go.payments.cards.domainverification.data.h;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.n1;
import com.yandex.go.payments.data.model.response.p1;
import com.yandex.go.payments.data.model.response.y0;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsSubtitlesTariffDescription$$serializer;
import com.yandex.go.payments.paymentlist.experiments.u;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import com.yandex.go.places.flex.container.domain.actions.PerformOnParentDocumentAction;
import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatus;
import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatusResponse;
import com.yandex.go.places.impl.data.entities.network.payments.a;
import com.yandex.go.taxi.order.search.v2.data.api.response.dto.PerformerDTO;
import com.yandex.go.taxi.order.search.v2.data.api.response.dto.PositionDTO$$serializer;
import com.yandex.payment.common.result.ResultType;
import com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class t7a0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ t7a0(w040 w040Var) {
        this.a = 22;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.eatskit.dto.PaymentMethodType", PaymentMethodType.values(), new String[]{"cash", "card", "corp", "googlepay", "personal_wallet"}, new Annotation[][]{null, null, null, null, null});
            case 1:
                h hVar = PaymentMethodVerificationResult.Companion;
                return PaymentMethodVerificationStatus.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus", PaymentMethodVerificationStatus.values(), new String[]{"not_started", "cvn_expected", "3ds_required", "in_progress", "amount_expected", "sms_code_expected", "otp_expected", "qr_expected", "3ds_status_received", "success", ResultType.RESULT_TYPE_FAILURE, "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
            case 3:
                return new p53(u3a0.a, 0);
            case 4:
                y0 y0Var = PaymentMethods.LastPaymentMethod.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 5:
                b bVar = PaymentMethodsBadgesExperiment.AddPaymentBadge.Companion;
                return new p53(auu0.a, 0);
            case 6:
                c cVar = PaymentMethodsBadgesExperiment.Badge.Companion;
                return new p53(auu0.a, 0);
            case 7:
                c cVar2 = PaymentMethodsBadgesExperiment.Badge.Companion;
                return new p53(auu0.a, 0);
            case 8:
                c cVar3 = PaymentMethodsBadgesExperiment.Badge.Companion;
                return new p53(auu0.a, 0);
            case 9:
                c cVar4 = PaymentMethodsBadgesExperiment.Badge.Companion;
                return new p53(auu0.a, 0);
            case 10:
                u uVar = PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription.Companion;
                return new p53(auu0.a, 1);
            case 11:
                u uVar2 = PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription.Companion;
                return new p53(PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsSubtitlesTariffDescription$$serializer.INSTANCE, 0);
            case 12:
                u uVar3 = PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription.Companion;
                return new p53(auu0.a, 1);
            case 13:
                com.yandex.go.payments.promo.b bVar2 = PaymentMethodsPromoBannerExperiment.PromoBannerDto.Companion;
                return new p53(auu0.a, 1);
            case 14:
                return new p53(auu0.a, 0);
            case 15:
                return new p53(auu0.a, 0);
            case 16:
                return new gja0(0);
            case 17:
                return vez0.g("com.yandex.go.places.impl.data.entities.network.payments.PaymentStatus", PaymentStatus.values(), new String[]{"processing", "user_interaction", "success", "failed"}, new Annotation[][]{null, null, null, null});
            case 18:
                a aVar = PaymentStatusResponse.Companion;
                return PaymentStatus.Companion.serializer();
            case 19:
                kka0 kka0Var = PaymentSubmitResultDto.Companion;
                return vez0.g("com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto.StatusDto", PaymentSubmitResultDto.StatusDto.values(), new String[]{"SUCCESS", "FAIL", null}, new Annotation[][]{null, null, null});
            case 20:
                throw new IllegalStateException("PaymentKitWidget not provided");
            case 21:
                return new DecimalFormat(ProviderParameters.DEFAULT_PRODUCT_VER, DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            case 22:
                new mqa0();
                return new lqa0();
            case 23:
                com.yandex.go.places.flex.container.domain.actions.a aVar2 = PerformOnParentDocumentAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 24:
                com.yandex.go.taxi.order.search.v2.data.api.response.dto.c cVar5 = PerformerDTO.Companion;
                return new p53(qke.n(PositionDTO$$serializer.INSTANCE), 0);
            case 25:
                zy11Var = zy11.a;
                return zy11Var;
            case 26:
                n1 n1Var = PersonalAccount.PaymentOrder.Companion;
                return PersonalAccount.PaymentOrder.Status.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.payments.data.model.response.PersonalAccount.PaymentOrder.Status", PersonalAccount.PaymentOrder.Status.values(), new String[]{"not_found", "expired", "processing", "failed", "succeeded", null}, new Annotation[][]{null, null, null, null, null, null});
            case 28:
                p1 p1Var = PersonalAccount.ScreenDetails.Companion;
                return PersonalAccount.ScreenDetails.GlyphType.Companion.serializer();
            default:
                return vez0.g("com.yandex.go.payments.data.model.response.PersonalAccount.ScreenDetails.GlyphType", PersonalAccount.ScreenDetails.GlyphType.values(), new String[]{"default_plus", null}, new Annotation[][]{null, null});
        }
    }

    public /* synthetic */ t7a0(int i) {
        this.a = i;
    }
}
