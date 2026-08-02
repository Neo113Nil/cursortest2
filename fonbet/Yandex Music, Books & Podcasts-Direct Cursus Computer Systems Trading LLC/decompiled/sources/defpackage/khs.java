package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class khs extends l9 {
    public static final Parcelable.Creator<khs> CREATOR = new oex(3);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        long j = this.a;
        o8g.q0(2, 8, parcel);
        parcel.writeLong(j);
        long j2 = this.b;
        o8g.q0(3, 8, parcel);
        parcel.writeLong(j2);
        o8g.p0(parcel, o0);
    }
}
