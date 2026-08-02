package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rnb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CheckoutResponse.CheckoutPaymentMethods.Source.values().length];
        try {
            iArr[CheckoutResponse.CheckoutPaymentMethods.Source.MOSMETRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[CreatePaymentDto$ErrorType.values().length];
        try {
            iArr2[CreatePaymentDto$ErrorType.FAILURE_PAYMENT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[CreatePaymentDto$ErrorType.REQUEST_PAY_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[PaymentMethod$Type.values().length];
        try {
            iArr3[PaymentMethod$Type.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[PaymentMethod$Type.YB_WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[PaymentMethod$Type.SBP_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
