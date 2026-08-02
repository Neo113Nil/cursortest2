package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RegisterAliasPresenter$skip$1 extends ContinuationImpl {
    public Function1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$skip$1(RegisterAliasPresenter registerAliasPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = registerAliasPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.skip(null, this);
    }
}
