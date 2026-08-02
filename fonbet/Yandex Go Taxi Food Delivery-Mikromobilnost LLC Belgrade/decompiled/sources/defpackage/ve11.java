package defpackage;

import com.yandex.go.places.models.data.entities.network.TriggerDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class ve11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TriggerDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
