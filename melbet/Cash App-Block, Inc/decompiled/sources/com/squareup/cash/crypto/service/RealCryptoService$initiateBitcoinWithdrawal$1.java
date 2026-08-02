package com.squareup.cash.crypto.service;

import app.cash.api.wrapper.ServiceContextWrapper;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.Message;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealCryptoService$initiateBitcoinWithdrawal$1 extends ContinuationImpl {
    public int I$0;
    public ClientScenario L$0;
    public String L$1;
    public Object L$10;
    public InitiateBitcoinWithdrawal$Request L$11;
    public String L$2;
    public ServiceContextWrapper L$4;
    public Message L$5;
    public Exception L$7;
    public RequestContext L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCryptoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCryptoService$initiateBitcoinWithdrawal$1(RealCryptoService realCryptoService, Continuation continuation) {
        super(continuation);
        this.this$0 = realCryptoService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiateBitcoinWithdrawal(null, null, null, null, this);
    }
}
