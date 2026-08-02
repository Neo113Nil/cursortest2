package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b3x extends l9 {
    public static final Parcelable.Creator<b3x> CREATOR = new vzw(1);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.j0(parcel, 7, this.f);
        o8g.j0(parcel, 8, this.g);
        o8g.j0(parcel, 9, this.h);
        o8g.j0(parcel, 10, this.i);
        boolean z = this.j;
        o8g.q0(11, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.j0(parcel, 12, this.k);
        o8g.p0(parcel, o0);
    }
}
