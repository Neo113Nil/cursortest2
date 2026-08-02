package p2;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4830a extends S2.a {
    public static final Parcelable.Creator<C4830a> CREATOR = new C4614c(4);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39800n;

    public C4830a(boolean z6) {
        this.f39800n = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f39800n ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
