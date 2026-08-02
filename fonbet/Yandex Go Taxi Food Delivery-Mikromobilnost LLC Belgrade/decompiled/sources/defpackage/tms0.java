package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;

/* loaded from: classes9.dex */
public final class tms0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SkipAlertCondition.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
