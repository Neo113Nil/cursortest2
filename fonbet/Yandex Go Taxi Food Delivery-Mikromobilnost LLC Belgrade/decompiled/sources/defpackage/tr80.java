package defpackage;

import com.ybsdk.network.dto.ApplicationSendCodeResponse;
import com.ybsdk.network.dto.SendAuthorizationCodeResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeResponse;
import com.ybsdk.screens.registration.data.auth.MkkCashoutSendCodeResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tr80 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[ApplicationSendCodeResponse.Status.values().length];
        try {
            iArr[ApplicationSendCodeResponse.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationSendCodeResponse.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ApplicationSendCodeResponse.Action.values().length];
        try {
            iArr2[ApplicationSendCodeResponse.Action.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ApplicationSendCodeResponse.Action.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[SendAuthorizationCodeResponse.Status.values().length];
        try {
            iArr3[SendAuthorizationCodeResponse.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[SendAuthorizationCodeResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
        int[] iArr4 = new int[ChangePhoneSendCodeResponse.SendStatus.values().length];
        try {
            iArr4[ChangePhoneSendCodeResponse.SendStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[ChangePhoneSendCodeResponse.SendStatus.STATUS_CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[ChangePhoneSendCodeResponse.SendStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
        int[] iArr5 = new int[MkkCashoutSendCodeResponse.CodeFormat.values().length];
        try {
            iArr5[MkkCashoutSendCodeResponse.CodeFormat.DIGIT_4.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[MkkCashoutSendCodeResponse.CodeFormat.DIGIT_6.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
        int[] iArr6 = new int[MkkCashoutSendCodeResponse.ActionStatus.values().length];
        try {
            iArr6[MkkCashoutSendCodeResponse.ActionStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[MkkCashoutSendCodeResponse.ActionStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f = iArr6;
    }
}
