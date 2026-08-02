package androidx.camera.camera2.pipe.compat;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CameraStateOpener$tryOpenCamera$2$result$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cameraId;
    public final /* synthetic */ Ref$ObjectRef $cameraOpenDeferred;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraStateOpener$tryOpenCamera$2$result$1$1(Ref$ObjectRef ref$ObjectRef, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cameraOpenDeferred = ref$ObjectRef;
        this.$cameraId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$cameraId;
        Ref$ObjectRef ref$ObjectRef = this.$cameraOpenDeferred;
        switch (i) {
            case 0:
                CameraStateOpener$tryOpenCamera$2$result$1$1 cameraStateOpener$tryOpenCamera$2$result$1$1 = new CameraStateOpener$tryOpenCamera$2$result$1$1(ref$ObjectRef, str, continuation, 0);
                cameraStateOpener$tryOpenCamera$2$result$1$1.L$0 = obj;
                return cameraStateOpener$tryOpenCamera$2$result$1$1;
            default:
                CameraStateOpener$tryOpenCamera$2$result$1$1 cameraStateOpener$tryOpenCamera$2$result$1$12 = new CameraStateOpener$tryOpenCamera$2$result$1$1(ref$ObjectRef, str, continuation, 1);
                cameraStateOpener$tryOpenCamera$2$result$1$12.L$0 = obj;
                return cameraStateOpener$tryOpenCamera$2$result$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OpenCameraResult openCameraResult = (OpenCameraResult) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CameraStateOpener$tryOpenCamera$2$result$1$1) create(openCameraResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.$cameraOpenDeferred;
        String str = this.$cameraId;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OpenCameraResult openCameraResult = (OpenCameraResult) this.L$0;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) CameraId.m46toStringimpl(str)) + " returned");
                ref$ObjectRef.element = null;
                return openCameraResult;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OpenCameraResult openCameraResult2 = (OpenCameraResult) this.L$0;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) CameraId.m46toStringimpl(str)) + " opened");
                ref$ObjectRef.element = null;
                return openCameraResult2;
        }
    }
}
