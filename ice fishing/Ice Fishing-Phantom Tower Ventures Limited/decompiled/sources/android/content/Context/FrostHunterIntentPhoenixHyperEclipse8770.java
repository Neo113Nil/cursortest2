package android.content.Context;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterIntentPhoenixHyperEclipse8770 extends FrostHunterViewModelPulseAlpha1331 {
    public int[] FrostHunterAlertDialogAuroraDelta3200;
    public int[] FrostHunterFlowMaxDragonHero5809;

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterAlertDialogAuroraDelta3200() {
        this.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final FrostHunterConstraintSetHeroOlympian6218 FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218) {
        int i = frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475;
        int[] iArr = this.FrostHunterFlowMaxDragonHero5809;
        if (iArr == null) {
            return FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
        }
        int i2 = frostHunterConstraintSetHeroOlympian6218.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (!FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(i)) {
            throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new FrostHunterVideoCaptureEclipseMasterBlaze3228("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", frostHunterConstraintSetHeroOlympian6218);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new FrostHunterConstraintSetHeroOlympian6218(frostHunterConstraintSetHeroOlympian6218.FrostHunterAlphaAnimationNeoCosmos5761, iArr.length, i) : FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterFragmentBetaMegaVortex6025() {
        this.FrostHunterAlertDialogAuroraDelta3200 = null;
        this.FrostHunterFlowMaxDragonHero5809 = null;
    }

    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        int[] iArr = this.FrostHunterAlertDialogAuroraDelta3200;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(((limit - position) / this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757) * this.FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757);
        while (position < limit) {
            for (int i : iArr) {
                int FrostHunterLightSensorForceFusion4241 = (FrostHunterGyroscopeHeroAlpha1995.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475) * i) + position;
                int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
                if (i2 != 2) {
                    if (i2 == 3) {
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(FrostHunterLightSensorForceFusion4241));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475);
                                            }
                                            FrostHunterServiceConnectionTurboPhoenixOmega6719.putDouble(byteBuffer.getDouble(FrostHunterLightSensorForceFusion4241));
                                        }
                                    }
                                }
                            }
                            FrostHunterServiceConnectionTurboPhoenixOmega6719.putInt(byteBuffer.getInt(FrostHunterLightSensorForceFusion4241));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? FrostHunterLightSensorForceFusion4241 : FrostHunterLightSensorForceFusion4241 + 2);
                        byte b2 = byteBuffer.get(FrostHunterLightSensorForceFusion4241 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            FrostHunterLightSensorForceFusion4241 += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(FrostHunterLightSensorForceFusion4241) << 8) & 65280)) >> 8;
                        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271((i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(FrostHunterServiceConnectionTurboPhoenixOmega6719.remaining() >= 3);
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) (FrostHunterServiceConnectionTurboPhoenixOmega6719.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (FrostHunterServiceConnectionTurboPhoenixOmega6719.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.putFloat(byteBuffer.getFloat(FrostHunterLightSensorForceFusion4241));
                    }
                }
                FrostHunterServiceConnectionTurboPhoenixOmega6719.putShort(byteBuffer.getShort(FrostHunterLightSensorForceFusion4241));
            }
            position += this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
        }
        byteBuffer.position(limit);
        FrostHunterServiceConnectionTurboPhoenixOmega6719.flip();
    }
}
