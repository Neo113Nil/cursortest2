package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import kotlin.text.CatchingFishLayoutRoom;
import kotlin.text.CatchingFishMoshiSpannable;
import kotlin.text.CatchingFishRoomKtorToast;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewStateFlow;

/* loaded from: classes.dex */
public final class Status extends CatchingFishViewStateFlow implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new CatchingFishRoomKtorToast(5);
    public final String CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final ConnectionResult CatchingFishViewModelScope;
    public final PendingIntent CatchingFishWorkManager;

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishWorkManager = pendingIntent;
        this.CatchingFishViewModelScope = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.CatchingFishReduxKtor == status.CatchingFishReduxKtor && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, status.CatchingFishDaggerWebsocket) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishWorkManager, status.CatchingFishWorkManager) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishViewModelScope, status.CatchingFishViewModelScope);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.CatchingFishReduxKtor), this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope});
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        String str = this.CatchingFishDaggerWebsocket;
        if (str == null) {
            int i = this.CatchingFishReduxKtor;
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
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
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
        catchingFishViewModelIntent.CatchingFishSnackbar(str, "statusCode");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishWorkManager, "resolution");
        return catchingFishViewModelIntent.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 2, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 3, this.CatchingFishWorkManager, i);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 4, this.CatchingFishViewModelScope, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
