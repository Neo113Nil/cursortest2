package com.squareup.cash.clientrouting.interceptors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class AccountInterceptor$getRoutingAccount$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountInterceptor$getRoutingAccount$1(AccountInterceptor accountInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = accountInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getRoutingAccount(null, null, this);
    }
}
