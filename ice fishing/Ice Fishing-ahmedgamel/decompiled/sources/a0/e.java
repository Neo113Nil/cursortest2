package a0;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends V.b {
    public static final Parcelable.Creator<e> CREATOR = new g(5);

    /* renamed from: v, reason: collision with root package name */
    public int f4238v;

    /* renamed from: w, reason: collision with root package name */
    public int f4239w;

    /* renamed from: x, reason: collision with root package name */
    public int f4240x;

    /* renamed from: y, reason: collision with root package name */
    public int f4241y;

    /* renamed from: z, reason: collision with root package name */
    public int f4242z;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4238v = 0;
        this.f4238v = parcel.readInt();
        this.f4239w = parcel.readInt();
        this.f4240x = parcel.readInt();
        this.f4241y = parcel.readInt();
        this.f4242z = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4238v);
        parcel.writeInt(this.f4239w);
        parcel.writeInt(this.f4240x);
        parcel.writeInt(this.f4241y);
        parcel.writeInt(this.f4242z);
    }
}
