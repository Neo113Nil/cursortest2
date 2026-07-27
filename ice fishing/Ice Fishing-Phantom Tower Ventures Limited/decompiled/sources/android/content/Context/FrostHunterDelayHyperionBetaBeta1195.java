package android.content.Context;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDelayHyperionBetaBeta1195 extends FrostHunterAdapterMegaSpectraThunder2458 {
    public static final Parcelable.Creator<FrostHunterDelayHyperionBetaBeta1195> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(15);
    public final ConnectionResult FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final IBinder FrostHunterFlowMaxDragonHero5809;
    public final boolean FrostHunterFragmentBetaMegaVortex6025;
    public final boolean FrostHunterKeyframeGammaGamma1197;

    public FrostHunterDelayHyperionBetaBeta1195(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = iBinder;
        this.FrostHunterAlertDialogAuroraDelta3200 = connectionResult;
        this.FrostHunterKeyframeGammaGamma1197 = z;
        this.FrostHunterFragmentBetaMegaVortex6025 = z2;
    }

    public final boolean equals(Object obj) {
        Object frostHunterPreviewInfernoFusion6094;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterDelayHyperionBetaBeta1195)) {
            return false;
        }
        FrostHunterDelayHyperionBetaBeta1195 frostHunterDelayHyperionBetaBeta1195 = (FrostHunterDelayHyperionBetaBeta1195) obj;
        if (!this.FrostHunterAlertDialogAuroraDelta3200.equals(frostHunterDelayHyperionBetaBeta1195.FrostHunterAlertDialogAuroraDelta3200)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.FrostHunterFlowMaxDragonHero5809;
        if (iBinder == null) {
            frostHunterPreviewInfernoFusion6094 = null;
        } else {
            int i = FrostHunterGradlePluginQuantumNebulaThunder2592.FrostHunterServiceEliteCelestialThunder1757;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            frostHunterPreviewInfernoFusion6094 = queryLocalInterface instanceof FrostHunterFlowBlazeVision5301 ? (FrostHunterFlowBlazeVision5301) queryLocalInterface : new FrostHunterPreviewInfernoFusion6094(iBinder);
        }
        IBinder iBinder2 = frostHunterDelayHyperionBetaBeta1195.FrostHunterFlowMaxDragonHero5809;
        if (iBinder2 != null) {
            int i2 = FrostHunterGradlePluginQuantumNebulaThunder2592.FrostHunterServiceEliteCelestialThunder1757;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof FrostHunterFlowBlazeVision5301 ? (FrostHunterFlowBlazeVision5301) queryLocalInterface2 : new FrostHunterPreviewInfernoFusion6094(iBinder2);
        }
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(frostHunterPreviewInfernoFusion6094, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        IBinder iBinder = this.FrostHunterFlowMaxDragonHero5809;
        if (iBinder != null) {
            int FrostHunterInAppPurchaseLegendEpicDragon45792 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon45792);
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 3, this.FrostHunterAlertDialogAuroraDelta3200, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 4, 4);
        parcel.writeInt(this.FrostHunterKeyframeGammaGamma1197 ? 1 : 0);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 5, 4);
        parcel.writeInt(this.FrostHunterFragmentBetaMegaVortex6025 ? 1 : 0);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }
}
