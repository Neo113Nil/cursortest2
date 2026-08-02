package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class SetPinPresenter$forgotPasscode$1 extends ContinuationImpl {
    public RealBrandFollowPresenter$models$2$1$1 L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SetPinPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPinPresenter$forgotPasscode$1(SetPinPresenter setPinPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = setPinPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SetPinPresenter.access$forgotPasscode(this.this$0, null, this);
    }
}
