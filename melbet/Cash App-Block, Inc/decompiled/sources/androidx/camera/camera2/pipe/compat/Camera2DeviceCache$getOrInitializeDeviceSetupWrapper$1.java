package androidx.camera.camera2.pipe.compat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Deferred;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 extends ContinuationImpl {
    public String L$0;
    public Deferred L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1(Camera2DeviceCache camera2DeviceCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2DeviceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m68getOrInitializeDeviceSetupWrapper0r8Bogc(null, this);
    }
}
