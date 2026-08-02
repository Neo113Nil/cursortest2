package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.x4e;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class z9 implements Parcelable {
    public static final y9 CREATOR = new y9();
    public final String b;
    public final ArrayList c;
    public final String d;

    public z9(Parcel parcel) {
        String readString = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zp1.CREATOR);
        String readString2 = parcel.readString();
        this.b = readString;
        this.c = createTypedArrayList;
        this.d = readString2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return jl40.l(this.b, z9Var.b) && jl40.l(this.c, z9Var.c) && jl40.l(this.d, z9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ly3.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        String str = this.b;
        ArrayList arrayList = this.c;
        return oyr.t(x4e.m("AdUnitIdBiddingSettings(adUnitId=", str, ", mediationNetworks=", ", rawData=", arrayList), this.d, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeString(this.d);
    }

    public z9(String str, String str2, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
        this.d = str2;
    }
}
