package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: g, reason: collision with root package name */
    public final int f818g;

    public f(int i10) {
        this.f818g = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f818g == ((f) obj).f818g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f818g);
    }

    public final String toString() {
        return a4.d.l(new StringBuilder("DefaultLazyKey(index="), this.f818g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f818g);
    }
}
