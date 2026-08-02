package com.squareup.cash.session.backend;

import com.squareup.cash.session.backend.RealSessionManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSessionState$1 extends ContinuationImpl {
    public RealSessionManager.Update L$0;
    public RealSessionManager.Update L$1;
    public String L$10;
    public String L$11;
    public Session L$12;
    public String L$13;
    public String L$14;
    public SessionState L$15;
    public OnboardedAccountStatus L$16;
    public RealSessionManager.Update L$2;
    public RealSessionManager.Update L$3;
    public RealSessionManager.Update L$4;
    public RealSessionManager.StateChangeReason L$5;
    public SessionState L$6;
    public String L$7;
    public Session L$8;
    public String L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionManager$updateSessionState$1(RealSessionManager realSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateSessionState(null, null, null, null, null, null, this);
    }
}
