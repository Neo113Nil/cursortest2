package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventNeoGammaElite3606 extends FrostHunterViewModelPulseAlpha1331 {
    public static final int FrostHunterFlowMaxDragonHero5809 = Float.floatToIntBits(Float.NaN);

    public static void FrostHunterLightSensorForceFusion4241(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == FrostHunterFlowMaxDragonHero5809) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final FrostHunterConstraintSetHeroOlympian6218 FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218) {
        int i = frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475;
        if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterDialogFragmentTurboPhoenixDragon7627(i) || i == 2) {
            return i != 4 ? new FrostHunterConstraintSetHeroOlympian6218(frostHunterConstraintSetHeroOlympian6218.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConstraintSetHeroOlympian6218.FrostHunterConstraintSetCloneMasterUltraRogue2633, 4) : FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
        }
        throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
    }

    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
        if (i2 == 2) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i * 2);
            while (position < limit) {
                FrostHunterLightSensorForceFusion4241(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), FrostHunterServiceConnectionTurboPhoenixOmega6719);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719((i / 3) * 4);
            while (position < limit) {
                FrostHunterLightSensorForceFusion4241(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), FrostHunterServiceConnectionTurboPhoenixOmega6719);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i);
            while (position < limit) {
                FrostHunterLightSensorForceFusion4241((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), FrostHunterServiceConnectionTurboPhoenixOmega6719);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i / 2);
            while (position < limit) {
                FrostHunterServiceConnectionTurboPhoenixOmega6719.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 21) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719((i / 3) * 4);
            while (position < limit) {
                FrostHunterLightSensorForceFusion4241(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), FrostHunterServiceConnectionTurboPhoenixOmega6719);
                position += 3;
            }
        } else {
            if (i2 != 22) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                return;
            }
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i);
            while (position < limit) {
                FrostHunterLightSensorForceFusion4241((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), FrostHunterServiceConnectionTurboPhoenixOmega6719);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        FrostHunterServiceConnectionTurboPhoenixOmega6719.flip();
    }
}
