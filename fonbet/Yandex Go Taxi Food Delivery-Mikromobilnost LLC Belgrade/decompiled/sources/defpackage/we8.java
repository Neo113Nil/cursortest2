package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;
import com.yandex.go.navigator.notifications.cartech.StationType;
import com.yandex.go.navigator.notifications.cartech.a;
import com.yandex.go.payments.data.model.CardDto;
import com.yandex.go.payments.data.model.f;
import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;
import com.yandex.go.taxi.order.change.due.data.dto.ChangeDueResponse;
import com.yandex.go.taxi.order.change.due.data.dto.b;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam$$serializer;
import com.yandex.go.taxi.order.models.api.response.CardType;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.plus.design.gradient.CashbackDrawable;
import ru.yandex.taxi.plus.design.gradient.span.CashbackContainerSpan;
import ru.yandex.taxi.plus.design.gradient.span.CashbackSpan;
import ru.yandex.taxi.plus.design.view.CashbackClipFrameLayout;

/* loaded from: classes13.dex */
public final /* synthetic */ class we8 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ we8(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        m39 drawDelegate_delegate$lambda$0;
        m39 drawDelegate_delegate$lambda$02;
        m39 drawDelegate_delegate$lambda$03;
        m39 drawDelegate_delegate$lambda$04;
        n39 drawDelegate_delegate$lambda$05;
        zy11 zy11Var3;
        int i = 0;
        switch (this.a) {
            case 0:
                f fVar = CardDto.Companion;
                return new p53(auu0.a, 0);
            case 1:
                return new t8j0();
            case 2:
                return new p53(ak8.a, 0);
            case 3:
                return new p53(h6w.a, 0);
            case 4:
                return new p53(h6w.a, 0);
            case 5:
                zy11Var = zy11.a;
                return zy11Var;
            case 6:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 7:
                return sl8.a;
            case 8:
                return new ro8(msb1.B, 0);
            case 9:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.CardType", CardType.values(), new String[]{"classic", "two_button", "three_button"}, new Annotation[][]{null, null, null});
            case 10:
                return tje.a(sbx.d, new sd8(27));
            case 11:
                a aVar = CartechDeeplinkPayloadDto.Companion;
                return StationType.Companion.serializer();
            case 12:
                return new m29(i);
            case 13:
                drawDelegate_delegate$lambda$0 = CashbackClipFrameLayout.drawDelegate_delegate$lambda$0();
                return drawDelegate_delegate$lambda$0;
            case 14:
                drawDelegate_delegate$lambda$02 = CashbackContainerSpan.drawDelegate_delegate$lambda$0();
                return drawDelegate_delegate$lambda$02;
            case 15:
                return new e39(i);
            case 16:
                drawDelegate_delegate$lambda$03 = CashbackDrawable.drawDelegate_delegate$lambda$0();
                return drawDelegate_delegate$lambda$03;
            case 17:
                drawDelegate_delegate$lambda$04 = CashbackSpan.drawDelegate_delegate$lambda$0();
                return drawDelegate_delegate$lambda$04;
            case 18:
                drawDelegate_delegate$lambda$05 = com.yandex.plus.home.plaque.repository.graphql.formatter.CashbackSpan.drawDelegate_delegate$lambda$0();
                return drawDelegate_delegate$lambda$05;
            case 19:
                return new p53(CostCenterParam$$serializer.INSTANCE, 0);
            case 20:
                return new o4o("com.yandex.go.places.impl.ui.main.actions.change_address.ChangeCurrentAddressAction", z99.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.ChangeCurrentAddressFlexAction", fa9.INSTANCE, new Annotation[0]);
            case 22:
                return new p53(Address.Companion.serializer(), 0);
            case 23:
                return new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ChangeDriverRepository");
            case 24:
                b bVar = ChangeDueResponse.Companion;
                return OrderChangesDto.Status.Companion.serializer();
            case 25:
                com.yandex.go.places.models.data.entities.network.actions.b bVar2 = ChangeModalStateAction.Companion;
                return new o4o("com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction.ModalState", (Enum[]) ChangeModalStateAction.ModalState.values());
            case 26:
                return new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ChangeOrderDueInteractor");
            case 27:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse", ChangeOrderNotificationActionResponse.values(), new String[]{"open_chat_or_call", null}, new Annotation[][]{null, null});
            case 28:
                return new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ChangeOrderNotificationInteractor");
            default:
                zy11Var3 = zy11.a;
                return zy11Var3;
        }
    }
}
