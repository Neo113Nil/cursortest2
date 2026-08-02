package com.squareup.cash.shopping.presenters;

import com.squareup.cash.shopping.backend.api.SearchResults;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ProductSearchPresenter$toViewModel$1 extends ContinuationImpl {
    public int I$0;
    public SearchResults L$1;
    public String L$2;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProductSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchPresenter$toViewModel$1(ProductSearchPresenter productSearchPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = productSearchPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.toViewModel(null, null, false, this);
    }
}
