package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756;
import androidx.versionedparcelable.CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536;
import androidx.versionedparcelable.EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827;
import androidx.versionedparcelable.MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class Status extends CrimsonRouteFloatingPointManagerI0QcSwBYJw5fsxQV1B69758578851536 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(19);
    public final String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final ConnectionResult TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final PendingIntent YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = str;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = pendingIntent;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == status.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, status.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, status.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, status.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867), this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333});
    }

    public final String toString() {
        YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(22, this);
        String str = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (str == null) {
            int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
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
                    str = MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
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
        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(str, "statusCode");
        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, "resolution");
        return yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987 = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(parcel, 20293);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(parcel, 1, 4);
        parcel.writeInt(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(parcel, 2, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(parcel, 3, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, i);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(parcel, 4, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, i);
        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402(parcel, JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987);
    }
}
