package defpackage;

import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import com.ybsdk.rconfig.configs.RemoteConfigCallType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class wui0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RemoteConfigCallType.values().length];
        try {
            iArr[RemoteConfigCallType.DEFAULT_RESULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RemoteConfigCallType.PLAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[RemoteConfigUpdateTrigger.values().length];
        try {
            iArr2[RemoteConfigUpdateTrigger.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.INITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.LOGOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.PIN_CHECK.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.PIN_CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.UNKNOWN_USER.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.SDK_STATE_CHANGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.LOGIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.UI_OPEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.BANK_REGISTRATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[RemoteConfigUpdateTrigger.PASSPORT_LOGIN.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
    }
}
