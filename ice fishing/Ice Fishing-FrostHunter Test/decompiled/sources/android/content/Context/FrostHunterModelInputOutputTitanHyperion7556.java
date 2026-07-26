package android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterModelInputOutputTitanHyperion7556 implements Closeable {
    public static final FrostHunterWindowManagerPrimeHeroMaster3405 FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterWindowManagerPrimeHeroMaster3405("proto");
    public final FrostHunterActivityInfoStrikeCelestial6878 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterBroadcastBetaHyper4060 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterActivityInfoStrikeCelestial6878 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterClipboardManagerMegaRogue2930 FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterFlipAnimationInfernoVisionForce3014 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterModelInputOutputTitanHyperion7556(FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial6878, FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial68782, FrostHunterFlipAnimationInfernoVisionForce3014 frostHunterFlipAnimationInfernoVisionForce3014, FrostHunterBroadcastBetaHyper4060 frostHunterBroadcastBetaHyper4060, FrostHunterClipboardManagerMegaRogue2930 frostHunterClipboardManagerMegaRogue2930) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBroadcastBetaHyper4060;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterActivityInfoStrikeCelestial6878;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterActivityInfoStrikeCelestial68782;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFlipAnimationInfernoVisionForce3014;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterClipboardManagerMegaRogue2930;
    }

    public static Object FrostHunterFragmentBetaMegaVortex6025(Cursor cursor, FrostHunterVectorDrawableLegendBeta8243 frostHunterVectorDrawableLegendBeta8243) {
        try {
            return frostHunterVectorDrawableLegendBeta8243.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String FrostHunterKeyframeGammaGamma1197(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((FrostHunterDialogMasterEliteAurora9450) it.next()).FrostHunterAlphaAnimationNeoCosmos5761);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Long FrostHunterServiceEliteCelestialThunder1757(SQLiteDatabase sQLiteDatabase, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761, String.valueOf(FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterBundlePulseFusionHero2475))));
        byte[] bArr = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final Object FrostHunterAlertDialogAuroraDelta3200(FrostHunterProcessCameraProviderMegaMasterStrike3921 frostHunterProcessCameraProviderMegaMasterStrike3921) {
        SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial6878 = this.FrostHunterAlertDialogAuroraDelta3200;
        long FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterActivityInfoStrikeCelestial6878.FrostHunterAlphaAnimationNeoCosmos5761();
        while (true) {
            try {
                FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
                try {
                    Object FrostHunterBundlePulseFusionHero2475 = frostHunterProcessCameraProviderMegaMasterStrike3921.FrostHunterBundlePulseFusionHero2475();
                    FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
                    return FrostHunterBundlePulseFusionHero2475;
                } finally {
                    FrostHunterAlphaAnimationNeoCosmos5761.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (frostHunterActivityInfoStrikeCelestial6878.FrostHunterAlphaAnimationNeoCosmos5761() >= this.FrostHunterKeyframeGammaGamma1197.FrostHunterBundlePulseFusionHero2475 + FrostHunterAlphaAnimationNeoCosmos57612) {
                    throw new FrostHunterFirebaseModelInterpreterHyperShadow5056("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterBroadcastBetaHyper4060 frostHunterBroadcastBetaHyper4060 = this.FrostHunterCameraXPixelTurboCosmos9814;
        Objects.requireNonNull(frostHunterBroadcastBetaHyper4060);
        FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial6878 = this.FrostHunterAlertDialogAuroraDelta3200;
        long FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterActivityInfoStrikeCelestial6878.FrostHunterAlphaAnimationNeoCosmos5761();
        while (true) {
            try {
                return frostHunterBroadcastBetaHyper4060.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (frostHunterActivityInfoStrikeCelestial6878.FrostHunterAlphaAnimationNeoCosmos5761() >= this.FrostHunterKeyframeGammaGamma1197.FrostHunterBundlePulseFusionHero2475 + FrostHunterAlphaAnimationNeoCosmos5761) {
                    throw new FrostHunterFirebaseModelInterpreterHyperShadow5056("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList FrostHunterCameraXPixelTurboCosmos9814(SQLiteDatabase sQLiteDatabase, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, int i) {
        ArrayList arrayList = new ArrayList();
        Long FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(sQLiteDatabase, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350);
        if (FrostHunterServiceEliteCelestialThunder1757 == null) {
            return arrayList;
        }
        FrostHunterFragmentBetaMegaVortex6025(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{FrostHunterServiceEliteCelestialThunder1757.toString()}, null, null, null, String.valueOf(i)), new FrostHunterZoomStateAlphaGamma5769(this, (Object) arrayList, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, 3));
        return arrayList;
    }

    public final void FrostHunterFlowMaxDragonHero5809(long j, FrostHunterFirebaseModelInterpreterPrimeMegaFusion4372 frostHunterFirebaseModelInterpreterPrimeMegaFusion4372, String str) {
        FrostHunterLevelListDrawableFusionDragonHero2232(new FrostHunterOnItemLongClickListenerStormInfernoSolar6199(j, str, frostHunterFirebaseModelInterpreterPrimeMegaFusion4372));
    }

    public final Object FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterVectorDrawableLegendBeta8243 frostHunterVectorDrawableLegendBeta8243) {
        SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
        try {
            Object apply = frostHunterVectorDrawableLegendBeta8243.apply(FrostHunterAlphaAnimationNeoCosmos5761);
            FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
            return apply;
        } finally {
            FrostHunterAlphaAnimationNeoCosmos5761.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }
}
