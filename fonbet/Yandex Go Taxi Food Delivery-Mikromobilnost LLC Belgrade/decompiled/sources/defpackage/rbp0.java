package defpackage;

import com.yandex.go.layers.api.model.params.Screen;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class rbp0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Screen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
