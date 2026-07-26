package android.content.Context;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ FrostHunterThreadSpectraShadowGamma2307 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterProcessCameraProviderQuantumNovaXHyperion4894(FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterThreadSpectraShadowGamma2307;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterThreadSpectraShadowGamma2307.FrostHunterMotionSceneAuroraMega2271(surface);
        frostHunterThreadSpectraShadowGamma2307.FrostHunterNavigationMasterMegaMax2752 = surface;
        FrostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterThreadSpectraShadowGamma2307, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterThreadSpectraShadowGamma2307.FrostHunterMotionSceneAuroraMega2271(null);
        FrostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterThreadSpectraShadowGamma2307, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        FrostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlphaAnimationNeoCosmos5761, i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        FrostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlphaAnimationNeoCosmos5761, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        FrostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlphaAnimationNeoCosmos5761, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
