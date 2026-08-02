package defpackage;

import android.content.res.Resources;
import com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto;
import com.yandex.go.chargers.orchestrator_user_events.data.model.b;
import com.yandex.go.flex.common.actions.dto.OpenSelectPaymentMethodAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.flex.common.api.actions.h0;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainModalItem$$serializer;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.OpenItemsModalAction;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.x;
import com.yandex.go.morphlex.data.descriptors.actions.morphlex_forward.OpenMorphlexScreenAction;
import com.yandex.go.morphlex.data.descriptors.actions.morphlex_forward.a;
import com.yandex.go.morphlex.data.dto.MorphlexInstruction$$serializer;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;
import com.yandex.go.places.models.data.entities.network.actions.OpenNavigatorFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.h;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification$ListItem$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.f0;
import com.yandex.go.taxi.order.models.api.cancel.g0;
import com.yandex.go.vault.data.ActionButtonTypeResponse;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeActionVaultActionButton;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeActionVaultActionButton$$serializer;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizePayload;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenVaultAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.c;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.d;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.e;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.eatskit.dto.OpenSupportParam;
import ru.yandex.taxi.eatskit.dto.OpenYbParams$ScreenType;
import ru.yandex.taxi.eatskit.dto.YbDepositType;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes14.dex */
public final /* synthetic */ class y570 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ y570(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a670 a670Var = b670.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(qke.n(auu0Var), qke.n(auu0Var), 1);
            case 1:
                d670 d670Var = e670.Companion;
                return new p53(qf40.a, 0);
            case 2:
                x xVar = OpenItemsModalAction.Companion;
                return new p53(MtTrainModalItem$$serializer.INSTANCE, 0);
            case 3:
                a aVar = OpenMorphlexScreenAction.Companion;
                return new p53(MorphlexInstruction$$serializer.INSTANCE, 0);
            case 4:
                a aVar2 = OpenMorphlexScreenAction.Companion;
                return MorphlexScreenPresentType.Companion.serializer();
            case 5:
                h hVar = OpenNavigatorFlexAction.Companion;
                return ActionDto$OpenNavigatorActionSubtypeDto.Companion.serializer();
            case 6:
                return Integer.valueOf((int) ((Resources.getSystem().getDisplayMetrics().heightPixels / Resources.getSystem().getDisplayMetrics().density) * 0.65d));
            case 7:
                b770 b770Var = c770.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 8:
                p770 p770Var = q770.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 9:
                p770 p770Var2 = q770.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 10:
                c cVar = OpenPrizeActionVaultActionButton.Companion;
                return ActionButtonTypeResponse.Companion.serializer();
            case 11:
                d dVar = OpenPrizePayload.Companion;
                return new p53(OpenPrizeActionVaultActionButton$$serializer.INSTANCE, 0);
            case 12:
                com.yandex.go.flex.common.actions.dto.d dVar2 = OpenSelectPaymentMethodAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                com.yandex.go.flex.common.actions.dto.d dVar3 = OpenSelectPaymentMethodAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 14:
                l870 l870Var = OpenSupportParam.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(qke.n(auu0Var2), qke.n(auu0Var2), 1);
            case 15:
                l870 l870Var2 = OpenSupportParam.Companion;
                return OpenSupportParam.ScreenType.Companion.serializer();
            case 16:
                return vez0.g("ru.yandex.taxi.eatskit.dto.OpenSupportParam.ScreenType", OpenSupportParam.ScreenType.values(), new String[]{"chatList", "default"}, new Annotation[][]{null, null});
            case 17:
                e eVar = OpenVaultAction.Companion;
                return VaultRarity.Companion.serializer();
            case 18:
                return vez0.g("com.yandex.go.flex.common.api.actions.OpenWebAction.AuthType", OpenWebAction.AuthType.values(), new String[]{AuthSdkActivity.RESPONSE_TYPE_TOKEN, "cookies", "noAuth"}, new Annotation[][]{null, null, null});
            case 19:
                h0 h0Var = OpenWebAction.WebCallback.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 20:
                return OpenYbParams$ScreenType.Companion.serializer();
            case 21:
                return YbDepositType.Companion.serializer();
            case 22:
                return vez0.g("ru.yandex.taxi.eatskit.dto.OpenYbParams.ScreenType", OpenYbParams$ScreenType.values(), new String[]{"dashboard", "deposit"}, new Annotation[][]{null, null});
            case 23:
                return vez0.g("ru.yandex.taxi.personalstate.api.network.objects.OptionType", OptionType.values(), new String[]{"redirect", "edit_comment", "delete_comment_and_order", "select_payment_then_redirect"}, new Annotation[][]{null, null, null, null});
            case 24:
                b bVar = OrchestratorUserEventDto.Companion;
                return OrchestratorUserEventDto.EventType.Companion.serializer();
            case 25:
                return vez0.g("com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto.EventType", OrchestratorUserEventDto.EventType.values(), new String[]{"discovery", "station", "offer", "order_leasing", "order_finish"}, new Annotation[][]{null, null, null, null, null});
            case 26:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderBubblesMapper");
            case 27:
                return "Error while getting translations";
            case 28:
                g0 g0Var = OrderCancelNotification.Companion;
                return new p53(OrderCancelNotification$ListItem$$serializer.INSTANCE, 0);
            default:
                f0 f0Var = OrderCancelNotification.Buttons.Companion;
                return Orientation.Companion.serializer();
        }
    }
}
