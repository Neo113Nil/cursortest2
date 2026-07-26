package android.content.Context;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationManagerHyperTitanium7874 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] FrostHunterLightSensorForceFusion4241 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLDisplay FrostHunterAlertDialogAuroraDelta3200;
    public final Handler FrostHunterCameraXPixelTurboCosmos9814;
    public final int[] FrostHunterFlowMaxDragonHero5809 = new int[1];
    public EGLSurface FrostHunterFragmentBetaMegaVortex6025;
    public EGLContext FrostHunterKeyframeGammaGamma1197;
    public SurfaceTexture FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterLocationManagerHyperTitanium7874(Handler handler) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.FrostHunterCameraXPixelTurboCosmos9814.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
