package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSurfaceViewNeoFusionRogue9589 extends FrostHunterAdapterMegaSpectraThunder2458 {
    public static final Parcelable.Creator<FrostHunterSurfaceViewNeoFusionRogue9589> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(11);
    public final List FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterFlowMaxDragonHero5809;

    public FrostHunterSurfaceViewNeoFusionRogue9589(String str, ArrayList arrayList) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = arrayList;
        this.FrostHunterFlowMaxDragonHero5809 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        List<String> list = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (list != null) {
            int FrostHunterInAppPurchaseLegendEpicDragon45792 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 1);
            parcel.writeStringList(list);
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon45792);
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 2, this.FrostHunterFlowMaxDragonHero5809);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }
}
