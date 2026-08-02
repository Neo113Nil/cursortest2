package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$2;
    public AfterpayApplet L$3;
    public AfterpayAppletHome.OnDisplayMessage L$5;
    public AfterpayAppletResponse L$6;
    public FlowCollector L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1(RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2 realAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
