package android.content.Context;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterRippleDrawableMaxElite5227 implements FrostHunterDataBindingSparkMasterPixel1556, OnGoogleAdIdReadListener, FrostHunterApplicationInfoHeroForceSpark2431, FrostHunterNotificationHyperMax8505, FrostHunterLocationManagerEpicAlphaQuantum9711, FrostHunterBillingClientHyperForceDragon3339, FrostHunterLayoutInflaterNebulaVision6522, FrostHunterProcessCameraProviderMegaMasterStrike3921 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterRippleDrawableMaxElite5227(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
    public void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) obj).FrostHunterScaleAnimationStrikeSpark5059 = (FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868) obj2;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = (FrostHunterWindowManagerMasterOmegaGamma7106) obj2;
                FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper6407 = (FrostHunterTextRecognitionMaxHeroHyper6407) obj;
                frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterLooperHyperionForce4133 += frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterMeteringPointBetaCyber9571 += frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterLifecycleBlazeGammaElite2889;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterAlertDialogAuroraDelta3200((List) obj2);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterLooperHyperionForce4133((FrostHunterSharedPreferencesPixelOlympianCyber8894) obj2);
                break;
            case 9:
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterMotionSceneAuroraMega2271((FrostHunterItemDecorationSparkFusionCelestial5742) obj2);
                break;
            case 10:
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterLooperHyperionForce4133(((FrostHunterProcessCameraProviderQuantumNovaXHyperion4894) obj2).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterPermissionInfoAlphaDelta6279);
                break;
            case 11:
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterDatabaseEliteShadowUltra2452((FrostHunterDialogFragmentTitaniumEpicMega8033) obj2);
                break;
        }
    }

    @Override // android.content.Context.FrostHunterProcessCameraProviderMegaMasterStrike3921
    public Object FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 22:
                FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = ((FrostHunterDelaySolarEclipse1769) obj).FrostHunterFlowMaxDragonHero5809;
                SQLiteDatabase FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.beginTransaction();
                try {
                    FrostHunterAlphaAnimationNeoCosmos5761.compileStatement("DELETE FROM log_event_dropped").execute();
                    FrostHunterAlphaAnimationNeoCosmos5761.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + frostHunterModelInputOutputTitanHyperion7556.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761()).execute();
                    FrostHunterAlphaAnimationNeoCosmos5761.setTransactionSuccessful();
                    return null;
                } finally {
                    FrostHunterAlphaAnimationNeoCosmos5761.endTransaction();
                }
            default:
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) obj;
                Iterator it = ((Iterable) ((FrostHunterModelInputOutputTitanHyperion7556) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200).FrostHunterLevelListDrawableFusionDragonHero2232(new FrostHunterMaterialCardViewShadowBlazeBlaze3823(16))).iterator();
                while (it.hasNext()) {
                    ((FrostHunterTraceHyperionAuroraNebula9947) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197).FrostHunterBitmapTurboDeltaNebula8743((FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // android.content.Context.FrostHunterBillingClientHyperForceDragon3339
    public long FrostHunterCameraXPixelTurboCosmos9814(long j) {
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814((j * r8.FrostHunterLifecycleBlazeGammaElite2889) / 1000000, 0L, ((FrostHunterCoordinatorLayoutVortexMaster5256) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200 - 1);
    }

    @Override // android.content.Context.FrostHunterDataBindingSparkMasterPixel1556
    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        ((FrostHunterCombineLegendMegaPrime5473) ((FrostHunterChipSpectraInfernoVortex8090) this.FrostHunterFlowMaxDragonHero5809).getValue()).FrostHunterAlphaAnimationNeoCosmos5761(obj);
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(long j, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 16:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterScaleAnimationStrikeSpark5059(j, frostHunterLicensingSpectraPulse8868, ((FrostHunterBarrierNebulaAlphaHyper6207) obj).FrostHunterTranslateAnimationCyberSolarUltra7101);
                break;
            case 19:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterScaleAnimationStrikeSpark5059(j, frostHunterLicensingSpectraPulse8868, ((FrostHunterDisplayMetricsPixelInferno9405) obj).FrostHunterBundlePulseFusionHero2475);
                break;
            default:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(j, frostHunterLicensingSpectraPulse8868, ((FrostHunterDisplayMetricsPixelInferno9405) obj).FrostHunterBundlePulseFusionHero2475);
                break;
        }
    }

    public FrostHunterLayoutInflaterVisionAuroraPulse9221 FrostHunterLifecycleBlazeGammaElite2889(FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947) {
        FrostHunterBroadcastReceiverHeroPixel3373 frostHunterBroadcastReceiverHeroPixel3373 = (FrostHunterBroadcastReceiverHeroPixel3373) this.FrostHunterFlowMaxDragonHero5809;
        URL url = (URL) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809;
        if (Log.isLoggable(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(frostHunterBroadcastReceiverHeroPixel3373.FrostHunterRemoteConfigSpeedSpeed8566);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = frostHunterBroadcastReceiverHeroPixel3373.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterZoomStateHyperShadow5963 frostHunterZoomStateHyperShadow5963 = (FrostHunterZoomStateHyperShadow5963) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    FrostHunterCombineStrikeGammaHero8887 frostHunterCombineStrikeGammaHero8887 = (FrostHunterCombineStrikeGammaHero8887) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterItemDecorationNovaXHero4428 frostHunterItemDecorationNovaXHero4428 = new FrostHunterItemDecorationNovaXHero4428(bufferedWriter, frostHunterCombineStrikeGammaHero8887.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterCombineStrikeGammaHero8887.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterCombineStrikeGammaHero8887.FrostHunterBundlePulseFusionHero2475, frostHunterCombineStrikeGammaHero8887.FrostHunterServiceEliteCelestialThunder1757);
                    frostHunterItemDecorationNovaXHero4428.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterZoomStateHyperShadow5963);
                    frostHunterItemDecorationNovaXHero4428.FrostHunterCameraXPixelTurboCosmos9814();
                    frostHunterItemDecorationNovaXHero4428.FrostHunterConstraintSetCloneMasterUltraRogue2633.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", valueOf);
                    }
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterResourcesTitanHyperVision5823("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterResourcesTitanHyperVision5823("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new FrostHunterLayoutInflaterVisionAuroraPulse9221(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new FrostHunterLayoutInflaterVisionAuroraPulse9221(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            FrostHunterLayoutInflaterVisionAuroraPulse9221 frostHunterLayoutInflaterVisionAuroraPulse9221 = new FrostHunterLayoutInflaterVisionAuroraPulse9221(responseCode, null, FrostHunterTypefaceDragonShadowFusion9374.FrostHunterAlphaAnimationNeoCosmos5761(new BufferedReader(new InputStreamReader(gZIPInputStream))).FrostHunterAlphaAnimationNeoCosmos5761);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return frostHunterLayoutInflaterVisionAuroraPulse9221;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (FrostHunterOnItemLongClickListenerPhoenixShadowDelta1361 | IOException unused) {
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("CctTransportBackend");
            return new FrostHunterLayoutInflaterVisionAuroraPulse9221(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("CctTransportBackend");
            return new FrostHunterLayoutInflaterVisionAuroraPulse9221(500, null, 0L);
        }
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566() {
        FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574 = (FrostHunterFontFamilyNeoBetaEpic8574) this.FrostHunterFlowMaxDragonHero5809;
        synchronized (FrostHunterProfilerUltraCyber8296.FrostHunterBundlePulseFusionHero2475) {
            List list = FrostHunterProfilerUltraCyber8296.FrostHunterCameraXPixelTurboCosmos9814;
            list.getClass();
            ArrayList arrayList = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(list));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, frostHunterFontFamilyNeoBetaEpic8574)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            FrostHunterProfilerUltraCyber8296.FrostHunterCameraXPixelTurboCosmos9814 = arrayList;
        }
    }

    @Override // android.content.Context.FrostHunterNotificationHyperMax8505
    public FrostHunterBitmapNeoCosmos7205 FrostHunterServiceEliteCelestialThunder1757(int i, FrostHunterJobSchedulerPixelAurora5672 frostHunterJobSchedulerPixelAurora5672, int[] iArr) {
        FrostHunterCanvasTitanShadow6265 frostHunterCanvasTitanShadow6265 = (FrostHunterCanvasTitanShadow6265) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        for (int i2 = 0; i2 < frostHunterJobSchedulerPixelAurora5672.FrostHunterAlphaAnimationNeoCosmos5761; i2++) {
            FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterDrawableUltraNova1814(i, frostHunterJobSchedulerPixelAurora5672, i2, frostHunterCanvasTitanShadow6265, iArr[i2]));
        }
        return FrostHunterAlertDialogAuroraDelta3200.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    @Override // android.content.Context.FrostHunterLocationManagerEpicAlphaQuantum9711
    public void FrostHunterTextViewDragonStormMega4297(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 14:
                frostHunterGradientDrawablePrimeSpectraUltra1716.getClass();
                ((FrostHunterMapLegendNova8356) obj).FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterSoundPoolThunderHeroNovaX7106(frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLevelListDrawableFusionDragonHero2232(), frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterCameraXPixelTurboCosmos9814()));
                break;
            case 24:
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterCameraXTurboCelestialHero5430((Intent) obj);
                break;
            case 25:
                ((FrostHunterObjectAnimatorBetaOlympian2287) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // android.content.Context.FrostHunterLayoutInflaterNebulaVision6522
    public void accept(Object obj) {
        ((FrostHunterTextureViewBlazePhantomDragon5593) this.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633((FrostHunterWindowManagerInfernoOlympianVortex6395) obj);
    }

    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    public void onGoogleAdIdRead(String str) {
        ((FrostHunterPagingDataAuroraSpark1825) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761(str);
    }

    public /* synthetic */ FrostHunterRippleDrawableMaxElite5227(FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos2019, Object obj, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }
}
