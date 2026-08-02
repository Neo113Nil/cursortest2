package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class t2 implements Parcelable {
    public static final s2 CREATOR = new s2();
    public final String b;
    public final String c;
    public final String d;

    public t2(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        this.b = readString;
        this.c = readString2;
        this.d = readString3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public t2(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
