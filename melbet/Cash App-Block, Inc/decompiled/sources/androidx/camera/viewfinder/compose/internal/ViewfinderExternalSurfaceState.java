package androidx.camera.viewfinder.compose.internal;

import android.graphics.Rect;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.core.impl.RefCounted;
import androidx.compose.material.SliderDraggableState$drag$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class ViewfinderExternalSurfaceState extends BaseViewfinderExternalSurfaceState implements SurfaceHolder.Callback {
    public int lastHeight;
    public int lastWidth;
    public ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 surfaceView;
    public ViewfinderExternalSurfaceHolder viewfinderSurfaceHolder;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.lastWidth = i2;
        this.lastHeight = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 = this.surfaceView;
        Continuation continuation = null;
        if (viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
            throw null;
        }
        SurfaceControl surfaceControl = viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getSurfaceControl();
        surfaceControl.getClass();
        Recorder.AnonymousClass6 anonymousClass6 = new Recorder.AnonymousClass6(surfaceControl);
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = this.viewfinderSurfaceHolder;
        if (viewfinderExternalSurfaceHolder != null) {
            RefCounted refCounted = viewfinderExternalSurfaceHolder.refCountedSurface;
            if (!viewfinderExternalSurfaceHolder.isDetached) {
                a$$ExternalSyntheticBUOutline0.m$1("tryAttach() can only be called when detached");
                return;
            }
            Surface surface = (Surface) refCounted.acquire();
            if (surface != null) {
                Recorder.AnonymousClass6 anonymousClass62 = (Recorder.AnonymousClass6) viewfinderExternalSurfaceHolder.surfaceControl;
                anonymousClass62.getClass();
                SurfaceControl surfaceControl2 = (SurfaceControl) anonymousClass62.this$0;
                if (surfaceControl2.isValid()) {
                    SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                    try {
                        transaction.reparent(surfaceControl2, surfaceControl).apply();
                        transaction.close();
                        Log.d("VfExternalSurface", "Reattached " + surface + " to " + anonymousClass6);
                        viewfinderExternalSurfaceHolder.isDetached = false;
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(transaction, th);
                            throw th2;
                        }
                    }
                }
                Log.d("VfExternalSurface", "Unable to attach " + surface + " to " + anonymousClass6);
                refCounted.release();
            }
        }
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder2 = new ViewfinderExternalSurfaceHolder(surfaceHolder.getSurface(), this.lastWidth, this.lastHeight, anonymousClass6);
        this.viewfinderSurfaceHolder = viewfinderExternalSurfaceHolder2;
        if (this.onSurface != null) {
            this.job = JobKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new SliderDraggableState$drag$2(this, viewfinderExternalSurfaceHolder2, continuation, 11), 1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = this.viewfinderSurfaceHolder;
        if (viewfinderExternalSurfaceHolder == null || viewfinderExternalSurfaceHolder.isDetached) {
            return;
        }
        ((Recorder.AnonymousClass6) viewfinderExternalSurfaceHolder.surfaceControl).detach();
        viewfinderExternalSurfaceHolder.refCountedSurface.release();
        viewfinderExternalSurfaceHolder.isDetached = true;
    }
}
