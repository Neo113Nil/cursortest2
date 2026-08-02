package androidx.camera.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.util.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda12 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Recorder recorder = (Recorder) obj3;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) obj2;
                Throwable th = (Throwable) obj;
                if (recorder.mAudioErrorCause == null) {
                    if (th instanceof EncodeException) {
                        recorder.setAudioState(5);
                    } else {
                        recorder.setAudioState(6);
                    }
                    recorder.mAudioErrorCause = th;
                    recorder.updateInProgressStatusEvent(true);
                    callbackToFutureAdapter$Completer.set(null);
                    break;
                }
                break;
            case 1:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 2:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) obj3;
                SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) obj2;
                surfaceOutputImpl.close();
                Surface surface = (Surface) defaultSurfaceProcessor.mOutputSurfaces.remove(surfaceOutputImpl);
                if (surface != null) {
                    OpenGlRenderer openGlRenderer = defaultSurfaceProcessor.mGlRenderer;
                    GLUtils.checkInitializedOrThrow((AtomicBoolean) openGlRenderer.mInitialized, true);
                    GLUtils.checkGlThreadOrThrow((Thread) openGlRenderer.mGlThread);
                    openGlRenderer.removeOutputSurfaceInternal(surface, true);
                    break;
                }
                break;
            default:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) obj3;
                SurfaceOutputImpl surfaceOutputImpl2 = (SurfaceOutputImpl) obj2;
                surfaceOutputImpl2.close();
                Surface surface2 = (Surface) dualSurfaceProcessor.mOutputSurfaces.remove(surfaceOutputImpl2);
                if (surface2 != null) {
                    DualOpenGlRenderer dualOpenGlRenderer = dualSurfaceProcessor.mGlRenderer;
                    GLUtils.checkInitializedOrThrow((AtomicBoolean) dualOpenGlRenderer.mInitialized, true);
                    GLUtils.checkGlThreadOrThrow((Thread) dualOpenGlRenderer.mGlThread);
                    dualOpenGlRenderer.removeOutputSurfaceInternal(surface2, true);
                    break;
                }
                break;
        }
    }
}
