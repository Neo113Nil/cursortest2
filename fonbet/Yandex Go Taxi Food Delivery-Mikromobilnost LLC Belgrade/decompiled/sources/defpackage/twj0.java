package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class twj0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RestMethod.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
