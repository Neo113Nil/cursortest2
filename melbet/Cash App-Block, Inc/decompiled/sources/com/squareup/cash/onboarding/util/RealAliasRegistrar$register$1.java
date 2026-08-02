package com.squareup.cash.onboarding.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAliasRegistrar$register$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAliasRegistrar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAliasRegistrar$register$1(RealAliasRegistrar realAliasRegistrar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAliasRegistrar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.register(null, this);
    }
}
