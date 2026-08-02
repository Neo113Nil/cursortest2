package com.squareup.cash.family.requestsponsorship.presenters;

import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1(AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601, Continuation continuation) {
        super(continuation);
        this.this$0 = c00601;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
