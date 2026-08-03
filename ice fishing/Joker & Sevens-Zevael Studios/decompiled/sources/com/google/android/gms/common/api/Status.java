package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e7.c;
import java.util.Arrays;
import m6.b;
import p6.u;
import q6.a;
import x4.f;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new c(11);

    /* renamed from: g, reason: collision with root package name */
    public final int f1421g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1422h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f1423i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1424j;

    public Status(int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f1421g = i10;
        this.f1422h = str;
        this.f1423i = pendingIntent;
        this.f1424j = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1421g == status.f1421g && u.j(this.f1422h, status.f1422h) && u.j(this.f1423i, status.f1423i) && u.j(this.f1424j, status.f1424j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1421g), this.f1422h, this.f1423i, this.f1424j});
    }

    public final String toString() {
        s sVar = new s(this);
        String str = this.f1422h;
        if (str == null) {
            str = i7.b.y(this.f1421g);
        }
        sVar.b(str, "statusCode");
        sVar.b(this.f1423i, "resolution");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = f.g0(parcel, 20293);
        f.i0(parcel, 1, 4);
        parcel.writeInt(this.f1421g);
        f.c0(parcel, 2, this.f1422h);
        f.b0(parcel, 3, this.f1423i, i10);
        f.b0(parcel, 4, this.f1424j, i10);
        f.h0(parcel, g02);
    }
}
