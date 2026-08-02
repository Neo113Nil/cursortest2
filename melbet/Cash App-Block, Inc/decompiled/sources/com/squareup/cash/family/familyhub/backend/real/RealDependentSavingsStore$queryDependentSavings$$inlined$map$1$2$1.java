package com.squareup.cash.family.familyhub.backend.real;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1(FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
