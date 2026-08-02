package ru.yandex.taxi.address.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes9.dex */
public final class p {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NewbiesRedesignPointsABExperiment.SummaryAddressStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
