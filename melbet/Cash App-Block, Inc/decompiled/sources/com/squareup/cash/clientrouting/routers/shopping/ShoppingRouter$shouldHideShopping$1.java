package com.squareup.cash.clientrouting.routers.shopping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShoppingRouter$shouldHideShopping$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShoppingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingRouter$shouldHideShopping$1(ShoppingRouter shoppingRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shoppingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.shouldHideShopping(this);
    }
}
