package android.content.Context;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraXNovaCelestialCelestial7906 implements FrostHunterBroadcastFusionTurbo7906 {
    public final AtomicReference FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterCameraXNovaCelestialCelestial7906(FrostHunterBroadcastFusionTurbo7906 frostHunterBroadcastFusionTurbo7906) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new AtomicReference(frostHunterBroadcastFusionTurbo7906);
    }

    @Override // android.content.Context.FrostHunterBroadcastFusionTurbo7906
    public final Iterator iterator() {
        FrostHunterBroadcastFusionTurbo7906 frostHunterBroadcastFusionTurbo7906 = (FrostHunterBroadcastFusionTurbo7906) this.FrostHunterAlphaAnimationNeoCosmos5761.getAndSet(null);
        if (frostHunterBroadcastFusionTurbo7906 != null) {
            return frostHunterBroadcastFusionTurbo7906.iterator();
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This sequence can be consumed only once.");
        return null;
    }
}
