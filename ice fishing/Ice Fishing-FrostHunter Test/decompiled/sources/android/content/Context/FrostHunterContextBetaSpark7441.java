package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContextBetaSpark7441 extends FrostHunterAdapterMegaSpectraThunder2458 {
    public static final Parcelable.Creator<FrostHunterContextBetaSpark7441> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(22);
    public final long FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterContextBetaSpark7441() {
        this.FrostHunterCameraXPixelTurboCosmos9814 = "CLIENT_TELEMETRY";
        this.FrostHunterAlertDialogAuroraDelta3200 = 1L;
        this.FrostHunterFlowMaxDragonHero5809 = -1;
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        long j = this.FrostHunterAlertDialogAuroraDelta3200;
        return j == -1 ? this.FrostHunterFlowMaxDragonHero5809 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterContextBetaSpark7441) {
            FrostHunterContextBetaSpark7441 frostHunterContextBetaSpark7441 = (FrostHunterContextBetaSpark7441) obj;
            String str = frostHunterContextBetaSpark7441.FrostHunterCameraXPixelTurboCosmos9814;
            String str2 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && FrostHunterAlphaAnimationNeoCosmos5761() == frostHunterContextBetaSpark7441.FrostHunterAlphaAnimationNeoCosmos5761()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.FrostHunterCameraXPixelTurboCosmos9814, Long.valueOf(FrostHunterAlphaAnimationNeoCosmos5761())});
    }

    public final String toString() {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(12, this);
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, "name");
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(Long.valueOf(FrostHunterAlphaAnimationNeoCosmos5761()), "version");
        return frostHunterKotlinQuantumRogue5892.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 1, this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 2, 4);
        parcel.writeInt(this.FrostHunterFlowMaxDragonHero5809);
        long FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 3, 8);
        parcel.writeLong(FrostHunterAlphaAnimationNeoCosmos5761);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }

    public FrostHunterContextBetaSpark7441(int i, long j, String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = str;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
    }
}
