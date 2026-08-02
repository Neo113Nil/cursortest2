package defpackage;

import com.yandex.go.due.data.api.dto.DayLowPriceInfo$$serializer;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.due.data.api.dto.v;
import com.yandex.go.due_timetable.experiment.model.PriceHeightCalculationStrategyType;
import com.yandex.go.due_timetable.experiment.model.TimetableMainAction;
import com.yandex.go.due_timetable.experiment.model.TimetableViewTypeSettings;
import com.yandex.go.due_timetable.experiment.model.c;
import com.yandex.go.multimodal_route.network.models.TipsChoicesDto;
import com.yandex.go.multimodal_route.network.models.x;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.net.dto.objects.a;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$AdditionalOrderOptionState;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionsInfo;
import com.yandex.go.taxi.order.models.api.response.TipsDto;
import com.yandex.go.taxi.order.models.api.response.f8;
import com.yandex.go.taxi.order.models.api.response.h8;
import com.yandex.go.taxi.order.models.api.response.i8;
import com.yandex.go.taxi.order.models.api.response.k8;
import com.yandex.go.taxi.order.models.api.response.n8;
import com.yandex.go.taxi.order.models.api.response.p8;
import com.yandex.go.taxi.order.models.api.response.q8;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.api.dto.ticket.TicketOnShowFeature;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

/* loaded from: classes14.dex */
public final /* synthetic */ class x1z0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ x1z0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                y1z0 y1z0Var = TicketBottomButton.Companion;
                return TicketBottomButton.TicketBottomButtonType.Companion.serializer();
            case 1:
                return vez0.g("ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton.TicketBottomButtonType", TicketBottomButton.TicketBottomButtonType.values(), new String[]{"close"}, new Annotation[][]{null});
            case 2:
                return vez0.g("ru.yandex.taxi.communications.api.dto.ticket.TicketMode", TicketMode.values(), new String[]{"ticket", "card", "rounded_card"}, new Annotation[][]{null, null, null});
            case 3:
                n2z0 n2z0Var = TicketOnShowFeature.Companion;
                return TicketOnShowFeature.TicketOnShowFeatureType.Companion.serializer();
            case 4:
                return vez0.g("ru.yandex.taxi.communications.api.dto.ticket.TicketOnShowFeature.TicketOnShowFeatureType", TicketOnShowFeature.TicketOnShowFeatureType.values(), new String[]{"vibration", "confetti", "none"}, new Annotation[][]{null, null, null});
            case 5:
                f3z0 f3z0Var = TicketTopAsset.Companion;
                return TicketTopAsset.TicketTopAssetType.Companion.serializer();
            case 6:
                return TicketTopAsset.TicketTopAssetReplayMode.Companion.serializer();
            case 7:
                return vez0.g("ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset.TicketTopAssetReplayMode", TicketTopAsset.TicketTopAssetReplayMode.values(), new String[]{"fixed", "forever"}, new Annotation[][]{null, null});
            case 8:
                return vez0.g("ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset.TicketTopAssetType", TicketTopAsset.TicketTopAssetType.values(), new String[]{"image", "lottie"}, new Annotation[][]{null, null});
            case 9:
                return new o4o("java.util.concurrent.TimeUnit", (Enum[]) TimeUnit.values());
            case 10:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (evu0.J("kotlinx.datetime.TimeBased")) {
                    ny61.g("Blank serial names are prohibited");
                    return null;
                }
                h0c h0cVar = new h0c("kotlinx.datetime.TimeBased");
                h0cVar.a("nanoseconds", pnz.b, false);
                return new asq0("kotlinx.datetime.TimeBased", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
            case 11:
                return new cgy();
            case 12:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption.AdditionalOrderOptionState", TimelineAdditionalOrderOption$AdditionalOrderOptionState.values(), new String[]{"selected", "unselected"}, new Annotation[][]{null, null});
            case 13:
                f8 f8Var = TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.Companion;
                return TimelineAdditionalOrderOption$AdditionalOrderOptionState.Companion.serializer();
            case 14:
                h8 h8Var = TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.Companion;
                return TimelineAdditionalOrderOption$AdditionalOrderOptionState.Companion.serializer();
            case 15:
                return new o4o("com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption.UnknownAdditionalOrderOption", i8.INSTANCE, new Annotation[0]);
            case 16:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons.AdditionalOrderOptionButtonStyle", TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle.values(), new String[]{"main"}, new Annotation[][]{null});
            case 17:
                k8 k8Var = TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButton.Companion;
                return TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButtonAction.Companion.serializer();
            case 18:
                k8 k8Var2 = TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButton.Companion;
                return TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons.SingleAdditionalOrderOptionButton.AdditionalOrderOptionButtonAction", TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButtonAction.values(), new String[]{"apply_option", null}, new Annotation[][]{null, null});
            case 20:
                return new o4o("com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons.UnknownAdditionalOrderOptionButtons", n8.INSTANCE, new Annotation[0]);
            case 21:
                p8 p8Var = TimelineAdditionalOrderOptionsInfo.Companion;
                return new p53(d9z0.e, 0);
            case 22:
                return new CustomPayload();
            case 23:
                v vVar = TimetableInfo.Companion;
                return new p53(DayLowPriceInfo$$serializer.INSTANCE, 0);
            case 24:
                return vez0.g("com.yandex.go.due_timetable.experiment.model.TimetableMainAction", TimetableMainAction.values(), new String[]{"confirm_order", "proceed_to_summary"}, new Annotation[][]{null, null});
            case 25:
                c cVar = TimetableViewTypeSettings.Companion;
                return TimetableMainAction.Companion.serializer();
            case 26:
                c cVar2 = TimetableViewTypeSettings.Companion;
                return PriceHeightCalculationStrategyType.Companion.serializer();
            case 27:
                a aVar = Tips.Companion;
                return TipsType.Companion.serializer();
            case 28:
                x xVar = TipsChoicesDto.Companion;
                return new p53(pfz0.e, 0);
            default:
                q8 q8Var = TipsDto.Companion;
                return TipsType.Companion.serializer();
        }
    }
}
