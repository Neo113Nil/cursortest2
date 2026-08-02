package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g9x extends l9 {
    public static final Parcelable.Creator<g9x> CREATOR = new k5x(20);
    public final boolean a;
    public final int b;

    public g9x(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b);
        o8g.p0(parcel, o0);
    }
}
