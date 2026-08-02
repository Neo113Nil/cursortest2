package com.squareup.cash.shopping.presenters;

import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ProductSearchPresenter$performSearch$1 extends ContinuationImpl {
    public ProductSearchPresenter.State L$0;
    public SearchResults L$2;
    public SearchResults L$3;
    public SearchResults L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProductSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchPresenter$performSearch$1(ProductSearchPresenter productSearchPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = productSearchPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ProductSearchPresenter.access$performSearch(this.this$0, null, null, this);
    }
}
