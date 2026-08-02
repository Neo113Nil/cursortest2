package com.squareup.cash.profile.presenters;

import com.squareup.cash.banking.presenters.TransfersPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealProfilePasscodePresenter$passcodeToggleData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransfersPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfilePasscodePresenter$passcodeToggleData$1(TransfersPresenter transfersPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = transfersPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TransfersPresenter.access$passcodeToggleData(this.this$0, null, this);
    }
}
