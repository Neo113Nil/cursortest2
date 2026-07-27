package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.Context.FrostHunterAdapterMegaSpectraThunder2458;
import android.content.Context.FrostHunterExecutorSolarPhoenix3849;
import android.content.Context.FrostHunterKeyEventNovaXAlpha1220;
import android.content.Context.FrostHunterKotlinQuantumRogue5892;
import android.content.Context.FrostHunterOnPreDrawListenerFusionGammaOmega7733;
import android.content.Context.FrostHunterRemoteModelManagerCyberLegend2797;
import android.content.Context.FrostHunterTransitionGammaTitanSpeed7178;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class Status extends FrostHunterAdapterMegaSpectraThunder2458 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(20);
    public final PendingIntent FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterFlowMaxDragonHero5809;
    public final ConnectionResult FrostHunterKeyframeGammaGamma1197;

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = str;
        this.FrostHunterAlertDialogAuroraDelta3200 = pendingIntent;
        this.FrostHunterKeyframeGammaGamma1197 = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.FrostHunterCameraXPixelTurboCosmos9814 == status.FrostHunterCameraXPixelTurboCosmos9814 && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterFlowMaxDragonHero5809, status.FrostHunterFlowMaxDragonHero5809) && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterAlertDialogAuroraDelta3200, status.FrostHunterAlertDialogAuroraDelta3200) && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterKeyframeGammaGamma1197, status.FrostHunterKeyframeGammaGamma1197);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.FrostHunterCameraXPixelTurboCosmos9814), this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197});
    }

    public final String toString() {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(12, this);
        String str = this.FrostHunterFlowMaxDragonHero5809;
        if (str == null) {
            int i = this.FrostHunterCameraXPixelTurboCosmos9814;
            switch (i) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(str, "statusCode");
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterAlertDialogAuroraDelta3200, "resolution");
        return frostHunterKotlinQuantumRogue5892.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 2, this.FrostHunterFlowMaxDragonHero5809);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 3, this.FrostHunterAlertDialogAuroraDelta3200, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 4, this.FrostHunterKeyframeGammaGamma1197, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }
}
