package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;

/* loaded from: classes5.dex */
public final class wn6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BubbleStructure.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
