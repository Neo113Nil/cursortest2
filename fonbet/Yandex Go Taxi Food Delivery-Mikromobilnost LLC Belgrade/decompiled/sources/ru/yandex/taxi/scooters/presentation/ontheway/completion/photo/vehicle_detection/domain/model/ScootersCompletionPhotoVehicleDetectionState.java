package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/domain/model/ScootersCompletionPhotoVehicleDetectionState;", "", "Idle", "VehicleDetected", "VehicleNotDetected", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCompletionPhotoVehicleDetectionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCompletionPhotoVehicleDetectionState[] $VALUES;
    public static final ScootersCompletionPhotoVehicleDetectionState Idle;
    public static final ScootersCompletionPhotoVehicleDetectionState VehicleDetected;
    public static final ScootersCompletionPhotoVehicleDetectionState VehicleNotDetected;

    static {
        ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState = new ScootersCompletionPhotoVehicleDetectionState("Idle", 0);
        Idle = scootersCompletionPhotoVehicleDetectionState;
        ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState2 = new ScootersCompletionPhotoVehicleDetectionState("VehicleDetected", 1);
        VehicleDetected = scootersCompletionPhotoVehicleDetectionState2;
        ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState3 = new ScootersCompletionPhotoVehicleDetectionState("VehicleNotDetected", 2);
        VehicleNotDetected = scootersCompletionPhotoVehicleDetectionState3;
        ScootersCompletionPhotoVehicleDetectionState[] scootersCompletionPhotoVehicleDetectionStateArr = {scootersCompletionPhotoVehicleDetectionState, scootersCompletionPhotoVehicleDetectionState2, scootersCompletionPhotoVehicleDetectionState3};
        $VALUES = scootersCompletionPhotoVehicleDetectionStateArr;
        $ENTRIES = a.a(scootersCompletionPhotoVehicleDetectionStateArr);
    }

    public static ScootersCompletionPhotoVehicleDetectionState valueOf(String str) {
        return (ScootersCompletionPhotoVehicleDetectionState) Enum.valueOf(ScootersCompletionPhotoVehicleDetectionState.class, str);
    }

    public static ScootersCompletionPhotoVehicleDetectionState[] values() {
        return (ScootersCompletionPhotoVehicleDetectionState[]) $VALUES.clone();
    }
}
