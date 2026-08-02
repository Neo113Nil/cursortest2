package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1 extends ContinuationImpl {
    public MutableState L$1;
    public MutableState L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreditFirstTimeBorrowBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1(CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = creditFirstTimeBorrowBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleAmountPickerConfirmAmount(null, null, null, this);
    }
}
