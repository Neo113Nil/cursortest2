package k0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new F0.b(15);

    /* renamed from: a, reason: collision with root package name */
    public int f3498a;

    /* renamed from: b, reason: collision with root package name */
    public int f3499b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3500c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3501d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3498a + ", mGapDir=" + this.f3499b + ", mHasUnwantedGapAfter=" + this.f3501d + ", mGapPerSpan=" + Arrays.toString(this.f3500c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3498a);
        parcel.writeInt(this.f3499b);
        parcel.writeInt(this.f3501d ? 1 : 0);
        int[] iArr = this.f3500c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3500c);
        }
    }
}
