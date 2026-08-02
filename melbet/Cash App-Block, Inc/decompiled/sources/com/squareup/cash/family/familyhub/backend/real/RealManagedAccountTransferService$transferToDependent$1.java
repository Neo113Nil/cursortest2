package com.squareup.cash.family.familyhub.backend.real;

import com.nimbusds.jose.jca.JCAContext;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealManagedAccountTransferService$transferToDependent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JCAContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealManagedAccountTransferService$transferToDependent$1(JCAContext jCAContext, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jCAContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Serializable m2172transferToDependenteH_QyT8 = this.this$0.m2172transferToDependenteH_QyT8(null, null, null, null, null, this);
        return m2172transferToDependenteH_QyT8 == CoroutineSingletons.COROUTINE_SUSPENDED ? m2172transferToDependenteH_QyT8 : new Result(m2172transferToDependenteH_QyT8);
    }
}
