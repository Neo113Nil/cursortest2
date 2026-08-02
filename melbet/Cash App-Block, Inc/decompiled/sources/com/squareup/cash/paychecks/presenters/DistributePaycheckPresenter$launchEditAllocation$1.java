package com.squareup.cash.paychecks.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class DistributePaycheckPresenter$launchEditAllocation$1 extends ContinuationImpl {
    public AllocationDestination L$0;
    public PaychecksUiConfiguration L$1;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributePaycheckPresenter$launchEditAllocation$1(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalHomePresenter.access$launchEditAllocation(this.this$0, null, null, this);
    }
}
