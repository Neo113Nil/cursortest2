package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.TextAlign;

/* loaded from: classes14.dex */
public final class rjy0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TextAlign.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
