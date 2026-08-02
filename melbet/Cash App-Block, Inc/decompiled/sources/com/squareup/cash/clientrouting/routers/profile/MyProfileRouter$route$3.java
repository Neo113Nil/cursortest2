package com.squareup.cash.clientrouting.routers.profile;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MyProfileRouter$route$3 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MyProfileRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyProfileRouter$route$3(MyProfileRouter myProfileRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = myProfileRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.ViewDependentWithParams) null, this);
    }
}
