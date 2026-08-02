package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class nod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<nod> CREATOR = new a5c(17);
    public final String a;
    public final Parcelable b;

    public nod(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readParcelable(j3c.b().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public nod(Parcelable parcelable) {
        this.a = "image/png";
        this.b = parcelable;
    }
}
