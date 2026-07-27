package android.content.Context;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOrientationSensorPhoenixOmegaStorm9585 {
    public Object[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterOrientationSensorPhoenixOmegaStorm9585(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i == 0 ? FrostHunterStateOmegaNebulaInferno6382.FrostHunterAlphaAnimationNeoCosmos5761 : new Object[i];
    }

    public final Object FrostHunterAlertDialogAuroraDelta3200(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(i);
            throw null;
        }
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1;
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (objArr.length < i) {
            FrostHunterFragmentBetaMegaVortex6025(i, objArr);
        }
        Object[] objArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        objArr2[i2] = obj;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 1;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterAlphaAnimationNeoCosmos5761, 0, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
    }

    public final boolean FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int size = list.size() + i;
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (objArr.length < size) {
            FrostHunterFragmentBetaMegaVortex6025(size, objArr);
        }
        Object[] objArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = list.size() + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final boolean FrostHunterFlowMaxDragonHero5809(Object obj) {
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
            return false;
        }
        FrostHunterAlertDialogAuroraDelta3200(FrostHunterLevelListDrawableFusionDragonHero2232);
        return true;
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 0, length, objArr, objArr2);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = objArr2;
    }

    public final void FrostHunterKeyframeGammaGamma1197(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i2, i3, objArr, objArr);
            }
            int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i5 = i4 - (i2 - i);
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterAlphaAnimationNeoCosmos5761, i5, i4);
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i5;
        }
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = 0;
        if (obj == null) {
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object FrostHunterLifecycleBlazeGammaElite2889(int i) {
        if (i >= 0 && i < this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761[i];
        }
        FrostHunterServiceConnectionTurboPhoenixOmega6719(i);
        throw null;
    }

    public final boolean FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0;
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(int i) {
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Index ", i, " must be in 0..");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1);
        throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
    }

    public final Object FrostHunterServiceEliteCelestialThunder1757() {
        if (FrostHunterRemoteConfigSpeedSpeed8566()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.FrostHunterAlphaAnimationNeoCosmos5761[0];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterOrientationSensorPhoenixOmegaStorm9585) {
            FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm9585 = (FrostHunterOrientationSensorPhoenixOmegaStorm9585) obj;
            int i = frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i == i2) {
                Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                Object[] objArr2 = frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, i2);
                int i3 = FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814;
                int i4 = FrostHunterRunnableCosmosCelestial4235.FrostHunterFlowMaxDragonHero5809;
                if (i3 > i4) {
                    return true;
                }
                while (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ FrostHunterOrientationSensorPhoenixOmegaStorm9585() {
        this(16);
    }
}
