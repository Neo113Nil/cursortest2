package ru.yandex.taxi.logistics.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryPvzExperiment.RouteType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
