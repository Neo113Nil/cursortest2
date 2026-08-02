package O2;

import R2.w;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class b extends S2.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f2255n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2256u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f2257v;

    /* renamed from: w, reason: collision with root package name */
    public final String f2258w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f2259x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f2254y = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new B8.d(5);

    public b(int i, int i4, PendingIntent pendingIntent, String str, Integer num) {
        this.f2255n = i;
        this.f2256u = i4;
        this.f2257v = pendingIntent;
        this.f2258w = str;
        this.f2259x = num;
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
                        return AbstractC5128c.d(i, "UNKNOWN_ERROR_CODE(", ")", new StringBuilder(String.valueOf(i).length() + 20));
                }
        }
    }

    public final boolean a() {
        return (this.f2256u == 0 || this.f2257v == null) ? false : true;
    }

    public final boolean b() {
        return this.f2256u == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2256u == bVar.f2256u && w.l(this.f2257v, bVar.f2257v) && w.l(this.f2258w, bVar.f2258w) && w.l(this.f2259x, bVar.f2259x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2256u), this.f2257v, this.f2258w, this.f2259x});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(c(this.f2256u), "statusCode");
        c3067cm.B(this.f2257v, "resolution");
        c3067cm.B(this.f2258w, "message");
        c3067cm.B(this.f2259x, "clientMethodKey");
        return c3067cm.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2255n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f2256u);
        com.bumptech.glide.e.q(parcel, 3, this.f2257v, i);
        com.bumptech.glide.e.r(parcel, 4, this.f2258w);
        Integer num = this.f2259x;
        if (num != null) {
            com.bumptech.glide.e.w(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        com.bumptech.glide.e.z(parcel, x9);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
