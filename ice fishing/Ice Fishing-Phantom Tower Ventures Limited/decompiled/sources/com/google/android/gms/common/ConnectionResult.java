package com.google.android.gms.common;

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
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class ConnectionResult extends FrostHunterAdapterMegaSpectraThunder2458 {
    public static final int SUCCESS = 0;
    public final PendingIntent FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;
    public final String FrostHunterKeyframeGammaGamma1197;
    public static final ConnectionResult FrostHunterFragmentBetaMegaVortex6025 = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(19);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = pendingIntent;
        this.FrostHunterKeyframeGammaGamma1197 = str;
    }

    public static String FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.FrostHunterFlowMaxDragonHero5809 == connectionResult.FrostHunterFlowMaxDragonHero5809 && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterAlertDialogAuroraDelta3200, connectionResult.FrostHunterAlertDialogAuroraDelta3200) && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterKeyframeGammaGamma1197, connectionResult.FrostHunterKeyframeGammaGamma1197);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.FrostHunterFlowMaxDragonHero5809), this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197});
    }

    public final String toString() {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(12, this);
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFlowMaxDragonHero5809), "statusCode");
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterAlertDialogAuroraDelta3200, "resolution");
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterKeyframeGammaGamma1197, "message");
        return frostHunterKotlinQuantumRogue5892.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 2, 4);
        parcel.writeInt(this.FrostHunterFlowMaxDragonHero5809);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 3, this.FrostHunterAlertDialogAuroraDelta3200, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 4, this.FrostHunterKeyframeGammaGamma1197);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }

    public ConnectionResult(int i) {
        this(1, i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
