package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;

/* loaded from: classes9.dex */
public final class ty6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
