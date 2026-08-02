package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;

/* loaded from: classes6.dex */
public final class xky {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LinkCardStatusResponse$LinkCardStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
