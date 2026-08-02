package ru.yandex.taxi.persuggest.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment;

/* loaded from: classes6.dex */
public final class a {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuggestHeuristicsExperiment.Heuristic.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
