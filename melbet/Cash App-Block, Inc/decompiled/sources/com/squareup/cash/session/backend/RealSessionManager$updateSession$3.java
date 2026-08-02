package com.squareup.cash.session.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSession$3 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Session L$0;
    public String L$1;
    public Mutex L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionManager$updateSession$3(RealSessionManager realSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateSession(null, null, this);
    }
}
