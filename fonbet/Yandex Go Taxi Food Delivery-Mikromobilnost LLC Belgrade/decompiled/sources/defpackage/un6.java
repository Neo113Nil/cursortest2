package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.BubbleShowState;

/* loaded from: classes14.dex */
public final class un6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BubbleShowState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
