package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

/* loaded from: classes5.dex */
public final class u7a0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentMethodType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
