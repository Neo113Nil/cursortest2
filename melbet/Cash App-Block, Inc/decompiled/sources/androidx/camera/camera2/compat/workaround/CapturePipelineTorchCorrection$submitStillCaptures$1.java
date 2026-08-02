package androidx.camera.camera2.compat.workaround;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CapturePipelineTorchCorrection$submitStillCaptures$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CapturePipelineTorchCorrection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineTorchCorrection$submitStillCaptures$1(CapturePipelineTorchCorrection capturePipelineTorchCorrection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = capturePipelineTorchCorrection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.mo23submitStillCapturesBvXKQx0(null, 0, null, 0, 0, 0, this);
    }
}
