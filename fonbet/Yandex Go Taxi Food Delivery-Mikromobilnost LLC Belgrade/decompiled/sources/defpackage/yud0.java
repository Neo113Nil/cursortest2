package defpackage;

import com.yandex.go.dto.response.Action$Payload;
import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment$TariffsSettings$$serializer;
import com.yandex.go.point_selection_settings.a;
import com.yandex.go.point_selection_settings.b;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.c3;
import com.yandex.go.zone.dto.objects.e3;
import com.yandex.go.zone.dto.objects.f3;
import com.yandex.go.zone.dto.objects.h3;
import com.yandex.go.zone.dto.objects.j3;
import defpackage.q9e0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.PositionConfirmationScreen;
import ru.yandex.taxi.common_models.net.map_object.b0;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes5.dex */
public final /* synthetic */ class yud0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ yud0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = PointSelectionScreenSettingsExperiment.Companion;
                return new p53(PointSelectionScreenSettingsExperiment$TariffsSettings$$serializer.INSTANCE, 0);
            case 1:
                b bVar = PointSelectionScreenSettingsExperiment.TariffsSettings.Companion;
                return PointSelectionScreenSettingsExperiment.TariffsSettings.Type.Companion.serializer();
            case 2:
                b bVar2 = PointSelectionScreenSettingsExperiment.TariffsSettings.Companion;
                return new p53(auu0.a, 0);
            case 3:
                return vez0.g("com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment.TariffsSettings.Type", PointSelectionScreenSettingsExperiment.TariffsSettings.Type.values(), new String[]{"starting", "destination"}, new Annotation[][]{null, null});
            case 4:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 5:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 6:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 7:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PollingAnimatorFactory");
            case 8:
                i3e0 i3e0Var = j3e0.Companion;
                return new p53(sud0.a, 0);
            case 9:
                l3e0 l3e0Var = m3e0.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 10:
                l4e0 l4e0Var = m4e0.Companion;
                return new p53(b0t.a, 0);
            case 11:
                o4e0 o4e0Var = p4e0.Companion;
                return Action$Payload.ObjectType.Companion.serializer();
            case 12:
                o4e0 o4e0Var2 = p4e0.Companion;
                return new p53(sud0.a, 0);
            case 13:
                r4e0 r4e0Var = s4e0.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 14:
                p9e0 p9e0Var = q9e0.a.Companion;
                return OptionType.Companion.serializer();
            case 15:
                f3 f3Var = PopupUiControl.Companion;
                return PopupUiControl.PopupUiControlType.Companion.serializer();
            case 16:
                c3 c3Var = PopupUiControl.CancelOrders.Companion;
                return new p53(auu0.a, 0);
            case 17:
                return new o4o("com.yandex.go.zone.dto.objects.PopupUiControl.Close", e3.INSTANCE, new Annotation[0]);
            case 18:
                h3 h3Var = PopupUiControl.OpenSummaryAddress.Companion;
                return PopupUiControl.OpenSummaryAddress.FocusField.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.zone.dto.objects.PopupUiControl.OpenSummaryAddress.FocusField", PopupUiControl.OpenSummaryAddress.FocusField.values(), new String[]{"source", "destination", null}, new Annotation[][]{null, null, null});
            case 20:
                return new o4o("com.yandex.go.zone.dto.objects.PopupUiControl.OpenTariffCardAction", j3.INSTANCE, new Annotation[0]);
            case 21:
                return vez0.g("com.yandex.go.zone.dto.objects.PopupUiControl.PopupUiControlType", PopupUiControl.PopupUiControlType.values(), new String[]{"button", "slider"}, new Annotation[][]{null, null});
            case 22:
                zce0 zce0Var = ade0.Companion;
                return new p53(z46.a, 0);
            case 23:
                cde0 cde0Var = dde0.Companion;
                return new p53(yce0.a, 0);
            case 24:
                lde0 lde0Var = b0.Companion;
                return jsq0.Companion.serializer(PositionConfirmationScreen.Companion.serializer());
            case 25:
                lde0 lde0Var2 = b0.Companion;
                return new p53(nor.a, 0);
            case 26:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.PositionConfirmationDeclineAction.ClarifyAddressOnMap", pde0.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.PositionConfirmationDeclineAction.Unknown", rde0.INSTANCE, new Annotation[0]);
            case 28:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.PositionConfirmationScreen", PositionConfirmationScreen.values(), new String[]{"main", "summary"}, new Annotation[][]{null, null});
            default:
                return vez0.g("com.yandex.go.shortcuts.dto.response.PositionOverMap", PositionOverMap.values(), new String[]{"center_start", "center_end"}, new Annotation[][]{null, null});
        }
    }
}
