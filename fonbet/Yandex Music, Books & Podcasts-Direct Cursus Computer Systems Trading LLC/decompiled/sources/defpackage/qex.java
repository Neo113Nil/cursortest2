package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qex extends l9 {
    public static final Parcelable.Creator<qex> CREATOR = new oex(5);
    public final boolean a;

    public qex(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
