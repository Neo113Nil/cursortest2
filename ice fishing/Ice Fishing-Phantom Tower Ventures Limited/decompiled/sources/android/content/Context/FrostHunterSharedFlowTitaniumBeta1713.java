package android.content.Context;

import java.io.Serializable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedFlowTitaniumBeta1713 implements FrostHunterMergePhoenixEpic5883, Serializable {
    public final Object FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterCameraXPixelTurboCosmos9814;
    public volatile Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterSharedFlowTitaniumBeta1713(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterNotificationGammaBlazePhoenix7595;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterChipSpeedTitan5326.FrostHunterLooperHyperionForce4133;
        this.FrostHunterAlertDialogAuroraDelta3200 = this;
    }

    @Override // android.content.Context.FrostHunterMergePhoenixEpic5883
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterFlowMaxDragonHero5809 != FrostHunterChipSpeedTitan5326.FrostHunterLooperHyperionForce4133;
    }

    @Override // android.content.Context.FrostHunterMergePhoenixEpic5883
    public final Object getValue() {
        Object obj;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326 = FrostHunterChipSpeedTitan5326.FrostHunterLooperHyperionForce4133;
        if (obj2 != frostHunterChipSpeedTitan5326) {
            return obj2;
        }
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            obj = this.FrostHunterFlowMaxDragonHero5809;
            if (obj == frostHunterChipSpeedTitan5326) {
                FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595 = this.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterNotificationGammaBlazePhoenix7595.getClass();
                obj = frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                this.FrostHunterFlowMaxDragonHero5809 = obj;
                this.FrostHunterCameraXPixelTurboCosmos9814 = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return FrostHunterBundlePulseFusionHero2475() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
