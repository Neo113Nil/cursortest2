package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;

/* loaded from: classes6.dex */
public final class vl10 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MenuItemElementType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
