package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v7s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<v7s> CREATOR = new b3s(2);
    public final String a;
    public final lik b;
    public final String c;

    public v7s(String str, lik likVar, String str2) {
        likVar.getClass();
        this.a = str;
        this.b = likVar;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
