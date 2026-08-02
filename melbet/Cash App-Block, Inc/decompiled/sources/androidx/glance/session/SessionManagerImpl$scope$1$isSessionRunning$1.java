package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SessionManagerImpl$scope$1$isSessionRunning$1 extends ContinuationImpl {
    public SessionManagerImpl$scope$1 L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SessionManagerImpl$scope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$scope$1$isSessionRunning$1(SessionManagerImpl$scope$1 sessionManagerImpl$scope$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sessionManagerImpl$scope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.isSessionRunning(null, null, this);
    }
}
