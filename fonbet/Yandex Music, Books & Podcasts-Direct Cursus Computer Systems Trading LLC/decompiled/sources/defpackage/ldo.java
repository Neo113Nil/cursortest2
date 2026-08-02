package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class ldo implements Parcelable {
    public static final Parcelable.Creator<ldo> CREATOR = new k2x(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yzw yzwVar = (yzw) this;
        parcel.writeParcelable(yzwVar.a, 0);
        parcel.writeInt(yzwVar.b ? 1 : 0);
    }
}
