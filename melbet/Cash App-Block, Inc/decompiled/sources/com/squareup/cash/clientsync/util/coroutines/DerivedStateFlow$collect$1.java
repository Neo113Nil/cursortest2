package com.squareup.cash.clientsync.util.coroutines;

import com.squareup.util.coroutines.DerivedStateFlow;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DerivedStateFlow$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DerivedStateFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedStateFlow$collect$1(DerivedStateFlow derivedStateFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = derivedStateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collect(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
