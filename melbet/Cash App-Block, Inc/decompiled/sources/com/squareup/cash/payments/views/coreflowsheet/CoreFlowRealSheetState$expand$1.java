package com.squareup.cash.payments.views.coreflowsheet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState$expand$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoreFlowRealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFlowRealSheetState$expand$1(CoreFlowRealSheetState coreFlowRealSheetState, Continuation continuation) {
        super(continuation);
        this.this$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.expand(this);
    }
}
