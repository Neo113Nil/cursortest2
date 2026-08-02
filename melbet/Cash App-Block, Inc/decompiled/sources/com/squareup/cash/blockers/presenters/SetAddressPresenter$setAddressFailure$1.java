package com.squareup.cash.blockers.presenters;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SetAddressPresenter$setAddressFailure$1 extends ContinuationImpl {
    public ApiResult.Failure L$0;
    public BlockersData L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddressPresenter$setAddressFailure$1(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setAddressFailure(null, null, this);
    }
}
