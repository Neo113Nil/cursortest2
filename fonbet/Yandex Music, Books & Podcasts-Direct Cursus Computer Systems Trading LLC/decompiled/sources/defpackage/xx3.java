package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class xx3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xx3> CREATOR = new i02(21);
    public static final xx3 c = new xx3(pv3.c, fw3.e);
    public final pv3 a;
    public final fw3 b;

    public xx3(pv3 pv3Var, fw3 fw3Var) {
        pv3Var.getClass();
        fw3Var.getClass();
        this.a = pv3Var;
        this.b = fw3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
