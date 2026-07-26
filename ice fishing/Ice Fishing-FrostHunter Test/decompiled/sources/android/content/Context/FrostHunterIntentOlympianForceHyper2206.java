package android.content.Context;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterIntentOlympianForceHyper2206 implements Handler.Callback {
    public static FrostHunterIntentOlympianForceHyper2206 FrostHunterLooperHyperionForce4133;
    public FrostHunterBarcodeScannerCyberShadowEpic9339 FrostHunterAlertDialogAuroraDelta3200;
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterEditTextPhoenixMaster1089 FrostHunterCameraXTurboCelestialHero5430;
    public final AtomicInteger FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public boolean FrostHunterFlowMaxDragonHero5809;
    public final Context FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterLiveDataScopeDragonSolar5865 FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterProximitySensorEpicSolar3138 FrostHunterLightSensorForceFusion4241;
    public final ConcurrentHashMap FrostHunterLintTitanVortexQuantum9911;
    public volatile boolean FrostHunterLooperThreadBetaHyperionMax1000;
    public final FrostHunterEditTextPhoenixMaster1089 FrostHunterResourcesTitanHyperVision5823;
    public final AtomicInteger FrostHunterScaleAnimationStrikeSpark5059;
    public final FrostHunterFragmentLegendHyperion4464 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterValueAnimatorHyperNebulaUltra9912 FrostHunterTextViewDragonStormMega4297;
    public static final Status FrostHunterMotionSceneAuroraMega2271 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status FrostHunterBitmapTurboDeltaNebula8743 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object FrostHunterDialogFragmentTurboPhoenixDragon7627 = new Object();

    public FrostHunterIntentOlympianForceHyper2206(Context context, Looper looper) {
        FrostHunterFragmentLegendHyperion4464 frostHunterFragmentLegendHyperion4464 = FrostHunterFragmentLegendHyperion4464.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 10000L;
        this.FrostHunterFlowMaxDragonHero5809 = false;
        this.FrostHunterScaleAnimationStrikeSpark5059 = new AtomicInteger(1);
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new AtomicInteger(0);
        this.FrostHunterLintTitanVortexQuantum9911 = new ConcurrentHashMap(5, 0.75f, 1);
        this.FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterEditTextPhoenixMaster1089(0);
        this.FrostHunterResourcesTitanHyperVision5823 = new FrostHunterEditTextPhoenixMaster1089(0);
        this.FrostHunterLooperThreadBetaHyperionMax1000 = true;
        this.FrostHunterFragmentBetaMegaVortex6025 = context;
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = new FrostHunterValueAnimatorHyperNebulaUltra9912(looper, this);
        this.FrostHunterTextViewDragonStormMega4297 = frostHunterValueAnimatorHyperNebulaUltra9912;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterFragmentLegendHyperion4464;
        this.FrostHunterLightSensorForceFusion4241 = new FrostHunterProximitySensorEpicSolar3138(11);
        PackageManager packageManager = context.getPackageManager();
        if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterAlertDialogAuroraDelta3200 == null) {
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterAlertDialogAuroraDelta3200 = Boolean.valueOf(FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterAlertDialogAuroraDelta3200.booleanValue()) {
            this.FrostHunterLooperThreadBetaHyperionMax1000 = false;
        }
        frostHunterValueAnimatorHyperNebulaUltra9912.sendMessage(frostHunterValueAnimatorHyperNebulaUltra9912.obtainMessage(6));
    }

    public static Status FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLiveDataAuroraPhoenix5491 frostHunterLiveDataAuroraPhoenix5491, ConnectionResult connectionResult) {
        return new Status(17, "API: " + ((String) frostHunterLiveDataAuroraPhoenix5491.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlertDialogAuroraDelta3200) + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.FrostHunterAlertDialogAuroraDelta3200, connectionResult);
    }

    public static FrostHunterIntentOlympianForceHyper2206 FrostHunterServiceEliteCelestialThunder1757(Context context) {
        FrostHunterIntentOlympianForceHyper2206 frostHunterIntentOlympianForceHyper2206;
        HandlerThread handlerThread;
        synchronized (FrostHunterDialogFragmentTurboPhoenixDragon7627) {
            if (FrostHunterLooperHyperionForce4133 == null) {
                synchronized (FrostHunterTextRecognitionNebulaUltraHero1792.FrostHunterRemoteConfigSpeedSpeed8566) {
                    try {
                        handlerThread = FrostHunterTextRecognitionNebulaUltraHero1792.FrostHunterFlowMaxDragonHero5809;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            FrostHunterTextRecognitionNebulaUltraHero1792.FrostHunterFlowMaxDragonHero5809 = handlerThread2;
                            handlerThread2.start();
                            handlerThread = FrostHunterTextRecognitionNebulaUltraHero1792.FrostHunterFlowMaxDragonHero5809;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = FrostHunterFragmentLegendHyperion4464.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterLooperHyperionForce4133 = new FrostHunterIntentOlympianForceHyper2206(applicationContext, looper);
            }
            frostHunterIntentOlympianForceHyper2206 = FrostHunterLooperHyperionForce4133;
        }
        return frostHunterIntentOlympianForceHyper2206;
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(ConnectionResult connectionResult, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        FrostHunterFragmentLegendHyperion4464 frostHunterFragmentLegendHyperion4464 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        Context context = this.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterFragmentLegendHyperion4464.getClass();
        synchronized (FrostHunterBindingAdapterSpeedNeo6677.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterAlphaAnimationNeoCosmos5761;
            if (context2 != null && (bool = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
            if (FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Boolean.FALSE;
                }
            }
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterAlphaAnimationNeoCosmos5761 = applicationContext;
            booleanValue = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = connectionResult.FrostHunterFlowMaxDragonHero5809;
        if ((i2 == 0 || connectionResult.FrostHunterAlertDialogAuroraDelta3200 == null) ? false : true) {
            activity = connectionResult.FrostHunterAlertDialogAuroraDelta3200;
        } else {
            Intent FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFragmentLegendHyperion4464.FrostHunterAlphaAnimationNeoCosmos5761(i2, context, null);
            activity = FrostHunterAlphaAnimationNeoCosmos5761 != null ? PendingIntent.getActivity(context, 0, FrostHunterAlphaAnimationNeoCosmos5761, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = connectionResult.FrostHunterFlowMaxDragonHero5809;
        int i4 = GoogleApiActivity.FrostHunterFlowMaxDragonHero5809;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        frostHunterFragmentLegendHyperion4464.FrostHunterLevelListDrawableFusionDragonHero2232(context, i3, PendingIntent.getActivity(context, 0, intent, FrostHunterThreadStrikeStrike9467.FrostHunterAlphaAnimationNeoCosmos5761 | 134217728));
        return true;
    }

    public final FrostHunterFlowEpicDragon7641 FrostHunterBundlePulseFusionHero2475(FrostHunterLiveDataScopeDragonSolar5865 frostHunterLiveDataScopeDragonSolar5865) {
        FrostHunterLiveDataAuroraPhoenix5491 frostHunterLiveDataAuroraPhoenix5491 = frostHunterLiveDataScopeDragonSolar5865.FrostHunterLifecycleBlazeGammaElite2889;
        ConcurrentHashMap concurrentHashMap = this.FrostHunterLintTitanVortexQuantum9911;
        FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon7641 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(frostHunterLiveDataAuroraPhoenix5491);
        if (frostHunterFlowEpicDragon7641 == null) {
            frostHunterFlowEpicDragon7641 = new FrostHunterFlowEpicDragon7641(this, frostHunterLiveDataScopeDragonSolar5865);
            concurrentHashMap.put(frostHunterLiveDataAuroraPhoenix5491, frostHunterFlowEpicDragon7641);
        }
        if (frostHunterFlowEpicDragon7641.FrostHunterServiceEliteCelestialThunder1757.FrostHunterFragmentBetaMegaVortex6025()) {
            this.FrostHunterResourcesTitanHyperVision5823.add(frostHunterLiveDataAuroraPhoenix5491);
        }
        frostHunterFlowEpicDragon7641.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        return frostHunterFlowEpicDragon7641;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(ConnectionResult connectionResult, int i) {
        if (FrostHunterAlphaAnimationNeoCosmos5761(connectionResult, i)) {
            return;
        }
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = this.FrostHunterTextViewDragonStormMega4297;
        frostHunterValueAnimatorHyperNebulaUltra9912.sendMessage(frostHunterValueAnimatorHyperNebulaUltra9912.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        if (r0 != 0) goto L83;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon7641;
        FrostHunterContextBetaSpark7441[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326;
        FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan53262;
        Context context = this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterEditTextPhoenixMaster1089 frostHunterEditTextPhoenixMaster1089 = this.FrostHunterResourcesTitanHyperVision5823;
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = this.FrostHunterTextViewDragonStormMega4297;
        ConcurrentHashMap concurrentHashMap = this.FrostHunterLintTitanVortexQuantum9911;
        int i = 0;
        switch (message.what) {
            case 1:
                this.FrostHunterCameraXPixelTurboCosmos9814 = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                frostHunterValueAnimatorHyperNebulaUltra9912.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    frostHunterValueAnimatorHyperNebulaUltra9912.sendMessageDelayed(frostHunterValueAnimatorHyperNebulaUltra9912.obtainMessage(12, (FrostHunterLiveDataAuroraPhoenix5491) it.next()), this.FrostHunterCameraXPixelTurboCosmos9814);
                }
                return true;
            case 2:
                throw FrostHunterImageCaptureShadowGammaMax6416.FrostHunterConstraintSetCloneMasterUltraRogue2633(message.obj);
            case 3:
                for (FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76412 : concurrentHashMap.values()) {
                    FrostHunterCardViewHyperionAurora3829.FrostHunterKeyframeGammaGamma1197(frostHunterFlowEpicDragon76412.FrostHunterLightSensorForceFusion4241.FrostHunterTextViewDragonStormMega4297);
                    frostHunterFlowEpicDragon76412.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
                    frostHunterFlowEpicDragon76412.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                }
                return true;
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                FrostHunterRoomThunderPrimeSpectra7099 frostHunterRoomThunderPrimeSpectra7099 = (FrostHunterRoomThunderPrimeSpectra7099) message.obj;
                FrostHunterLiveDataScopeDragonSolar5865 frostHunterLiveDataScopeDragonSolar5865 = frostHunterRoomThunderPrimeSpectra7099.FrostHunterBundlePulseFusionHero2475;
                FrostHunterStateListAnimatorShadowUltra3222 frostHunterStateListAnimatorShadowUltra3222 = frostHunterRoomThunderPrimeSpectra7099.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76413 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(frostHunterLiveDataScopeDragonSolar5865.FrostHunterLifecycleBlazeGammaElite2889);
                if (frostHunterFlowEpicDragon76413 == null) {
                    frostHunterFlowEpicDragon76413 = FrostHunterBundlePulseFusionHero2475(frostHunterRoomThunderPrimeSpectra7099.FrostHunterBundlePulseFusionHero2475);
                }
                if (!frostHunterFlowEpicDragon76413.FrostHunterServiceEliteCelestialThunder1757.FrostHunterFragmentBetaMegaVortex6025() || this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get() == frostHunterRoomThunderPrimeSpectra7099.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    frostHunterFlowEpicDragon76413.FrostHunterLightSensorForceFusion4241(frostHunterStateListAnimatorShadowUltra3222);
                    return true;
                }
                frostHunterStateListAnimatorShadowUltra3222.FrostHunterBundlePulseFusionHero2475(FrostHunterMotionSceneAuroraMega2271);
                frostHunterFlowEpicDragon76413.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        frostHunterFlowEpicDragon7641 = (FrostHunterFlowEpicDragon7641) it2.next();
                        if (frostHunterFlowEpicDragon7641.FrostHunterFlowMaxDragonHero5809 == i2) {
                        }
                    } else {
                        frostHunterFlowEpicDragon7641 = null;
                    }
                }
                if (frostHunterFlowEpicDragon7641 == null) {
                    new Exception();
                    return true;
                }
                int i3 = connectionResult.FrostHunterFlowMaxDragonHero5809;
                if (i3 != 13) {
                    frostHunterFlowEpicDragon7641.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFlowEpicDragon7641.FrostHunterLifecycleBlazeGammaElite2889, connectionResult));
                    return true;
                }
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.getClass();
                AtomicBoolean atomicBoolean = FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterFlowEpicDragon7641.FrostHunterLifecycleBlazeGammaElite2889(new Status(17, "Error resolution was canceled by the user, original error message: " + ConnectionResult.FrostHunterAlphaAnimationNeoCosmos5761(i3) + ": " + connectionResult.FrostHunterKeyframeGammaGamma1197, null, null));
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                if (context.getApplicationContext() instanceof Application) {
                    FrostHunterFragmentVortexDeltaHero2456.FrostHunterAlphaAnimationNeoCosmos5761((Application) context.getApplicationContext());
                    FrostHunterFragmentVortexDeltaHero2456 frostHunterFragmentVortexDeltaHero2456 = FrostHunterFragmentVortexDeltaHero2456.FrostHunterFragmentBetaMegaVortex6025;
                    FrostHunterSharedPreferencesMegaHero3386 frostHunterSharedPreferencesMegaHero3386 = new FrostHunterSharedPreferencesMegaHero3386(this);
                    frostHunterFragmentVortexDeltaHero2456.getClass();
                    synchronized (frostHunterFragmentVortexDeltaHero2456) {
                        frostHunterFragmentVortexDeltaHero2456.FrostHunterAlertDialogAuroraDelta3200.add(frostHunterSharedPreferencesMegaHero3386);
                    }
                    AtomicBoolean atomicBoolean2 = frostHunterFragmentVortexDeltaHero2456.FrostHunterCameraXPixelTurboCosmos9814;
                    AtomicBoolean atomicBoolean3 = frostHunterFragmentVortexDeltaHero2456.FrostHunterFlowMaxDragonHero5809;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.FrostHunterCameraXPixelTurboCosmos9814 = 300000L;
                        return true;
                    }
                }
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                FrostHunterBundlePulseFusionHero2475((FrostHunterLiveDataScopeDragonSolar5865) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76414 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(message.obj);
                    FrostHunterCardViewHyperionAurora3829.FrostHunterKeyframeGammaGamma1197(frostHunterFlowEpicDragon76414.FrostHunterLightSensorForceFusion4241.FrostHunterTextViewDragonStormMega4297);
                    if (frostHunterFlowEpicDragon76414.FrostHunterKeyframeGammaGamma1197) {
                        frostHunterFlowEpicDragon76414.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                        return true;
                    }
                }
                return true;
            case 10:
                frostHunterEditTextPhoenixMaster1089.getClass();
                FrostHunterSharedElementEliteMaster1810 frostHunterSharedElementEliteMaster1810 = new FrostHunterSharedElementEliteMaster1810(frostHunterEditTextPhoenixMaster1089);
                while (frostHunterSharedElementEliteMaster1810.hasNext()) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76415 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.remove((FrostHunterLiveDataAuroraPhoenix5491) frostHunterSharedElementEliteMaster1810.next());
                    if (frostHunterFlowEpicDragon76415 != null) {
                        frostHunterFlowEpicDragon76415.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                    }
                }
                frostHunterEditTextPhoenixMaster1089.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76416 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(message.obj);
                    FrostHunterIntentOlympianForceHyper2206 frostHunterIntentOlympianForceHyper2206 = frostHunterFlowEpicDragon76416.FrostHunterLightSensorForceFusion4241;
                    FrostHunterCardViewHyperionAurora3829.FrostHunterKeyframeGammaGamma1197(frostHunterIntentOlympianForceHyper2206.FrostHunterTextViewDragonStormMega4297);
                    boolean z = frostHunterFlowEpicDragon76416.FrostHunterKeyframeGammaGamma1197;
                    if (z) {
                        FrostHunterLiveDataAuroraPhoenix5491 frostHunterLiveDataAuroraPhoenix5491 = frostHunterFlowEpicDragon76416.FrostHunterLifecycleBlazeGammaElite2889;
                        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra99122 = frostHunterFlowEpicDragon76416.FrostHunterLightSensorForceFusion4241.FrostHunterTextViewDragonStormMega4297;
                        if (z) {
                            frostHunterValueAnimatorHyperNebulaUltra99122.removeMessages(11, frostHunterLiveDataAuroraPhoenix5491);
                            frostHunterValueAnimatorHyperNebulaUltra99122.removeMessages(9, frostHunterLiveDataAuroraPhoenix5491);
                            frostHunterFlowEpicDragon76416.FrostHunterKeyframeGammaGamma1197 = false;
                        }
                        frostHunterFlowEpicDragon76416.FrostHunterLifecycleBlazeGammaElite2889(frostHunterIntentOlympianForceHyper2206.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterIntentOlympianForceHyper2206.FrostHunterFragmentBetaMegaVortex6025, FrostHunterFlipAnimationDragonTurbo1196.FrostHunterAlphaAnimationNeoCosmos5761) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        frostHunterFlowEpicDragon76416.FrostHunterServiceEliteCelestialThunder1757.FrostHunterServiceEliteCelestialThunder1757("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76417 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(message.obj);
                    FrostHunterCardViewHyperionAurora3829.FrostHunterKeyframeGammaGamma1197(frostHunterFlowEpicDragon76417.FrostHunterLightSensorForceFusion4241.FrostHunterTextViewDragonStormMega4297);
                    FrostHunterAdapterHeroEclipseHyper5814 frostHunterAdapterHeroEclipseHyper5814 = frostHunterFlowEpicDragon76417.FrostHunterServiceEliteCelestialThunder1757;
                    if (frostHunterAdapterHeroEclipseHyper5814.FrostHunterAlphaAnimationNeoCosmos5761() && frostHunterFlowEpicDragon76417.FrostHunterCameraXPixelTurboCosmos9814.size() == 0) {
                        FrostHunterProximitySensorEpicSolar3138 frostHunterProximitySensorEpicSolar3138 = frostHunterFlowEpicDragon76417.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (((Map) frostHunterProximitySensorEpicSolar3138.FrostHunterFlowMaxDragonHero5809).isEmpty() && ((Map) frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200).isEmpty()) {
                            frostHunterAdapterHeroEclipseHyper5814.FrostHunterServiceEliteCelestialThunder1757("Timing out service connection.");
                            return true;
                        }
                        frostHunterFlowEpicDragon76417.FrostHunterAlertDialogAuroraDelta3200();
                        return true;
                    }
                }
                return true;
            case 14:
                throw FrostHunterImageCaptureShadowGammaMax6416.FrostHunterConstraintSetCloneMasterUltraRogue2633(message.obj);
            case 15:
                FrostHunterImageAnalysisSparkOlympian6308 frostHunterImageAnalysisSparkOlympian6308 = (FrostHunterImageAnalysisSparkOlympian6308) message.obj;
                if (concurrentHashMap.containsKey(frostHunterImageAnalysisSparkOlympian6308.FrostHunterAlphaAnimationNeoCosmos5761)) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76418 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(frostHunterImageAnalysisSparkOlympian6308.FrostHunterAlphaAnimationNeoCosmos5761);
                    if (frostHunterFlowEpicDragon76418.FrostHunterFragmentBetaMegaVortex6025.contains(frostHunterImageAnalysisSparkOlympian6308) && !frostHunterFlowEpicDragon76418.FrostHunterKeyframeGammaGamma1197) {
                        if (frostHunterFlowEpicDragon76418.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761()) {
                            frostHunterFlowEpicDragon76418.FrostHunterRemoteConfigSpeedSpeed8566();
                            return true;
                        }
                        frostHunterFlowEpicDragon76418.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                        return true;
                    }
                }
                return true;
            case 16:
                FrostHunterImageAnalysisSparkOlympian6308 frostHunterImageAnalysisSparkOlympian63082 = (FrostHunterImageAnalysisSparkOlympian6308) message.obj;
                if (concurrentHashMap.containsKey(frostHunterImageAnalysisSparkOlympian63082.FrostHunterAlphaAnimationNeoCosmos5761)) {
                    FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76419 = (FrostHunterFlowEpicDragon7641) concurrentHashMap.get(frostHunterImageAnalysisSparkOlympian63082.FrostHunterAlphaAnimationNeoCosmos5761);
                    ArrayList arrayList = frostHunterFlowEpicDragon76419.FrostHunterFragmentBetaMegaVortex6025;
                    FrostHunterIntentOlympianForceHyper2206 frostHunterIntentOlympianForceHyper22062 = frostHunterFlowEpicDragon76419.FrostHunterLightSensorForceFusion4241;
                    LinkedList<FrostHunterAlphaAnimationVortexThunderSpark7384> linkedList = frostHunterFlowEpicDragon76419.FrostHunterBundlePulseFusionHero2475;
                    if (arrayList.remove(frostHunterImageAnalysisSparkOlympian63082)) {
                        frostHunterIntentOlympianForceHyper22062.FrostHunterTextViewDragonStormMega4297.removeMessages(15, frostHunterImageAnalysisSparkOlympian63082);
                        frostHunterIntentOlympianForceHyper22062.FrostHunterTextViewDragonStormMega4297.removeMessages(16, frostHunterImageAnalysisSparkOlympian63082);
                        FrostHunterContextBetaSpark7441 frostHunterContextBetaSpark7441 = frostHunterImageAnalysisSparkOlympian63082.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (FrostHunterAlphaAnimationVortexThunderSpark7384 frostHunterAlphaAnimationVortexThunderSpark7384 : linkedList) {
                            if (frostHunterAlphaAnimationVortexThunderSpark7384 != null && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAlphaAnimationVortexThunderSpark7384.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFlowEpicDragon76419)) != null) {
                                int length = FrostHunterConstraintSetCloneMasterUltraRogue2633.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    if (!FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(FrostHunterConstraintSetCloneMasterUltraRogue2633[i4], frostHunterContextBetaSpark7441)) {
                                        i4++;
                                    } else if (i4 >= 0) {
                                        arrayList2.add(frostHunterAlphaAnimationVortexThunderSpark7384);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i < size) {
                            FrostHunterAlphaAnimationVortexThunderSpark7384 frostHunterAlphaAnimationVortexThunderSpark73842 = (FrostHunterAlphaAnimationVortexThunderSpark7384) arrayList2.get(i);
                            linkedList.remove(frostHunterAlphaAnimationVortexThunderSpark73842);
                            frostHunterAlphaAnimationVortexThunderSpark73842.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterDebugAlphaStrikeOlympian7977(frostHunterContextBetaSpark7441));
                            i++;
                        }
                    }
                }
                return true;
            case 17:
                FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic9339 = this.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterBarcodeScannerCyberShadowEpic9339 != null) {
                    if (frostHunterBarcodeScannerCyberShadowEpic9339.FrostHunterCameraXPixelTurboCosmos9814 <= 0) {
                        if (!this.FrostHunterFlowMaxDragonHero5809) {
                            synchronized (FrostHunterChipSpeedTitan5326.class) {
                                try {
                                    if (FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809 == null) {
                                        FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809 = new FrostHunterChipSpeedTitan5326(i);
                                    }
                                    frostHunterChipSpeedTitan5326 = FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809;
                                } finally {
                                }
                            }
                            frostHunterChipSpeedTitan5326.getClass();
                            int i5 = ((SparseIntArray) this.FrostHunterLightSensorForceFusion4241.FrostHunterFlowMaxDragonHero5809).get(203400000, -1);
                            if (i5 != -1) {
                            }
                        }
                        this.FrostHunterAlertDialogAuroraDelta3200 = null;
                        return true;
                    }
                    if (this.FrostHunterKeyframeGammaGamma1197 == null) {
                        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLiveDataScopeDragonSolar5865(this.FrostHunterFragmentBetaMegaVortex6025);
                    }
                    this.FrostHunterKeyframeGammaGamma1197.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterBarcodeScannerCyberShadowEpic9339);
                    this.FrostHunterAlertDialogAuroraDelta3200 = null;
                    return true;
                }
                return true;
            case 18:
                ((FrostHunterLayerForceMaxCyber2071) message.obj).getClass();
                if (0 == 0) {
                    FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic93392 = new FrostHunterBarcodeScannerCyberShadowEpic9339(0, Arrays.asList(null));
                    if (this.FrostHunterKeyframeGammaGamma1197 == null) {
                        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLiveDataScopeDragonSolar5865(this.FrostHunterFragmentBetaMegaVortex6025);
                    }
                    this.FrostHunterKeyframeGammaGamma1197.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterBarcodeScannerCyberShadowEpic93392);
                    return true;
                }
                FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic93393 = this.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterBarcodeScannerCyberShadowEpic93393 != null) {
                    List list = frostHunterBarcodeScannerCyberShadowEpic93393.FrostHunterFlowMaxDragonHero5809;
                    if (frostHunterBarcodeScannerCyberShadowEpic93393.FrostHunterCameraXPixelTurboCosmos9814 != 0 || (list != null && list.size() >= 0)) {
                        frostHunterValueAnimatorHyperNebulaUltra9912.removeMessages(17);
                        FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic93394 = this.FrostHunterAlertDialogAuroraDelta3200;
                        if (frostHunterBarcodeScannerCyberShadowEpic93394 != null) {
                            if (frostHunterBarcodeScannerCyberShadowEpic93394.FrostHunterCameraXPixelTurboCosmos9814 <= 0) {
                                if (!this.FrostHunterFlowMaxDragonHero5809) {
                                    synchronized (FrostHunterChipSpeedTitan5326.class) {
                                        try {
                                            if (FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809 == null) {
                                                FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809 = new FrostHunterChipSpeedTitan5326(i);
                                            }
                                            frostHunterChipSpeedTitan53262 = FrostHunterChipSpeedTitan5326.FrostHunterFlowMaxDragonHero5809;
                                        } finally {
                                        }
                                    }
                                    frostHunterChipSpeedTitan53262.getClass();
                                    int i6 = ((SparseIntArray) this.FrostHunterLightSensorForceFusion4241.FrostHunterFlowMaxDragonHero5809).get(203400000, -1);
                                    if (i6 != -1) {
                                    }
                                }
                                this.FrostHunterAlertDialogAuroraDelta3200 = null;
                            }
                            if (this.FrostHunterKeyframeGammaGamma1197 == null) {
                                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLiveDataScopeDragonSolar5865(this.FrostHunterFragmentBetaMegaVortex6025);
                            }
                            this.FrostHunterKeyframeGammaGamma1197.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterBarcodeScannerCyberShadowEpic93394);
                            this.FrostHunterAlertDialogAuroraDelta3200 = null;
                        }
                    } else {
                        FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic93395 = this.FrostHunterAlertDialogAuroraDelta3200;
                        if (frostHunterBarcodeScannerCyberShadowEpic93395.FrostHunterFlowMaxDragonHero5809 == null) {
                            frostHunterBarcodeScannerCyberShadowEpic93395.FrostHunterFlowMaxDragonHero5809 = new ArrayList();
                        }
                        frostHunterBarcodeScannerCyberShadowEpic93395.FrostHunterFlowMaxDragonHero5809.add(null);
                    }
                }
                if (this.FrostHunterAlertDialogAuroraDelta3200 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterBarcodeScannerCyberShadowEpic9339(0, arrayList3);
                    frostHunterValueAnimatorHyperNebulaUltra9912.sendMessageDelayed(frostHunterValueAnimatorHyperNebulaUltra9912.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.FrostHunterFlowMaxDragonHero5809 = false;
                return true;
            default:
                return false;
        }
    }
}
