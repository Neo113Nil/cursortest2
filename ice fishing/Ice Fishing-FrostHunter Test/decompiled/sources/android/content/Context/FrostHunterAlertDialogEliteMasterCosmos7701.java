package android.content.Context;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlertDialogEliteMasterCosmos7701 {
    public final Thread FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterTransitionNebulaBlaze7285 FrostHunterBundlePulseFusionHero2475;
    public boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterRotateDrawableMaxPrime8918 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final boolean FrostHunterFlowMaxDragonHero5809;
    public final ArrayDeque FrostHunterLevelListDrawableFusionDragonHero2232;
    public final ArrayDeque FrostHunterLifecycleBlazeGammaElite2889;
    public final Object FrostHunterRemoteConfigSpeedSpeed8566;
    public final CopyOnWriteArraySet FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAlertDialogEliteMasterCosmos7701(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837, FrostHunterTransitionNebulaBlaze7285 frostHunterTransitionNebulaBlaze7285, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = thread;
        this.FrostHunterServiceEliteCelestialThunder1757 = copyOnWriteArraySet;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterTransitionNebulaBlaze7285;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new Object();
        this.FrostHunterLifecycleBlazeGammaElite2889 = new ArrayDeque();
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new ArrayDeque();
        if (looper == null || frostHunterAssetManagerQuantumRogue9837 == null || frostHunterTransitionNebulaBlaze7285 == null) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
        } else {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAssetManagerQuantumRogue9837.FrostHunterAlphaAnimationNeoCosmos5761(looper, new FrostHunterTimerForceShadowPulse1881(0, this));
        }
        this.FrostHunterFlowMaxDragonHero5809 = z;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        obj.getClass();
        synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566) {
            try {
                if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                    return;
                }
                this.FrostHunterServiceEliteCelestialThunder1757.add(new FrostHunterCamera2TurboSolar4584(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, FrostHunterApplicationInfoHeroForceSpark2431 frostHunterApplicationInfoHeroForceSpark2431) {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(Thread.currentThread() == this.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        this.FrostHunterLevelListDrawableFusionDragonHero2232.add(new FrostHunterPaintVortexMax7729(i, 3, new CopyOnWriteArraySet(this.FrostHunterServiceEliteCelestialThunder1757), frostHunterApplicationInfoHeroForceSpark2431));
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(Thread.currentThread() == this.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        ArrayDeque arrayDeque = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.FrostHunterBundlePulseFusionHero2475 != null) {
            FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterRotateDrawableMaxPrime8918.getClass();
            Handler handler = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761;
            if (!handler.hasMessages(1)) {
                FrostHunterObjectDetectionNeoBlaze6529 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761(1);
                Message message = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
        ArrayDeque arrayDeque2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i, FrostHunterApplicationInfoHeroForceSpark2431 frostHunterApplicationInfoHeroForceSpark2431) {
        FrostHunterBundlePulseFusionHero2475(i, frostHunterApplicationInfoHeroForceSpark2431);
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(Thread.currentThread() == this.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = true;
        }
        Iterator it = this.FrostHunterServiceEliteCelestialThunder1757.iterator();
        while (it.hasNext()) {
            FrostHunterCamera2TurboSolar4584 frostHunterCamera2TurboSolar4584 = (FrostHunterCamera2TurboSolar4584) it.next();
            FrostHunterTransitionNebulaBlaze7285 frostHunterTransitionNebulaBlaze7285 = this.FrostHunterBundlePulseFusionHero2475;
            frostHunterCamera2TurboSolar4584.FrostHunterServiceEliteCelestialThunder1757 = true;
            if (frostHunterTransitionNebulaBlaze7285 != null && frostHunterCamera2TurboSolar4584.FrostHunterBundlePulseFusionHero2475) {
                frostHunterCamera2TurboSolar4584.FrostHunterBundlePulseFusionHero2475 = false;
                frostHunterTransitionNebulaBlaze7285.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterCamera2TurboSolar4584.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterCamera2TurboSolar4584.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633());
            }
        }
        this.FrostHunterServiceEliteCelestialThunder1757.clear();
    }

    public FrostHunterAlertDialogEliteMasterCosmos7701(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
