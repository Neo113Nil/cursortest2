package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$displayMessage$1 extends ContinuationImpl {
    public AfterpayAppletHome.OnDisplayMessage L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayAppletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$displayMessage$1(RealAfterpayAppletRepository realAfterpayAppletRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayAppletRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.displayMessage(null, this);
    }
}
