package defpackage;

import com.yandex.go.places.models.data.entities.network.ActionDto$WebAuthType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class vv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionDto$WebAuthType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
