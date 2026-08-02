package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;

/* loaded from: classes6.dex */
public final class qky0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TextBlockSize.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
