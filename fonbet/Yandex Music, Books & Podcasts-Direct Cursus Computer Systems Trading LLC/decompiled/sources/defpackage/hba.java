package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hba implements Parcelable {
    public static final Parcelable.Creator<hba> CREATOR = new vn7(13);
    public final long a;
    public final long b;

    public hba(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        vq1.v(readLong >= 0);
        vq1.v(readLong2 >= 0 || readLong2 == -1);
        this.a = readLong;
        this.b = readLong2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hba)) {
            return false;
        }
        hba hbaVar = (hba) obj;
        return this.a == hbaVar.a && this.b == hbaVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
