package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.map_common.style.source.model.Theme;

/* loaded from: classes9.dex */
public final class zuy0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Theme.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
