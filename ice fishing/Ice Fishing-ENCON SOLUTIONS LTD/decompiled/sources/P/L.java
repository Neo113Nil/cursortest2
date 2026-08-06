package P;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new C.l(5);

    /* renamed from: a, reason: collision with root package name */
    public int f1274a;

    /* renamed from: b, reason: collision with root package name */
    public int f1275b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1276c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1277d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1274a + ", mGapDir=" + this.f1275b + ", mHasUnwantedGapAfter=" + this.f1277d + ", mGapPerSpan=" + Arrays.toString(this.f1276c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1274a);
        parcel.writeInt(this.f1275b);
        parcel.writeInt(this.f1277d ? 1 : 0);
        int[] iArr = this.f1276c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1276c);
        }
    }
}
