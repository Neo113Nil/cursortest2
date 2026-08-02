package ru.yandex.taxi.routestats.prefetch;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RouteStatsPrefetchExperiment.PrefetchMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
