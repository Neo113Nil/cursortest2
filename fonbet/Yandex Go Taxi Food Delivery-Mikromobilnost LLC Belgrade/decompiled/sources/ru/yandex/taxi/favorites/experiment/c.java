package ru.yandex.taxi.favorites.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;

/* loaded from: classes5.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FavoritesCreateRegularAddressExperiment.ButtonAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
