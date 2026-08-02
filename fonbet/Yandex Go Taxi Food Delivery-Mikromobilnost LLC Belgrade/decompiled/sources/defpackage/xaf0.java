package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class xaf0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ProductsScreenType$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
