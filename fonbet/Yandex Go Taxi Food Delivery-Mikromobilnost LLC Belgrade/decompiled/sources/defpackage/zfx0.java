package defpackage;

import com.yandex.go.zone.dto.objects.TariffGroupDefinitionPresentationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class zfx0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TariffGroupDefinitionPresentationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
