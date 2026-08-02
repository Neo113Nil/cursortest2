package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.network.dto.StartSessionResponse;
import com.ybsdk.network.dto.common.Product;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class yzq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[StartSessionResponse.Action.values().length];
        try {
            iArr[StartSessionResponse.Action.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StartSessionResponse.Action.OPEN_PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StartSessionResponse.Action.AUTHORIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StartSessionResponse.Action.PASSPORT_REGISTRATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StartSessionResponse.Action.BANK_REGISTRATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StartSessionResponse.Action.APPLICATION_STATUS_CHECK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[StartSessionResponse.Action.SUPPORT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[StartSessionResponse.Action.AM_TOKEN_UPDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[StartSessionResponse.Action.APP_UPDATE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[StartSessionResponse.Action.PIN_TOKEN_CLEAR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[StartSessionResponse.Action.PIN_TOKEN_REISSUE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[StartSessionResponse.Action.PIN_TOKEN_RETRY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[StartSessionResponse.Action.OPEN_DEEPLINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[StartSessionResponse.ActionReason.values().length];
        try {
            iArr2[StartSessionResponse.ActionReason.PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[StartSessionResponse.ActionReason.PIN_TOKEN_REISSUE_REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
        int[] iArr3 = new int[Product.values().length];
        try {
            iArr3[Product.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[Product.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[Product.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[Product.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[Product.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[Product.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[Product.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        c = iArr3;
        int[] iArr4 = new int[YBProduct.values().length];
        try {
            iArr4[YBProduct.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[YBProduct.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[YBProduct.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[YBProduct.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[YBProduct.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[YBProduct.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused28) {
        }
        d = iArr4;
        int[] iArr5 = new int[ApplicationType.values().length];
        try {
            iArr5[ApplicationType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[ApplicationType.PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[ApplicationType.REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[ApplicationType.DIGITAL_CARD_ISSUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr5[ApplicationType.SIMPLIFIED_IDENTIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr5[ApplicationType.CHANGE_PHONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused34) {
        }
        e = iArr5;
    }
}
