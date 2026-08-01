package com.google.android.gms.common;

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
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class ConnectionResult extends WinterFlowAdapterAPI {
    public static final int SUCCESS = 0;
    public final String WinterFlowRouterRouter;
    public final Integer WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public final PendingIntent WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;
    public static final ConnectionResult WinterFlowResponseEngine = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new WinterFlowStackFramework(17);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = pendingIntent;
        this.WinterFlowRouterRouter = str;
        this.WinterFlowSyntax = num;
    }

    public static String WinterFlowRouterStructure(int i) {
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
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
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
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
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
        return this.WinterFlowTransactionManagerStrategy == connectionResult.WinterFlowTransactionManagerStrategy && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowUnitTestResponse, connectionResult.WinterFlowUnitTestResponse) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowRouterRouter, connectionResult.WinterFlowRouterRouter) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowSyntax, connectionResult.WinterFlowSyntax);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.WinterFlowTransactionManagerStrategy), this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax});
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this);
        winterFlowAlgorithmArray.WinterFlowSyntax(WinterFlowRouterStructure(this.WinterFlowTransactionManagerStrategy), "statusCode");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowUnitTestResponse, "resolution");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowRouterRouter, "message");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowSyntax, "clientMethodKey");
        return winterFlowAlgorithmArray.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 3, this.WinterFlowUnitTestResponse, i);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 4, this.WinterFlowRouterRouter);
        Integer num = this.WinterFlowSyntax;
        if (num != null) {
            WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
