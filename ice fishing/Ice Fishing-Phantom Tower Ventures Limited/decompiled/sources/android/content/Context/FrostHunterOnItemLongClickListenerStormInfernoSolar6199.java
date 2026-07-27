package android.content.Context;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterOnItemLongClickListenerStormInfernoSolar6199 implements FrostHunterVectorDrawableLegendBeta8243, FrostHunterProcessCameraProviderMegaMasterStrike3921 {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ long FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterOnItemLongClickListenerStormInfernoSolar6199(long j, Object obj, Object obj2) {
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
    }

    @Override // android.content.Context.FrostHunterProcessCameraProviderMegaMasterStrike3921
    public Object FrostHunterBundlePulseFusionHero2475() {
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = (FrostHunterDelaySolarEclipse1769) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = frostHunterDelaySolarEclipse1769.FrostHunterBundlePulseFusionHero2475;
        long FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterDelaySolarEclipse1769.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterModelInputOutputTitanHyperion7556.getClass();
        frostHunterModelInputOutputTitanHyperion7556.FrostHunterLevelListDrawableFusionDragonHero2232(new FrostHunterThreadTitanRogue1362(FrostHunterAlphaAnimationNeoCosmos5761, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350));
        return null;
    }

    @Override // android.content.Context.FrostHunterVectorDrawableLegendBeta8243
    public Object apply(Object obj) {
        String str = (String) this.FrostHunterFlowMaxDragonHero5809;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((FrostHunterFirebaseModelInterpreterPrimeMegaFusion4372) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
