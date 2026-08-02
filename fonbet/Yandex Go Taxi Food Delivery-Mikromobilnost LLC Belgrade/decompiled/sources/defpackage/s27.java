package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;

/* loaded from: classes9.dex */
public final class s27 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
