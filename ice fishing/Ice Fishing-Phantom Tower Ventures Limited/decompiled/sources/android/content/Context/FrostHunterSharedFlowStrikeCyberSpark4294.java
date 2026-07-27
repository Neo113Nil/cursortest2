package android.content.Context;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedFlowStrikeCyberSpark4294 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterSharedFlowStrikeCyberSpark4294(int i, int i2) {
        super(1);
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((FrostHunterServiceInfoTitaniumPrimeCyber9213) obj).FrostHunterItemDecorationPixelShadow2695(i2));
            default:
                return Boolean.valueOf(((View) obj).getId() == i2);
        }
    }
}
