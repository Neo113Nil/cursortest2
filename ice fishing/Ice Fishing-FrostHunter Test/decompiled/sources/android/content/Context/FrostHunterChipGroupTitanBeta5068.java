package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterChipGroupTitanBeta5068 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterChipSpectraInfernoVortex8090 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterChipGroupTitanBeta5068(FrostHunterChipSpectraInfernoVortex8090 frostHunterChipSpectraInfernoVortex8090, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterChipSpectraInfernoVortex8090;
    }

    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterChipSpectraInfernoVortex8090 frostHunterChipSpectraInfernoVortex8090 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                frostHunterChipSpectraInfernoVortex8090.setValue(Boolean.FALSE);
                break;
            default:
                frostHunterChipSpectraInfernoVortex8090.setValue(Boolean.TRUE);
                break;
        }
        return frostHunterLinearLayoutSolarHero7990;
    }
}
