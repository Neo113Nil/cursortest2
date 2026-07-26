package android.content.Context;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterThreadTitanRogue1362 implements FrostHunterVectorDrawableLegendBeta8243 {
    public final /* synthetic */ long FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterThreadTitanRogue1362(long j, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
    }

    @Override // android.content.Context.FrostHunterVectorDrawableLegendBeta8243
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.FrostHunterCameraXPixelTurboCosmos9814));
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = this.FrostHunterFlowMaxDragonHero5809;
        String str = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterBundlePulseFusionHero2475;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
