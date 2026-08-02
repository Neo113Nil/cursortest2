package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.dto.VerifyAuthorizationCodeResponse;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;

/* loaded from: classes2.dex */
public abstract class yr80 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wr80 a(VerifyAuthorizationCodeResponse verifyAuthorizationCodeResponse) {
        boolean z;
        Text.Resource resource;
        Text.Resource h;
        Text.Resource resource2;
        Text.Resource h2;
        int i;
        VerifyAuthorizationCodeResponse.FailData failData = verifyAuthorizationCodeResponse.getFailData();
        if (failData == null || failData.getAttemptsLeft() != 0) {
            VerifyAuthorizationCodeResponse.FailData failData2 = verifyAuthorizationCodeResponse.getFailData();
            if (!jl40.l(failData2 != null ? failData2.getResultCode() : null, "NO_ATTEMPTS_LEFT")) {
                z = false;
                if (z) {
                    VerifyAuthorizationCodeResponse.FailData failData3 = verifyAuthorizationCodeResponse.getFailData();
                    String resultCode = failData3 != null ? failData3.getResultCode() : null;
                    if (jl40.l(resultCode, "CODE_MISMATCH") || resultCode == null) {
                        resource = null;
                        if (z) {
                            h2 = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_try_another_time_sms);
                        } else {
                            VerifyAuthorizationCodeResponse.FailData failData4 = verifyAuthorizationCodeResponse.getFailData();
                            String resultCode2 = failData4 != null ? failData4.getResultCode() : null;
                            if (jl40.l(resultCode2, "CODE_MISMATCH") || resultCode2 == null) {
                                resource2 = null;
                                i = xr80.b[verifyAuthorizationCodeResponse.getVerificationResult().ordinal()];
                                if (i != 1) {
                                    VerifyAuthorizationCodeResponse.OkData okData = verifyAuthorizationCodeResponse.getOkData();
                                    return new vr80(okData != null ? okData.getVerificationCode() : null);
                                }
                                if (i == 2) {
                                    VerifyAuthorizationCodeResponse.FailData failData5 = verifyAuthorizationCodeResponse.getFailData();
                                    return new ur80(resource2, resource, null, (!jl40.l(failData5 != null ? failData5.getResultCode() : null, "CODE_MISMATCH") || verifyAuthorizationCodeResponse.getFailData().getAttemptsLeft() <= 0) ? OtpValidationResultEntity$Error$Type.DEFAULT : OtpValidationResultEntity$Error$Type.CODE_MISMATCH, z);
                                }
                                w511.b();
                                return null;
                            }
                            h2 = unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_error);
                        }
                        resource2 = h2;
                        i = xr80.b[verifyAuthorizationCodeResponse.getVerificationResult().ordinal()];
                        if (i != 1) {
                        }
                    } else {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_common_default_error);
                    }
                } else {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_authorization_no_attempts_left);
                }
                resource = h;
                if (z) {
                }
                resource2 = h2;
                i = xr80.b[verifyAuthorizationCodeResponse.getVerificationResult().ordinal()];
                if (i != 1) {
                }
            }
        }
        z = true;
        if (z) {
        }
        resource = h;
        if (z) {
        }
        resource2 = h2;
        i = xr80.b[verifyAuthorizationCodeResponse.getVerificationResult().ordinal()];
        if (i != 1) {
        }
    }
}
