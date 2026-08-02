package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public final class ugq0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SelectedFrom.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
