package android.content.Context;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPushNotificationUltraQuantum3493 implements FrostHunterKeyframeRogueStorm7563 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterPushNotificationUltraQuantum3493(FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565, FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr, boolean z) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterAnimatorQuantumFusionMaster8565;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterContextBetaSpark7441Arr;
        boolean z2 = false;
        if (frostHunterContextBetaSpark7441Arr != null && z) {
            z2 = true;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = z2;
    }

    @Override // android.content.Context.FrostHunterKeyframeRogueStorm7563
    /* renamed from: FrostHunterBundlePulseFusionHero2475, reason: merged with bridge method [inline-methods] */
    public FrostHunterMeteringPointDeltaPrimeSolar9676 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670) {
        MediaCodec mediaCodec;
        Object frostHunterTransitionRogueDelta1533;
        int i;
        FrostHunterMeteringPointDeltaPrimeSolar9676 frostHunterMeteringPointDeltaPrimeSolar9676;
        String str = ((FrostHunterStorageNovaXEliteAurora3066) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterMeteringPointDeltaPrimeSolar9676 frostHunterMeteringPointDeltaPrimeSolar96762 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.FrostHunterCameraXPixelTurboCosmos9814 || Build.VERSION.SDK_INT < 36) {
                    frostHunterTransitionRogueDelta1533 = new FrostHunterTransitionRogueDelta1533(mediaCodec, (HandlerThread) ((FrostHunterFlatMapSparkVortex7204) this.FrostHunterAlertDialogAuroraDelta3200).get());
                    i = 0;
                } else {
                    frostHunterTransitionRogueDelta1533 = new FrostHunterAnimatorQuantumFusionMaster8565(21, mediaCodec);
                    i = 4;
                }
                HandlerThread handlerThread = (HandlerThread) ((FrostHunterFlatMapSparkVortex7204) this.FrostHunterFlowMaxDragonHero5809).get();
                FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterMeteringPointDeltaPrimeSolar9676 = new FrostHunterMeteringPointDeltaPrimeSolar9676();
                frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterAlertDialogAuroraDelta3200 = mediaCodec;
                frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterKeyframeGammaGamma1197 = new FrostHunterAssetManagerCelestialShadowInferno9902(handlerThread);
                frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025 = frostHunterTransitionRogueDelta1533;
                frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterTraceHyperionAuroraNebula9947;
                frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLifecycleBlazeGammaElite2889;
                if (surface == null && ((FrostHunterStorageNovaXEliteAurora3066) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterCameraXPixelTurboCosmos9814 && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                FrostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterMeteringPointDeltaPrimeSolar9676, (MediaFormat) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterBundlePulseFusionHero2475, surface, (MediaCrypto) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232, i);
                return frostHunterMeteringPointDeltaPrimeSolar9676;
            } catch (Exception e2) {
                e = e2;
                frostHunterMeteringPointDeltaPrimeSolar96762 = frostHunterMeteringPointDeltaPrimeSolar9676;
                if (frostHunterMeteringPointDeltaPrimeSolar96762 != null) {
                    frostHunterMeteringPointDeltaPrimeSolar96762.FrostHunterAlphaAnimationNeoCosmos5761();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        Object obj;
        List list = (List) ((FrostHunterKotlinQuantumRogue5892) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTextViewDragonStormMega4297(((FrostHunterLightSensorRogueRogue1683) obj).FrostHunterAlphaAnimationNeoCosmos5761, j)) {
                break;
            }
            i++;
        }
        FrostHunterLightSensorRogueRogue1683 frostHunterLightSensorRogueRogue1683 = (FrostHunterLightSensorRogueRogue1683) obj;
        if (frostHunterLightSensorRogueRogue1683 != null) {
            return frostHunterLightSensorRogueRogue1683.FrostHunterCameraXPixelTurboCosmos9814;
        }
        return false;
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        FrostHunterRemoteModelManagerBlazeSpectraMax5028 frostHunterRemoteModelManagerBlazeSpectraMax5028;
        synchronized (this.FrostHunterFlowMaxDragonHero5809) {
            if (((ArrayDeque) this.FrostHunterAlertDialogAuroraDelta3200) != null && !this.FrostHunterCameraXPixelTurboCosmos9814) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = true;
                while (true) {
                    synchronized (this.FrostHunterFlowMaxDragonHero5809) {
                        try {
                            frostHunterRemoteModelManagerBlazeSpectraMax5028 = (FrostHunterRemoteModelManagerBlazeSpectraMax5028) ((ArrayDeque) this.FrostHunterAlertDialogAuroraDelta3200).poll();
                            if (frostHunterRemoteModelManagerBlazeSpectraMax5028 == null) {
                                this.FrostHunterCameraXPixelTurboCosmos9814 = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    frostHunterRemoteModelManagerBlazeSpectraMax5028.FrostHunterBundlePulseFusionHero2475(frostHunterGradientDrawablePrimeSpectraUltra1716);
                }
            }
        }
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterRemoteModelManagerBlazeSpectraMax5028 frostHunterRemoteModelManagerBlazeSpectraMax5028) {
        synchronized (this.FrostHunterFlowMaxDragonHero5809) {
            try {
                if (((ArrayDeque) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                    this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayDeque();
                }
                ((ArrayDeque) this.FrostHunterAlertDialogAuroraDelta3200).add(frostHunterRemoteModelManagerBlazeSpectraMax5028);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void FrostHunterServiceEliteCelestialThunder1757(FrostHunterAdapterHeroEclipseHyper5814 frostHunterAdapterHeroEclipseHyper5814, FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730) {
        FrostHunterBarcodeScannerCyberShadowEpic9339 frostHunterBarcodeScannerCyberShadowEpic9339 = (FrostHunterBarcodeScannerCyberShadowEpic9339) ((FrostHunterPlaceholderHeroDragonCyber3593) ((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterBitmapStrikeDragon3561 frostHunterBitmapStrikeDragon3561 = (FrostHunterBitmapStrikeDragon3561) ((FrostHunterBundleCyberInferno5464) frostHunterAdapterHeroEclipseHyper5814).FrostHunterLintTitanVortexQuantum9911();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(frostHunterBitmapStrikeDragon3561.FrostHunterServiceEliteCelestialThunder1757);
        int i = FrostHunterChipGroupLegendShadowEpic4100.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterBarcodeScannerCyberShadowEpic9339 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            frostHunterBarcodeScannerCyberShadowEpic9339.writeToParcel(obtain, 0);
        }
        try {
            frostHunterBitmapStrikeDragon3561.FrostHunterBundlePulseFusionHero2475.transact(1, obtain, null, 1);
            obtain.recycle();
            frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public FrostHunterPushNotificationUltraQuantum3493() {
        this.FrostHunterFlowMaxDragonHero5809 = new Object();
    }

    public FrostHunterPushNotificationUltraQuantum3493(FrostHunterNavigationSparkTitanDelta2974 frostHunterNavigationSparkTitanDelta2974, FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterNavigationSparkTitanDelta2974;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterKotlinQuantumRogue5892;
    }

    public FrostHunterPushNotificationUltraQuantum3493(FrostHunterFlatMapSparkVortex7204 frostHunterFlatMapSparkVortex7204, FrostHunterFlatMapSparkVortex7204 frostHunterFlatMapSparkVortex72042) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFlatMapSparkVortex7204;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFlatMapSparkVortex72042;
        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
    }
}
