package android.content.Context;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterApplicationInfoUltraInfernoSpectra4401 {
    public final FrostHunterCoroutineScopeBetaMasterRogue7248 FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final ArrayList FrostHunterLifecycleBlazeGammaElite2889 = new ArrayList();
    public FrostHunterCoroutineScopeQuantumGamma5505 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterApplicationInfoUltraInfernoSpectra4401(FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248, String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoroutineScopeBetaMasterRogue7248;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401, String str, long j, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        frostHunterApplicationInfoUltraInfernoSpectra4401.getClass();
        str.getClass();
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterBundlePulseFusionHero2475(new FrostHunterNestedScrollViewFusionHyperion6860(str, z, frostHunterNotificationGammaBlazePhoenix7595), j);
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterCoroutineScopeQuantumGamma5505 frostHunterCoroutineScopeQuantumGamma5505 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterCoroutineScopeQuantumGamma5505 != null && frostHunterCoroutineScopeQuantumGamma5505.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
        }
        ArrayList arrayList = this.FrostHunterLifecycleBlazeGammaElite2889;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((FrostHunterCoroutineScopeQuantumGamma5505) arrayList.get(size)).FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                Logger logger = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterCoroutineScopeQuantumGamma5505 frostHunterCoroutineScopeQuantumGamma55052 = (FrostHunterCoroutineScopeQuantumGamma5505) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma55052, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterCoroutineScopeQuantumGamma5505 frostHunterCoroutineScopeQuantumGamma5505, long j) {
        frostHunterCoroutineScopeQuantumGamma5505.getClass();
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            if (!this.FrostHunterBundlePulseFusionHero2475) {
                if (FrostHunterServiceEliteCelestialThunder1757(frostHunterCoroutineScopeQuantumGamma5505, j, false)) {
                    this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475(this);
                }
                return;
            }
            boolean z = frostHunterCoroutineScopeQuantumGamma5505.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Logger logger = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (frostHunterCoroutineScopeBetaMasterRogue7248) {
            this.FrostHunterBundlePulseFusionHero2475 = true;
            if (FrostHunterAlphaAnimationNeoCosmos5761()) {
                this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475(this);
            }
        }
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(FrostHunterCoroutineScopeQuantumGamma5505 frostHunterCoroutineScopeQuantumGamma5505, long j, boolean z) {
        Logger logger = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterCoroutineScopeQuantumGamma5505.getClass();
        FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401 = frostHunterCoroutineScopeQuantumGamma5505.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterApplicationInfoUltraInfernoSpectra4401 != this) {
            if (frostHunterApplicationInfoUltraInfernoSpectra4401 != null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("task is in multiple queues");
                return false;
            }
            frostHunterCoroutineScopeQuantumGamma5505.FrostHunterBundlePulseFusionHero2475 = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.FrostHunterLifecycleBlazeGammaElite2889;
        int indexOf = arrayList.indexOf(frostHunterCoroutineScopeQuantumGamma5505);
        if (indexOf != -1) {
            if (frostHunterCoroutineScopeQuantumGamma5505.FrostHunterServiceEliteCelestialThunder1757 <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        frostHunterCoroutineScopeQuantumGamma5505.FrostHunterServiceEliteCelestialThunder1757 = j2;
        if (logger.isLoggable(Level.FINE)) {
            FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, this, z ? "run again after ".concat(FrostHunterGraphQuantumSpeed6562.FrostHunterServiceEliteCelestialThunder1757(j2 - nanoTime)) : "scheduled after ".concat(FrostHunterGraphQuantumSpeed6562.FrostHunterServiceEliteCelestialThunder1757(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((FrostHunterCoroutineScopeQuantumGamma5505) obj).FrostHunterServiceEliteCelestialThunder1757 - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, frostHunterCoroutineScopeQuantumGamma5505);
        return i == 0;
    }

    public final String toString() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
