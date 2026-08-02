package com.squareup.cash.google.pay;

import com.fillr.n;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class FranklinGooglePayProvisioningGateway$complete$1 extends ContinuationImpl {
    public BlockersScreens.ProvisionGooglePayScreen L$0;
    public DigitalWalletTokenProvisioningCompletionData.ProvisioningResult L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FranklinGooglePayProvisioningGateway$complete$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.complete(null, null, this);
    }
}
