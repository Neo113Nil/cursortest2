package defpackage;

import com.yandex.go.dto.response.FlexScreenType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class rlr {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FlexScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
