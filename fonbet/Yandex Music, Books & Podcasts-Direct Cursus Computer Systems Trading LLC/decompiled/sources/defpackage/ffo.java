package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class ffo extends l9 {

    @NonNull
    public static final Parcelable.Creator<ffo> CREATOR = new vzw(16);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public ffo(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.e);
        o8g.p0(parcel, o0);
    }
}
