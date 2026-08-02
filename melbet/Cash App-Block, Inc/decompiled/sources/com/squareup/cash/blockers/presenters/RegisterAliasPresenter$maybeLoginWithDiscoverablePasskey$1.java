package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1(RegisterAliasPresenter registerAliasPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = registerAliasPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RegisterAliasPresenter.access$maybeLoginWithDiscoverablePasskey(this.this$0, null, this);
    }
}
