package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterRoomDaoHyperFusionCelestial1775 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public final Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterRoomDaoHyperFusionCelestial1775(FrostHunterExecutorPhantomGammaOmega9436 frostHunterExecutorPhantomGammaOmega9436) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterExecutorPhantomGammaOmega9436.FrostHunterAlphaAnimationNeoCosmos5761.iterator();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterExecutorPhantomGammaOmega9436.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.FrostHunterFlowMaxDragonHero5809 < ((FrostHunterAnimationSetHyperionAurora2108) obj).FrostHunterAlphaAnimationNeoCosmos5761();
            case 1:
                return this.FrostHunterFlowMaxDragonHero5809 < ((Object[]) obj).length;
            default:
                Iterator it = (Iterator) obj;
                while (this.FrostHunterFlowMaxDragonHero5809 > 0 && it.hasNext()) {
                    it.next();
                    this.FrostHunterFlowMaxDragonHero5809--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    return null;
                }
                int i2 = this.FrostHunterFlowMaxDragonHero5809;
                this.FrostHunterFlowMaxDragonHero5809 = i2 + 1;
                return ((FrostHunterAnimationSetHyperionAurora2108) obj).get(i2);
            case 1:
                try {
                    int i3 = this.FrostHunterFlowMaxDragonHero5809;
                    this.FrostHunterFlowMaxDragonHero5809 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.FrostHunterFlowMaxDragonHero5809--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                Iterator it = (Iterator) obj;
                while (this.FrostHunterFlowMaxDragonHero5809 > 0 && it.hasNext()) {
                    it.next();
                    this.FrostHunterFlowMaxDragonHero5809--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FrostHunterRoomDaoHyperFusionCelestial1775(FrostHunterAnimationSetHyperionAurora2108 frostHunterAnimationSetHyperionAurora2108) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterAnimationSetHyperionAurora2108;
    }

    public FrostHunterRoomDaoHyperFusionCelestial1775(Object[] objArr) {
        objArr.getClass();
        this.FrostHunterAlertDialogAuroraDelta3200 = objArr;
    }
}
