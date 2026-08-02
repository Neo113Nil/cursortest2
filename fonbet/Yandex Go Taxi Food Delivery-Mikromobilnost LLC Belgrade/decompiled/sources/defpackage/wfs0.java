package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class wfs0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SimplifiedPaymentStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
