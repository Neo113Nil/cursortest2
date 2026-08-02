package defpackage;

import com.yandex.go.address.models.AddressFinalizeTrigger;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class qu0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddressFinalizeTrigger.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
