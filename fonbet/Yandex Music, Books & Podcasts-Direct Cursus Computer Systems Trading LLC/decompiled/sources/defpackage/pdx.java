package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pdx extends l9 {
    public static final Parcelable.Creator<pdx> CREATOR = new oex(6);
    public byte[] a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.c0(parcel, 2, this.a);
        o8g.p0(parcel, o0);
    }
}
