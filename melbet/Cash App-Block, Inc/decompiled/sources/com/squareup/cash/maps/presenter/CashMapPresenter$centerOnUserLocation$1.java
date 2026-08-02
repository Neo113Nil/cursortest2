package com.squareup.cash.maps.presenter;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CashMapPresenter$centerOnUserLocation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashMapPresenter$centerOnUserLocation$1(CashMapPresenter cashMapPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashMapPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CashMapPresenter.access$centerOnUserLocation(this.this$0, this);
    }
}
