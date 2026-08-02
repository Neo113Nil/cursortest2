package com.squareup.cash.data.activity;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.Event;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator$sendInitiatePayment$3 extends ContinuationImpl {
    public ClientScenario L$0;
    public String L$1;
    public InitiatePaymentRequest L$2;
    public Long L$3;
    public Event L$4;
    public List L$5;
    public BlockersData.MoneybotContext L$6;
    public InitiatePaymentRequest L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentNavigator$sendInitiatePayment$3(RealPaymentNavigator realPaymentNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendInitiatePayment(null, null, null, null, false, null, null, null, this);
    }
}
