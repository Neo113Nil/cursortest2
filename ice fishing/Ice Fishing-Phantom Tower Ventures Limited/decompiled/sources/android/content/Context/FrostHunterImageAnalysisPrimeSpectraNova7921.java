package android.content.Context;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterImageAnalysisPrimeSpectraNova7921 extends FrostHunterStrictModeNebulaEliteHyper7105 {
    public static final /* synthetic */ int FrostHunterKeyframeGammaGamma1197 = 0;
    public final HashMap FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterLifecycleCameraControllerRogueQuantum1194 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterStrictModeNebulaEliteHyper7105[] FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Object[] FrostHunterFlowMaxDragonHero5809;
    public final int[] FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final int[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterImageAnalysisPrimeSpectraNova7921(FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr, Object[] objArr, FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194) {
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterLifecycleCameraControllerRogueQuantum1194;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterConstraintSetCloneMasterUltraRogue2633.length;
        int length = frostHunterStrictModeNebulaEliteHyper7105Arr.length;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStrictModeNebulaEliteHyper7105Arr;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new int[length];
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new int[length];
        this.FrostHunterFlowMaxDragonHero5809 = objArr;
        this.FrostHunterAlertDialogAuroraDelta3200 = new HashMap();
        int length2 = frostHunterStrictModeNebulaEliteHyper7105Arr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterStrictModeNebulaEliteHyper7105Arr[i];
            this.FrostHunterCameraXPixelTurboCosmos9814[i4] = frostHunterStrictModeNebulaEliteHyper7105;
            this.FrostHunterRemoteConfigSpeedSpeed8566[i4] = i2;
            this.FrostHunterLevelListDrawableFusionDragonHero2232[i4] = i3;
            i2 += frostHunterStrictModeNebulaEliteHyper7105.FrostHunterScaleAnimationStrikeSpark5059();
            i3 += this.FrostHunterCameraXPixelTurboCosmos9814[i4].FrostHunterCameraXPixelTurboCosmos9814();
            this.FrostHunterAlertDialogAuroraDelta3200.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i3;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterAlphaAnimationNeoCosmos5761(boolean z) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (!frostHunterStrictModeNebulaEliteHyper7105Arr[i].FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                    return frostHunterStrictModeNebulaEliteHyper7105Arr[i].FrostHunterAlphaAnimationNeoCosmos5761(z) + this.FrostHunterRemoteConfigSpeedSpeed8566[i];
                }
                i = FrostHunterLintTitanVortexQuantum9911(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterBundlePulseFusionHero2475(boolean z) {
        int i;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (!frostHunterStrictModeNebulaEliteHyper7105Arr[i].FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                    return frostHunterStrictModeNebulaEliteHyper7105Arr[i].FrostHunterBundlePulseFusionHero2475(z) + this.FrostHunterRemoteConfigSpeedSpeed8566[i];
                }
                i = FrostHunterCameraXTurboCelestialHero5430(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final int FrostHunterCameraXTurboCelestialHero5430(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194 = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterBundlePulseFusionHero2475[i] - 1;
        if (i2 >= 0) {
            return frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterConstraintSetCloneMasterUltraRogue2633[i2];
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        int FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.FrostHunterAlertDialogAuroraDelta3200.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterCameraXPixelTurboCosmos9814[intValue].FrostHunterConstraintSetCloneMasterUltraRogue2633(obj3)) != -1) {
                return this.FrostHunterLevelListDrawableFusionDragonHero2232[intValue] + FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final Object FrostHunterFragmentBetaMegaVortex6025(int i) {
        int[] iArr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBundlePulseFusionHero2475(iArr, i + 1, false, false);
        return Pair.create(this.FrostHunterFlowMaxDragonHero5809[FrostHunterBundlePulseFusionHero2475], this.FrostHunterCameraXPixelTurboCosmos9814[FrostHunterBundlePulseFusionHero2475].FrostHunterFragmentBetaMegaVortex6025(i - iArr[FrostHunterBundlePulseFusionHero2475]));
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterKeyframeGammaGamma1197(int i, int i2) {
        int[] iArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBundlePulseFusionHero2475(iArr, i + 1, false, false);
        int i3 = iArr[FrostHunterBundlePulseFusionHero2475];
        FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterKeyframeGammaGamma11972 = frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterBundlePulseFusionHero2475].FrostHunterKeyframeGammaGamma1197(i - i3, i2 == 2 ? 0 : i2);
        if (FrostHunterKeyframeGammaGamma11972 != -1) {
            return i3 + FrostHunterKeyframeGammaGamma11972;
        }
        int FrostHunterCameraXTurboCelestialHero5430 = FrostHunterCameraXTurboCelestialHero5430(FrostHunterBundlePulseFusionHero2475, false);
        while (FrostHunterCameraXTurboCelestialHero5430 != -1 && frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterCameraXTurboCelestialHero5430].FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterCameraXTurboCelestialHero5430 = FrostHunterCameraXTurboCelestialHero5430(FrostHunterCameraXTurboCelestialHero5430, false);
        }
        if (FrostHunterCameraXTurboCelestialHero5430 != -1) {
            return frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterCameraXTurboCelestialHero5430].FrostHunterBundlePulseFusionHero2475(false) + iArr[FrostHunterCameraXTurboCelestialHero5430];
        }
        if (i2 == 2) {
            return FrostHunterBundlePulseFusionHero2475(false);
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final FrostHunterRoomEntityFusionQuantumFusion6361 FrostHunterLevelListDrawableFusionDragonHero2232(int i, FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361, boolean z) {
        int[] iArr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBundlePulseFusionHero2475(iArr, i + 1, false, false);
        int i2 = this.FrostHunterRemoteConfigSpeedSpeed8566[FrostHunterBundlePulseFusionHero2475];
        this.FrostHunterCameraXPixelTurboCosmos9814[FrostHunterBundlePulseFusionHero2475].FrostHunterLevelListDrawableFusionDragonHero2232(i - iArr[FrostHunterBundlePulseFusionHero2475], frostHunterRoomEntityFusionQuantumFusion6361, z);
        frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterBundlePulseFusionHero2475 += i2;
        if (z) {
            Object obj = this.FrostHunterFlowMaxDragonHero5809[FrostHunterBundlePulseFusionHero2475];
            Object obj2 = frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            obj2.getClass();
            frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Pair.create(obj, obj2);
        }
        return frostHunterRoomEntityFusionQuantumFusion6361;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterLifecycleBlazeGammaElite2889(int i, int i2, boolean z) {
        int[] iArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBundlePulseFusionHero2475(iArr, i + 1, false, false);
        int i3 = iArr[FrostHunterBundlePulseFusionHero2475];
        FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterBundlePulseFusionHero2475].FrostHunterLifecycleBlazeGammaElite2889(i - i3, i2 != 2 ? i2 : 0, z);
        if (FrostHunterLifecycleBlazeGammaElite2889 != -1) {
            return i3 + FrostHunterLifecycleBlazeGammaElite2889;
        }
        int FrostHunterLintTitanVortexQuantum9911 = FrostHunterLintTitanVortexQuantum9911(FrostHunterBundlePulseFusionHero2475, z);
        while (FrostHunterLintTitanVortexQuantum9911 != -1 && frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterLintTitanVortexQuantum9911].FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterLintTitanVortexQuantum9911 = FrostHunterLintTitanVortexQuantum9911(FrostHunterLintTitanVortexQuantum9911, z);
        }
        if (FrostHunterLintTitanVortexQuantum9911 != -1) {
            return frostHunterStrictModeNebulaEliteHyper7105Arr[FrostHunterLintTitanVortexQuantum9911].FrostHunterAlphaAnimationNeoCosmos5761(z) + iArr[FrostHunterLintTitanVortexQuantum9911];
        }
        if (i2 == 2) {
            return FrostHunterAlphaAnimationNeoCosmos5761(z);
        }
        return -1;
    }

    public final int FrostHunterLintTitanVortexQuantum9911(int i, boolean z) {
        if (!z) {
            if (i < this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1) {
                return i + 1;
            }
            return -1;
        }
        FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194 = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterBundlePulseFusionHero2475[i] + 1;
        int[] iArr = frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final FrostHunterRoomEntityFusionQuantumFusion6361 FrostHunterRemoteConfigSpeedSpeed8566(Object obj, FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.FrostHunterAlertDialogAuroraDelta3200.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.FrostHunterRemoteConfigSpeedSpeed8566[intValue];
        this.FrostHunterCameraXPixelTurboCosmos9814[intValue].FrostHunterRemoteConfigSpeedSpeed8566(obj3, frostHunterRoomEntityFusionQuantumFusion6361);
        frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterBundlePulseFusionHero2475 += i;
        frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
        return frostHunterRoomEntityFusionQuantumFusion6361;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final int FrostHunterScaleAnimationStrikeSpark5059() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterStrictModeNebulaEliteHyper7105
    public final FrostHunterGyroscopeBetaVisionInferno6797 FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797, long j) {
        int[] iArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBundlePulseFusionHero2475(iArr, i + 1, false, false);
        int i2 = iArr[FrostHunterBundlePulseFusionHero2475];
        int i3 = this.FrostHunterLevelListDrawableFusionDragonHero2232[FrostHunterBundlePulseFusionHero2475];
        this.FrostHunterCameraXPixelTurboCosmos9814[FrostHunterBundlePulseFusionHero2475].FrostHunterServiceConnectionTurboPhoenixOmega6719(i - i2, frostHunterGyroscopeBetaVisionInferno6797, j);
        Object obj = this.FrostHunterFlowMaxDragonHero5809[FrostHunterBundlePulseFusionHero2475];
        Object obj2 = FrostHunterGyroscopeBetaVisionInferno6797.FrostHunterScaleAnimationStrikeSpark5059;
        Object obj3 = frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761 = obj;
        frostHunterGyroscopeBetaVisionInferno6797.FrostHunterFragmentBetaMegaVortex6025 += i3;
        frostHunterGyroscopeBetaVisionInferno6797.FrostHunterServiceConnectionTurboPhoenixOmega6719 += i3;
        return frostHunterGyroscopeBetaVisionInferno6797;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterImageAnalysisPrimeSpectraNova7921(ArrayList arrayList, FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194) {
        this(r0, r1, frostHunterLifecycleCameraControllerRogueQuantum1194);
        FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = new FrostHunterStrictModeNebulaEliteHyper7105[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            frostHunterStrictModeNebulaEliteHyper7105Arr[i2] = ((FrostHunterRemoteModelManagerNebulaPhantomMaster9475) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((FrostHunterRemoteModelManagerNebulaPhantomMaster9475) obj2).FrostHunterAlphaAnimationNeoCosmos5761();
            i++;
        }
    }
}
