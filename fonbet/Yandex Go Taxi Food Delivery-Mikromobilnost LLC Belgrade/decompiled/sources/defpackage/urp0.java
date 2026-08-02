package defpackage;

import com.ybsdk.common.SdkUserAuthRequirement;
import com.ybsdk.common.entities.SessionEntity$Action;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class urp0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SessionEntity$Action.values().length];
        try {
            iArr[SessionEntity$Action.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionEntity$Action.AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionEntity$Action.PASSPORT_REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionEntity$Action.OPEN_PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionEntity$Action.BANK_REGISTRATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionEntity$Action.APPLICATION_STATUS_CHECK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SessionEntity$Action.SUPPORT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SessionEntity$Action.AM_TOKEN_UPDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SessionEntity$Action.APP_UPDATE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SessionEntity$Action.PIN_TOKEN_CLEAR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SessionEntity$Action.PIN_TOKEN_REISSUE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[SessionEntity$Action.PIN_TOKEN_RETRY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[SessionEntity$Action.OPEN_DEEPLINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[SdkUserAuthRequirement.values().length];
        try {
            iArr2[SdkUserAuthRequirement.IS_AUTHORIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SdkUserAuthRequirement.HAS_ANY_BANK_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[SdkUserAuthRequirement.IS_NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        b = iArr2;
    }
}
