package com.squareup.cash.afterpayapplet.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$addViewedSectionId$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayAppletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$addViewedSectionId$1(RealAfterpayAppletRepository realAfterpayAppletRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayAppletRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.addViewedSectionId(null, this);
    }
}
