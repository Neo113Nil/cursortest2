package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;

/* loaded from: classes6.dex */
public final class ypg {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DataType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
