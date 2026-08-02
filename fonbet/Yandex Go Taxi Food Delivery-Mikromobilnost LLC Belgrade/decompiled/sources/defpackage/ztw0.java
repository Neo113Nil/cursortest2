package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType;

/* loaded from: classes6.dex */
public final class ztw0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SurgeInfoTextBlockIconType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
