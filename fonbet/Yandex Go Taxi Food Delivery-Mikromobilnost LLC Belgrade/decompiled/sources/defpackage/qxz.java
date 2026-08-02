package defpackage;

import android.animation.AnimatorSet;
import com.yandex.go.chargers.partner_subscription.data.m;
import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.MainScreenOnboardingButtonProperties;
import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.b;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateBalanceDto$$serializer;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateResponse;
import com.yandex.go.loyalty.impl.selector.data.model.k;
import com.yandex.go.payments.data.model.MBankAccountDto;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.p0;
import com.yandex.go.payments.data.model.y;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import com.yandex.go.places.impl.data.entities.network.map.MapObjectsItemDtoWrapper;
import com.yandex.go.places.models.data.entities.network.TriggerActionDto$$serializer;
import com.yandex.go.places.models.data.entities.network.c0;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$SocialPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$UniversalPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SocialDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLOrgPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.a;
import com.yandex.go.places.models.data.entities.network.map.c;
import com.yandex.go.places.models.data.entities.network.map.d;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.models.data.entities.network.map.h;
import com.yandex.go.places.models.data.entities.network.map.i;
import com.yandex.go.places.models.data.entities.network.map.j;
import com.yandex.go.places.models.data.entities.network.map.o;
import com.yandex.go.places.models.data.entities.network.map.p;
import com.yandex.go.places.models.data.entities.network.map.t;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.a0;
import com.yandex.go.taxi.order.models.api.objects.w;
import com.yandex.go.taxi.order.models.api.objects.x;
import flex.feature.sections.action.ScrollPositionSurrogate;
import java.lang.annotation.Annotation;

/* loaded from: classes13.dex */
public final /* synthetic */ class qxz implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ qxz(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                k kVar = LoyaltyStateResponse.Companion;
                return new p53(LoyaltyStateBalanceDto$$serializer.INSTANCE, 0);
            case 1:
                return new o4o("com.yandex.go.chargers.partner_subscription.data.LoyaltyTermsLink.LoyaltyTermsLinkAction.Unknown", m.INSTANCE, new Annotation[0]);
            case 2:
                p0 p0Var = MBankAccount.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 3:
                y yVar = MBankAccountDto.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 4:
                return new gdd0();
            case 5:
                return vez0.g("com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment.PaymentTypes", MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.values(), new String[]{"card", "sbp_token", null}, new Annotation[][]{null, null, null});
            case 6:
                com.yandex.go.payments.paymentlist.experiments.m mVar = MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.Companion;
                return MainMenuPaymentMethodsSelectorExperiment.Screen.Companion.serializer();
            case 7:
                com.yandex.go.payments.paymentlist.experiments.m mVar2 = MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.Companion;
                return jsq0.Companion.serializer(MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.Companion.serializer());
            case 8:
                return vez0.g("com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment.Screen", MainMenuPaymentMethodsSelectorExperiment.Screen.values(), new String[]{"payment_list", "details_card"}, new Annotation[][]{null, null});
            case 9:
                b bVar = MainScreenOnboardingButtonProperties.Companion;
                return ScrollPositionSurrogate.Companion.serializer();
            case 10:
                return new jrt();
            case 11:
                w wVar = MapObject.Companion;
                return MapObject.Type.Companion.serializer();
            case 12:
                w wVar2 = MapObject.Companion;
                return new p53(nor.a, 0);
            case 13:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.MapObject.AlignType", MapObject.AlignType.values(), new String[]{"bottom", "top", null}, new Annotation[][]{null, null, null});
            case 14:
                x xVar = MapObject.Style.Companion;
                return MapObject.AlignType.Companion.serializer();
            case 15:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.MapObject.Type", MapObject.Type.values(), new String[]{"bubble", null}, new Annotation[][]{null, null});
            case 16:
                return new o4o("com.yandex.go.taxi.order.models.api.objects.MapObjectAction.Unknown", a0.INSTANCE, new Annotation[0]);
            case 17:
                a aVar = MapObjectItemDto$OrganizationPreviewPinDto.Companion;
                return new p53(TriggerActionDto$$serializer.INSTANCE, 0);
            case 18:
                com.yandex.go.places.models.data.entities.network.map.b bVar2 = MapObjectItemDto$SocialPinDto.Companion;
                return new p53(TriggerActionDto$$serializer.INSTANCE, 0);
            case 19:
                c cVar = MapObjectItemDto$UniversalPinDto.Companion;
                return new p53(TriggerActionDto$$serializer.INSTANCE, 0);
            case 20:
                return new o4o("com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto.Unknown", d.INSTANCE, new Annotation[0]);
            case 21:
                h hVar = MapObjectPinStyleDto$SocialDefaultPinStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 22:
                i iVar = MapObjectPinStyleDto$SupermapUniversalLOrgPinStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 23:
                j jVar = MapObjectPinStyleDto$SupermapUniversalLPinStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 24:
                com.yandex.go.places.models.data.entities.network.map.k kVar2 = MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 25:
                o oVar = MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 26:
                p pVar = MapObjectPinStyleDto$UniversalLPinStyleDto.Companion;
                return new p53(c0.Companion.serializer(), 0);
            case 27:
                return new o4o("com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto.Unknown", t.INSTANCE, new Annotation[0]);
            case 28:
                com.yandex.go.places.impl.data.entities.network.map.a aVar2 = MapObjectsItemDtoWrapper.Companion;
                return new p53(e.Companion.serializer(), 0);
            default:
                return new AnimatorSet();
        }
    }
}
