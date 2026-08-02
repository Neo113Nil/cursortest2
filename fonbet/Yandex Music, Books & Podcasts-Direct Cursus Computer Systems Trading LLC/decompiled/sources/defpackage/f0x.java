package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0x extends l9 {
    public static final Parcelable.Creator<f0x> CREATOR = new vzw(8);
    public final long a;

    public f0x(long j) {
        this.a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f0x) && this.a == ((f0x) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 8, parcel);
        parcel.writeLong(this.a);
        o8g.p0(parcel, o0);
    }
}
