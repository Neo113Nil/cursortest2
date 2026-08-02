package com.squareup.cash.account.backend;

import com.squareup.cash.clientrouting.data.TargetDestination;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealAccountSwitcher$initiate$1 extends ContinuationImpl {
    public String L$0;
    public String L$1;
    public String L$2;
    public AccountSwitcher$AccountSwitchInitiationSource L$3;
    public TargetDestination L$4;
    public String L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAccountSwitcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountSwitcher$initiate$1(RealAccountSwitcher realAccountSwitcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAccountSwitcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.initiate(null, null, null, null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
