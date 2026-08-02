package com.squareup.cash.appforeground;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealAppForegroundStateProvider$work$1 extends ContinuationImpl {
    public Lifecycle L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAppForegroundStateProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAppForegroundStateProvider$work$1(RealAppForegroundStateProvider realAppForegroundStateProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAppForegroundStateProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.work(this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
