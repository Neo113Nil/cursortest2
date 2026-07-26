package android.content.Context;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterDialogVortexMega8716 extends FrostHunterConstraintLayoutSpeedStorm2675 implements Set {
    public static final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200 = 0;
    public transient FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterFlowMaxDragonHero5809;

    public static FrostHunterDialogVortexMega8716 FrostHunterAlertDialogAuroraDelta3200(int i, Object... objArr) {
        if (i == 0) {
            return FrostHunterViewMegaOmega8556.FrostHunterLintTitanVortexQuantum9911;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new FrostHunterLocationManagerSpectraOlympianHyper1306(obj);
        }
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(i);
        Object[] objArr2 = new Object[FrostHunterFlowMaxDragonHero5809];
        int i2 = FrostHunterFlowMaxDragonHero5809 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("at index ", i5));
                return null;
            }
            int hashCode = obj2.hashCode();
            int FrostHunterAnnotationProcessorSparkEclipse8710 = FrostHunterCanvasInfernoVortex4700.FrostHunterAnnotationProcessorSparkEclipse8710(hashCode);
            while (true) {
                int i6 = FrostHunterAnnotationProcessorSparkEclipse8710 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                FrostHunterAnnotationProcessorSparkEclipse8710++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new FrostHunterLocationManagerSpectraOlympianHyper1306(obj4);
        }
        if (FrostHunterFlowMaxDragonHero5809(i4) < FrostHunterFlowMaxDragonHero5809 / 2) {
            return FrostHunterAlertDialogAuroraDelta3200(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new FrostHunterViewMegaOmega8556(i3, i2, i4, objArr, objArr2);
    }

    public static int FrostHunterFlowMaxDragonHero5809(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXTurboCelestialHero5430("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static FrostHunterDialogVortexMega8716 FrostHunterKeyframeGammaGamma1197(Collection collection) {
        if ((collection instanceof FrostHunterDialogVortexMega8716) && !(collection instanceof SortedSet)) {
            FrostHunterDialogVortexMega8716 frostHunterDialogVortexMega8716 = (FrostHunterDialogVortexMega8716) collection;
            if (!frostHunterDialogVortexMega8716.FrostHunterRemoteConfigSpeedSpeed8566()) {
                return frostHunterDialogVortexMega8716;
            }
        }
        Object[] array = collection.toArray();
        return FrostHunterAlertDialogAuroraDelta3200(array.length, array);
    }

    @Override // android.content.Context.FrostHunterConstraintLayoutSpeedStorm2675
    public FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterAlarmManagerHeroTitaniumFusion5758 != null) {
            return frostHunterAlarmManagerHeroTitaniumFusion5758;
        }
        FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025();
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterFragmentBetaMegaVortex6025;
        return FrostHunterFragmentBetaMegaVortex6025;
    }

    public FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterFragmentBetaMegaVortex6025() {
        Object[] array = toArray(FrostHunterConstraintLayoutSpeedStorm2675.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        return FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof FrostHunterDialogVortexMega8716) && (this instanceof FrostHunterViewMegaOmega8556) && (((FrostHunterDialogVortexMega8716) obj) instanceof FrostHunterViewMegaOmega8556) && ((FrostHunterViewMegaOmega8556) this).FrostHunterFragmentBetaMegaVortex6025 != obj.hashCode()) {
            return false;
        }
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterConstraintSetCloneMasterUltraRogue2633(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterLevelListDrawableFusionDragonHero2232(this);
    }
}
