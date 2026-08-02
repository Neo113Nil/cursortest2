package ru.yandex.taxi.main.map.autoupdatelocationthrottle;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
