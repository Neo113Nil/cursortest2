package t0;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new C4566c(10);

    /* renamed from: n, reason: collision with root package name */
    public int f40619n;

    /* renamed from: u, reason: collision with root package name */
    public int f40620u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f40621v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40622w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f40619n + ", mGapDir=" + this.f40620u + ", mHasUnwantedGapAfter=" + this.f40622w + ", mGapPerSpan=" + Arrays.toString(this.f40621v) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40619n);
        parcel.writeInt(this.f40620u);
        parcel.writeInt(this.f40622w ? 1 : 0);
        int[] iArr = this.f40621v;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f40621v);
        }
    }
}
