package ru.yandex.taxi.layers.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;

/* loaded from: classes9.dex */
public final class m {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScreenModeMapProvidersExperiment.ZoomMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
