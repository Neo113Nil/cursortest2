package a0;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends V.b {
    public static final Parcelable.Creator<e> CREATOR = new g(5);

    /* renamed from: v, reason: collision with root package name */
    public int f4287v;

    /* renamed from: w, reason: collision with root package name */
    public int f4288w;

    /* renamed from: x, reason: collision with root package name */
    public int f4289x;

    /* renamed from: y, reason: collision with root package name */
    public int f4290y;

    /* renamed from: z, reason: collision with root package name */
    public int f4291z;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4287v = 0;
        this.f4287v = parcel.readInt();
        this.f4288w = parcel.readInt();
        this.f4289x = parcel.readInt();
        this.f4290y = parcel.readInt();
        this.f4291z = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4287v);
        parcel.writeInt(this.f4288w);
        parcel.writeInt(this.f4289x);
        parcel.writeInt(this.f4290y);
        parcel.writeInt(this.f4291z);
    }
}
