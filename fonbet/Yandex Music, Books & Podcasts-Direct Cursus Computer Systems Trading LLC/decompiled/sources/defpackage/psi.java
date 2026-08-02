package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class psi implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<psi> CREATOR = new mmh(18);
    public final String a;
    public final ysi b;

    public psi(String str, ysi ysiVar) {
        str.getClass();
        ysiVar.getClass();
        this.a = str;
        this.b = ysiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
