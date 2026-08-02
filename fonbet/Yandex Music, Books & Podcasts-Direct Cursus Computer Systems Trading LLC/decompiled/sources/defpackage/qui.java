package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class qui implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qui> CREATOR = new mmh(19);
    public final String a;
    public final kvi b;

    public qui(String str, kvi kviVar) {
        str.getClass();
        kviVar.getClass();
        this.a = str;
        this.b = kviVar;
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
