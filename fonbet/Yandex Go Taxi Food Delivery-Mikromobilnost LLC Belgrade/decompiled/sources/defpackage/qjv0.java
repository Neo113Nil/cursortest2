package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class qjv0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentMethod$Type.values().length];
        try {
            iArr[PaymentMethod$Type.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethod$Type.YB_WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethod$Type.CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethod$Type.CORP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethod$Type.CARGO_CORP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentMethod$Type.SHARED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentMethod$Type.GOOGLE_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PaymentMethod$Type.PERSONAL_WALLET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PaymentMethod$Type.YANGO_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PaymentMethod$Type.SBP_TOKEN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PaymentMethod$Type.MBANK_ACCOUNT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PaymentMethod$Type.YAPE_TOKEN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PaymentMethod$Type.NEQUI_TOKEN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PaymentMethod$Type.SBP_BIND_TOKEN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PaymentMethod$Type.KASPI.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[PaymentMethod$Type.CLICK_WALLET.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[PaymentMethod$Type.EASYPAISA_WALLET.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[PaymentMethod$Type.JAZZCASH_WALLET.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[PaymentMethod$Type.FASTSHIFT_ACCOUNT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[PaymentMethod$Type.CASH_LIKE.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[PaymentMethod$Type.BIRBONUS_WALLET.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[PaymentMethod$Type.TRANSPORT_CARD.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[PaymentMethod$Type.TRANSPORT_EXTERNAL.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        a = iArr;
        int[] iArr2 = new int[YbSdkPaymentMethodInfo$ProductType.values().length];
        try {
            iArr2[YbSdkPaymentMethodInfo$ProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[YbSdkPaymentMethodInfo$ProductType.CREDIT_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[YbSdkPaymentMethodInfo$ProductType.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        b = iArr2;
    }
}
