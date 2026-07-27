package android.content.Context;

import android.os.SystemClock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSensorManagerMegaEclipse5665 {
    public final FrostHunterAssetManagerQuantumRogue9837 FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterSensorManagerMegaEclipse5665() {
        this(FrostHunterAssetManagerQuantumRogue9837.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final synchronized void FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean z = false;
        while (!this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            try {
                this.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return false;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        if (j <= 0) {
            return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            FrostHunterAlphaAnimationNeoCosmos5761();
        } else {
            boolean z = false;
            while (!this.FrostHunterConstraintSetCloneMasterUltraRogue2633 && elapsedRealtime < j2) {
                try {
                    this.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public FrostHunterSensorManagerMegaEclipse5665(FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAssetManagerQuantumRogue9837;
    }
}
