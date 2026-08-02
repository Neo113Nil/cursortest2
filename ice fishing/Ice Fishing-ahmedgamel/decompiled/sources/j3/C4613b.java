package j3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4613b extends S2.a {
    public static final Parcelable.Creator<C4613b> CREATOR = new C4614c(0);

    /* renamed from: n, reason: collision with root package name */
    public final int f38478n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38479u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f38480v;

    public C4613b(int i, int i4, Intent intent) {
        this.f38478n = i;
        this.f38479u = i4;
        this.f38480v = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f38478n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f38479u);
        com.bumptech.glide.e.q(parcel, 3, this.f38480v, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
