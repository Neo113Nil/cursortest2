package ru.yandex.taxi.carplates.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;

/* loaded from: classes5.dex */
public final class a {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CarPlateAppearanceExperiment.CarPlateUsage.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
