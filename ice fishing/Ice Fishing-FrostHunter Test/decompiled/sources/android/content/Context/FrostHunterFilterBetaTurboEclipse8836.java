package android.content.Context;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GlassNewActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFilterBetaTurboEclipse8836 extends FrostHunterVibratorBetaMax2177 {
    public static boolean FrostHunterApplicationInfoMasterAlpha8134;
    public static boolean FrostHunterCoroutineScopeRogueAuroraCyber7920;
    public static final int[] FrostHunterDisplayMetricsQuantumHyperion1415 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public FrostHunterLocationManagerBlazeTitanium3991 FrostHunterActionBarCosmosPhoenixDelta7435;
    public final int FrostHunterActionBarPulseSpectraSolar7310;
    public final FrostHunterIntentForceSpeed4935 FrostHunterAdapterDelegateEpicGamma1569;
    public int FrostHunterAnalyticsBetaOlympianCelestial3997;
    public final FrostHunterBroadcastAuroraDelta8701 FrostHunterAnnotationProcessorOmegaMaxHyperion8512;
    public boolean FrostHunterAudioManagerSpeedStrikeUltra5694;
    public int FrostHunterAuthAuroraNeoHyper2804;
    public int FrostHunterBroadcastQuantumPhoenix7863;
    public FrostHunterInstrumentationDragonOmega6403 FrostHunterCameraXEpicAuroraVortex6639;
    public long FrostHunterCameraXStrikeEliteGamma7858;
    public FrostHunterTransitionManagerGammaGammaEpic4966 FrostHunterChipStrikeOmega6301;
    public FrostHunterPropertyValuesHolderUltraQuantum4765 FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
    public boolean FrostHunterCombineDragonQuantum4317;
    public final FrostHunterIntentMasterMax5923 FrostHunterCombineOmegaForceLegend1540;
    public long FrostHunterDiffUtilStormBlazeEpic7048;
    public boolean FrostHunterFlowCollectorForceVisionTitanium4390;
    public long FrostHunterGradlePulseSolarDragon2616;
    public final Context FrostHunterGyroscopeSpeedDragon2744;
    public long FrostHunterInputFilterTitanVortex7790;
    public boolean FrostHunterIntentPrimeMegaHyperion7179;
    public final PriorityQueue FrostHunterKeyEventBlazeSpark2641;
    public boolean FrostHunterKotlinPixelNeo7072;
    public int FrostHunterLayerDragonForce4335;
    public int FrostHunterLifecycleCameraControllerSpeedBeta6860;
    public int FrostHunterLiveDataPulseNova5164;
    public long FrostHunterMagnetometerSolarMax9567;
    public boolean FrostHunterMapOlympianNeo8739;
    public List FrostHunterMaterialButtonVisionStrike5735;
    public FrostHunterThemeOverlayStrikeCelestial4609 FrostHunterModelInputOutputMegaHyperion7718;
    public final FrostHunterRecyclerViewSolarBlaze9121 FrostHunterOnClickListenerAuroraForce2274;
    public boolean FrostHunterOnItemClickListenerSparkLegend4271;
    public FrostHunterExecutorNebulaPixelQuantum4769 FrostHunterOnPreDrawListenerHyperionMaxUltra3396;
    public FrostHunterCoroutineSolarPixel5536 FrostHunterPagingDataThunderPhoenixGamma6126;
    public int FrostHunterRemoteModelManagerSparkDelta9937;
    public final boolean FrostHunterRewardedAdCelestialOlympian5288;
    public int FrostHunterRewardedAdStrikePrime6511;
    public int FrostHunterRippleDrawableNebulaNebula4953;
    public final boolean FrostHunterScrollViewCyberPixel8279;
    public final long FrostHunterSensorManagerUltraOmega3261;
    public final FrostHunterStorageDeltaInferno9007 FrostHunterShapeAppearanceDragonCelestialMega9459;
    public int FrostHunterSharedFlowCyberEliteNova5919;
    public FrostHunterSupervisorJobBetaMasterNeo7868 FrostHunterStateFlowDeltaNebula2162;
    public FrostHunterCoroutineSolarPixel5536 FrostHunterTextRecognitionTurboSpeedStorm6151;
    public Surface FrostHunterTransitionManagerMegaSpark4983;
    public long FrostHunterVideoCaptureNovaXOmegaOmega8222;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterFilterBetaTurboEclipse8836(FrostHunterFCMStormPulseHero6538 frostHunterFCMStormPulseHero6538) {
        super(r0.getApplicationContext(), 2, frostHunterFCMStormPulseHero6538.FrostHunterBundlePulseFusionHero2475, 30.0f);
        GlassNewActivity glassNewActivity = frostHunterFCMStormPulseHero6538.FrostHunterAlphaAnimationNeoCosmos5761;
        Context applicationContext = glassNewActivity.getApplicationContext();
        this.FrostHunterGyroscopeSpeedDragon2744 = applicationContext;
        this.FrostHunterActionBarPulseSpectraSolar7310 = frostHunterFCMStormPulseHero6538.FrostHunterRemoteConfigSpeedSpeed8566;
        this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 = null;
        this.FrostHunterShapeAppearanceDragonCelestialMega9459 = new FrostHunterStorageDeltaInferno9007(frostHunterFCMStormPulseHero6538.FrostHunterLifecycleBlazeGammaElite2889, frostHunterFCMStormPulseHero6538.FrostHunterLevelListDrawableFusionDragonHero2232, 1);
        this.FrostHunterScrollViewCyberPixel8279 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 == null;
        this.FrostHunterCombineOmegaForceLegend1540 = new FrostHunterIntentMasterMax5923(applicationContext, this, frostHunterFCMStormPulseHero6538.FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterAnnotationProcessorOmegaMaxHyperion8512 = new FrostHunterBroadcastAuroraDelta8701();
        this.FrostHunterRewardedAdCelestialOlympian5288 = "NVIDIA".equals(Build.MANUFACTURER);
        this.FrostHunterModelInputOutputMegaHyperion7718 = FrostHunterThemeOverlayStrikeCelestial4609.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterLiveDataPulseNova5164 = 1;
        this.FrostHunterBroadcastQuantumPhoenix7863 = 0;
        this.FrostHunterPagingDataThunderPhoenixGamma6126 = FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterAnalyticsBetaOlympianCelestial3997 = 0;
        this.FrostHunterTextRecognitionTurboSpeedStorm6151 = null;
        this.FrostHunterSharedFlowCyberEliteNova5919 = -1000;
        this.FrostHunterCameraXStrikeEliteGamma7858 = -9223372036854775807L;
        this.FrostHunterVideoCaptureNovaXOmegaOmega8222 = -9223372036854775807L;
        this.FrostHunterAdapterDelegateEpicGamma1569 = new FrostHunterIntentForceSpeed4935(4);
        this.FrostHunterKeyEventBlazeSpark2641 = new PriorityQueue();
        this.FrostHunterSensorManagerUltraOmega3261 = -15000L;
        this.FrostHunterOnClickListenerAuroraForce2274 = new FrostHunterRecyclerViewSolarBlaze9121();
        this.FrostHunterStateFlowDeltaNebula2162 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean FrostHunterFlipAnimationPrimeOlympian7620(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (FrostHunterFilterBetaTurboEclipse8836.class) {
            try {
                if (!FrostHunterApplicationInfoMasterAlpha8134) {
                    int i = Build.VERSION.SDK_INT;
                    char c = 28;
                    if (i <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z2 = 5;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z2 = 6;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z2 = 7;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            case true:
                            case true:
                            case true:
                            case true:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                z3 = true;
                                break;
                        }
                        FrostHunterCoroutineScopeRogueAuroraCyber7920 = z3;
                        FrostHunterApplicationInfoMasterAlpha8134 = true;
                    }
                    if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z = 8;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            default:
                                if (i <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c = '\"';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c = '#';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c = '$';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c = '%';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c = '&';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c = '\'';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c = '(';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c = ')';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c = '*';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c = '+';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c = ',';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c = '-';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c = '.';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c = '/';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c = '0';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c = '1';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c = '2';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c = '3';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c = '4';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c = '5';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c = '6';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c = '7';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c = '8';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c = '9';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c = ':';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c = ';';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c = '<';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c = '=';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c = '>';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c = '?';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c = '@';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c = 'A';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c = 'B';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c = 'C';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c = 'D';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c = 'E';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c = 'F';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c = 'G';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c = 'H';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c = 'I';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c = 'J';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c = 'K';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c = 'L';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c = 'M';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c = 'N';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c = 'O';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c = 'P';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c = 'Q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c = 'R';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c = 'S';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c = 'T';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c = 'U';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c = 'V';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c = 'W';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c = 'X';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c = 'Y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c = 'Z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c = '[';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c = '\\';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c = ']';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c = '^';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c = '_';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c = '`';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c = 'a';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c = 'b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c = 'c';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c = 'd';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c = 'e';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c = 'f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c = 'g';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c = 'h';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c = 'i';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c = 'j';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c = 'k';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c = 'l';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c = 'm';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c = 'n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c = 'o';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c = 'p';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c = 'q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c = 'r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c = 's';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c = 't';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c = 'u';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c = 'v';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c = 'w';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c = 'x';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c = 'y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c = 'z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c = '{';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c = '|';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c = '}';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c = '~';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c = 127;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c = 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c = 129;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c = 130;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c = 131;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c = 132;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c = 133;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c = 134;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c = 135;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c = 136;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c = 137;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c = 138;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c = 139;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                    }
                                }
                                break;
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            case true:
                            case true:
                            case true:
                            case true:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                break;
                        }
                        FrostHunterCoroutineScopeRogueAuroraCyber7920 = z3;
                        FrostHunterApplicationInfoMasterAlpha8134 = true;
                    }
                    z3 = true;
                    FrostHunterCoroutineScopeRogueAuroraCyber7920 = z3;
                    FrostHunterApplicationInfoMasterAlpha8134 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return FrostHunterCoroutineScopeRogueAuroraCyber7920;
    }

    public static int FrostHunterGradleOmegaVisionSpectra5961(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        int i = frostHunterFirebaseOlympianMax4818.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        List list = frostHunterFirebaseOlympianMax4818.FrostHunterCameraXTurboCelestialHero5430;
        if (i == -1) {
            return FrostHunterRecyclerViewBetaNovaX7224(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax4818);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return frostHunterFirebaseOlympianMax4818.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + i2;
    }

    public static List FrostHunterImageAnalysisPixelForceOlympian4333(Context context, FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, boolean z, boolean z2) {
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        if (str == null) {
            return FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterResourcesTitanHyperVision5823(context)) {
            String FrostHunterBundlePulseFusionHero2475 = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818);
            List FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterBundlePulseFusionHero2475 == null ? FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025 : frostHunterFlowHyperionVortexDelta5013.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero2475, z, z2);
            if (!FrostHunterConstraintSetCloneMasterUltraRogue2633.isEmpty()) {
                return FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
        }
        return FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterRecyclerViewBetaNovaX7224(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        int i = frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271;
        int i2 = frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743;
        if (i != -1 && i2 != -1) {
            String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818);
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
                    int intValue = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
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
                case 1:
                case 3:
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232)))) {
                        return ((FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i2, 16) * FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i, 16)) * 768) / 4;
                    }
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public final void FrostHunterActionBarPulseSpectraSolar7310(int i, int i2) {
        FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
        frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterCameraXPixelTurboCosmos9814 += i;
        int i3 = i + i2;
        frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterRemoteConfigSpeedSpeed8566 += i3;
        this.FrostHunterLifecycleCameraControllerSpeedBeta6860 += i3;
        int i4 = this.FrostHunterRippleDrawableNebulaNebula4953 + i3;
        this.FrostHunterRippleDrawableNebulaNebula4953 = i4;
        frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterFlowMaxDragonHero5809 = Math.max(i4, frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterFlowMaxDragonHero5809);
        int i5 = this.FrostHunterActionBarPulseSpectraSolar7310;
        if (i5 <= 0 || this.FrostHunterLifecycleCameraControllerSpeedBeta6860 < i5) {
            return;
        }
        FrostHunterLayerEpicHyperQuantum7656();
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterAnnotationProcessorSolarSpeedNebula4443() {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterTextViewDragonStormMega4297();
        } else {
            long j = this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr, long j, long j2, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960) {
        super.FrostHunterBitmapTurboDeltaNebula8743(frostHunterFirebaseOlympianMax4818Arr, j, j2, frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        FrostHunterRewardedAdCelestialOlympian5288(frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterCameraXPixelTurboCosmos9814() {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 == null) {
            FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
            if (frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 == 0) {
                frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 = 1;
                return;
            }
            return;
        }
        int i = this.FrostHunterRemoteModelManagerSparkDelta9937;
        if (i == 0 || i == 1) {
            this.FrostHunterRemoteModelManagerSparkDelta9937 = 0;
        } else {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterLooperThreadBetaHyperionMax1000();
        }
    }

    public final boolean FrostHunterCameraXPrimeTitanGamma7495(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        if (this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 != null) {
            return true;
        }
        Surface surface = this.FrostHunterTransitionManagerMegaSpark4983;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && frostHunterStorageNovaXEliteAurora3066.FrostHunterCameraXPixelTurboCosmos9814) || FrostHunterScrollViewCyberPixel8279(frostHunterStorageNovaXEliteAurora3066);
        }
        return true;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterCameraXTurboCelestialHero5430(long j, boolean z, boolean z2) {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null && !z) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterCameraXPixelTurboCosmos9814(true);
        }
        if (z2) {
            this.FrostHunterMagnetometerSolarMax9567 = j;
        }
        super.FrostHunterCameraXTurboCelestialHero5430(j, z, z2);
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47652 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
        if (frostHunterPropertyValuesHolderUltraQuantum47652 == null) {
            frostHunterIntentMasterMax5923.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            frostHunterIntentMasterMax5923.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
            frostHunterIntentMasterMax5923.FrostHunterLevelListDrawableFusionDragonHero2232 = -9223372036854775807L;
            frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 = Math.min(frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889, 1);
            frostHunterIntentMasterMax5923.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
            frostHunterIntentMasterMax5923.FrostHunterLightSensorForceFusion4241 = false;
        }
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        if (z) {
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47653 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47653 != null) {
                frostHunterPropertyValuesHolderUltraQuantum47653.FrostHunterLightSensorForceFusion4241(false);
            } else {
                frostHunterIntentMasterMax5923.FrostHunterBundlePulseFusionHero2475(false);
            }
        }
        FrostHunterObjectDetectionDeltaHyperEpic7162();
        this.FrostHunterRippleDrawableNebulaNebula4953 = 0;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterColorDrawableLegendPhoenixVision7927(Exception exc) {
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Video codec error", exc);
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, exc, 1));
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final boolean FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 == null || frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterBundlePulseFusionHero2475()) {
            return true;
        }
        try {
            return this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterFirebaseOlympianMax4818);
        } catch (FrostHunterHandlerAuroraShadowLegend3885 e) {
            throw this.FrostHunterRemoteConfigSpeedSpeed8566(e, frostHunterFirebaseOlympianMax4818, false, 7000);
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterColorStateListMegaBetaFusion7423(FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935) {
        FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterColorStateListMegaBetaFusion7423 = super.FrostHunterColorStateListMegaBetaFusion7423(frostHunterIntentForceSpeed4935);
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterFirebaseOlympianMax4818.getClass();
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, frostHunterFirebaseOlympianMax4818, FrostHunterColorStateListMegaBetaFusion7423));
        }
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        return FrostHunterColorStateListMegaBetaFusion7423;
    }

    public final void FrostHunterCombineOmegaForceLegend1540(long j) {
        FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
        frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterKeyframeGammaGamma1197 += j;
        frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterFragmentBetaMegaVortex6025++;
        this.FrostHunterDiffUtilStormBlazeEpic7048 += j;
        this.FrostHunterLayerDragonForce4335++;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291, android.content.Context.FrostHunterRoomDaoNovaXNovaX9504
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, Object obj) {
        if (i == 1) {
            FrostHunterScaleAnimationHeroStormNeo5898(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega6403 = (FrostHunterInstrumentationDragonOmega6403) obj;
            this.FrostHunterCameraXEpicAuroraVortex6639 = frostHunterInstrumentationDragonOmega6403;
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
                frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterKeyframeGammaGamma1197(frostHunterInstrumentationDragonOmega6403);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.FrostHunterAnalyticsBetaOlympianCelestial3997 != intValue) {
                this.FrostHunterAnalyticsBetaOlympianCelestial3997 = intValue;
                if (this.FrostHunterIntentPrimeMegaHyperion7179) {
                    FrostHunterAnimatorSetEliteQuantum4520();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.FrostHunterLiveDataPulseNova5164 = intValue2;
            FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
            if (frostHunterIntentSpeedCyber8582 != null) {
                frostHunterIntentSpeedCyber8582.FrostHunterKeyframeGammaGamma1197(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.FrostHunterBroadcastQuantumPhoenix7863 = intValue3;
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47652 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47652 != null) {
                frostHunterPropertyValuesHolderUltraQuantum47652.FrostHunterMotionSceneAuroraMega2271(intValue3);
                return;
            }
            FrostHunterVideoCaptureOmegaEliteShadow8763 frostHunterVideoCaptureOmegaEliteShadow8763 = this.FrostHunterCombineOmegaForceLegend1540.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterAlertDialogAuroraDelta3200 == intValue3) {
                return;
            }
            frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterAlertDialogAuroraDelta3200 = intValue3;
            frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterServiceEliteCelestialThunder1757(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(FrostHunterLicensingDeltaTitan7947.FrostHunterAlphaAnimationNeoCosmos5761)) {
                FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47653 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
                if (frostHunterPropertyValuesHolderUltraQuantum47653 == null || !frostHunterPropertyValuesHolderUltraQuantum47653.FrostHunterBundlePulseFusionHero2475()) {
                    return;
                }
                this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterCameraXTurboCelestialHero5430();
                return;
            }
            this.FrostHunterMaterialButtonVisionStrike5735 = list;
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47654 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47654 != null) {
                frostHunterPropertyValuesHolderUltraQuantum47654.FrostHunterFlowMaxDragonHero5809(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            FrostHunterThemeOverlayStrikeCelestial4609 frostHunterThemeOverlayStrikeCelestial4609 = (FrostHunterThemeOverlayStrikeCelestial4609) obj;
            if (frostHunterThemeOverlayStrikeCelestial4609.FrostHunterAlphaAnimationNeoCosmos5761 == 0 || frostHunterThemeOverlayStrikeCelestial4609.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0) {
                return;
            }
            this.FrostHunterModelInputOutputMegaHyperion7718 = frostHunterThemeOverlayStrikeCelestial4609;
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47655 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47655 != null) {
                Surface surface = this.FrostHunterTransitionManagerMegaSpark4983;
                surface.getClass();
                frostHunterPropertyValuesHolderUltraQuantum47655.FrostHunterLintTitanVortexQuantum9911(surface, frostHunterThemeOverlayStrikeCelestial4609);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.FrostHunterSharedFlowCyberEliteNova5919 = ((Integer) obj).intValue();
                FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber85822 = this.FrostHunterRemoteConfigThunderShadow4435;
                if (frostHunterIntentSpeedCyber85822 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.FrostHunterSharedFlowCyberEliteNova5919));
                    frostHunterIntentSpeedCyber85822.FrostHunterServiceEliteCelestialThunder1757(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.FrostHunterTransitionManagerMegaSpark4983;
                FrostHunterScaleAnimationHeroStormNeo5898(null);
                obj.getClass();
                ((FrostHunterFilterBetaTurboEclipse8836) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633(1, surface2);
                break;
            case 18:
                boolean z = this.FrostHunterStateFlowDeltaNebula2162 != null;
                FrostHunterSupervisorJobBetaMasterNeo7868 frostHunterSupervisorJobBetaMasterNeo7868 = (FrostHunterSupervisorJobBetaMasterNeo7868) obj;
                this.FrostHunterStateFlowDeltaNebula2162 = frostHunterSupervisorJobBetaMasterNeo7868;
                if (z != (frostHunterSupervisorJobBetaMasterNeo7868 != null)) {
                    FrostHunterBannerAdNebulaMasterBeta4389(this.FrostHunterPushNotificationStormTitanGamma8999);
                    break;
                }
                break;
            default:
                super.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, obj);
                break;
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final boolean FrostHunterCoordinatorLayoutDragonHyperionSolar9277() {
        FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
        if (this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 != null && frostHunterStorageNovaXEliteAurora3066 != null) {
            String str = frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.FrostHunterCoordinatorLayoutDragonHyperionSolar9277();
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterDatabaseEliteShadowUltra2452(float f, float f2) {
        super.FrostHunterDatabaseEliteShadowUltra2452(f, f2);
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterDialogFragmentTurboPhoenixDragon7627(f);
        } else {
            this.FrostHunterCombineOmegaForceLegend1540.FrostHunterCameraXPixelTurboCosmos9814(f);
        }
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterBundlePulseFusionHero2475(f);
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = this.FrostHunterDialogFragmentTurboPhoenixDragon7627;
        if (frostHunterAnimatedVectorDrawableMasterHeroHyper6960 != null) {
            FrostHunterRewardedAdCelestialOlympian5288(frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final boolean FrostHunterDrawableCompatHeroMasterSpectra7412() {
        boolean z;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterPushNotificationStormTitanGamma8999;
        long j = this.FrostHunterVideoCaptureNovaXOmegaOmega8222;
        if (j != -9223372036854775807L) {
            if (this.FrostHunterLayoutLegendDelta7410 + 1 + j <= Long.MAX_VALUE - (this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterBundlePulseFusionHero2475 + j)) {
                z = false;
                return this.FrostHunterStateFlowDeltaNebula2162 == null || this.FrostHunterFlowCollectorForceVisionTitanium4390 || this.FrostHunterIntentPrimeMegaHyperion7179 || (frostHunterFirebaseOlympianMax4818 != null && frostHunterFirebaseOlympianMax4818.FrostHunterLintTitanVortexQuantum9911 > 0) || z || this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterLevelListDrawableFusionDragonHero2232 != -9223372036854775807L;
            }
        }
        z = true;
        if (this.FrostHunterStateFlowDeltaNebula2162 == null) {
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        this.FrostHunterTextRecognitionTurboSpeedStorm6151 = null;
        this.FrostHunterVideoCaptureNovaXOmegaOmega8222 = -9223372036854775807L;
        FrostHunterObjectDetectionDeltaHyperEpic7162();
        this.FrostHunterAudioManagerSpeedStrikeUltra5694 = false;
        this.FrostHunterActionBarCosmosPhoenixDelta7435 = null;
        this.FrostHunterFlowCollectorForceVisionTitanium4390 = true;
        int i = 2;
        try {
            super.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
            FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
            frostHunterStorageDeltaInferno9007.getClass();
            synchronized (frostHunterWindowManagerMasterOmegaGamma7106) {
            }
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterGroupForceGamma7771(i, frostHunterStorageDeltaInferno9007, frostHunterWindowManagerMasterOmegaGamma7106));
            }
            frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757);
        } catch (Throwable th) {
            FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma71062 = this.FrostHunterFlipAnimationPrimeOlympian7620;
            frostHunterStorageDeltaInferno9007.getClass();
            synchronized (frostHunterWindowManagerMasterOmegaGamma71062) {
                Handler handler2 = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
                if (handler2 != null) {
                    handler2.post(new FrostHunterGroupForceGamma7771(i, frostHunterStorageDeltaInferno9007, frostHunterWindowManagerMasterOmegaGamma71062));
                }
                frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757);
                throw th;
            }
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final boolean FrostHunterGyroscopeOmegaEclipseOlympian7225(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        return FrostHunterCameraXPrimeTitanGamma7495(frostHunterStorageNovaXEliteAurora3066);
    }

    public final boolean FrostHunterGyroscopeSpeedDragon2744(long j, long j2, boolean z, boolean z2) {
        if (this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 != null && this.FrostHunterScrollViewCyberPixel8279) {
            j2 -= -this.FrostHunterCameraXStrikeEliteGamma7858;
        }
        if (j < -500000 && !z) {
            FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            frostHunterOnItemLongClickListenerNovaXTitan1242.getClass();
            int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterOnItemLongClickListenerNovaXTitan1242.FrostHunterRemoteConfigSpeedSpeed8566(j2 - this.FrostHunterCameraXTurboCelestialHero5430);
            if (FrostHunterRemoteConfigSpeedSpeed8566 != 0) {
                this.FrostHunterMagnetometerSolarMax9567 = j2;
                FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
                PriorityQueue priorityQueue = this.FrostHunterKeyEventBlazeSpark2641;
                if (z2) {
                    int i = frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterServiceEliteCelestialThunder1757 + FrostHunterRemoteConfigSpeedSpeed8566;
                    frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterServiceEliteCelestialThunder1757 = i;
                    frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterLevelListDrawableFusionDragonHero2232 += this.FrostHunterRewardedAdStrikePrime6511;
                    frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterServiceEliteCelestialThunder1757 = priorityQueue.size() + i;
                } else {
                    frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterAlertDialogAuroraDelta3200++;
                    FrostHunterActionBarPulseSpectraSolar7310(priorityQueue.size() + FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterRewardedAdStrikePrime6511);
                }
                if (this.FrostHunterRemoteConfigThunderShadow4435 != null) {
                    if (FrostHunterCoordinatorLayoutDragonHyperionSolar9277()) {
                        FrostHunterAnimatorSetEliteQuantum4520();
                        FrostHunterPreviewBlazeAurora1020();
                    } else if (FrostHunterDrawableCompatHeroMasterSpectra7412()) {
                        FrostHunterFCMDeltaQuantumHero8364();
                    } else {
                        this.FrostHunterCameraXPrimeTitanGamma7495 = true;
                    }
                }
                FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
                if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
                    frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterCameraXPixelTurboCosmos9814(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterInAppPurchaseLegendEpicDragon4579(long j) {
        super.FrostHunterInAppPurchaseLegendEpicDragon4579(j);
        if (this.FrostHunterIntentPrimeMegaHyperion7179) {
            return;
        }
        this.FrostHunterRewardedAdStrikePrime6511--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r2 = ((android.content.Context.FrostHunterPagingDeltaMegaSpeed3833) r3.get(r7)).FrostHunterConstraintSetCloneMasterUltraRogue2633.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterItemDecorationPhoenixAlphaVortex8006(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        boolean z;
        ByteBuffer byteBuffer;
        FrostHunterMLKitLegendPhoenix3950 frostHunterMLKitLegendPhoenix3950;
        FrostHunterTextWatcherNovaXStormRogue9640 frostHunterTextWatcherNovaXStormRogue9640;
        boolean z2 = false;
        if (!FrostHunterLayoutLegendDelta7410(frostHunterAsyncTaskPrimeGammaTitan9007)) {
            boolean z3 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241 < this.FrostHunterResourcesTitanHyperVision5823;
            FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
            if (frostHunterRecyclerViewSolarBlaze9121 != null) {
                long j = frostHunterRecyclerViewSolarBlaze9121.FrostHunterAlphaAnimationNeoCosmos5761 == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * frostHunterRecyclerViewSolarBlaze9121.FrostHunterBundlePulseFusionHero2475) + frostHunterRecyclerViewSolarBlaze9121.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                if (j != -9223372036854775807L && j < this.FrostHunterSensorManagerUltraOmega3261) {
                    z = true;
                    if ((!z3 || z) && !frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(268435456)) {
                        if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(67108864)) {
                            FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAdapterDelegateEpicGamma1569;
                            if (frostHunterIntentForceSpeed4935 != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
                                FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
                                frostHunterStorageNovaXEliteAurora3066.getClass();
                                if (frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals("video/av01") && (byteBuffer = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025) != null) {
                                    boolean z4 = z3 || this.FrostHunterAuthAuroraNeoHyper2804 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        frostHunterIntentForceSpeed4935.FrostHunterMeteringPointBetaCyber9571(FrostHunterPaintCyberPulse5979.FrostHunterPagingSourceEclipseDelta8255(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList FrostHunterPagingSourceEclipseDelta8255 = FrostHunterPaintCyberPulse5979.FrostHunterPagingSourceEclipseDelta8255(asReadOnlyBuffer);
                                    frostHunterIntentForceSpeed4935.FrostHunterMeteringPointBetaCyber9571(FrostHunterPagingSourceEclipseDelta8255);
                                    int size = FrostHunterPagingSourceEclipseDelta8255.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        FrostHunterPagingDeltaMegaSpeed3833 frostHunterPagingDeltaMegaSpeed3833 = (FrostHunterPagingDeltaMegaSpeed3833) FrostHunterPagingSourceEclipseDelta8255.get(size);
                                        int i2 = frostHunterPagingDeltaMegaSpeed3833.FrostHunterAlphaAnimationNeoCosmos5761;
                                        if (i2 != 2 && i2 != 15) {
                                            if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (frostHunterMLKitLegendPhoenix3950 = (FrostHunterMLKitLegendPhoenix3950) frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200) == null)) {
                                                break;
                                            }
                                            try {
                                                frostHunterTextWatcherNovaXStormRogue9640 = new FrostHunterTextWatcherNovaXStormRogue9640(frostHunterMLKitLegendPhoenix3950, frostHunterPagingDeltaMegaSpeed3833);
                                            } catch (FrostHunterBillingClientAlphaNeo2174 unused) {
                                                frostHunterTextWatcherNovaXStormRogue9640 = null;
                                            }
                                            if (frostHunterTextWatcherNovaXStormRogue9640 != null) {
                                                if (frostHunterTextWatcherNovaXStormRogue9640.FrostHunterFlowMaxDragonHero5809) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((FrostHunterPagingDeltaMegaSpeed3833) FrostHunterPagingSourceEclipseDelta8255.get(size)).FrostHunterAlphaAnimationNeoCosmos5761 == 6 || ((FrostHunterPagingDeltaMegaSpeed3833) FrostHunterPagingSourceEclipseDelta8255.get(size)).FrostHunterAlphaAnimationNeoCosmos5761 == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        FrostHunterTransitionManagerGammaGammaEpic4966 frostHunterTransitionManagerGammaGammaEpic4966 = this.FrostHunterChipStrikeOmega6301;
                                        frostHunterTransitionManagerGammaGammaEpic4966.getClass();
                                        if (frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterBundlePulseFusionHero2475 + limit < asReadOnlyBuffer.capacity() && !frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1073741824)) {
                                            ByteBuffer byteBuffer3 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (z3) {
                                    this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterServiceEliteCelestialThunder1757++;
                                } else {
                                    this.FrostHunterKeyEventBlazeSpark2641.add(Long.valueOf(frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241));
                                    this.FrostHunterAuthAuroraNeoHyper2804++;
                                }
                            }
                            return z2;
                        }
                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                        z2 = true;
                        if (z2) {
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(67108864)) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final String FrostHunterKeyframeGammaGamma1197() {
        return "MediaCodecVideoRenderer";
    }

    public final void FrostHunterLayerEpicHyperQuantum7656() {
        if (this.FrostHunterLifecycleCameraControllerSpeedBeta6860 > 0) {
            this.FrostHunterLightSensorForceFusion4241.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.FrostHunterGradlePulseSolarDragon2616;
            int i = this.FrostHunterLifecycleCameraControllerSpeedBeta6860;
            FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, i, j));
            }
            this.FrostHunterLifecycleCameraControllerSpeedBeta6860 = 0;
            this.FrostHunterGradlePulseSolarDragon2616 = elapsedRealtime;
        }
    }

    public final boolean FrostHunterLayoutLegendDelta7410(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        if (FrostHunterFragmentBetaMegaVortex6025() || frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(536870912)) {
            return true;
        }
        long j = this.FrostHunterVideoCaptureNovaXOmegaOmega8222;
        return j == -9223372036854775807L || j - (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241 - this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterBundlePulseFusionHero2475) <= 100000;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterLintTitanVortexQuantum9911(boolean z, boolean z2) {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765;
        this.FrostHunterFlipAnimationPrimeOlympian7620 = new FrostHunterWindowManagerMasterOmegaGamma7106();
        FrostHunterResourcesOmegaOlympianOlympian5268 frostHunterResourcesOmegaOlympianOlympian5268 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterResourcesOmegaOlympianOlympian5268.getClass();
        boolean z3 = frostHunterResourcesOmegaOlympianOlympian5268.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955((z3 && this.FrostHunterAnalyticsBetaOlympianCelestial3997 == 0) ? false : true);
        if (this.FrostHunterIntentPrimeMegaHyperion7179 != z3) {
            this.FrostHunterIntentPrimeMegaHyperion7179 = z3;
            FrostHunterAnimatorSetEliteQuantum4520();
        }
        FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, frostHunterWindowManagerMasterOmegaGamma7106, 5));
        }
        boolean z4 = this.FrostHunterCombineDragonQuantum4317;
        FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
        if (!z4) {
            if (this.FrostHunterMaterialButtonVisionStrike5735 != null && this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 == null) {
                FrostHunterCanvasInfernoHyper8213 frostHunterCanvasInfernoHyper8213 = new FrostHunterCanvasInfernoHyper8213(this.FrostHunterGyroscopeSpeedDragon2744, frostHunterIntentMasterMax5923);
                frostHunterCanvasInfernoHyper8213.FrostHunterServiceEliteCelestialThunder1757 = true;
                long j = this.FrostHunterSensorManagerUltraOmega3261;
                frostHunterCanvasInfernoHyper8213.FrostHunterRemoteConfigSpeedSpeed8566 = j != -9223372036854775807L ? -j : -9223372036854775807L;
                FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837 = this.FrostHunterLightSensorForceFusion4241;
                frostHunterAssetManagerQuantumRogue9837.getClass();
                frostHunterCanvasInfernoHyper8213.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterAssetManagerQuantumRogue9837;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterCanvasInfernoHyper8213.FrostHunterLevelListDrawableFusionDragonHero2232);
                if (frostHunterCanvasInfernoHyper8213.FrostHunterBundlePulseFusionHero2475 == null) {
                    frostHunterCanvasInfernoHyper8213.FrostHunterBundlePulseFusionHero2475 = new FrostHunterTransitionEclipseStorm6044();
                }
                FrostHunterKaptEpicUltraRogue2371 frostHunterKaptEpicUltraRogue2371 = new FrostHunterKaptEpicUltraRogue2371(frostHunterCanvasInfernoHyper8213);
                frostHunterCanvasInfernoHyper8213.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
                if (1 >= frostHunterKaptEpicUltraRogue2371.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                    frostHunterKaptEpicUltraRogue2371.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1;
                }
                SparseArray sparseArray = frostHunterKaptEpicUltraRogue2371.FrostHunterBundlePulseFusionHero2475;
                if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterFlowMaxDragonHero5809(sparseArray, 0)) {
                    frostHunterPropertyValuesHolderUltraQuantum4765 = (FrostHunterPropertyValuesHolderUltraQuantum4765) sparseArray.get(0);
                } else {
                    FrostHunterRotateAnimationGammaRogue2916 frostHunterRotateAnimationGammaRogue2916 = new FrostHunterRotateAnimationGammaRogue2916(frostHunterKaptEpicUltraRogue2371, frostHunterKaptEpicUltraRogue2371.FrostHunterAlphaAnimationNeoCosmos5761);
                    frostHunterKaptEpicUltraRogue2371.FrostHunterRemoteConfigSpeedSpeed8566.add(frostHunterRotateAnimationGammaRogue2916);
                    sparseArray.put(0, frostHunterRotateAnimationGammaRogue2916);
                    frostHunterPropertyValuesHolderUltraQuantum4765 = frostHunterRotateAnimationGammaRogue2916;
                }
                this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 = frostHunterPropertyValuesHolderUltraQuantum4765;
            }
            this.FrostHunterCombineDragonQuantum4317 = true;
        }
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47652 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum47652 == null) {
            FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue98372 = this.FrostHunterLightSensorForceFusion4241;
            frostHunterAssetManagerQuantumRogue98372.getClass();
            frostHunterIntentMasterMax5923.FrostHunterFragmentBetaMegaVortex6025 = frostHunterAssetManagerQuantumRogue98372;
            frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889(!z2 ? 1 : 0);
            return;
        }
        frostHunterPropertyValuesHolderUltraQuantum47652.FrostHunterBitmapTurboDeltaNebula8743(new FrostHunterResourcePulseCyberGamma6737(this));
        FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega6403 = this.FrostHunterCameraXEpicAuroraVortex6639;
        if (frostHunterInstrumentationDragonOmega6403 != null) {
            this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterKeyframeGammaGamma1197(frostHunterInstrumentationDragonOmega6403);
        }
        if (this.FrostHunterTransitionManagerMegaSpark4983 != null && !this.FrostHunterModelInputOutputMegaHyperion7718.equals(FrostHunterThemeOverlayStrikeCelestial4609.FrostHunterBundlePulseFusionHero2475)) {
            this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterLintTitanVortexQuantum9911(this.FrostHunterTransitionManagerMegaSpark4983, this.FrostHunterModelInputOutputMegaHyperion7718);
        }
        this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterMotionSceneAuroraMega2271(this.FrostHunterBroadcastQuantumPhoenix7863);
        this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterTransitionListenerPulseVortexCosmos7949);
        List list = this.FrostHunterMaterialButtonVisionStrike5735;
        if (list != null) {
            this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterFlowMaxDragonHero5809(list);
        }
        this.FrostHunterRemoteModelManagerSparkDelta9937 = !z2 ? 1 : 0;
        this.FrostHunterMotionSceneHeroShadow5987 = true;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterLiveDataBetaLegend3442(String str, long j, long j2) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            str2 = str;
            handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, str2, j, j2));
        } else {
            str2 = str;
        }
        this.FrostHunterMapOlympianNeo8739 = FrostHunterFlipAnimationPrimeOlympian7620(str2);
        FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
        frostHunterStorageNovaXEliteAurora3066.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = frostHunterStorageNovaXEliteAurora3066.FrostHunterServiceEliteCelestialThunder1757;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.FrostHunterOnItemClickListenerSparkLegend4271 = z;
        FrostHunterObjectDetectionDeltaHyperEpic7162();
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterLooperThreadBetaHyperionMax1000() {
        this.FrostHunterLifecycleCameraControllerSpeedBeta6860 = 0;
        this.FrostHunterLightSensorForceFusion4241.getClass();
        this.FrostHunterGradlePulseSolarDragon2616 = SystemClock.elapsedRealtime();
        this.FrostHunterDiffUtilStormBlazeEpic7048 = 0L;
        this.FrostHunterLayerDragonForce4335 = 0;
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        } else {
            this.FrostHunterCombineOmegaForceLegend1540.FrostHunterServiceEliteCelestialThunder1757();
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177, android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterMeteringPointBetaCyber9571(long j, long j2) {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            try {
                frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterFragmentBetaMegaVortex6025(j, j2);
            } catch (FrostHunterHandlerAuroraShadowLegend3885 e) {
                throw FrostHunterRemoteConfigSpeedSpeed8566(e, e.FrostHunterCameraXPixelTurboCosmos9814, false, 7001);
            }
        }
        super.FrostHunterMeteringPointBetaCyber9571(j, j2);
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final boolean FrostHunterMeteringPointMegaCyber7955(long j) {
        if (this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 == -9223372036854775807L || j < this.FrostHunterMagnetometerSolarMax9567) {
            return false;
        }
        long j2 = this.FrostHunterImageAnalysisPixelForceOlympian4333;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterMotionSceneAuroraMega2271() {
        FrostHunterLayerEpicHyperQuantum7656();
        int i = this.FrostHunterLayerDragonForce4335;
        if (i != 0) {
            long j = this.FrostHunterDiffUtilStormBlazeEpic7048;
            FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, j, i));
            }
            this.FrostHunterDiffUtilStormBlazeEpic7048 = 0L;
            this.FrostHunterLayerDragonForce4335 = 0;
        }
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterAlertDialogAuroraDelta3200();
        } else {
            FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
            frostHunterIntentMasterMax5923.FrostHunterServiceEliteCelestialThunder1757 = false;
            frostHunterIntentMasterMax5923.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
            FrostHunterVideoCaptureOmegaEliteShadow8763 frostHunterVideoCaptureOmegaEliteShadow8763 = frostHunterIntentMasterMax5923.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterServiceEliteCelestialThunder1757 = false;
            FrostHunterOnItemLongClickListenerOlympianCyberMaster1447 frostHunterOnItemLongClickListenerOlympianCyberMaster1447 = frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterOnItemLongClickListenerOlympianCyberMaster1447 != null) {
                frostHunterOnItemLongClickListenerOlympianCyberMaster1447.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            frostHunterVideoCaptureOmegaEliteShadow8763.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface FrostHunterMotionSceneHeroShadow5987(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        boolean z;
        FrostHunterCameraSelectorPrimeEpicMax8292 frostHunterCameraSelectorPrimeEpicMax8292;
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            return frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterLifecycleBlazeGammaElite2889();
        }
        Surface surface = this.FrostHunterTransitionManagerMegaSpark4983;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && frostHunterStorageNovaXEliteAurora3066.FrostHunterCameraXPixelTurboCosmos9814) {
            return null;
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(FrostHunterScrollViewCyberPixel8279(frostHunterStorageNovaXEliteAurora3066));
        FrostHunterExecutorNebulaPixelQuantum4769 frostHunterExecutorNebulaPixelQuantum4769 = this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396;
        if (frostHunterExecutorNebulaPixelQuantum4769 != null && frostHunterExecutorNebulaPixelQuantum4769.FrostHunterCameraXPixelTurboCosmos9814 != frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232 && frostHunterExecutorNebulaPixelQuantum4769 != null) {
            frostHunterExecutorNebulaPixelQuantum4769.release();
            this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396 = null;
        }
        if (this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396 == null) {
            Context context = this.FrostHunterGyroscopeSpeedDragon2744;
            boolean z2 = frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232;
            boolean z3 = false;
            if (!z2) {
                int i = FrostHunterExecutorNebulaPixelQuantum4769.FrostHunterKeyframeGammaGamma1197;
            } else if (!FrostHunterExecutorNebulaPixelQuantum4769.FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                z = false;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z);
                frostHunterCameraSelectorPrimeEpicMax8292 = new FrostHunterCameraSelectorPrimeEpicMax8292("ExoPlayer:PlaceholderSurface");
                int i2 = !z2 ? FrostHunterExecutorNebulaPixelQuantum4769.FrostHunterKeyframeGammaGamma1197 : 0;
                frostHunterCameraSelectorPrimeEpicMax8292.start();
                Handler handler = new Handler(frostHunterCameraSelectorPrimeEpicMax8292.getLooper(), frostHunterCameraSelectorPrimeEpicMax8292);
                frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFlowMaxDragonHero5809 = handler;
                frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterLocationManagerHyperTitanium7874(handler);
                synchronized (frostHunterCameraSelectorPrimeEpicMax8292) {
                    frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFlowMaxDragonHero5809.obtainMessage(1, i2, 0).sendToTarget();
                    while (frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFragmentBetaMegaVortex6025 == null && frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterKeyframeGammaGamma1197 == null && frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterAlertDialogAuroraDelta3200 == null) {
                        try {
                            frostHunterCameraSelectorPrimeEpicMax8292.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterKeyframeGammaGamma1197;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterAlertDialogAuroraDelta3200;
                if (error != null) {
                    throw error;
                }
                FrostHunterExecutorNebulaPixelQuantum4769 frostHunterExecutorNebulaPixelQuantum47692 = frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFragmentBetaMegaVortex6025;
                frostHunterExecutorNebulaPixelQuantum47692.getClass();
                this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396 = frostHunterExecutorNebulaPixelQuantum47692;
            }
            z = true;
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z);
            frostHunterCameraSelectorPrimeEpicMax8292 = new FrostHunterCameraSelectorPrimeEpicMax8292("ExoPlayer:PlaceholderSurface");
            if (!z2) {
            }
            frostHunterCameraSelectorPrimeEpicMax8292.start();
            Handler handler2 = new Handler(frostHunterCameraSelectorPrimeEpicMax8292.getLooper(), frostHunterCameraSelectorPrimeEpicMax8292);
            frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterFlowMaxDragonHero5809 = handler2;
            frostHunterCameraSelectorPrimeEpicMax8292.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterLocationManagerHyperTitanium7874(handler2);
            synchronized (frostHunterCameraSelectorPrimeEpicMax8292) {
            }
        }
        return this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final ArrayList FrostHunterNavigationMasterMegaMax2752(FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, boolean z) {
        boolean z2 = this.FrostHunterIntentPrimeMegaHyperion7179;
        Context context = this.FrostHunterGyroscopeSpeedDragon2744;
        List FrostHunterImageAnalysisPixelForceOlympian4333 = FrostHunterImageAnalysisPixelForceOlympian4333(context, frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, z, z2);
        HashMap hashMap = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterAlphaAnimationNeoCosmos5761;
        ArrayList arrayList = new ArrayList(FrostHunterImageAnalysisPixelForceOlympian4333);
        Collections.sort(arrayList, new FrostHunterGradleAlphaMasterEclipse2453(1, new FrostHunterAccelerometerNovaXEliteOmega1915(5, context, frostHunterFirebaseOlympianMax4818)));
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final boolean FrostHunterNavigationViewMasterVortexBeta1295(long j, long j2, FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        int i4;
        frostHunterIntentSpeedCyber8582.getClass();
        long j4 = j3 - this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterBundlePulseFusionHero2475;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.FrostHunterKeyEventBlazeSpark2641;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        FrostHunterActionBarPulseSpectraSolar7310(i5, 0);
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            if (!z || z2) {
                return frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterRemoteConfigSpeedSpeed8566(j3, new FrostHunterShapeAppearanceMaxHyperSpeed5840(this, frostHunterIntentSpeedCyber8582, i, j4));
            }
            FrostHunterShapeAppearanceDragonCelestialMega9459(frostHunterIntentSpeedCyber8582, i);
            return true;
        }
        int FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterCombineOmegaForceLegend1540.FrostHunterAlphaAnimationNeoCosmos5761(j3, j, j2, this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterConstraintSetCloneMasterUltraRogue2633, z, z2, this.FrostHunterAnnotationProcessorOmegaMaxHyperion8512);
        FrostHunterBroadcastAuroraDelta8701 frostHunterBroadcastAuroraDelta8701 = this.FrostHunterAnnotationProcessorOmegaMaxHyperion8512;
        FrostHunterRecyclerViewSolarBlaze9121 frostHunterRecyclerViewSolarBlaze9121 = this.FrostHunterOnClickListenerAuroraForce2274;
        if (frostHunterRecyclerViewSolarBlaze9121 != null && FrostHunterAlphaAnimationNeoCosmos5761 != 5 && FrostHunterAlphaAnimationNeoCosmos5761 != 4) {
            frostHunterRecyclerViewSolarBlaze9121.FrostHunterAlphaAnimationNeoCosmos5761(j3, frostHunterBroadcastAuroraDelta8701.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
            this.FrostHunterLightSensorForceFusion4241.getClass();
            long nanoTime = System.nanoTime();
            FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega6403 = this.FrostHunterCameraXEpicAuroraVortex6639;
            if (frostHunterInstrumentationDragonOmega6403 != null) {
                frostHunterInstrumentationDragonOmega6403.FrostHunterAlphaAnimationNeoCosmos5761(j4, nanoTime, frostHunterFirebaseOlympianMax4818, this.FrostHunterConstraintSetCloneOmegaHyperion9304);
            }
            FrostHunterShapeDrawableSolarOlympian7689(frostHunterIntentSpeedCyber8582, i, nanoTime);
            FrostHunterCombineOmegaForceLegend1540(frostHunterBroadcastAuroraDelta8701.FrostHunterAlphaAnimationNeoCosmos5761);
            return true;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 == 1) {
            long j5 = frostHunterBroadcastAuroraDelta8701.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j6 = frostHunterBroadcastAuroraDelta8701.FrostHunterAlphaAnimationNeoCosmos5761;
            if (j5 == this.FrostHunterInputFilterTitanVortex7790) {
                FrostHunterShapeAppearanceDragonCelestialMega9459(frostHunterIntentSpeedCyber8582, i);
            } else {
                FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega64032 = this.FrostHunterCameraXEpicAuroraVortex6639;
                if (frostHunterInstrumentationDragonOmega64032 != null) {
                    i4 = i;
                    frostHunterInstrumentationDragonOmega64032.FrostHunterAlphaAnimationNeoCosmos5761(j4, j5, frostHunterFirebaseOlympianMax4818, this.FrostHunterConstraintSetCloneOmegaHyperion9304);
                } else {
                    i4 = i;
                }
                FrostHunterShapeDrawableSolarOlympian7689(frostHunterIntentSpeedCyber8582, i4, j5);
            }
            FrostHunterCombineOmegaForceLegend1540(j6);
            this.FrostHunterInputFilterTitanVortex7790 = j5;
            return true;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 == 2) {
            Trace.beginSection("dropVideoBuffer");
            frostHunterIntentSpeedCyber8582.FrostHunterCameraXPixelTurboCosmos9814(i);
            Trace.endSection();
            FrostHunterActionBarPulseSpectraSolar7310(0, 1);
            FrostHunterCombineOmegaForceLegend1540(frostHunterBroadcastAuroraDelta8701.FrostHunterAlphaAnimationNeoCosmos5761);
            return true;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 == 3) {
            FrostHunterShapeAppearanceDragonCelestialMega9459(frostHunterIntentSpeedCyber8582, i);
            FrostHunterCombineOmegaForceLegend1540(frostHunterBroadcastAuroraDelta8701.FrostHunterAlphaAnimationNeoCosmos5761);
            return true;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 != 4 && FrostHunterAlphaAnimationNeoCosmos5761 != 5) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(String.valueOf(FrostHunterAlphaAnimationNeoCosmos5761));
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaFormat mediaFormat) {
        int integer;
        int i;
        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
        if (frostHunterIntentSpeedCyber8582 != null) {
            frostHunterIntentSpeedCyber8582.FrostHunterKeyframeGammaGamma1197(this.FrostHunterLiveDataPulseNova5164);
        }
        if (this.FrostHunterIntentPrimeMegaHyperion7179) {
            i = frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271;
            integer = frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = frostHunterFirebaseOlympianMax4818.FrostHunterEditTextPulseHyperion1262;
        int i2 = frostHunterFirebaseOlympianMax4818.FrostHunterServiceInfoHyperionSparkMax9966;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.FrostHunterPagingDataThunderPhoenixGamma6126 = new FrostHunterCoroutineSolarPixel5536(f, i, integer);
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 == null || !this.FrostHunterKotlinPixelNeo7072) {
            this.FrostHunterCombineOmegaForceLegend1540.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFirebaseOlympianMax4818.FrostHunterMeteringPointBetaCyber9571);
        } else {
            FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperThreadBetaHyperionMax1000 = i;
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMotionSceneAuroraMega2271 = integer;
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceInfoHyperionSparkMax9966 = f;
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
            int i4 = this.FrostHunterRemoteModelManagerSparkDelta9937;
            List list = this.FrostHunterMaterialButtonVisionStrike5735;
            if (list == null) {
                FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                list = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
            }
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFirebaseOlympianMax48182, this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterConstraintSetCloneMasterUltraRogue2633, i4, list);
            this.FrostHunterRemoteModelManagerSparkDelta9937 = 2;
        }
        this.FrostHunterKotlinPixelNeo7072 = false;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterNestedScrollViewThunderNovaX6772(String str) {
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            handler.post(new FrostHunterPackageManagerQuantumPulseTurbo9360(frostHunterStorageDeltaInferno9007, str, 2));
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final int FrostHunterObjectAnimatorPhoenixSpectraThunder6218(FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        boolean z;
        int i = 0;
        if (!FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterAlertDialogAuroraDelta3200(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059)) {
            return FrostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLevelListDrawableFusionDragonHero2232(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = frostHunterFirebaseOlympianMax4818.FrostHunterResourcesTitanHyperVision5823 != null;
        Context context = this.FrostHunterGyroscopeSpeedDragon2744;
        List FrostHunterImageAnalysisPixelForceOlympian4333 = FrostHunterImageAnalysisPixelForceOlympian4333(context, frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, z2, false);
        if (z2 && FrostHunterImageAnalysisPixelForceOlympian4333.isEmpty()) {
            FrostHunterImageAnalysisPixelForceOlympian4333 = FrostHunterImageAnalysisPixelForceOlympian4333(context, frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, false, false);
        }
        if (FrostHunterImageAnalysisPixelForceOlympian4333.isEmpty()) {
            return FrostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLevelListDrawableFusionDragonHero2232(1, 0, 0, 0);
        }
        int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterPermissionInfoAlphaDelta6279;
        if (i3 != 0 && i3 != 2) {
            return FrostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLevelListDrawableFusionDragonHero2232(2, 0, 0, 0);
        }
        FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = (FrostHunterStorageNovaXEliteAurora3066) FrostHunterImageAnalysisPixelForceOlympian4333.get(0);
        boolean FrostHunterLifecycleBlazeGammaElite2889 = frostHunterStorageNovaXEliteAurora3066.FrostHunterLifecycleBlazeGammaElite2889(context, frostHunterFirebaseOlympianMax4818);
        if (!FrostHunterLifecycleBlazeGammaElite2889) {
            for (int i4 = 1; i4 < FrostHunterImageAnalysisPixelForceOlympian4333.size(); i4++) {
                FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora30662 = (FrostHunterStorageNovaXEliteAurora3066) FrostHunterImageAnalysisPixelForceOlympian4333.get(i4);
                if (frostHunterStorageNovaXEliteAurora30662.FrostHunterLifecycleBlazeGammaElite2889(context, frostHunterFirebaseOlympianMax4818)) {
                    z = false;
                    FrostHunterLifecycleBlazeGammaElite2889 = true;
                    frostHunterStorageNovaXEliteAurora3066 = frostHunterStorageNovaXEliteAurora30662;
                    break;
                }
            }
        }
        z = true;
        int i5 = FrostHunterLifecycleBlazeGammaElite2889 ? 4 : 3;
        int i6 = frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFirebaseOlympianMax4818) ? 16 : 8;
        int i7 = frostHunterStorageNovaXEliteAurora3066.FrostHunterRemoteConfigSpeedSpeed8566 ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059) && !FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterResourcesTitanHyperVision5823(context)) {
            i8 = 256;
        }
        if (FrostHunterLifecycleBlazeGammaElite2889) {
            List FrostHunterImageAnalysisPixelForceOlympian43332 = FrostHunterImageAnalysisPixelForceOlympian4333(context, frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, z2, true);
            if (!FrostHunterImageAnalysisPixelForceOlympian43332.isEmpty()) {
                HashMap hashMap = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterAlphaAnimationNeoCosmos5761;
                ArrayList arrayList = new ArrayList(FrostHunterImageAnalysisPixelForceOlympian43332);
                Collections.sort(arrayList, new FrostHunterGradleAlphaMasterEclipse2453(i2, new FrostHunterAccelerometerNovaXEliteOmega1915(5, context, frostHunterFirebaseOlympianMax4818)));
                FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora30663 = (FrostHunterStorageNovaXEliteAurora3066) arrayList.get(0);
                if (frostHunterStorageNovaXEliteAurora30663.FrostHunterLifecycleBlazeGammaElite2889(context, frostHunterFirebaseOlympianMax4818) && frostHunterStorageNovaXEliteAurora30663.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFirebaseOlympianMax4818)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    public final void FrostHunterObjectDetectionDeltaHyperEpic7162() {
        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582;
        if (this.FrostHunterIntentPrimeMegaHyperion7179 && (frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435) != null) {
            this.FrostHunterActionBarCosmosPhoenixDelta7435 = new FrostHunterLocationManagerBlazeTitanium3991(this, frostHunterIntentSpeedCyber8582);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                frostHunterIntentSpeedCyber8582.FrostHunterServiceEliteCelestialThunder1757(bundle);
            }
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final float FrostHunterPagingSourceEclipseDelta8255(float f, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr) {
        FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066;
        float f2 = -1.0f;
        for (FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 : frostHunterFirebaseOlympianMax4818Arr) {
            float f3 = frostHunterFirebaseOlympianMax48182.FrostHunterMeteringPointBetaCyber9571;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.FrostHunterStateFlowDeltaNebula2162 == null || (frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927) == null) {
            return f4;
        }
        int i = frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271;
        int i2 = frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743;
        float f5 = -3.4028235E38f;
        if (frostHunterStorageNovaXEliteAurora3066.FrostHunterFlowMaxDragonHero5809) {
            float f6 = frostHunterStorageNovaXEliteAurora3066.FrostHunterFragmentBetaMegaVortex6025;
            if (f6 != -3.4028235E38f && frostHunterStorageNovaXEliteAurora3066.FrostHunterAlertDialogAuroraDelta3200 == i && frostHunterStorageNovaXEliteAurora3066.FrostHunterKeyframeGammaGamma1197 == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!frostHunterStorageNovaXEliteAurora3066.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, 1024.0d)) {
                    float f7 = 0.0f;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (frostHunterStorageNovaXEliteAurora3066.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, f9)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                frostHunterStorageNovaXEliteAurora3066.FrostHunterFragmentBetaMegaVortex6025 = f5;
                frostHunterStorageNovaXEliteAurora3066.FrostHunterAlertDialogAuroraDelta3200 = i;
                frostHunterStorageNovaXEliteAurora3066.FrostHunterKeyframeGammaGamma1197 = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final int FrostHunterPermissionInfoAlphaDelta6279(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.FrostHunterStateFlowDeltaNebula2162 == null && !this.FrostHunterIntentPrimeMegaHyperion7179) || frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241 >= this.FrostHunterResourcesTitanHyperVision5823 || FrostHunterLayoutLegendDelta7410(frostHunterAsyncTaskPrimeGammaTitan9007)) ? 0 : 32;
        }
        return 0;
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterPlaceholderLegendForceNebula9869(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        ByteBuffer byteBuffer;
        FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAdapterDelegateEpicGamma1569;
        if (frostHunterIntentForceSpeed4935 != null) {
            FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
            frostHunterStorageNovaXEliteAurora3066.getClass();
            if (frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals("video/av01") && frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1) && (byteBuffer = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.FrostHunterAuthAuroraNeoHyper2804 = 0;
        int FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterPermissionInfoAlphaDelta6279(frostHunterAsyncTaskPrimeGammaTitan9007);
        if ((Build.VERSION.SDK_INT < 34 || (FrostHunterPermissionInfoAlphaDelta6279 & 32) == 0) && !this.FrostHunterIntentPrimeMegaHyperion7179) {
            this.FrostHunterRewardedAdStrikePrime6511++;
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterPushNotificationStormTitanGamma8999(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        if (this.FrostHunterOnItemClickListenerSparkLegend4271) {
            ByteBuffer byteBuffer = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterScaleAnimationStrikeSpark5059;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
                        frostHunterIntentSpeedCyber8582.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        frostHunterIntentSpeedCyber8582.FrostHunterServiceEliteCelestialThunder1757(bundle);
                    }
                }
            }
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterRemoteConfigThunderShadow4435(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaCrypto mediaCrypto, float f) {
        FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843;
        int i;
        FrostHunterTransitionManagerGammaGammaEpic4966 frostHunterTransitionManagerGammaGammaEpic4966;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2;
        Point point2;
        int i3;
        char c;
        boolean z;
        Pair FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int FrostHunterRecyclerViewBetaNovaX7224;
        String str = frostHunterStorageNovaXEliteAurora3066.FrostHunterBundlePulseFusionHero2475;
        FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr = this.FrostHunterLintTitanVortexQuantum9911;
        frostHunterFirebaseOlympianMax4818Arr.getClass();
        int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271;
        float f2 = frostHunterFirebaseOlympianMax4818.FrostHunterMeteringPointBetaCyber9571;
        FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion98432 = frostHunterFirebaseOlympianMax4818.FrostHunterViewPhantomNeo1634;
        int i5 = frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743;
        int FrostHunterGradleOmegaVisionSpectra5961 = FrostHunterGradleOmegaVisionSpectra5961(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax4818);
        if (frostHunterFirebaseOlympianMax4818Arr.length == 1) {
            if (FrostHunterGradleOmegaVisionSpectra5961 != -1 && (FrostHunterRecyclerViewBetaNovaX7224 = FrostHunterRecyclerViewBetaNovaX7224(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax4818)) != -1) {
                FrostHunterGradleOmegaVisionSpectra5961 = Math.min((int) (FrostHunterGradleOmegaVisionSpectra5961 * 1.5f), FrostHunterRecyclerViewBetaNovaX7224);
            }
            frostHunterTransitionManagerGammaGammaEpic4966 = new FrostHunterTransitionManagerGammaGammaEpic4966(i4, i5, FrostHunterGradleOmegaVisionSpectra5961);
            frostHunterAnimationHeroPixelHyperion9843 = frostHunterAnimationHeroPixelHyperion98432;
            i = i5;
        } else {
            int length = frostHunterFirebaseOlympianMax4818Arr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = frostHunterFirebaseOlympianMax4818Arr[i8];
                FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr2 = frostHunterFirebaseOlympianMax4818Arr;
                if (frostHunterAnimationHeroPixelHyperion98432 != null && frostHunterFirebaseOlympianMax48182.FrostHunterViewPhantomNeo1634 == null) {
                    FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax48182.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCardViewSpectraCyber7714 = frostHunterAnimationHeroPixelHyperion98432;
                    frostHunterFirebaseOlympianMax48182 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
                }
                FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax48182);
                int i9 = length;
                int i10 = frostHunterFirebaseOlympianMax48182.FrostHunterBitmapTurboDeltaNebula8743;
                if (FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterServiceEliteCelestialThunder1757 != 0) {
                    int i11 = frostHunterFirebaseOlympianMax48182.FrostHunterMotionSceneAuroraMega2271;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    FrostHunterGradleOmegaVisionSpectra5961 = Math.max(FrostHunterGradleOmegaVisionSpectra5961, FrostHunterGradleOmegaVisionSpectra5961(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax48182));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                frostHunterFirebaseOlympianMax4818Arr = frostHunterFirebaseOlympianMax4818Arr2;
            }
            if (z2) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                int i13 = z3 ? i4 : i5;
                boolean z4 = z3;
                float f3 = i13 / i12;
                int i14 = 0;
                while (i14 < 9) {
                    int i15 = FrostHunterDisplayMetricsQuantumHyperion1415[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (z4) {
                        i15 = i17;
                    }
                    if (z4) {
                        i17 = i15;
                    }
                    int i18 = i12;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = frostHunterStorageNovaXEliteAurora3066.FrostHunterServiceEliteCelestialThunder1757;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        frostHunterAnimationHeroPixelHyperion9843 = frostHunterAnimationHeroPixelHyperion98432;
                        i2 = i13;
                        point2 = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i13;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        frostHunterAnimationHeroPixelHyperion9843 = frostHunterAnimationHeroPixelHyperion98432;
                        point2 = new Point(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i15, widthAlignment) * widthAlignment, FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i17, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        i = i5;
                        if (frostHunterStorageNovaXEliteAurora3066.FrostHunterRemoteConfigSpeedSpeed8566(point2.x, point2.y, f2)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    i12 = i18;
                    frostHunterAnimationHeroPixelHyperion98432 = frostHunterAnimationHeroPixelHyperion9843;
                    i13 = i2;
                }
                frostHunterAnimationHeroPixelHyperion9843 = frostHunterAnimationHeroPixelHyperion98432;
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterLooperThreadBetaHyperionMax1000 = i6;
                    FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterMotionSceneAuroraMega2271 = i7;
                    FrostHunterGradleOmegaVisionSpectra5961 = Math.max(FrostHunterGradleOmegaVisionSpectra5961, FrostHunterRecyclerViewBetaNovaX7224(frostHunterStorageNovaXEliteAurora3066, new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos57612)));
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                frostHunterAnimationHeroPixelHyperion9843 = frostHunterAnimationHeroPixelHyperion98432;
                i = i5;
            }
            frostHunterTransitionManagerGammaGammaEpic4966 = new FrostHunterTransitionManagerGammaGammaEpic4966(i6, i7, FrostHunterGradleOmegaVisionSpectra5961);
        }
        this.FrostHunterChipStrikeOmega6301 = frostHunterTransitionManagerGammaGammaEpic4966;
        int i19 = this.FrostHunterIntentPrimeMegaHyperion7179 ? this.FrostHunterAnalyticsBetaOlympianCelestial3997 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTransitionListenerPulseVortexCosmos7949(mediaFormat, frostHunterFirebaseOlympianMax4818.FrostHunterCameraXTurboCelestialHero5430);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "rotation-degrees", frostHunterFirebaseOlympianMax4818.FrostHunterServiceInfoHyperionSparkMax9966);
        if (frostHunterAnimationHeroPixelHyperion9843 != null) {
            FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion98433 = frostHunterAnimationHeroPixelHyperion9843;
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "color-transfer", frostHunterAnimationHeroPixelHyperion98433.FrostHunterBundlePulseFusionHero2475);
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "color-standard", frostHunterAnimationHeroPixelHyperion98433.FrostHunterAlphaAnimationNeoCosmos5761);
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "color-range", frostHunterAnimationHeroPixelHyperion98433.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            byte[] bArr = frostHunterAnimationHeroPixelHyperion98433.FrostHunterServiceEliteCelestialThunder1757;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059) && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818)) != null) {
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "profile", ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue());
        }
        mediaFormat.setInteger("max-width", frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterAlphaAnimationNeoCosmos5761);
        mediaFormat.setInteger("max-height", frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterStateCelestialNovaPixel8414(mediaFormat, "max-input-size", frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterBundlePulseFusionHero2475);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.FrostHunterRewardedAdCelestialOlympian5288) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.FrostHunterSharedFlowCyberEliteNova5919));
        }
        FrostHunterBillingClientFusionVortex9008(mediaFormat);
        Surface FrostHunterMotionSceneHeroShadow5987 = FrostHunterMotionSceneHeroShadow5987(frostHunterStorageNovaXEliteAurora3066);
        if (this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 != null && !FrostHunterGyroscopeHeroAlpha1995.FrostHunterMeteringPointBetaCyber9571(this.FrostHunterGyroscopeSpeedDragon2744)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new FrostHunterCoroutineScopeSpeedSparkAlpha3670(frostHunterStorageNovaXEliteAurora3066, mediaFormat, frostHunterFirebaseOlympianMax4818, FrostHunterMotionSceneHeroShadow5987, mediaCrypto, null);
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterResourcesTitanHyperVision5823() {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 == null || !this.FrostHunterScrollViewCyberPixel8279) {
            return;
        }
        frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public final void FrostHunterRewardedAdCelestialOlympian5288(FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960) {
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterBitmapTurboDeltaNebula8743;
        if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            this.FrostHunterVideoCaptureNovaXOmegaOmega8222 = -9223372036854775807L;
            return;
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761);
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == -1) {
            this.FrostHunterVideoCaptureNovaXOmegaOmega8222 = -9223372036854775807L;
        } else {
            this.FrostHunterVideoCaptureNovaXOmegaOmega8222 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterConstraintSetCloneMasterUltraRogue2633, new FrostHunterRoomEntityFusionQuantumFusion6361(), false).FrostHunterServiceEliteCelestialThunder1757;
        }
    }

    public final void FrostHunterScaleAnimationHeroStormNeo5898(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.FrostHunterTransitionManagerMegaSpark4983;
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        if (surface2 == surface) {
            if (surface != null) {
                FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel5536 = this.FrostHunterTextRecognitionTurboSpeedStorm6151;
                if (frostHunterCoroutineSolarPixel5536 != null) {
                    frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCoroutineSolarPixel5536);
                }
                Surface surface3 = this.FrostHunterTransitionManagerMegaSpark4983;
                if (surface3 == null || !this.FrostHunterAudioManagerSpeedStrikeUltra5694 || (handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761) == null) {
                    return;
                }
                handler.post(new FrostHunterDialogFragmentAuroraOmega2719(frostHunterStorageDeltaInferno9007, surface3, SystemClock.elapsedRealtime(), 4));
                return;
            }
            return;
        }
        this.FrostHunterTransitionManagerMegaSpark4983 = surface;
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 == null) {
            frostHunterIntentMasterMax5923.FrostHunterRemoteConfigSpeedSpeed8566(surface);
        }
        this.FrostHunterAudioManagerSpeedStrikeUltra5694 = false;
        int i = this.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
        if (frostHunterIntentSpeedCyber8582 != null && this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 == null) {
            FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
            frostHunterStorageNovaXEliteAurora3066.getClass();
            if (!FrostHunterCameraXPrimeTitanGamma7495(frostHunterStorageNovaXEliteAurora3066) || this.FrostHunterMapOlympianNeo8739) {
                FrostHunterAnimatorSetEliteQuantum4520();
                FrostHunterPreviewBlazeAurora1020();
            } else {
                Surface FrostHunterMotionSceneHeroShadow5987 = FrostHunterMotionSceneHeroShadow5987(frostHunterStorageNovaXEliteAurora3066);
                if (FrostHunterMotionSceneHeroShadow5987 != null) {
                    frostHunterIntentSpeedCyber8582.FrostHunterLintTitanVortexQuantum9911(FrostHunterMotionSceneHeroShadow5987);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                        return;
                    }
                    frostHunterIntentSpeedCyber8582.FrostHunterLightSensorForceFusion4241();
                }
            }
        }
        if (surface != null) {
            FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel55362 = this.FrostHunterTextRecognitionTurboSpeedStorm6151;
            if (frostHunterCoroutineSolarPixel55362 != null) {
                frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCoroutineSolarPixel55362);
            }
        } else {
            this.FrostHunterTextRecognitionTurboSpeedStorm6151 = null;
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47652 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47652 != null) {
                frostHunterPropertyValuesHolderUltraQuantum47652.FrostHunterServiceEliteCelestialThunder1757();
            }
        }
        if (i == 2) {
            FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum47653 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
            if (frostHunterPropertyValuesHolderUltraQuantum47653 != null) {
                frostHunterPropertyValuesHolderUltraQuantum47653.FrostHunterLightSensorForceFusion4241(true);
            } else {
                frostHunterIntentMasterMax5923.FrostHunterBundlePulseFusionHero2475(true);
            }
        }
        FrostHunterObjectDetectionDeltaHyperEpic7162();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.FrostHunterViewPager2StrikePulse8790) goto L18;
     */
    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterScaleAnimationStrikeSpark5059() {
        boolean FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z = false;
        if (this.FrostHunterPagingDataTurboTitanium7332 != null) {
            if (FrostHunterFragmentBetaMegaVortex6025()) {
                FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            } else {
                FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                frostHunterOnItemLongClickListenerNovaXTitan1242.getClass();
                FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterOnItemLongClickListenerNovaXTitan1242.FrostHunterAlphaAnimationNeoCosmos5761();
            }
            if (!FrostHunterAlphaAnimationNeoCosmos5761) {
                if (!(this.FrostHunterAlphaAnimationNovaGamma6326 >= 0)) {
                    if (this.FrostHunterViewPager2StrikePulse8790 != -9223372036854775807L) {
                        this.FrostHunterLightSensorForceFusion4241.getClass();
                    }
                }
            }
            z = true;
        }
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            return frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterScaleAnimationStrikeSpark5059(z);
        }
        if (z && (this.FrostHunterRemoteConfigThunderShadow4435 == null || this.FrostHunterIntentPrimeMegaHyperion7179)) {
            return true;
        }
        return this.FrostHunterCombineOmegaForceLegend1540.FrostHunterConstraintSetCloneMasterUltraRogue2633(z);
    }

    public final boolean FrostHunterScrollViewCyberPixel8279(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        if (this.FrostHunterIntentPrimeMegaHyperion7179 || FrostHunterFlipAnimationPrimeOlympian7620(frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761)) {
            return false;
        }
        return !frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232 || FrostHunterExecutorNebulaPixelQuantum4769.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterGyroscopeSpeedDragon2744);
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        if (!this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218) {
            return false;
        }
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        return frostHunterPropertyValuesHolderUltraQuantum4765 == null || frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final void FrostHunterShapeAppearanceDragonCelestialMega9459(FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582, int i) {
        Trace.beginSection("skipVideoBuffer");
        frostHunterIntentSpeedCyber8582.FrostHunterCameraXPixelTurboCosmos9814(i);
        Trace.endSection();
        this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterLevelListDrawableFusionDragonHero2232++;
    }

    public final void FrostHunterShapeDrawableSolarOlympian7689(FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        frostHunterIntentSpeedCyber8582.FrostHunterLooperThreadBetaHyperionMax1000(i, j);
        Trace.endSection();
        this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterLifecycleBlazeGammaElite2889++;
        this.FrostHunterRippleDrawableNebulaNebula4953 = 0;
        if (this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238 == null) {
            FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel5536 = this.FrostHunterPagingDataThunderPhoenixGamma6126;
            boolean equals = frostHunterCoroutineSolarPixel5536.equals(FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757);
            FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
            if (!equals && !frostHunterCoroutineSolarPixel5536.equals(this.FrostHunterTextRecognitionTurboSpeedStorm6151)) {
                this.FrostHunterTextRecognitionTurboSpeedStorm6151 = frostHunterCoroutineSolarPixel5536;
                frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCoroutineSolarPixel5536);
            }
            FrostHunterIntentMasterMax5923 frostHunterIntentMasterMax5923 = this.FrostHunterCombineOmegaForceLegend1540;
            boolean z = frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 != 3;
            frostHunterIntentMasterMax5923.FrostHunterLifecycleBlazeGammaElite2889 = 3;
            frostHunterIntentMasterMax5923.FrostHunterFragmentBetaMegaVortex6025.getClass();
            frostHunterIntentMasterMax5923.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime());
            if (!z || (surface = this.FrostHunterTransitionManagerMegaSpark4983) == null) {
                return;
            }
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterDialogFragmentAuroraOmega2719(frostHunterStorageDeltaInferno9007, surface, SystemClock.elapsedRealtime(), 4));
            }
            this.FrostHunterAudioManagerSpeedStrikeUltra5694 = true;
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867) {
        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = this.FrostHunterShapeAppearanceDragonCelestialMega9459;
        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
        if (handler != null) {
            handler.post(new FrostHunterGroupForceGamma7771(0, frostHunterStorageDeltaInferno9007, frostHunterSoundPoolNeoEclipseDelta2867));
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final FrostHunterLevelListDrawableNeoTitan3480 FrostHunterStateCelestialNovaPixel8414(IllegalStateException illegalStateException, FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        Surface surface = this.FrostHunterTransitionManagerMegaSpark4983;
        FrostHunterActionBarNeoBeta1867 frostHunterActionBarNeoBeta1867 = new FrostHunterActionBarNeoBeta1867(illegalStateException, frostHunterStorageNovaXEliteAurora3066);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return frostHunterActionBarNeoBeta1867;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final void FrostHunterTextViewDragonStormMega4297() {
        try {
            try {
                this.FrostHunterAnimatorSetEliteQuantum4520 = false;
                FrostHunterTransformNovaBetaNovaX5251();
                FrostHunterAnimatorSetEliteQuantum4520();
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterRewardedAdMasterStrike9463;
                if (frostHunterSQLiteMasterUltra9956 != null) {
                    frostHunterSQLiteMasterUltra9956.FrostHunterEditTextPulseHyperion1262(null);
                }
                this.FrostHunterRewardedAdMasterStrike9463 = null;
            } catch (Throwable th) {
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterRewardedAdMasterStrike9463;
                if (frostHunterSQLiteMasterUltra99562 != null) {
                    frostHunterSQLiteMasterUltra99562.FrostHunterEditTextPulseHyperion1262(null);
                }
                this.FrostHunterRewardedAdMasterStrike9463 = null;
                throw th;
            }
        } finally {
            this.FrostHunterCombineDragonQuantum4317 = false;
            this.FrostHunterCameraXStrikeEliteGamma7858 = -9223372036854775807L;
            FrostHunterExecutorNebulaPixelQuantum4769 frostHunterExecutorNebulaPixelQuantum4769 = this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396;
            if (frostHunterExecutorNebulaPixelQuantum4769 != null) {
                frostHunterExecutorNebulaPixelQuantum4769.release();
                this.FrostHunterOnPreDrawListenerHyperionMaxUltra3396 = null;
            }
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182, boolean z) {
        int i;
        FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax48182);
        float f = frostHunterFirebaseOlympianMax4818.FrostHunterMeteringPointBetaCyber9571;
        float f2 = frostHunterFirebaseOlympianMax48182.FrostHunterMeteringPointBetaCyber9571;
        int i2 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterTransitionManagerGammaGammaEpic4966 frostHunterTransitionManagerGammaGammaEpic4966 = this.FrostHunterChipStrikeOmega6301;
        frostHunterTransitionManagerGammaGammaEpic4966.getClass();
        if (frostHunterFirebaseOlympianMax48182.FrostHunterMotionSceneAuroraMega2271 > frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterAlphaAnimationNeoCosmos5761 || frostHunterFirebaseOlympianMax48182.FrostHunterBitmapTurboDeltaNebula8743 > frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            i2 |= 256;
        }
        if (FrostHunterGradleOmegaVisionSpectra5961(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax48182) > frostHunterTransitionManagerGammaGammaEpic4966.FrostHunterBundlePulseFusionHero2475) {
            i2 |= 64;
        }
        if (this.FrostHunterBroadcastQuantumPhoenix7863 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232 || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new FrostHunterMagnetometerMasterMasterRogue3873(frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax48182, i3 != 0 ? 0 : FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757, i3);
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterViewModelScopeTitanRogue1970() {
        super.FrostHunterViewModelScopeTitanRogue1970();
        this.FrostHunterKeyEventBlazeSpark2641.clear();
        this.FrostHunterRewardedAdStrikePrime6511 = 0;
        this.FrostHunterAuthAuroraNeoHyper2804 = 0;
        this.FrostHunterFlowCollectorForceVisionTitanium4390 = false;
        FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAdapterDelegateEpicGamma1569;
        if (frostHunterIntentForceSpeed4935 != null) {
            frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200 = null;
            ByteBuffer byteBuffer = (ByteBuffer) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // android.content.Context.FrostHunterVibratorBetaMax2177
    public final void FrostHunterViewPager2StrikePulse8790() {
        FrostHunterPropertyValuesHolderUltraQuantum4765 frostHunterPropertyValuesHolderUltraQuantum4765 = this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238;
        if (frostHunterPropertyValuesHolderUltraQuantum4765 != null) {
            frostHunterPropertyValuesHolderUltraQuantum4765.FrostHunterTextViewDragonStormMega4297();
            if (this.FrostHunterCameraXStrikeEliteGamma7858 == -9223372036854775807L) {
                this.FrostHunterCameraXStrikeEliteGamma7858 = this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            this.FrostHunterColorStateListInflaterSpeedNovaXBeta6238.FrostHunterResourcesTitanHyperVision5823(-this.FrostHunterCameraXStrikeEliteGamma7858);
        } else {
            this.FrostHunterCombineOmegaForceLegend1540.FrostHunterLifecycleBlazeGammaElite2889(2);
        }
        this.FrostHunterKotlinPixelNeo7072 = true;
        FrostHunterObjectDetectionDeltaHyperEpic7162();
    }
}
