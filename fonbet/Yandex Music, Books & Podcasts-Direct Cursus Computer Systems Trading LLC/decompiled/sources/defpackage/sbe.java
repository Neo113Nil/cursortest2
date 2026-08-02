package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class sbe extends l9 {

    @NonNull
    public static final Parcelable.Creator<sbe> CREATOR = new k5x(25);
    public final int a;
    public final int b;
    public final int c;

    public sbe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
