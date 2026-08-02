package defpackage;

import android.webkit.CookieManager;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings$$serializer;
import com.yandex.go.zone.dto.objects.SurgeIconStyle;
import com.yandex.go.zone.dto.objects.SurgeIconType;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.TariffCard$BrandingFeature$$serializer;
import com.yandex.go.zone.dto.objects.TariffCard$Option$$serializer;
import com.yandex.go.zone.dto.objects.TariffGroupDefinitionPresentationType;
import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinitionPresentation;
import com.yandex.go.zone.dto.objects.TariffInfoViewSection;
import com.yandex.go.zone.dto.objects.TariffInfoViewSectionItem;
import com.yandex.go.zone.dto.objects.TariffInfoViewSectionItem$$serializer;
import com.yandex.go.zone.dto.objects.TariffViewSectionItemType;
import com.yandex.go.zone.dto.objects.b6;
import com.yandex.go.zone.dto.objects.f6;
import com.yandex.go.zone.dto.objects.i6;
import com.yandex.go.zone.dto.objects.j6;
import com.yandex.go.zone.dto.objects.k6;
import com.yandex.go.zone.dto.objects.x5;
import com.yandex.go.zone.dto.response.TariffAction;
import com.yandex.go.zone.dto.response.i;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;
import ru.yandex.taxi.requirements.experiments.a;
import ru.yandex.taxi.requirements.experiments.e;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class xlw0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ xlw0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(auu0.a, 0);
            case 1:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType", SupportedOptionType.values(), new String[]{"verticals_multiclass", "order_flow_delivery", "requirements_v2", "plus_promo_alternative", "toll_roads_v2", "multiclass_requirements", "vertical_selector_on_summary", "multiclass_preorder"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 2:
                nmw0 nmw0Var = c.Companion;
                return hgh.Companion.serializer();
            case 3:
                nmw0 nmw0Var2 = c.Companion;
                return new p53(auu0.a, 0);
            case 4:
                nmw0 nmw0Var3 = c.Companion;
                return new p53(auu0.a, 0);
            case 5:
                x5 x5Var = SurgeIconStyle.Companion;
                return SurgeIconType.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.go.zone.dto.objects.SurgeIconType", SurgeIconType.values(), new String[]{"default"}, new Annotation[][]{null});
            case 7:
                return new o4o("ru.yandex.taxi.scooters.data.model.SurgeInfoItem.Unsupported", isw0.INSTANCE, new Annotation[0]);
            case 8:
                dww0 dww0Var = gww0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 9:
                pxw0 pxw0Var = qxw0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 10:
                pxw0 pxw0Var2 = qxw0.Companion;
                return new p53(ColorSettings$$serializer.INSTANCE, 0);
            case 11:
                byw0 byw0Var = cyw0.Companion;
                return new p53(dyw0.a, 0);
            case 12:
                return CookieManager.getInstance();
            case 13:
                uax0 uax0Var = wax0.Companion;
                return new p53(auu0.a, 0);
            case 14:
                uax0 uax0Var2 = wax0.Companion;
                return new p53(wc3.e, 0);
            case 15:
                i iVar = TariffAction.Action.Companion;
                return TariffAction.ActionType.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.zone.dto.response.TariffAction.ActionType", TariffAction.ActionType.values(), new String[]{"show_eula_and_wait_for_accept", null}, new Annotation[][]{null, null});
            case 17:
                b6 b6Var = TariffCard.Companion;
                return new p53(TariffCard$Option$$serializer.INSTANCE, 0);
            case 18:
                b6 b6Var2 = TariffCard.Companion;
                return new p53(TariffCard$BrandingFeature$$serializer.INSTANCE, 0);
            case 19:
                ycx0 ycx0Var = TariffCardPreorderCellCustomizationExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 20:
                ycx0 ycx0Var2 = TariffCardPreorderCellCustomizationExperiment.Companion;
                return new k8u(auu0.a, a.a, 1);
            case 21:
                e eVar = TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.Companion;
                return TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection.Companion.serializer();
            case 22:
                return vez0.g("ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection", TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection.values(), new String[]{"default", "glued"}, new Annotation[][]{null, null});
            case 23:
                return vez0.g("com.yandex.go.zone.dto.objects.TariffGroupDefinitionPresentationType", TariffGroupDefinitionPresentationType.values(), new String[]{"modal", null}, new Annotation[][]{null, null});
            case 24:
                return vez0.g("com.yandex.go.zone.dto.objects.TariffGroupDefinitionType", TariffGroupDefinitionType.values(), new String[]{"item", "flat", "carousel", null}, new Annotation[][]{null, null, null, null});
            case 25:
                f6 f6Var = TariffInfoGroupDefinition.Companion;
                return new p53(auu0.a, 0);
            case 26:
                f6 f6Var2 = TariffInfoGroupDefinition.Companion;
                return TariffGroupDefinitionType.Companion.serializer();
            case 27:
                i6 i6Var = TariffInfoGroupDefinitionPresentation.Companion;
                return TariffGroupDefinitionPresentationType.Companion.serializer();
            case 28:
                j6 j6Var = TariffInfoViewSection.Companion;
                return new p53(TariffInfoViewSectionItem$$serializer.INSTANCE, 0);
            default:
                k6 k6Var = TariffInfoViewSectionItem.Companion;
                return TariffViewSectionItemType.Companion.serializer();
        }
    }
}
