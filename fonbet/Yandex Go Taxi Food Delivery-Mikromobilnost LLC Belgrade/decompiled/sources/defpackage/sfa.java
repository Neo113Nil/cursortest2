package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class sfa {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersPassTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
