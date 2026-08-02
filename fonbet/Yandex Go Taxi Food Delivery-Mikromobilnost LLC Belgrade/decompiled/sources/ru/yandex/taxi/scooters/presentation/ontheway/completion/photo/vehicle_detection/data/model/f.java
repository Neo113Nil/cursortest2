package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
