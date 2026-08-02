package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.feature.pin.api.entities.PinApplicationTypeEntity;
import com.ybsdk.feature.pin.api.entities.ProductEntity;
import com.ybsdk.feature.pin.api.entities.StartSessionState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class wvb0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[ApplicationTypeEntity.values().length];
        try {
            iArr[ApplicationTypeEntity.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationTypeEntity.PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicationTypeEntity.REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApplicationTypeEntity.DIGITAL_CARD_ISSUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApplicationTypeEntity.CHANGE_PHONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[PinApplicationTypeEntity.values().length];
        try {
            iArr2[PinApplicationTypeEntity.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PinApplicationTypeEntity.PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PinApplicationTypeEntity.REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PinApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PinApplicationTypeEntity.DIGITAL_CARD_ISSUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PinApplicationTypeEntity.CHANGE_PHONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
        int[] iArr3 = new int[ProductEntity.values().length];
        try {
            iArr3[ProductEntity.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[ProductEntity.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[ProductEntity.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[ProductEntity.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[ProductEntity.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[ProductEntity.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        c = iArr3;
        int[] iArr4 = new int[YBProduct.values().length];
        try {
            iArr4[YBProduct.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[YBProduct.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[YBProduct.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[YBProduct.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[YBProduct.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[YBProduct.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        d = iArr4;
        int[] iArr5 = new int[StartSessionState.Action.values().length];
        try {
            iArr5[StartSessionState.Action.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[StartSessionState.Action.AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[StartSessionState.Action.PASSPORT_REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[StartSessionState.Action.BANK_REGISTRATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr5[StartSessionState.Action.APPLICATION_STATUS_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[StartSessionState.Action.SUPPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[StartSessionState.Action.AM_TOKEN_UPDATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[StartSessionState.Action.APP_UPDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr5[StartSessionState.Action.PIN_TOKEN_CLEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr5[StartSessionState.Action.PIN_TOKEN_REISSUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr5[StartSessionState.Action.PIN_TOKEN_RETRY.ordinal()] = 11;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr5[StartSessionState.Action.OPEN_PRODUCT.ordinal()] = 12;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr5[StartSessionState.Action.OPEN_DEEPLINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused37) {
        }
        e = iArr5;
        int[] iArr6 = new int[SessionEntity$Action.values().length];
        try {
            iArr6[SessionEntity$Action.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr6[SessionEntity$Action.AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr6[SessionEntity$Action.PASSPORT_REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr6[SessionEntity$Action.BANK_REGISTRATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr6[SessionEntity$Action.APPLICATION_STATUS_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr6[SessionEntity$Action.SUPPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr6[SessionEntity$Action.AM_TOKEN_UPDATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr6[SessionEntity$Action.APP_UPDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr6[SessionEntity$Action.PIN_TOKEN_CLEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr6[SessionEntity$Action.PIN_TOKEN_REISSUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr6[SessionEntity$Action.PIN_TOKEN_RETRY.ordinal()] = 11;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr6[SessionEntity$Action.OPEN_PRODUCT.ordinal()] = 12;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr6[SessionEntity$Action.OPEN_DEEPLINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused50) {
        }
        f = iArr6;
    }
}
