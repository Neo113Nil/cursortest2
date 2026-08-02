package com.squareup.cash.shopping.presenters;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$getRestrictedItemsFromBackend$1 extends ContinuationImpl {
    public ArrayList L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShoppingWebPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$getRestrictedItemsFromBackend$1(ShoppingWebPresenter shoppingWebPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shoppingWebPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ShoppingWebPresenter.access$getRestrictedItemsFromBackend(this.this$0, null, null, null, null, this);
    }
}
