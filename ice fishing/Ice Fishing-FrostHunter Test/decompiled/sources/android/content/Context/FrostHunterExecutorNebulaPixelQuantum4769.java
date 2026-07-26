package android.content.Context;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import com.adjust.sdk.Constants;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterExecutorNebulaPixelQuantum4769 extends Surface {
    public static boolean FrostHunterFragmentBetaMegaVortex6025;
    public static int FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterCameraSelectorPrimeEpicMax8292 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterExecutorNebulaPixelQuantum4769(FrostHunterCameraSelectorPrimeEpicMax8292 frostHunterCameraSelectorPrimeEpicMax8292, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterCameraSelectorPrimeEpicMax8292;
        this.FrostHunterCameraXPixelTurboCosmos9814 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: FrostHunterButtonRogueQuantum5741 -> 0x0040, TRY_LEAVE, TryCatch #0 {FrostHunterButtonRogueQuantum5741 -> 0x0040, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:11:0x0034, B:19:0x001f, B:22:0x002c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        boolean FrostHunterDialogFragmentTurboPhoenixDragon7627;
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterVectorDrawableForceMax1351.FrostHunterDialogFragmentTurboPhoenixDragon7627("EGL_EXT_protected_content");
                if (FrostHunterDialogFragmentTurboPhoenixDragon7627) {
                    return 0;
                }
                return FrostHunterVectorDrawableForceMax1351.FrostHunterDialogFragmentTurboPhoenixDragon7627("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            FrostHunterDialogFragmentTurboPhoenixDragon7627 = false;
            if (FrostHunterDialogFragmentTurboPhoenixDragon7627) {
            }
        } catch (FrostHunterButtonRogueQuantum5741 e) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context) {
        boolean z;
        synchronized (FrostHunterExecutorNebulaPixelQuantum4769.class) {
            try {
                if (!FrostHunterFragmentBetaMegaVortex6025) {
                    FrostHunterKeyframeGammaGamma1197 = FrostHunterAlphaAnimationNeoCosmos5761(context);
                    FrostHunterFragmentBetaMegaVortex6025 = true;
                }
                z = FrostHunterKeyframeGammaGamma1197 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.FrostHunterFlowMaxDragonHero5809) {
            try {
                if (!this.FrostHunterAlertDialogAuroraDelta3200) {
                    FrostHunterCameraSelectorPrimeEpicMax8292 frostHunterCameraSelectorPrimeEpicMax8292 = this.FrostHunterFlowMaxDragonHero5809;
                    frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFlowMaxDragonHero5809.getClass();
                    frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFlowMaxDragonHero5809.sendEmptyMessage(2);
                    this.FrostHunterAlertDialogAuroraDelta3200 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
