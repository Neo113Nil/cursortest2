package com.squareup.cash.borrow.presenters.util;

import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealLoanFlowStarter$initiateLoan$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$0;
    public Function1 L$2;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLoanFlowStarter$initiateLoan$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiateLoan(null, null, null, this);
    }
}
