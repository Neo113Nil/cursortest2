package com.squareup.cash.profile.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealGenericProfileElementsPresenter$getCustomerProfileData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGenericProfileElementsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGenericProfileElementsPresenter$getCustomerProfileData$1(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGenericProfileElementsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealGenericProfileElementsPresenter.access$getCustomerProfileData(this.this$0, this);
    }
}
