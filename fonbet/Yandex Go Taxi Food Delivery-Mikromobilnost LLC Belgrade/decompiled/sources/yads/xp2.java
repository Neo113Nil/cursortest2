package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class xp2 implements Parcelable {
    public static final wp2 CREATOR = new wp2();
    public final mp1 b;
    public final vp2 c;

    public xp2(Parcel parcel) {
        mp1 valueOf = mp1.valueOf(parcel.readString());
        vp2 vp2Var = (vp2) parcel.readParcelable(vp2.class.getClassLoader());
        this.b = valueOf;
        this.c = vp2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return this.b == xp2Var.b && jl40.l(this.c, xp2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RewardedMediationParameters(bridgeAdType=" + this.b + ", configuration=" + this.c + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
    }

    public xp2(mp1 mp1Var, vp2 vp2Var) {
        this.b = mp1Var;
        this.c = vp2Var;
    }
}
