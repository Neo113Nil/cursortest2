package m6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import p6.u;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f4902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4903h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f4904i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4905j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f4901k = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new e7.c(7);

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f4902g = i10;
        this.f4903h = i11;
        this.f4904i = pendingIntent;
        this.f4905j = str;
    }

    public static String c(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "SERVICE_MISSING";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
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
                        return a4.d.h("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean a() {
        return (this.f4903h == 0 || this.f4904i == null) ? false : true;
    }

    public final boolean b() {
        return this.f4903h == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4903h == bVar.f4903h && u.j(this.f4904i, bVar.f4904i) && u.j(this.f4905j, bVar.f4905j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4903h), this.f4904i, this.f4905j});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.b(c(this.f4903h), "statusCode");
        sVar.b(this.f4904i, "resolution");
        sVar.b(this.f4905j, "message");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f4902g);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f4903h);
        x4.f.b0(parcel, 3, this.f4904i, i10);
        x4.f.c0(parcel, 4, this.f4905j);
        x4.f.h0(parcel, g02);
    }

    public b(int i10) {
        this(1, i10, null, null);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
