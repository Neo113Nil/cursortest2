package ru.rt.ebs.cryptosdk.core.network.entities.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.at50;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/rt/ebs/cryptosdk/core/network/entities/exceptions/NetworkException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", "", Constants.INTENT_PARAM_RESPONSE_CODE, "", "responseMessage", ErrorResponseData.JSON_ERROR_CODE, ErrorResponseData.JSON_ERROR_MESSAGE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CA20Status.STATUS_USER_I, "getResponseCode", "()I", "Ljava/lang/String;", "getResponseMessage", "()Ljava/lang/String;", "Companion", "at50", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkException extends EbsException {
    public static final at50 Companion = new at50();
    private final int responseCode;
    private final String responseMessage;

    public NetworkException(int i, String str, String str2, String str3) {
        super(str2, str3);
        this.responseCode = i;
        this.responseMessage = str;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }
}
