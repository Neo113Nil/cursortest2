package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Condition;

/* loaded from: classes12.dex */
public final class zgb {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CheckPaymentResponse$Condition.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
