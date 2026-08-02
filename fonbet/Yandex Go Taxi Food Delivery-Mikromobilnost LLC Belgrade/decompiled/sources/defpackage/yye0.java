package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.PriceComplainParam$Source;

/* loaded from: classes6.dex */
public final class yye0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PriceComplainParam$Source.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
