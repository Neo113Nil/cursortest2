package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v9x extends l9 {
    public static final Parcelable.Creator<v9x> CREATOR = new k5x(21);
    public final boolean a;
    public final boolean b;
    public final int c;

    public v9x(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
