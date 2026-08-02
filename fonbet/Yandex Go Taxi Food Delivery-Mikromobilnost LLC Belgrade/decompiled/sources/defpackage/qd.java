package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class qd {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AcceptancePaymentButtonActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
