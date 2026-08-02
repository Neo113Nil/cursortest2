package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xzg extends l9 {
    public static final Parcelable.Creator<xzg> CREATOR = new k5x(24);
    public String a;
    public yzg b;
    public khs c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.i0(parcel, 3, this.b, i);
        o8g.i0(parcel, 5, this.c, i);
        o8g.p0(parcel, o0);
    }
}
