package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.twilio.verify_sna.domain.twilioverifysna.ConcreteTwilioVerifySna", f = "ConcreteTwilioVerifySna.kt", l = {43}, m = "processUrl")
/* loaded from: classes5.dex */
public final class M extends ContinuationImpl {
    public N a;
    public /* synthetic */ Object b;
    public final /* synthetic */ N c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a(null, this);
    }
}
