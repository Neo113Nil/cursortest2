package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Context.FrostHunterAlarmManagerHeroTitaniumFusion5758;
import android.content.Context.FrostHunterAlertDialogEliteMasterCosmos7701;
import android.content.Context.FrostHunterAnimatorOlympianPhantomElite2405;
import android.content.Context.FrostHunterAudioManagerNovaNovaXAurora2834;
import android.content.Context.FrostHunterBindingAdapterOmegaAurora9082;
import android.content.Context.FrostHunterBitmapNeoCosmos7205;
import android.content.Context.FrostHunterDialogFragmentEpicSparkVortex5100;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterGyroscopeHeroAlpha1995;
import android.content.Context.FrostHunterLayerDragonVortex4557;
import android.content.Context.FrostHunterLifecycleShadowStormNebula6021;
import android.content.Context.FrostHunterPlaceholderSolarPixelElite2112;
import android.content.Context.FrostHunterRemoteConfigEpicUltraDragon2411;
import android.content.Context.FrostHunterRippleDrawableMaxElite5227;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 {
    public FrostHunterRemoteConfigEpicUltraDragon2411 FrostHunterAlertDialogAuroraDelta3200;
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final Handler FrostHunterBundlePulseFusionHero2475;
    public FrostHunterBindingAdapterOmegaAurora9082 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterRippleDrawableMaxElite5227 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public AudioDeviceInfo FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterLayerDragonVortex4557 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final BroadcastReceiver FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterAudioManagerNovaNovaXAurora2834 FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterDialogFragmentEpicSparkVortex5100 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterTransitionManagerOmegaNeoMaster3754(Context context, FrostHunterRippleDrawableMaxElite5227 frostHunterRippleDrawableMaxElite5227, FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = applicationContext;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterRippleDrawableMaxElite5227;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRemoteConfigEpicUltraDragon2411;
        this.FrostHunterFlowMaxDragonHero5809 = audioDeviceInfo;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.FrostHunterBundlePulseFusionHero2475 = handler;
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterDialogFragmentEpicSparkVortex5100(this);
        this.FrostHunterLifecycleBlazeGammaElite2889 = new BroadcastReceiver() { // from class: androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = FrostHunterTransitionManagerOmegaNeoMaster3754.this;
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context2, intent, frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200, frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809, frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761()));
            }
        };
        FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterLifecycleBlazeGammaElite2889;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = uriFor != null ? new FrostHunterLayerDragonVortex4557(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834;
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        List spatializedChannelMasks;
        int i = Build.VERSION.SDK_INT;
        if (i < 32 || (frostHunterAudioManagerNovaNovaXAurora2834 = this.FrostHunterRemoteConfigSpeedSpeed8566) == null) {
            FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
            return FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
        }
        Spatializer spatializer2 = (Spatializer) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809;
        if (spatializer2 != null && frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterCameraXPixelTurboCosmos9814) {
            isAvailable = spatializer2.isAvailable();
            if (isAvailable && (spatializer = (Spatializer) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809) != null) {
                isEnabled = spatializer.isEnabled();
                if (isEnabled) {
                    if (i < 36) {
                        return FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(252);
                    }
                    Spatializer spatializer3 = (Spatializer) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809;
                    spatializer3.getClass();
                    spatializedChannelMasks = FrostHunterLifecycleShadowStormNebula6021.FrostHunterBundlePulseFusionHero2475(spatializer3).getSpatializedChannelMasks();
                    return spatializedChannelMasks;
                }
            }
        }
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite24052 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        return FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        List FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = this.FrostHunterAlertDialogAuroraDelta3200;
        AudioDeviceInfo audioDeviceInfo = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterLifecycleBlazeGammaElite2889;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, context.registerReceiver(null, intentFilter), frostHunterRemoteConfigEpicUltraDragon2411, audioDeviceInfo, FrostHunterAlphaAnimationNeoCosmos5761));
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082 frostHunterBindingAdapterOmegaAurora9082) {
        if (!this.FrostHunterKeyframeGammaGamma1197 || frostHunterBindingAdapterOmegaAurora9082.equals(this.FrostHunterCameraXPixelTurboCosmos9814)) {
            return;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBindingAdapterOmegaAurora9082;
        FrostHunterPlaceholderSolarPixelElite2112 frostHunterPlaceholderSolarPixelElite2112 = (FrostHunterPlaceholderSolarPixelElite2112) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
        frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterBindingAdapterOmegaAurora9082 frostHunterBindingAdapterOmegaAurora90822 = frostHunterPlaceholderSolarPixelElite2112.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterBindingAdapterOmegaAurora90822 == null || frostHunterBindingAdapterOmegaAurora9082.equals(frostHunterBindingAdapterOmegaAurora90822)) {
            return;
        }
        frostHunterPlaceholderSolarPixelElite2112.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBindingAdapterOmegaAurora9082;
        FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterAlertDialogEliteMasterCosmos7701 != null) {
            frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterLifecycleBlazeGammaElite2889(-1, new FrostHunterFlowHyperionVortexDelta5013(15));
        }
    }
}
