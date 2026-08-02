package com.squareup.cash.payments.backend.real;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOfflineManager$cancelPendingPayment$1 extends ContinuationImpl {
    public String L$0;
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineManager$cancelPendingPayment$1(RealOfflineManager realOfflineManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOfflineManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.cancelPendingPayment(null, null, this);
    }
}
