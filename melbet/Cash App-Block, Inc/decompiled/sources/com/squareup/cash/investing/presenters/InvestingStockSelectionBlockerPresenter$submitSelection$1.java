package com.squareup.cash.investing.presenters;

import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingStockSelectionBlockerPresenter$submitSelection$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TapToPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockSelectionBlockerPresenter$submitSelection$1(TapToPayPresenter tapToPayPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tapToPayPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TapToPayPresenter.access$submitSelection(this.this$0, null, this);
    }
}
