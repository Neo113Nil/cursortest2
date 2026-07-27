package android.content.Context;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyEventOlympianVortexShadow9415 implements FrostHunterObjectAnimatorOmegaVision3647 {
    public final FrostHunterDataBindingTurboTitanium8468 FrostHunterCameraXPixelTurboCosmos9814;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterFlowMaxDragonHero5809 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterKeyEventOlympianVortexShadow9415.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterAlertDialogAuroraDelta3200 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterKeyEventOlympianVortexShadow9415.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterKeyframeGammaGamma1197 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterKeyEventOlympianVortexShadow9415.class, Object.class, "_exceptionsHolder$volatile");

    public FrostHunterKeyEventOlympianVortexShadow9415(FrostHunterDataBindingTurboTitanium8468 frostHunterDataBindingTurboTitanium8468, Throwable th) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDataBindingTurboTitanium8468;
        this._rootCause$volatile = th;
    }

    @Override // android.content.Context.FrostHunterObjectAnimatorOmegaVision3647
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        return FrostHunterBundlePulseFusionHero2475() == null;
    }

    public final Throwable FrostHunterBundlePulseFusionHero2475() {
        return (Throwable) FrostHunterAlertDialogAuroraDelta3200.get(this);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Throwable th) {
        Throwable FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475();
        if (FrostHunterBundlePulseFusionHero2475 == null) {
            FrostHunterAlertDialogAuroraDelta3200.set(this, th);
            return;
        }
        if (th == FrostHunterBundlePulseFusionHero2475) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterKeyframeGammaGamma1197;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(obj, "State is ");
                return;
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final ArrayList FrostHunterLevelListDrawableFusionDragonHero2232(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterKeyframeGammaGamma1197;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475();
        if (FrostHunterBundlePulseFusionHero2475 != null) {
            arrayList.add(0, FrostHunterBundlePulseFusionHero2475);
        }
        if (th != null && !th.equals(FrostHunterBundlePulseFusionHero2475)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterRemoteConfigSpeedSpeed8566);
        return arrayList;
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889() {
        return FrostHunterBundlePulseFusionHero2475() != null;
    }

    @Override // android.content.Context.FrostHunterObjectAnimatorOmegaVision3647
    public final FrostHunterDataBindingTurboTitanium8468 FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(FrostHunterLifecycleBlazeGammaElite2889());
        sb.append(", completing=");
        sb.append(FrostHunterFlowMaxDragonHero5809.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(FrostHunterBundlePulseFusionHero2475());
        sb.append(", exceptions=");
        sb.append(FrostHunterKeyframeGammaGamma1197.get(this));
        sb.append(", list=");
        sb.append(this.FrostHunterCameraXPixelTurboCosmos9814);
        sb.append(']');
        return sb.toString();
    }
}
