package defpackage;

import com.yandex.go.shortcuts.models.RouteType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class vel0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RouteType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
