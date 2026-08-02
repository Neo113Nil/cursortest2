package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter$verify$1 extends ContinuationImpl {
    public Function1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyAliasPresenter$verify$1(VerifyAliasPresenter verifyAliasPresenter, Continuation continuation) {
        super(continuation);
        this.this$0 = verifyAliasPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return VerifyAliasPresenter.access$verify(this.this$0, null, null, this);
    }
}
