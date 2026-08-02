package com.squareup.cash.appmessages.presenters;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filter$1$2$1(InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2 inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2, Continuation continuation) {
        super(continuation);
        this.this$0 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
