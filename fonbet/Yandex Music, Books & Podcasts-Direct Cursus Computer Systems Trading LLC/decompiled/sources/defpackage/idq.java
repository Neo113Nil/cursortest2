package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class idq extends l9 {
    public static final Parcelable.Creator<idq> CREATOR = new vzw(13);
    public ArrayList a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.l0(parcel, 1, this.a);
        o8g.p0(parcel, o0);
    }
}
