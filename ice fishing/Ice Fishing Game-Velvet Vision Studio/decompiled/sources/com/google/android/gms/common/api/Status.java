package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.s8.b;
import com.gamericefishpro.space.u6.f;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.w8.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new com.gamericefishpro.space.h.a(26);
    public final int d;
    public final String e;
    public final PendingIntent i;
    public final b v;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.d = i;
        this.e = str;
        this.i = pendingIntent;
        this.v = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.d == status.d && c0.j(this.e, status.e) && c0.j(this.i, status.i) && c0.j(this.v, status.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, this.i, this.v});
    }

    public final String toString() {
        s sVar = new s(this);
        String strD = this.e;
        if (strD == null) {
            strD = f.D(this.d);
        }
        sVar.c(strD, "statusCode");
        sVar.c(this.i, "resolution");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.Q(parcel, 2, this.e);
        y3.P(parcel, 3, this.i, i);
        y3.P(parcel, 4, this.v, i);
        y3.W(parcel, iV);
    }
}
