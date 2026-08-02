package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class o3i extends l9 {

    @NonNull
    public static final Parcelable.Creator<o3i> CREATOR = new onv(11);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public o3i(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c);
        o8g.q0(4, 8, parcel);
        parcel.writeLong(this.d);
        o8g.q0(5, 8, parcel);
        parcel.writeLong(this.e);
        o8g.j0(parcel, 6, this.f);
        o8g.j0(parcel, 7, this.g);
        o8g.q0(8, 4, parcel);
        parcel.writeInt(this.h);
        o8g.q0(9, 4, parcel);
        parcel.writeInt(this.i);
        o8g.p0(parcel, o0);
    }
}
