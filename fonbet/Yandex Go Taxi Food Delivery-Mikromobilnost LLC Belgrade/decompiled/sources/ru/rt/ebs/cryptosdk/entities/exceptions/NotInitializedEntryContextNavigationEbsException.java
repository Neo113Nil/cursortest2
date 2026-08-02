package ru.rt.ebs.cryptosdk.entities.exceptions;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/exceptions/NotInitializedEntryContextNavigationEbsException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", "<init>", "()V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotInitializedEntryContextNavigationEbsException extends EbsException {
    public NotInitializedEntryContextNavigationEbsException() {
        super("The context needs to be established");
    }
}
