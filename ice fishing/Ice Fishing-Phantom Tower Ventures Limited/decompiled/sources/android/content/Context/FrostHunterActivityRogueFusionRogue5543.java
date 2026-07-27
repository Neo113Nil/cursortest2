package android.content.Context;

import android.os.IBinder;
import android.os.IInterface;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.EventResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.SessionResponseData;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActivityRogueFusionRogue5543 implements Runnable {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterActivityRogueFusionRogue5543(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.FrostHunterAlertDialogAuroraDelta3200).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.FrostHunterAlertDialogAuroraDelta3200 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        android.content.Context.FrostHunterDrawableTurboPrimeNova5225.FrostHunterServiceConnectionTurboPhoenixOmega6719.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.FrostHunterAlertDialogAuroraDelta3200), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809) {
                    if (!z) {
                        FrostHunterDrawableTurboPrimeNova5225 frostHunterDrawableTurboPrimeNova5225 = (FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809;
                        if (frostHunterDrawableTurboPrimeNova5225.FrostHunterAlertDialogAuroraDelta3200 != 4) {
                            frostHunterDrawableTurboPrimeNova5225.FrostHunterKeyframeGammaGamma1197++;
                            frostHunterDrawableTurboPrimeNova5225.FrostHunterAlertDialogAuroraDelta3200 = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809.poll();
                    this.FrostHunterAlertDialogAuroraDelta3200 = runnable;
                    if (runnable == null) {
                        ((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200 = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        List list;
        boolean z;
        List list2;
        List list3;
        Runnable runnable;
        List list4;
        FrostHunterFlowBlazeVision5301 frostHunterFlowBlazeVision5301;
        int i = 0;
        FrostHunterFlowBlazeVision5301 frostHunterFlowBlazeVision53012 = null;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).launchSessionResponseTasksI((SessionResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 1:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).launchAttributionResponseTasksI((AttributionResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 2:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 3:
                ((OnDeeplinkResolvedListener) this.FrostHunterAlertDialogAuroraDelta3200).onDeeplinkResolved(((SdkClickResponseData) this.FrostHunterFlowMaxDragonHero5809).resolvedDeeplink);
                return;
            case 4:
                ((PurchaseVerificationResponseData) this.FrostHunterAlertDialogAuroraDelta3200).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.FrostHunterFlowMaxDragonHero5809);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                ((OnDeeplinkResolvedListener) this.FrostHunterAlertDialogAuroraDelta3200).onDeeplinkResolved((String) this.FrostHunterFlowMaxDragonHero5809);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).sendLicenseVerificationDataI((LicenseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).launchEventResponseTasksI((EventResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).launchSdkClickResponseTasksI((SdkClickResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 9:
                ((OnAdidReadListener) ((FrostHunterNavigationTitanMaxPrime1914) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFragmentBetaMegaVortex6025).onAdidRead((String) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 10:
                ((OnAttributionReadListener) ((FrostHunterNavigationTitanMaxPrime1914) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFragmentBetaMegaVortex6025).onAttributionRead((AdjustAttribution) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 11:
                ((AsyncTaskExecutor) ((FrostHunterTabLayoutPixelMax9400) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197).onPostExecute(this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 12:
                AttributionHandler attributionHandler = (AttributionHandler) this.FrostHunterFlowMaxDragonHero5809;
                weakReference = attributionHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 13:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.FrostHunterFlowMaxDragonHero5809;
                weakReference2 = attributionHandler2.activityHandlerWeakRef;
                IActivityHandler iActivityHandler2 = (IActivityHandler) weakReference2.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 14:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.FrostHunterFlowMaxDragonHero5809;
                weakReference3 = attributionHandler3.activityHandlerWeakRef;
                IActivityHandler iActivityHandler3 = (IActivityHandler) weakReference3.get();
                if (iActivityHandler3 == null) {
                    return;
                }
                attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 15:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.FrostHunterFlowMaxDragonHero5809;
                weakReference4 = attributionHandler4.activityHandlerWeakRef;
                IActivityHandler iActivityHandler4 = (IActivityHandler) weakReference4.get();
                if (iActivityHandler4 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.FrostHunterAlertDialogAuroraDelta3200;
                if (responseData.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler4.gotOptOutResponse();
                    return;
                } else {
                    if (responseData instanceof AttributionResponseData) {
                        attributionHandler4.checkAttributionResponseI(iActivityHandler4, (AttributionResponseData) responseData);
                        return;
                    }
                    return;
                }
            case 16:
                return;
            case 17:
                break;
            case 18:
                ((PackageHandler) this.FrostHunterFlowMaxDragonHero5809).addI((ActivityPackage) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 19:
                ((PackageHandler) this.FrostHunterFlowMaxDragonHero5809).sendNextI(((ResponseData) this.FrostHunterAlertDialogAuroraDelta3200).continueIn);
                return;
            case 20:
                ((PurchaseVerificationHandler) this.FrostHunterFlowMaxDragonHero5809).sendPurchaseVerificationPackageI((ActivityPackage) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 21:
                ((FrostHunterTransitionManagerNeoTitanTitan4580) this.FrostHunterAlertDialogAuroraDelta3200).accept(this.FrostHunterFlowMaxDragonHero5809);
                return;
            case 22:
                ((FrostHunterSQLiteUltraElite7894) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCardViewSpectraCyber7714((FrostHunterNavigationSparkNeoTitan8957) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 23:
                try {
                    FrostHunterAlphaAnimationNeoCosmos5761();
                    return;
                } catch (Error e) {
                    synchronized (((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809) {
                        ((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200 = 1;
                        throw e;
                    }
                }
            case 24:
                ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).tryExecuteRunnable((Runnable) this.FrostHunterAlertDialogAuroraDelta3200);
                while (true) {
                    list = ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).queue;
                    synchronized (list) {
                        try {
                            z = ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).isTeardown;
                            if (z) {
                                return;
                            }
                            list2 = ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).queue;
                            boolean isEmpty = list2.isEmpty();
                            SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809;
                            if (isEmpty) {
                                singleThreadCachedScheduler.isThreadProcessing = false;
                                return;
                            }
                            list3 = singleThreadCachedScheduler.queue;
                            runnable = (Runnable) list3.get(0);
                            list4 = ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).queue;
                            list4.remove(0);
                        } finally {
                        }
                    }
                    ((SingleThreadCachedScheduler) this.FrostHunterFlowMaxDragonHero5809).tryExecuteRunnable(runnable);
                }
            case 25:
                ConnectionResult connectionResult = (ConnectionResult) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterBottomSheetEpicStrikeStrike8477 frostHunterBottomSheetEpicStrikeStrike8477 = (FrostHunterBottomSheetEpicStrikeStrike8477) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterAdapterHeroEclipseHyper5814 frostHunterAdapterHeroEclipseHyper5814 = (FrostHunterAdapterHeroEclipseHyper5814) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterFlowMaxDragonHero5809;
                FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon7641 = (FrostHunterFlowEpicDragon7641) ((FrostHunterIntentOlympianForceHyper2206) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterServiceConnectionTurboPhoenixOmega6719).FrostHunterLintTitanVortexQuantum9911.get((FrostHunterLiveDataAuroraPhoenix5491) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterAlertDialogAuroraDelta3200);
                if (frostHunterFlowEpicDragon7641 == null) {
                    return;
                }
                if (connectionResult.FrostHunterFlowMaxDragonHero5809 != 0) {
                    frostHunterFlowEpicDragon7641.FrostHunterScaleAnimationStrikeSpark5059(connectionResult, null);
                    return;
                }
                frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterCameraXPixelTurboCosmos9814 = true;
                if (frostHunterAdapterHeroEclipseHyper5814.FrostHunterFragmentBetaMegaVortex6025()) {
                    if (!frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterCameraXPixelTurboCosmos9814 || (frostHunterFlowBlazeVision5301 = (FrostHunterFlowBlazeVision5301) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterKeyframeGammaGamma1197) == null) {
                        return;
                    }
                    frostHunterAdapterHeroEclipseHyper5814.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFlowBlazeVision5301, (Set) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterFragmentBetaMegaVortex6025);
                    return;
                }
                try {
                    frostHunterAdapterHeroEclipseHyper5814.FrostHunterConstraintSetCloneMasterUltraRogue2633(null, frostHunterAdapterHeroEclipseHyper5814.FrostHunterBundlePulseFusionHero2475());
                    return;
                } catch (SecurityException unused) {
                    frostHunterAdapterHeroEclipseHyper5814.FrostHunterServiceEliteCelestialThunder1757("Failed to get service from broker.");
                    frostHunterFlowEpicDragon7641.FrostHunterScaleAnimationStrikeSpark5059(new ConnectionResult(10), null);
                    return;
                }
            case 26:
                FrostHunterDatabaseNebulaSpectraNebula7977 frostHunterDatabaseNebulaSpectraNebula7977 = (FrostHunterDatabaseNebulaSpectraNebula7977) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterFlingGestureShadowMegaHyperion8241 frostHunterFlingGestureShadowMegaHyperion8241 = (FrostHunterFlingGestureShadowMegaHyperion8241) this.FrostHunterAlertDialogAuroraDelta3200;
                ConnectionResult connectionResult2 = frostHunterFlingGestureShadowMegaHyperion8241.FrostHunterFlowMaxDragonHero5809;
                if (connectionResult2.FrostHunterFlowMaxDragonHero5809 == 0) {
                    FrostHunterDelayHyperionBetaBeta1195 frostHunterDelayHyperionBetaBeta1195 = frostHunterFlingGestureShadowMegaHyperion8241.FrostHunterAlertDialogAuroraDelta3200;
                    FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(frostHunterDelayHyperionBetaBeta1195);
                    ConnectionResult connectionResult3 = frostHunterDelayHyperionBetaBeta1195.FrostHunterAlertDialogAuroraDelta3200;
                    if (connectionResult3.FrostHunterFlowMaxDragonHero5809 != 0) {
                        String valueOf = String.valueOf(connectionResult3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(connectionResult3);
                        frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterFlowMaxDragonHero5809.FrostHunterLightSensorForceFusion4241();
                        return;
                    }
                    FrostHunterBottomSheetEpicStrikeStrike8477 frostHunterBottomSheetEpicStrikeStrike84772 = frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterAlertDialogAuroraDelta3200;
                    IBinder iBinder = frostHunterDelayHyperionBetaBeta1195.FrostHunterFlowMaxDragonHero5809;
                    if (iBinder != null) {
                        int i2 = FrostHunterGradlePluginQuantumNebulaThunder2592.FrostHunterServiceEliteCelestialThunder1757;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        frostHunterFlowBlazeVision53012 = queryLocalInterface instanceof FrostHunterFlowBlazeVision5301 ? (FrostHunterFlowBlazeVision5301) queryLocalInterface : new FrostHunterPreviewInfernoFusion6094(iBinder);
                    }
                    Set set = frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterRemoteConfigSpeedSpeed8566;
                    frostHunterBottomSheetEpicStrikeStrike84772.getClass();
                    if (frostHunterFlowBlazeVision53012 == null || set == null) {
                        new Exception();
                        frostHunterBottomSheetEpicStrikeStrike84772.FrostHunterConstraintSetCloneMasterUltraRogue2633(new ConnectionResult(4));
                    } else {
                        frostHunterBottomSheetEpicStrikeStrike84772.FrostHunterKeyframeGammaGamma1197 = frostHunterFlowBlazeVision53012;
                        frostHunterBottomSheetEpicStrikeStrike84772.FrostHunterFragmentBetaMegaVortex6025 = set;
                        if (frostHunterBottomSheetEpicStrikeStrike84772.FrostHunterCameraXPixelTurboCosmos9814) {
                            ((FrostHunterAdapterHeroEclipseHyper5814) frostHunterBottomSheetEpicStrikeStrike84772.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFlowBlazeVision53012, set);
                        }
                    }
                } else {
                    frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(connectionResult2);
                }
                frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterFlowMaxDragonHero5809.FrostHunterLightSensorForceFusion4241();
                return;
            case 27:
                boolean z2 = ((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterDatabaseLegendPixel2187 frostHunterDatabaseLegendPixel2187 = (FrostHunterDatabaseLegendPixel2187) this.FrostHunterFlowMaxDragonHero5809;
                if (z2) {
                    frostHunterDatabaseLegendPixel2187.FrostHunterKeyframeGammaGamma1197.FrostHunterFragmentBetaMegaVortex6025();
                    return;
                }
                try {
                    ((FrostHunterDatabaseLegendPixel2187) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197.FrostHunterKeyframeGammaGamma1197(frostHunterDatabaseLegendPixel2187.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterAlertDialogAuroraDelta3200));
                    return;
                } catch (FrostHunterManifestUltraNeoMaster3003 e2) {
                    boolean z3 = e2.getCause() instanceof Exception;
                    FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716 = ((FrostHunterDatabaseLegendPixel2187) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197;
                    if (z3) {
                        frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlertDialogAuroraDelta3200((Exception) e2.getCause());
                        return;
                    } else {
                        frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlertDialogAuroraDelta3200(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((FrostHunterDatabaseLegendPixel2187) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197.FrostHunterAlertDialogAuroraDelta3200(e3);
                    return;
                }
            case 28:
                FrostHunterDatabaseLegendPixel2187 frostHunterDatabaseLegendPixel21872 = (FrostHunterDatabaseLegendPixel2187) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra17162 = frostHunterDatabaseLegendPixel21872.FrostHunterKeyframeGammaGamma1197;
                try {
                    FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra17163 = (FrostHunterGradientDrawablePrimeSpectraUltra1716) frostHunterDatabaseLegendPixel21872.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterAlertDialogAuroraDelta3200);
                    if (frostHunterGradientDrawablePrimeSpectraUltra17163 == null) {
                        frostHunterDatabaseLegendPixel21872.FrostHunterServiceEliteCelestialThunder1757(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    FrostHunterPushNotificationUltraQuantum3493 frostHunterPushNotificationUltraQuantum3493 = frostHunterGradientDrawablePrimeSpectraUltra17163.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterTextInputEditTextBetaTitanDelta2402 frostHunterTextInputEditTextBetaTitanDelta2402 = FrostHunterServiceOlympianTitanPhantom8748.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    frostHunterGradientDrawablePrimeSpectraUltra17163.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterTextInputEditTextBetaTitanDelta2402, frostHunterDatabaseLegendPixel21872);
                    frostHunterPushNotificationUltraQuantum3493.FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterServiceConnectionGammaMax9245((Executor) frostHunterTextInputEditTextBetaTitanDelta2402, (FrostHunterCrashlyticsBlazeDragon4282) frostHunterDatabaseLegendPixel21872));
                    frostHunterGradientDrawablePrimeSpectraUltra17163.FrostHunterLightSensorForceFusion4241();
                    frostHunterPushNotificationUltraQuantum3493.FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterServiceConnectionGammaMax9245((Executor) frostHunterTextInputEditTextBetaTitanDelta2402, (FrostHunterFlatMapVisionVortex6512) frostHunterDatabaseLegendPixel21872));
                    frostHunterGradientDrawablePrimeSpectraUltra17163.FrostHunterLightSensorForceFusion4241();
                    return;
                } catch (FrostHunterManifestUltraNeoMaster3003 e4) {
                    if (e4.getCause() instanceof Exception) {
                        frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterAlertDialogAuroraDelta3200((Exception) e4.getCause());
                        return;
                    } else {
                        frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterAlertDialogAuroraDelta3200(e4);
                        return;
                    }
                } catch (Exception e5) {
                    frostHunterGradientDrawablePrimeSpectraUltra17162.FrostHunterAlertDialogAuroraDelta3200(e5);
                    return;
                }
            default:
                synchronized (((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200) {
                    ((FrostHunterLocationManagerEpicAlphaQuantum9711) ((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197).FrostHunterTextViewDragonStormMega4297((FrostHunterGradientDrawablePrimeSpectraUltra1716) this.FrostHunterAlertDialogAuroraDelta3200);
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.FrostHunterAlertDialogAuroraDelta3200).run();
            } catch (Throwable th) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterStateCelestialNovaPixel8414(FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814, th);
            }
            Runnable FrostHunterStateCelestialNovaPixel8414 = ((FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305) this.FrostHunterFlowMaxDragonHero5809).FrostHunterStateCelestialNovaPixel8414();
            if (FrostHunterStateCelestialNovaPixel8414 == null) {
                return;
            }
            try {
                this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterStateCelestialNovaPixel8414;
                i++;
                if (i >= 16) {
                    FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305 frostHunterRealtimeDatabaseAlphaPrimeEclipse1305 = (FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305) this.FrostHunterFlowMaxDragonHero5809;
                    if (FrostHunterBindingAdapterSpeedNeo6677.FrostHunterMagnetometerFusionTitanium8202(frostHunterRealtimeDatabaseAlphaPrimeEclipse1305.FrostHunterKeyframeGammaGamma1197, frostHunterRealtimeDatabaseAlphaPrimeEclipse1305)) {
                        FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305 frostHunterRealtimeDatabaseAlphaPrimeEclipse13052 = (FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305) this.FrostHunterFlowMaxDragonHero5809;
                        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterStateCelestialNovaPixel8414(frostHunterRealtimeDatabaseAlphaPrimeEclipse13052.FrostHunterKeyframeGammaGamma1197, frostHunterRealtimeDatabaseAlphaPrimeEclipse13052, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305 frostHunterRealtimeDatabaseAlphaPrimeEclipse13053 = (FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterRealtimeDatabaseAlphaPrimeEclipse13053.FrostHunterLightSensorForceFusion4241) {
                    FrostHunterRealtimeDatabaseAlphaPrimeEclipse1305.FrostHunterScaleAnimationStrikeSpark5059.decrementAndGet(frostHunterRealtimeDatabaseAlphaPrimeEclipse13053);
                    throw th2;
                }
            }
        }
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 23:
                Runnable runnable = (Runnable) this.FrostHunterAlertDialogAuroraDelta3200;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((FrostHunterDrawableTurboPrimeNova5225) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterActivityRogueFusionRogue5543(int i, Object obj, Object obj2, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = obj2;
    }

    public FrostHunterActivityRogueFusionRogue5543(FrostHunterDrawableTurboPrimeNova5225 frostHunterDrawableTurboPrimeNova5225) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 23;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDrawableTurboPrimeNova5225;
    }
}
