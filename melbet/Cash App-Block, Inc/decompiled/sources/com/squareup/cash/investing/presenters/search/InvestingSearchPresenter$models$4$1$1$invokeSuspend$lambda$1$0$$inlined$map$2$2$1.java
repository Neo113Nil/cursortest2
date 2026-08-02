package com.squareup.cash.investing.presenters.search;

import app.cash.zipline.loader.ZiplineLoader$load$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader$load$2.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1(ZiplineLoader$load$2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
