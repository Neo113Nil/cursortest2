package com.squareup.cash.profile.presenters.personal;

import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1 extends ContinuationImpl {
    public ShiftNotePresenter$models$1$1 L$3;
    public QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1(PoolsListPresenter poolsListPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = poolsListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PoolsListPresenter.access$submitUpdatedInfo(this.this$0, null, null, null, null, null, this);
    }
}
