package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Camera2CameraController$awaitClosed$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2CameraController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraController$awaitClosed$1(Camera2CameraController camera2CameraController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2CameraController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitClosed(this);
    }
}
