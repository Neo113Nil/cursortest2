package com.squareup.cash.crypto.backend.receiveasbitcoin;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealReceiveP2PAsBitcoinRepo$pauseConversions$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealReceiveP2PAsBitcoinRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealReceiveP2PAsBitcoinRepo$pauseConversions$1(RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realReceiveP2PAsBitcoinRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.pauseConversions(this);
    }
}
