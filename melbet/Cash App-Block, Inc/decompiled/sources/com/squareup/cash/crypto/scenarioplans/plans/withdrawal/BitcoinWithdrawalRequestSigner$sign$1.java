package com.squareup.cash.crypto.scenarioplans.plans.withdrawal;

import com.google.zxing.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class BitcoinWithdrawalRequestSigner$sign$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Result this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinWithdrawalRequestSigner$sign$1(Result result, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sign(null, this);
    }
}
