package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.e4x;
import defpackage.k2x;
import defpackage.l9;
import defpackage.o8g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends l9 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new k2x(17);
    public int a;
    public int b;
    public long c;
    public int d;
    public e4x[] e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    public final String toString() {
        boolean z = this.d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        int i2 = this.a;
        o8g.q0(1, 4, parcel);
        parcel.writeInt(i2);
        int i3 = this.b;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(i3);
        long j = this.c;
        o8g.q0(3, 8, parcel);
        parcel.writeLong(j);
        int i4 = this.d;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i4);
        o8g.m0(parcel, 5, this.e, i);
        o8g.p0(parcel, o0);
    }
}
