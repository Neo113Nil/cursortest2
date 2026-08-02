package defpackage;

import com.yandex.plus.core.data.common.PlusGradient;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class r2d0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlusGradient.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
