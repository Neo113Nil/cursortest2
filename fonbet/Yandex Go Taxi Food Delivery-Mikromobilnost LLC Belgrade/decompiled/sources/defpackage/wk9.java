package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class wk9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersActiveOrderStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
