package android.content.Context;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProGuardPhantomHyperSpeed8214 implements FrostHunterCanvasLegendSolar5588 {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterBottomSheetEclipseUltraShadow6009 FrostHunterBundlePulseFusionHero2475;
    public FrostHunterCardViewHyperionAurora3829 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterHandlerThreadFusionOmegaHero7374 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public ThreadPoolExecutor FrostHunterLevelListDrawableFusionDragonHero2232;
    public Handler FrostHunterLifecycleBlazeGammaElite2889;
    public ThreadPoolExecutor FrostHunterRemoteConfigSpeedSpeed8566;
    public final Object FrostHunterServiceEliteCelestialThunder1757 = new Object();

    public FrostHunterProGuardPhantomHyperSpeed8214(Context context, FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374) {
        FrostHunterExecutorSolarPhoenix3849.FrostHunterAlertDialogAuroraDelta3200(context, "Context cannot be null");
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context.getApplicationContext();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterHandlerThreadFusionOmegaHero7374;
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterDrawableCosmosSpeedSolar8235.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterCanvasLegendSolar5588
    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCardViewHyperionAurora3829 frostHunterCardViewHyperionAurora3829) {
        synchronized (this.FrostHunterServiceEliteCelestialThunder1757) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterCardViewHyperionAurora3829;
        }
        synchronized (this.FrostHunterServiceEliteCelestialThunder1757) {
            try {
                if (this.FrostHunterCameraXPixelTurboCosmos9814 == null) {
                    return;
                }
                if (this.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new FrostHunterInterpolatorVortexOlympian7007("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.FrostHunterRemoteConfigSpeedSpeed8566 = threadPoolExecutor;
                    this.FrostHunterLevelListDrawableFusionDragonHero2232 = threadPoolExecutor;
                }
                this.FrostHunterLevelListDrawableFusionDragonHero2232.execute(new FrostHunterFilterAlphaSparkSpeed9857(17, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final FrostHunterPreviewHyperionMegaInferno5813 FrostHunterBundlePulseFusionHero2475() {
        try {
            FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009 = this.FrostHunterBundlePulseFusionHero2475;
            Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterBottomSheetEclipseUltraShadow6009.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{frostHunterHandlerThreadFusionOmegaHero7374}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLayerNebulaNebulaEclipse5699.FrostHunterAlphaAnimationNeoCosmos5761(context, Collections.unmodifiableList(arrayList));
            int i = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809;
            if (i != 0) {
                throw new RuntimeException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("fetchFonts failed (", i, ")"));
            }
            FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr = (FrostHunterPreviewHyperionMegaInferno5813[]) ((List) FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200).get(0);
            if (frostHunterPreviewHyperionMegaInferno5813Arr == null || frostHunterPreviewHyperionMegaInferno5813Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return frostHunterPreviewHyperionMegaInferno5813Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        synchronized (this.FrostHunterServiceEliteCelestialThunder1757) {
            try {
                this.FrostHunterCameraXPixelTurboCosmos9814 = null;
                Handler handler = this.FrostHunterLifecycleBlazeGammaElite2889;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.FrostHunterLifecycleBlazeGammaElite2889 = null;
                ThreadPoolExecutor threadPoolExecutor = this.FrostHunterRemoteConfigSpeedSpeed8566;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = null;
                this.FrostHunterRemoteConfigSpeedSpeed8566 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
