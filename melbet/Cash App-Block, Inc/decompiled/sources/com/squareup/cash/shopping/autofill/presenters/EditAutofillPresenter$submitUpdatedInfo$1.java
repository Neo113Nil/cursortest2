package com.squareup.cash.shopping.autofill.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class EditAutofillPresenter$submitUpdatedInfo$1 extends ContinuationImpl {
    public OverridingUtil.AnonymousClass7 L$3;
    public QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditAutofillPresenter$submitUpdatedInfo$1(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localEditorialPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalEditorialPresenter.access$submitUpdatedInfo(this.this$0, null, null, null, null, null, this);
    }
}
