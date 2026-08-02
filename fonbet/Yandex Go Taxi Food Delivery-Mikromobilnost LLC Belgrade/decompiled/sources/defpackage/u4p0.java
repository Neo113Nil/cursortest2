package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionPresenter$AddressType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class u4p0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersTariffFixSelectionPresenter$AddressType.values().length];
        try {
            iArr[ScootersTariffFixSelectionPresenter$AddressType.USER_POSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersTariffFixSelectionPresenter$AddressType.PARKING_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersTariffFixSelectionPresenter$AddressType.USER_DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
