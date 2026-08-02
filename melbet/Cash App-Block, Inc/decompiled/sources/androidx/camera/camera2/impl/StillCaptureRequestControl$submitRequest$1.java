package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.StillCaptureRequestControl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class StillCaptureRequestControl$submitRequest$1 extends ContinuationImpl {
    public StillCaptureRequestControl.CaptureRequest L$0;
    public UseCaseCameraRequestControl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StillCaptureRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillCaptureRequestControl$submitRequest$1(StillCaptureRequestControl stillCaptureRequestControl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stillCaptureRequestControl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return StillCaptureRequestControl.access$submitRequest(this.this$0, null, null, this);
    }
}
