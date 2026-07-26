package android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterApplicationInfoPhantomNovaXShadow6699 implements FrostHunterProcessCameraProviderMegaMasterStrike3921 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterModelInputOutputTitanHyperion7556 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterApplicationInfoPhantomNovaXShadow6699(FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterModelInputOutputTitanHyperion7556;
    }

    @Override // android.content.Context.FrostHunterProcessCameraProviderMegaMasterStrike3921
    public final Object FrostHunterBundlePulseFusionHero2475() {
        SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                frostHunterModelInputOutputTitanHyperion7556.getClass();
                int i2 = FrostHunterTextureViewPhoenixSolarAlpha5815.FrostHunterLifecycleBlazeGammaElite2889;
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(4, false);
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200 = null;
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197 = new ArrayList();
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025 = null;
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809 = "";
                HashMap hashMap = new HashMap();
                FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
                try {
                    FrostHunterTextureViewPhoenixSolarAlpha5815 frostHunterTextureViewPhoenixSolarAlpha5815 = (FrostHunterTextureViewPhoenixSolarAlpha5815) FrostHunterModelInputOutputTitanHyperion7556.FrostHunterFragmentBetaMegaVortex6025(FrostHunterAlphaAnimationNeoCosmos5761.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new FrostHunterZoomStateAlphaGamma5769(frostHunterModelInputOutputTitanHyperion7556, hashMap, frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, 5));
                    FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
                    return frostHunterTextureViewPhoenixSolarAlpha5815;
                } finally {
                }
            default:
                long FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761() - frostHunterModelInputOutputTitanHyperion7556.FrostHunterKeyframeGammaGamma1197.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(FrostHunterAlphaAnimationNeoCosmos57612)};
                    Cursor rawQuery = FrostHunterAlphaAnimationNeoCosmos5761.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            frostHunterModelInputOutputTitanHyperion7556.FrostHunterFlowMaxDragonHero5809(rawQuery.getInt(0), FrostHunterFirebaseModelInterpreterPrimeMegaFusion4372.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = FrostHunterAlphaAnimationNeoCosmos5761.delete("events", "timestamp_ms < ?", strArr);
                    FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
                    FrostHunterAlphaAnimationNeoCosmos5761.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
