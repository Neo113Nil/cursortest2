package android.content.Context;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogFragmentEpicSparkVortex5100 extends AudioDeviceCallback {
    public final /* synthetic */ androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterDialogFragmentEpicSparkVortex5100(androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionManagerOmegaNeoMaster3754;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        AudioDeviceInfo audioDeviceInfo = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], audioDeviceInfo)) {
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809 = null;
                break;
            }
            i++;
        }
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475();
    }
}
