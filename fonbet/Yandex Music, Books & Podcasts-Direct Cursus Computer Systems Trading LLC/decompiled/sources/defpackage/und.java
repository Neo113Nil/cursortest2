package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class und extends l9 {

    @NonNull
    public static final Parcelable.Creator<und> CREATOR = new onv(3);
    public final int a;
    public final int b;
    public final Bundle c;

    public und(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.b0(parcel, 3, this.c);
        o8g.p0(parcel, o0);
    }
}
