package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import kotlin.text.CatchingFishLayoutRoom;
import kotlin.text.CatchingFishMoshiSpannable;
import kotlin.text.CatchingFishSnackbarPayPal;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewStateFlow;

/* loaded from: classes.dex */
public final class ConnectionResult extends CatchingFishViewStateFlow {
    public static final int SUCCESS = 0;
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final Integer CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final PendingIntent CatchingFishWorkManager;
    public static final ConnectionResult CatchingFishLayout = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new CatchingFishSnackbarPayPal(29);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = pendingIntent;
        this.CatchingFishViewModelScope = str;
        this.CatchingFishViewModelFAB = num;
    }

    public static String CatchingFishParcelableFAB(int i) {
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
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
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
        return this.CatchingFishDaggerWebsocket == connectionResult.CatchingFishDaggerWebsocket && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishWorkManager, connectionResult.CatchingFishWorkManager) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishViewModelScope, connectionResult.CatchingFishViewModelScope) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishViewModelFAB, connectionResult.CatchingFishViewModelFAB);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.CatchingFishDaggerWebsocket), this.CatchingFishWorkManager, this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB});
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        catchingFishViewModelIntent.CatchingFishSnackbar(CatchingFishParcelableFAB(this.CatchingFishDaggerWebsocket), "statusCode");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishWorkManager, "resolution");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishViewModelScope, "message");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishViewModelFAB, "clientMethodKey");
        return catchingFishViewModelIntent.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 3, this.CatchingFishWorkManager, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 4, this.CatchingFishViewModelScope);
        Integer num = this.CatchingFishViewModelFAB;
        if (num != null) {
            CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
