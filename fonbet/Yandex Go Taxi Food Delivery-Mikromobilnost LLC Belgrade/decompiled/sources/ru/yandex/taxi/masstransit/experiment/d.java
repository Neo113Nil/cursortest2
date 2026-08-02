package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtMainRedirectExperiment.RedirectVertical.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
