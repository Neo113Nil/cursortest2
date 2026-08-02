package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class w0v {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = HubOnboardingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
