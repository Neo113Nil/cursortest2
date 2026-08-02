package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CaptureSessionState$tryCreateCaptureSession$1 extends ContinuationImpl {
    public Ref$ObjectRef L$0;
    public Ref$ObjectRef L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureSessionState$tryCreateCaptureSession$1(CaptureSessionState captureSessionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = captureSessionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CaptureSessionState.access$tryCreateCaptureSession(this.this$0, this);
    }
}
