package com.squareup.cash.card.onboarding;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1(CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3, Continuation continuation) {
        super(continuation);
        this.this$0 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(0, this);
    }
}
