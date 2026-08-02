package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public final class e0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
