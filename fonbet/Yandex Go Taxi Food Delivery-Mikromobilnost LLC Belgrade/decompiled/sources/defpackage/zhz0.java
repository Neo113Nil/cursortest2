package defpackage;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class zhz0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TipsType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
