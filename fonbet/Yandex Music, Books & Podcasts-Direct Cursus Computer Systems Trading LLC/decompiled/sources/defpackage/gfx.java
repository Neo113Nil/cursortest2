package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gfx extends l9 {
    public static final Parcelable.Creator<gfx> CREATOR = new oex(9);
    public Bundle a;
    public i6c[] b;
    public int c;
    public q66 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.b0(parcel, 1, this.a);
        o8g.m0(parcel, 2, this.b, i);
        int i2 = this.c;
        o8g.q0(3, 4, parcel);
        parcel.writeInt(i2);
        o8g.i0(parcel, 4, this.d, i);
        o8g.p0(parcel, o0);
    }
}
