package com.squareup.cash.limits.backend.real;

import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class LimitsPageletBadger$collect$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashCdpConfigProvider$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsPageletBadger$collect$$inlined$map$1$2$1(CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = cashCdpConfigProvider$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
