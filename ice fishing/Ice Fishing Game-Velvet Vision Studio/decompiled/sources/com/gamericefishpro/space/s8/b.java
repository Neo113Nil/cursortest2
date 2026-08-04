package com.gamericefishpro.space.s8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.w8.a {
    public final int d;
    public final int e;
    public final PendingIntent i;
    public final String v;
    public final Integer w;
    public static final b y = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new com.gamericefishpro.space.h.a(22);

    public b(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.d = i;
        this.e = i2;
        this.i = pendingIntent;
        this.v = str;
        this.w = num;
    }

    public static String d(int i) {
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
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case RequestError.STOP_TRACKING /* 11 */:
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

    public final boolean b() {
        return (this.e == 0 || this.i == null) ? false : true;
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.e == bVar.e && c0.j(this.i, bVar.i) && c0.j(this.v, bVar.v) && c0.j(this.w, bVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.i, this.v, this.w});
    }

    public final String toString() {
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(this);
        sVar.c(d(this.e), "statusCode");
        sVar.c(this.i, "resolution");
        sVar.c(this.v, "message");
        sVar.c(this.w, "clientMethodKey");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e);
        y3.P(parcel, 3, this.i, i);
        y3.Q(parcel, 4, this.v);
        Integer num = this.w;
        if (num != null) {
            y3.U(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        y3.W(parcel, iV);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
