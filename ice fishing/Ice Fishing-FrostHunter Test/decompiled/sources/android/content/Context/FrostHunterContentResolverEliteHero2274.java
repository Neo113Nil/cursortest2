package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverEliteHero2274 extends FrostHunterViewModelPulseAlpha1331 {
    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final FrostHunterConstraintSetHeroOlympian6218 FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218) {
        int i = frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new FrostHunterConstraintSetHeroOlympian6218(frostHunterConstraintSetHeroOlympian6218.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConstraintSetHeroOlympian6218.FrostHunterConstraintSetCloneMasterUltraRogue2633, 2) : FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
        }
        throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[ADDED_TO_REGION, LOOP:7: B:48:0x0113->B:49:0x0115, LOOP_START, PHI: r0
      0x0113: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0042, B:49:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                                        return;
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i2);
                        i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
                        if (i == 3) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) 0);
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short FrostHunterLevelListDrawableFusionDragonHero2232 = (short) (FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) (FrostHunterLevelListDrawableFusionDragonHero2232 & 255));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) ((FrostHunterLevelListDrawableFusionDragonHero2232 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 1));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 2));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 1));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 1));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position + 1));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i != 1879048192) {
                                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                                return;
                            }
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) (max & 255));
                                FrostHunterServiceConnectionTurboPhoenixOmega6719.put((byte) ((max >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i2);
            i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            FrostHunterServiceConnectionTurboPhoenixOmega67192.flip();
        }
        i2 *= 2;
        ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega671922 = FrostHunterServiceConnectionTurboPhoenixOmega6719(i2);
        i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        FrostHunterServiceConnectionTurboPhoenixOmega671922.flip();
    }
}
