package defpackage;

import com.yandex.go.zone.dto.objects.BrandingType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class tj6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BrandingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
