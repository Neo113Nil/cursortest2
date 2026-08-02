package com.squareup.cash.blockers.presenters;

import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter$reregister$1 extends ContinuationImpl {
    public AliasRegistrar$Args.DeliveryMechanism L$0;
    public Function1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyAliasPresenter$reregister$1(VerifyAliasPresenter verifyAliasPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = verifyAliasPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.reregister(null, null, this);
    }
}
