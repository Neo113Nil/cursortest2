package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes.dex */
public final class kek extends l9 {
    public static final Parcelable.Creator<kek> CREATOR = new oex(28);
    public String a;
    public iw3 b;
    public UserAddress c;
    public sfk d;
    public String e;
    public Bundle f;
    public String g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.i0(parcel, 2, this.b, i);
        o8g.i0(parcel, 3, this.c, i);
        o8g.i0(parcel, 4, this.d, i);
        o8g.j0(parcel, 5, this.e);
        o8g.b0(parcel, 6, this.f);
        o8g.j0(parcel, 7, this.g);
        o8g.p0(parcel, o0);
    }
}
