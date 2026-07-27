package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new A.l(2);

    /* renamed from: a, reason: collision with root package name */
    public int f492a;

    /* renamed from: b, reason: collision with root package name */
    public int f493b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f494c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f495d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f492a + ", mGapDir=" + this.f493b + ", mHasUnwantedGapAfter=" + this.f495d + ", mGapPerSpan=" + Arrays.toString(this.f494c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f492a);
        parcel.writeInt(this.f493b);
        parcel.writeInt(this.f495d ? 1 : 0);
        int[] iArr = this.f494c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f494c);
        }
    }
}
