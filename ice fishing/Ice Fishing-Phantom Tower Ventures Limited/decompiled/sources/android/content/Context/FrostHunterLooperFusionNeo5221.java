package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperFusionNeo5221 extends FrostHunterLocationListenerEpicShadowOlympian6477 implements Iterator {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterLooperFusionNeo5221(FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234, FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82342, int i) {
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewModelScopeMasterAlphaNovaX82342;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterViewModelScopeMasterAlphaNovaX8234;
    }

    @Override // android.content.Context.FrostHunterLocationListenerEpicShadowOlympian6477
    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234) {
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82342;
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82343 = null;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterViewModelScopeMasterAlphaNovaX8234 && frostHunterViewModelScopeMasterAlphaNovaX8234 == this.FrostHunterFlowMaxDragonHero5809) {
            this.FrostHunterFlowMaxDragonHero5809 = null;
            this.FrostHunterCameraXPixelTurboCosmos9814 = null;
        }
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82344 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterViewModelScopeMasterAlphaNovaX82344 == frostHunterViewModelScopeMasterAlphaNovaX8234) {
            switch (this.FrostHunterAlertDialogAuroraDelta3200) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    frostHunterViewModelScopeMasterAlphaNovaX82342 = frostHunterViewModelScopeMasterAlphaNovaX82344.FrostHunterKeyframeGammaGamma1197;
                    break;
                default:
                    frostHunterViewModelScopeMasterAlphaNovaX82342 = frostHunterViewModelScopeMasterAlphaNovaX82344.FrostHunterAlertDialogAuroraDelta3200;
                    break;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewModelScopeMasterAlphaNovaX82342;
        }
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82345 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterViewModelScopeMasterAlphaNovaX82345 == frostHunterViewModelScopeMasterAlphaNovaX8234) {
            FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82346 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterViewModelScopeMasterAlphaNovaX82345 != frostHunterViewModelScopeMasterAlphaNovaX82346 && frostHunterViewModelScopeMasterAlphaNovaX82346 != null) {
                frostHunterViewModelScopeMasterAlphaNovaX82343 = FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterViewModelScopeMasterAlphaNovaX82345);
            }
            this.FrostHunterFlowMaxDragonHero5809 = frostHunterViewModelScopeMasterAlphaNovaX82343;
        }
    }

    public final FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234) {
        switch (this.FrostHunterAlertDialogAuroraDelta3200) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterAlertDialogAuroraDelta3200;
            default:
                return frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterKeyframeGammaGamma1197;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterFlowMaxDragonHero5809 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82342 = this.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterFlowMaxDragonHero5809 = (frostHunterViewModelScopeMasterAlphaNovaX8234 == frostHunterViewModelScopeMasterAlphaNovaX82342 || frostHunterViewModelScopeMasterAlphaNovaX82342 == null) ? null : FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterViewModelScopeMasterAlphaNovaX8234);
        return frostHunterViewModelScopeMasterAlphaNovaX8234;
    }
}
