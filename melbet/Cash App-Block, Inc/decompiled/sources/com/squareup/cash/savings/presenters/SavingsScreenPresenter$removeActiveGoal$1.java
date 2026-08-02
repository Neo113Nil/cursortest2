package com.squareup.cash.savings.presenters;

import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SavingsScreenPresenter$removeActiveGoal$1 extends ContinuationImpl {
    public ShiftNotePresenter$models$1$1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SavingsScreenPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsScreenPresenter$removeActiveGoal$1(SavingsScreenPresenter savingsScreenPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = savingsScreenPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SavingsScreenPresenter.access$removeActiveGoal(this.this$0, null, this);
    }
}
