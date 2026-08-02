package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
