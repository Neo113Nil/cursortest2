package com.squareup.cash.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealReferralManager$referralStatusRowSeen$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealReferralManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealReferralManager$referralStatusRowSeen$1(RealReferralManager realReferralManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realReferralManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.referralStatusRowSeen(this);
    }
}
