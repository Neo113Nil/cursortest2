package defpackage;

import com.yandex.go.scooters.insurance.model.ScootersInsuranceCompletion;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ttn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersInsuranceCompletion.values().length];
        try {
            iArr[ScootersInsuranceCompletion.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersInsuranceCompletion.SKIPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersInsuranceCompletion.CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
