package defpackage;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class ruv0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppDiscoveryMapLayerDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
