package defpackage;

import java.util.concurrent.TimeUnit;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.ButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.SafeFlowButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.StateButtonDto;

/* loaded from: classes5.dex */
public final class vzc {
    public static b4u0 a(StateButtonDto stateButtonDto, boolean z) {
        az6 az6Var;
        az6 xy6Var;
        String title = stateButtonDto.getTitle();
        ButtonActionDto action = stateButtonDto.getAction();
        if (action instanceof ButtonActionDto.ButtonAction_DoneDto) {
            az6Var = new uy6(z);
        } else {
            if (action instanceof ButtonActionDto.ButtonAction_GoToSummaryDto) {
                xy6Var = new vy6(Boolean.valueOf(((ButtonActionDto.ButtonAction_GoToSummaryDto) action).b.getChangePaymentMethod()));
            } else if (action instanceof ButtonActionDto.ButtonAction_OpenWebViewDto) {
                xy6Var = new wy6(((ButtonActionDto.ButtonAction_OpenWebViewDto) action).b.getUrl());
            } else if (action instanceof ButtonActionDto.ButtonAction_SafeFlowDto) {
                SafeFlowButtonActionDto safeFlowButtonActionDto = ((ButtonActionDto.ButtonAction_SafeFlowDto) action).b;
                xy6Var = new xy6(safeFlowButtonActionDto.getUrl(), new sy6(safeFlowButtonActionDto.getCommitProperties().getDeliveryId(), TimeUnit.SECONDS.toMillis(safeFlowButtonActionDto.getCommitProperties().getCanCreateOrderUntil().getValue())));
            } else {
                az6Var = yy6.a;
            }
            az6Var = xy6Var;
        }
        return new b4u0(title, az6Var);
    }
}
