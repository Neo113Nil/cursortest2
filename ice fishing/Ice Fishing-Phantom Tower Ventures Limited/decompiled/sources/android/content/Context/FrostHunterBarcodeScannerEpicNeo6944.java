package android.content.Context;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterBarcodeScannerEpicNeo6944 implements Runnable {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ FrostHunterDelaySolarEclipse1769 FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Runnable FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterBarcodeScannerEpicNeo6944(FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, int i, Runnable runnable) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDelaySolarEclipse1769;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterKeyframeGammaGamma1197 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = this.FrostHunterFlowMaxDragonHero5809;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Runnable runnable = this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = frostHunterDelaySolarEclipse1769.FrostHunterLevelListDrawableFusionDragonHero2232;
        try {
            try {
                FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion75562 = frostHunterDelaySolarEclipse1769.FrostHunterBundlePulseFusionHero2475;
                Objects.requireNonNull(frostHunterModelInputOutputTitanHyperion75562);
                frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterApplicationInfoPhantomNovaXShadow6699(frostHunterModelInputOutputTitanHyperion75562, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) frostHunterDelaySolarEclipse1769.FrostHunterAlphaAnimationNeoCosmos5761.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterCardViewVisionNovaXSpeed5306(frostHunterDelaySolarEclipse1769, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, i));
                } else {
                    frostHunterDelaySolarEclipse1769.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, i);
                }
                runnable.run();
            } catch (FrostHunterFirebaseModelInterpreterHyperShadow5056 unused) {
                frostHunterDelaySolarEclipse1769.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBitmapTurboDeltaNebula8743(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
