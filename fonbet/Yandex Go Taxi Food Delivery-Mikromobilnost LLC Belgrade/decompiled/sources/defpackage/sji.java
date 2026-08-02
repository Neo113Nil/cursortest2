package defpackage;

import com.yandex.go.zone.dto.objects.DeliveryPinType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class sji {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryPinType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
