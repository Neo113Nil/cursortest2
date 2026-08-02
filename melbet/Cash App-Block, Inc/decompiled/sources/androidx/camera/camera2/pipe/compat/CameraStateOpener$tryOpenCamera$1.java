package androidx.camera.camera2.pipe.compat;

import com.stripe.hcaptcha.HCaptcha;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CameraStateOpener$tryOpenCamera$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public String L$0;
    public Camera2DeviceCloserImpl L$1;
    public AudioRestrictionControllerImpl L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HCaptcha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$1(HCaptcha hCaptcha, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hCaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(null, 0, 0L, null, null, this);
    }
}
