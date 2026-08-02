package defpackage;

import com.yandex.go.taxi.order.models.api.status.ImageType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class wfv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ImageType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
