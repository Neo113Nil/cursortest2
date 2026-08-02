package androidx.camera.camera2.pipe.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GraphSessionLock$acquireToken$1 extends ContinuationImpl {
    public MutexImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GraphSessionLock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphSessionLock$acquireToken$1(GraphSessionLock graphSessionLock, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = graphSessionLock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.acquireToken$camera_camera2_pipe(this);
    }
}
