package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class v1d0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlusColor.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
