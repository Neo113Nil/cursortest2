package com.squareup.cash.fidesmo.real;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$getActivationData$2 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public String L$0;
    public RealFidesmoClient L$1;
    public ArrayList L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$getActivationData$2(RealFidesmoClient realFidesmoClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFidesmoClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealFidesmoClient.access$getActivationData(this.this$0, null, this);
    }
}
