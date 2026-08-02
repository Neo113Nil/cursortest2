package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<mem> CREATOR = new s2m(1);
    public final lem a;
    public final kem b;
    public final String c;

    public mem(lem lemVar, kem kemVar, String str) {
        lemVar.getClass();
        kemVar.getClass();
        str.getClass();
        this.a = lemVar;
        this.b = kemVar;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }
}
