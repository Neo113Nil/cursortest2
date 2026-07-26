package android.content.Context;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewBindingRogueForce9851 implements FrostHunterFirestorePhantomShadow6889 {
    public final short[] FrostHunterAlphaAnimationNeoCosmos5761;
    public short[] FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ FrostHunterTextViewThunderInferno6417 FrostHunterCameraXPixelTurboCosmos9814;
    public short[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public short[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterViewBindingRogueForce9851(FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterTextViewThunderInferno6417;
        int i = frostHunterTextViewThunderInferno6417.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new short[i];
        int i2 = i * frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new short[i2];
        this.FrostHunterBundlePulseFusionHero2475 = new short[i2];
        this.FrostHunterServiceEliteCelestialThunder1757 = new short[i2];
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final int FrostHunterAlertDialogAuroraDelta3200(int i, int i2, int i3) {
        return FrostHunterResourcesTitanHyperVision5823(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, i, i2, i3);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417 = this.FrostHunterCameraXPixelTurboCosmos9814;
        asShortBuffer.get(sArr, frostHunterTextViewThunderInferno6417.FrostHunterAlertDialogAuroraDelta3200 * frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        return i != 0 && this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != 0 && this.FrostHunterLevelListDrawableFusionDragonHero2232 <= i * 3 && i * 2 > this.FrostHunterRemoteConfigSpeedSpeed8566 * 3;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.FrostHunterBundlePulseFusionHero2475;
        short[] sArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final short[] FrostHunterCameraXTurboCelestialHero5430(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterCameraXTurboCelestialHero5430(this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterKeyframeGammaGamma1197, i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final Object FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterFlowMaxDragonHero5809(int i, int i2) {
        short[] sArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = frostHunterTextViewThunderInferno6417.FrostHunterCameraXPixelTurboCosmos9814 / i2;
        int i4 = frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761[i7] = (short) (i8 / i5);
        }
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final int FrostHunterFragmentBetaMegaVortex6025() {
        return 2;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterKeyframeGammaGamma1197(int i) {
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterCameraXTurboCelestialHero5430(this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025, i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        for (int i3 = 0; i3 < this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633 * i2; i3++) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i + i3] = 0;
        }
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterLifecycleBlazeGammaElite2889(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417 = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i3 = frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.FrostHunterBundlePulseFusionHero2475;
            int i4 = (frostHunterTextViewThunderInferno6417.FrostHunterKeyframeGammaGamma1197 * i3) + i2;
            short[] sArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = frostHunterTextViewThunderInferno6417.FrostHunterLightSensorForceFusion4241 * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (frostHunterTextViewThunderInferno6417.FrostHunterServiceConnectionTurboPhoenixOmega6719 * j2);
            sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
            i2++;
        }
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterLightSensorForceFusion4241() {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final int FrostHunterLintTitanVortexQuantum9911(int i, int i2) {
        return FrostHunterResourcesTitanHyperVision5823(this.FrostHunterAlphaAnimationNeoCosmos5761, 0, i, i2);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final Object FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final int FrostHunterResourcesTitanHyperVision5823(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.FrostHunterLifecycleBlazeGammaElite2889 = i6 / i7;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i8 / i5;
        return i7;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final Object FrostHunterScaleAnimationStrikeSpark5059() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterCameraXTurboCelestialHero5430(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200, i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterServiceEliteCelestialThunder1757(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        asShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void flush() {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
    }
}
