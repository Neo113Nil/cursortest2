package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterLicensingNebulaOlympianPulse9341 extends AbstractSet {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Map FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterLicensingNebulaOlympianPulse9341(Map map, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) this.FrostHunterFlowMaxDragonHero5809).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                ((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) this.FrostHunterFlowMaxDragonHero5809).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) this.FrostHunterFlowMaxDragonHero5809).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Map map = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterLicensingPixelBlazeSpectra7095((FrostHunterViewPager2SpectraForceVortex4544) map);
            default:
                return new FrostHunterContentObserverPrimeBlazeSpectra7811((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) this.FrostHunterFlowMaxDragonHero5809).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Map map = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((FrostHunterViewPager2SpectraForceVortex4544) map).FrostHunterAlertDialogAuroraDelta3200;
            default:
                return ((FrostHunterLifecycleCameraControllerGammaFusionShadow8317) map).size();
        }
    }
}
