package ru.yandex.taxi.cashback.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlusSdkWidgetExperiment.PlaqueType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
