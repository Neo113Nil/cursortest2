package defpackage;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* loaded from: classes.dex */
public final class fql {
    public SurfaceSyncGroup a;

    public static /* synthetic */ void a(fql fqlVar, SurfaceView surfaceView, dyg dygVar) {
        fqlVar.getClass();
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        fqlVar.a = surfaceSyncGroup;
        vq1.A(surfaceSyncGroup.add(rootSurfaceControl, new jq(5)));
        dygVar.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    public final void b() {
        SurfaceSyncGroup surfaceSyncGroup = this.a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.a = null;
        }
    }
}
