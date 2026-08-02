package com.squareup.cash.clientrouting.interceptors;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class AccountInterceptor$intercept$1 extends ContinuationImpl {
    public ClientRoute L$0;
    public RoutingParams L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountInterceptor$intercept$1(AccountInterceptor accountInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = accountInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.intercept(null, null, this);
    }
}
