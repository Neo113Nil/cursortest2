package L;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: L.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p implements Parcelable {
    public static final Parcelable.Creator<C0040p> CREATOR = new A.l(1);

    /* renamed from: a, reason: collision with root package name */
    public int f589a;

    /* renamed from: b, reason: collision with root package name */
    public int f590b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f591c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f589a);
        parcel.writeInt(this.f590b);
        parcel.writeInt(this.f591c ? 1 : 0);
    }
}
