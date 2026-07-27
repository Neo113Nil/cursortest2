package android.content.Context;

import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterVibratorSpectraBetaNovaX4683 implements FrostHunterApplicationInfoHeroForceSpark2431, FrostHunterTransitionNebulaBlaze7285, FrostHunterViewMegaStrike3894, FrostHunterServiceConnectionPrimeTurboPhoenix8976, FrostHunterJavaAlphaSpark6799, FrostHunterFragmentManagerEclipseTurboUltra1848, FrostHunterMLKitPixelSpark4804, FrostHunterLayoutInflaterNebulaVision6522, FrostHunterNavigationAlphaCelestial5898 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    public /* synthetic */ FrostHunterVibratorSpectraBetaNovaX4683(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public static /* synthetic */ void FrostHunterAlertDialogAuroraDelta3200(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void FrostHunterCameraXPixelTurboCosmos9814() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void FrostHunterFragmentBetaMegaVortex6025(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void FrostHunterKeyframeGammaGamma1197(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void FrostHunterLightSensorForceFusion4241(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void FrostHunterServiceConnectionTurboPhoenixOmega6719(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
    public void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868(2, new FrostHunterLinearLayoutSolarTurboSpark3070("Player release timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
                break;
            case 1:
                frostHunterHandlerStrikeNova5644.FrostHunterBundlePulseFusionHero2475();
                break;
            default:
                frostHunterHandlerStrikeNova5644.getClass();
                break;
        }
    }

    @Override // android.content.Context.FrostHunterJavaAlphaSpark6799
    public FrostHunterJobSchedulerBlazeCyberMega7710[] FrostHunterBundlePulseFusionHero2475() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 13:
                return new FrostHunterJobSchedulerBlazeCyberMega7710[]{new FrostHunterCoroutineScopePrimeHyperionSolar7089()};
            default:
                return new FrostHunterJobSchedulerBlazeCyberMega7710[]{new FrostHunterAnalyticsHyperionTitanium2824()};
        }
    }

    @Override // android.content.Context.FrostHunterMLKitPixelSpark4804
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // android.content.Context.FrostHunterViewMegaStrike3894
    public Object FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        int i;
        Object obj;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 4:
                i = 403;
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                i = -1;
                break;
            default:
                synchronized (frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlphaAnimationNeoCosmos5761) {
                    if (!frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterBundlePulseFusionHero2475) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    if (frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterServiceEliteCelestialThunder1757) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean isInstance = IOException.class.isInstance(frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLevelListDrawableFusionDragonHero2232);
                    Exception exc = frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLevelListDrawableFusionDragonHero2232;
                    if (isInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new FrostHunterManifestUltraNeoMaster3003(exc);
                    }
                    obj = frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLifecycleBlazeGammaElite2889;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    FrostHunterFragmentBetaMegaVortex6025("SERVICE_NOT_AVAILABLE");
                    return null;
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    FrostHunterFragmentBetaMegaVortex6025("INSTANCE_ID_RESET");
                    return null;
                }
                if (string2 != null) {
                    FrostHunterFragmentBetaMegaVortex6025(string2);
                    return null;
                }
                bundle.toString();
                new Throwable();
                FrostHunterFragmentBetaMegaVortex6025("SERVICE_NOT_AVAILABLE");
                return null;
        }
        return Integer.valueOf(i);
    }

    @Override // android.content.Context.FrostHunterServiceConnectionPrimeTurboPhoenix8976
    public Object FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658) {
        FrostHunterViewPagerInfernoSpark6688 lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(frostHunterOnItemLongClickListenerRogueDeltaStrike7658);
        return lambda$getComponents$0;
    }

    @Override // android.content.Context.FrostHunterTransitionNebulaBlaze7285
    public void FrostHunterRemoteConfigSpeedSpeed8566(Object obj, FrostHunterAsyncNebulaCosmos7324 frostHunterAsyncNebulaCosmos7324) {
        ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterLifecycleBlazeGammaElite2889();
    }

    @Override // android.content.Context.FrostHunterNavigationAlphaCelestial5898
    public int FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        String str = ((FrostHunterStorageNovaXEliteAurora3066) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // android.content.Context.FrostHunterLayoutInflaterNebulaVision6522
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // android.content.Context.FrostHunterFragmentManagerEclipseTurboUltra1848
    public Object apply(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 16:
                FrostHunterFlowUltraDragon4056 frostHunterFlowUltraDragon4056 = (FrostHunterFlowUltraDragon4056) obj;
                return frostHunterFlowUltraDragon4056.FrostHunterAlphaAnimationNeoCosmos5761 + ": " + frostHunterFlowUltraDragon4056.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            case 17:
                return (FrostHunterContentObserverThunderForceElite2345) obj;
            case 27:
                return Long.valueOf(((FrostHunterWindowManagerInfernoOlympianVortex6395) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633);
            case 28:
                return Long.valueOf(((FrostHunterWindowManagerInfernoOlympianVortex6395) obj).FrostHunterBundlePulseFusionHero2475);
            default:
                return FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterConstraintSetCloneOmegaHyperion9304(((FrostHunterDrawableDeltaLegend6817) obj).FrostHunterCameraXPixelTurboCosmos9814().FrostHunterConstraintSetCloneMasterUltraRogue2633, new FrostHunterMaterialCardViewShadowBlazeBlaze3823(21)));
        }
    }

    public /* synthetic */ FrostHunterVibratorSpectraBetaNovaX4683(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }
}
