package com.squareup.cash.bitcoin.presenters.applet.stackingtools;

import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinStackingToolsPresenter$roundupsClick$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$0;
    public RealRouter L$1;
    public BitcoinRoundUpsAvailability L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinStackingToolsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinStackingToolsPresenter$roundupsClick$1(BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bitcoinStackingToolsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BitcoinStackingToolsPresenter.access$roundupsClick(this.this$0, null, null, null, false, this);
    }
}
