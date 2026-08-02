package com.squareup.cash.session.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealUrlAuthenticator$getWebLoginConfig$1 extends ContinuationImpl {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUrlAuthenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUrlAuthenticator$getWebLoginConfig$1(RealUrlAuthenticator realUrlAuthenticator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUrlAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getWebLoginConfig(this);
    }
}
