package com.squareup.cash.crypto.common.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class BitcoinP2pConversionPercentageSubmitter$submit$1 extends ContinuationImpl {
    public Screen L$0;
    public BlockersData L$1;
    public BetterNavigator.ScreenNavigator L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinP2pConversionPercentageSubmitter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinP2pConversionPercentageSubmitter$submit$1(BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bitcoinP2pConversionPercentageSubmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.submit(null, null, 0L, null, null, this);
    }
}
