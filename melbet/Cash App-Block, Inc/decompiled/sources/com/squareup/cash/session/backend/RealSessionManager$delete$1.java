package com.squareup.cash.session.backend;

import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSessionManager$delete$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public SessionManager.DeletionMode L$0;
    public Mutex L$1;
    public RealSessionManager.Update L$2;
    public RealSessionManager.Update L$3;
    public RealSessionManager.Update.Some L$4;
    public RealSessionManager.Update.Some L$5;
    public RealSessionManager.Update.Some L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionManager$delete$1(RealSessionManager realSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.delete(null, this);
    }
}
