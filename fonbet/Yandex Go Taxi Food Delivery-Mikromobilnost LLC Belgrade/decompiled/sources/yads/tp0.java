package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class tp0 implements Parcelable {
    public static final sp0 CREATOR = new sp0();
    public final String b;
    public final long c;

    public tp0(Parcel parcel) {
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        this.b = readString;
        this.c = readLong;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0)) {
            return false;
        }
        tp0 tp0Var = (tp0) obj;
        return jl40.l(this.b, tp0Var.b) && this.c == tp0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("FalseClick(url=", this.b, ", interval=", this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    public tp0(String str, long j) {
        this.b = str;
        this.c = j;
    }
}
