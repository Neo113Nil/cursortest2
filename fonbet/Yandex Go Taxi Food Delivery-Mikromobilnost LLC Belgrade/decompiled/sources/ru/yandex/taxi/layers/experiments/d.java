package ru.yandex.taxi.layers.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
