package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.OfferType;

/* loaded from: classes6.dex */
public final class st60 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OfferType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
