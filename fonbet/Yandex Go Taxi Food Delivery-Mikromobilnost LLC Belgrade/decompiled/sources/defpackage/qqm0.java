package defpackage;

import ru.yandex.taxi.scooters.data.model.EvolveState;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;
import ru.yandex.taxi.scooters.data.model.VehicleType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qqm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[EvolveState.values().length];
        try {
            iArr[EvolveState.RESERVATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EvolveState.PARKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EvolveState.RIDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SessionOfferType.values().length];
        try {
            iArr2[SessionOfferType.STANDART_OFFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SessionOfferType.FIX_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[VehicleType.values().length];
        try {
            iArr3[VehicleType.BIKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[VehicleType.SCOOTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
