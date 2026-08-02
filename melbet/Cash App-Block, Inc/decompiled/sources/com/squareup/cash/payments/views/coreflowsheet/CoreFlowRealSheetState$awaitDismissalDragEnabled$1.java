package com.squareup.cash.payments.views.coreflowsheet;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState$awaitDismissalDragEnabled$1 extends ContinuationImpl {
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoreFlowRealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFlowRealSheetState$awaitDismissalDragEnabled$1(CoreFlowRealSheetState coreFlowRealSheetState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CoreFlowRealSheetState.access$awaitDismissalDragEnabled(this.this$0, this);
    }
}
