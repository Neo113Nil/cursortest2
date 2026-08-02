package androidx.camera.viewfinder.compose.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.core.impl.RefCounted;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ViewfinderExternalSurfaceHolder {
    public final /* synthetic */ int $r8$classId = 1;
    public boolean isDetached;
    public final RefCounted refCountedSurface;
    public final Object surfaceControl;

    public ViewfinderExternalSurfaceHolder(Surface surface, int i, int i2, Recorder.AnonymousClass6 anonymousClass6) {
        SurfaceControl build = new SurfaceControl.Builder().setName("ViewfinderExternalSurfaceHolder-" + hashCode()).setBufferSize(i, i2).setParent((SurfaceControl) anonymousClass6.this$0).build();
        build.getClass();
        Recorder.AnonymousClass6 anonymousClass62 = new Recorder.AnonymousClass6(build);
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.setVisibility(build, true).apply();
            transaction.close();
            this.surfaceControl = anonymousClass62;
            Surface surface2 = new Surface(build);
            RefCounted refCounted = new RefCounted(new MenuKt$$ExternalSyntheticLambda0(4, this, surface2, surface));
            this.refCountedSurface = refCounted;
            refCounted.initialize(surface2);
        } finally {
        }
    }

    public ViewfinderExternalSurfaceHolder(SurfaceTexture surfaceTexture) {
        this.surfaceControl = surfaceTexture;
        RefCounted refCounted = new RefCounted(new ObjectList$$ExternalSyntheticLambda0(this, 11));
        this.refCountedSurface = refCounted;
        refCounted.initialize(new Surface(surfaceTexture));
    }
}
