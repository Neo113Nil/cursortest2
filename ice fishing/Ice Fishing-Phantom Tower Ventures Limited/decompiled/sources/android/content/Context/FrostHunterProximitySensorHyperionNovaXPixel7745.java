package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProximitySensorHyperionNovaXPixel7745 extends FrostHunterViewModelPulseAlpha1331 {
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public int FrostHunterLightSensorForceFusion4241;
    public long FrostHunterLintTitanVortexQuantum9911;
    public byte[] FrostHunterMotionSceneAuroraMega2271;
    public byte[] FrostHunterResourcesTitanHyperVision5823;
    public boolean FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterCameraXTurboCelestialHero5430 = 0;
    public int FrostHunterTextViewDragonStormMega4297 = 0;
    public int FrostHunterLooperThreadBetaHyperionMax1000 = 0;
    public final long FrostHunterFragmentBetaMegaVortex6025 = 100000;
    public final float FrostHunterFlowMaxDragonHero5809 = 0.2f;
    public final long FrostHunterServiceConnectionTurboPhoenixOmega6719 = 2000000;
    public final int FrostHunterKeyframeGammaGamma1197 = 10;
    public final short FrostHunterAlertDialogAuroraDelta3200 = 1024;

    public FrostHunterProximitySensorHyperionNovaXPixel7745() {
        byte[] bArr = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterResourcesTitanHyperVision5823 = bArr;
        this.FrostHunterMotionSceneAuroraMega2271 = bArr;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterAlertDialogAuroraDelta3200() {
        if (FrostHunterAlphaAnimationNeoCosmos5761()) {
            int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633 * 2;
            this.FrostHunterLightSensorForceFusion4241 = i;
            int i2 = ((((int) ((this.FrostHunterFragmentBetaMegaVortex6025 * r0.FrostHunterAlphaAnimationNeoCosmos5761) / 1000000)) / 2) / i) * i * 2;
            if (this.FrostHunterResourcesTitanHyperVision5823.length != i2) {
                this.FrostHunterResourcesTitanHyperVision5823 = new byte[i2];
                this.FrostHunterMotionSceneAuroraMega2271 = new byte[i2];
            }
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
        this.FrostHunterLintTitanVortexQuantum9911 = 0L;
        this.FrostHunterCameraXTurboCelestialHero5430 = 0;
        this.FrostHunterTextViewDragonStormMega4297 = 0;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = 0;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331, android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        return super.FrostHunterAlphaAnimationNeoCosmos5761() && this.FrostHunterScaleAnimationStrikeSpark5059;
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(int i, int i2) {
        if (i == 0) {
            return;
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(this.FrostHunterLooperThreadBetaHyperionMax1000 >= i);
        int i3 = this.FrostHunterTextViewDragonStormMega4297;
        if (i2 == 2) {
            int i4 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            int i5 = i3 + i4;
            byte[] bArr = this.FrostHunterResourcesTitanHyperVision5823;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.FrostHunterMotionSceneAuroraMega2271, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.FrostHunterMotionSceneAuroraMega2271;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.FrostHunterResourcesTitanHyperVision5823, 0, this.FrostHunterMotionSceneAuroraMega2271, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.FrostHunterResourcesTitanHyperVision5823;
            int length2 = bArr3.length;
            byte[] bArr4 = this.FrostHunterMotionSceneAuroraMega2271;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.FrostHunterResourcesTitanHyperVision5823, 0, this.FrostHunterMotionSceneAuroraMega2271, length3, i - length3);
            }
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterTextViewDragonStormMega4297(i % this.FrostHunterLightSensorForceFusion4241 == 0, "sizeToOutput is not aligned to frame size: %s", i);
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterTextViewDragonStormMega4297 < this.FrostHunterResourcesTitanHyperVision5823.length);
        byte[] bArr5 = this.FrostHunterMotionSceneAuroraMega2271;
        FrostHunterCanvasInfernoVortex4700.FrostHunterTextViewDragonStormMega4297(i % this.FrostHunterLightSensorForceFusion4241 == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.FrostHunterKeyframeGammaGamma1197;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = Byte.MIN_VALUE;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        FrostHunterServiceConnectionTurboPhoenixOmega6719(i).put(bArr5, 0, i).flip();
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final FrostHunterConstraintSetHeroOlympian6218 FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218) {
        if (frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475 == 2) {
            return frostHunterConstraintSetHeroOlympian6218.FrostHunterAlphaAnimationNeoCosmos5761 == -1 ? FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889 : frostHunterConstraintSetHeroOlympian6218;
        }
        throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterFragmentBetaMegaVortex6025() {
        this.FrostHunterScaleAnimationStrikeSpark5059 = false;
        byte[] bArr = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterResourcesTitanHyperVision5823 = bArr;
        this.FrostHunterMotionSceneAuroraMega2271 = bArr;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterKeyframeGammaGamma1197() {
        if (this.FrostHunterLooperThreadBetaHyperionMax1000 > 0) {
            FrostHunterScaleAnimationStrikeSpark5059(true);
            this.FrostHunterCameraXTurboCelestialHero5430 = 0;
        }
    }

    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.FrostHunterRemoteConfigSpeedSpeed8566.hasRemaining()) {
            int i = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            short s = this.FrostHunterAlertDialogAuroraDelta3200;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.FrostHunterResourcesTitanHyperVision5823.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.FrostHunterLightSensorForceFusion4241;
                        position = ((limit3 / i2) * i2) + i2;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    FrostHunterServiceConnectionTurboPhoenixOmega6719(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                    return;
                }
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterTextViewDragonStormMega4297 < this.FrostHunterResourcesTitanHyperVision5823.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.FrostHunterLightSensorForceFusion4241;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.FrostHunterTextViewDragonStormMega4297;
                int i5 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                int i6 = i4 + i5;
                byte[] bArr = this.FrostHunterResourcesTitanHyperVision5823;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.FrostHunterResourcesTitanHyperVision5823, i6, min);
                int i8 = this.FrostHunterLooperThreadBetaHyperionMax1000 + min;
                this.FrostHunterLooperThreadBetaHyperionMax1000 = i8;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(i8 <= this.FrostHunterResourcesTitanHyperVision5823.length);
                boolean z2 = z && position3 < i7;
                FrostHunterScaleAnimationStrikeSpark5059(z2);
                if (z2) {
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
                    this.FrostHunterCameraXTurboCelestialHero5430 = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    public final int FrostHunterLightSensorForceFusion4241(int i) {
        int length = ((((int) ((this.FrostHunterServiceConnectionTurboPhoenixOmega6719 * this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761) / 1000000)) - this.FrostHunterCameraXTurboCelestialHero5430) * this.FrostHunterLightSensorForceFusion4241) - (this.FrostHunterResourcesTitanHyperVision5823.length / 2);
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(length >= 0);
        int min = (int) Math.min((i * this.FrostHunterFlowMaxDragonHero5809) + 0.5f, length);
        int i2 = this.FrostHunterLightSensorForceFusion4241;
        return (min / i2) * i2;
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059(boolean z) {
        int length;
        int FrostHunterLightSensorForceFusion4241;
        int i = this.FrostHunterLooperThreadBetaHyperionMax1000;
        byte[] bArr = this.FrostHunterResourcesTitanHyperVision5823;
        if (i == bArr.length || z) {
            if (this.FrostHunterCameraXTurboCelestialHero5430 == 0) {
                if (z) {
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(i, 3);
                    length = i;
                } else {
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(i >= bArr.length / 2);
                    length = this.FrostHunterResourcesTitanHyperVision5823.length / 2;
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(length, 0);
                }
                FrostHunterLightSensorForceFusion4241 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int FrostHunterLightSensorForceFusion42412 = FrostHunterLightSensorForceFusion4241(length2) + (this.FrostHunterResourcesTitanHyperVision5823.length / 2);
                FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLightSensorForceFusion42412, 2);
                FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion42412;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(length);
                FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLightSensorForceFusion4241, 1);
            }
            if (!(length % this.FrostHunterLightSensorForceFusion4241 == 0)) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(i >= FrostHunterLightSensorForceFusion4241);
            this.FrostHunterLooperThreadBetaHyperionMax1000 -= length;
            int i2 = this.FrostHunterTextViewDragonStormMega4297 + length;
            this.FrostHunterTextViewDragonStormMega4297 = i2;
            this.FrostHunterTextViewDragonStormMega4297 = i2 % this.FrostHunterResourcesTitanHyperVision5823.length;
            this.FrostHunterCameraXTurboCelestialHero5430 = (FrostHunterLightSensorForceFusion4241 / this.FrostHunterLightSensorForceFusion4241) + this.FrostHunterCameraXTurboCelestialHero5430;
            this.FrostHunterLintTitanVortexQuantum9911 += (length - FrostHunterLightSensorForceFusion4241) / r2;
        }
    }
}
