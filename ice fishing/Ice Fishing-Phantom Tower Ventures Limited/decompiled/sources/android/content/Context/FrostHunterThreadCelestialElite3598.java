package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterThreadCelestialElite3598 implements Iterator {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 1;
    public final Iterator FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterThreadCelestialElite3598(FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterRemoteConfigSpectraGammaPhantom2481;
        Collection collection = frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterAlertDialogAuroraDelta3200 = collection;
        this.FrostHunterFlowMaxDragonHero5809 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = (FrostHunterRemoteConfigSpectraGammaPhantom2481) this.FrostHunterKeyframeGammaGamma1197;
        frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterBundlePulseFusionHero2475();
        if (frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFlowMaxDragonHero5809 == ((Collection) this.FrostHunterAlertDialogAuroraDelta3200)) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
            default:
                FrostHunterAlphaAnimationNeoCosmos5761();
                break;
        }
        return this.FrostHunterFlowMaxDragonHero5809.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Iterator it = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = (Map.Entry) it.next();
                this.FrostHunterAlertDialogAuroraDelta3200 = (Collection) entry.getValue();
                return ((FrostHunterFocusMeteringActionDragonMax2884) this.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.FrostHunterAlertDialogAuroraDelta3200 = entry2;
                return entry2.getKey();
            default:
                FrostHunterAlphaAnimationNeoCosmos5761();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        Iterator it = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("no calls to next() since the last call to remove()", ((Collection) this.FrostHunterAlertDialogAuroraDelta3200) != null);
                it.remove();
                ((FrostHunterFocusMeteringActionDragonMax2884) obj).FrostHunterKeyframeGammaGamma1197.FrostHunterFragmentBetaMegaVortex6025 -= ((Collection) this.FrostHunterAlertDialogAuroraDelta3200).size();
                ((Collection) this.FrostHunterAlertDialogAuroraDelta3200).clear();
                this.FrostHunterAlertDialogAuroraDelta3200 = null;
                break;
            case 1:
                FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("no calls to next() since the last call to remove()", ((Map.Entry) this.FrostHunterAlertDialogAuroraDelta3200) != null);
                Collection collection = (Collection) ((Map.Entry) this.FrostHunterAlertDialogAuroraDelta3200).getValue();
                it.remove();
                ((FrostHunterFaceDetectionOlympianForceTurbo7659) obj).FrostHunterFlowMaxDragonHero5809.FrostHunterFragmentBetaMegaVortex6025 -= collection.size();
                collection.clear();
                this.FrostHunterAlertDialogAuroraDelta3200 = null;
                break;
            default:
                it.remove();
                FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = (FrostHunterRemoteConfigSpectraGammaPhantom2481) obj;
                frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025--;
                frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterServiceEliteCelestialThunder1757();
                break;
        }
    }

    public FrostHunterThreadCelestialElite3598(FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481, ListIterator listIterator) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterRemoteConfigSpectraGammaPhantom2481;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = listIterator;
    }

    public FrostHunterThreadCelestialElite3598(FrostHunterFaceDetectionOlympianForceTurbo7659 frostHunterFaceDetectionOlympianForceTurbo7659, Iterator it) {
        this.FrostHunterFlowMaxDragonHero5809 = it;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFaceDetectionOlympianForceTurbo7659;
    }

    public FrostHunterThreadCelestialElite3598(FrostHunterFocusMeteringActionDragonMax2884 frostHunterFocusMeteringActionDragonMax2884) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFocusMeteringActionDragonMax2884;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFocusMeteringActionDragonMax2884.FrostHunterAlertDialogAuroraDelta3200.entrySet().iterator();
    }
}
