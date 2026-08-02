package ru.rt.ebs.cryptosdk.entities.exceptions;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/exceptions/InstructionHandlerException;", "Lru/rt/ebs/cryptosdk/core/common/entities/exceptions/EbsException;", Constants.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InstructionHandlerException extends EbsException {
    public /* synthetic */ InstructionHandlerException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Incorrect HTML received: HTML doesn't send status via callback method" : str);
    }

    public InstructionHandlerException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstructionHandlerException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
