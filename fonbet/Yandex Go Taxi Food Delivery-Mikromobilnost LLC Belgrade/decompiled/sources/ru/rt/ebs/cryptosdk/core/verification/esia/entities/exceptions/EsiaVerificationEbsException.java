package ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verification.entities.exceptions.VerificationEbsException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;", "Lru/rt/ebs/cryptosdk/core/verification/entities/exceptions/VerificationEbsException;", ErrorResponseData.JSON_ERROR_CODE, "", ErrorResponseData.JSON_ERROR_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "throwable", "", "(Ljava/lang/Throwable;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class EsiaVerificationEbsException extends VerificationEbsException {
    public EsiaVerificationEbsException(String str, String str2) {
        super(str, str2);
    }

    public EsiaVerificationEbsException(Throwable th) {
        super(th);
    }
}
