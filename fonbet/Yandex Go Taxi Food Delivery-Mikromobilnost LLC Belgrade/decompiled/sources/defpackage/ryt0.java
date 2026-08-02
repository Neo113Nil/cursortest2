package defpackage;

import com.yandex.go.shortcuts.dto.response.StackCommon$StackItemType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class ryt0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StackCommon$StackItemType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
