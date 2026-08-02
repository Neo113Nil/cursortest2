package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u001b\u0010\u0014\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0004¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;", "", "Lzy11;", "closeVerification", "()V", "", "isNeededClearEsiaSession", "gotoEsiaAuthorization", "(Z)V", "gotoProcessing", "gotoPhotoRecording", "gotoVideoRecording", "gotoBiometryInfo", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/AccessDeniedEsiaVerificationEbsException;", "error", "gotoAccessDeniedScreen", "(Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/AccessDeniedEsiaVerificationEbsException;)V", "gotoFailedVerification", "Ljava/lang/Exception;", "Lkotlin/Exception;", "gotoVerificationError", "(Ljava/lang/Exception;)V", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;", "gotoVerificationAttemptsExceededError", "(Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;)V", "gotoNoInternetConnectionError", "closeNoInternetConnectionError", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationRouter {
    void closeNoInternetConnectionError();

    void closeVerification();

    void gotoAccessDeniedScreen(AccessDeniedEsiaVerificationEbsException error);

    void gotoBiometryInfo();

    void gotoEsiaAuthorization(boolean isNeededClearEsiaSession);

    void gotoFailedVerification();

    void gotoNoInternetConnectionError(Exception error);

    void gotoPhotoRecording();

    void gotoProcessing();

    void gotoVerificationAttemptsExceededError(VerificationAttemptsExceededEbsException error);

    void gotoVerificationError(Exception error);

    void gotoVideoRecording();
}
