package ru.rt.ebs.cryptosdk.core.registration.entities.exceptions;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/core/registration/entities/exceptions/EmptyTokenRegistrationEbsException;", "Lru/rt/ebs/cryptosdk/core/registration/entities/exceptions/RegistrationEbsException;", "<init>", "()V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyTokenRegistrationEbsException extends RegistrationEbsException {
    public EmptyTokenRegistrationEbsException() {
        super(EbsException.REG_0001_CODE, "Требуется повторный запрос initialize с JWT");
    }
}
