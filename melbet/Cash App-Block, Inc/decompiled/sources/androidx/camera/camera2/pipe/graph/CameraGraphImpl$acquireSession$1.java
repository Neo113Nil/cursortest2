package androidx.camera.camera2.pipe.graph;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CameraGraphImpl$acquireSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraGraphImpl$acquireSession$1(CameraGraphImpl cameraGraphImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cameraGraphImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.acquireSession(this);
    }
}
