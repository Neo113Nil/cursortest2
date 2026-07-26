package android.content.Context;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewPager2SpectraForceVortex4544 extends FrostHunterTimerCosmosCyberLegend3595 implements Map {
    public FrostHunterBannerAdQuantumHyperQuantum7610 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterLicensingNebulaOlympianPulse9341 FrostHunterKeyframeGammaGamma1197;
    public FrostHunterAccelerometerFusionHyperionPhantom3600 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public final boolean FrostHunterAlertDialogAuroraDelta3200(Collection collection) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final boolean FrostHunterFlowMaxDragonHero5809(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        FrostHunterLicensingNebulaOlympianPulse9341 frostHunterLicensingNebulaOlympianPulse9341 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterLicensingNebulaOlympianPulse9341 != null) {
            return frostHunterLicensingNebulaOlympianPulse9341;
        }
        FrostHunterLicensingNebulaOlympianPulse9341 frostHunterLicensingNebulaOlympianPulse93412 = new FrostHunterLicensingNebulaOlympianPulse9341(this, 0);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLicensingNebulaOlympianPulse93412;
        return frostHunterLicensingNebulaOlympianPulse93412;
    }

    @Override // java.util.Map
    public final Set keySet() {
        FrostHunterBannerAdQuantumHyperQuantum7610 frostHunterBannerAdQuantumHyperQuantum7610 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterBannerAdQuantumHyperQuantum7610 != null) {
            return frostHunterBannerAdQuantumHyperQuantum7610;
        }
        FrostHunterBannerAdQuantumHyperQuantum7610 frostHunterBannerAdQuantumHyperQuantum76102 = new FrostHunterBannerAdQuantumHyperQuantum7610(this);
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterBannerAdQuantumHyperQuantum76102;
        return frostHunterBannerAdQuantumHyperQuantum76102;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.FrostHunterAlertDialogAuroraDelta3200;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (iArr.length < size) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(iArr, size);
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, size * 2);
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200 != i) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        FrostHunterAccelerometerFusionHyperionPhantom3600 frostHunterAccelerometerFusionHyperionPhantom3600 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterAccelerometerFusionHyperionPhantom3600 != null) {
            return frostHunterAccelerometerFusionHyperionPhantom3600;
        }
        FrostHunterAccelerometerFusionHyperionPhantom3600 frostHunterAccelerometerFusionHyperionPhantom36002 = new FrostHunterAccelerometerFusionHyperionPhantom3600(this);
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterAccelerometerFusionHyperionPhantom36002;
        return frostHunterAccelerometerFusionHyperionPhantom36002;
    }
}
