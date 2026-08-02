package com.google.android.gms.common.api;

import B8.d;
import O2.b;
import R2.w;
import S2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;
import com.bumptech.glide.h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new d(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f24395n;

    /* renamed from: u, reason: collision with root package name */
    public final String f24396u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f24397v;

    /* renamed from: w, reason: collision with root package name */
    public final b f24398w;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f24395n = i;
        this.f24396u = str;
        this.f24397v = pendingIntent;
        this.f24398w = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f24395n == status.f24395n && w.l(this.f24396u, status.f24396u) && w.l(this.f24397v, status.f24397v) && w.l(this.f24398w, status.f24398w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24395n), this.f24396u, this.f24397v, this.f24398w});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        String str = this.f24396u;
        if (str == null) {
            str = h.h(this.f24395n);
        }
        c3067cm.B(str, "statusCode");
        c3067cm.B(this.f24397v, "resolution");
        return c3067cm.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.w(parcel, 1, 4);
        parcel.writeInt(this.f24395n);
        e.r(parcel, 2, this.f24396u);
        e.q(parcel, 3, this.f24397v, i);
        e.q(parcel, 4, this.f24398w, i);
        e.z(parcel, x9);
    }
}
