package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cfx extends l9 {
    public static final Parcelable.Creator<cfx> CREATOR = new oex(14);
    public byte[] a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.c0(parcel, 1, this.a);
        o8g.p0(parcel, o0);
    }
}
