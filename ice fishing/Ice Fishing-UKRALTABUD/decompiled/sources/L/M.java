package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new A.l(2);

    /* renamed from: a, reason: collision with root package name */
    public int f570a;

    /* renamed from: b, reason: collision with root package name */
    public int f571b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f572c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f573d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f570a + ", mGapDir=" + this.f571b + ", mHasUnwantedGapAfter=" + this.f573d + ", mGapPerSpan=" + Arrays.toString(this.f572c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f570a);
        parcel.writeInt(this.f571b);
        parcel.writeInt(this.f573d ? 1 : 0);
        int[] iArr = this.f572c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f572c);
        }
    }
}
