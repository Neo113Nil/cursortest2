package defpackage;

import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButtonTypes;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class ym50 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NestedButtonTypes.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
