package com.squareup.cash.blockers.presenters;

import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1(BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2 borrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = borrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
