package com.squareup.cash.shopping.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShoppingJavascriptPresenter$getCheckoutToken$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShoppingJavascriptPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShoppingJavascriptPresenter$getCheckoutToken$1(RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShoppingJavascriptPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealShoppingJavascriptPresenter.access$getCheckoutToken(this.this$0, this);
    }
}
