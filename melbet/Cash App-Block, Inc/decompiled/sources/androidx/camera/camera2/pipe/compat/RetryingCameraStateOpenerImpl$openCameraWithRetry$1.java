package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RetryingCameraStateOpenerImpl$openCameraWithRetry$1 extends ContinuationImpl {
    public long J$0;
    public String L$0;
    public Camera2DeviceCloserImpl L$1;
    public Function1 L$2;
    public Ref$IntRef L$3;
    public AutoCloseable L$4;
    public Camera2CameraAvailabilityMonitor$startMonitoring$2 L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RetryingCameraStateOpenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryingCameraStateOpenerImpl$openCameraWithRetry$1(RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = retryingCameraStateOpenerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m79openCameraWithRetryaeCOTgg(null, null, null, this);
    }
}
