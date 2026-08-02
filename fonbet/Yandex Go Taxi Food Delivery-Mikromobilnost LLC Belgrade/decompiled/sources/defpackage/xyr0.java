package defpackage;

import com.yandex.go.shortcuts.models.ShortcutClickAction;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class xyr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShortcutClickAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
