package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l0x extends l9 {
    public static final Parcelable.Creator<l0x> CREATOR = new vzw(11);
    public String a;
    public String b;
    public int c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        int i2 = this.c;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        int i3 = this.d;
        o8g.q0(5, 4, parcel);
        parcel.writeInt(i3);
        o8g.p0(parcel, o0);
    }
}
