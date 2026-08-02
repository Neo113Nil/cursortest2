package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class z410 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MasstransitSlotItemSizeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
