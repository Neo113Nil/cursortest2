package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tfk extends l9 {
    public static final Parcelable.Creator<tfk> CREATOR = new vzw(6);
    public int a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        int i2 = this.a;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(i2);
        o8g.b0(parcel, 3, this.b);
        o8g.p0(parcel, o0);
    }
}
