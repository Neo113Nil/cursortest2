package t0;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new C4566c(10);

    /* renamed from: n, reason: collision with root package name */
    public int f40622n;

    /* renamed from: u, reason: collision with root package name */
    public int f40623u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f40624v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40625w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f40622n + ", mGapDir=" + this.f40623u + ", mHasUnwantedGapAfter=" + this.f40625w + ", mGapPerSpan=" + Arrays.toString(this.f40624v) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40622n);
        parcel.writeInt(this.f40623u);
        parcel.writeInt(this.f40625w ? 1 : 0);
        int[] iArr = this.f40624v;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f40624v);
        }
    }
}
