package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperThreadTurboSolar7605 extends FrostHunterMaterialButtonShadowStrikeOlympian8282 {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterFragmentBetaMegaVortex6025;
    public final Iterator FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterLooperThreadTurboSolar7605(FrostHunterAnalyticsThunderForceLegend3216 frostHunterAnalyticsThunderForceLegend3216) {
        this();
        this.FrostHunterAlertDialogAuroraDelta3200 = 1;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterAnalyticsThunderForceLegend3216;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterAnalyticsThunderForceLegend3216.FrostHunterCameraXPixelTurboCosmos9814.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterCameraXPixelTurboCosmos9814 != 4);
        int FrostHunterLooperHyperionForce4133 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(this.FrostHunterCameraXPixelTurboCosmos9814);
        if (FrostHunterLooperHyperionForce4133 == 0) {
            return true;
        }
        if (FrostHunterLooperHyperionForce4133 != 2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
            int i = this.FrostHunterAlertDialogAuroraDelta3200;
            Object obj = null;
            Object obj2 = this.FrostHunterFragmentBetaMegaVortex6025;
            Iterator it = this.FrostHunterKeyframeGammaGamma1197;
            switch (i) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((FrostHunterLintPhantomTurbo6249) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((FrostHunterAnalyticsThunderForceLegend3216) obj2).FrostHunterFlowMaxDragonHero5809.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
                    break;
            }
            this.FrostHunterFlowMaxDragonHero5809 = obj;
            if (this.FrostHunterCameraXPixelTurboCosmos9814 != 3) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterLooperThreadTurboSolar7605(Iterator it, FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249) {
        this();
        this.FrostHunterAlertDialogAuroraDelta3200 = 0;
        this.FrostHunterKeyframeGammaGamma1197 = it;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterLintPhantomTurbo6249;
    }

    public FrostHunterLooperThreadTurboSolar7605() {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
    }
}
