package android.content.Context;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyEventNovaXTurboPixel3098 extends FrostHunterKeyEventSolarVortex1388 {
    public FrostHunterStateListAnimatorQuantumHyperionTitanium1903 FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterLightSensorForceFusion4241;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public byte[] FrostHunterServiceConnectionTurboPhoenixOmega6719;

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        FrostHunterFragmentBetaMegaVortex6025();
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterStateListAnimatorQuantumHyperionTitanium1903;
        Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new FrostHunterDiffUtilTurboSpark8131("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new FrostHunterDiffUtilTurboSpark8131("Error while parsing Base64 encoded string: " + str2, e, true, 0);
            }
        } else {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
        byte[] bArr = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (j2 > bArr.length) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
            throw new FrostHunterMotionSceneTitaniumMega7732(2008);
        }
        int i = (int) j2;
        this.FrostHunterLightSensorForceFusion4241 = i;
        int length = bArr.length - i;
        this.FrostHunterScaleAnimationStrikeSpark5059 = length;
        if (j != -1) {
            this.FrostHunterScaleAnimationStrikeSpark5059 = (int) Math.min(length, j);
        }
        FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
        return j != -1 ? j : this.FrostHunterScaleAnimationStrikeSpark5059;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterStateListAnimatorQuantumHyperionTitanium1903 != null) {
            return frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719 != null) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
            FrostHunterRemoteConfigSpeedSpeed8566();
        }
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        System.arraycopy(bArr2, this.FrostHunterLightSensorForceFusion4241, bArr, i, min);
        this.FrostHunterLightSensorForceFusion4241 += min;
        this.FrostHunterScaleAnimationStrikeSpark5059 -= min;
        FrostHunterBundlePulseFusionHero2475(min);
        return min;
    }
}
