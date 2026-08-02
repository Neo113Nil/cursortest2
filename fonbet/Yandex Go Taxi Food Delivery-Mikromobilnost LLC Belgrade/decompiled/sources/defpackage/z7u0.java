package defpackage;

import com.yandex.go.shortcuts.dto.request.Status;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class z7u0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
