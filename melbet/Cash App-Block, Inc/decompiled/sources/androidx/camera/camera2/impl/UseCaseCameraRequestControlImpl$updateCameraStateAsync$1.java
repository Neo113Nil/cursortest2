package androidx.camera.camera2.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$updateCameraStateAsync$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = useCaseCameraRequestControlImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateCameraStateAsync(null, null, this);
    }
}
