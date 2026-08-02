package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment;

/* loaded from: classes10.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersOnboardingOnActiveRideExperiment.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
