package android.content.Context;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterChipGroupStrikeGamma3226 implements FrostHunterPaintMaxElite5100 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterChipGroupStrikeGamma3226(int i, Object obj, Object obj2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
        this.FrostHunterBundlePulseFusionHero2475 = obj2;
    }

    @Override // android.content.Context.FrostHunterPaintMaxElite5100
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        boolean isTerminated;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = this.FrostHunterBundlePulseFusionHero2475;
        Object obj2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((FrostHunterActionBarOmegaNebulaCyber1524) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((FrostHunterViewPagerEclipseTitaniumPhoenix4285) obj);
                break;
            case 2:
                FrostHunterPaintNebulaAuroraRogue3863 frostHunterPaintNebulaAuroraRogue3863 = (FrostHunterPaintNebulaAuroraRogue3863) obj2;
                FrostHunterAsyncPulseSparkVision4752 frostHunterAsyncPulseSparkVision4752 = (FrostHunterAsyncPulseSparkVision4752) obj;
                if (frostHunterPaintNebulaAuroraRogue3863.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                    if (frostHunterPaintNebulaAuroraRogue3863.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Unreachable");
                        break;
                    } else {
                        FrostHunterAccelerometerNeoUltra2966 frostHunterAccelerometerNeoUltra2966 = frostHunterAsyncPulseSparkVision4752.FrostHunterAlphaAnimationNeoCosmos5761;
                        ArrayList arrayList = frostHunterAccelerometerNeoUltra2966.FrostHunterAlphaAnimationNeoCosmos5761;
                        CopyOnWriteArrayList copyOnWriteArrayList = frostHunterAccelerometerNeoUltra2966.FrostHunterBundlePulseFusionHero2475;
                        Iterator it = copyOnWriteArrayList.iterator();
                        it.getClass();
                        while (true) {
                            int i2 = 0;
                            if (!it.hasNext()) {
                                copyOnWriteArrayList.clear();
                                int size = arrayList.size();
                                while (i2 < size) {
                                    Object obj3 = arrayList.get(i2);
                                    i2++;
                                    ((FrostHunterDragEventStormCyberBeta5838) obj3).FrostHunterLifecycleBlazeGammaElite2889();
                                }
                                arrayList.clear();
                                break;
                            } else {
                                AutoCloseable autoCloseable = (AutoCloseable) it.next();
                                if (!(autoCloseable instanceof AutoCloseable)) {
                                    if (!(autoCloseable instanceof ExecutorService)) {
                                        if (!(autoCloseable instanceof TypedArray)) {
                                            if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                                                if (!(autoCloseable instanceof MediaDrm)) {
                                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                                                    break;
                                                } else {
                                                    ((MediaDrm) autoCloseable).release();
                                                }
                                            } else {
                                                ((MediaMetadataRetriever) autoCloseable).release();
                                            }
                                        } else {
                                            ((TypedArray) autoCloseable).recycle();
                                        }
                                    } else {
                                        ExecutorService executorService = (ExecutorService) autoCloseable;
                                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            while (!isTerminated) {
                                                try {
                                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (i2 == 0) {
                                                        executorService.shutdownNow();
                                                        i2 = 1;
                                                    }
                                                }
                                            }
                                            if (i2 != 0) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                } else {
                                    autoCloseable.close();
                                }
                            }
                        }
                    }
                } else {
                    frostHunterAsyncPulseSparkVision4752.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterLifecycleBlazeGammaElite2889();
                    break;
                }
                break;
            case 3:
                ((FrostHunterLinearLayoutInfernoStorm9299) obj2).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809((FrostHunterChipGroupThunderDragon5019) obj);
                break;
            case 4:
                ((FrostHunterNotificationSpectraTurbo8770) obj2).FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterLevelListDrawableFusionDragonHero2232((FrostHunterObserverBlazeVisionCyber3504) obj);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                ((FrostHunterFirebasePulsePulse6596) obj2).FrostHunterAlertDialogAuroraDelta3200.remove((FrostHunterFirebasePulsePulse6596) obj);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                FrostHunterFirebasePulsePulse6596 frostHunterFirebasePulsePulse6596 = (FrostHunterFirebasePulsePulse6596) obj2;
                FrostHunterAccelerometerThunderElite2172 frostHunterAccelerometerThunderElite2172 = (FrostHunterAccelerometerThunderElite2172) ((FrostHunterActionBarMaxAlpha1686) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633.getValue();
                if (frostHunterAccelerometerThunderElite2172 != null) {
                    frostHunterFirebasePulsePulse6596.FrostHunterFlowMaxDragonHero5809.remove(frostHunterAccelerometerThunderElite2172.FrostHunterCameraXPixelTurboCosmos9814);
                    break;
                }
                break;
            default:
                FrostHunterCameraSelectorQuantumTitaniumTitanium8224 frostHunterCameraSelectorQuantumTitaniumTitanium8224 = (FrostHunterCameraSelectorQuantumTitaniumTitanium8224) obj2;
                View view = (View) obj;
                int i3 = frostHunterCameraSelectorQuantumTitaniumTitanium8224.FrostHunterResourcesTitanHyperVision5823 - 1;
                frostHunterCameraSelectorQuantumTitaniumTitanium8224.FrostHunterResourcesTitanHyperVision5823 = i3;
                if (i3 == 0) {
                    int i4 = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterStrictModePhantomQuantumCelestial6608.FrostHunterConstraintSetCloneMasterUltraRogue2633(view, null);
                    FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterConstraintSetCloneMasterUltraRogue2633(view, null);
                    view.removeOnAttachStateChangeListener(frostHunterCameraSelectorQuantumTitaniumTitanium8224.FrostHunterTextViewDragonStormMega4297);
                    break;
                }
                break;
        }
    }
}
