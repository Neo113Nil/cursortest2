package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class qtn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersInsuranceType.values().length];
        try {
            iArr[ScootersInsuranceType.STANDART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersInsuranceType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersInsuranceType.NO_INSURANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
