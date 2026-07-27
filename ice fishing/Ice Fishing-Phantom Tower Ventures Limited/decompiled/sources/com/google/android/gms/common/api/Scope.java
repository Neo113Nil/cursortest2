package com.google.android.gms.common.api;

import android.content.Context.FrostHunterAdapterMegaSpectraThunder2458;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterOnPreDrawListenerFusionGammaOmega7733;
import android.content.Context.FrostHunterTransitionGammaTitanSpeed7178;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class Scope extends FrostHunterAdapterMegaSpectraThunder2458 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(16);
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterFlowMaxDragonHero5809;

    public Scope(String str, int i) {
        FrostHunterCardViewHyperionAurora3829.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, "scopeUri must not be null or empty");
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.FrostHunterFlowMaxDragonHero5809.equals(((Scope) obj).FrostHunterFlowMaxDragonHero5809);
    }

    public final int hashCode() {
        return this.FrostHunterFlowMaxDragonHero5809.hashCode();
    }

    public final String toString() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 2, this.FrostHunterFlowMaxDragonHero5809);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }
}
