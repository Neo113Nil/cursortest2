package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sye extends l9 {
    public static final Parcelable.Creator<sye> CREATOR = new oex(15);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.f0(parcel, 2, this.a);
        o8g.j0(parcel, 4, this.b);
        o8g.j0(parcel, 5, this.c);
        o8g.f0(parcel, 6, this.d);
        boolean z = this.e;
        o8g.q0(7, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.j0(parcel, 8, this.f);
        o8g.p0(parcel, o0);
    }
}
