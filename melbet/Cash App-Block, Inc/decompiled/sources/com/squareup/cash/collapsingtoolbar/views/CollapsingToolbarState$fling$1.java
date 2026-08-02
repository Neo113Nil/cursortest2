package com.squareup.cash.collapsingtoolbar.views;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CollapsingToolbarState$fling$1 extends ContinuationImpl {
    public Ref$FloatRef L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CollapsingToolbarState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingToolbarState$fling$1(CollapsingToolbarState collapsingToolbarState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = collapsingToolbarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fling(null, RecyclerView.DECELERATION_RATE, this);
    }
}
