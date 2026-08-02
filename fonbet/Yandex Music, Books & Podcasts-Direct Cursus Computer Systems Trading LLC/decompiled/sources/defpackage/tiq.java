package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tiq implements fnb {

    @NotNull
    public static final Parcelable.Creator<tiq> CREATOR = new bwp(13);
    public final String a;

    public tiq(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.fnb
    public final String G() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
