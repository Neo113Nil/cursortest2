package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterExecutorPhantomGammaOmega9436 implements FrostHunterBroadcastFusionTurbo7906, FrostHunterObjectAnimatorPixelHyperionCosmos3054 {
    public final FrostHunterBroadcastFusionTurbo7906 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterExecutorPhantomGammaOmega9436(FrostHunterBroadcastFusionTurbo7906 frostHunterBroadcastFusionTurbo7906, int i) {
        frostHunterBroadcastFusionTurbo7906.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterBroadcastFusionTurbo7906;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        if (i >= 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterAlertDialogAuroraDelta3200("count must be non-negative, but was ", i, 46);
        throw null;
    }

    @Override // android.content.Context.FrostHunterObjectAnimatorPixelHyperionCosmos3054
    public final FrostHunterBroadcastFusionTurbo7906 FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i;
        return i2 < 0 ? new FrostHunterExecutorPhantomGammaOmega9436(this, i) : new FrostHunterExecutorPhantomGammaOmega9436(this.FrostHunterAlphaAnimationNeoCosmos5761, i2);
    }

    @Override // android.content.Context.FrostHunterBroadcastFusionTurbo7906
    public final Iterator iterator() {
        return new FrostHunterRoomDaoHyperFusionCelestial1775(this);
    }
}
