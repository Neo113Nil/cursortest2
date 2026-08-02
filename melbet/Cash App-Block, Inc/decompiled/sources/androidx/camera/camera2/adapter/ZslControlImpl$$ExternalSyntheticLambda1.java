package androidx.camera.camera2.adapter;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionSession;
import android.view.Surface;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.arch.core.util.Function;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda12;
import androidx.compose.animation.core.Easing;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;

/* loaded from: classes3.dex */
public final /* synthetic */ class ZslControlImpl$$ExternalSyntheticLambda1 implements Function, Preview.SurfaceProvider, Easing {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ZslControlImpl$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    @Override // androidx.arch.core.util.Function
    /* renamed from: apply */
    public Object mo103apply(Object obj) {
        switch (this.$r8$classId) {
            case 19:
                ImageCapture.Defaults defaults = ImageCapture.DEFAULT_CONFIG;
            case 3:
                return null;
            default:
                return ProcessCameraProvider.sAppInstance;
        }
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.mResolution.getWidth(), surfaceRequest.mResolution.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, zzabp.directExecutor(), new Recorder$$ExternalSyntheticLambda12(1, surface, surfaceTexture));
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if (f < 0.36363637f) {
            return 7.5625f * f * f;
        }
        if (f < 0.72727275f) {
            float f2 = f - 0.54545456f;
            return (7.5625f * f2 * f2) + 0.75f;
        }
        if (f < 0.90909094f) {
            float f3 = f - 0.8181818f;
            return (7.5625f * f3 * f3) + 0.9375f;
        }
        float f4 = f - 0.95454544f;
        return (7.5625f * f4 * f4) + 0.984375f;
    }

    public /* synthetic */ ZslControlImpl$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m20m(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m21m() {
        return CameraExtensionSession.class;
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }
}
