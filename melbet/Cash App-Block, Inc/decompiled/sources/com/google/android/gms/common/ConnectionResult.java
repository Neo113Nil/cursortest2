package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public final int zza;
    public final int zzb;
    public final PendingIntent zzc;
    public final String zzd;
    public final Integer zze;
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza(0);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = str;
        this.zze = num;
    }

    public static String zza(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
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
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return re$$ExternalSyntheticOutline0.m(i, "UNKNOWN_ERROR_CODE(", ")", new StringBuilder(String.valueOf(i).length() + 20));
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
        return this.zzb == connectionResult.zzb && com.google.android.gms.common.internal.zzae.equal(this.zzc, connectionResult.zzc) && com.google.android.gms.common.internal.zzae.equal(this.zzd, connectionResult.zzd) && com.google.android.gms.common.internal.zzae.equal(this.zze, connectionResult.zze);
    }

    public final boolean hasResolution() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze});
    }

    public final boolean isSuccess() {
        return this.zzb == 0;
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(zza(this.zzb), "statusCode");
        workLauncherImpl.add(this.zzc, "resolution");
        workLauncherImpl.add(this.zzd, "message");
        workLauncherImpl.add(this.zze, "clientMethodKey");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeInt(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeInt(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeIntegerObject(parcel, 5, this.zze);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
