package com.squareup.cash.shopping.autofill.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AutofillPresenter$updateAutofill$1 extends ContinuationImpl {
    public Function1 L$3;
    public Function0 L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutofillPresenter$updateAutofill$1(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localEditorialPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalEditorialPresenter.access$updateAutofill(this.this$0, null, null, null, null, null, this);
    }
}
