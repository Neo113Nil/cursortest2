package defpackage;

import com.yandex.go.scooters.insurance.model.ScootersDisableInsuranceResult;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class uhn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersDisableInsuranceResult.values().length];
        try {
            iArr[ScootersDisableInsuranceResult.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersDisableInsuranceResult.SKIPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersDisableInsuranceResult.CANCELED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
