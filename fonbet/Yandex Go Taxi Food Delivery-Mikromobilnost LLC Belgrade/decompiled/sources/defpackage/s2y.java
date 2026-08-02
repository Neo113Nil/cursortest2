package defpackage;

import com.yandex.go.shortcuts.models.LayoutType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class s2y {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LayoutType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
