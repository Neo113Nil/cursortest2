package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X0 extends S2.a {
    public static final Parcelable.Creator<X0> CREATOR = new C4936i0(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f40383n;

    public X0(String str) {
        this.f40383n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 15, this.f40383n);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
