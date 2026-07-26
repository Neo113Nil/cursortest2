package android.content.Context;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterIntentServiceHyperDragon5719 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final Handler FrostHunterBundlePulseFusionHero2475;
    public final AudioManager.OnAudioFocusChangeListener FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Object FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterRemoteConfigEpicUltraDragon2411 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterIntentServiceHyperDragon5719(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411, boolean z) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterBundlePulseFusionHero2475 = handler;
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterRemoteConfigEpicUltraDragon2411;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterStorageMaxNeoAlpha6489(onAudioFocusChangeListener, handler);
        } else {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = onAudioFocusChangeListener;
        }
        if (i2 < 26) {
            this.FrostHunterLifecycleBlazeGammaElite2889 = null;
            return;
        }
        audioAttributes = FrostHunterDigitalInkRecognitionCosmosAlpha4116.FrostHunterLifecycleBlazeGammaElite2889(i).setAudioAttributes(frostHunterRemoteConfigEpicUltraDragon2411.FrostHunterAlphaAnimationNeoCosmos5761());
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        acceptsDelayedFocusGain = onAudioFocusChangeListener2.setAcceptsDelayedFocusGain(z);
        build = acceptsDelayedFocusGain.build();
        this.FrostHunterLifecycleBlazeGammaElite2889 = build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterIntentServiceHyperDragon5719)) {
            return false;
        }
        FrostHunterIntentServiceHyperDragon5719 frostHunterIntentServiceHyperDragon5719 = (FrostHunterIntentServiceHyperDragon5719) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterIntentServiceHyperDragon5719.FrostHunterAlphaAnimationNeoCosmos5761 && Objects.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterIntentServiceHyperDragon5719.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Objects.equals(this.FrostHunterBundlePulseFusionHero2475, frostHunterIntentServiceHyperDragon5719.FrostHunterBundlePulseFusionHero2475) && Objects.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterIntentServiceHyperDragon5719.FrostHunterServiceEliteCelestialThunder1757);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.FrostHunterAlphaAnimationNeoCosmos5761), this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterServiceEliteCelestialThunder1757, Boolean.FALSE);
    }
}
