package t0;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V implements Parcelable {
    public static final Parcelable.Creator<V> CREATOR = new C4614c(8);

    /* renamed from: n, reason: collision with root package name */
    public int f40672n;

    /* renamed from: u, reason: collision with root package name */
    public int f40673u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f40674v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40675w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f40672n + ", mGapDir=" + this.f40673u + ", mHasUnwantedGapAfter=" + this.f40675w + ", mGapPerSpan=" + Arrays.toString(this.f40674v) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40672n);
        parcel.writeInt(this.f40673u);
        parcel.writeInt(this.f40675w ? 1 : 0);
        int[] iArr = this.f40674v;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f40674v);
        }
    }
}
