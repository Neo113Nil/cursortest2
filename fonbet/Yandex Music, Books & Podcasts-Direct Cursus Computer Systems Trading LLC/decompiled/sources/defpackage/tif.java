package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tif extends l9 {
    public static final Parcelable.Creator<tif> CREATOR = new k5x(15);
    public String a;
    public String b;
    public ArrayList c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.n0(parcel, 4, this.c);
        o8g.p0(parcel, o0);
    }
}
