package m0;

import a.AbstractC0083a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C0376e9;
import java.util.Arrays;
import p0.AbstractC1021r;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class b extends AbstractC1035a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8163b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f8164c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8165d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f8161e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new C.l(10);

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f8162a = i2;
        this.f8163b = i3;
        this.f8164c = pendingIntent;
        this.f8165d = str;
    }

    public static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
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
                switch (i2) {
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
                    case C0376e9.f5882C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0376e9.f5883D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C0376e9.f5884E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return C1.a.g(i2, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8163b == bVar.f8163b && AbstractC1021r.e(this.f8164c, bVar.f8164c) && AbstractC1021r.e(this.f8165d, bVar.f8165d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8163b), this.f8164c, this.f8165d});
    }

    public final String toString() {
        o.b bVar = new o.b(this);
        bVar.a(a(this.f8163b), "statusCode");
        bVar.a(this.f8164c, "resolution");
        bVar.a(this.f8165d, "message");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8162a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8163b);
        AbstractC0083a.u(parcel, 3, this.f8164c, i2);
        AbstractC0083a.v(parcel, 4, this.f8165d);
        AbstractC0083a.z(parcel, y2);
    }

    public b(int i2) {
        this(1, i2, null, null);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
