package defpackage;

import com.ybsdk.network.dto.ApplicationSubmitCodeResponse;
import com.ybsdk.network.dto.VerifyAuthorizationCodeResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneSubmitCodeResponse;
import com.ybsdk.screens.registration.data.auth.MkkCashoutVerifyCodeResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xr80 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ApplicationSubmitCodeResponse.Status.values().length];
        try {
            iArr[ApplicationSubmitCodeResponse.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationSubmitCodeResponse.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[VerifyAuthorizationCodeResponse.Status.values().length];
        try {
            iArr2[VerifyAuthorizationCodeResponse.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[VerifyAuthorizationCodeResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ChangePhoneSubmitCodeResponse.SubmitStatus.values().length];
        try {
            iArr3[ChangePhoneSubmitCodeResponse.SubmitStatus.CODE_MATCHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ChangePhoneSubmitCodeResponse.SubmitStatus.CODE_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ChangePhoneSubmitCodeResponse.SubmitStatus.STATUS_CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ChangePhoneSubmitCodeResponse.SubmitStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[MkkCashoutVerifyCodeResponse.ActionStatus.values().length];
        try {
            iArr4[MkkCashoutVerifyCodeResponse.ActionStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[MkkCashoutVerifyCodeResponse.ActionStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
