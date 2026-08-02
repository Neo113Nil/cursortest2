package com.squareup.cash.appmessages.presenters;

import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AmountPickerCondensedView$events$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1(AmountPickerCondensedView$events$$inlined$map$1$2 amountPickerCondensedView$events$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = amountPickerCondensedView$events$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
