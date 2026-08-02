package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class yo implements Parcelable {
    public static final xo CREATOR = new xo();
    public final ArrayList b;
    public final qr1 c;

    public yo(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(z9.CREATOR);
        qr1 qr1Var = (qr1) parcel.readParcelable(qr1.class.getClassLoader());
        this.b = createTypedArrayList;
        this.c = qr1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo)) {
            return false;
        }
        yo yoVar = (yo) obj;
        return jl40.l(this.b, yoVar.b) && jl40.l(this.c, yoVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        qr1 qr1Var = this.c;
        return hashCode + (qr1Var == null ? 0 : qr1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.b + ", mediationPrefetchSettings=" + this.c + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public yo(ArrayList arrayList, qr1 qr1Var) {
        this.b = arrayList;
        this.c = qr1Var;
    }
}
