package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class t6p {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FTTransportKind.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
