package com.squareup.cash.family.familyhub.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PromotionsControlPresenter$handleEnablePromotions$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PromotionsControlPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsControlPresenter$handleEnablePromotions$1(PromotionsControlPresenter promotionsControlPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = promotionsControlPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleEnablePromotions(this);
    }
}
