package defpackage;

import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class z940 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VehicleTypeType.values().length];
        try {
            iArr[VehicleTypeType.BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VehicleTypeType.AEROEXPRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VehicleTypeType.SUBURBAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[MtTrainCheckoutResponse.ResponseStatus.values().length];
        try {
            iArr2[MtTrainCheckoutResponse.ResponseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MtTrainCheckoutResponse.ResponseStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MtTrainCheckoutResponse.ResponseStatus.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MtTrainCheckoutResponse.ResponseStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
