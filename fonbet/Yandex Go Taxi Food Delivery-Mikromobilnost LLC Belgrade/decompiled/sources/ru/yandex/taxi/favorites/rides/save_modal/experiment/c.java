package ru.yandex.taxi.favorites.rides.save_modal.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;

/* loaded from: classes5.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SaveFavoriteRideModalExperiment.Modal.ModalType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
