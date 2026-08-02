package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Camera2Backend$isConfigSupported$1 extends ContinuationImpl {
    public CameraGraph$Config L$0;
    public CameraDeviceSetupCompat L$1;
    public SessionConfiguration L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2Backend this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2Backend$isConfigSupported$1(Camera2Backend camera2Backend, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2Backend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m63isConfigSupportedNpXggIU(null, this);
    }
}
