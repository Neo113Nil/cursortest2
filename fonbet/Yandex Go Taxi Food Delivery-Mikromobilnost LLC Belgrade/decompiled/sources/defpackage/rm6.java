package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.agreement.api.trackable.network.a;
import com.yandex.go.call_center.api.model.CallCenter;
import com.yandex.go.delivery.rental_duration_selector.experiment.BulletListDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.PointDto$$serializer;
import com.yandex.go.delivery.rental_duration_selector.experiment.b;
import com.yandex.go.dto.response.BundledOrdersPayload;
import com.yandex.go.dto.response.OrderDto$$serializer;
import com.yandex.go.dto.response.r1;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.models.api.cancel.Button$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.Buttons;
import com.yandex.go.taxi.order.models.api.cancel.ButtonsArrangementDto;
import com.yandex.go.taxi.order.models.api.cancel.x;
import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import com.yandex.go.taxi.order.models.api.objects.h;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup$Description$$serializer;
import com.yandex.go.zone.dto.objects.PopupUiControl$$serializer;
import com.yandex.go.zone.dto.objects.n;
import com.yandex.go.zone.dto.objects.p;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle;
import ru.yandex.taxi.common_models.net.map_object.BubbleOrientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleShowState;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;
import ru.yandex.taxi.surge.models.dto.ButtonStyle;

/* loaded from: classes14.dex */
public final /* synthetic */ class rm6 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ rm6(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle", BubbleFontStyle.values(), new String[]{Constants.NORMAL, "bold", "italic", null}, new Annotation[][]{null, null, null, null});
            case 1:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.BubbleOrientation", BubbleOrientation.values(), new String[]{null, "top", "bottom"}, new Annotation[][]{null, null, null});
            case 2:
                ln6 ln6Var = mn6.Companion;
                return jsq0.Companion.serializer(BubbleShowState.Companion.serializer());
            case 3:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.BubbleShowState", BubbleShowState.values(), new String[]{null, "unselected", "selected"}, new Annotation[][]{null, null, null});
            case 4:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.BubbleStructure", BubbleStructure.values(), new String[]{null, "capsule", "squircle"}, new Annotation[][]{null, null, null});
            case 5:
                zy11Var = zy11.a;
                return zy11Var;
            case 6:
                return new t8j0();
            case 7:
                return new t8j0();
            case 8:
                b bVar = BulletListDto.Companion;
                return new p53(PointDto$$serializer.INSTANCE, 0);
            case 9:
                n nVar = BulletsOrderPopup.Companion;
                return new p53(BulletsOrderPopup$Description$$serializer.INSTANCE, 0);
            case 10:
                n nVar2 = BulletsOrderPopup.Companion;
                return new p53(PopupUiControl$$serializer.INSTANCE, 0);
            case 11:
                p pVar = BulletsOrderPopup.HeaderAppearance.Companion;
                return BulletsOrderPopup.HeaderAppearance.Type.Companion.serializer();
            case 12:
                return vez0.g("com.yandex.go.zone.dto.objects.BulletsOrderPopup.HeaderAppearance.Type", BulletsOrderPopup.HeaderAppearance.Type.values(), new String[]{"default", "prominent"}, new Annotation[][]{null, null});
            case 13:
                r1 r1Var = BundledOrdersPayload.Companion;
                return new p53(OrderDto$$serializer.INSTANCE, 0);
            case 14:
                k07 k07Var = l07.Companion;
                return ButtonStyle.Companion.serializer();
            case 15:
                h hVar = ButtonModifierDTO.Companion;
                return ButtonModifierDTO.ButtonName.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO.ButtonName", ButtonModifierDTO.ButtonName.values(), new String[]{"call_to_driver"}, new Annotation[][]{null});
            case 17:
                return new v42();
            case 18:
                y27 y27Var = y27.f;
                return zy11.a;
            case 19:
                return vez0.g("ru.yandex.taxi.surge.models.dto.ButtonStyle", ButtonStyle.values(), new String[]{"default", "accent", null}, new Annotation[][]{null, null, null});
            case 20:
                p47 p47Var = r47.Companion;
                return Orientation.Companion.serializer();
            case 21:
                x xVar = Buttons.Companion;
                return Orientation.Companion.serializer();
            case 22:
                p47 p47Var2 = r47.Companion;
                return new p53(j07.a, 0);
            case 23:
                x xVar2 = Buttons.Companion;
                return new p53(Button$$serializer.INSTANCE, 0);
            case 24:
                return vez0.g("com.yandex.go.taxi.order.models.api.cancel.ButtonsArrangementDto", ButtonsArrangementDto.values(), new String[]{"vertical", "horizontal"}, new Annotation[][]{null, null});
            case 25:
                return new o4o("ru.yandex.taxi.scooters.data.model.CableFeatureDto.Properties.None", ga7.INSTANCE, new Annotation[0]);
            case 26:
                a aVar = CachedTrackableAcceptance.Companion;
                return TrackableAcceptanceActionParam.Status.Companion.serializer();
            case 27:
                com.yandex.go.call_center.api.model.a aVar2 = CallCenter.Companion;
                return CallCenter.Type.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.call_center.api.model.CallCenter.Type", CallCenter.Type.values(), new String[]{"local", "national"}, new Annotation[][]{null, null});
            default:
                com.yandex.go.taxi.order.chat.call_feedback.experiments.b bVar2 = CallFeedbackExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
        }
    }
}
