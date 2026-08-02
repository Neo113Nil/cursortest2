package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealPinScreensTitleGenerator$generateTitle$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPinScreensTitleGenerator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPinScreensTitleGenerator$generateTitle$1(RealPinScreensTitleGenerator realPinScreensTitleGenerator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPinScreensTitleGenerator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.generateTitle(null, this);
    }
}
