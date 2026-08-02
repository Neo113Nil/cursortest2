package com.squareup.cash.crypto.navigation;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCryptoFlowStarter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCryptoFlowStarter$startBitcoinRoundUpsEnrollment$1(RealCryptoFlowStarter realCryptoFlowStarter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCryptoFlowStarter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startBitcoinRoundUpsEnrollment(null, this);
    }
}
