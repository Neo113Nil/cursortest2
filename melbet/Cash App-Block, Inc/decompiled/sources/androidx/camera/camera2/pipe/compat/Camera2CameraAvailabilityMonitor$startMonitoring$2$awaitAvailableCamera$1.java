package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 extends ContinuationImpl {
    public CompletableDeferredImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2CameraAvailabilityMonitor$startMonitoring$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1(Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2CameraAvailabilityMonitor$startMonitoring$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitAvailableCamera(0L, this);
    }
}
