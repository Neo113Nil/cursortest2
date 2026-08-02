package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.common.location.GlobalAddress;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SetAddressPresenter$createShippingAddress$1 extends ContinuationImpl {
    public GlobalAddress L$0;
    public BlockersScreens.StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress L$1;
    public BlockersData L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddressPresenter$createShippingAddress$1(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardLockPresenter.access$createShippingAddress(this.this$0, null, null, this);
    }
}
