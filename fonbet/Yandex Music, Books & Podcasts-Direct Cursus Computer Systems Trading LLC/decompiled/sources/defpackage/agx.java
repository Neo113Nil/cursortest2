package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class agx extends l9 {
    public static final Parcelable.Creator<agx> CREATOR = new oex(11);
    public final int a;

    public agx(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a);
        o8g.p0(parcel, o0);
    }
}
