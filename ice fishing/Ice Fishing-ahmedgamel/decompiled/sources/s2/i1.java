package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i1 extends S2.a {
    public static final Parcelable.Creator<i1> CREATOR = new C4936i0(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f40476n;

    public i1(int i) {
        this.f40476n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40476n);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
