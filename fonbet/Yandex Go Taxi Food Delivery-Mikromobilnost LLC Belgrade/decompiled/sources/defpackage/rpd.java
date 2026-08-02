package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class rpd {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CompositeOfferDto$Vendor.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
