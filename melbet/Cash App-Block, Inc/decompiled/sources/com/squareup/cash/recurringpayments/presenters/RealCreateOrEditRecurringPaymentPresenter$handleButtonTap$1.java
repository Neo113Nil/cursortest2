package com.squareup.cash.recurringpayments.presenters;

import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1 extends ContinuationImpl {
    public RecurringPaymentBlocker.Button.Action L$0;
    public RecurringPaymentBlocker.Schedule L$1;
    public Money L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCreateOrEditRecurringPaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1(RealCreateOrEditRecurringPaymentPresenter realCreateOrEditRecurringPaymentPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCreateOrEditRecurringPaymentPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealCreateOrEditRecurringPaymentPresenter.access$handleButtonTap(this.this$0, null, null, null, this);
    }
}
