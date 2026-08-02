package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes.dex */
public final class iw3 extends l9 {
    public static final Parcelable.Creator<iw3> CREATOR = new k2x(26);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.j0(parcel, 3, this.c);
        int i2 = this.d;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        o8g.i0(parcel, 5, this.e, i);
        o8g.p0(parcel, o0);
    }
}
