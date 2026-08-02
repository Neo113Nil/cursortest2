package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W0 extends V.b {
    public static final Parcelable.Creator<W0> CREATOR = new A3.b(7);

    /* renamed from: v, reason: collision with root package name */
    public int f39145v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39146w;

    public W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f39145v = parcel.readInt();
        this.f39146w = parcel.readInt() != 0;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f39145v);
        parcel.writeInt(this.f39146w ? 1 : 0);
    }
}
