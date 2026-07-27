package android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.os.SystemClock;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMagnetometerInfernoDragon1607 implements FrostHunterViewOlympianCyberAlpha8933, FrostHunterNotificationManagerNovaXBetaRogue6078, FrostHunterAudioManagerPixelThunderHero8184, FrostHunterAnimatorAlphaBetaNeo3591, FrostHunterAsyncTaskPhantomFusionCelestial9115, FrostHunterDialogTurboCyber9116 {
    public static FrostHunterMagnetometerInfernoDragon1607 FrostHunterCameraXPixelTurboCosmos9814;

    public /* synthetic */ FrostHunterMagnetometerInfernoDragon1607(Object obj) {
    }

    public static Typeface FrostHunterCameraXTurboCelestialHero5430(String str, FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        if (i == 0 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterBillingClientRogueThunder4597, FrostHunterBillingClientRogueThunder4597.FrostHunterFragmentBetaMegaVortex6025) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int FrostHunterResourcesTitanHyperVision5823 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterResourcesTitanHyperVision5823(frostHunterBillingClientRogueThunder4597, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(FrostHunterResourcesTitanHyperVision5823) : Typeface.create(str, FrostHunterResourcesTitanHyperVision5823);
    }

    public static ArrayList FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FrostHunterFragmentManagerShadowForceCyber6887) obj) != FrostHunterFragmentManagerShadowForceCyber6887.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((FrostHunterFragmentManagerShadowForceCyber6887) obj2).FrostHunterCameraXPixelTurboCosmos9814);
        }
        return arrayList2;
    }

    public static final String FrostHunterLightSensorForceFusion4241(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836, FrostHunterBarrierStrikeDragonOlympian9836[] frostHunterBarrierStrikeDragonOlympian9836Arr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian98362 = FrostHunterPaintFlagsDrawFilterMaxNovaXStorm2020.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int FrostHunterServiceEliteCelestialThunder1757 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757();
        int i5 = 0;
        while (i5 < FrostHunterServiceEliteCelestialThunder1757) {
            int i6 = (i5 + FrostHunterServiceEliteCelestialThunder1757) / 2;
            while (i6 > -1 && frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte FrostHunterFlowMaxDragonHero5809 = frostHunterBarrierStrikeDragonOlympian9836Arr[i10].FrostHunterFlowMaxDragonHero5809(i11);
                    byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i13 = FrostHunterFlowMaxDragonHero5809 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte FrostHunterFlowMaxDragonHero58092 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(i7 + i12);
                byte[] bArr2 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
                i4 = i3 - (FrostHunterFlowMaxDragonHero58092 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (frostHunterBarrierStrikeDragonOlympian9836Arr[i10].FrostHunterServiceEliteCelestialThunder1757() != i11) {
                    z2 = z;
                } else {
                    if (i10 == frostHunterBarrierStrikeDragonOlympian9836Arr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int FrostHunterServiceEliteCelestialThunder17572 = frostHunterBarrierStrikeDragonOlympian9836Arr[i10].FrostHunterServiceEliteCelestialThunder1757() - i11;
                    int length = frostHunterBarrierStrikeDragonOlympian9836Arr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        FrostHunterServiceEliteCelestialThunder17572 += frostHunterBarrierStrikeDragonOlympian9836Arr[i15].FrostHunterServiceEliteCelestialThunder1757();
                    }
                    if (FrostHunterServiceEliteCelestialThunder17572 >= i14) {
                        if (FrostHunterServiceEliteCelestialThunder17572 <= i14) {
                            return frostHunterBarrierStrikeDragonOlympian9836.FrostHunterScaleAnimationStrikeSpark5059(i7, i9 + i7).FrostHunterLightSensorForceFusion4241(FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            FrostHunterServiceEliteCelestialThunder1757 = i6;
        }
        return null;
    }

    public static byte[] FrostHunterLintTitanVortexQuantum9911(List list) {
        list.getClass();
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        ArrayList FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(list);
        int size = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.size();
        int i = 0;
        while (i < size) {
            Object obj = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(i);
            i++;
            String str = (String) obj;
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterTranslateAnimationCyberSolarUltra7101(str.length());
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFCMDeltaQuantumHero8364(str);
        }
        return frostHunterMergeSpeedHyperionBlaze4246.FrostHunterTextViewDragonStormMega4297(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809);
    }

    public static final float FrostHunterScaleAnimationStrikeSpark5059(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static void FrostHunterTextViewDragonStormMega4297(JSONObject jSONObject, FrostHunterMapLegendNova8356 frostHunterMapLegendNova8356) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            next.getClass();
            Object frostHunterApplicationInfoEclipseInferno4685 = opt instanceof JSONObject ? new FrostHunterApplicationInfoEclipseInferno4685((JSONObject) opt) : new FrostHunterCoordinatorLayoutNovaQuantum9436(opt, next);
            frostHunterMapLegendNova8356.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterApplicationInfoEclipseInferno4685);
            if (frostHunterApplicationInfoEclipseInferno4685 instanceof FrostHunterApplicationInfoEclipseInferno4685) {
                FrostHunterTextViewDragonStormMega4297(((FrostHunterApplicationInfoEclipseInferno4685) frostHunterApplicationInfoEclipseInferno4685).FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMapLegendNova8356);
            }
        }
    }

    @Override // android.content.Context.FrostHunterAudioManagerPixelThunderHero8184
    public boolean FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan2560) {
        FrostHunterSharedFlowBlazeBetaMax6002 frostHunterSharedFlowBlazeBetaMax6002 = frostHunterGestureDetectorForceTitan2560.FrostHunterAlphaAnimationNeoCosmos5761;
        if ((frostHunterSharedFlowBlazeBetaMax6002 instanceof FrostHunterClipDrawableDeltaSparkCyber8446 ? ((FrostHunterClipDrawableDeltaSparkCyber8446) frostHunterSharedFlowBlazeBetaMax6002).FrostHunterAlphaAnimationNeoCosmos5761 : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        FrostHunterSharedFlowBlazeBetaMax6002 frostHunterSharedFlowBlazeBetaMax60022 = frostHunterGestureDetectorForceTitan2560.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return (frostHunterSharedFlowBlazeBetaMax60022 instanceof FrostHunterClipDrawableDeltaSparkCyber8446 ? ((FrostHunterClipDrawableDeltaSparkCyber8446) frostHunterSharedFlowBlazeBetaMax60022).FrostHunterAlphaAnimationNeoCosmos5761 : Integer.MAX_VALUE) > 100;
    }

    @Override // android.content.Context.FrostHunterAudioManagerPixelThunderHero8184
    public boolean FrostHunterCameraXPixelTurboCosmos9814() {
        boolean z;
        synchronized (FrostHunterManifestTitanUltra8375.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                int i = FrostHunterManifestTitanUltra8375.FrostHunterBundlePulseFusionHero2475;
                FrostHunterManifestTitanUltra8375.FrostHunterBundlePulseFusionHero2475 = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > FrostHunterManifestTitanUltra8375.FrostHunterServiceEliteCelestialThunder1757 + 30000) {
                    FrostHunterManifestTitanUltra8375.FrostHunterBundlePulseFusionHero2475 = 0;
                    FrostHunterManifestTitanUltra8375.FrostHunterServiceEliteCelestialThunder1757 = SystemClock.uptimeMillis();
                    String[] list = FrostHunterManifestTitanUltra8375.FrostHunterConstraintSetCloneMasterUltraRogue2633.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    FrostHunterManifestTitanUltra8375.FrostHunterLifecycleBlazeGammaElite2889 = list.length < 800;
                }
                z = FrostHunterManifestTitanUltra8375.FrostHunterLifecycleBlazeGammaElite2889;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.Context.FrostHunterViewOlympianCyberAlpha8933
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterCameraXPixelTurboCosmos9814(str, "Unsupported MIME type: ");
        return 0;
    }

    @Override // android.content.Context.FrostHunterDialogTurboCyber9116
    public long FrostHunterFlowMaxDragonHero5809(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393) {
        return -1L;
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public FrostHunterIntentServiceBetaPhoenixSolar4672 FrostHunterFragmentBetaMegaVortex6025(int i, int i2) {
        return new FrostHunterNestedScrollViewEclipseDragonQuantum1685();
    }

    @Override // android.content.Context.FrostHunterAsyncTaskPhantomFusionCelestial9115
    public Typeface FrostHunterKeyframeGammaGamma1197(FrostHunterTextWatcherNovaForceTitan1238 frostHunterTextWatcherNovaForceTitan1238, FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        String str;
        frostHunterTextWatcherNovaForceTitan1238.getClass();
        int i2 = frostHunterBillingClientRogueThunder4597.FrostHunterCameraXPixelTurboCosmos9814 / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface FrostHunterCameraXTurboCelestialHero5430 = FrostHunterCameraXTurboCelestialHero5430(str, frostHunterBillingClientRogueThunder4597, i);
            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterCameraXTurboCelestialHero5430, Typeface.create(Typeface.DEFAULT, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterResourcesTitanHyperVision5823(frostHunterBillingClientRogueThunder4597, i))) && !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterCameraXTurboCelestialHero5430, FrostHunterCameraXTurboCelestialHero5430(null, frostHunterBillingClientRogueThunder4597, i))) {
                typeface = FrostHunterCameraXTurboCelestialHero5430;
            }
        }
        return typeface == null ? FrostHunterCameraXTurboCelestialHero5430("sans-serif", frostHunterBillingClientRogueThunder4597, i) : typeface;
    }

    @Override // android.content.Context.FrostHunterViewOlympianCyberAlpha8933
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // android.content.Context.FrostHunterAsyncTaskPhantomFusionCelestial9115
    public Typeface FrostHunterLifecycleBlazeGammaElite2889(FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        return FrostHunterCameraXTurboCelestialHero5430(null, frostHunterBillingClientRogueThunder4597, i);
    }

    public void FrostHunterResourcesTitanHyperVision5823(List list, FrostHunterImageCaptureSolarPhantomMaster9123 frostHunterImageCaptureSolarPhantomMaster9123) {
        frostHunterImageCaptureSolarPhantomMaster9123.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FrostHunterMotionEventSparkPixelNebula7600 frostHunterMotionEventSparkPixelNebula7600 = (FrostHunterMotionEventSparkPixelNebula7600) it.next();
            frostHunterMotionEventSparkPixelNebula7600.getClass();
            frostHunterImageCaptureSolarPhantomMaster9123.FrostHunterAlphaAnimationNeoCosmos5761.put(frostHunterMotionEventSparkPixelNebula7600.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMotionEventSparkPixelNebula7600.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.Context.FrostHunterViewOlympianCyberAlpha8933
    public FrostHunterActionBarHyperMax6338 FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        char c;
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        List list = frostHunterFirebaseOlympianMax4818.FrostHunterCameraXTurboCelestialHero5430;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    FrostHunterR8GammaHeroMaster6087 frostHunterR8GammaHeroMaster6087 = new FrostHunterR8GammaHeroMaster6087();
                    FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868((byte[]) list.get(0));
                    int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                    int FrostHunterBillingClientFusionVortex90082 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                    Paint paint = new Paint();
                    frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814 = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    frostHunterR8GammaHeroMaster6087.FrostHunterFlowMaxDragonHero5809 = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    frostHunterR8GammaHeroMaster6087.FrostHunterAlertDialogAuroraDelta3200 = new Canvas();
                    frostHunterR8GammaHeroMaster6087.FrostHunterKeyframeGammaGamma1197 = new FrostHunterMotionSceneTitaniumNovaX1599(719, 575, 0, 719, 0, 575);
                    frostHunterR8GammaHeroMaster6087.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterTranslateAnimationPrimeBlaze7089(0, new int[]{0, -1, -16777216, -8421505}, FrostHunterR8GammaHeroMaster6087.FrostHunterBundlePulseFusionHero2475(), FrostHunterR8GammaHeroMaster6087.FrostHunterServiceEliteCelestialThunder1757());
                    frostHunterR8GammaHeroMaster6087.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterStrictModeCosmosSparkDragon8471(FrostHunterBillingClientFusionVortex9008, FrostHunterBillingClientFusionVortex90082);
                    return frostHunterR8GammaHeroMaster6087;
                case 1:
                    return new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(14);
                case 2:
                    return new FrostHunterFontFamilyEliteGammaAlpha1326(1);
                case 3:
                    return new FrostHunterProximitySensorEpicSolar3138(7);
                case 4:
                    return new FrostHunterPaintGammaFusion4669(list);
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    return new FrostHunterRoomEntityRogueLegendElite4551(list);
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    return new FrostHunterAdMobStormSpectraUltra3563(list);
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    return new FrostHunterMotionLayoutOlympianDragon6952();
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    return new FrostHunterRotateAnimationSpeedOlympianGamma8444();
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterCameraXPixelTurboCosmos9814(str, "Unsupported MIME type: ");
        return null;
    }

    @Override // android.content.Context.FrostHunterDialogTurboCyber9116
    public FrostHunterGeocoderHyperionTitan2118 FrostHunterServiceEliteCelestialThunder1757() {
        return new FrostHunterMenuMasterVortex6568(-9223372036854775807L);
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterBundlePulseFusionHero2475() {
    }

    @Override // android.content.Context.FrostHunterDialogTurboCyber9116
    public void FrostHunterAlertDialogAuroraDelta3200(long j) {
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterGeocoderHyperionTitan2118 frostHunterGeocoderHyperionTitan2118) {
    }
}
