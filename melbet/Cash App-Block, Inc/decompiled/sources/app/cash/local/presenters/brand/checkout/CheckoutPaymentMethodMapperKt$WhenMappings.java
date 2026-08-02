package app.cash.local.presenters.brand.checkout;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.CardBrandType;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class CheckoutPaymentMethodMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[LocalStoredInstrument.Type.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            SliceStatus.Companion companion = LocalStoredInstrument.Type.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            SliceStatus.Companion companion2 = LocalStoredInstrument.Type.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            SliceStatus.Companion companion3 = LocalStoredInstrument.Type.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            SliceStatus.Companion companion4 = LocalStoredInstrument.Type.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            SliceStatus.Companion companion5 = LocalStoredInstrument.Type.Companion;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[LocalPaymentOption.values().length];
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_GOOGLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_CASH_APP_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_NO_REQUIREMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_APPLE_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_AFTERPAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[CardBrandType.values().length];
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_VISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_MASTERCARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_AMERICAN_EXPRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_DISCOVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[CardBrandType.CARD_BRAND_TYPE_DISCOVER_DINERS.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
