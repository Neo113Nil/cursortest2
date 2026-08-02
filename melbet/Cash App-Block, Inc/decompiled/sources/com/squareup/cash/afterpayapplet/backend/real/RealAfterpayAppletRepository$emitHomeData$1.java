package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$emitHomeData$1 extends ContinuationImpl {
    public FlowCollector L$0;
    public AfterpayAppletResponse L$1;
    public AfterpayAppletHome.OnDisplayMessage L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayAppletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$emitHomeData$1(RealAfterpayAppletRepository realAfterpayAppletRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayAppletRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emitHomeData(null, null, this);
    }
}
