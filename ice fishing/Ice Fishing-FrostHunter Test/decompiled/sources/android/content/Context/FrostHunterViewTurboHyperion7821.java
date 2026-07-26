package android.content.Context;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewTurboHyperion7821 implements Map, Serializable, FrostHunterDispatchersCyberNovaX6237 {
    public static final FrostHunterViewTurboHyperion7821 FrostHunterLooperThreadBetaHyperionMax1000;
    public int[] FrostHunterAlertDialogAuroraDelta3200;
    public Object[] FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterApplicationInfoEpicHeroSpectra8243 FrostHunterCameraXTurboCelestialHero5430;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public Object[] FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int[] FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterLightSensorForceFusion4241;
    public FrostHunterTraceTurboDeltaNebula6893 FrostHunterLintTitanVortexQuantum9911;
    public FrostHunterTraceTurboDeltaNebula6893 FrostHunterResourcesTitanHyperVision5823;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public boolean FrostHunterTextViewDragonStormMega4297;

    static {
        FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = new FrostHunterViewTurboHyperion7821(0);
        frostHunterViewTurboHyperion7821.FrostHunterTextViewDragonStormMega4297 = true;
        FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterViewTurboHyperion7821;
    }

    public FrostHunterViewTurboHyperion7821(int i) {
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.FrostHunterCameraXPixelTurboCosmos9814 = objArr;
        this.FrostHunterFlowMaxDragonHero5809 = null;
        this.FrostHunterAlertDialogAuroraDelta3200 = iArr;
        this.FrostHunterKeyframeGammaGamma1197 = new int[highestOneBit];
        this.FrostHunterFragmentBetaMegaVortex6025 = 2;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
        this.FrostHunterLightSensorForceFusion4241 = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterAlertDialogAuroraDelta3200(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200[i];
        int i3 = this.FrostHunterFragmentBetaMegaVortex6025 * 2;
        int length = this.FrostHunterKeyframeGammaGamma1197.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.FrostHunterKeyframeGammaGamma1197.length - 1 : i2 - 1;
            i5++;
            int i7 = this.FrostHunterFragmentBetaMegaVortex6025;
            int[] iArr = this.FrostHunterKeyframeGammaGamma1197;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814[i9]) - i2;
                int[] iArr2 = this.FrostHunterKeyframeGammaGamma1197;
                if ((FrostHunterCameraXPixelTurboCosmos9814 & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.FrostHunterAlertDialogAuroraDelta3200[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.FrostHunterKeyframeGammaGamma1197[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.FrostHunterAlertDialogAuroraDelta3200[i] = -1;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223--;
        this.FrostHunterScaleAnimationStrikeSpark5059++;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        while (true) {
            int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(obj);
            int i = this.FrostHunterFragmentBetaMegaVortex6025 * 2;
            int length = this.FrostHunterKeyframeGammaGamma1197.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.FrostHunterKeyframeGammaGamma1197;
                int i3 = iArr[FrostHunterCameraXPixelTurboCosmos9814];
                if (i3 <= 0) {
                    int i4 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5;
                        objArr[i4] = obj;
                        this.FrostHunterAlertDialogAuroraDelta3200[i4] = FrostHunterCameraXPixelTurboCosmos9814;
                        iArr[FrostHunterCameraXPixelTurboCosmos9814] = i5;
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223++;
                        this.FrostHunterScaleAnimationStrikeSpark5059++;
                        if (i2 > this.FrostHunterFragmentBetaMegaVortex6025) {
                            this.FrostHunterFragmentBetaMegaVortex6025 = i2;
                        }
                        return i4;
                    }
                    FrostHunterLifecycleBlazeGammaElite2889(1);
                } else {
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        FrostHunterFlowMaxDragonHero5809(this.FrostHunterKeyframeGammaGamma1197.length * 2);
                        break;
                    }
                    FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814 == 0 ? this.FrostHunterKeyframeGammaGamma1197.length - 1 : FrostHunterCameraXPixelTurboCosmos9814 - 1;
                }
            }
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(boolean z) {
        int i;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.FrostHunterAlertDialogAuroraDelta3200;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.FrostHunterKeyframeGammaGamma1197[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(this.FrostHunterCameraXPixelTurboCosmos9814, i3, i);
        if (objArr != null) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(objArr, i3, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i3;
    }

    public final int FrostHunterCameraXPixelTurboCosmos9814(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.FrostHunterLightSensorForceFusion4241;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterTextViewDragonStormMega4297) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.FrostHunterAlertDialogAuroraDelta3200[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterFlowMaxDragonHero5809(int i) {
        this.FrostHunterScaleAnimationStrikeSpark5059++;
        int i2 = 0;
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719 > this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            FrostHunterBundlePulseFusionHero2475(false);
        }
        this.FrostHunterKeyframeGammaGamma1197 = new int[i];
        this.FrostHunterLightSensorForceFusion4241 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            int i3 = i2 + 1;
            int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814[i2]);
            int i4 = this.FrostHunterFragmentBetaMegaVortex6025;
            while (true) {
                int[] iArr = this.FrostHunterKeyframeGammaGamma1197;
                if (iArr[FrostHunterCameraXPixelTurboCosmos9814] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814 == 0 ? iArr.length - 1 : FrostHunterCameraXPixelTurboCosmos9814 - 1;
            }
        }
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(obj);
        int i = this.FrostHunterFragmentBetaMegaVortex6025;
        while (true) {
            int i2 = this.FrostHunterKeyframeGammaGamma1197[FrostHunterCameraXPixelTurboCosmos9814];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814 == 0 ? this.FrostHunterKeyframeGammaGamma1197.length - 1 : FrostHunterCameraXPixelTurboCosmos9814 - 1;
        }
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = objArr.length;
        int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int i3 = length - i2;
        int i4 = i2 - this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            FrostHunterBundlePulseFusionHero2475(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
            this.FrostHunterFlowMaxDragonHero5809 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.FrostHunterAlertDialogAuroraDelta3200 = Arrays.copyOf(this.FrostHunterAlertDialogAuroraDelta3200, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.FrostHunterKeyframeGammaGamma1197.length) {
                FrostHunterFlowMaxDragonHero5809(highestOneBit);
            }
        }
    }

    public final int FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.FrostHunterAlertDialogAuroraDelta3200[i] >= 0) {
                Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
                objArr.getClass();
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(Collection collection) {
        boolean FrostHunterLightSensorForceFusion4241;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(entry.getKey());
                    if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
                        FrostHunterLightSensorForceFusion4241 = false;
                    } else {
                        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
                        objArr.getClass();
                        FrostHunterLightSensorForceFusion4241 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(objArr[FrostHunterLevelListDrawableFusionDragonHero2232], entry.getValue());
                    }
                    if (!FrostHunterLightSensorForceFusion4241) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.FrostHunterAlertDialogAuroraDelta3200;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.FrostHunterKeyframeGammaGamma1197[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(this.FrostHunterCameraXPixelTurboCosmos9814, 0, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (objArr != null) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(objArr, 0, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
        this.FrostHunterScaleAnimationStrikeSpark5059++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return FrostHunterLevelListDrawableFusionDragonHero2232(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return FrostHunterRemoteConfigSpeedSpeed8566(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        FrostHunterTraceTurboDeltaNebula6893 frostHunterTraceTurboDeltaNebula6893 = this.FrostHunterResourcesTitanHyperVision5823;
        if (frostHunterTraceTurboDeltaNebula6893 != null) {
            return frostHunterTraceTurboDeltaNebula6893;
        }
        FrostHunterTraceTurboDeltaNebula6893 frostHunterTraceTurboDeltaNebula68932 = new FrostHunterTraceTurboDeltaNebula6893(this, 0);
        this.FrostHunterResourcesTitanHyperVision5823 = frostHunterTraceTurboDeltaNebula68932;
        return frostHunterTraceTurboDeltaNebula68932;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 == map.size() && FrostHunterServiceEliteCelestialThunder1757(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
            return null;
        }
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        objArr.getClass();
        return objArr[FrostHunterLevelListDrawableFusionDragonHero2232];
    }

    @Override // java.util.Map
    public final int hashCode() {
        FrostHunterThemeOverlayElitePulse9971 frostHunterThemeOverlayElitePulse9971 = new FrostHunterThemeOverlayElitePulse9971(this, 0);
        int i = 0;
        while (frostHunterThemeOverlayElitePulse9971.hasNext()) {
            int i2 = frostHunterThemeOverlayElitePulse9971.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = (FrostHunterViewTurboHyperion7821) frostHunterThemeOverlayElitePulse9971.FrostHunterKeyframeGammaGamma1197;
            if (i2 >= frostHunterViewTurboHyperion7821.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                return 0;
            }
            frostHunterThemeOverlayElitePulse9971.FrostHunterCameraXPixelTurboCosmos9814 = i2 + 1;
            frostHunterThemeOverlayElitePulse9971.FrostHunterFlowMaxDragonHero5809 = i2;
            Object obj = frostHunterViewTurboHyperion7821.FrostHunterCameraXPixelTurboCosmos9814[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = frostHunterViewTurboHyperion7821.FrostHunterFlowMaxDragonHero5809;
            objArr.getClass();
            Object obj2 = objArr[frostHunterThemeOverlayElitePulse9971.FrostHunterFlowMaxDragonHero5809];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            frostHunterThemeOverlayElitePulse9971.FrostHunterBundlePulseFusionHero2475();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        FrostHunterTraceTurboDeltaNebula6893 frostHunterTraceTurboDeltaNebula6893 = this.FrostHunterLintTitanVortexQuantum9911;
        if (frostHunterTraceTurboDeltaNebula6893 != null) {
            return frostHunterTraceTurboDeltaNebula6893;
        }
        FrostHunterTraceTurboDeltaNebula6893 frostHunterTraceTurboDeltaNebula68932 = new FrostHunterTraceTurboDeltaNebula6893(this, 1);
        this.FrostHunterLintTitanVortexQuantum9911 = frostHunterTraceTurboDeltaNebula68932;
        return frostHunterTraceTurboDeltaNebula68932;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(obj);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (objArr == null) {
            int length = this.FrostHunterCameraXPixelTurboCosmos9814.length;
            if (length < 0) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.FrostHunterFlowMaxDragonHero5809 = objArr;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 >= 0) {
            objArr[FrostHunterAlphaAnimationNeoCosmos5761] = obj2;
            return null;
        }
        int i = (-FrostHunterAlphaAnimationNeoCosmos5761) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        FrostHunterLifecycleBlazeGammaElite2889(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(entry.getKey());
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            if (objArr == null) {
                int length = this.FrostHunterCameraXPixelTurboCosmos9814.length;
                if (length < 0) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.FrostHunterFlowMaxDragonHero5809 = objArr;
                }
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 >= 0) {
                objArr[FrostHunterAlphaAnimationNeoCosmos5761] = entry.getValue();
            } else {
                int i = (-FrostHunterAlphaAnimationNeoCosmos5761) - 1;
                if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
            return null;
        }
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        objArr.getClass();
        Object obj2 = objArr[FrostHunterLevelListDrawableFusionDragonHero2232];
        FrostHunterAlertDialogAuroraDelta3200(FrostHunterLevelListDrawableFusionDragonHero2232);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 * 3) + 2);
        sb.append("{");
        int i = 0;
        FrostHunterThemeOverlayElitePulse9971 frostHunterThemeOverlayElitePulse9971 = new FrostHunterThemeOverlayElitePulse9971(this, 0);
        while (frostHunterThemeOverlayElitePulse9971.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = frostHunterThemeOverlayElitePulse9971.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = (FrostHunterViewTurboHyperion7821) frostHunterThemeOverlayElitePulse9971.FrostHunterKeyframeGammaGamma1197;
            if (i2 >= frostHunterViewTurboHyperion7821.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                return null;
            }
            frostHunterThemeOverlayElitePulse9971.FrostHunterCameraXPixelTurboCosmos9814 = i2 + 1;
            frostHunterThemeOverlayElitePulse9971.FrostHunterFlowMaxDragonHero5809 = i2;
            Object obj = frostHunterViewTurboHyperion7821.FrostHunterCameraXPixelTurboCosmos9814[i2];
            if (obj == frostHunterViewTurboHyperion7821) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = frostHunterViewTurboHyperion7821.FrostHunterFlowMaxDragonHero5809;
            objArr.getClass();
            Object obj2 = objArr[frostHunterThemeOverlayElitePulse9971.FrostHunterFlowMaxDragonHero5809];
            if (obj2 == frostHunterViewTurboHyperion7821) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            frostHunterThemeOverlayElitePulse9971.FrostHunterBundlePulseFusionHero2475();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        FrostHunterApplicationInfoEpicHeroSpectra8243 frostHunterApplicationInfoEpicHeroSpectra8243 = this.FrostHunterCameraXTurboCelestialHero5430;
        if (frostHunterApplicationInfoEpicHeroSpectra8243 != null) {
            return frostHunterApplicationInfoEpicHeroSpectra8243;
        }
        FrostHunterApplicationInfoEpicHeroSpectra8243 frostHunterApplicationInfoEpicHeroSpectra82432 = new FrostHunterApplicationInfoEpicHeroSpectra8243(0, this);
        this.FrostHunterCameraXTurboCelestialHero5430 = frostHunterApplicationInfoEpicHeroSpectra82432;
        return frostHunterApplicationInfoEpicHeroSpectra82432;
    }
}
