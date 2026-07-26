package android.content.Context;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterTimerCosmosCyberLegend3595 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int[] FrostHunterCameraXPixelTurboCosmos9814;
    public Object[] FrostHunterFlowMaxDragonHero5809;

    public FrostHunterTimerCosmosCyberLegend3595(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i == 0 ? FrostHunterVectorDrawableForceMax1351.FrostHunterRemoteConfigSpeedSpeed8566 : new int[i];
        this.FrostHunterFlowMaxDragonHero5809 = i == 0 ? FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809 : new Object[i << 1];
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 * 2;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int FrostHunterBundlePulseFusionHero2475(Object obj) {
        return obj == null ? FrostHunterServiceEliteCelestialThunder1757() : FrostHunterConstraintSetCloneMasterUltraRogue2633(obj.hashCode(), obj);
    }

    public final Object FrostHunterCameraXPixelTurboCosmos9814(int i) {
        boolean z = false;
        if (i >= 0 && i < this.FrostHunterAlertDialogAuroraDelta3200) {
            z = true;
        }
        if (z) {
            return this.FrostHunterFlowMaxDragonHero5809[(i << 1) + 1];
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, Object obj) {
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i2 == 0) {
            return -1;
        }
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, i2, i);
        if (FrostHunterCameraXPixelTurboCosmos9814 < 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[FrostHunterCameraXPixelTurboCosmos9814 << 1])) {
            return FrostHunterCameraXPixelTurboCosmos9814;
        }
        int i3 = FrostHunterCameraXPixelTurboCosmos9814 + 1;
        while (i3 < i2 && this.FrostHunterCameraXPixelTurboCosmos9814[i3] == i) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = FrostHunterCameraXPixelTurboCosmos9814 - 1; i4 >= 0 && this.FrostHunterCameraXPixelTurboCosmos9814[i4] == i; i4--) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.FrostHunterAlertDialogAuroraDelta3200)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(iArr, i7);
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, i7 << 1);
            if (i2 != this.FrostHunterAlertDialogAuroraDelta3200) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
                return null;
            }
            if (i > 0) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(0, 0, i, iArr, this.FrostHunterCameraXPixelTurboCosmos9814);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 0, i3, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
            if (i < i4) {
                int i8 = i + 1;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i, i8, i2, iArr, this.FrostHunterCameraXPixelTurboCosmos9814);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3, i8 << 1, i2 << 1, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
        }
        if (i2 == this.FrostHunterAlertDialogAuroraDelta3200) {
            this.FrostHunterAlertDialogAuroraDelta3200 = i4;
            return obj;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
        return null;
    }

    public final Object FrostHunterLifecycleBlazeGammaElite2889(int i) {
        boolean z = false;
        if (i >= 0 && i < this.FrostHunterAlertDialogAuroraDelta3200) {
            z = true;
        }
        if (z) {
            return this.FrostHunterFlowMaxDragonHero5809[i << 1];
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object FrostHunterRemoteConfigSpeedSpeed8566(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.FrostHunterAlertDialogAuroraDelta3200) {
            z = true;
        }
        if (!z) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i == 0) {
            return -1;
        }
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, i, 0);
        if (FrostHunterCameraXPixelTurboCosmos9814 < 0 || this.FrostHunterFlowMaxDragonHero5809[FrostHunterCameraXPixelTurboCosmos9814 << 1] == null) {
            return FrostHunterCameraXPixelTurboCosmos9814;
        }
        int i2 = FrostHunterCameraXPixelTurboCosmos9814 + 1;
        while (i2 < i && this.FrostHunterCameraXPixelTurboCosmos9814[i2] == 0) {
            if (this.FrostHunterFlowMaxDragonHero5809[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = FrostHunterCameraXPixelTurboCosmos9814 - 1; i3 >= 0 && this.FrostHunterCameraXPixelTurboCosmos9814[i3] == 0; i3--) {
            if (this.FrostHunterFlowMaxDragonHero5809[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final void clear() {
        if (this.FrostHunterAlertDialogAuroraDelta3200 > 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterRemoteConfigSpeedSpeed8566;
            this.FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
            this.FrostHunterAlertDialogAuroraDelta3200 = 0;
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200 <= 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    public boolean containsKey(Object obj) {
        return FrostHunterBundlePulseFusionHero2475(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return FrostHunterAlphaAnimationNeoCosmos5761(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof FrostHunterTimerCosmosCyberLegend3595) {
                int i = this.FrostHunterAlertDialogAuroraDelta3200;
                if (i != ((FrostHunterTimerCosmosCyberLegend3595) obj).FrostHunterAlertDialogAuroraDelta3200) {
                    return false;
                }
                FrostHunterTimerCosmosCyberLegend3595 frostHunterTimerCosmosCyberLegend3595 = (FrostHunterTimerCosmosCyberLegend3595) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i2);
                    Object FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i2);
                    Object obj2 = frostHunterTimerCosmosCyberLegend3595.get(FrostHunterLifecycleBlazeGammaElite2889);
                    if (FrostHunterCameraXPixelTurboCosmos9814 == null) {
                        if (obj2 != null || !frostHunterTimerCosmosCyberLegend3595.containsKey(FrostHunterLifecycleBlazeGammaElite2889)) {
                            return false;
                        }
                    } else if (!FrostHunterCameraXPixelTurboCosmos9814.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.FrostHunterAlertDialogAuroraDelta3200 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
            for (int i4 = 0; i4 < i3; i4++) {
                Object FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLifecycleBlazeGammaElite2889(i4);
                Object FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterCameraXPixelTurboCosmos9814(i4);
                Object obj3 = ((Map) obj).get(FrostHunterLifecycleBlazeGammaElite28892);
                if (FrostHunterCameraXPixelTurboCosmos98142 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(FrostHunterLifecycleBlazeGammaElite28892)) {
                        return false;
                    }
                } else if (!FrostHunterCameraXPixelTurboCosmos98142.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 >= 0) {
            return this.FrostHunterFlowMaxDragonHero5809[(FrostHunterBundlePulseFusionHero2475 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        return FrostHunterBundlePulseFusionHero2475 >= 0 ? this.FrostHunterFlowMaxDragonHero5809[(FrostHunterBundlePulseFusionHero2475 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.FrostHunterAlertDialogAuroraDelta3200 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj != null ? FrostHunterConstraintSetCloneMasterUltraRogue2633(hashCode, obj) : FrostHunterServiceEliteCelestialThunder1757();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 >= 0) {
            int i2 = (FrostHunterConstraintSetCloneMasterUltraRogue2633 << 1) + 1;
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(iArr, i4);
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, i4 << 1);
            if (i != this.FrostHunterAlertDialogAuroraDelta3200) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i5 = i3 + 1;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i5 << 1, i3 << 1, this.FrostHunterAlertDialogAuroraDelta3200 << 1, objArr2, objArr2);
        }
        int i6 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i == i6) {
            int[] iArr3 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.FrostHunterAlertDialogAuroraDelta3200 = i6 + 1;
                return null;
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 < 0 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, FrostHunterCameraXPixelTurboCosmos9814(FrostHunterBundlePulseFusionHero2475))) {
            return false;
        }
        FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterBundlePulseFusionHero2475);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 < 0 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, FrostHunterCameraXPixelTurboCosmos9814(FrostHunterBundlePulseFusionHero2475))) {
            return false;
        }
        FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBundlePulseFusionHero2475, obj3);
        return true;
    }

    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.FrostHunterAlertDialogAuroraDelta3200 * 28);
        sb.append('{');
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i2);
            if (FrostHunterLifecycleBlazeGammaElite2889 != sb) {
                sb.append(FrostHunterLifecycleBlazeGammaElite2889);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i2);
            if (FrostHunterCameraXPixelTurboCosmos9814 != sb) {
                sb.append(FrostHunterCameraXPixelTurboCosmos9814);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 >= 0) {
            return FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterBundlePulseFusionHero2475);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 >= 0) {
            return FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBundlePulseFusionHero2475, obj2);
        }
        return null;
    }
}
