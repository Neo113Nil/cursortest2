package com.google.android.gms.common.api;

import B8.d;
import M2.b;
import P2.w;
import Q2.a;
import S0.f;
import S0.s;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new d(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f23615n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23616u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f23617v;

    /* renamed from: w, reason: collision with root package name */
    public final b f23618w;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f23615n = i;
        this.f23616u = str;
        this.f23617v = pendingIntent;
        this.f23618w = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f23615n == status.f23615n && w.l(this.f23616u, status.f23616u) && w.l(this.f23617v, status.f23617v) && w.l(this.f23618w, status.f23618w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23615n), this.f23616u, this.f23617v, this.f23618w});
    }

    public final String toString() {
        s sVar = new s(this);
        String str = this.f23616u;
        if (str == null) {
            str = f.l(this.f23615n);
        }
        sVar.f(str, "statusCode");
        sVar.f(this.f23617v, "resolution");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f23615n);
        A8.b.z(parcel, 2, this.f23616u);
        A8.b.y(parcel, 3, this.f23617v, i);
        A8.b.y(parcel, 4, this.f23618w, i);
        A8.b.I(parcel, G7);
    }
}
