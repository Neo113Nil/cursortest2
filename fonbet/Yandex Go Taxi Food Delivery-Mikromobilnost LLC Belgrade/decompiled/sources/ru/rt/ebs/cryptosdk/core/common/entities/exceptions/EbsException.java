package ru.rt.ebs.cryptosdk.core.common.entities.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.j73;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.registration.entities.exceptions.EmptyTokenRegistrationEbsException;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", ErrorResponseData.JSON_ERROR_CODE, "", ErrorResponseData.JSON_ERROR_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "throwable", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "isAccessDeniedError", "", "Companion", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class EbsException extends RuntimeException {
    public static final String ACCESS_DENIED_ERROR_CODE = "access_denied";
    public static final String ACCESS_DENIED_ERROR_MESSAGE_DEFAULT = "The resource owner or authorization server denied the request";
    public static final String ADAPTER_VERIFICATION_ERROR_CODE = "EBS_SDK-004";
    public static final String ARGUMENTS_ILLEGAL_SDK_ERROR_CODE = "EBS_SDK-011";
    public static final String BASE_SDK_ERROR_CODE = "EBS_SDK-001";
    public static final String CONSUMER_VERIFICATION_ERROR_CODE = "EBS_SDK-006";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EBS_010107_CODE = "EBS-010107";
    public static final String EBS_010108_CODE = "EBS-010108";
    public static final String EBS_010110_CODE = "EBS-010110";
    public static final String EBS_VERIFICATION_ERROR_CODE = "EBS_SDK-005";
    public static final String KPM_0001_CODE = "KPM-0001";
    public static final String MRU_0001_CODE = "MRU-0001";
    public static final String MRU_0002_CODE = "MRU-0002";
    public static final String MRU_0003_CODE = "MRU-0003";
    public static final String NETWORK_SDK_ERROR_CODE = "EBS_SDK-007";
    public static final String NOT_ALLOWED_HOST_ERROR_CODE = "EBS_SDK-009";
    public static final String NOT_ALLOWED_PROTOCOL_ERROR_CODE = "EBS_SDK-010";
    public static final String NOT_BINDED_VERIFICATION_ERROR_CODE = "EBS_SDK-008";
    public static final String NOT_INITIALIZED_SDK_ERROR_CODE = "EBS_SDK-002";
    public static final String PERMISSION_DENIED_SDK_ERROR_CODE = "EBS_SDK-003";
    public static final String REG_0001_CODE = "REG-0001";
    public static final String VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_CODE_DEFAULT = "verification_attempts_exceeded";
    public static final String VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_MESSAGE_DEFAULT = "Превышено количество попыток верификации в рамках одной сессии";
    private final String errorCode;
    private final String errorMessage;

    public EbsException(Throwable th) {
        super(th);
        if (th instanceof EbsException) {
            EbsException ebsException = (EbsException) th;
            this.errorCode = ebsException.errorCode;
            this.errorMessage = ebsException.errorMessage;
        } else {
            this.errorCode = BASE_SDK_ERROR_CODE;
            String message = th.getMessage();
            this.errorMessage = message == null ? "" : message;
        }
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isAccessDeniedError() {
        return jl40.l(this.errorCode, ACCESS_DENIED_ERROR_CODE);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005J\u0012\u0010\u001f\u001a\u00020\u001d2\n\u0010 \u001a\u00060!j\u0002`\"J\u0012\u0010#\u001a\u00020\u001d2\n\u0010 \u001a\u00060!j\u0002`\"J\u0012\u0010$\u001a\u00020\u001d2\n\u0010 \u001a\u00060!j\u0002`\"J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException$Companion;", "", "<init>", "()V", "BASE_SDK_ERROR_CODE", "", "NOT_INITIALIZED_SDK_ERROR_CODE", "PERMISSION_DENIED_SDK_ERROR_CODE", "ADAPTER_VERIFICATION_ERROR_CODE", "EBS_VERIFICATION_ERROR_CODE", "CONSUMER_VERIFICATION_ERROR_CODE", "NETWORK_SDK_ERROR_CODE", "NOT_BINDED_VERIFICATION_ERROR_CODE", "NOT_ALLOWED_HOST_ERROR_CODE", "NOT_ALLOWED_PROTOCOL_ERROR_CODE", "ARGUMENTS_ILLEGAL_SDK_ERROR_CODE", "ACCESS_DENIED_ERROR_CODE", "VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_CODE_DEFAULT", "KPM_0001_CODE", "REG_0001_CODE", "MRU_0001_CODE", "MRU_0002_CODE", "MRU_0003_CODE", "EBS_010107_CODE", "EBS_010110_CODE", "EBS_010108_CODE", "ACCESS_DENIED_ERROR_MESSAGE_DEFAULT", "VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_MESSAGE_DEFAULT", "isRemoveProgramIDErrorCode", "", ErrorResponseData.JSON_ERROR_CODE, "isRemoveProgramIDException", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isDeinitializationException", "isEbsNoSecurityProcess", "getMessage", AuthSdkActivity.RESPONSE_TYPE_CODE, Constants.KEY_MESSAGE, "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getMessage(String code, String message) {
            return unr0.p("{\"code\": \"", code, "\", \"message\": \"", message, "\"}");
        }

        public final boolean isDeinitializationException(Exception ex) {
            return (ex instanceof EmptyTokenRegistrationEbsException) || isRemoveProgramIDException(ex);
        }

        public final boolean isEbsNoSecurityProcess(Exception ex) {
            return (ex instanceof EbsException) && j73.y(new String[]{EbsException.EBS_010107_CODE, EbsException.EBS_010110_CODE, EbsException.EBS_010108_CODE}, ((EbsException) ex).getErrorCode());
        }

        public final boolean isRemoveProgramIDErrorCode(String errorCode) {
            return j73.y(new String[]{EbsException.MRU_0001_CODE, EbsException.MRU_0002_CODE, EbsException.MRU_0003_CODE}, errorCode);
        }

        public final boolean isRemoveProgramIDException(Exception ex) {
            return (ex instanceof EbsException) && isRemoveProgramIDErrorCode(((EbsException) ex).getErrorCode());
        }

        private Companion() {
        }
    }

    public EbsException(String str, String str2) {
        super(INSTANCE.getMessage(str, str2));
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public EbsException(String str) {
        super(INSTANCE.getMessage(BASE_SDK_ERROR_CODE, str));
        this.errorCode = BASE_SDK_ERROR_CODE;
        this.errorMessage = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EbsException(String str, Throwable th) {
        super(r0.getMessage(BASE_SDK_ERROR_CODE, str), th);
        Companion companion = INSTANCE;
        String str2 = BASE_SDK_ERROR_CODE;
        this.errorCode = th instanceof EbsException ? ((EbsException) th).errorCode : str2;
        this.errorMessage = str;
    }

    public EbsException(String str, String str2, Throwable th) {
        super(INSTANCE.getMessage(str, str2), th);
        this.errorCode = str;
        this.errorMessage = str2;
    }
}
