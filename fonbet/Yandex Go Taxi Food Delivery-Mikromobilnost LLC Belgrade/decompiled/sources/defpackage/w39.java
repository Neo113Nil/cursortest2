package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto;

/* loaded from: classes9.dex */
public final class w39 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CashbackInactiveTariffBadgeStyleDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
