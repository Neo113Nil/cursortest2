package com.squareup.cash.shopping.settings.presenters;

import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1 extends ContinuationImpl {
    public QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShoppingSettingsAutofillPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1(ShoppingSettingsAutofillPresenter shoppingSettingsAutofillPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shoppingSettingsAutofillPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleAutofillCheckChange(false, null, this);
    }
}
