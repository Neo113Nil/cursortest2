package com.squareup.cash.moneybot.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealUserSessionPager$fetchNextPage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserSessionPager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserSessionPager$fetchNextPage$1(RealUserSessionPager realUserSessionPager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserSessionPager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchNextPage(this);
    }
}
