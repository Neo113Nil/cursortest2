package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756;
import androidx.versionedparcelable.CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536;
import androidx.versionedparcelable.EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ConnectionResult extends CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536 {
    public static final ConnectionResult BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(18);
    public static final int SUCCESS = 0;
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final String TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final PendingIntent YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = pendingIntent;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = str;
    }

    public static String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
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
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
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
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
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
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == connectionResult.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, connectionResult.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, connectionResult.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119), this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333});
    }

    public final String toString() {
        YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(22, this);
        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119), "statusCode");
        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, "resolution");
        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, "message");
        return yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987 = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(parcel, 20293);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(parcel, 1, 4);
        parcel.writeInt(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(parcel, 2, 4);
        parcel.writeInt(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(parcel, 3, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, i);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 4, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402(parcel, JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987);
    }

    public ConnectionResult(int i) {
        this(1, i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
