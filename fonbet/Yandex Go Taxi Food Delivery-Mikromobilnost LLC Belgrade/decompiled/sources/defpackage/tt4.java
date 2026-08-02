package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.beginners.experiments.BeginnersOnboardingExperiment;
import com.yandex.go.beginners.experiments.BeginnersOnboardingExperiment$ServiceInfo$$serializer;
import com.yandex.go.benefits_center.benefits.data.model.BenefitCenterRequestBody;
import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import com.yandex.go.benefits_center.data.model.c;
import com.yandex.go.benefits_center.data.model.d;
import com.yandex.go.payments.data.model.BindGooglePayParams;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponseV2;
import com.yandex.go.places.impl.data.entities.network.organizations.a;
import com.yandex.go.places.impl.data.entities.network.organizations.b;
import com.yandex.go.places.impl.data.entities.network.organizations.f;
import com.yandex.go.places.impl.data.entities.network.organizations.i;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;
import com.yandex.go.safety.center.api.BaseTrustedContacts;
import com.yandex.go.safety.center.api.TrustedContact$$serializer;
import com.ybsdk.core.navigation.BaseNavigationActivity;
import java.lang.annotation.Annotation;
import java.util.UUID;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.q;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

/* loaded from: classes13.dex */
public final /* synthetic */ class tt4 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tt4(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ctb navigation_delegate$lambda$0;
        switch (this.a) {
            case 0:
                return new o4o("ru.yandex.taxi.communications.api.dto.BannerWidgets.ExtraAction.Unknown", ut4.INSTANCE, new Annotation[0]);
            case 1:
                return new o4o("ru.yandex.taxi.communications.api.dto.BannerWidgets.Image.Unknown", eu4.INSTANCE, new Annotation[0]);
            case 2:
                q qVar = BannerWidgets.OnCloseEffect.Companion;
                return BannerWidgets.OnCloseEffect.Type.Companion.serializer();
            case 3:
                return vez0.g("ru.yandex.taxi.communications.api.dto.BannerWidgets.OnCloseEffect.Type", BannerWidgets.OnCloseEffect.Type.values(), new String[]{"run_coupons_list_before_routestats"}, new Annotation[][]{null});
            case 4:
                return new xa90();
            case 5:
                return new xfu();
            case 6:
                return new pl40();
            case 7:
                navigation_delegate$lambda$0 = BaseNavigationActivity.navigation_delegate$lambda$0();
                return navigation_delegate$lambda$0;
            case 8:
                OrganizationGalleryItemState organizationGalleryItemState = OrganizationGalleryItemState.SHIMMERING;
                return scc.g(new ki80(organizationGalleryItemState), new ki80(organizationGalleryItemState));
            case 9:
                OrganizationGalleryItemState organizationGalleryItemState2 = OrganizationGalleryItemState.ERROR;
                return scc.g(new ki80(organizationGalleryItemState2), new ki80(organizationGalleryItemState2));
            case 10:
                a aVar = BaseOrganizationsResponse$OrganizationsResponse.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 11:
                a aVar2 = BaseOrganizationsResponse$OrganizationsResponse.Companion;
                return new p53(f.Companion.serializer(), 0);
            case 12:
                b bVar = BaseOrganizationsResponse$OrganizationsResponseV2.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 13:
                b bVar2 = BaseOrganizationsResponse$OrganizationsResponseV2.Companion;
                return new p53(i.Companion.serializer(), 0);
            case 14:
                return PaymentMethodType.Companion.serializer();
            case 15:
                return com.yandex.plus.webview.internal.contract.impl.loading.a.i;
            case 16:
                com.yandex.go.safety.center.api.e eVar = BaseTrustedContacts.Companion;
                return new p53(TrustedContact$$serializer.INSTANCE, 0);
            case 17:
                return tje.a(sbx.d, new l75(7));
            case 18:
                a7u0 a7u0Var = ve5.a;
                return null;
            case 19:
                com.yandex.go.beginners.experiments.a aVar3 = BeginnersAuthPostloadExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 20:
                com.yandex.go.beginners.experiments.b bVar3 = BeginnersOnboardingExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 21:
                com.yandex.go.beginners.experiments.b bVar4 = BeginnersOnboardingExperiment.Companion;
                return new p53(BeginnersOnboardingExperiment$ServiceInfo$$serializer.INSTANCE, 0);
            case 22:
                com.yandex.go.benefits_center.benefits.data.model.b bVar5 = BenefitCenterRequestBody.GeoState.Companion;
                return new p53(e6m.a, 0);
            case 23:
                com.yandex.go.benefits_center.data.model.a aVar4 = BenefitGeoState.Companion;
                return new p53(e6m.a, 0);
            case 24:
                c cVar = BenefitsCenterBanner.Companion;
                return vez0.g("com.yandex.go.benefits_center.data.model.BenefitsCenterBanner.Appearance", BenefitsCenterBanner.Appearance.values(), new String[]{Constants.NORMAL, "black_white", "muted"}, new Annotation[][]{null, null, null});
            case 25:
                d dVar = BenefitsCenterBanner.Metadata.Companion;
                return new p53(auu0.a, 0);
            case 26:
                return new o4o("com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload.NavigationAction.Unknown", wm5.INSTANCE, new Annotation[0]);
            case 27:
                com.yandex.go.payments.data.model.c cVar2 = BindGooglePayParams.Companion;
                return BindGooglePayParams.TokenizationType.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.payments.data.model.BindGooglePayParams.TokenizationType", BindGooglePayParams.TokenizationType.values(), new String[]{"direct", "gateway"}, new Annotation[][]{null, null});
            default:
                return UUID.randomUUID().toString();
        }
    }
}
