package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o1x extends l9 {
    public static final Parcelable.Creator<o1x> CREATOR = new vzw(19);
    public String a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.p0(parcel, o0);
    }
}
