package com.squareup.cash.history.presenters;

import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class PasscodeDialogPresenter$verifyPasscode$1 extends ContinuationImpl {
    public String L$1;
    public Function1 L$2;
    public ScenarioPlan L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransfersPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeDialogPresenter$verifyPasscode$1(TransfersPresenter transfersPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = transfersPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TransfersPresenter.access$verifyPasscode(this.this$0, null, null, null, this);
    }
}
