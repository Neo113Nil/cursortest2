package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class gz6 extends hz6 {

    @NotNull
    public static final Parcelable.Creator<gz6> CREATOR = new kg4(24);
    public final ffk a;

    public gz6(ffk ffkVar) {
        ffkVar.getClass();
        this.a = ffkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
