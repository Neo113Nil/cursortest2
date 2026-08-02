package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bax extends l9 {
    public static final Parcelable.Creator<bax> CREATOR = new k5x(22);
    public final int a;
    public final boolean b;
    public final ArrayList c;
    public final int d;
    public final String e;
    public final boolean f;

    public bax(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.a = i;
        this.b = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.l0(parcel, 4, this.c);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
