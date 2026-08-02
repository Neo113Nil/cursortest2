package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public final class p8s extends l9 {

    @NonNull
    public static final Parcelable.Creator<p8s> CREATOR = new onv(4);
    public final int a;
    public List b;

    public p8s(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.n0(parcel, 2, this.b);
        o8g.p0(parcel, o0);
    }
}
