package com.squareup.cash.afterpayapplet.presenters;

import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomePresenter$models$1$1$1$emit$1 extends ContinuationImpl {
    public HomeResult L$0;
    public AfterpayAppletHomePresenter L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyPagingItems$collectLoadState$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletHomePresenter$models$1$1$1$emit$1(LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2, Continuation continuation) {
        super(continuation);
        this.this$0 = lazyPagingItems$collectLoadState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((HomeResult) null, (Continuation) this);
    }
}
