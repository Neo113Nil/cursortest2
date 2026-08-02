package com.squareup.cash.investing.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.cdf.stock.StockSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class StockMetricTypePickerPresenter$logPresentTypePicker$1 extends ContinuationImpl {
    public StockSource L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockMetricTypePickerPresenter$logPresentTypePicker$1(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localEditorialPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalEditorialPresenter.access$logPresentTypePicker(this.this$0, this);
    }
}
