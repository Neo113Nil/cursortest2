package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPagingSourceHeroNovaEpic9646 implements Closeable {
    public final FrostHunterMergeSpeedHyperionBlaze4246 FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterFlowMaxDragonHero5809;
    public Closeable FrostHunterFragmentBetaMegaVortex6025;
    public Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterPagingSourceHeroNovaEpic9646(int i, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 1:
                this.FrostHunterFlowMaxDragonHero5809 = z;
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterMergeSpeedHyperionBlaze4246();
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809 = z;
                FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
                this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterMergeSpeedHyperionBlaze4246;
                Deflater deflater = new Deflater(-1, true);
                this.FrostHunterKeyframeGammaGamma1197 = deflater;
                this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterInstrumentationPulseThunder2132(frostHunterMergeSpeedHyperionBlaze4246, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((FrostHunterInstrumentationPulseThunder2132) this.FrostHunterFragmentBetaMegaVortex6025).close();
                break;
            default:
                FrostHunterNavigationCyberPhoenixPixel7747 frostHunterNavigationCyberPhoenixPixel7747 = (FrostHunterNavigationCyberPhoenixPixel7747) this.FrostHunterFragmentBetaMegaVortex6025;
                if (frostHunterNavigationCyberPhoenixPixel7747 != null) {
                    frostHunterNavigationCyberPhoenixPixel7747.close();
                }
                this.FrostHunterFragmentBetaMegaVortex6025 = null;
                this.FrostHunterKeyframeGammaGamma1197 = null;
                break;
        }
    }
}
