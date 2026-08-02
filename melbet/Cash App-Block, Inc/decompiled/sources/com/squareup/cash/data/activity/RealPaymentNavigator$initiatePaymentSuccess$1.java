package com.squareup.cash.data.activity;

import com.squareup.protos.franklin.common.ResponseContext;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator$initiatePaymentSuccess$1 extends ContinuationImpl {
    public ResponseContext L$1;
    public String L$2;
    public List L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentNavigator$initiatePaymentSuccess$1(RealPaymentNavigator realPaymentNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiatePaymentSuccess(null, null, null, null, this);
    }
}
