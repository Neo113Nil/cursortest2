package com.squareup.cash.boost.backend;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1(RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2 realBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
