package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes10.dex */
public final class n0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
