package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class nxs implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<nxs> CREATOR = new b3s(10);
    public final float a;
    public final float b;

    public nxs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxs)) {
            return false;
        }
        nxs nxsVar = (nxs) obj;
        return Float.compare(this.a, nxsVar.a) == 0 && Float.compare(this.b, nxsVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TrackLoudness(integratedLoudnessDb=" + this.a + ", truePeakDb=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }
}
