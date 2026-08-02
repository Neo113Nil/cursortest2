package defpackage;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ui0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AddPaymentMethodButton.AddButtonType.values().length];
        try {
            iArr[AddPaymentMethodButton.AddButtonType.YAPE_TOKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.NEQUI_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.FASTSHIFT_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.JAZZCASH_WALLET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.TRANSPORT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.TRANSPORT_EXTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.MBANK_ACCOUNT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.SBP_TOKEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AddPaymentMethodButton.AddButtonType.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[AddSbpTokenButtonDto.StateType.values().length];
        try {
            iArr2[AddSbpTokenButtonDto.StateType.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[AddSbpTokenButtonDto.StateType.BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[AddSbpTokenButtonDto.StateType.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
