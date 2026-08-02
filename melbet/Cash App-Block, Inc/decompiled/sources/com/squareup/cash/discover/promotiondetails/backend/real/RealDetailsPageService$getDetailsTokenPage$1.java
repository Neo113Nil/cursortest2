package com.squareup.cash.discover.promotiondetails.backend.real;

import com.fillr.featuretoggle.UnleashContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealDetailsPageService$getDetailsTokenPage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UnleashContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDetailsPageService$getDetailsTokenPage$1(UnleashContext unleashContext, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = unleashContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getDetailsTokenPage(null, this);
    }
}
