package com.squareup.cash.session.backend;

import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SessionStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSession$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public ResponseContext L$0;
    public String L$1;
    public Exception L$2;
    public Mutex L$3;
    public Session L$4;
    public SessionStatus L$6;
    public String L$7;
    public RealSessionManager.Update L$8;
    public String L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionManager$updateSession$1(RealSessionManager realSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateSession(null, null, null, this);
    }
}
