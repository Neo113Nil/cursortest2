package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;

/* loaded from: classes13.dex */
public final class qx51 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbStateResponse$YbState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
