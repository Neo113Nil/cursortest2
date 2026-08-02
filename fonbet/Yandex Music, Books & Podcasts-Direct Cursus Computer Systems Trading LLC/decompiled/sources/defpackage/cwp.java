package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cwp implements Parcelable {
    public static final Parcelable.Creator<cwp> CREATOR = new bwp(0);
    public final String a;

    public cwp(Parcel parcel) {
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public cwp(jya jyaVar) {
        this.a = jyaVar.b;
    }
}
