package android.content.Context;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraSelectorPrimeEpicMax8292 extends HandlerThread implements Handler.Callback {
    public Error FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterLocationManagerHyperTitanium7874 FrostHunterCameraXPixelTurboCosmos9814;
    public Handler FrostHunterFlowMaxDragonHero5809;
    public FrostHunterExecutorNebulaPixelQuantum4769 FrostHunterFragmentBetaMegaVortex6025;
    public RuntimeException FrostHunterKeyframeGammaGamma1197;

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        EGLSurface eglCreatePbufferSurface;
        this.FrostHunterCameraXPixelTurboCosmos9814.getClass();
        FrostHunterLocationManagerHyperTitanium7874 frostHunterLocationManagerHyperTitanium7874 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int[] iArr = frostHunterLocationManagerHyperTitanium7874.FrostHunterFlowMaxDragonHero5809;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200 = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, FrostHunterLocationManagerHyperTitanium7874.FrostHunterLightSensorForceFusion4241, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197("eglCreateContext failed", eglCreateContext != null);
        frostHunterLocationManagerHyperTitanium7874.FrostHunterKeyframeGammaGamma1197 = eglCreateContext;
        EGLDisplay eGLDisplay = frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        FrostHunterVectorDrawableForceMax1351.FrostHunterKeyframeGammaGamma1197("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        frostHunterLocationManagerHyperTitanium7874.FrostHunterFragmentBetaMegaVortex6025 = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterKeyframeGammaGamma1197("initialCapacity", 4);
        Object[] objArr2 = new Object[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterRoomEntityCyberVision9778.FrostHunterLifecycleBlazeGammaElite2889(objArr2.length, i3);
            if (FrostHunterLifecycleBlazeGammaElite2889 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, FrostHunterLifecycleBlazeGammaElite2889);
            }
            objArr2[i2] = valueOf;
            i2 = i3;
            z2 = true;
        }
        if (z2) {
            throw new FrostHunterButtonRogueQuantum5741(sb.toString(), FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809(i2, objArr2));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        frostHunterLocationManagerHyperTitanium7874.FrostHunterServiceConnectionTurboPhoenixOmega6719 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(frostHunterLocationManagerHyperTitanium7874);
        SurfaceTexture surfaceTexture2 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        surfaceTexture2.getClass();
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterExecutorNebulaPixelQuantum4769(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterCameraXPixelTurboCosmos9814.getClass();
        FrostHunterLocationManagerHyperTitanium7874 frostHunterLocationManagerHyperTitanium7874 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLocationManagerHyperTitanium7874.FrostHunterCameraXPixelTurboCosmos9814.removeCallbacks(frostHunterLocationManagerHyperTitanium7874);
        try {
            SurfaceTexture surfaceTexture = frostHunterLocationManagerHyperTitanium7874.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, frostHunterLocationManagerHyperTitanium7874.FrostHunterFlowMaxDragonHero5809, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = frostHunterLocationManagerHyperTitanium7874.FrostHunterFragmentBetaMegaVortex6025;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200, frostHunterLocationManagerHyperTitanium7874.FrostHunterFragmentBetaMegaVortex6025);
            }
            EGLContext eGLContext = frostHunterLocationManagerHyperTitanium7874.FrostHunterKeyframeGammaGamma1197;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200);
            }
            frostHunterLocationManagerHyperTitanium7874.FrostHunterAlertDialogAuroraDelta3200 = null;
            frostHunterLocationManagerHyperTitanium7874.FrostHunterKeyframeGammaGamma1197 = null;
            frostHunterLocationManagerHyperTitanium7874.FrostHunterFragmentBetaMegaVortex6025 = null;
            frostHunterLocationManagerHyperTitanium7874.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        FrostHunterAlphaAnimationNeoCosmos5761(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (FrostHunterButtonRogueQuantum5741 e) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Failed to initialize placeholder surface", e);
                        this.FrostHunterKeyframeGammaGamma1197 = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e2) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Failed to initialize placeholder surface", e2);
                    this.FrostHunterAlertDialogAuroraDelta3200 = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Failed to initialize placeholder surface", e3);
                    this.FrostHunterKeyframeGammaGamma1197 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return true;
                } catch (Throwable th) {
                    try {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
