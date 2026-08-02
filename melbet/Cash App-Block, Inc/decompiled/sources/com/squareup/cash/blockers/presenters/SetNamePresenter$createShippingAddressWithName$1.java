package com.squareup.cash.blockers.presenters;

import com.squareup.cash.wallet.presenters.CardLockPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SetNamePresenter$createShippingAddressWithName$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$createShippingAddressWithName$1(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardLockPresenter.access$createShippingAddressWithName(this.this$0, null, null, this);
    }
}
