package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.EnhancedIntentService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterAccelerometerNovaXEliteOmega1915 implements FrostHunterServiceConnectionPrimeTurboPhoenix8976, FrostHunterTransitionNebulaBlaze7285, FrostHunterApplicationInfoHeroForceSpark2431, FrostHunterLocationManagerEpicAlphaQuantum9711, FrostHunterNavigationAlphaCelestial5898, FrostHunterLayoutInflaterNebulaVision6522, FrostHunterViewMegaStrike3894, FrostHunterVectorDrawableLegendBeta8243, FrostHunterProcessCameraProviderMegaMasterStrike3921 {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterAccelerometerNovaXEliteOmega1915(FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892, String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 7;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterKotlinQuantumRogue5892;
        this.FrostHunterFlowMaxDragonHero5809 = str;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
    public void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos2019 = (FrostHunterWorkManagerQuantumForceCosmos2019) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterThemeOverlayTitaniumOmegaBeta4062 frostHunterThemeOverlayTitaniumOmegaBeta4062 = (FrostHunterThemeOverlayTitaniumOmegaBeta4062) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper6407 = (FrostHunterTextRecognitionMaxHeroHyper6407) obj;
        frostHunterTextRecognitionMaxHeroHyper6407.getClass();
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterWorkManagerQuantumForceCosmos2019.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterAnimatedVectorDrawableMasterHeroHyper6960 == null) {
            return;
        }
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterThemeOverlayTitaniumOmegaBeta4062.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterFirebaseOlympianMax4818.getClass();
        FrostHunterLayoutVisionBlaze2953 frostHunterLayoutVisionBlaze2953 = frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterBundlePulseFusionHero2475;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterWorkManagerQuantumForceCosmos2019.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterAnimatedVectorDrawableMasterHeroHyper6960.getClass();
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(5, frostHunterFirebaseOlympianMax4818, frostHunterLayoutVisionBlaze2953.FrostHunterBundlePulseFusionHero2475(frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper6960));
        int i = frostHunterThemeOverlayTitaniumOmegaBeta4062.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != 0) {
            if (i == 1) {
                frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterLintTitanVortexQuantum9911 = frostHunterKotlinQuantumRogue5892;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterCameraXTurboCelestialHero5430 = frostHunterKotlinQuantumRogue5892;
                return;
            }
        }
        frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterKotlinQuantumRogue5892;
    }

    @Override // android.content.Context.FrostHunterProcessCameraProviderMegaMasterStrike3921
    public Object FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = (FrostHunterDelaySolarEclipse1769) this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 9:
                Iterable iterable = (Iterable) obj;
                FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = frostHunterDelaySolarEclipse1769.FrostHunterBundlePulseFusionHero2475;
                frostHunterModelInputOutputTitanHyperion7556.getClass();
                if (iterable.iterator().hasNext()) {
                    frostHunterModelInputOutputTitanHyperion7556.FrostHunterAlphaAnimationNeoCosmos5761().compileStatement("DELETE FROM events WHERE _id in ".concat(FrostHunterModelInputOutputTitanHyperion7556.FrostHunterKeyframeGammaGamma1197(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    frostHunterDelaySolarEclipse1769.FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809(((Integer) r2.getValue()).intValue(), FrostHunterFirebaseModelInterpreterPrimeMegaFusion4372.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterViewMegaStrike3894
    public Object FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = (FrostHunterKotlinQuantumRogue5892) this.FrostHunterAlertDialogAuroraDelta3200;
        String str = (String) this.FrostHunterFlowMaxDragonHero5809;
        synchronized (frostHunterKotlinQuantumRogue5892) {
            ((FrostHunterViewPager2SpectraForceVortex4544) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809).remove(str);
        }
        return frostHunterGradientDrawablePrimeSpectraUltra1716;
    }

    @Override // android.content.Context.FrostHunterServiceConnectionPrimeTurboPhoenix8976
    public Object FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        String str = (String) this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterAnimatorStormAurora6710 frostHunterAnimatorStormAurora6710 = (FrostHunterAnimatorStormAurora6710) obj;
                try {
                    Trace.beginSection(str);
                    return frostHunterAnimatorStormAurora6710.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterOnItemLongClickListenerRogueDeltaStrike7658);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterLifecycleBlazeGammaElite2889(Context.class);
                int i2 = ((FrostHunterVibratorSpectraBetaNovaX4683) obj).FrostHunterCameraXPixelTurboCosmos9814;
                String str2 = "";
                switch (i2) {
                    case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 9:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.FrostHunterAlphaAnimationNeoCosmos5761(installerPackageName);
                            break;
                        }
                        break;
                }
                return new FrostHunterClipDrawableAlphaTitanMaster5034(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x068a A[ORIG_RETURN, RETURN] */
    @Override // android.content.Context.FrostHunterTransitionNebulaBlaze7285
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterRemoteConfigSpeedSpeed8566(Object obj, FrostHunterAsyncNebulaCosmos7324 frostHunterAsyncNebulaCosmos7324) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        FrostHunterViewModelTitanPhoenixCelestial3010 frostHunterViewModelTitanPhoenixCelestial3010;
        int i7;
        int i8;
        int i9;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i10;
        int i11;
        boolean z2;
        FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper6407;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818;
        FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 frostHunterPaintFlagsDrawFilterPixelUltraMega2835;
        int i12;
        FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = (FrostHunterDispatchersBetaNova8419) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper64072 = (FrostHunterTextRecognitionMaxHeroHyper6407) obj;
        SparseArray sparseArray = frostHunterDispatchersBetaNova8419.FrostHunterLifecycleBlazeGammaElite2889;
        SparseArray sparseArray2 = new SparseArray(frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.size());
        for (int i13 = 0; i13 < frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.size(); i13++) {
            SparseBooleanArray sparseBooleanArray = frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i13, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i13);
            FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos2019 = (FrostHunterWorkManagerQuantumForceCosmos2019) sparseArray.get(keyAt);
            frostHunterWorkManagerQuantumForceCosmos2019.getClass();
            sparseArray2.append(keyAt, frostHunterWorkManagerQuantumForceCosmos2019);
        }
        frostHunterTextRecognitionMaxHeroHyper64072.getClass();
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.size() == 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            boolean z3 = true;
            if (i14 >= frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray2 = frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i14, sparseBooleanArray2.size());
            int keyAt2 = sparseBooleanArray2.keyAt(i14);
            FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos20192 = (FrostHunterWorkManagerQuantumForceCosmos2019) sparseArray2.get(keyAt2);
            frostHunterWorkManagerQuantumForceCosmos20192.getClass();
            FrostHunterLayoutVisionBlaze2953 frostHunterLayoutVisionBlaze2953 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterBundlePulseFusionHero2475;
            if (keyAt2 == 0) {
                synchronized (frostHunterLayoutVisionBlaze2953) {
                    try {
                        frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757.getClass();
                        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterLayoutVisionBlaze2953.FrostHunterLifecycleBlazeGammaElite2889;
                        frostHunterLayoutVisionBlaze2953.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterWorkManagerQuantumForceCosmos20192.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        Iterator it = frostHunterLayoutVisionBlaze2953.FrostHunterBundlePulseFusionHero2475.values().iterator();
                        while (it.hasNext()) {
                            FrostHunterServiceInfernoRogueStrike5327 frostHunterServiceInfernoRogueStrike5327 = (FrostHunterServiceInfernoRogueStrike5327) it.next();
                            if (frostHunterServiceInfernoRogueStrike5327.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterStrictModeNebulaEliteHyper7105, frostHunterLayoutVisionBlaze2953.FrostHunterLifecycleBlazeGammaElite2889) && !frostHunterServiceInfernoRogueStrike5327.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterWorkManagerQuantumForceCosmos20192)) {
                            }
                            it.remove();
                            if (frostHunterServiceInfernoRogueStrike5327.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterLayoutVisionBlaze2953.FrostHunterLevelListDrawableFusionDragonHero2232)) {
                                frostHunterLayoutVisionBlaze2953.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfernoRogueStrike5327);
                            }
                            if (frostHunterServiceInfernoRogueStrike5327.FrostHunterLifecycleBlazeGammaElite2889) {
                                frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757.FrostHunterServiceEliteCelestialThunder1757(frostHunterWorkManagerQuantumForceCosmos20192, frostHunterServiceInfernoRogueStrike5327.FrostHunterAlphaAnimationNeoCosmos5761);
                            }
                        }
                        frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757(frostHunterWorkManagerQuantumForceCosmos20192);
                    } finally {
                    }
                }
            } else if (keyAt2 == 11) {
                int i15 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterFragmentBetaMegaVortex6025;
                synchronized (frostHunterLayoutVisionBlaze2953) {
                    try {
                        frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757.getClass();
                        if (i15 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = frostHunterLayoutVisionBlaze2953.FrostHunterBundlePulseFusionHero2475.values().iterator();
                        while (it2.hasNext()) {
                            FrostHunterServiceInfernoRogueStrike5327 frostHunterServiceInfernoRogueStrike53272 = (FrostHunterServiceInfernoRogueStrike5327) it2.next();
                            if (frostHunterServiceInfernoRogueStrike53272.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterWorkManagerQuantumForceCosmos20192)) {
                                it2.remove();
                                boolean equals = frostHunterServiceInfernoRogueStrike53272.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterLayoutVisionBlaze2953.FrostHunterLevelListDrawableFusionDragonHero2232);
                                if (equals) {
                                    frostHunterLayoutVisionBlaze2953.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfernoRogueStrike53272);
                                }
                                if (frostHunterServiceInfernoRogueStrike53272.FrostHunterLifecycleBlazeGammaElite2889) {
                                    if (z3 && equals) {
                                        boolean z4 = frostHunterServiceInfernoRogueStrike53272.FrostHunterLevelListDrawableFusionDragonHero2232;
                                    }
                                    frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757.FrostHunterServiceEliteCelestialThunder1757(frostHunterWorkManagerQuantumForceCosmos20192, frostHunterServiceInfernoRogueStrike53272.FrostHunterAlphaAnimationNeoCosmos5761);
                                }
                            }
                        }
                        frostHunterLayoutVisionBlaze2953.FrostHunterServiceEliteCelestialThunder1757(frostHunterWorkManagerQuantumForceCosmos20192);
                    } finally {
                    }
                }
            } else {
                frostHunterLayoutVisionBlaze2953.FrostHunterLifecycleBlazeGammaElite2889(frostHunterWorkManagerQuantumForceCosmos20192);
            }
            i14++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(0)) {
            FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos20193 = (FrostHunterWorkManagerQuantumForceCosmos2019) sparseArray2.get(0);
            frostHunterWorkManagerQuantumForceCosmos20193.getClass();
            if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterKeyframeGammaGamma1197 != null) {
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterBundlePulseFusionHero2475(frostHunterWorkManagerQuantumForceCosmos20193.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterWorkManagerQuantumForceCosmos20193.FrostHunterServiceEliteCelestialThunder1757);
            }
        }
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(2) && frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterKeyframeGammaGamma1197 != null) {
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            FrostHunterAnimatorOlympianPhantomElite2405 listIterator = ((FrostHunterCameraXAuroraVortex8383) frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761.listIterator(0);
            loop4: while (true) {
                if (!listIterator.hasNext()) {
                    frostHunterPaintFlagsDrawFilterPixelUltraMega2835 = null;
                    break;
                }
                FrostHunterScaleDrawablePrimeCelestial5414 frostHunterScaleDrawablePrimeCelestial5414 = (FrostHunterScaleDrawablePrimeCelestial5414) listIterator.next();
                for (int i16 = 0; i16 < frostHunterScaleDrawablePrimeCelestial5414.FrostHunterAlphaAnimationNeoCosmos5761; i16++) {
                    if (frostHunterScaleDrawablePrimeCelestial5414.FrostHunterLifecycleBlazeGammaElite2889[i16] && (frostHunterPaintFlagsDrawFilterPixelUltraMega2835 = frostHunterScaleDrawablePrimeCelestial5414.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757[i16].FrostHunterResourcesTitanHyperVision5823) != null) {
                        break loop4;
                    }
                }
            }
            if (frostHunterPaintFlagsDrawFilterPixelUltraMega2835 != null) {
                PlaybackMetrics.Builder FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAudioManagerTitanBetaMega4705.FrostHunterAlertDialogAuroraDelta3200(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterKeyframeGammaGamma1197);
                int i17 = 0;
                while (true) {
                    if (i17 >= frostHunterPaintFlagsDrawFilterPixelUltraMega2835.FrostHunterKeyframeGammaGamma1197) {
                        i12 = 1;
                        break;
                    }
                    UUID uuid = frostHunterPaintFlagsDrawFilterPixelUltraMega2835.FrostHunterCameraXPixelTurboCosmos9814[i17].FrostHunterFlowMaxDragonHero5809;
                    if (uuid.equals(FrostHunterContentObserverAuroraStormCosmos7148.FrostHunterServiceEliteCelestialThunder1757)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(FrostHunterContentObserverAuroraStormCosmos7148.FrostHunterLifecycleBlazeGammaElite2889)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(FrostHunterContentObserverAuroraStormCosmos7148.FrostHunterBundlePulseFusionHero2475)) {
                            i12 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                FrostHunterAlertDialogAuroraDelta3200.setDrmType(i12);
            }
        }
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(1011)) {
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceInfoHyperionSparkMax9966++;
        }
        FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 == null) {
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
        } else {
            int i18 = frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.FrostHunterCameraXPixelTurboCosmos9814;
            Context context = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterAlphaAnimationNeoCosmos5761;
            boolean z5 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterBitmapTurboDeltaNebula8743 == 4;
            if (i18 == 1001) {
                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(20, 0);
            } else {
                if (frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 instanceof FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868) {
                    z = frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.FrostHunterAlertDialogAuroraDelta3200 == 1;
                    i = frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.FrostHunterLightSensorForceFusion4241;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i19 = 28;
                    i2 = 6;
                    i3 = 8;
                    i4 = 7;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(35, 0);
                    } else if (z && i == 3) {
                        frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(15, 0);
                    } else if (z && i == 2) {
                        frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(23, 0);
                    } else {
                        if (cause instanceof FrostHunterPagingSourceOlympianMega1078) {
                            i6 = 13;
                            frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(13, FrostHunterGyroscopeHeroAlpha1995.FrostHunterLintTitanVortexQuantum9911(((FrostHunterPagingSourceOlympianMega1078) cause).FrostHunterKeyframeGammaGamma1197));
                        } else {
                            i6 = 13;
                            if (cause instanceof FrostHunterLevelListDrawableNeoTitan3480) {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(14, ((FrostHunterLevelListDrawableNeoTitan3480) cause).FrostHunterCameraXPixelTurboCosmos9814);
                            } else if (cause instanceof OutOfMemoryError) {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(14, 0);
                            } else if (cause instanceof FrostHunterGuidelineStormCosmosTitan7688) {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(17, 0);
                            } else if (cause instanceof FrostHunterWorkManagerHeroNovaXDragon2658) {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(18, ((FrostHunterWorkManagerHeroNovaXDragon2658) cause).FrostHunterCameraXPixelTurboCosmos9814);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (FrostHunterGyroscopeHeroAlpha1995.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(errorCode2)) {
                                    case 6002:
                                        i19 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i19 = 25;
                                        break;
                                    case 6005:
                                        i19 = 26;
                                        break;
                                    default:
                                        i19 = 27;
                                        break;
                                }
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(i19, errorCode2);
                            } else {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(22, 0);
                            }
                        }
                        timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                        errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                        subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                        build = exception.build();
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                    }
                    i6 = 13;
                    timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                    errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                    subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                    build = exception.build();
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                } else if (cause instanceof FrostHunterFirebaseModelInterpreterVisionSparkElite7607) {
                    frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(5, ((FrostHunterFirebaseModelInterpreterVisionSparkElite7607) cause).FrostHunterAlertDialogAuroraDelta3200);
                } else {
                    if ((cause instanceof FrostHunterCameraSelectorPrimeTurbo7662) || (cause instanceof FrostHunterDiffUtilTurboSpark8131)) {
                        i2 = 6;
                        i5 = 9;
                        i3 = 8;
                        i4 = 7;
                        frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof FrostHunterFirebaseStrikeNovaX3669;
                        if (z6 || (cause instanceof FrostHunterServiceEpicOmega5739)) {
                            i7 = 9;
                            if (FrostHunterKeyEventEliteCelestialDelta8868.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterConstraintSetCloneMasterUltraRogue2633() == 1) {
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i2 = 6;
                                    frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(6, 0);
                                    i5 = 9;
                                    i6 = 13;
                                    i3 = 8;
                                    i4 = 7;
                                    timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                                    subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                                    exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                                    build = exception.build();
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                                } else {
                                    i2 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i8 = 7;
                                        frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(7, 0);
                                    } else {
                                        i8 = 7;
                                        if (z6 && ((FrostHunterFirebaseStrikeNovaX3669) cause).FrostHunterFlowMaxDragonHero5809 == 1) {
                                            frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(4, 0);
                                        } else {
                                            frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(8, 0);
                                            i5 = 9;
                                            i3 = 8;
                                            i4 = 7;
                                        }
                                    }
                                    i5 = 9;
                                    i4 = i8;
                                    i6 = 13;
                                    i3 = 8;
                                    timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                                    subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                                    exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                                    build = exception.build();
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                                }
                            }
                        } else if (i18 == 1002) {
                            frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(21, 0);
                        } else if (cause instanceof FrostHunterInstrumentationDragonEclipseMega6457) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int FrostHunterLintTitanVortexQuantum9911 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLintTitanVortexQuantum9911(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (FrostHunterGyroscopeHeroAlpha1995.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLintTitanVortexQuantum9911)) {
                                    case 6002:
                                        i9 = 24;
                                        break;
                                    case 6003:
                                        i9 = 28;
                                        break;
                                    case 6004:
                                        i9 = 25;
                                        break;
                                    case 6005:
                                        i9 = 26;
                                        break;
                                    default:
                                        i9 = 27;
                                        break;
                                }
                                frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(i9, FrostHunterLintTitanVortexQuantum9911);
                            } else {
                                frostHunterViewModelTitanPhoenixCelestial3010 = cause3 instanceof MediaDrmResetException ? new FrostHunterViewModelTitanPhoenixCelestial3010(27, 0) : cause3 instanceof NotProvisionedException ? new FrostHunterViewModelTitanPhoenixCelestial3010(24, 0) : cause3 instanceof DeniedByServerException ? new FrostHunterViewModelTitanPhoenixCelestial3010(29, 0) : cause3 instanceof FrostHunterLayerDrawableAlphaFusionOlympian7184 ? new FrostHunterViewModelTitanPhoenixCelestial3010(23, 0) : cause3 instanceof FrostHunterDialogFragmentEpicQuantum3683 ? new FrostHunterViewModelTitanPhoenixCelestial3010(28, 0) : new FrostHunterViewModelTitanPhoenixCelestial3010(30, 0);
                            }
                        } else if ((cause instanceof FrostHunterTextInputLayoutQuantumShadow7150) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            frostHunterViewModelTitanPhoenixCelestial3010 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new FrostHunterViewModelTitanPhoenixCelestial3010(32, 0) : new FrostHunterViewModelTitanPhoenixCelestial3010(31, 0);
                        } else {
                            i7 = 9;
                            frostHunterViewModelTitanPhoenixCelestial3010 = new FrostHunterViewModelTitanPhoenixCelestial3010(9, 0);
                        }
                        i5 = i7;
                        i6 = 13;
                        i2 = 6;
                        i3 = 8;
                        i4 = 7;
                        timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                        errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                        subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                        build = exception.build();
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                    }
                    i6 = 13;
                    timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                    errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
                    subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
                    build = exception.build();
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
                }
            }
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
            timeSinceCreatedMillis = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterLifecycleBlazeGammaElite2889().setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
            errorCode = timeSinceCreatedMillis.setErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterAlphaAnimationNeoCosmos5761);
            subErrorCode = errorCode.setSubErrorCode(frostHunterViewModelTitanPhoenixCelestial3010.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            exception = subErrorCode.setException(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
            build = exception.build();
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(25, frostHunterTextRecognitionMaxHeroHyper64072, build));
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = true;
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterScaleAnimationStrikeSpark5059 = null;
        }
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(2)) {
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            FrostHunterCameraXAuroraVortex8383 frostHunterCameraXAuroraVortex8383 = (FrostHunterCameraXAuroraVortex8383) frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197;
            boolean FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCameraXAuroraVortex8383.FrostHunterAlphaAnimationNeoCosmos5761(2);
            boolean FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterCameraXAuroraVortex8383.FrostHunterAlphaAnimationNeoCosmos5761(1);
            boolean FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterCameraXAuroraVortex8383.FrostHunterAlphaAnimationNeoCosmos5761(3);
            if (FrostHunterAlphaAnimationNeoCosmos5761 || FrostHunterAlphaAnimationNeoCosmos57612 || FrostHunterAlphaAnimationNeoCosmos57613) {
                if (FrostHunterAlphaAnimationNeoCosmos5761) {
                    frostHunterFirebaseOlympianMax4818 = null;
                } else {
                    frostHunterFirebaseOlympianMax4818 = null;
                    if (!Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterResourcesTitanHyperVision5823, null)) {
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterResourcesTitanHyperVision5823 = null;
                        frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(1, elapsedRealtime, null);
                    }
                }
                if (!FrostHunterAlphaAnimationNeoCosmos57612 && !Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterTextViewDragonStormMega4297, frostHunterFirebaseOlympianMax4818)) {
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterTextViewDragonStormMega4297 = frostHunterFirebaseOlympianMax4818;
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(0, elapsedRealtime, frostHunterFirebaseOlympianMax4818);
                }
                if (!FrostHunterAlphaAnimationNeoCosmos57613 && !Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterFirebaseOlympianMax4818)) {
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterFirebaseOlympianMax4818;
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(2, elapsedRealtime, frostHunterFirebaseOlympianMax4818);
                }
            }
        }
        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = (FrostHunterFirebaseOlympianMax4818) frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlertDialogAuroraDelta3200;
            if (frostHunterFirebaseOlympianMax48182.FrostHunterBitmapTurboDeltaNebula8743 != -1) {
                if (!Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterResourcesTitanHyperVision5823, frostHunterFirebaseOlympianMax48182)) {
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterResourcesTitanHyperVision5823 = frostHunterFirebaseOlympianMax48182;
                    frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(1, elapsedRealtime, frostHunterFirebaseOlympianMax48182);
                }
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
            }
        }
        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLintTitanVortexQuantum9911)) {
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183 = (FrostHunterFirebaseOlympianMax4818) frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLintTitanVortexQuantum9911.FrostHunterAlertDialogAuroraDelta3200;
            if (!Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterTextViewDragonStormMega4297, frostHunterFirebaseOlympianMax48183)) {
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterTextViewDragonStormMega4297 = frostHunterFirebaseOlympianMax48183;
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(0, elapsedRealtime, frostHunterFirebaseOlympianMax48183);
            }
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLintTitanVortexQuantum9911 = null;
        }
        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterCameraXTurboCelestialHero5430)) {
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48184 = (FrostHunterFirebaseOlympianMax4818) frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterCameraXTurboCelestialHero5430.FrostHunterAlertDialogAuroraDelta3200;
            if (!Objects.equals(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterFirebaseOlympianMax48184)) {
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterFirebaseOlympianMax48184;
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889(2, elapsedRealtime, frostHunterFirebaseOlympianMax48184);
            }
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterCameraXTurboCelestialHero5430 = null;
        }
        switch (FrostHunterKeyEventEliteCelestialDelta8868.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i10 = 0;
                break;
            case 1:
                i10 = i5;
                break;
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                i10 = i2;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            default:
                i10 = 1;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                i10 = 3;
                break;
            case 9:
                i10 = i3;
                break;
            case 10:
                i10 = i4;
                break;
        }
        if (i10 != frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLightSensorForceFusion4241) {
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLightSensorForceFusion4241 = i10;
            networkType = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterServiceEliteCelestialThunder1757().setNetworkType(i10);
            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
            build3 = timeSinceCreatedMillis3.build();
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(24, frostHunterTextRecognitionMaxHeroHyper64072, build3));
        }
        if (frostHunterThreadSpectraShadowGamma2307.FrostHunterLightSensorForceFusion4241() != 2) {
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterMotionSceneAuroraMega2271 = false;
        }
        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
        if (frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterDialogFragmentTurboPhoenixDragon7627 = false;
            i11 = 10;
        } else {
            i11 = 10;
            if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(10)) {
                frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterDialogFragmentTurboPhoenixDragon7627 = true;
            }
        }
        int FrostHunterLightSensorForceFusion4241 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLightSensorForceFusion4241();
        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterMotionSceneAuroraMega2271) {
            i6 = 5;
        } else if (!frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterDialogFragmentTurboPhoenixDragon7627) {
            if (FrostHunterLightSensorForceFusion4241 == 4) {
                i6 = 11;
            } else {
                i6 = 12;
                int i20 = 2;
                if (FrostHunterLightSensorForceFusion4241 == 2) {
                    int i21 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (i21 != 0 && i21 != 2 && i21 != 12) {
                        if (frostHunterThreadSpectraShadowGamma2307.FrostHunterServiceConnectionTurboPhoenixOmega6719()) {
                            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
                            i6 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterLightSensorForceFusion4241 != 0 ? i11 : i2;
                        } else {
                            i6 = i4;
                        }
                    }
                    i6 = i20;
                } else {
                    i20 = 3;
                    if (FrostHunterLightSensorForceFusion4241 != 3) {
                        z2 = true;
                        if (FrostHunterLightSensorForceFusion4241 != 1 || frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719 == 0) {
                            i6 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        }
                        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719 != i6) {
                            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i6;
                            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterEditTextPulseHyperion1262 = z2;
                            state = FrostHunterOnLongClickListenerTurboCyberForce3605.FrostHunterCameraXPixelTurboCosmos9814().setState(frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719);
                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterLifecycleBlazeGammaElite2889);
                            build2 = timeSinceCreatedMillis2.build();
                            frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterDialogQuantumTurbo8340(27, frostHunterTextRecognitionMaxHeroHyper64072, build2));
                        }
                        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(1028)) {
                            return;
                        }
                        FrostHunterLayoutVisionBlaze2953 frostHunterLayoutVisionBlaze29532 = frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos20194 = (FrostHunterWorkManagerQuantumForceCosmos2019) sparseArray2.get(1028);
                        frostHunterWorkManagerQuantumForceCosmos20194.getClass();
                        synchronized (frostHunterLayoutVisionBlaze29532) {
                            try {
                                String str = frostHunterLayoutVisionBlaze29532.FrostHunterLevelListDrawableFusionDragonHero2232;
                                if (str != null) {
                                    FrostHunterServiceInfernoRogueStrike5327 frostHunterServiceInfernoRogueStrike53273 = (FrostHunterServiceInfernoRogueStrike5327) frostHunterLayoutVisionBlaze29532.FrostHunterBundlePulseFusionHero2475.get(str);
                                    frostHunterServiceInfernoRogueStrike53273.getClass();
                                    frostHunterLayoutVisionBlaze29532.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfernoRogueStrike53273);
                                }
                                Iterator it3 = frostHunterLayoutVisionBlaze29532.FrostHunterBundlePulseFusionHero2475.values().iterator();
                                while (it3.hasNext()) {
                                    FrostHunterServiceInfernoRogueStrike5327 frostHunterServiceInfernoRogueStrike53274 = (FrostHunterServiceInfernoRogueStrike5327) it3.next();
                                    it3.remove();
                                    if (frostHunterServiceInfernoRogueStrike53274.FrostHunterLifecycleBlazeGammaElite2889 && (frostHunterTextRecognitionMaxHeroHyper6407 = frostHunterLayoutVisionBlaze29532.FrostHunterServiceEliteCelestialThunder1757) != null) {
                                        frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterServiceEliteCelestialThunder1757(frostHunterWorkManagerQuantumForceCosmos20194, frostHunterServiceInfernoRogueStrike53274.FrostHunterAlphaAnimationNeoCosmos5761);
                                    }
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    if (frostHunterThreadSpectraShadowGamma2307.FrostHunterServiceConnectionTurboPhoenixOmega6719()) {
                        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
                        if (frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterLightSensorForceFusion4241 != 0) {
                            i6 = i5;
                        }
                        i6 = i20;
                    } else {
                        i6 = 4;
                    }
                }
            }
        }
        z2 = true;
        if (frostHunterTextRecognitionMaxHeroHyper64072.FrostHunterServiceConnectionTurboPhoenixOmega6719 != i6) {
        }
        if (frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761.get(1028)) {
        }
    }

    @Override // android.content.Context.FrostHunterNavigationAlphaCelestial5898
    public int FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        Context context = (Context) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = (FrostHunterStorageNovaXEliteAurora3066) obj;
        String str = frostHunterStorageNovaXEliteAurora3066.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return ((str.equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059) || str.equals(FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818))) && frostHunterStorageNovaXEliteAurora3066.FrostHunterBundlePulseFusionHero2475(context, frostHunterFirebaseOlympianMax4818, false) && frostHunterStorageNovaXEliteAurora3066.FrostHunterServiceEliteCelestialThunder1757(frostHunterFirebaseOlympianMax4818)) ? 1 : 0;
    }

    @Override // android.content.Context.FrostHunterLocationManagerEpicAlphaQuantum9711
    public void FrostHunterTextViewDragonStormMega4297(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.FrostHunterFlowMaxDragonHero5809;
        Intent intent = (Intent) this.FrostHunterAlertDialogAuroraDelta3200;
        int i = EnhancedIntentService.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        enhancedIntentService.FrostHunterAlphaAnimationNeoCosmos5761(intent);
    }

    @Override // android.content.Context.FrostHunterLayoutInflaterNebulaVision6522
    public void accept(Object obj) {
        FrostHunterImageAnalysisTurboLegend2497 frostHunterImageAnalysisTurboLegend2497 = (FrostHunterImageAnalysisTurboLegend2497) this.FrostHunterFlowMaxDragonHero5809;
        ((FrostHunterLayoutPrimeDeltaSpark7642) obj).FrostHunterServiceInfoHyperionSparkMax9966(frostHunterImageAnalysisTurboLegend2497.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterImageAnalysisTurboLegend2497.FrostHunterConstraintSetCloneMasterUltraRogue2633, (FrostHunterThemeOverlayTitaniumOmegaBeta4062) this.FrostHunterAlertDialogAuroraDelta3200);
    }

    @Override // android.content.Context.FrostHunterVectorDrawableLegendBeta8243
    public Object apply(Object obj) {
        FrostHunterModelInputOutputTitanHyperion7556 frostHunterModelInputOutputTitanHyperion7556 = (FrostHunterModelInputOutputTitanHyperion7556) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) this.FrostHunterAlertDialogAuroraDelta3200;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        FrostHunterFlipAnimationInfernoVisionForce3014 frostHunterFlipAnimationInfernoVisionForce3014 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterKeyframeGammaGamma1197;
        ArrayList FrostHunterCameraXPixelTurboCosmos9814 = frostHunterModelInputOutputTitanHyperion7556.FrostHunterCameraXPixelTurboCosmos9814(sQLiteDatabase, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, frostHunterFlipAnimationInfernoVisionForce3014.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        for (FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777 : FrostHunterAnimatorPixelNovaSolar6777.values()) {
            if (frostHunterAnimatorPixelNovaSolar6777 != frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterBundlePulseFusionHero2475) {
                int size = frostHunterFlipAnimationInfernoVisionForce3014.FrostHunterConstraintSetCloneMasterUltraRogue2633 - FrostHunterCameraXPixelTurboCosmos9814.size();
                if (size <= 0) {
                    break;
                }
                FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperHyperionForce4133(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761);
                if (frostHunterAnimatorPixelNovaSolar6777 == null) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null priority");
                    return null;
                }
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = frostHunterAnimatorPixelNovaSolar6777;
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterCameraXPixelTurboCosmos9814.addAll(frostHunterModelInputOutputTitanHyperion7556.FrostHunterCameraXPixelTurboCosmos9814(sQLiteDatabase, FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < FrostHunterCameraXPixelTurboCosmos9814.size(); i++) {
            sb.append(((FrostHunterDialogMasterEliteAurora9450) FrostHunterCameraXPixelTurboCosmos9814.get(i)).FrostHunterAlphaAnimationNeoCosmos5761);
            if (i < FrostHunterCameraXPixelTurboCosmos9814.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new FrostHunterPagingCosmosSolarUltra1785(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = FrostHunterCameraXPixelTurboCosmos9814.listIterator();
        while (listIterator.hasNext()) {
            FrostHunterDialogMasterEliteAurora9450 frostHunterDialogMasterEliteAurora9450 = (FrostHunterDialogMasterEliteAurora9450) listIterator.next();
            long j2 = frostHunterDialogMasterEliteAurora9450.FrostHunterAlphaAnimationNeoCosmos5761;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterBundlePulseFusionHero2475 = frostHunterDialogMasterEliteAurora9450.FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475();
                for (FrostHunterPagingCosmosSolarUltra1785 frostHunterPagingCosmosSolarUltra1785 : (Set) hashMap.get(Long.valueOf(j2))) {
                    FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterPagingCosmosSolarUltra1785.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterPagingCosmosSolarUltra1785.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                }
                listIterator.set(new FrostHunterDialogMasterEliteAurora9450(j2, frostHunterDialogMasterEliteAurora9450.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterBundlePulseFusionHero2475.FrostHunterCameraXPixelTurboCosmos9814()));
            }
        }
        return FrostHunterCameraXPixelTurboCosmos9814;
    }

    public /* synthetic */ FrostHunterAccelerometerNovaXEliteOmega1915(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }
}
