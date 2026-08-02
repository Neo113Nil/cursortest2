package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutScreenOpenReason;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.DirectionSelectorButtonAction;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.StopSelectorButtonAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class v310 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[CheckoutScreenOpenReason.values().length];
        try {
            iArr[CheckoutScreenOpenReason.QrScan.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckoutScreenOpenReason.BleVehiclesScreen.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckoutScreenOpenReason.Deeplink.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CheckoutScreenOpenReason.Other.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[CheckoutErrorReason.values().length];
        try {
            iArr2[CheckoutErrorReason.VehicleSearchFailure.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CheckoutErrorReason.TripInitFailure.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CheckoutErrorReason.TripUpdateFailure.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CheckoutErrorReason.CheckoutFailure.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[CheckoutErrorReason.CheckoutStatusFailure.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[CheckoutErrorReason.OrderPaymentFailure.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[CheckoutErrorReason.TripCopyFailure.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[CheckoutErrorReason.PaymentMethodsFailure.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[CheckoutErrorReason.Other.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[CheckoutButtonAction.values().length];
        try {
            iArr3[CheckoutButtonAction.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[CheckoutButtonAction.StopSelector.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[CheckoutButtonAction.DirectionSelector.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[CheckoutButtonAction.NumericInputUp.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[CheckoutButtonAction.NumericInputDown.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[CheckoutButtonAction.PaymentMethod.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[CheckoutButtonAction.PaymentButton.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[CheckoutButtonAction.ErrorButton.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        c = iArr3;
        int[] iArr4 = new int[StopSelectorButtonAction.values().length];
        try {
            iArr4[StopSelectorButtonAction.Stop.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[StopSelectorButtonAction.Back.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        d = iArr4;
        int[] iArr5 = new int[DirectionSelectorButtonAction.values().length];
        try {
            iArr5[DirectionSelectorButtonAction.Direction.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[DirectionSelectorButtonAction.Back.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        e = iArr5;
    }
}
