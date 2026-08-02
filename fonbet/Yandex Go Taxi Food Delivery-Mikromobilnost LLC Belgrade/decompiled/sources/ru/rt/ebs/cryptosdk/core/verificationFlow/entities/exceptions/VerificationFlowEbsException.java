package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/exceptions/VerificationFlowEbsException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", ErrorResponseData.JSON_ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class VerificationFlowEbsException extends EbsException {
    public VerificationFlowEbsException(String str) {
        super(str);
    }
}
