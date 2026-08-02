package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.x4e;
import defpackage.z2a1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class cc1 implements Parcelable {
    public static final bc1 CREATOR = new bc1();
    public final String b;
    public final String c;
    public final boolean d;

    public cc1(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z = parcel.readByte() != 0;
        this.b = readString;
        this.c = readString2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return false;
        }
        cc1 cc1Var = (cc1) obj;
        return jl40.l(this.b, cc1Var.b) && jl40.l(this.c, cc1Var.c) && this.d == cc1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + z2a1.a(this.b.hashCode() * 31, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        return x4e.i(b64.v("JavaScriptResource(apiFramework=", str, ", url=", str2, ", browserOptional="), this.d, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public cc1(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
