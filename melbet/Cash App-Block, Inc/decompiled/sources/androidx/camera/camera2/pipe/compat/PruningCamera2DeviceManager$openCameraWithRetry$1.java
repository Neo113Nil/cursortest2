package androidx.camera.camera2.pipe.compat;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PruningCamera2DeviceManager$openCameraWithRetry$1 extends ContinuationImpl {
    public String L$0;
    public List L$1;
    public CoroutineScope L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PruningCamera2DeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningCamera2DeviceManager$openCameraWithRetry$1(PruningCamera2DeviceManager pruningCamera2DeviceManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pruningCamera2DeviceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m77openCameraWithRetryzDSwpeU(null, null, null, null, this);
    }
}
