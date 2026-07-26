package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStrictModePrimeShadow7851 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final float[] FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterIntentServiceNebulaMaster1202 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final float[] FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public final float[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterOnGlobalLayoutListenerBetaStorm2135[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterStrictModePrimeShadow7851(boolean z, FrostHunterIntentServiceNebulaMaster1202 frostHunterIntentServiceNebulaMaster1202) {
        int i;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterIntentServiceNebulaMaster1202;
        if (z && frostHunterIntentServiceNebulaMaster1202.equals(FrostHunterIntentServiceNebulaMaster1202.FrostHunterCameraXPixelTurboCosmos9814)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = frostHunterIntentServiceNebulaMaster1202.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                throw null;
            }
            i = 2;
        }
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterOnGlobalLayoutListenerBetaStorm2135[20];
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new float[20];
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new float[20];
        this.FrostHunterCameraXPixelTurboCosmos9814 = new float[3];
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j, float f) {
        int i = (this.FrostHunterLifecycleBlazeGammaElite2889 + 1) % 20;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
        FrostHunterOnGlobalLayoutListenerBetaStorm2135[] frostHunterOnGlobalLayoutListenerBetaStorm2135Arr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterOnGlobalLayoutListenerBetaStorm2135 frostHunterOnGlobalLayoutListenerBetaStorm2135 = frostHunterOnGlobalLayoutListenerBetaStorm2135Arr[i];
        if (frostHunterOnGlobalLayoutListenerBetaStorm2135 != null) {
            frostHunterOnGlobalLayoutListenerBetaStorm2135.FrostHunterAlphaAnimationNeoCosmos5761 = j;
            frostHunterOnGlobalLayoutListenerBetaStorm2135.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
        } else {
            FrostHunterOnGlobalLayoutListenerBetaStorm2135 frostHunterOnGlobalLayoutListenerBetaStorm21352 = new FrostHunterOnGlobalLayoutListenerBetaStorm2135();
            frostHunterOnGlobalLayoutListenerBetaStorm21352.FrostHunterAlphaAnimationNeoCosmos5761 = j;
            frostHunterOnGlobalLayoutListenerBetaStorm21352.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
            frostHunterOnGlobalLayoutListenerBetaStorm2135Arr[i] = frostHunterOnGlobalLayoutListenerBetaStorm21352;
        }
    }

    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(float f) {
        FrostHunterIntentServiceNebulaMaster1202 frostHunterIntentServiceNebulaMaster1202;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterOnGlobalLayoutListenerBetaStorm2135[] frostHunterOnGlobalLayoutListenerBetaStorm2135Arr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterOnGlobalLayoutListenerBetaStorm2135 frostHunterOnGlobalLayoutListenerBetaStorm2135 = frostHunterOnGlobalLayoutListenerBetaStorm2135Arr[i2];
        if (frostHunterOnGlobalLayoutListenerBetaStorm2135 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            FrostHunterOnGlobalLayoutListenerBetaStorm2135 frostHunterOnGlobalLayoutListenerBetaStorm21352 = frostHunterOnGlobalLayoutListenerBetaStorm2135;
            while (true) {
                FrostHunterOnGlobalLayoutListenerBetaStorm2135 frostHunterOnGlobalLayoutListenerBetaStorm21353 = frostHunterOnGlobalLayoutListenerBetaStorm2135Arr[i2];
                boolean z2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterIntentServiceNebulaMaster1202 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                fArr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                fArr2 = this.FrostHunterRemoteConfigSpeedSpeed8566;
                if (frostHunterOnGlobalLayoutListenerBetaStorm21353 != null) {
                    long j = frostHunterOnGlobalLayoutListenerBetaStorm2135.FrostHunterAlphaAnimationNeoCosmos5761;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = frostHunterOnGlobalLayoutListenerBetaStorm21353.FrostHunterAlphaAnimationNeoCosmos5761;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - frostHunterOnGlobalLayoutListenerBetaStorm21352.FrostHunterAlphaAnimationNeoCosmos5761);
                    frostHunterOnGlobalLayoutListenerBetaStorm21352 = (frostHunterIntentServiceNebulaMaster1202 == FrostHunterIntentServiceNebulaMaster1202.FrostHunterCameraXPixelTurboCosmos9814 || z) ? frostHunterOnGlobalLayoutListenerBetaStorm21353 : frostHunterOnGlobalLayoutListenerBetaStorm2135;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = frostHunterOnGlobalLayoutListenerBetaStorm21353.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.FrostHunterBundlePulseFusionHero2475) {
                int ordinal = frostHunterIntentServiceNebulaMaster1202.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.FrostHunterCameraXPixelTurboCosmos9814;
                        FrostHunterFirebaseModelDownloadConditionsOmegaNebulaHero6281.FrostHunterLevelListDrawableFusionDragonHero2232(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ FrostHunterStrictModePrimeShadow7851() {
        this(false, FrostHunterIntentServiceNebulaMaster1202.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public FrostHunterStrictModePrimeShadow7851(int i) {
        this(true, FrostHunterIntentServiceNebulaMaster1202.FrostHunterFlowMaxDragonHero5809);
    }
}
