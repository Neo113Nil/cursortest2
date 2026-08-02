package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle;

/* loaded from: classes5.dex */
public final class sm6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BubbleFontStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
