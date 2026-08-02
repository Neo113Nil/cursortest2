package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.mh81;
import defpackage.oyr;
import defpackage.qje;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class w4 implements Parcelable {
    public static final v4 CREATOR = new v4();
    public final String b;

    public w4(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            qje.Z(i, 1, mh81.b);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4) && jl40.l(this.b, ((w4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("AdImpressionData(rawData=", this.b, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public w4(String str) {
        this.b = str;
    }

    public w4(Parcel parcel) {
        this.b = parcel.readString();
    }
}
