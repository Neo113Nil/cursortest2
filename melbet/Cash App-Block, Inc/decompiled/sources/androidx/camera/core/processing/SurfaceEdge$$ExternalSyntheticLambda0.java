package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceEdge.SettableSurface f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda0(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.$r8$classId = i;
        this.f$0 = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceEdge.SettableSurface settableSurface = this.f$0;
        switch (i) {
            case 0:
                settableSurface.close();
                break;
            case 1:
                settableSurface.decrementUseCount();
                break;
            default:
                SurfaceOutputImpl surfaceOutputImpl = settableSurface.mConsumer;
                if (surfaceOutputImpl != null) {
                    surfaceOutputImpl.requestClose();
                }
                if (settableSurface.mProvider == null) {
                    settableSurface.mCompleter.setCancelled();
                }
                settableSurface.mProvider = null;
                break;
        }
    }
}
