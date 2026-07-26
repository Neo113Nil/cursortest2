package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLiveDataScopeDeltaMasterUltra5032 implements ListIterator, FrostHunterContextBlazePrimeMax4967 {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterLiveDataScopeDeltaMasterUltra5032(FrostHunterFocusMeteringActionNebulaSpectra6776 frostHunterFocusMeteringActionNebulaSpectra6776, int i) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFocusMeteringActionNebulaSpectra6776;
        List list = (List) frostHunterFocusMeteringActionNebulaSpectra6776.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0 && i <= frostHunterFocusMeteringActionNebulaSpectra6776.FrostHunterAlphaAnimationNeoCosmos5761()) {
            this.FrostHunterFlowMaxDragonHero5809 = list.listIterator(frostHunterFocusMeteringActionNebulaSpectra6776.FrostHunterAlphaAnimationNeoCosmos5761() - i);
            return;
        }
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Position index ", i, " must be in range [");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(new FrostHunterFirebaseModelInterpreterOlympianStorm9227(0, frostHunterFocusMeteringActionNebulaSpectra6776.FrostHunterAlphaAnimationNeoCosmos5761(), 1));
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append("].");
        throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((FrostHunterProfilerStrikeShadowCyber8504) obj).FrostHunterCameraXPixelTurboCosmos9814 < ((FrostHunterLicensingMegaSpectraAlpha6929) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasNext();
            default:
                return ((FrostHunterProfilerStrikeShadowCyber8504) obj).FrostHunterCameraXPixelTurboCosmos9814 >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).previous();
            default:
                FrostHunterProfilerStrikeShadowCyber8504 frostHunterProfilerStrikeShadowCyber8504 = (FrostHunterProfilerStrikeShadowCyber8504) obj;
                int i2 = frostHunterProfilerStrikeShadowCyber8504.FrostHunterCameraXPixelTurboCosmos9814 + 1;
                FrostHunterLicensingMegaSpectraAlpha6929 frostHunterLicensingMegaSpectraAlpha6929 = (FrostHunterLicensingMegaSpectraAlpha6929) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLevelListDrawableFusionDragonHero2232(i2, frostHunterLicensingMegaSpectraAlpha6929.FrostHunterKeyframeGammaGamma1197);
                frostHunterProfilerStrikeShadowCyber8504.FrostHunterCameraXPixelTurboCosmos9814 = i2;
                return frostHunterLicensingMegaSpectraAlpha6929.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterFocusMeteringActionNebulaSpectra6776 frostHunterFocusMeteringActionNebulaSpectra6776 = (FrostHunterFocusMeteringActionNebulaSpectra6776) this.FrostHunterAlertDialogAuroraDelta3200;
                return (frostHunterFocusMeteringActionNebulaSpectra6776.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((FrostHunterProfilerStrikeShadowCyber8504) obj).FrostHunterCameraXPixelTurboCosmos9814 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).next();
            default:
                FrostHunterProfilerStrikeShadowCyber8504 frostHunterProfilerStrikeShadowCyber8504 = (FrostHunterProfilerStrikeShadowCyber8504) obj;
                int i2 = frostHunterProfilerStrikeShadowCyber8504.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterLicensingMegaSpectraAlpha6929 frostHunterLicensingMegaSpectraAlpha6929 = (FrostHunterLicensingMegaSpectraAlpha6929) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLevelListDrawableFusionDragonHero2232(i2, frostHunterLicensingMegaSpectraAlpha6929.FrostHunterKeyframeGammaGamma1197);
                frostHunterProfilerStrikeShadowCyber8504.FrostHunterCameraXPixelTurboCosmos9814 = i2 - 1;
                return frostHunterLicensingMegaSpectraAlpha6929.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterFocusMeteringActionNebulaSpectra6776 frostHunterFocusMeteringActionNebulaSpectra6776 = (FrostHunterFocusMeteringActionNebulaSpectra6776) this.FrostHunterAlertDialogAuroraDelta3200;
                return (frostHunterFocusMeteringActionNebulaSpectra6776.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((FrostHunterProfilerStrikeShadowCyber8504) obj).FrostHunterCameraXPixelTurboCosmos9814;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public FrostHunterLiveDataScopeDeltaMasterUltra5032(FrostHunterProfilerStrikeShadowCyber8504 frostHunterProfilerStrikeShadowCyber8504, FrostHunterLicensingMegaSpectraAlpha6929 frostHunterLicensingMegaSpectraAlpha6929) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterProfilerStrikeShadowCyber8504;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLicensingMegaSpectraAlpha6929;
    }
}
