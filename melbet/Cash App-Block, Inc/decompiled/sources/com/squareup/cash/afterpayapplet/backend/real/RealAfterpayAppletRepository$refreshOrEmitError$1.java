package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$refreshOrEmitError$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public FlowCollector L$0;
    public List L$1;
    public Object L$2;
    public AfterpayAppletResponse L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayAppletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$refreshOrEmitError$1(RealAfterpayAppletRepository realAfterpayAppletRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayAppletRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealAfterpayAppletRepository.access$refreshOrEmitError(this.this$0, null, this);
    }
}
