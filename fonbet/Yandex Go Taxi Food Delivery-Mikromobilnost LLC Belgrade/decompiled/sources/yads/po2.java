package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class po2 implements Parcelable {
    public static final no2 CREATOR = new no2();
    public final boolean b;
    public final gv c;
    public final hw2 d;

    public po2(Parcel parcel) {
        boolean z = parcel.readByte() != 0;
        gv gvVar = (gv) parcel.readParcelable(gv.class.getClassLoader());
        hw2 hw2Var = (hw2) parcel.readParcelable(hw2.class.getClassLoader());
        this.b = z;
        this.c = gvVar;
        this.d = hw2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po2)) {
            return false;
        }
        po2 po2Var = (po2) obj;
        return this.b == po2Var.b && jl40.l(this.c, po2Var.c) && jl40.l(this.d, po2Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        gv gvVar = this.c;
        int hashCode2 = (hashCode + (gvVar == null ? 0 : gvVar.hashCode())) * 31;
        hw2 hw2Var = this.d;
        return hashCode2 + (hw2Var != null ? hw2Var.b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.b + ", clientSideReward=" + this.c + ", serverSideReward=" + this.d + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public po2(boolean z, gv gvVar, hw2 hw2Var) {
        this.b = z;
        this.c = gvVar;
        this.d = hw2Var;
    }
}
