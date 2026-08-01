package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.WinterFlowAdapterAPI;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowHandlerWebsocket;
import com.google.android.datatransport.WinterFlowJSONLibrary;
import com.google.android.datatransport.WinterFlowStackFramework;
import com.google.android.datatransport.WinterFlowWorkerVersionControl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class Status extends WinterFlowAdapterAPI implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new WinterFlowStackFramework(24);
    public final ConnectionResult WinterFlowRouterRouter;
    public final String WinterFlowTransactionManagerStrategy;
    public final PendingIntent WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = pendingIntent;
        this.WinterFlowRouterRouter = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.WinterFlowVariableVersionControl == status.WinterFlowVariableVersionControl && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowTransactionManagerStrategy, status.WinterFlowTransactionManagerStrategy) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowUnitTestResponse, status.WinterFlowUnitTestResponse) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowRouterRouter, status.WinterFlowRouterRouter);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.WinterFlowVariableVersionControl), this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter});
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this);
        String str = this.WinterFlowTransactionManagerStrategy;
        if (str == null) {
            int i = this.WinterFlowVariableVersionControl;
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
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    str = sb.toString();
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
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
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
        winterFlowAlgorithmArray.WinterFlowSyntax(str, "statusCode");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowUnitTestResponse, "resolution");
        return winterFlowAlgorithmArray.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 3, this.WinterFlowUnitTestResponse, i);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 4, this.WinterFlowRouterRouter, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
