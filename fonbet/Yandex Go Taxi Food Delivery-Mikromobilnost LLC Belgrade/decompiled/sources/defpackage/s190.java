package defpackage;

import com.yandex.go.shortcuts.dto.response.OverlayType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class s190 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OverlayType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
