package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class yfm {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DriveState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
