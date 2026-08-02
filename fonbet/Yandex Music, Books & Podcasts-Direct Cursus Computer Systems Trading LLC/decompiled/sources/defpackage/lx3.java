package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lx3 extends l9 {
    public static final Parcelable.Creator<lx3> CREATOR = new k5x(14);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.f0(parcel, 1, this.a);
        boolean z = this.b;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        o8g.q0(3, 4, parcel);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.d;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        o8g.p0(parcel, o0);
    }
}
