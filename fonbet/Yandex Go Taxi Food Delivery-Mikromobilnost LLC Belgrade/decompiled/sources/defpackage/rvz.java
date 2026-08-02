package defpackage;

import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramStateDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class rvz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LoyaltyProgramStateDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
