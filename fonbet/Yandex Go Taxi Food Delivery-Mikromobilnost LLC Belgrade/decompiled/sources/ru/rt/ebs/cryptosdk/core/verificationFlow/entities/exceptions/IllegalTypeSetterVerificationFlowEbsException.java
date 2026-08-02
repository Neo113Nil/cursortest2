package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions;

import defpackage.b64;
import defpackage.z3v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/exceptions/IllegalTypeSetterVerificationFlowEbsException;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/exceptions/VerificationFlowEbsException;", "Lz3v;", ClidProvider.STATE, "", "type", "<init>", "(Lz3v;Ljava/lang/String;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IllegalTypeSetterVerificationFlowEbsException extends VerificationFlowEbsException {
    public IllegalTypeSetterVerificationFlowEbsException(z3v z3vVar, String str) {
        super(b64.l("Illegal type state setter [", str, "] for: ", z3vVar.getClass().getName()));
    }

    public /* synthetic */ IllegalTypeSetterVerificationFlowEbsException(z3v z3vVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3vVar, (i & 2) != 0 ? "" : str);
    }
}
