package com.google.android.gms.common.api;

import C.l;
import C1.a;
import a.AbstractC0083a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.appmetrica.analytics.impl.C0376e9;
import java.util.Arrays;
import m0.b;
import p0.AbstractC1021r;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class Status extends AbstractC1035a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new l(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2681b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f2682c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2683d;

    public Status(int i2, String str, PendingIntent pendingIntent, b bVar) {
        this.f2680a = i2;
        this.f2681b = str;
        this.f2682c = pendingIntent;
        this.f2683d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2680a == status.f2680a && AbstractC1021r.e(this.f2681b, status.f2681b) && AbstractC1021r.e(this.f2682c, status.f2682c) && AbstractC1021r.e(this.f2683d, status.f2683d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2680a), this.f2681b, this.f2682c, this.f2683d});
    }

    public final String toString() {
        o.b bVar = new o.b(this);
        String str = this.f2681b;
        if (str == null) {
            int i2 = this.f2680a;
            switch (i2) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = a.f(i2, "unknown status code: ");
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
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
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
                case C0376e9.f5882C /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case C0376e9.f5883D /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case C0376e9.f5884E /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        bVar.a(str, "statusCode");
        bVar.a(this.f2682c, "resolution");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f2680a);
        AbstractC0083a.v(parcel, 2, this.f2681b);
        AbstractC0083a.u(parcel, 3, this.f2682c, i2);
        AbstractC0083a.u(parcel, 4, this.f2683d, i2);
        AbstractC0083a.z(parcel, y2);
    }
}
