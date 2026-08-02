package defpackage;

import com.yandex.go.shortcuts.models.OfferType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class tt60 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OfferType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
