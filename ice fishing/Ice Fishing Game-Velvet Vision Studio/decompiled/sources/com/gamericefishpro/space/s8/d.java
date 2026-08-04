package com.gamericefishpro.space.s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<d> CREATOR = new com.gamericefishpro.space.h.a(23);
    public final String d;
    public final int e;
    public final long i;
    public final boolean v;

    public d(String str, int i, long j, boolean z) {
        this.d = str;
        this.e = i;
        this.i = j;
        this.v = z;
    }

    public final long b() {
        long j = this.i;
        return j == -1 ? this.e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (c0.j(this.d, dVar.d) && b() == dVar.b() && this.v == dVar.v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Long.valueOf(b()), Boolean.valueOf(this.v)});
    }

    public final String toString() {
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(this);
        sVar.c(this.d, "name");
        sVar.c(Long.valueOf(b()), "version");
        sVar.c(Boolean.valueOf(this.v), "is_fully_rolled_out");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.Q(parcel, 1, this.d);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e);
        long jB = b();
        y3.U(parcel, 3, 8);
        parcel.writeLong(jB);
        y3.U(parcel, 4, 4);
        parcel.writeInt(this.v ? 1 : 0);
        y3.W(parcel, iV);
    }
}
