package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import com.adjust.sdk.ReferrerDetails;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.service.FrostFetcherAssembler;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterLayoutInflaterTurboHyperion3832 implements InstallReferrerReadListener, OnGooglePlayInstallReferrerReadListener, FrostHunterNavigationFusionMaxTitanium7057, FrostHunterFragmentAuroraDelta4793, FrostHunterProGuardCyberHyper2901 {
    public static volatile FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlertDialogAuroraDelta3200;
    public static final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterKeyframeGammaGamma1197;
    public static final FrostHunterFirebasePrimeForce9588 FrostHunterLightSensorForceFusion4241;
    public static volatile FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;
    public static final Object FrostHunterFragmentBetaMegaVortex6025 = new Object();
    public static final FrostHunterBundleMasterVision3644 FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterBundleMasterVision3644();

    static {
        int i = 1;
        FrostHunterKeyframeGammaGamma1197 = new FrostHunterLayoutInflaterTurboHyperion3832(i, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        FrostHunterLightSensorForceFusion4241 = new FrostHunterFirebasePrimeForce9588(i);
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(int i) {
        FrostHunterOnAttachStateChangeListenerSparkSpeed2112 frostHunterOnAttachStateChangeListenerSparkSpeed2112;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 2:
                this.FrostHunterFlowMaxDragonHero5809 = new ConcurrentHashMap();
                break;
            case 3:
                FrostHunterBarrierPhantomVortex5528 frostHunterBarrierPhantomVortex5528 = FrostHunterBarrierPhantomVortex5528.FrostHunterBundlePulseFusionHero2475;
                try {
                    frostHunterOnAttachStateChangeListenerSparkSpeed2112 = (FrostHunterOnAttachStateChangeListenerSparkSpeed2112) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    frostHunterOnAttachStateChangeListenerSparkSpeed2112 = FrostHunterLightSensorForceFusion4241;
                }
                FrostHunterOnAttachStateChangeListenerSparkSpeed2112[] frostHunterOnAttachStateChangeListenerSparkSpeed2112Arr = {FrostHunterFirebasePrimeForce9588.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOnAttachStateChangeListenerSparkSpeed2112};
                FrostHunterFlowCollectorPrimeAuroraMax7814 frostHunterFlowCollectorPrimeAuroraMax7814 = new FrostHunterFlowCollectorPrimeAuroraMax7814();
                frostHunterFlowCollectorPrimeAuroraMax7814.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterOnAttachStateChangeListenerSparkSpeed2112Arr;
                Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
                this.FrostHunterFlowMaxDragonHero5809 = frostHunterFlowCollectorPrimeAuroraMax7814;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT < 26) {
                    this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterGroupPrimeTitaniumGamma4469(this);
                    break;
                } else {
                    this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterModelInputOutputGammaBlaze2764(this);
                    break;
                }
            case 14:
                this.FrostHunterFlowMaxDragonHero5809 = new AtomicInteger(0);
                break;
            case 15:
                this.FrostHunterFlowMaxDragonHero5809 = new AtomicReference(null);
                break;
            case 22:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterButtonEliteCosmos6372[16]);
                break;
            case 27:
                TimeUnit.MINUTES.getClass();
                FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248 = FrostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterFragmentBetaMegaVortex6025;
                frostHunterCoroutineScopeBetaMasterRogue7248.getClass();
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterGuidelineUltraThunderTitanium6483(frostHunterCoroutineScopeBetaMasterRogue7248);
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809 = new HashSet();
                break;
        }
    }

    public static FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterCameraXPixelTurboCosmos9814() {
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719 == null) {
            synchronized (FrostHunterFragmentBetaMegaVortex6025) {
                try {
                    if (FrostHunterServiceConnectionTurboPhoenixOmega6719 == null) {
                        FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterLayoutInflaterTurboHyperion3832(2);
                    }
                } finally {
                }
            }
        }
        FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832 = FrostHunterServiceConnectionTurboPhoenixOmega6719;
        FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(frostHunterLayoutInflaterTurboHyperion3832);
        return frostHunterLayoutInflaterTurboHyperion3832;
    }

    public Object FrostHunterAlertDialogAuroraDelta3200() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 18:
                FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832 = ((FrostHunterChipMasterUltra7163) ((FrostHunterSQLiteMasterUltra9956) obj).FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterLayoutInflaterTurboHyperion3832.getClass();
                FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607 = (FrostHunterMagnetometerInfernoDragon1607) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809;
                frostHunterMagnetometerInfernoDragon1607.getClass();
                String str = (String) new FrostFetcherAssembler(null, null, null, 7, null).processCenter();
                System.currentTimeMillis();
                str.getClass();
                frostHunterMagnetometerInfernoDragon1607.getClass();
                String str2 = (String) new FrostFetcherAssembler(null, null, null, 7, null).processUpper();
                System.currentTimeMillis();
                str2.getClass();
                String str3 = (String) new FrostFetcherAssembler(null, null, null, 7, null).processLower();
                System.currentTimeMillis();
                str3.getClass();
                String str4 = (String) new FrostFetcherAssembler(null, null, null, 7, null).processCore();
                System.currentTimeMillis();
                str4.getClass();
                return new FrostHunterContentObserverOmegaNebula2987(str, str2, str3, str4);
            default:
                return new FrostHunterChipMasterUltra7163(new FrostHunterLayoutInflaterTurboHyperion3832(new FrostHunterMagnetometerInfernoDragon1607()));
        }
    }

    @Override // android.content.Context.FrostHunterNavigationFusionMaxTitanium7057
    public void FrostHunterAlphaAnimationNeoCosmos5761(ConnectionResult connectionResult) {
        boolean z = connectionResult.FrostHunterFlowMaxDragonHero5809 == 0;
        com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = (com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754) this.FrostHunterFlowMaxDragonHero5809;
        if (z) {
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(null, frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBitmapTurboDeltaNebula8743);
            return;
        }
        FrostHunterPlaceholderHeroDragonCyber3593 frostHunterPlaceholderHeroDragonCyber3593 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterPlaceholderHeroDragonCyber3593 != null) {
            ((FrostHunterBitmapPixelMegaOlympian1139) frostHunterPlaceholderHeroDragonCyber3593.FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterBundlePulseFusionHero2475(connectionResult);
        }
    }

    public void FrostHunterBundlePulseFusionHero2475(CancellationException cancellationException) {
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = (FrostHunterObjectAnimatorNeoStrike7090) this.FrostHunterFlowMaxDragonHero5809;
        int i = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterViewPagerTitanSolar4986[] frostHunterViewPagerTitanSolar4986Arr = new FrostHunterViewPagerTitanSolar4986[i];
        for (int i2 = 0; i2 < i; i2++) {
            frostHunterViewPagerTitanSolar4986Arr[i2] = ((FrostHunterButtonEliteCosmos6372) frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814[i2]).FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        for (int i3 = 0; i3 < i; i3++) {
            frostHunterViewPagerTitanSolar4986Arr[i3].FrostHunterServiceConnectionTurboPhoenixOmega6719(cancellationException);
        }
        if (frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200 == 0) {
            return;
        }
        FrostHunterGradlePluginHeroBetaThunder1341.FrostHunterBundlePulseFusionHero2475("uncancelled requests present");
    }

    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(int i, Object obj, FrostHunterDiffUtilStrikeDragonStorm3770 frostHunterDiffUtilStrikeDragonStorm3770) {
        FrostHunterWorkManagerQuantumBeta5298 frostHunterWorkManagerQuantumBeta5298 = (FrostHunterWorkManagerQuantumBeta5298) this.FrostHunterFlowMaxDragonHero5809;
        frostHunterWorkManagerQuantumBeta5298.FrostHunterEditTextPulseHyperion1262(i, 3);
        frostHunterDiffUtilStrikeDragonStorm3770.FrostHunterLifecycleBlazeGammaElite2889((FrostHunterStateNeoCyberShadow9514) obj, frostHunterWorkManagerQuantumBeta5298.FrostHunterAlphaAnimationNeoCosmos5761);
        frostHunterWorkManagerQuantumBeta5298.FrostHunterEditTextPulseHyperion1262(i, 4);
    }

    public void FrostHunterFlowMaxDragonHero5809(float f, float f2, float f3, float f4) {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterGradientDrawableHeroOmegaQuantum3976 FrostHunterAlertDialogAuroraDelta32002 = frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200();
        float intBitsToFloat = Float.intBitsToFloat((int) (frostHunterTraceHyperionAuroraNebula9947.FrostHunterLightSensorForceFusion4241() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (frostHunterTraceHyperionAuroraNebula9947.FrostHunterLightSensorForceFusion4241() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            FrostHunterProximitySensorShadowLegendShadow9762.FrostHunterAlphaAnimationNeoCosmos5761("Width and height must be greater than or equal to zero");
        }
        frostHunterTraceHyperionAuroraNebula9947.FrostHunterDatabaseEliteShadowUltra2452(floatToRawIntBits);
        FrostHunterAlertDialogAuroraDelta32002.FrostHunterCameraXPixelTurboCosmos9814(f, f2);
    }

    public void FrostHunterFragmentBetaMegaVortex6025() {
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = (FrostHunterObjectAnimatorNeoStrike7090) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200);
        int i = FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = FrostHunterRunnableCosmosCelestial4235.FrostHunterFlowMaxDragonHero5809;
        if (i <= i2) {
            while (true) {
                ((FrostHunterButtonEliteCosmos6372) frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814[i]).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        frostHunterObjectAnimatorNeoStrike7090.FrostHunterRemoteConfigSpeedSpeed8566();
    }

    public boolean FrostHunterKeyframeGammaGamma1197(int i, int i2, Bundle bundle) {
        return false;
    }

    public FrostHunterMenuUltraHyperion3040 FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        return null;
    }

    @Override // android.content.Context.FrostHunterFragmentAuroraDelta4793
    public void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883) {
        ((FrostHunterSQLiteUltraElite7894) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLooperHyperionForce4133(frostHunterThemeOverlayAlphaUltra2883, FrostHunterViewPagerTitanCyber7552.FrostHunterFlowMaxDragonHero5809);
    }

    public void FrostHunterLightSensorForceFusion4241(float f, float f2) {
        ((FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200().FrostHunterCameraXPixelTurboCosmos9814(f, f2);
    }

    public boolean FrostHunterLintTitanVortexQuantum9911(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.FrostHunterFlowMaxDragonHero5809;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof FrostHunterContentResolverForceVortex3863) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // android.content.Context.FrostHunterFragmentAuroraDelta4793
    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, IOException iOException) {
        ((FrostHunterSQLiteUltraElite7894) this.FrostHunterFlowMaxDragonHero5809).FrostHunterRemoteConfigSpeedSpeed8566(new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(iOException));
    }

    public void FrostHunterScaleAnimationStrikeSpark5059(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.FrostHunterFlowMaxDragonHero5809;
        if ((serviceConnection instanceof FrostHunterContentResolverForceVortex3863) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public void FrostHunterServiceConnectionTurboPhoenixOmega6719(float f, float f2, long j) {
        FrostHunterGradientDrawableHeroOmegaQuantum3976 FrostHunterAlertDialogAuroraDelta32002 = ((FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        FrostHunterAlertDialogAuroraDelta32002.FrostHunterCameraXPixelTurboCosmos9814(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        FrostHunterAlertDialogAuroraDelta32002.FrostHunterConstraintSetCloneMasterUltraRogue2633(f, f2);
        FrostHunterAlertDialogAuroraDelta32002.FrostHunterCameraXPixelTurboCosmos9814(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public FrostHunterMenuUltraHyperion3040 FrostHunterServiceEliteCelestialThunder1757(int i) {
        return null;
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public Object get() {
        return new FrostHunterTraceHyperionAuroraNebula9947((Context) ((FrostHunterInstrumentationStrikeBlazeThunder7469) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814, (Object) new FrostHunterAuthPixelSolar5465(), (Object) new FrostHunterLocationManagerAlphaFusion6480(), 11);
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener, com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onFail(String str) {
        ILogger iLogger;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                iLogger = ((ActivityHandler) obj).logger;
                iLogger.debug(str, new Object[0]);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            default:
                ((FrostHunterWindowManagerAlphaBeta2474) ((FrostHunterAnimatorQuantumFusionMaster8565) obj).FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761("");
                break;
            case 9:
                ((OnGooglePlayInstallReferrerReadListener) obj).onFail(str);
                break;
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) obj).sendInstallReferrer(referrerDetails, str);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) obj).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
                break;
        }
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onInstallReferrerRead(GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails) {
        FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = (FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809;
        String str = googlePlayInstallReferrerDetails != null ? googlePlayInstallReferrerDetails.installReferrer : null;
        FrostHunterWindowManagerAlphaBeta2474 frostHunterWindowManagerAlphaBeta2474 = (FrostHunterWindowManagerAlphaBeta2474) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809;
        if (str == null) {
            str = "";
        }
        frostHunterWindowManagerAlphaBeta2474.FrostHunterAlphaAnimationNeoCosmos5761(str);
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(FrostHunterMotionSceneNeoHyperion2555 frostHunterMotionSceneNeoHyperion2555, FrostHunterServicePhantomGammaTitan7103 frostHunterServicePhantomGammaTitan7103) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 25;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterServicePhantomGammaTitan7103;
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 6;
        frostHunterMagnetometerInfernoDragon1607.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMagnetometerInfernoDragon1607;
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(FrostHunterWorkManagerQuantumBeta5298 frostHunterWorkManagerQuantumBeta5298) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 26;
        FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterWorkManagerQuantumBeta5298, "output");
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterWorkManagerQuantumBeta5298;
        frostHunterWorkManagerQuantumBeta5298.FrostHunterAlphaAnimationNeoCosmos5761 = this;
    }

    public /* synthetic */ FrostHunterLayoutInflaterTurboHyperion3832(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 13;
        this.FrostHunterFlowMaxDragonHero5809 = new AtomicBoolean(z);
    }

    public FrostHunterLayoutInflaterTurboHyperion3832(FrostHunterPropertyValuesHolderMaxSpeed2945 frostHunterPropertyValuesHolderMaxSpeed2945, FrostHunterAdapterDelegatePhantomTitanium6932 frostHunterAdapterDelegatePhantomTitanium6932, FrostHunterAnimatorSetThunderSpark5581 frostHunterAnimatorSetThunderSpark5581) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
        frostHunterPropertyValuesHolderMaxSpeed2945.getClass();
        frostHunterAnimatorSetThunderSpark5581.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(frostHunterPropertyValuesHolderMaxSpeed2945, frostHunterAdapterDelegatePhantomTitanium6932, frostHunterAnimatorSetThunderSpark5581);
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, FrostHunterMenuUltraHyperion3040 frostHunterMenuUltraHyperion3040, String str, Bundle bundle) {
    }
}
