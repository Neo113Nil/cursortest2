package com.squareup.cash.sheet;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealSheetState$awaitDismissalDragEnabled$1 extends ContinuationImpl {
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSheetState$awaitDismissalDragEnabled$1(RealSheetState realSheetState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealSheetState.access$awaitDismissalDragEnabled(this.this$0, this);
    }
}
