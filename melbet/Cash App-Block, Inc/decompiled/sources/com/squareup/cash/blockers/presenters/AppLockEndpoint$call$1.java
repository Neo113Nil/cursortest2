package com.squareup.cash.blockers.presenters;

import androidx.media3.common.FlagSet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class AppLockEndpoint$call$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlagSet.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockEndpoint$call$1(FlagSet.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.call(null, null, null, this);
    }
}
