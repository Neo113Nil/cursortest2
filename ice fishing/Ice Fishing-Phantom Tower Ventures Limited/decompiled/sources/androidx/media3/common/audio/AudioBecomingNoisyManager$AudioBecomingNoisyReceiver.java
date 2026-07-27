package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Context.FrostHunterProcessCameraProviderQuantumNovaXHyperion4894;
import android.content.Context.FrostHunterRotateDrawableMaxPrime8918;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class AudioBecomingNoisyManager$AudioBecomingNoisyReceiver extends BroadcastReceiver {
    public final FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterAdapterDelegateNebulaRogue3354 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterRotateDrawableMaxPrime8918 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354, FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918, FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion4894) {
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterAdapterDelegateNebulaRogue3354;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterRotateDrawableMaxPrime8918;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterProcessCameraProviderQuantumNovaXHyperion4894;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757(new Runnable() { // from class: androidx.media3.common.audio.FrostHunterTransitionManagerOmegaNeoMaster3754
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager$AudioBecomingNoisyReceiver audioBecomingNoisyManager$AudioBecomingNoisyReceiver = AudioBecomingNoisyManager$AudioBecomingNoisyReceiver.this;
                    if (audioBecomingNoisyManager$AudioBecomingNoisyReceiver.FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757) {
                        audioBecomingNoisyManager$AudioBecomingNoisyReceiver.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMeteringPointBetaCyber9571(3, false);
                    }
                }
            });
        }
    }
}
