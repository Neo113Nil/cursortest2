package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class zej extends l9 {

    @NonNull
    public static final Parcelable.Creator<zej> CREATOR = new oex(26);
    public final String a;
    public final int b;
    public final String c;

    public zej(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.p0(parcel, o0);
    }
}
