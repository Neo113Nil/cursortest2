package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class tj31 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VerticalType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
