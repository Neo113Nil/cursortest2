package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.summary.promotions.models.TextAlign;

/* loaded from: classes6.dex */
public final class qjy0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TextAlign.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
