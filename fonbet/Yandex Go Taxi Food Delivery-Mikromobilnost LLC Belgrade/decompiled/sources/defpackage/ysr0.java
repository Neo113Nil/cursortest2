package defpackage;

import com.yandex.go.safety.center.api.SharingType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ysr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SharingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
