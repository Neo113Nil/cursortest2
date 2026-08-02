package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j5x extends l9 {
    public static final Parcelable.Creator<j5x> CREATOR = new k5x(9);
    public final String a;
    public final int b;

    public j5x(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.p0(parcel, o0);
    }
}
