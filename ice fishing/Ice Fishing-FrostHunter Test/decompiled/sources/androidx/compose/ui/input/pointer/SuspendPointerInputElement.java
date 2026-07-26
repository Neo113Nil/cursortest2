package androidx.compose.ui.input.pointer;

import android.content.Context.FrostHunterCanvasInfernoVortex4700;
import android.content.Context.FrostHunterContextInfernoVortex2870;
import android.content.Context.FrostHunterDrawerLayoutUltraStrike3303;
import android.content.Context.FrostHunterGradientDrawablePulseDragonInferno9637;
import android.content.Context.FrostHunterJobSchedulerOlympianSpectraMaster8767;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends FrostHunterJobSchedulerOlympianSpectraMaster8767 {
    public final Object FrostHunterBundlePulseFusionHero2475;
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final PointerInputEventHandler FrostHunterServiceEliteCelestialThunder1757;

    public SuspendPointerInputElement(Object obj, FrostHunterCanvasInfernoVortex4700 frostHunterCanvasInfernoVortex4700, PointerInputEventHandler pointerInputEventHandler, int i) {
        frostHunterCanvasInfernoVortex4700 = (i & 2) != 0 ? null : frostHunterCanvasInfernoVortex4700;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterCanvasInfernoVortex4700;
        this.FrostHunterServiceEliteCelestialThunder1757 = pointerInputEventHandler;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerOlympianSpectraMaster8767
    public final FrostHunterGradientDrawablePulseDragonInferno9637 FrostHunterBundlePulseFusionHero2475() {
        return new FrostHunterContextInfernoVortex2870(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterServiceEliteCelestialThunder1757);
    }

    @Override // android.content.Context.FrostHunterJobSchedulerOlympianSpectraMaster8767
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637) {
        FrostHunterContextInfernoVortex2870 frostHunterContextInfernoVortex2870 = (FrostHunterContextInfernoVortex2870) frostHunterGradientDrawablePulseDragonInferno9637;
        Object obj = frostHunterContextInfernoVortex2870.FrostHunterMotionSceneAuroraMega2271;
        Object obj2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        boolean z = !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, obj2);
        frostHunterContextInfernoVortex2870.FrostHunterMotionSceneAuroraMega2271 = obj2;
        Object obj3 = frostHunterContextInfernoVortex2870.FrostHunterBitmapTurboDeltaNebula8743;
        Object obj4 = this.FrostHunterBundlePulseFusionHero2475;
        if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj3, obj4)) {
            z = true;
        }
        frostHunterContextInfernoVortex2870.FrostHunterBitmapTurboDeltaNebula8743 = obj4;
        Class<?> cls = frostHunterContextInfernoVortex2870.FrostHunterDialogFragmentTurboPhoenixDragon7627.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.FrostHunterServiceEliteCelestialThunder1757;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            frostHunterContextInfernoVortex2870.FrostHunterObjectAnimatorPhoenixSpectraThunder6218();
        }
        frostHunterContextInfernoVortex2870.FrostHunterDialogFragmentTurboPhoenixDragon7627 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(suspendPointerInputElement.FrostHunterConstraintSetCloneMasterUltraRogue2633) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterBundlePulseFusionHero2475, suspendPointerInputElement.FrostHunterBundlePulseFusionHero2475) && this.FrostHunterServiceEliteCelestialThunder1757 == suspendPointerInputElement.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final int hashCode() {
        int hashCode = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() * 31;
        Object obj = this.FrostHunterBundlePulseFusionHero2475;
        return this.FrostHunterServiceEliteCelestialThunder1757.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
