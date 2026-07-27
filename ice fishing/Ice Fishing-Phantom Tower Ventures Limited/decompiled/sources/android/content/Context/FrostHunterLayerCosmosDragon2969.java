package android.content.Context;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayerCosmosDragon2969 implements FrostHunterProGuardCyberHyper2901 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterClipboardManagerMegaRogue2930 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterLayerCosmosDragon2969(FrostHunterClipboardManagerMegaRogue2930 frostHunterClipboardManagerMegaRogue2930, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterClipboardManagerMegaRogue2930;
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public final Object get() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterClipboardManagerMegaRogue2930 frostHunterClipboardManagerMegaRogue2930 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String packageName = ((Context) frostHunterClipboardManagerMegaRogue2930.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new FrostHunterBroadcastBetaHyper4060(Integer.valueOf(FrostHunterBroadcastBetaHyper4060.FrostHunterKeyframeGammaGamma1197).intValue(), (Context) frostHunterClipboardManagerMegaRogue2930.get(), "com.google.android.datatransport.events");
        }
    }
}
