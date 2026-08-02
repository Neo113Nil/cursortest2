package com.squareup.cash.payments.views.coreflowsheet;

import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState$awaitDismissal$1 extends ContinuationImpl {
    public BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoreFlowRealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFlowRealSheetState$awaitDismissal$1(CoreFlowRealSheetState coreFlowRealSheetState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitDismissal(null, this);
    }
}
