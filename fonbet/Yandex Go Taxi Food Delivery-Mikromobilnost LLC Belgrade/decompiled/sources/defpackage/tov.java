package defpackage;

import com.yandex.go.navigator.incidents.experiment.Incident;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class tov {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Incident.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
