package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class w9n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersCompletionPhotoVehicleDetectionState.values().length];
        try {
            iArr[ScootersCompletionPhotoVehicleDetectionState.Idle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersCompletionPhotoVehicleDetectionState.VehicleDetected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersCompletionPhotoVehicleDetectionState.VehicleNotDetected.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
