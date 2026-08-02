package defpackage;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListUiDto;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class zl9 {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final Object a(ChargersSubscriptionListResponseDto chargersSubscriptionListResponseDto, Continuation continuation) {
        Object vl9Var;
        FormattedText formattedText;
        FormattedText formattedText2;
        boolean isEmpty = chargersSubscriptionListResponseDto.a.isEmpty();
        ChargersSubscriptionListUiDto chargersSubscriptionListUiDto = chargersSubscriptionListResponseDto.c;
        if (isEmpty) {
            if (chargersSubscriptionListUiDto == null || (formattedText2 = chargersSubscriptionListUiDto.a) == null) {
                formattedText2 = FormattedText.c;
            }
            vl9Var = new xl9(formattedText2);
        } else {
            if (chargersSubscriptionListUiDto == null || (formattedText = chargersSubscriptionListUiDto.a) == null) {
                formattedText = FormattedText.c;
            }
            vl9Var = new vl9(formattedText);
        }
        return this.a.emit(vl9Var, continuation);
    }
}
