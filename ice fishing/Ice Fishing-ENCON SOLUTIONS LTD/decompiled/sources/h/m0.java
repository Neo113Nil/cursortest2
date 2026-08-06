package h;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 extends E.c {
    public static final Parcelable.Creator<m0> CREATOR = new E.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f3289c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3290d;

    public m0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3289c = parcel.readInt();
        this.f3290d = parcel.readInt() != 0;
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3289c);
        parcel.writeInt(this.f3290d ? 1 : 0);
    }
}
