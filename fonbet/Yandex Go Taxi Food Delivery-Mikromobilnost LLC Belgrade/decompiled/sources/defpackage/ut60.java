package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class ut60 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OfferTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
