package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.styling.ButtonType;

/* loaded from: classes6.dex */
public final class v37 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
