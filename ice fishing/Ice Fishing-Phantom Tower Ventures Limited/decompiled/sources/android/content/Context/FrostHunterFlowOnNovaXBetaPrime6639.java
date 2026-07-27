package android.content.Context;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowOnNovaXBetaPrime6639 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final /* synthetic */ AtomicReferenceArray FrostHunterServiceEliteCelestialThunder1757;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterLifecycleBlazeGammaElite2889 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterFlowOnNovaXBetaPrime6639.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater FrostHunterLevelListDrawableFusionDragonHero2232 = AtomicLongFieldUpdater.newUpdater(FrostHunterFlowOnNovaXBetaPrime6639.class, "_state$volatile");
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterWorkManagerMaxTurbo1858("REMOVE_FROZEN", 3);

    public FrostHunterFlowOnNovaXBetaPrime6639(int i, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
        int i2 = i - 1;
        this.FrostHunterBundlePulseFusionHero2475 = i2;
        this.FrostHunterServiceEliteCelestialThunder1757 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Check failed.");
        throw null;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterLevelListDrawableFusionDragonHero2232;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.FrostHunterBundlePulseFusionHero2475;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            AtomicReferenceArray atomicReferenceArray = this.FrostHunterServiceEliteCelestialThunder1757;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = this;
                if (FrostHunterLevelListDrawableFusionDragonHero2232.compareAndSet(frostHunterFlowOnNovaXBetaPrime6639, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime66392 = frostHunterFlowOnNovaXBetaPrime6639;
                    while ((atomicLongFieldUpdater.get(frostHunterFlowOnNovaXBetaPrime66392) & 1152921504606846976L) != 0) {
                        frostHunterFlowOnNovaXBetaPrime66392 = frostHunterFlowOnNovaXBetaPrime66392.FrostHunterBundlePulseFusionHero2475();
                        AtomicReferenceArray atomicReferenceArray2 = frostHunterFlowOnNovaXBetaPrime66392.FrostHunterServiceEliteCelestialThunder1757;
                        int i4 = frostHunterFlowOnNovaXBetaPrime66392.FrostHunterBundlePulseFusionHero2475 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof FrostHunterMeteringPointVisionLegendShadow5867) && ((FrostHunterMeteringPointVisionLegendShadow5867) obj2).FrostHunterAlphaAnimationNeoCosmos5761 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            frostHunterFlowOnNovaXBetaPrime66392 = null;
                        }
                        if (frostHunterFlowOnNovaXBetaPrime66392 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = frostHunterFlowOnNovaXBetaPrime6639;
            } else {
                int i5 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final FrostHunterFlowOnNovaXBetaPrime6639 FrostHunterBundlePulseFusionHero2475() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639;
        while (true) {
            atomicLongFieldUpdater = FrostHunterLevelListDrawableFusionDragonHero2232;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                frostHunterFlowOnNovaXBetaPrime6639 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            frostHunterFlowOnNovaXBetaPrime6639 = this;
            if (atomicLongFieldUpdater.compareAndSet(frostHunterFlowOnNovaXBetaPrime6639, j, j2)) {
                j = j2;
                break;
            }
            this = frostHunterFlowOnNovaXBetaPrime6639;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLifecycleBlazeGammaElite2889;
            FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime66392 = (FrostHunterFlowOnNovaXBetaPrime6639) atomicReferenceFieldUpdater.get(frostHunterFlowOnNovaXBetaPrime6639);
            if (frostHunterFlowOnNovaXBetaPrime66392 != null) {
                return frostHunterFlowOnNovaXBetaPrime66392;
            }
            FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime66393 = new FrostHunterFlowOnNovaXBetaPrime6639(frostHunterFlowOnNovaXBetaPrime6639.FrostHunterAlphaAnimationNeoCosmos5761 * 2, frostHunterFlowOnNovaXBetaPrime6639.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterBundlePulseFusionHero2475;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterServiceEliteCelestialThunder1757.get(i4);
                if (obj == null) {
                    obj = new FrostHunterMeteringPointVisionLegendShadow5867(i);
                }
                frostHunterFlowOnNovaXBetaPrime66393.FrostHunterServiceEliteCelestialThunder1757.set(frostHunterFlowOnNovaXBetaPrime66393.FrostHunterBundlePulseFusionHero2475 & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(frostHunterFlowOnNovaXBetaPrime66393, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(frostHunterFlowOnNovaXBetaPrime6639, null, frostHunterFlowOnNovaXBetaPrime66393) && atomicReferenceFieldUpdater.get(frostHunterFlowOnNovaXBetaPrime6639) == null) {
            }
        }
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterLevelListDrawableFusionDragonHero2232;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = this;
            if (atomicLongFieldUpdater.compareAndSet(frostHunterFlowOnNovaXBetaPrime6639, j, 2305843009213693952L | j)) {
                return true;
            }
            this = frostHunterFlowOnNovaXBetaPrime6639;
        }
    }

    public final Object FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterLevelListDrawableFusionDragonHero2232;
            long j = atomicLongFieldUpdater.get(frostHunterFlowOnNovaXBetaPrime6639);
            if ((j & 1152921504606846976L) != 0) {
                return FrostHunterRemoteConfigSpeedSpeed8566;
            }
            int i = (int) (j & 1073741823);
            int i2 = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterBundlePulseFusionHero2475;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterServiceEliteCelestialThunder1757;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof FrostHunterMeteringPointVisionLegendShadow5867) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (FrostHunterLevelListDrawableFusionDragonHero2232.compareAndSet(frostHunterFlowOnNovaXBetaPrime6639, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                frostHunterFlowOnNovaXBetaPrime6639 = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(frostHunterFlowOnNovaXBetaPrime6639);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            frostHunterFlowOnNovaXBetaPrime6639 = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterBundlePulseFusionHero2475();
                        } else {
                            FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime66392 = frostHunterFlowOnNovaXBetaPrime6639;
                            if (FrostHunterLevelListDrawableFusionDragonHero2232.compareAndSet(frostHunterFlowOnNovaXBetaPrime66392, j3, (j3 & (-1073741824)) | j2)) {
                                frostHunterFlowOnNovaXBetaPrime66392.FrostHunterServiceEliteCelestialThunder1757.set(i4 & frostHunterFlowOnNovaXBetaPrime66392.FrostHunterBundlePulseFusionHero2475, null);
                                frostHunterFlowOnNovaXBetaPrime6639 = null;
                            } else {
                                frostHunterFlowOnNovaXBetaPrime6639 = frostHunterFlowOnNovaXBetaPrime66392;
                            }
                        }
                        if (frostHunterFlowOnNovaXBetaPrime6639 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
