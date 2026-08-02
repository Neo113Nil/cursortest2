package defpackage;

import com.yandex.go.shortcuts.dto.response.Mode;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class z330 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Mode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
