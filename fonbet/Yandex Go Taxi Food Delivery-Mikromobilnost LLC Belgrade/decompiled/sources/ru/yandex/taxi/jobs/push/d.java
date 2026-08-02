package ru.yandex.taxi.jobs.push;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ToggleJobsExperiment.StateDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
