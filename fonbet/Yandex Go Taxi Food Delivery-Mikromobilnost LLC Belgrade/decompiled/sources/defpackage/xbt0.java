package defpackage;

import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class xbt0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SourceChangeReason.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
