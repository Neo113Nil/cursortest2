package defpackage;

import com.yandex.go.places.impl.data.entities.network.ButtonDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterModalChipBlockDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto$FilterModalDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.j;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.l;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.b;
import com.yandex.go.shortcuts.dto.response.Mode;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.ActionButtonDto$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.ButtonsArrangementDto;
import com.yandex.go.taxi.order.models.api.cancel.ModalWindowInfo;
import com.yandex.go.taxi.order.models.api.cancel.d0;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$RobotaxiItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.Step$$serializer;
import com.yandex.go.taxi.order.models.api.response.q0;
import com.yandex.go.taxi.order.models.api.response.r0;
import com.yandex.go.taxi.order.models.api.response.s0;
import com.yandex.go.taxi.order.models.api.response.t0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.u0;
import com.yandex.mob.model.MobRemoteNotificationCommand;
import com.yandex.mob.params.MobRemoteNotificationStatus;
import java.lang.annotation.Annotation;
import java.util.UUID;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final /* synthetic */ class sq20 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ sq20(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.mob.model.MobRemoteNotificationCommand", MobRemoteNotificationCommand.values(), new String[]{"add-to-config"}, new Annotation[][]{null});
            case 1:
                return MobRemoteNotificationStatus.Companion.serializer();
            case 2:
                yq20 yq20Var = zq20.Companion;
                return MobRemoteNotificationCommand.Companion.serializer();
            case 3:
                yq20 yq20Var2 = zq20.Companion;
                return new p53(jq20.a, 0);
            case 4:
                return vez0.g("com.yandex.mob.params.MobRemoteNotificationStatus", MobRemoteNotificationStatus.values(), new String[]{"silent"}, new Annotation[][]{null});
            case 5:
                return new jt20(i);
            case 6:
                return new vt20();
            case 7:
                return new t8j0();
            case 8:
                u0 u0Var = MobilityHubScreenResponse.Companion;
                return new p53(qyu.e, 0);
            case 9:
                a7u0 a7u0Var = ax20.a;
                return pwn.a;
            case 10:
                return UUID.randomUUID();
            case 11:
                j jVar = ModalContentDto$FilterModalDto.Companion;
                return new p53(FilterModalChipBlockDto$$serializer.INSTANCE, 0);
            case 12:
                j jVar2 = ModalContentDto$FilterModalDto.Companion;
                return new p53(ButtonDto$$serializer.INSTANCE, 0);
            case 13:
                return new o4o("com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto.Unknown", l.INSTANCE, new Annotation[0]);
            case 14:
                q0 q0Var = ModalItemDto$DefaultItem.Companion;
                return jsq0.Companion.serializer(CommunicationItem.DisplayOnType.Companion.serializer());
            case 15:
                q0 q0Var2 = ModalItemDto$DefaultItem.Companion;
                return new p53(SlotItemDto$$serializer.INSTANCE, 0);
            case 16:
                r0 r0Var = ModalItemDto$RobotaxiItem.Companion;
                return jsq0.Companion.serializer(CommunicationItem.DisplayOnType.Companion.serializer());
            case 17:
                r0 r0Var2 = ModalItemDto$RobotaxiItem.Companion;
                return new p53(SlotItemDto$$serializer.INSTANCE, 0);
            case 18:
                s0 s0Var = ModalItemDto$ShareOrderItem.Companion;
                return jsq0.Companion.serializer(CommunicationItem.DisplayOnType.Companion.serializer());
            case 19:
                t0 t0Var = ModalItemDto$StepsInstructionsItem.Companion;
                return jsq0.Companion.serializer(CommunicationItem.DisplayOnType.Companion.serializer());
            case 20:
                t0 t0Var2 = ModalItemDto$StepsInstructionsItem.Companion;
                return new p53(Step$$serializer.INSTANCE, 0);
            case 21:
                return new wz20(new g92(2, tz20.a));
            case 22:
            case 23:
            case 24:
                return null;
            case 25:
                d0 d0Var = ModalWindowInfo.Companion;
                return ButtonsArrangementDto.Companion.serializer();
            case 26:
                d0 d0Var2 = ModalWindowInfo.Companion;
                return new p53(ActionButtonDto$$serializer.INSTANCE, 0);
            case 27:
                return vez0.g("com.yandex.go.shortcuts.dto.response.Mode", Mode.values(), new String[]{null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "eats", "grocery", "pharmacy", "shop", "market", "market_viewer", "city", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "scooters", "chargers", TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, "masstransit"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 28:
                return new o4o("com.yandex.go.places.organization.card.impl.data.entities.network.card.ModeContext.Unknown", b.INSTANCE, new Annotation[0]);
            default:
                y530 y530Var = com.ybsdk.widgets.common.j.a;
                return zy11.a;
        }
    }
}
