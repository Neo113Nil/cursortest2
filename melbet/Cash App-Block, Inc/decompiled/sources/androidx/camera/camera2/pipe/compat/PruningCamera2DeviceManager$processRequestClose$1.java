package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PruningCamera2DeviceManager$processRequestClose$1 extends ContinuationImpl {
    public RequestClose L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PruningCamera2DeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningCamera2DeviceManager$processRequestClose$1(PruningCamera2DeviceManager pruningCamera2DeviceManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pruningCamera2DeviceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processRequestClose(null, this);
    }
}
