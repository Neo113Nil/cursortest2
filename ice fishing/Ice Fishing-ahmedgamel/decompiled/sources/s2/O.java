package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O extends S2.a {
    public static final Parcelable.Creator<O> CREATOR = new C4936i0(0);

    /* renamed from: n, reason: collision with root package name */
    public final String f40369n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40370u;

    public O(String str, String str2) {
        this.f40369n = str;
        this.f40370u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f40369n);
        com.bumptech.glide.e.r(parcel, 2, this.f40370u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
