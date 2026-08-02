package defpackage;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableRequest;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse$TimeSlotDto$$serializer;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceBannerDto$$serializer;
import com.yandex.go.due_timetable.data.api.dto.f;
import com.yandex.go.due_timetable.data.api.dto.g;
import com.yandex.go.due_timetable.data.api.dto.i;
import com.yandex.go.due_timetable.data.api.dto.l;
import com.yandex.go.due_timetable.data.api.dto.m;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemActionType;
import com.yandex.go.order.state.instructions.c;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath;
import com.yandex.go.scooters.bdui.api.b;
import com.yandex.go.scooters.bdui.api.d;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferParams;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferParams$Vehicle$$serializer;
import com.yandex.go.scooters.data.model.j;
import com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto;
import com.yandex.go.scooters.misc.attention.data.model.e;
import com.yandex.go.scooters.passes.data.model.actions.ScootersAcceptWinbackAction;
import com.yandex.go.scooters.passes.data.model.actions.a;
import com.yandex.go.scooters.payments.api.data.ScootersPaymentMethod$$serializer;
import defpackage.gwm0;
import defpackage.ovm0;
import java.lang.annotation.Annotation;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;

/* loaded from: classes12.dex */
public final /* synthetic */ class vnm0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ vnm0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse.SlotType", ScheduledOrderCalculationsResponse.SlotType.values(), new String[]{"ondemand", "until_due", "fixed_due"}, new Annotation[][]{null, null, null});
            case 1:
                c cVar = ScheduledOrderItemAction.Companion;
                return ScheduledOrderItemActionType.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.order.state.instructions.ScheduledOrderItemActionType", ScheduledOrderItemActionType.values(), new String[]{"select_time_slot", null}, new Annotation[][]{null, null});
            case 3:
                f fVar = ScheduledOrderSeatsAvailableRequest.Companion;
                return new p53(vmt.a, 0);
            case 4:
                g gVar = ScheduledOrderSeatsAvailableResponse.Companion;
                return new p53(ScheduledOrderSeatsAvailableResponse$TimeSlotDto$$serializer.INSTANCE, 0);
            case 5:
                m mVar = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.Companion;
                return ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.Companion.serializer();
            case 6:
                l lVar = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.Companion;
                return new p53(ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceBannerDto$$serializer.INSTANCE, 0);
            case 7:
                i iVar = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.Companion;
                return ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.Companion.serializer();
            case 8:
                return vez0.g("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType", ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.values(), new String[]{"select_time_slot", null}, new Annotation[][]{null, null});
            case 9:
                return vez0.g("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto", ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.values(), new String[]{"available", "unavailable", null}, new Annotation[][]{null, null, null});
            case 10:
                return new Regex("^(S00)(\\d{5})$", RegexOption.IGNORE_CASE);
            case 11:
                a aVar = ScootersAcceptWinbackAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 12:
                a aVar2 = ScootersAcceptWinbackAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                rvm0 rvm0Var = ovm0.Companion;
                return new p53(svm0.a, 0);
            case 14:
                xvm0 xvm0Var = ovm0.d.Companion;
                return new p53(twm0.e, 0);
            case 15:
                hwm0 hwm0Var = gwm0.a.Companion;
                return new p53(ewm0.a, 0);
            case 16:
                kwm0 kwm0Var = gwm0.b.Companion;
                return new p53(lwm0.a, 0);
            case 17:
                return new o4o("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.Unknown", rwm0.INSTANCE, new Annotation[0]);
            case 18:
                j jVar = ScootersAlternativeOfferParams.Companion;
                return new p53(ScootersAlternativeOfferParams$Vehicle$$serializer.INSTANCE, 0);
            case 19:
                j jVar2 = ScootersAlternativeOfferParams.Companion;
                return CreateOfferType.Companion.serializer();
            case 20:
                j jVar3 = ScootersAlternativeOfferParams.Companion;
                return new p53(ScootersPaymentMethod$$serializer.INSTANCE, 0);
            case 21:
                e eVar = ScootersAttentionDto.Companion;
                return ScootersAttentionDto.Style.Companion.serializer();
            case 22:
                com.yandex.go.scooters.misc.attention.data.model.a aVar3 = ScootersAttentionDto.Action.Companion;
                return ScootersAttentionDto.Action.Type.Companion.serializer();
            case 23:
                return vez0.g("com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto.Action.Type", ScootersAttentionDto.Action.Type.values(), new String[]{"info", "fullscreen"}, new Annotation[][]{null, null});
            case 24:
                return vez0.g("com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto.Style", ScootersAttentionDto.Style.values(), new String[]{"info", "promo", "error"}, new Annotation[][]{null, null, null});
            case 25:
                com.yandex.go.scooters.bdui.api.a aVar4 = ScootersBduiNavigationAction.Companion;
                return n0n0.Companion.serializer();
            case 26:
                b bVar = ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 27:
                b bVar2 = ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary.Companion;
                return new k8u(auu0.a, rcx.a, 1);
            case 28:
                d dVar = ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath.Companion;
                return new k8u(auu0.a, rcx.a, 1);
            default:
                e2n0 e2n0Var = h2n0.Companion;
                return new p53(f2n0.a, 0);
        }
    }
}
