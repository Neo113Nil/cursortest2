package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.delivery.experiments.FormType;

/* loaded from: classes5.dex */
public final class y6s {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FormType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
