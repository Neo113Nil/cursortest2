package ru.rt.ebs.cryptosdk.core.registration.entities.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/registration/entities/exceptions/RegistrationEbsException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", ErrorResponseData.JSON_ERROR_CODE, "", ErrorResponseData.JSON_ERROR_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "throwable", "", "(Ljava/lang/Throwable;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class RegistrationEbsException extends EbsException {
    public RegistrationEbsException(String str, String str2) {
        super(str, str2);
    }

    public RegistrationEbsException(String str) {
        super(str);
    }

    public RegistrationEbsException(Throwable th) {
        super(th);
    }
}
