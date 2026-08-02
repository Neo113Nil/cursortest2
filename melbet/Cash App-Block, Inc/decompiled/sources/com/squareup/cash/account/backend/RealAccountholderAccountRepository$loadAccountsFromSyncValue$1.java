package com.squareup.cash.account.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAccountholderAccountRepository$loadAccountsFromSyncValue$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAccountholderAccountRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountholderAccountRepository$loadAccountsFromSyncValue$1(RealAccountholderAccountRepository realAccountholderAccountRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAccountholderAccountRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadAccountsFromSyncValue(this);
    }
}
