package M2;

import P2.w;
import S0.s;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends Q2.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f1829n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1830u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f1831v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1832w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f1833x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f1828y = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new B8.d(5);

    public b(int i, int i6, PendingIntent pendingIntent, String str, Integer num) {
        this.f1829n = i;
        this.f1830u = i6;
        this.f1831v = pendingIntent;
        this.f1832w = str;
        this.f1833x = num;
    }

    public static String c(int i) {
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
                        return u1.h.d(i, "UNKNOWN_ERROR_CODE(", ")", new StringBuilder(String.valueOf(i).length() + 20));
                }
        }
    }

    public final boolean a() {
        return (this.f1830u == 0 || this.f1831v == null) ? false : true;
    }

    public final boolean b() {
        return this.f1830u == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1830u == bVar.f1830u && w.l(this.f1831v, bVar.f1831v) && w.l(this.f1832w, bVar.f1832w) && w.l(this.f1833x, bVar.f1833x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1830u), this.f1831v, this.f1832w, this.f1833x});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(c(this.f1830u), "statusCode");
        sVar.f(this.f1831v, "resolution");
        sVar.f(this.f1832w, "message");
        sVar.f(this.f1833x, "clientMethodKey");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f1829n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f1830u);
        A8.b.y(parcel, 3, this.f1831v, i);
        A8.b.z(parcel, 4, this.f1832w);
        Integer num = this.f1833x;
        if (num != null) {
            A8.b.F(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        A8.b.I(parcel, G7);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
