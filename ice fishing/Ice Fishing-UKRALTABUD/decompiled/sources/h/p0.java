package h;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 extends C.c {
    public static final Parcelable.Creator<p0> CREATOR = new C.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f2240c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2241d;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2240c = parcel.readInt();
        this.f2241d = parcel.readInt() != 0;
    }

    @Override // C.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2240c);
        parcel.writeInt(this.f2241d ? 1 : 0);
    }
}
