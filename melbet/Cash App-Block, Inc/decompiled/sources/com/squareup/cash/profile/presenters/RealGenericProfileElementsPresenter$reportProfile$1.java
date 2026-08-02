package com.squareup.cash.profile.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealGenericProfileElementsPresenter$reportProfile$1 extends ContinuationImpl {
    public BlockersData L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGenericProfileElementsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGenericProfileElementsPresenter$reportProfile$1(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGenericProfileElementsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealGenericProfileElementsPresenter.access$reportProfile(this.this$0, this);
    }
}
