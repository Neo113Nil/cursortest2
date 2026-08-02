package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.request.EmailParam$Action;

/* loaded from: classes6.dex */
public final class zrn {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EmailParam$Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
