package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h66 extends l9 {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public static final h66 e = new h66(0);

    @NonNull
    public static final Parcelable.Creator<h66> CREATOR = new k2x(11);

    public h66(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public static String f(int i) {
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
                    default:
                        return dfi.c(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean d() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h66)) {
            return false;
        }
        h66 h66Var = (h66) obj;
        return this.b == h66Var.b && ldg.s(this.c, h66Var.c) && ldg.s(this.d, h66Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        md7Var.a(f(this.b), "statusCode");
        md7Var.a(this.c, "resolution");
        md7Var.a(this.d, Constants.KEY_MESSAGE);
        return md7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.i0(parcel, 3, this.c, i);
        o8g.j0(parcel, 4, this.d);
        o8g.p0(parcel, o0);
    }

    public h66(int i) {
        this(1, i, null, null);
    }

    public h66(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
