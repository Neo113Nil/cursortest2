package ru.rt.ebs.cryptosdk.entities.exceptions;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/exceptions/CameraException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CameraException extends EbsException {
    public CameraException(Throwable th) {
        super(th);
    }

    public CameraException(String str) {
        super(str);
    }
}
