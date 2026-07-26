package android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterLaunchAuroraNebula2731 implements FrostHunterTransformForceCelestial8458, FrostHunterProcessCameraProviderMegaMasterStrike3921 {
    public final /* synthetic */ long FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterLaunchAuroraNebula2731(FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769, Iterable iterable, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, long j) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDelaySolarEclipse1769;
        this.FrostHunterFragmentBetaMegaVortex6025 = iterable;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
    }

    @Override // android.content.Context.FrostHunterTransformForceCelestial8458
    public ScheduledFuture FrostHunterAlphaAnimationNeoCosmos5761(final FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        long j = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj2 = this.FrostHunterFragmentBetaMegaVortex6025;
        final FrostHunterContentResolverPulsePixel6161 frostHunterContentResolverPulsePixel6161 = (FrostHunterContentResolverPulsePixel6161) this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return frostHunterContentResolverPulsePixel6161.FrostHunterFlowMaxDragonHero5809.schedule(new FrostHunterBarcodeScannerMasterUltraEpic9895(frostHunterContentResolverPulsePixel6161, (Runnable) obj2, frostHunterSQLiteMasterUltra9956, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return frostHunterContentResolverPulsePixel6161.FrostHunterFlowMaxDragonHero5809.schedule(new Callable() { // from class: android.content.Context.FrostHunterCombineBetaOlympianSolar6102
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return FrostHunterContentResolverPulsePixel6161.this.FrostHunterCameraXPixelTurboCosmos9814.submit(new FrostHunterDialogQuantumTurbo8340(15, callable, frostHunterSQLiteMasterUltra9956));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override // android.content.Context.FrostHunterProcessCameraProviderMegaMasterStrike3921
    public Object FrostHunterBundlePulseFusionHero2475() {
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = (FrostHunterDelaySolarEclipse1769) this.FrostHunterFlowMaxDragonHero5809;
        Iterable iterable = (Iterable) this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = frostHunterDelaySolarEclipse1769.FrostHunterBundlePulseFusionHero2475;
        frostHunterModelInputOutputTitanHyperion7556.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(FrostHunterModelInputOutputTitanHyperion7556.FrostHunterKeyframeGammaGamma1197(iterable));
            SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
            try {
                FrostHunterAlphaAnimationNeoCosmos5761.compileStatement(concat).execute();
                Cursor rawQuery = FrostHunterAlphaAnimationNeoCosmos5761.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        frostHunterModelInputOutputTitanHyperion7556.FrostHunterFlowMaxDragonHero5809(rawQuery.getInt(0), FrostHunterFirebaseModelInterpreterPrimeMegaFusion4372.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                FrostHunterAlphaAnimationNeoCosmos5761.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
            } finally {
                FrostHunterAlphaAnimationNeoCosmos5761.endTransaction();
            }
        }
        frostHunterModelInputOutputTitanHyperion7556.FrostHunterLevelListDrawableFusionDragonHero2232(new FrostHunterThreadTitanRogue1362(frostHunterDelaySolarEclipse1769.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterAlertDialogAuroraDelta3200, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350));
        return null;
    }

    public /* synthetic */ FrostHunterLaunchAuroraNebula2731(FrostHunterContentResolverPulsePixel6161 frostHunterContentResolverPulsePixel6161, Object obj, long j, TimeUnit timeUnit, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterContentResolverPulsePixel6161;
        this.FrostHunterFragmentBetaMegaVortex6025 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
        this.FrostHunterKeyframeGammaGamma1197 = timeUnit;
    }
}
