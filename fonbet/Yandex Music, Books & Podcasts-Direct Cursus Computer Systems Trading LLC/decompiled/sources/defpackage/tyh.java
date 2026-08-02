package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class tyh implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<tyh> CREATOR = new mmh(13);
    public final String a;
    public final String b;
    public final String c;
    public final ryh d;

    public tyh(String str, String str2, String str3, ryh ryhVar) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ryhVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        ryh ryhVar = this.d;
        if (ryhVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ryhVar.writeToParcel(parcel, i);
        }
    }
}
