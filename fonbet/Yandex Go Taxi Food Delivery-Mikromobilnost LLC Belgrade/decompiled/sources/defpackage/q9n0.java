package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q9n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersVehicleType.values().length];
        try {
            iArr[ScootersVehicleType.SCOOTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersVehicleType.BIKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
