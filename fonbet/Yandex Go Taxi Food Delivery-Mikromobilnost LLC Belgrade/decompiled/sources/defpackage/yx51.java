package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.YbTransaction$Type;

/* loaded from: classes13.dex */
public final class yx51 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbTransaction$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
