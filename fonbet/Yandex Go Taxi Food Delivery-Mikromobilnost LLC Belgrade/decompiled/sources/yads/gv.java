package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gv implements Parcelable {
    public static final fv CREATOR = new fv();
    public final int b;
    public final String c;

    public gv(Parcel parcel) {
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        this.b = readInt;
        this.c = readString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return this.b == gvVar.b && jl40.l(this.c, gvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return oyr.l(this.b, "ClientSideReward(rewardAmount=", ", rewardType=", this.c, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public gv(int i, String str) {
        this.b = i;
        this.c = str;
    }
}
