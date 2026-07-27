package android.content.Context;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRotateDrawableQuantumPrimeElite7268 implements FrostHunterFirestorePhantomShadow6889 {
    public final float[] FrostHunterAlphaAnimationNeoCosmos5761;
    public float[] FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ FrostHunterTextViewThunderInferno6417 FrostHunterCameraXPixelTurboCosmos9814;
    public float[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public double FrostHunterLevelListDrawableFusionDragonHero2232;
    public double FrostHunterLifecycleBlazeGammaElite2889;
    public double FrostHunterRemoteConfigSpeedSpeed8566;
    public float[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRotateDrawableQuantumPrimeElite7268(FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterTextViewThunderInferno6417;
        int i = frostHunterTextViewThunderInferno6417.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new float[i];
        int i2 = i * frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new float[i2];
        this.FrostHunterBundlePulseFusionHero2475 = new float[i2];
        this.FrostHunterServiceEliteCelestialThunder1757 = new float[i2];
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final int FrostHunterAlertDialogAuroraDelta3200(int i, int i2, int i3) {
        return FrostHunterResourcesTitanHyperVision5823(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, i, i2, i3);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417 = this.FrostHunterCameraXPixelTurboCosmos9814;
        asFloatBuffer.get(fArr, frostHunterTextViewThunderInferno6417.FrostHunterAlertDialogAuroraDelta3200 * frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        double d = this.FrostHunterLifecycleBlazeGammaElite2889;
        return d != 0.0d && this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != 0 && this.FrostHunterLevelListDrawableFusionDragonHero2232 <= d * 3.0d && d * 2.0d > this.FrostHunterRemoteConfigSpeedSpeed8566 * 3.0d;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.FrostHunterBundlePulseFusionHero2475;
        float[] fArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final float[] FrostHunterCameraXTurboCelestialHero5430(float[] fArr, int i, int i2) {
        int length = fArr.length;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
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
        FrostHunterTextViewThunderInferno6417 frostHunterTextViewThunderInferno6417 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = frostHunterTextViewThunderInferno6417.FrostHunterCameraXPixelTurboCosmos9814 / i2;
        int i4 = frostHunterTextViewThunderInferno6417.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += this.FrostHunterConstraintSetCloneMasterUltraRogue2633[(i7 * i5) + i6 + i8];
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761[i7] = (float) (d / i5);
        }
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final int FrostHunterFragmentBetaMegaVortex6025() {
        return 4;
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterKeyframeGammaGamma1197(int i) {
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterCameraXTurboCelestialHero5430(this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025, i);
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        for (int i3 = 0; i3 < this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633 * i2; i3++) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i + i3] = 0.0f;
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
            float[] fArr = this.FrostHunterBundlePulseFusionHero2475;
            int i4 = (frostHunterTextViewThunderInferno6417.FrostHunterKeyframeGammaGamma1197 * i3) + i2;
            float[] fArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = frostHunterTextViewThunderInferno6417.FrostHunterLightSensorForceFusion4241 * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            fArr[i4] = (((r10 - j5) * f2) + (j5 * f)) / (j4 - (frostHunterTextViewThunderInferno6417.FrostHunterServiceConnectionTurboPhoenixOmega6719 * j2));
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

    public final int FrostHunterResourcesTitanHyperVision5823(float[] fArr, int i, int i2, int i3) {
        int i4 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633 * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d4 = i7;
            if (i5 * d3 < d * d4) {
                i5 = i7;
                d = d3;
            }
            if (i6 * d3 > d4 * d2) {
                i6 = i7;
                d2 = d3;
            }
            i7++;
            i4 = i9;
        }
        this.FrostHunterLifecycleBlazeGammaElite2889 = d / i5;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = d2 / i6;
        return i5;
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
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        asFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    @Override // android.content.Context.FrostHunterFirestorePhantomShadow6889
    public final void flush() {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = 0.0d;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0.0d;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0.0d;
    }
}
