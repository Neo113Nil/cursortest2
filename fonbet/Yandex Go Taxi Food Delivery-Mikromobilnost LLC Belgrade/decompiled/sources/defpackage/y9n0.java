package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class y9n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.values().length];
        try {
            iArr[ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.RESIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.CENTER_CROP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
