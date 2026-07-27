package android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAccelerometerQuantumBeta3663 implements FrostHunterBindingAdapterOmegaBlaze8548 {
    public final FrostHunterJobSchedulerPixelAurora5672 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int[] FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final /* synthetic */ int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterFirebaseOlympianMax4818[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAccelerometerQuantumBeta3663(int i, FrostHunterJobSchedulerPixelAurora5672 frostHunterJobSchedulerPixelAurora5672, int[] iArr) {
        FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(iArr.length > 0);
        frostHunterJobSchedulerPixelAurora5672.getClass();
        FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr2 = frostHunterJobSchedulerPixelAurora5672.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterJobSchedulerPixelAurora5672;
        int length = iArr.length;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = length;
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFirebaseOlympianMax4818[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            frostHunterFirebaseOlympianMax4818Arr = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i2 >= length2) {
                break;
            }
            frostHunterFirebaseOlympianMax4818Arr[i2] = frostHunterFirebaseOlympianMax4818Arr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(frostHunterFirebaseOlympianMax4818Arr, new FrostHunterTextInputLayoutPhantomPhantom6564(1));
        this.FrostHunterBundlePulseFusionHero2475 = new int[this.FrostHunterConstraintSetCloneMasterUltraRogue2633];
        int i3 = 0;
        while (true) {
            int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.FrostHunterBundlePulseFusionHero2475;
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterServiceEliteCelestialThunder1757[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= frostHunterFirebaseOlympianMax4818Arr2.length) {
                    i5 = -1;
                    break;
                } else if (frostHunterFirebaseOlympianMax4818 == frostHunterFirebaseOlympianMax4818Arr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    public static void FrostHunterServiceConnectionTurboPhoenixOmega6719(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            FrostHunterTextureViewBlazePhantomDragon5593 frostHunterTextureViewBlazePhantomDragon5593 = (FrostHunterTextureViewBlazePhantomDragon5593) arrayList.get(i);
            if (frostHunterTextureViewBlazePhantomDragon5593 != null) {
                frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterExoPlayerHyperAlpha8352(j, jArr[i]));
            }
        }
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public void FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final FrostHunterFirebaseOlympianMax4818 FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterServiceEliteCelestialThunder1757[0];
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final FrostHunterFirebaseOlympianMax4818 FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        return this.FrostHunterServiceEliteCelestialThunder1757[i];
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public void FrostHunterFlowMaxDragonHero5809(float f) {
        int i = this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final int FrostHunterFragmentBetaMegaVortex6025(int i) {
        for (int i2 = 0; i2 < this.FrostHunterConstraintSetCloneMasterUltraRogue2633; i2++) {
            if (this.FrostHunterBundlePulseFusionHero2475[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterBundlePulseFusionHero2475[0];
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public void FrostHunterLifecycleBlazeGammaElite2889() {
        int i = this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final FrostHunterJobSchedulerPixelAurora5672 FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final int FrostHunterServiceEliteCelestialThunder1757(int i) {
        return this.FrostHunterBundlePulseFusionHero2475[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FrostHunterAccelerometerQuantumBeta3663 frostHunterAccelerometerQuantumBeta3663 = (FrostHunterAccelerometerQuantumBeta3663) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterAccelerometerQuantumBeta3663.FrostHunterAlphaAnimationNeoCosmos5761) && Arrays.equals(this.FrostHunterBundlePulseFusionHero2475, frostHunterAccelerometerQuantumBeta3663.FrostHunterBundlePulseFusionHero2475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FrostHunterLifecycleBlazeGammaElite2889 == 0) {
            this.FrostHunterLifecycleBlazeGammaElite2889 = Arrays.hashCode(this.FrostHunterBundlePulseFusionHero2475) + (System.identityHashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
        }
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final int length() {
        return this.FrostHunterBundlePulseFusionHero2475.length;
    }

    private final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
    }

    private final void FrostHunterLightSensorForceFusion4241() {
    }

    public final void FrostHunterLintTitanVortexQuantum9911() {
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059() {
    }

    private final void FrostHunterCameraXTurboCelestialHero5430(float f) {
    }

    @Override // android.content.Context.FrostHunterBindingAdapterOmegaBlaze8548
    public final void FrostHunterAlphaAnimationNeoCosmos5761(boolean z) {
    }

    public final void FrostHunterResourcesTitanHyperVision5823(float f) {
    }
}
