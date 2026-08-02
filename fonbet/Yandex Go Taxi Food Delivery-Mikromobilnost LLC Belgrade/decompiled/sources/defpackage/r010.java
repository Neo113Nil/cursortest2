package defpackage;

import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r010 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MasstransitPaymentBleExitBehavior.values().length];
        try {
            iArr[MasstransitPaymentBleExitBehavior.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MasstransitPaymentBleExitBehavior.TRANSPORT_MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
