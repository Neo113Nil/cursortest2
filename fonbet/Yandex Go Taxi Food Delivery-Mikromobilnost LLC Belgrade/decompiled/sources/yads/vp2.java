package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vp2 implements Parcelable {
    public static final up2 CREATOR = new up2();
    public final Long b;

    public vp2(Parcel parcel) {
        this.b = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp2) && jl40.l(this.b, ((vp2) obj).b);
    }

    public final int hashCode() {
        Long l = this.b;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "RewardedMediationConfiguration(rewardedDelay=" + this.b + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.b.longValue());
        }
    }

    public vp2(Long l) {
        this.b = l;
    }
}
