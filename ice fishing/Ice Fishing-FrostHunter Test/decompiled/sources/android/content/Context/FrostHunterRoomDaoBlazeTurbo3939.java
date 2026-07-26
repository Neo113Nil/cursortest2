package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomDaoBlazeTurbo3939 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final FrostHunterActivityMasterSolarElite3307 FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterRoomDaoBlazeTurbo3939(FrostHunterActivityMasterSolarElite3307 frostHunterActivityMasterSolarElite3307, int i, int i2) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterActivityMasterSolarElite3307;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
        this.FrostHunterKeyframeGammaGamma1197 = i;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterActivityMasterSolarElite3307.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterActivityMasterSolarElite3307.FrostHunterLightSensorForceFusion4241) {
            FrostHunterChipGroupSpeedNeo5611.FrostHunterLifecycleBlazeGammaElite2889();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.FrostHunterKeyframeGammaGamma1197 < this.FrostHunterAlertDialogAuroraDelta3200;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterActivityMasterSolarElite3307 frostHunterActivityMasterSolarElite3307 = this.FrostHunterFlowMaxDragonHero5809;
                int i = frostHunterActivityMasterSolarElite3307.FrostHunterScaleAnimationStrikeSpark5059;
                int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
                if (i != i2) {
                    FrostHunterChipGroupSpeedNeo5611.FrostHunterLifecycleBlazeGammaElite2889();
                }
                int i3 = this.FrostHunterKeyframeGammaGamma1197;
                this.FrostHunterKeyframeGammaGamma1197 = frostHunterActivityMasterSolarElite3307.FrostHunterCameraXPixelTurboCosmos9814[(i3 * 5) + 3] + i3;
                return new FrostHunterStateListAnimatorOlympianPhantomNovaX5909(frostHunterActivityMasterSolarElite3307, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FrostHunterRoomDaoBlazeTurbo3939(FrostHunterActivityMasterSolarElite3307 frostHunterActivityMasterSolarElite3307, int i, FrostHunterMagnetometerMasterBlaze9480 frostHunterMagnetometerMasterBlaze9480, FrostHunterLooperThreadStormCyberElite6638 frostHunterLooperThreadStormCyberElite6638) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterActivityMasterSolarElite3307;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterActivityMasterSolarElite3307.FrostHunterScaleAnimationStrikeSpark5059;
    }
}
