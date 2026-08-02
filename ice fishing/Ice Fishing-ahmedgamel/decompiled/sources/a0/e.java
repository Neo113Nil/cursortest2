package a0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends V.b {
    public static final Parcelable.Creator<e> CREATOR = new A3.b(6);

    /* renamed from: v, reason: collision with root package name */
    public int f4215v;

    /* renamed from: w, reason: collision with root package name */
    public int f4216w;

    /* renamed from: x, reason: collision with root package name */
    public int f4217x;

    /* renamed from: y, reason: collision with root package name */
    public int f4218y;

    /* renamed from: z, reason: collision with root package name */
    public int f4219z;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4215v = 0;
        this.f4215v = parcel.readInt();
        this.f4216w = parcel.readInt();
        this.f4217x = parcel.readInt();
        this.f4218y = parcel.readInt();
        this.f4219z = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4215v);
        parcel.writeInt(this.f4216w);
        parcel.writeInt(this.f4217x);
        parcel.writeInt(this.f4218y);
        parcel.writeInt(this.f4219z);
    }
}
